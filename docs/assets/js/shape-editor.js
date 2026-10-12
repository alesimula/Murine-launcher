// Icon shape editor for /icon-shapes/. Plain JS, no build step; polygon-clipping.min.js (loaded first) merges shapes.
//
// An icon is a list of shapes that get merged into one outline. A shape is either
//   { pts: [{x, y, r, s}], mirror }      an editable polygon with rounded corners, or
//   { fixed: name, a, x, y, mirror }     a ready-made FIXED path, scaled by a and then moved by (x, y), or
//   { path: d, a, x, y, mirror }         the same for an outline imported from an SVG file.
// mirror adds copies flipped across the canvas centre lines: 'none', 'h' (left/right), 'v' (top/bottom), 'both'.
// Polygon points live in the launcher's 0..100 box:
//   r = corner size (how far the rounding reaches along both edges)
//   s = smoothing, 0 = straight cut, 0.5 = circular arc, 1 = squircle-like
// The output path is written for androidx graphics-shapes' SvgPathParser
// (ShapeDelegate.GenericPathShape), which is stricter than SVG: absolute M/L/C/Z only,
// numbers separated by single spaces, no exponents, one closed contour.
(() => {
  'use strict';
  const $ = (id) => document.getElementById(id);
  const NS = 'http://www.w3.org/2000/svg';
  // Points may sit outside the 0..100 box (rounding pulls the outline inward), so the canvas
  // shows a margin around it and grows when something reaches further out.
  const view = { lo: -20, hi: 120 };
  const clamp = (v, a, b) => Math.min(b, Math.max(a, v));
  // Paths are written to 2 decimals; measuring a pivot raises that for a moment (see pivot()).
  let digits = 2;
  const fmt = (n) => String(+n.toFixed(digits)); // +"…" drops trailing zeros and "-0"
  const r2 = (n) => +n.toFixed(2);
  const dist = (a, b) => Math.hypot(b.x - a.x, b.y - a.y);
  const lerp = (a, b, t) => ({ x: a.x + (b.x - a.x) * t, y: a.y + (b.y - a.y) * t });

  // ---------- geometry ----------

  // How far each corner's rounding actually reaches. Two corners sharing an edge split it in proportion
  // to their sizes, so they never overlap.
  function cornerSizes(pts) {
    const n = pts.length, cap = (p, q, len) => (p.r + q.r <= len ? p.r : (len * p.r) / (p.r + q.r));
    return pts.map((p, i) => {
      const a = pts[(i + n - 1) % n], b = pts[(i + 1) % n], la = dist(a, p), lb = dist(p, b);
      return la < 1e-6 || lb < 1e-6 ? 0 : Math.min(p.r, cap(p, a, la), cap(p, b, lb));
    });
  }

  function buildPath(pts) {
    const n = pts.length, out = [], sizes = cornerSizes(pts);
    let last = null;
    const xy = (p) => fmt(p.x) + ' ' + fmt(p.y);
    // Skip near-zero lines: they become degenerate cubics in the launcher's polygon.
    const line = (p) => { if (!last || dist(last, p) > 0.05) out.push('L ' + xy(p)); last = p; };

    pts.forEach((p, i) => {
      const a = pts[(i + n - 1) % n], b = pts[(i + 1) % n];
      const la = dist(a, p), lb = dist(p, b), d = sizes[i];
      if (d < 0.01) return line(p);

      const pin = lerp(p, a, d / la), pout = lerp(p, b, d / lb);
      const cos = ((a.x - p.x) * (b.x - p.x) + (a.y - p.y) * (b.y - p.y)) / (la * lb);
      const turn = Math.PI - Math.acos(clamp(cos, -1, 1));
      // Handle length (as a fraction of d) that makes the cubic a circular arc for this angle.
      const kc = turn < 1e-3 ? 2 / 3 : ((4 / 3) * Math.tan(turn / 4)) / Math.tan(turn / 2);
      const k = p.s < 0.5 ? 2 * p.s * kc : kc + (2 * p.s - 1) * (1 - kc);
      line(pin);
      if (k < 1e-3) return line(pout); // a straight cut: a flat cubic here confuses the launcher's polygon detection
      out.push('C ' + xy(lerp(pin, p, k)) + ' ' + xy(lerp(pout, p, k)) + ' ' + xy(pout));
      last = pout;
    });
    out[0] = 'M' + out[0].slice(1);
    return out.join(' ') + ' Z';
  }

  // checks the polygon, not the rounded outline; good enough to catch crossed edges
  function selfIntersects(pts) {
    const n = pts.length;
    const o = (a, b, c) => Math.sign((b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x));
    for (let i = 0; i < n; i++) {
      for (let j = i + 2; j < n; j++) {
        if (i === 0 && j === n - 1) continue; // adjacent through the closing edge
        const a = pts[i], b = pts[i + 1], c = pts[j], d = pts[(j + 1) % n];
        if (o(a, b, c) !== o(a, b, d) && o(c, d, a) !== o(c, d, b)) return true;
      }
    }
    return false;
  }

  const measure = (d) => { const m = $('se-measure-path'); m.setAttribute('d', d); return m.getBBox(); };

  // Scales and centres the *rendered* outline of a polygon so it fills the 0..100 box.
  function fit(pts) {
    const bb = measure(buildPath(pts)), k = 100 / Math.max(bb.width, bb.height);
    const ox = (100 - bb.width * k) / 2, oy = (100 - bb.height * k) / 2;
    return pts.map((p) => ({ x: r2((p.x - bb.x) * k + ox), y: r2((p.y - bb.y) * k + oy), r: r2(p.r * k), s: p.s }));
  }

  // Regular polygon (inner = 1) or star (inner < 1, alternating outer/inner points).
  function polygon(sides, inner, rotDeg, rOuter, rInner = rOuter, s = 0.5) {
    const m = inner < 1 ? sides * 2 : sides;
    return Array.from({ length: m }, (_, i) => {
      const t = ((rotDeg - 90) * Math.PI) / 180 + (i * 2 * Math.PI) / m;
      const isInner = inner < 1 && i % 2 === 1, rad = 50 * (isInner ? inner : 1);
      return { x: 50 + rad * Math.cos(t), y: 50 + rad * Math.sin(t), r: isInner ? rInner : rOuter, s };
    });
  }

  const box = (tl, tr, br, bl, s = 0.5) =>
    [[0, 0, tl], [100, 0, tr], [100, 100, br], [0, 100, bl]].map(([x, y, r]) => ({ x, y, r, s }));

  // Presets come from _data/icon_shapes.yml, which the page embeds as JSON (see the comments there): an entry is
  // one shape, or several under `shapes`. Kept as written and turned into shapes when used (see presetShapes);
  // a single fixed outline also goes into FIXED, which saved icons refer to by name. Broken entries are
  // dropped when the list is checked (see presetNames).
  const presetData = (() => { try { return JSON.parse($('se-presets-data').textContent); } catch (e) { return {}; } })();
  const PRESETS = {}, FIXED = {};
  for (const p of Array.isArray(presetData.shapes) ? presetData.shapes : []) {
    const name = typeof p?.name === 'string' ? p.name.trim() : '';
    if (!name || Object.hasOwn(PRESETS, name)) continue;
    if (!Array.isArray(p.shapes) && typeof p.path === 'string') { const d = cleanPath(p.path); if (!d) continue; FIXED[name] = d; }
    PRESETS[name] = p;
  }

  // ---------- shapes ----------

  const MIRRORS = { none: [], h: [[-1, 1]], v: [[1, -1]], both: [[-1, 1], [1, -1], [-1, -1]] };
  // Rewrites every coordinate pair of one of our own paths (absolute M/L/C/Z, single spaces).
  const mapPath = (d, f) => d.replace(/(-?[\d.]+) (-?[\d.]+)/g, (_, x, y) => { const p = f(+x, +y); return fmt(p.x) + ' ' + fmt(p.y); });
  // Centroid of each FIXED path in its own 0-100 frame: the point its ang is drawn around.
  const FIXED_C = Object.fromEntries(Object.entries(FIXED).map(([k, d]) => [k, ringCentroid(flatten(d))]));
  // A shape is a normal shape (its points, or a FIXED path at scale a, angle ang and offset x, y), optionally
  // followed by a stretch st = [sxx, sxy, syy, cx, cy]: a symmetric matrix with determinant 1 applied around
  // (cx, cy). Only that relative stretch is kept; any uniform scale, rotation or move goes into the normal
  // shape (see applyWorld), so stretching x2 one way and then x2 the other leaves no stretch at all.
  const toWorld = (sh, p) => {
    if (!sh.st) return p;
    const [a, b, d, cx, cy] = sh.st, x = p.x - cx, y = p.y - cy;
    return { x: cx + a * x + b * y, y: cy + b * x + d * y };
  };
  const toBase = (sh, p) => {
    if (!sh.st) return p;
    const [a, b, d, cx, cy] = sh.st, det = a * d - b * b, x = p.x - cx, y = p.y - cy;
    return { x: cx + (d * x - b * y) / det, y: cy + (a * y - b * x) / det };
  };
  // Shapes with a fixed outline: a FIXED preset or an imported path, both in the 0-100 frame.
  const outline = (sh) => (sh.fixed ? FIXED[sh.fixed] : sh.path);
  const pathC = new Map(); // centroid of each imported path, worked out once
  const outlineC = (sh) => {
    if (sh.whole) return { x: 50, y: 50 }; // the whole icon turns around the middle of its box
    if (sh.fixed) return FIXED_C[sh.fixed];
    if (!pathC.has(sh.path)) pathC.set(sh.path, ringCentroid(flatten(sh.path)));
    return pathC.get(sh.path);
  };
  function basePath(sh) {
    if (sh.pts) return buildPath(sh.pts);
    if (!sh.ang) return mapPath(outline(sh), (x, y) => ({ x: x * sh.a + sh.x, y: y * sh.a + sh.y })); // exact, unturned
    const c = outlineC(sh), t = sh.ang * Math.PI / 180, cos = Math.cos(t), sin = Math.sin(t);
    const ox = c.x * sh.a + sh.x, oy = c.y * sh.a + sh.y;
    return mapPath(outline(sh), (x, y) => {
      const dx = (x - c.x) * sh.a, dy = (y - c.y) * sh.a;
      return { x: ox + dx * cos - dy * sin, y: oy + dx * sin + dy * cos };
    });
  }
  // Curves are Béziers, which a stretch maps exactly: the same as stretching the drawn image.
  const shapePath = (sh) => (sh.whole ? wholeMap(iconPath().d, sh) : sh.st ? mapPath(basePath(sh), (x, y) => toWorld(sh, { x, y })) : basePath(sh));
  // ---------- the whole icon ----------
  // A transform of the icon as a whole, on top of its shapes (which it never changes): the merged outline,
  // mirrored copies included, is treated as one outline shape whose centre is the box's middle (see outlineC), so
  // the Move-mode maths (applyWorld) works on it unchanged. { a, x, y, ang, flip, st?, rot }: flipped left to right
  // in its box first (flip), then scaled by a and moved by (x, y), turned by ang around its middle, and stretched
  // (st) like any outline. null when there's none.
  const WHOLE0 = { a: 1, x: 0, y: 0, ang: 0, flip: false, rot: 0 };
  const wholeShape = () => ({ whole: true, mirror: 'none', ...WHOLE0, ...whole });
  function wholePoint(w, x, y) {
    if (w.flip) x = 100 - x;
    const t = (w.ang || 0) * Math.PI / 180, co = Math.cos(t), si = Math.sin(t), dx = (x - 50) * w.a, dy = (y - 50) * w.a;
    let px = 50 * w.a + w.x + dx * co - dy * si, py = 50 * w.a + w.y + dx * si + dy * co;
    if (w.st) { const [a, b, d, cx, cy] = w.st, X = px - cx, Y = py - cy; px = cx + a * X + b * Y; py = cy + b * X + d * Y; }
    return { x: px, y: py };
  }
  // A path of the icon (Béziers map exactly) as the whole-icon transform w draws it.
  const wholeMap = (d, w = whole) => (w ? mapPath(d, (x, y) => wholePoint(w, x, y)) : d);
  const setWhole = (sh) => { const { whole: _, mirror, ...w } = sh; whole = w; };
  // The stored transform, checked like a shape's: null if it's broken.
  function cleanWhole(w) {
    if (!w || typeof w !== 'object') return null;
    const st = cleanSt(w.st);
    if (st === null) return null;
    const out = { a: clamp(+(w.a ?? 1), 0.01, 20), x: clamp(+(w.x ?? 0), -1000, 1000), y: clamp(+(w.y ?? 0), -1000, 1000),
      ang: ((+(w.ang ?? 0) % 360) + 360) % 360, flip: w.flip === true, rot: wrap(+(w.rot ?? 0)), ...(st ? { st } : {}) };
    return [out.a, out.x, out.y, out.ang, out.rot].every(Number.isFinite) ? out : null;
  }
  // A shape's own outline followed by its mirrored copies.
  const copies = (sh) => {
    const d = shapePath(sh);
    return [d, ...MIRRORS[sh.mirror].map(([sx, sy]) => mapPath(d, (x, y) => ({ x: sx < 0 ? 100 - x : x, y: sy < 0 ? 100 - y : y })))];
  };
  // Applies w -> A w + t to the shape as drawn, A = [a, b, c, d] (row by row, positive determinant). A times the
  // current stretch splits into rotation U, uniform scale k and a new stretch of determinant 1 (polar
  // decomposition); U and k go into the normal shape, where they're exact (corner sizes scale with k), and the
  // stretch is kept on its own. Nothing is rounded beyond 1e-6, so undoing a stretch by hand lands back exactly.
  const r6 = (n) => Math.round(n * 1e6) / 1e6;
  const wrap = (deg) => { const r = ((deg % 360) + 360) % 360; return r > 360 - 1e-9 ? 0 : r; }; // into 0-360, unrounded
  function applyWorld(sh, A, tx, ty) {
    const [a, b, d, cx, cy] = sh.st || [1, 0, 1, 0, 0];
    const m = [A[0] * a + A[1] * b, A[0] * b + A[1] * d, A[2] * a + A[3] * b, A[2] * b + A[3] * d];
    const th = Math.atan2(m[2] - m[1], m[0] + m[3]), cs = Math.cos(th), sn = Math.sin(th);
    const k = Math.sqrt(m[0] * m[3] - m[1] * m[2]);
    // P = U^T m / k is the new stretch in the shape's own turn; U P U^T puts it back in canvas directions.
    const p0 = (cs * m[0] + sn * m[2]) / k, p1 = (cs * m[1] + sn * m[3]) / k, p3 = (-sn * m[1] + cs * m[3]) / k;
    const sxx = cs * cs * p0 - 2 * cs * sn * p1 + sn * sn * p3, syy = sn * sn * p0 + 2 * cs * sn * p1 + cs * cs * p3;
    const sxy = cs * sn * (p0 - p3) + (cs * cs - sn * sn) * p1;
    const nx = A[0] * cx + A[1] * cy + tx, ny = A[2] * cx + A[3] * cy + ty;
    const T = (x, y) => ({ x: nx + k * (cs * (x - cx) - sn * (y - cy)), y: ny + k * (sn * (x - cx) + cs * (y - cy)) });
    // Back within 1e-4 of no stretch (say, an edge dragged back onto its grid line): no stretch.
    const none = Math.abs(sxx - 1) < 1e-4 && Math.abs(syy - 1) < 1e-4 && Math.abs(sxy) < 1e-4;
    // The turn U also counts towards the rotation pill: stretching along a direction that isn't the
    // current stretch's own turns the shape a little (like two boosts in different directions), and the
    // pill should still read the shape's real angle, so that 0 brings it back upright.
    const out = { ...sh, rot: wrap((sh.rot || 0) + th * 180 / Math.PI) };
    if (none) delete out.st; else out.st = [sxx, sxy, syy, nx, ny];
    if (!sh.pts) {
      const f = outlineC(sh), o = T(f.x * sh.a + sh.x, f.y * sh.a + sh.y), na = sh.a * k;
      return Object.assign(out, { a: r6(na), ang: r6(((((sh.ang || 0) + th * 180 / Math.PI) % 360) + 360) % 360), x: r6(o.x - f.x * na), y: r6(o.y - f.y * na) });
    }
    out.pts = sh.pts.map((p) => { const q = T(p.x, p.y); return { x: r6(q.x), y: r6(q.y), r: r6(p.r * k), s: p.s }; });
    return out;
  }
  // p -> (p - c) * k + t, for both kinds of shape (corner sizes scale too, so the look is kept).
  const transform = (sh, k, cx, cy, tx, ty) => applyWorld(sh, [k, 0, 0, k], tx - k * cx, ty - k * cy);
  // Stretches by k along one canvas axis ('x' or 'y'), keeping the line at `at` on that axis in place.
  const stretched = (sh, axis, k, at) => (axis === 'x' ? applyWorld(sh, [k, 0, 0, 1], at - k * at, 0) : applyWorld(sh, [1, 0, 0, k], 0, at - k * at));
  // The stretch as drawn: the unit direction of its long side and how many times longer that side is
  // than the short one. null without a stretch.
  // Two arrows pointing away from each other along the long side, starting r0 from the centre; the
  // stronger the stretch, the longer they get.
  function stretchArrows(info, r0) {
    if (!info) return '';
    const { ux, uy } = info, len = Math.min(16, 2 + 4 * Math.log2(info.ratio)), f = (n) => +n.toFixed(3);
    return [1, -1].map((s) => {
      const ax = s * ux * r0, ay = s * uy * r0, bx = s * ux * (r0 + len), by = s * uy * (r0 + len);
      const hx = -s * ux * 1.8, hy = -s * uy * 1.8, px = -uy * 1.3, py = ux * 1.3;
      return `M${f(ax)} ${f(ay)}L${f(bx)} ${f(by)}M${f(bx + hx + px)} ${f(by + hy + py)}L${f(bx)} ${f(by)}L${f(bx + hx - px)} ${f(by + hy - py)}`;
    }).join('');
  }
  function stretchInfo(sh) {
    if (!sh.st) return null;
    const [a, b, d] = sh.st, l1 = (a + d) / 2 + Math.hypot((a - d) / 2, b), th = Math.atan2(2 * b, a - d) / 2;
    return { ux: Math.cos(th), uy: Math.sin(th), ratio: (l1 * l1) / (a * d - b * b) };
  }
  // Scales the given shapes, mirrored copies included, until they touch the box. An axis with mirrored
  // copies is symmetric around the canvas centre, so it may only scale around 50, never shift.
  function fitted(list) {
    const bb = measure(list.flatMap(copies).join(' '));
    if (!(bb.width > 0.01 && bb.height > 0.01)) return list;
    const lockX = list.some((s) => s.mirror === 'h' || s.mirror === 'both');
    const lockY = list.some((s) => s.mirror === 'v' || s.mirror === 'both');
    const kx = lockX ? 50 / Math.max(50 - bb.x, bb.x + bb.width - 50) : 100 / bb.width;
    const ky = lockY ? 50 / Math.max(50 - bb.y, bb.y + bb.height - 50) : 100 / bb.height;
    const k = Math.min(kx, ky), cx = lockX ? 50 : bb.x + bb.width / 2, cy = lockY ? 50 : bb.y + bb.height / 2;
    return list.map((s) => transform(s, k, cx, cy, 50, 50));
  }
  // One shape of a preset entry in the readable forms (an `icon:` entry is the editor's own format instead, read
  // by cleanShape; see snapshot() on keeping the formats in step), as written: its corners (box, polygon or pts)
  // or outline (path), in the 0-100 box or stretched onto the rectangle `at` = [x, y, width, height] like an
  // image: scaled evenly to its area, then given a stretch (st) for its proportions, the same the editor's
  // stretch handles make. A circle in a wide rectangle comes out an ellipse. Then turned by `angle`, if any.
  // null if it's none of those.
  function presetItem(p) {
    const mirror = Object.hasOwn(MIRRORS, p.mirror) ? p.mirror : 'none';
    const [ax, ay, w, h] = Array.isArray(p.at) ? p.at.map(Number) : [0, 0, 100, 100];
    const g = Math.sqrt(w * h) / 100, cx = ax + w / 2, cy = ay + h / 2;
    const extra = { mirror, ...(Math.abs(w - h) > 1e-9 ? { st: [w / (100 * g), 0, h / (100 * g), cx, cy] } : {}) };
    let sh = null;
    if (typeof p.path === 'string') {
      const d = cleanPath(p.path);
      sh = d && { path: d, a: g, x: cx - 50 * g, y: cy - 50 * g, ...extra };
    } else {
      const pts = Array.isArray(p.box) ? box(...p.box.map(Number)) : Array.isArray(p.polygon) ? polygon(...p.polygon.map(Number))
        : Array.isArray(p.pts) ? p.pts.map(([x, y, r = 0, s = 0]) => ({ x: +x, y: +y, r: +r, s: +s })) : null;
      sh = pts && { pts: pts.map((q) => ({ x: cx + (q.x - 50) * g, y: cy + (q.y - 50) * g, r: q.r * g, s: q.s })), ...extra };
    }
    // angle: then turned, in degrees clockwise (as the rotation slider), around the rectangle's centre.
    const t = (+p.angle || 0) * Math.PI / 180, co = Math.cos(t), si = Math.sin(t);
    return sh && t ? applyWorld(sh, [co, -si, si, co], cx - co * cx + si * cy, cy - si * cx - co * cy) : sh;
  }
  // A preset's shapes, ready to use. A single shape's corners are fitted to the box (with its mirrored copies and
  // stretch, if any), a single outline stays as written; several shapes are fitted to the box together, keeping their
  // places relative to each other. With fit: false, nothing is fitted. An icon (the editor's format) is used as stored.
  function presetShapes(name) {
    const p = PRESETS[name], keep = p.fit === false; // fit: false keeps every shape where it's written
    if (p.icon) { // the editor's own data, as an edit link holds it: checked the same way, used as stored unless fit: true
      const list = (Array.isArray(p.icon.shapes) ? p.icon.shapes : []).map(cleanShape);
      if (!list.length || list.includes(null)) throw new Error('broken icon');
      return p.fit === true ? fitted(list) : list;
    }
    if (Array.isArray(p.shapes)) return keep ? p.shapes.map(presetItem) : fitted(p.shapes.map(presetItem));
    const sh = presetItem(p);
    if (keep && sh.pts) return [sh];
    if (sh.path) { const { path, ...rest } = sh; return [{ ...rest, fixed: name }]; }
    return sh.mirror === 'none' && !sh.st ? [{ pts: fit(sh.pts), mirror: 'none' }] : fitted([sh]);
  }
  // An entry's whole-icon transform (`whole`, or the `icon` data's own): null for none, false if it's broken.
  const presetWhole = (name) => { const w = PRESETS[name].whole ?? PRESETS[name].icon?.whole; return w === undefined ? null : cleanWhole(w) || false; };
  // A preset's picture: one path per outline (mirrored copies wind the other way, so one path would leave holes).
  // Same scale as the canvas and cut off at the 0-100 box, as the launcher draws the icon: parts reaching outside
  // it don't show (the inner svg clips them), and nothing draws over the tile.
  // Saved shapes (see library) are drawn the same way. w is the list's whole-icon transform, null for none.
  function iconSvg(list, w, pad = 0) {
    const paths = list.flatMap(copies).map((d) => `<path d="${wholeMap(d, w)}"/>`).join('');
    return `<svg viewBox="${-pad} ${-pad} ${100 + 2 * pad} ${100 + 2 * pad}" aria-hidden="true"><svg width="100" height="100" viewBox="0 0 100 100">${paths}</svg></svg>`;
  }
  const presetSvg = (name, pad = 0) => iconSvg(presetShapes(name), presetWhole(name), pad);
  // The presets in the data file's order, minus any that don't make a valid icon.
  const presetNames = Object.keys(PRESETS).filter((name) => {
    try {
      const list = presetShapes(name);
      return presetWhole(name) !== false && list.length > 0 && list.length <= 20 && list.every((sh) => cleanShape(sh) && (!sh.pts || !selfIntersects(sh.pts)))
        && !iconPath(list).error;
    } catch (e) { return false; }
  });
  const presetsShown = Number.isInteger(presetData.visible) ? presetData.visible : presetNames.length;
  const shapeName = (sh, i) => sh.fixed || `${sh.path ? 'Imported' : 'Shape'} ${i + 1}`;

  // ---------- merging ----------

  // Polyline of one of our own paths; curves become segments of at most ~1.5 units.
  function flatten(d) {
    const t = d.split(' '), ring = [];
    let i = 0, cx = 0, cy = 0;
    while (i < t.length) {
      const c = t[i++];
      if (c === 'M' || c === 'L') { cx = +t[i++]; cy = +t[i++]; ring.push([cx, cy]); }
      else if (c === 'C') {
        const [x1, y1, x2, y2, x, y] = t.slice(i, i + 6).map(Number);
        i += 6;
        const len = Math.hypot(x1 - cx, y1 - cy) + Math.hypot(x2 - x1, y2 - y1) + Math.hypot(x - x2, y - y2);
        const n = clamp(Math.ceil(len / 1.5), 2, 32);
        for (let k = 1; k <= n; k++) {
          const s = k / n, u = 1 - s, a = u * u * u, b = 3 * u * u * s, c2 = 3 * u * s * s, e = s * s * s;
          ring.push([a * cx + b * x1 + c2 * x2 + e * x, a * cy + b * y1 + c2 * y2 + e * y]);
        }
        cx = x; cy = y;
      }
    }
    return ring;
  }
  // Area centroid of the shape's own outline, mirrored copies excluded.
  const centroid = (sh) => ringCentroid(flatten(shapePath(sh)));
  function ringCentroid(r) {
    let a = 0, x = 0, y = 0;
    r.forEach(([x0, y0], i) => {
      const [x1, y1] = r[(i + 1) % r.length], c = x0 * y1 - x1 * y0;
      a += c; x += (x0 + x1) * c; y += (y0 + y1) * c;
    });
    return { x: x / (3 * a), y: y / (3 * a) };
  }
  // The point a shape rotates and centres around, as picked in the Move pill: the middle of its box, one of its
  // corners, or its centre of mass. Only the centre of mass stays put as the shape turns.
  let pivotMode = 'box', pivotCorner = 0; // 'box', 'mass' or 'corner'; the corner as in boxCorners()
  // Measured from the outline at 6 decimals: at 2, turning a shape and turning it back would pivot around
  // two slightly different points and not land exactly where it started. For several shapes: their combined
  // box, or the area-weighted average of their centres of mass (exact where they don't overlap).
  const pivotOf = (list) => {
    digits = 6;
    try {
      if (pivotMode === 'mass') {
        if (list.length === 1) return centroid(list[0]);
        let a = 0, x = 0, y = 0;
        for (const sh of list) {
          const r = flatten(shapePath(sh)), w = Math.abs(ringArea(r)), c = ringCentroid(r);
          a += w; x += c.x * w; y += c.y * w;
        }
        return { x: x / a, y: y / a };
      }
      const b = measure(list.map(shapePath).join(' '));
      return pivotMode === 'corner' ? boxCorners(b)[pivotCorner] : { x: b.x + b.width / 2, y: b.y + b.height / 2 };
    } finally { digits = 2; }
  };
  const pivot = (sh) => pivotOf([sh]);
  // Ramer–Douglas–Peucker: drops points closer than tol to the line between their neighbours.
  function simplify(pts, tol) {
    if (pts.length < 4) return pts;
    const keep = new Uint8Array(pts.length), stack = [[0, pts.length - 1]];
    keep[0] = keep[pts.length - 1] = 1;
    while (stack.length) {
      const [a, b] = stack.pop(), [ax, ay] = pts[a], [bx, by] = pts[b], len = Math.hypot(bx - ax, by - ay) || 1;
      let idx = -1, max = tol;
      for (let i = a + 1; i < b; i++) {
        const d = Math.abs((bx - ax) * (ay - pts[i][1]) - (ax - pts[i][0]) * (by - ay)) / len;
        if (d > max) { max = d; idx = i; }
      }
      if (idx >= 0) { keep[idx] = 1; stack.push([a, idx], [idx, b]); }
    }
    return pts.filter((_, i) => keep[i]);
  }
  // The icon as one outline for the launcher: { d, error, note }. A lone shape keeps its exact path
  // (curves included); anything else is flattened, merged and simplified to straight segments.
  // Without a list, the icon itself, remembered until its shapes change (the whole icon's box and pivot measure
  // it again and again). A list (a preset being checked) is merged as it is.
  let iconCache = { key: '', out: null };
  function iconPath(list) {
    if (list) return mergedIcon(list);
    const key = JSON.stringify(shapes);
    if (key !== iconCache.key) iconCache = { key, out: mergedIcon(shapes) };
    return iconCache.out;
  }
  function mergedIcon(list) {
    const all = list.flatMap(copies);
    if (all.length === 1) return { d: all[0] };
    let merged;
    try { merged = polygonClipping.union(...all.map((d) => [flatten(d)])); } catch (e) { return { d: all.join(' '), error: "These shapes couldn't be merged." }; }
    const outline = (poly) => 'M ' + simplify(poly[0].slice(0, -1), 0.05).map(([x, y]) => fmt(x) + ' ' + fmt(y)).join(' L ') + ' Z';
    if (merged.length !== 1) {
      return { d: merged.map(outline).join(' '), error: "The shapes don't all touch. The launcher needs them to form one connected outline." };
    }
    return { d: outline(merged[0]), note: merged[0].length > 1 ? 'Gaps enclosed by the shapes are filled in: the launcher needs an outline without holes.' : '' };
  }

  // ---------- state ----------

  const STORE = 'murine-shape-editor';
  let shapes, active = 0, mode = 'edit', sel = -1, drag = null, sliding = false;
  let turnTyping = false; // the rotation pill shows a number field instead of the slider
  let pillView = 'pos'; // which half of the Move pill is open: the centre point's position, or 'rot'ation
  let pickedCorner = -1; // Move mode: the selected resize corner (0 top left, clockwise), -1 for none
  // Edit mode's selected corners: sel is the last one picked (the one the pill and keyboard focus follow), selSet
  // all of them, sel included. A tap selects one corner; Ctrl/Cmd+click or a long press adds or drops one.
  let selSet = new Set();
  const selectOnly = (i) => { sel = i; selSet = new Set(i >= 0 ? [i] : []); };
  const selList = () => [...selSet].sort((a, b) => a - b);
  function toggleCorner(i) {
    if (selSet.has(i)) { selSet.delete(i); if (sel === i) sel = selSet.size ? selList()[selSet.size - 1] : -1; }
    else { selSet.add(i); sel = i; }
  }
  // The middle of the selected corners' box, as drawn: what the X/Y pill shows and sets for several corners.
  const selCentre = () => { const w = selList().map((i) => wpt(pts[i])), xs = w.map((q) => q.x), ys = w.map((q) => q.y);
    return { x: (Math.min(...xs) + Math.max(...xs)) / 2, y: (Math.min(...ys) + Math.max(...ys)) / 2 }; };
  // Moves every selected corner by (dx, dy), as drawn, from where `from` (index -> drawn point) says it started.
  const startOf = () => new Map(selList().map((i) => [i, { ...wpt(pts[i]) }])); // a copy: wpt may hand back the point itself
  // The selected corners move as one: the move is cut short, per axis, where the first of them would cross the
  // edge of the drawing area, so they keep their places relative to each other (and stop together).
  const moveCorners = (dx, dy, from = startOf()) => {
    const ws = [...from.values()], lim = (d, k) => {
      const lo = Math.min(...ws.map((w) => w[k])), hi = Math.max(...ws.map((w) => w[k]));
      return clamp(d, Math.min(0, view.lo - lo), Math.max(0, view.hi - hi));
    };
    dx = lim(dx, 'x'); dy = lim(dy, 'y');
    for (const [i, w] of from) setPoint(i, { x: w.x + dx, y: w.y + dy });
  };
  const removeCorners = () => { for (const i of selList().reverse()) pts.splice(i, 1); };
  let pts = null, fixed = false; // shortcuts into shapes[active]: its points, or whether its outline is fixed
  // Several shapes picked from their cards (long press or Ctrl+click) are moved, resized, stretched and turned
  // together, in Move mode only. groups remembers each picked set's own stretch and angle, by the shapes' ids,
  // until one of them is deleted; each shape still stores its full stretch and angle itself.
  let multi = new Set(), groups = [];
  let whole = null, wholeOn = false; // the whole-icon transform (see wholeShape), and whether its card is picked
  let synced = '';
  const sync = () => {
    active = clamp(active, 0, shapes.length - 1);
    let next = Math.max(0, ...shapes.map((sh) => (Number.isInteger(sh.id) ? sh.id + 1 : 0)));
    const seen = new Set();
    for (const sh of shapes) { if (!Number.isInteger(sh.id) || seen.has(sh.id)) sh.id = next++; seen.add(sh.id); }
    // A deleted or mirrored member can't be picked with the others again, so the group's record goes.
    const plain = new Set(shapes.filter((sh) => sh.mirror === 'none').map((sh) => sh.id));
    groups = groups.filter((g) => g.ids.every((id) => plain.has(id)));
    if ([...multi].some((i) => i >= shapes.length || shapes[i].mirror !== 'none') || multi.size < 2) multi = new Set();
    if (multi.size) mode = 'move';
    if (mode !== 'move' || multi.size) wholeOn = false; // the Global card is picked in Move mode only
    pts = shapes[active].pts || null;
    fixed = !shapes[active].pts;
    if (fixed) mode = 'move';
    if (synced !== active + mode) pickedCorner = -1; // another shape or mode: the corner selection goes
    synced = active + mode;
  };
  const undo = [], redo = [];

  // Everything needed to resume editing. Undo, localStorage and edit links all go through this pair,
  // so a new piece of state only has to be added to snapshot() and restore().
  // The shape format (what cleanShape accepts) is written in two more places. Presets in
  // _data/icon_shapes.yml use it as is under `icon:`, read by cleanShape too, so they keep up on their
  // own; but when a shape field changes, also check:
  //  - the readable preset forms (box, polygon, pts, path, at, angle: see presetItem, its reverse readable()
  //    for the YAML export, and the comments at the top of _data/icon_shapes.yml), if the change should be
  //    writable there too;
  //  - "Link format" in icon-shapes.html, which documents this JSON for hand-written links.
  // The whole-icon transform (whole, see wholeShape) is written in those same places, and read for presets too.
  const snapshot = () => ({ shapes, active, groups, ...(multi.size > 1 && { multi: [...multi] }), ...(whole && { whole }) });
  // Also reads edit links, i.e. anything anyone can type into a URL: rebuild every field, keep nothing unchecked.
  function cleanShape(s) {
    const mirror = Object.hasOwn(MIRRORS, s?.mirror) ? s.mirror : 'none', rot = wrap(+(s?.rot ?? 0));
    if (!Number.isFinite(rot)) return null;
    const st = cleanSt(s?.st);
    if (st === null) return null;
    const extra = { ...(st ? { st } : {}), ...(Number.isInteger(s?.id) && s.id >= 0 && s.id < 1e6 ? { id: s.id } : {}) };
    if (typeof s?.fixed === 'string' && Object.hasOwn(FIXED, s.fixed)) {
      // Saves from before stretching drew the head at its pill angle (rot); now that's ang.
      const ang = ((+(s.ang ?? s.rot ?? 0) % 360) + 360) % 360;
      const sh = { fixed: s.fixed, a: clamp(+(s.a ?? 1), 0.01, 20), x: clamp(+(s.x ?? 0), -1000, 1000), y: clamp(+(s.y ?? 0), -1000, 1000), ang, mirror, rot, ...extra };
      return [sh.a, sh.x, sh.y, sh.ang].every(Number.isFinite) ? sh : null;
    }
    if (typeof s?.path === 'string') {
      const d = cleanPath(s.path), ang = ((+(s.ang ?? 0) % 360) + 360) % 360;
      const sh = { path: d, a: clamp(+(s.a ?? 1), 0.01, 20), x: clamp(+(s.x ?? 0), -1000, 1000), y: clamp(+(s.y ?? 0), -1000, 1000), ang, mirror, rot, ...extra };
      return d && [sh.a, sh.x, sh.y, sh.ang].every(Number.isFinite) ? sh : null;
    }
    if (!Array.isArray(s?.pts) || s.pts.length < 3 || s.pts.length > 200) return null;
    // r and s may be left out of hand-written links (see "Link format" on the page): sharp corners.
    const p = s.pts.map((q) => ({ x: clamp(+q?.x, -500, 600), y: clamp(+q?.y, -500, 600), r: clamp(+(q?.r ?? 0), 0, 500), s: clamp(+(q?.s ?? 0), 0, 1) }));
    return p.every((q) => [q.x, q.y, q.r, q.s].every(Number.isFinite)) ? { pts: p, mirror, rot, ...extra } : null;
  }
  // A stretch: a symmetric matrix brought back to determinant 1, and its centre; undefined for none, null if broken.
  function cleanSt(st) {
    if (st === undefined) return undefined;
    const [a, b, d, cx, cy] = Array.isArray(st) ? st.map(Number) : [], det = a * d - b * b;
    if (!(a > 0 && det > 1e-6 && Math.abs(b) < 1e3 && a < 1e3 && Math.abs(cx) < 1e3 && Math.abs(cy) < 1e3)) return null;
    const k = Math.sqrt(det);
    return [a / k, b / k, d / k, cx, cy];
  }
  // A group's record: { ids (2 or more, sorted), st?, rot }. Broken ones are just dropped.
  function cleanGroup(g) {
    const ids = Array.isArray(g?.ids) ? [...new Set(g.ids)].filter((i) => Number.isInteger(i) && i >= 0 && i < 1e6).sort((a, b) => a - b) : [];
    const st = cleanSt(g?.st), rot = wrap(+(g?.rot ?? 0));
    if (ids.length < 2 || st === null || !Number.isFinite(rot)) return null;
    return { ids, rot, ...(st ? { st } : {}) };
  }
  // An imported outline as it's stored: one contour of absolute M/L/C, single spaces, closed with Z. Anything
  // else (or anything huge) is rejected; returns the path rebuilt from its parsed numbers, or null.
  function cleanPath(d) {
    if (d.length > 30000) return null;
    const t = d.trim().split(' '), out = [];
    if (t[0] !== 'M' || t[t.length - 1] !== 'Z') return null;
    for (let i = 0; i < t.length - 1;) {
      const c = t[i++], n = { M: 2, L: 2, C: 6 }[c];
      if (!n || (c === 'M') !== (i === 1)) return null;
      const v = t.slice(i, i + n).map(Number);
      if (v.length < n || !v.every((x) => Number.isFinite(x) && Math.abs(x) <= 1000)) return null;
      out.push(c, ...v.map(fmt));
      i += n;
    }
    return out.length > 3 ? out.join(' ') + ' Z' : null;
  }
  function restore(o) {
    // Saves and links from before multiple shapes held one shape: { pts } or { pts, fixed }.
    if (o && !o.shapes && (o.pts || o.fixed)) o = { shapes: [o.fixed ? { fixed: o.fixed } : { pts: o.pts }], active: 0 };
    if (!Array.isArray(o?.shapes) || !o.shapes.length || o.shapes.length > 20) return false;
    const list = o.shapes.map(cleanShape);
    if (list.includes(null)) return false;
    shapes = list;
    groups = (Array.isArray(o.groups) ? o.groups.slice(0, 50) : []).map(cleanGroup).filter(Boolean);
    whole = cleanWhole(o.whole); wholeOn = false;
    active = Number.isInteger(o.active) ? o.active : 0;
    selectOnly(-1); multi = new Set(Array.isArray(o.multi) ? o.multi.filter((i) => Number.isInteger(i) && i >= 0) : []);
    sync(); // drops a multi that doesn't fit the shapes
    // Undo steps also carry the selected corners (see undoState): back in Edit mode with them selected.
    const cs = Array.isArray(o.corners) && pts && !multi.size ? o.corners.filter((i) => Number.isInteger(i) && i >= 0 && i < pts.length) : [];
    if (cs.length) { mode = 'edit'; selSet = new Set(cs); sel = cs.includes(o.sel) ? o.sel : cs[cs.length - 1]; sync(); }
    if (o.wholeSel && !multi.size) { mode = 'move'; wholeOn = true; } // undo steps also remember the Global card
    return true;
  }

  // Links carry their data deflated (raw DEFLATE, built into every current browser as CompressionStream)
  // and base64url-encoded. The app reads the import link with java.util.zip.Inflater(true) + Base64.URL_SAFE.
  const pipe = (bytes, stream) => new Response(new Blob([bytes]).stream().pipeThrough(stream)).arrayBuffer();
  const pack = async (str) => {
    const bytes = new Uint8Array(await pipe(str, new CompressionStream('deflate-raw')));
    let bin = '';
    for (let i = 0; i < bytes.length; i += 8192) bin += String.fromCharCode(...bytes.subarray(i, i + 8192)); // spread has a size limit
    return btoa(bin).replace(/\+/g, '-').replace(/\//g, '_').replace(/=+$/, '');
  };
  // Stops at 2 MB of output: a crafted link can't inflate into more than that.
  async function unpack(b64) {
    const bytes = Uint8Array.from(atob(b64.replace(/-/g, '+').replace(/_/g, '/')), (c) => c.charCodeAt(0));
    const reader = new Blob([bytes]).stream().pipeThrough(new DecompressionStream('deflate-raw')).getReader(), parts = [];
    for (let n = 0; ;) {
      const { done, value } = await reader.read();
      if (done) break;
      if ((n += value.length) > 2e6) { reader.cancel(); throw new Error('too big'); }
      parts.push(value);
    }
    return new TextDecoder().decode(await new Blob(parts).arrayBuffer());
  }
  // Same path with the separators the launcher's parser also accepts: "M9.38,59.57L.5,-.97Z".
  const compactPath = (d) => d.replace(/ ?([MLCZ]) ?/g, '$1').replace(/ /g, ',').replace(/(^|[^\d])0\./g, '$1.');
  const IMPORT = 'murine-home://icon-shape?shape='; // the app side doesn't exist yet; it must validate the path

  // Built after every change, so a click can copy or open them without waiting.
  let links = { edit: '', import: '' }, linkRun = 0;
  async function refreshLinks(d, bad) {
    const run = ++linkRun, state = JSON.stringify(snapshot());
    const [e, i] = await Promise.all([pack(state), pack(compactPath(d))]);
    if (run !== linkRun) return; // a newer change already started its own
    links = { edit: location.origin + location.pathname + '#edit=' + e, import: bad ? '' : IMPORT + i };
    $('se-use').href = links.import || '#';
    $('se-share-edit').href = links.edit;
  }
  const grid = { show: true, snap: true, step: 5 };
  const snap = (v) => clamp(grid.snap ? Math.round(v / grid.step) * grid.step : +v.toFixed(2), view.lo, view.hi);
  // An undo step: the icon plus the selected corners, so undo and redo bring the selection back too. Only undo
  // keeps those; saves and edit links don't.
  const undoState = () => JSON.stringify({ ...snapshot(), ...(sel >= 0 && mode === 'edit' && { corners: selList(), sel }), ...(wholeOn && { wholeSel: true }) });
  const checkpoint = () => {
    importNote = '';
    turnFrom = null; // any other edit ends a rotation-slider drag (see the slider's input handler)
    undo.push(undoState());
    if (undo.length > 100) undo.shift();
    redo.length = 0; // a new edit starts a new branch, so there's nothing left to redo
  };
  // Whole icon (presets, Reset) or just the selected shape (Generate).
  const loadIcon = (list, w = null) => { checkpoint(); shapes = list; whole = w; active = 0; selectOnly(-1); multi = new Set(); mode = 'edit'; sync(); render(); };
  const replaceShape = (sh) => { checkpoint(); shapes[active] = sh; selectOnly(-1); multi = new Set(); mode = 'edit'; sync(); render(); };

  // ---------- Move mode's selection: the picked group, or the selected shape ----------

  const selIdx = () => (multi.size > 1 ? [...multi].sort((a, b) => a - b) : [active]);
  const selShapes = () => (wholeOn ? [wholeShape()] : selIdx().map((i) => shapes[i]));
  // Puts back shapes made from selShapes(): into the icon, or into the whole-icon transform.
  const setSelShapes = (list) => (wholeOn ? setWhole(list[0]) : list.forEach((sh, k) => (shapes[selIdx()[k]] = sh)));
  const selPivot = () => pivotOf(selShapes());
  // The picked group's record (made on first use when make is set), or null for a single shape.
  function groupRec(make) {
    if (multi.size < 2) return null;
    const ids = selShapes().map((sh) => sh.id).sort((a, b) => a - b), key = ids.join();
    let g = groups.find((r) => r.ids.join() === key);
    if (!g && make) groups.push(g = { ids, rot: 0 });
    return g || null;
  }
  // What the selection's angle and stretch read as: the shape's own, or the group's record.
  const selState = () => (wholeOn ? wholeShape() : multi.size > 1 ? groupRec(false) || { rot: 0 } : shapes[active]);
  // The selection as it is now, for drags that apply each step to where they started.
  const selBase = () => ({ shapes: selShapes(), group: (({ st, rot }) => ({ st, rot }))(selState()) });
  // Applies w -> A w + t to the selected shapes (as they were in base, when given) and to the group's record,
  // which follows the same maths as a shape with no outline of its own.
  function applySel(A, tx, ty, base = null) {
    if (wholeOn) return setWhole(applyWorld(base ? base.shapes[0] : wholeShape(), A, tx, ty));
    selIdx().forEach((i, k) => { shapes[i] = applyWorld(base ? base.shapes[k] : shapes[i], A, tx, ty); });
    const g = groupRec(true);
    if (g) {
      const r = applyWorld({ pts: [], ...(base ? base.group : { st: g.st, rot: g.rot }) }, A, tx, ty);
      if (r.st) g.st = r.st; else delete g.st;
      g.rot = r.rot;
    }
  }
  // Turns the selection by deg (clockwise) around c; the angle shown is then set exactly, rather than read back
  // from the matrix.
  function turnSel(deg, c, base = null) {
    const t = deg * Math.PI / 180, cos = Math.cos(t), sin = Math.sin(t), from = base ? base.group.rot : selState().rot;
    applySel([cos, -sin, sin, cos], c.x - cos * c.x + sin * c.y, c.y - sin * c.x - cos * c.y, base);
    const rot = wrap((from || 0) + deg);
    if (wholeOn) whole.rot = rot; else if (multi.size > 1) groupRec(true).rot = rot; else shapes[active].rot = rot;
  }
  const withSize = (i, r) => pts.map((p, k) => (k === i ? { ...p, r } : p));
  const neighbours = (i) => [(i + pts.length - 1) % pts.length, (i + 1) % pts.length];
  // Largest size corner i can take before it starts shrinking a neighbour's rounding. Neighbours only
  // ever shrink as it grows, so a binary search finds the point.
  function squeezeStart(i, max) {
    const nb = neighbours(i);
    const sum = (r) => { const d = cornerSizes(withSize(i, r)); return d[nb[0]] + d[nb[1]]; };
    const base = sum(0);
    if (sum(max) >= base - 0.01) return max;
    let lo = 0, hi = max;
    for (let k = 0; k < 20; k++) { const m = (lo + hi) / 2; if (sum(m) < base - 0.01) hi = m; else lo = m; }
    return lo;
  }

  // ---------- rendering ----------

  const svg = $('se-canvas');
  const el = (tag, attrs) => {
    const e = document.createElementNS(NS, tag);
    for (const k in attrs) e.setAttribute(k, attrs[k]);
    return e;
  };
  // Grows or shrinks a container to n children. Everything on the canvas is updated in place, never
  // replaced: a replaced element under a finger is detached, and its touch events then never reach
  // the canvas listener that stops the page scrolling.
  const resize = (parent, n, make) => {
    while (parent.children.length > n) parent.lastChild.remove();
    while (parent.children.length < n) parent.append(make());
  };

  function drawGrid() {
    const g = $('se-grid');
    g.replaceChildren();
    if (!grid.show) return;
    const { lo, hi } = view;
    for (let v = Math.ceil(lo / grid.step) * grid.step; v <= hi; v += grid.step) {
      const cls = v === 50 ? 'se-grid-mid' : 'se-grid-line';
      g.append(el('line', { x1: v, y1: lo, x2: v, y2: hi, class: cls }));
      g.append(el('line', { x1: lo, y1: v, x2: hi, y2: v, class: cls }));
    }
  }

  let activeBox = null; // bounding box of the selected shape's own outline, for Move mode
  const boxCorners = (b) => [{ x: b.x, y: b.y }, { x: b.x + b.width, y: b.y }, { x: b.x + b.width, y: b.y + b.height }, { x: b.x, y: b.y + b.height }];
  // Move mode's 8 handles: the corners (top left, clockwise), then the middle of each side (top, right,
  // bottom, left). Corners resize keeping the proportions, sides stretch; each pulls against its opposite.
  const boxHandles = (b) => [...boxCorners(b), { x: b.x + b.width / 2, y: b.y }, { x: b.x + b.width, y: b.y + b.height / 2 },
    { x: b.x + b.width / 2, y: b.y + b.height }, { x: b.x, y: b.y + b.height / 2 }];
  const opposite = (i) => (i < 4 ? (i + 2) % 4 : 4 + (i - 2) % 4);
  const sideAxis = (i) => (i === 5 || i === 7 ? 'x' : 'y'); // the axis a side handle stretches
  // Where the selected shape's points are on the canvas (they're stored before its stretch), and back.
  const wpt = (p) => toWorld(shapes[active], p);
  const bpt = (p) => toBase(shapes[active], p);
  const setPoint = (i, w) => { const q = bpt(w); pts[i].x = r6(q.x); pts[i].y = r6(q.y); };

  function render() {
    // Per shape: own outline, then its mirrored copies. With the Global card picked, as its transform draws them.
    const lines = shapes.map(copies).map((ls) => (wholeOn ? ls.map((d) => wholeMap(d)) : ls));
    if (!drag) {
      const bb = measure(lines.flat().join(' '));
      const xy = [bb.x, bb.y, bb.x + bb.width, bb.y + bb.height, ...(pts ? pts.map(wpt).flatMap((p) => [p.x, p.y]) : [])];
      const lo = Math.floor(Math.min(-20, ...xy) - 6), hi = Math.ceil(Math.max(120, ...xy) + 6);
      if (lo !== view.lo || hi !== view.hi) {
        Object.assign(view, { lo, hi });
        svg.setAttribute('viewBox', `${lo} ${lo} ${hi - lo} ${hi - lo}`);
        drawGrid();
      }
    }
    const base = iconPath(), out = whole ? { ...base, d: wholeMap(base.d) } : base; // the icon as the launcher gets it
    const crossed = shapes.findIndex((sh) => sh.pts && selfIntersects(sh.pts));
    const bad = !!out.error || crossed >= 0;

    // Each shape and mirrored copy is filled and outlined on its own. The selected one is drawn last: while
    // selected it sits on top, and clicks on it reach it first (see shapeAt).
    // The others go in two layers, fills (whose overlaps are capped, see #se-cap-*) and outlines.
    const picks = wholeOn ? shapes.map((_, i) => i) : selIdx(), on = new Set(picks);
    const back = shapes.flatMap((_, i) => (on.has(i) ? [] : lines[i].map((d, c) => ({ d, cls: 'se-line' + (c ? ' copy' : '') }))));
    let front = picks.flatMap((i) => lines[i].map((d, c) => ({ d, cls: 'se-line active' + (c ? ' copy' : '') })));
    // The Global card draws the icon as the launcher gets it: one merged outline, holes filled. It's the same
    // (remembered) merge as the output below, so this costs nothing; the shapes themselves stay as they are.
    if (wholeOn && out.d) front = [{ d: out.d, cls: 'se-line active' }];
    for (const [id, list] of [['se-back-fill', back], ['se-back-stroke', back], ['se-front', front]]) {
      const layer = $(id);
      resize(layer, list.length, () => el('path', {}));
      list.forEach((s, k) => { layer.children[k].setAttribute('d', s.d); layer.children[k].setAttribute('class', s.cls); });
    }
    $('se-outline').setAttribute('points', pts && mode === 'edit' ? pts.map(wpt).map((p) => p.x + ',' + p.y).join(' ') : '');

    // Neighbours whose rounding the selected corner is currently eating into.
    const squeezed = new Set();
    if (pts && sel >= 0) {
      const now = cornerSizes(pts);
      for (const i of selSet) {
        const alone = cornerSizes(withSize(i, 0));
        for (const j of neighbours(i)) if (now[j] < alone[j] - 0.01) squeezed.add(j);
      }
    }

    const handles = $('se-handles'), adders = $('se-adders'), shown = pts && mode === 'edit' ? pts.map(wpt) : [];
    const focused = document.activeElement?.dataset?.i !== undefined;
    resize(adders, shown.length, () => {
      const g = el('g', { class: 'se-add' }), t = el('title', {});
      t.textContent = 'Add a point here';
      g.append(el('circle', { r: 5, class: 'se-hit' }), el('circle', { r: 2.6 }), el('path', {}), t);
      return g;
    });
    resize(handles, shown.length, () => {
      const g = el('g', { tabindex: 0, role: 'button' });
      g.append(el('circle', { r: 6, class: 'se-hit' }), el('circle', { r: 2.4 }));
      return g;
    });
    shown.forEach((p, i) => {
      const q = shown[(i + 1) % shown.length], m = lerp(p, q, 0.5), a = adders.children[i], h = handles.children[i];
      a.dataset.add = i;
      a.style.display = !drag && dist(p, q) > 10 ? '' : 'none'; // grabAt() uses the same rule
      for (const c of a.querySelectorAll('circle')) { c.setAttribute('cx', m.x); c.setAttribute('cy', m.y); }
      a.querySelector('path').setAttribute('d', `M${m.x - 1.4} ${m.y}h2.8M${m.x} ${m.y - 1.4}v2.8`);
      h.dataset.i = i;
      h.setAttribute('aria-label', `Point ${i + 1}`);
      h.setAttribute('class', 'se-handle' + (selSet.has(i) ? ' selected' : '') + (squeezed.has(i) ? ' squeezed' : ''));
      for (const c of h.children) { c.setAttribute('cx', p.x); c.setAttribute('cy', p.y); }
    });
    if (focused && sel >= 0 && document.activeElement !== handles.children[sel]) handles.children[sel]?.focus();

    // Move mode: a box around the selected shape, with a resize handle on each corner.
    const moving = mode === 'move';
    $('se-move').style.display = moving ? '' : 'none';
    if (moving) {
      activeBox = measure((wholeOn ? lines.flat() : picks.map((i) => lines[i][0])).join(' '));
      const r = $('se-move-box'), b = activeBox;
      r.setAttribute('x', b.x); r.setAttribute('y', b.y); r.setAttribute('width', b.width); r.setAttribute('height', b.height);
      boxHandles(b).forEach((c, i) => {
        const h = $('se-move').querySelectorAll('.se-resize')[i];
        h.setAttribute('x', c.x - h.getAttribute('width') / 2); h.setAttribute('y', c.y - h.getAttribute('height') / 2);
        h.classList.toggle('selected', i === pickedCorner);
      });
    }
    $('se-fit-tools').hidden = $('se-mirror').hidden = !moving;
    const many = picks.length > 1, state = selState();
    $('se-unstretch').hidden = !state.st;
    for (const b of $('se-mirror').querySelectorAll('[data-mirror]')) {
      b.setAttribute('aria-pressed', !wholeOn && b.dataset.mirror === shapes[active].mirror);
      b.disabled = many || wholeOn; // a group's shapes have no mirroring (see toggleMulti), nor has the whole icon
    }
    for (const b of $('se-mirror').querySelectorAll('[data-pivot]')) b.setAttribute('aria-pressed', b.dataset.pivot === pivotMode);
    const [cx, cy] = [[6, 6], [18, 6], [18, 18], [6, 18]][pivotCorner];
    $('se-corner-dot').setAttribute('cx', cx); $('se-corner-dot').setAttribute('cy', cy);
    for (const b of $('se-corner-pick').children) b.setAttribute('aria-pressed', +b.dataset.corner === pivotCorner);
    if (!moving) $('se-corner-pick').hidden = true;
    if (moving) { const c = selPivot(); $('se-pivot-mark').setAttribute('transform', `translate(${c.x} ${c.y})`); }
    // The stretch marks: in Move mode on the pivot cross, past the end of its arms (for a group, its own
    // remembered stretch); in Edit mode from the centre of mass, around a dot.
    const info = stretchInfo(state);
    $('se-stretch-arrows').setAttribute('d', moving ? stretchArrows(info, 4) : '');
    const editMark = !moving && info && pts;
    $('se-stretch-mark').style.display = editMark ? '' : 'none';
    if (editMark) {
      const c = centroid(shapes[active]);
      $('se-stretch-mark').setAttribute('transform', `translate(${c.x} ${c.y})`);
      $('se-stretch-mark').querySelector('path').setAttribute('d', stretchArrows(info, 1.6));
    }

    renderCards();

    // controls
    const editable = !!pts;
    $('se-corner-set').disabled = !editable || wholeOn; // Global has no corners of its own
    // Top-left pill: the selected point (Edit mode) or the selected corner (Move mode).
    const at = moving ? (pickedCorner >= 0 && activeBox ? boxHandles(activeBox)[pickedCorner] : null) : (pts && sel >= 0 ? (selSet.size > 1 ? selCentre() : wpt(pts[sel])) : null);
    $('se-point-pill').hidden = !at;
    // In its place, with no corner selected in Move mode: the shape's rotation.
    $('se-rot-pill').hidden = !moving || !!at;
    if (moving && !at) {
      const rot = state.rot || 0;
      $('se-turn').value = rot; $('se-turn-val').value = Math.round(rot) % 360 + '°'; $('se-turn-num').value = fmt(r2(rot) % 360);
      const rotOpen = pillView === 'rot';
      $('se-turn').hidden = $('se-turn-val').hidden = !rotOpen || turnTyping; $('se-turn-type').hidden = !rotOpen || !turnTyping;
      $('se-turn-mode').setAttribute('aria-pressed', rotOpen);
      $('se-pos-mode').setAttribute('aria-pressed', !rotOpen);
      $('se-pos-fields').hidden = rotOpen;
      if (!rotOpen) { const c = selPivot(); $('se-px').value = fmt(c.x); $('se-py').value = fmt(c.y); }
    }
    if (at) {
      $('se-x').value = fmt(at.x); $('se-y').value = fmt(at.y);
      $('se-point-pill').setAttribute('aria-label', moving ? (pickedCorner < 4 ? 'Corner' : 'Side') : (selSet.size > 1 ? `${selSet.size} points` : `Point ${sel + 1}`));
      // A side handle only has the one coordinate it stretches.
      $('se-x').parentElement.hidden = moving && pickedCorner >= 4 && sideAxis(pickedCorner) !== 'x';
      $('se-y').parentElement.hidden = moving && pickedCorner >= 4 && sideAxis(pickedCorner) !== 'y';
      $('se-remove').hidden = moving;
      $('se-remove').disabled = moving || pts.length - selSet.size < 3;
    }
    $('se-fixed-note').hidden = editable;
    if (editable) {
      // The corners the sliders set: the selected ones, or all. Values they don't share read "mixed", with the
      // slider at the first one's; moving it gives them all that value.
      const group = sel >= 0 ? selList() : pts.map((_, i) => i), cur = pts[group[0]];
      const same = (k) => group.every((i) => Math.abs(pts[i][k] - cur[k]) < 0.005);
      $('se-corner-legend').textContent = sel < 0 ? 'All corners' : group.length > 1 ? `${group.length} corners` : `Corner ${sel + 1}`;
      // The slider ends where the shape stops changing: two corners sharing an edge split it, so with every
      // corner the same size each one saturates at half its shorter edge; a lone corner can take more.
      const reach = (i) => Math.min(dist(pts[i], pts[(i + pts.length - 1) % pts.length]), dist(pts[i], pts[(i + 1) % pts.length]));
      const maxSize = sel < 0 ? Math.max(...pts.map((_, i) => reach(i) / 2)) : Math.max(...group.map(reach));
      $('se-size').max = Math.max(0.1, Math.ceil(maxSize * 10) / 10); // set before value, which the browser clamps to it
      // A typed size past the slider's end shows as it is, in red: the rounding already stopped growing there.
      const over = same('r') && cur.r > +$('se-size').max + 0.005;
      $('se-size').value = cur.r; $('se-size-v').textContent = same('r') ? fmt(cur.r) : 'mixed';
      $('se-size-v').classList.toggle('se-over', over);
      $('se-size-v').title = over ? `More than the slider reaches: past ${fmt(+$('se-size').max)} the rounding doesn't grow any more` : '';
      const max = +$('se-size').max, zone = group.length === 1 && sel >= 0 ? squeezeStart(sel, max) : max, hasZone = zone < max - 0.05;
      $('se-size-track').classList.toggle('has-zone', hasZone);
      $('se-size-track').style.setProperty('--squeeze', zone / max);
      // Only the text changes while the slider is dragged (the zone depends on the neighbours, not on this
      // corner's size): showing or hiding an element under the thumb makes Chrome drop the drag.
      const warn = $('se-size-warn');
      warn.style.visibility = hasZone ? '' : 'hidden'; // keeps its room: the Smoothing slider below must not jump around
      warn.classList.toggle('active', squeezed.size > 0);
      warn.textContent = squeezed.size ? 'Shrinking the highlighted neighbouring corners'
        : typedValues() ? `Above ${fmt(zone)} it also shrinks the neighbouring corners` : 'Past the red mark it also shrinks the neighbouring corners';
      $('se-smooth').value = Math.round(cur.s * 100); $('se-smooth-v').textContent = same('s') ? Math.round(cur.s * 100) + '%' : 'mixed';
      // The same as number fields (empty, with "mixed" as placeholder, when they differ); left alone while typed in.
      const num = (id, v) => { if (document.activeElement !== $(id)) $(id).value = v; };
      num('se-size-n', same('r') ? fmt(cur.r) : ''); num('se-smooth-n', same('s') ? Math.round(cur.s * 100) : '');
      $('se-apply-all').disabled = sel < 0;
    }
    $('se-undo').disabled = undo.length === 0;
    $('se-redo').disabled = redo.length === 0;

    // output
    $('se-out').value = out.d;
    document.querySelectorAll('.se-preview path').forEach((p) => p.setAttribute('d', out.d));
    $('se-warn').hidden = !bad;
    $('se-warn').textContent = out.error || (crossed < 0 ? '' : (shapes.length > 1 ? shapeName(shapes[crossed], crossed) + ': e' : 'E')
      + "dges cross each other. The launcher needs a shape that doesn't overlap itself.");
    const note = [importNote, out.note].filter(Boolean).join(' ');
    $('se-note').hidden = !note;
    $('se-note').textContent = note;
    $('se-use').classList.toggle('se-disabled', bad);
    refreshLinks(out.d, bad);
    $('se-share-import').disabled = bad;
    try { localStorage.setItem(STORE, JSON.stringify(snapshot())); } catch (e) { /* private mode */ }
  }

  // ---------- shape cards ----------

  const icon = (cp) => `<span class="material-symbols-outlined" aria-hidden="true">&#x${cp};</span>`;
  let cardsKey = '';
  function renderCards() {
    const key = JSON.stringify([shapes, active, mode, [...multi], whole, wholeOn]);
    if (key === cardsKey) return;
    cardsKey = key;
    const cards = $('se-cards'), focus = document.activeElement?.closest?.('#se-cards [data-act]');
    const refocus = focus && focus.dataset.act + ':' + focus.dataset.card;
    const many = multi.size > 1;
    // First, always: the Global card, the whole icon as its transform draws it, with a button putting it back as it was.
    const wholeCard = `<div class="se-card se-card-whole${wholeOn ? ' active' : ''}" role="listitem">
        <button type="button" class="se-card-pick" data-act="whole" data-card="-1" aria-pressed="${wholeOn}" aria-label="Select Global: the whole icon shape at once">
          <svg viewBox="-10 -10 120 120" aria-hidden="true"><rect class="se-card-box" x="0" y="0" width="100" height="100"/>
            <path d="${wholeMap(iconPath().d)}"/></svg>
          <span>Global</span>
        </button>
        <button type="button" class="se-card-del se-card-save" data-act="save" data-card="-1" title="Save the whole shape to Custom" aria-label="Save the whole shape">${icon('e161')}</button>
        ${whole ? `<button type="button" class="se-card-del" data-act="reset-whole" data-card="-1" title="Reset Global (undo can bring it back)" aria-label="Reset Global">${icon('e889')}</button>` : ''}
      </div>`;
    cards.innerHTML = wholeCard + shapes.map((sh, i) => {
      const on = !wholeOn && (many ? multi.has(i) : i === active), name = shapeName(sh, i);
      return `<div class="se-card${on ? ' active' : ''}" role="listitem">
        <button type="button" class="se-card-pick" data-act="pick" data-card="${i}" aria-pressed="${on}" aria-label="Select ${name}">
          <svg viewBox="-10 -10 120 120" aria-hidden="true"><rect class="se-card-box" x="0" y="0" width="100" height="100"/>
            ${copies(sh).map((d, c) => `<path class="${c ? 'copy' : ''}" d="${d}"/>`).join('')}</svg>
          <span>${name}</span>
        </button>
        <button type="button" class="se-card-del se-card-save" data-act="save" data-card="${i}" title="Save ${name} to Custom" aria-label="Save ${name}">${icon('e161')}</button>
        ${shapes.length > 1 ? `<button type="button" class="se-card-del" data-act="del" data-card="${i}" title="Delete ${name} (undo can bring it back)" aria-label="Delete ${name}">${icon('e92e')}</button>` : ''}
        ${on && !many ? `<div class="se-card-modes" role="group" aria-label="Mode">
          <button type="button" data-act="edit" data-card="${i}" aria-pressed="${mode === 'edit'}" title="Edit points" ${sh.pts ? '' : 'disabled'}>${icon('f097')}</button>
          <button type="button" data-act="move" data-card="${i}" aria-pressed="${mode === 'move'}" title="Move and resize">${icon('e89f')}</button>
        </div>` : ''}
      </div>`;
    }).join('') + `<button type="button" class="se-card se-card-add" data-act="add" data-card="-1" title="Add a shape" aria-label="Add a shape">${icon('e145')}</button>`;
    if (refocus) cards.querySelector(`[data-act="${refocus.split(':')[0]}"][data-card="${refocus.split(':')[1]}"]`)?.focus();
  }
  // Deleting a shape also drops the remembered groups it was in (sync() does that, by id).
  function deleteShapes(list) {
    // No confirmation: undo brings them back.
    checkpoint();
    for (const i of [...list].sort((a, b) => b - a)) shapes.splice(i, 1);
    active = Math.min(...list); multi = new Set();
    selectOnly(-1); sync(); render();
  }
  const deleteShape = (i) => deleteShapes([i]);
  // Picking several cards: a long press or Ctrl/Cmd+click starts (with the selected shape, unless
  // that one is mirrored), then plain taps toggle cards until one is left. Mirrored shapes can't join:
  // the canvas shakes instead.
  function toggleMulti(i) {
    wholeOn = false;
    if (multi.size < 2) {
      if (i === active) return;
      if (shapes[i].mirror !== 'none') return shake();
      if (shapes[active].mirror !== 'none') active = i; // starts from the pressed shape instead
      else multi = new Set([active, i]);
    } else if (multi.has(i)) {
      multi.delete(i);
      if (multi.size < 2) { active = [...multi][0] ?? i; multi = new Set(); }
      else if (active === i) active = Math.min(...multi);
    } else {
      if (shapes[i].mirror !== 'none') return shake();
      multi.add(i);
    }
    selectOnly(-1); pickedCorner = -1; sync(); render();
  }
  let cardPress = null, cardLong = false;
  $('se-cards').addEventListener('pointerdown', (e) => {
    const b = e.target.closest('[data-act="pick"]');
    if (!b || e.button > 0) return;
    cardLong = false;
    cardPress = { x: e.clientX, y: e.clientY, timer: setTimeout(() => { cardLong = true; navigator.vibrate?.(15); toggleMulti(+b.dataset.card); }, 450) };
  });
  $('se-cards').addEventListener('pointermove', (e) => { if (cardPress && Math.hypot(e.clientX - cardPress.x, e.clientY - cardPress.y) > 10) { clearTimeout(cardPress.timer); cardPress = null; } });
  for (const t of ['pointerup', 'pointercancel', 'pointerleave']) $('se-cards').addEventListener(t, () => { if (cardPress) clearTimeout(cardPress.timer); cardPress = null; });
  $('se-cards').addEventListener('contextmenu', (e) => { if (e.target.closest('[data-act="pick"]')) e.preventDefault(); });
  $('se-cards').addEventListener('click', (e) => {
    const b = e.target.closest('[data-act]');
    if (!b) return;
    const i = +b.dataset.card;
    if (b.dataset.act === 'pick' && cardLong) { cardLong = false; return; } // the long press already picked it
    if (b.dataset.act === 'pick' && (multi.size > 1 || e.ctrlKey || e.metaKey)) toggleMulti(i);
    else if (b.dataset.act === 'pick') { active = i; wholeOn = false; selectOnly(-1); sync(); render(); } // keeps the mode, like a tap on the canvas
    else if (b.dataset.act === 'whole') { mode = 'move'; sync(); wholeOn = true; multi = new Set(); pickedCorner = -1; selectOnly(-1); render(); }
    else if (b.dataset.act === 'reset-whole') { checkpoint(); whole = null; render(); }
    else if (b.dataset.act === 'edit' || b.dataset.act === 'move') { mode = b.dataset.act; selectOnly(-1); sync(); render(); }
    else if (b.dataset.act === 'save') saveItem(i);
    else if (b.dataset.act === 'del') deleteShape(i); else if (b.dataset.act === 'add') { picked.clear(); renderAddGrid(); addDialog.open(); }
  });

  // ---------- canvas interaction ----------

  const toSvg = (e) => new DOMPoint(e.clientX, e.clientY).matrixTransform(svg.getScreenCTM().inverse());

  // What a press grabs, decided by distance rather than by the element under the finger: fingers land
  // well off a 6px dot, and touchstart (which stops the page scrolling) and pointerdown (which starts
  // the drag) have to agree. Edit mode grabs points and "+" marks, Move mode the selected shape's box.
  function grabAt(clientX, clientY, touch) {
    const at = toSvg({ clientX, clientY }), unitPx = svg.getBoundingClientRect().width / (view.hi - view.lo);
    const reach = Math.max(6, touch ? 28 / unitPx : 0); // 6 units ≈ the old hit circle; fingers get ≥ 28px
    let best = null, bestD = reach;
    if (mode === 'move') {
      if (!activeBox) return null;
      boxHandles(activeBox).forEach((c, i) => { const d = dist(at, c); if (d < bestD) { best = { resize: i }; bestD = d; } });
      const b = activeBox;
      return best || (at.x >= b.x && at.x <= b.x + b.width && at.y >= b.y && at.y <= b.y + b.height ? { move: true } : null);
    }
    if (!pts) return null;
    const wp = pts.map(wpt);
    wp.forEach((q, i) => {
      const next = wp[(i + 1) % wp.length], dq = dist(at, q);
      if (dq < bestD) { best = { point: i }; bestD = dq; }
      // A "+" only exists on edges longer than 10 units, and counts as a bit further than it is so a
      // point next to it still wins.
      const dm = dist(at, lerp(q, next, 0.5)) * 1.3;
      if (dist(q, next) > 10 && dm < bestD) { best = { add: i }; bestD = dm; }
    });
    return best;
  }
  // The shape under the point: the selected one first (it's drawn on top while selected), then the others
  // from the top of the stack down. -1 for empty space. Mirrored copies count as their shape.
  function shapeAt(e) {
    const p = toSvg(e), m = $('se-measure-path'), hit = (i) => copies(shapes[i]).some((d) => {
      m.setAttribute('d', d);
      return m.isPointInFill(new DOMPoint(p.x, p.y));
    });
    if (hit(active)) return active;
    for (let i = shapes.length - 1; i >= 0; i--) if (i !== active && hit(i)) return i;
    return -1;
  }

  // Touch: anywhere but something grabbable, the page scrolls and pinch-zooms as usual.
  let tap = null;
  svg.addEventListener('touchstart', (e) => {
    const t = e.touches[0];
    if (e.touches.length === 1 && grabAt(t.clientX, t.clientY, true)) e.preventDefault();
  }, { passive: false });
  // A tap (not a scroll, which ends in pointercancel instead of click) selects the shape under it, or
  // deselects the point when it lands on empty space.
  svg.addEventListener('click', (e) => {
    if (tap === null) return;
    if (e.ctrlKey || e.metaKey) { if (tap >= 0) toggleMulti(tap); tap = null; return; } // like on the cards
    // Outside the group's box, a tap ends picking several: back to the tapped shape, or to the selected one.
    if (multi.size > 1) { multi = new Set(); if (tap >= 0) active = tap; selectOnly(-1); sync(); tap = null; return render(); }
    if (tap >= 0 && tap !== active) { active = tap; selectOnly(-1); mode = shapes[tap].pts ? mode : 'move'; sync(); render(); }
    else if (sel >= 0 || pickedCorner >= 0) { selectOnly(-1); pickedCorner = -1; render(); }
    tap = null;
  });

  // Clicks and taps focus the canvas too; this keeps Chrome from showing its keyboard focus ring for it.
  svg.addEventListener('pointerdown', () => svg.setAttribute('data-pointer', ''), true);
  svg.addEventListener('blur', () => svg.removeAttribute('data-pointer'));
  // A long press on a shape picks it too (or drops it from the group), as on the cards; one that started
  // moving the selection takes that back first.
  // A long press is one that stays put: a mouse or pen moving past the 4px that start a drag ends it (a slow drag
  // used to stay under a fixed 10px long enough to count as one); a finger, which wobbles, gets 10px.
  let hold = null;
  const letGo = () => { if (hold) clearTimeout(hold.timer); hold = null; };
  const holdTol = (e) => (e.pointerType === 'touch' ? 10 : 4);
  svg.addEventListener('pointerdown', (e) => {
    const pick = e.ctrlKey || e.metaKey, g0 = grabAt(e.clientX, e.clientY, e.pointerType === 'touch'), g = pick ? null : g0;
    letGo();
    if (pick && mode === 'edit' && g0?.point !== undefined) { // Ctrl/Cmd+click on a corner adds or drops it
      e.preventDefault(); svg.focus({ preventScroll: true });
      tap = null; toggleCorner(g0.point); return render();
    }
    tap = g ? null : wholeOn ? -1 : shapeAt(e);
    const under = g ? (g.move ? shapeAt(e) : -1) : tap;
    if (!pick && !wholeOn && under >= 0 && (multi.size > 1 || under !== active)) {
      hold = { x: e.clientX, y: e.clientY, tol: holdTol(e), timer: setTimeout(() => {
        hold = null; tap = null;
        if (drag) { drag = null; restore(JSON.parse(undo.pop())); render(); }
        navigator.vibrate?.(15);
        toggleMulti(under);
      }, 450) };
    }
    if (!g) return;
    const redoKept = redo.slice(); // a press that changes nothing gives it back (see endDrag)
    checkpoint();
    const at = toSvg(e);
    if (g.point !== undefined || g.add !== undefined) {
      if (g.add !== undefined) {
        const a = pts[g.add], m = lerp(wpt(a), wpt(pts[(g.add + 1) % pts.length]), 0.5);
        pts.splice(g.add + 1, 0, { x: 0, y: 0, r: a.r, s: a.s });
        setPoint(g.add + 1, { x: snap(m.x), y: snap(m.y) });
        selectOnly(g.add + 1);
        drag = { kind: 'point', i: sel };
      } else {
        // A press leaves the selection as it is until it's clear what it does: a tap without moving selects just
        // this corner (see endDrag), a drag selects it once it starts moving (or, on one of several selected
        // corners, moves them all), and a long press adds or drops it.
        const i = g.point, before = { sel, set: new Set(selSet) }, keep = selSet.has(i) && selSet.size > 1;
        drag = { kind: 'point', i, from: at, start: keep ? startOf() : null, pending: !selSet.has(i) };
        hold = { x: e.clientX, y: e.clientY, tol: holdTol(e), timer: setTimeout(() => {
          hold = null; drag = null;
          restore(JSON.parse(undo.pop())); // takes back the press (and any small move it made)
          sel = before.sel; selSet = before.set;
          navigator.vibrate?.(15);
          toggleCorner(i); render();
        }, 450) };
      }
      const w = wpt(pts[drag.i]);
      Object.assign(drag, { dx: w.x - at.x, dy: w.y - at.y, px: e.clientX, py: e.clientY }); // the point keeps its distance from the finger
    } else if (g.move) {
      pickedCorner = -1; // grabbing the shape itself lets go of the handle, back to the rotation pill
      drag = { kind: 'move', from: at, base: selBase() };
    } else {
      const c = boxHandles(activeBox), anchor = c[opposite(g.resize)];
      if (g.resize < 4) drag = { kind: 'resize', anchor, d0: dist(anchor, c[g.resize]), base: selBase() };
      else {
        const axis = sideAxis(g.resize);
        drag = { kind: 'stretch', axis, at: anchor[axis], d0: c[g.resize][axis] - anchor[axis], from: at[axis], base: selBase() };
      }
      pickedCorner = g.resize; // a tap selects the handle; a drag resizes too
    }
    drag.redoKept = redoKept;
    svg.setPointerCapture(e.pointerId);
    e.preventDefault(); // this also stops the browser focusing the canvas, so do it here:
    svg.focus({ preventScroll: true }); // Delete, arrows and Esc then act on what was just grabbed
    render();
  });
  svg.addEventListener('pointermove', (e) => {
    if (hold && Math.hypot(e.clientX - hold.x, e.clientY - hold.y) > hold.tol) letGo();
    if (!drag) return;
    const p = toSvg(e);
    if (drag.kind === 'point') {
      if (Math.hypot(e.clientX - drag.px, e.clientY - drag.py) > 4) drag.moved = true;
      if (drag.pending) {
        if (!drag.moved) return;
        selectOnly(drag.i); drag.pending = false;
        // The undo step was taken at the press, before this corner got selected: undo should come back to it.
        const top = JSON.parse(undo[undo.length - 1]);
        undo[undo.length - 1] = JSON.stringify({ ...top, corners: [drag.i], sel: drag.i });
      }
      // Several move by whole grid steps from where they started, keeping their places relative to each other.
      const step = (v) => (grid.snap ? Math.round(v / grid.step) * grid.step : v);
      if (drag.start) moveCorners(step(p.x - drag.from.x), step(p.y - drag.from.y), drag.start);
      else setPoint(sel, { x: snap(p.x + drag.dx), y: snap(p.y + drag.dy) });
    } else if (drag.kind === 'stretch') {
      // The side moves by whole grid steps when snapping (like a moved shape), so dragging it back to where
      // it started gives exactly the shape it started as.
      const moved = p[drag.axis] - drag.from, k = Math.max(0.05, 1 + (grid.snap ? Math.round(moved / grid.step) * grid.step : moved) / drag.d0);
      const x = drag.axis === 'x';
      applySel(x ? [k, 0, 0, 1] : [1, 0, 0, k], x ? drag.at - k * drag.at : 0, x ? 0 : drag.at - k * drag.at, drag.base);
      sync();
    } else if (drag.kind === 'move') {
      const step = (v) => (grid.snap ? Math.round(v / grid.step) * grid.step : v);
      applySel([1, 0, 0, 1], step(p.x - drag.from.x), step(p.y - drag.from.y), drag.base);
      sync();
    } else {
      const k = Math.max(0.05, dist(drag.anchor, p) / drag.d0), a = drag.anchor;
      applySel([k, 0, 0, k], a.x - k * a.x, a.y - k * a.y, drag.base);
      sync();
    }
    render();
  });
  const endDrag = () => {
    if (!drag) return;
    if (drag.kind === 'point' && (drag.start || drag.pending) && !drag.moved) selectOnly(drag.i); // a tap: just this corner
    // A press that changed nothing (a tap, or a drag back to where it started) leaves no undo step behind.
    const top = undo.length && JSON.parse(undo[undo.length - 1]); // the shapes and the Global transform (see snapshot)
    if (top && JSON.stringify([top.shapes, top.whole ?? null]) === JSON.stringify([shapes, whole])) {
      undo.pop(); redo.push(...drag.redoKept);
    }
    drag = null; render();
  };
  for (const t of ['pointerup', 'pointercancel']) svg.addEventListener(t, () => { letGo(); endDrag(); });
  svg.addEventListener('contextmenu', (e) => { if (shapeAt(e) >= 0 || grabAt(e.clientX, e.clientY, true)) e.preventDefault(); });
  svg.addEventListener('focusin', (e) => {
    const h = e.target.closest('[data-i]');
    if (h && +h.dataset.i !== sel) { selectOnly(+h.dataset.i); render(); }
  });

  // A shape can't go below 3 points: shake the canvas rather than silently ignore the key.
  const shake = () => {
    const stage = svg.parentElement;
    stage.classList.remove('se-shake');
    void stage.offsetWidth; // restarts the animation when pressed again mid-shake
    stage.classList.add('se-shake');
  };
  document.addEventListener('keydown', (e) => {
    const key = e.key.toLowerCase();
    if ((e.ctrlKey || e.metaKey) && !e.altKey && (key === 'z' || key === 'y')) {
      if (e.target.matches('input:not([type=range]):not([type=checkbox]), textarea, select')) return; // a text field keeps its own undo
      e.preventDefault();
      return (key === 'y' || e.shiftKey ? $('se-redo') : $('se-undo')).click(); // Ctrl+Y, or Ctrl/Cmd+Shift+Z
    }
    // Delete, Backspace and Esc act on the selected point wherever the focus is (say, on its Size slider),
    // unless you're typing in a field or a dialog is open. Arrows still need the canvas focused, so elsewhere
    // they keep moving sliders and scrolling the page.
    const typing = e.target.matches('input:not([type=range]):not([type=checkbox]), textarea, select');
    const del = e.key === 'Delete' || e.key === 'Backspace';
    // In Move mode with no handle selected, Delete asks to delete the selected shape (like its card's bin).
    const shapeKey = mode === 'move' && pickedCorner < 0 && del && !wholeOn;
    const pointKey = (sel >= 0 && mode === 'edit' && (del || e.key === 'Escape') || (pickedCorner >= 0 || multi.size > 1 || wholeOn) && e.key === 'Escape' || shapeKey)
      && !typing && !e.target.closest('.contact-modal-overlay');
    if (!pointKey && !svg.contains(document.activeElement)) return;
    const step = grid.snap ? grid.step : e.shiftKey ? 5 : 0.5;
    const mv = { ArrowLeft: [-1, 0], ArrowRight: [1, 0], ArrowUp: [0, -1], ArrowDown: [0, 1] }[e.key];
    if (mode === 'move') { // arrows move the whole shape, Esc deselects the corner, Delete deletes the shape
      if (e.key === 'Escape') { // the handle first, then the picked group
        if (pickedCorner >= 0) pickedCorner = -1; else { multi = new Set(); wholeOn = false; sync(); }
        e.preventDefault(); return render();
      }
      if (shapeKey) { e.preventDefault(); return shapes.length > selIdx().length ? deleteShapes(selIdx()) : shake(); }
      if (!mv) return;
      checkpoint();
      pickedCorner = -1;
      applySel([1, 0, 0, 1], mv[0] * step, mv[1] * step);
      sync();
    } else if (sel < 0) return;
    else if (mv) {
      checkpoint();
      if (selSet.size > 1) moveCorners(mv[0] * step, mv[1] * step); // several keep their places relative to each other
      else { const w = wpt(pts[sel]); setPoint(sel, { x: snap(w.x + mv[0] * step), y: snap(w.y + mv[1] * step) }); }
    } else if (e.key === 'Delete' || e.key === 'Backspace') {
      if (pts.length - selSet.size < 3) return shake();
      checkpoint();
      const first = selList()[0];
      removeCorners();
      selectOnly(Math.min(first, pts.length - 1));
    } else if (e.key === 'Escape') {
      selectOnly(-1);
    } else return;
    e.preventDefault();
    render();
  });

  // Move mode's buttons on the canvas: fit this shape, and mirroring.
  $('se-fit-shape').onclick = () => { checkpoint(); setSelShapes(fitted(selShapes())); sync(); render(); };
  // The shape's own outline (not its mirrored copies) into the top-left quarter, centred there: an ear
  // mirrored left/right or both ways then fills the other quarters.
  $('se-fit-quarter').onclick = () => {
    const bb = measure(selShapes().map(shapePath).join(' ')), k = 50 / Math.max(bb.width, bb.height, 0.01);
    checkpoint();
    applySel([k, 0, 0, k], 25 - k * (bb.x + bb.width / 2), 25 - k * (bb.y + bb.height / 2));
    sync(); render();
  };
  // Moves the shape's pivot to the canvas centre. A mirrored axis uses the middle of the half the
  // shape is in instead (25 or 75), so the shape and its copy stay balanced on each side.
  // Flip: turns the selection over left to right, across the vertical line x = c through the pivot (not the
  // mirror buttons, which add mirrored copies). Applied to the shapes themselves, with nothing remembering it,
  // and exact: flipping again across the same line gives the same numbers back. A shape's corners (or outline)
  // flip, its stretch flips into its mirror image around the flipped centre, and its angle turns the other way.
  // An outline gets its path text flipped (x -> 100 - x, exact at 2 decimals), so a built-in one becomes an
  // imported path. Mirrored copies just follow the flipped shape.
  const flipSt = (st, c) => [st[0], -st[1], st[2], r6(2 * c - st[3]), st[4]];
  function flipped(sh, c) {
    const out = { ...sh, ...(sh.rot && { rot: wrap(-sh.rot) }), ...(sh.st && { st: flipSt(sh.st, c) }) };
    if (sh.pts) return { ...out, pts: sh.pts.map((q) => ({ ...q, x: r6(2 * c - q.x) })) };
    // The outline turns around its centre f, drawn at o; flipped, it turns the other way around the flipped
    // centre, drawn at o flipped.
    const f = outlineC(sh), ox = f.x * sh.a + sh.x, oy = f.y * sh.a + sh.y;
    const path = mapPath(outline(sh), (x, y) => ({ x: 100 - x, y })), f2 = outlineC({ path }), { fixed, ...rest } = out;
    return { ...rest, path, ang: r6(wrap(-(sh.ang || 0))), x: r6(2 * c - ox - f2.x * sh.a), y: r6(oy - f2.y * sh.a) };
  }
  $('se-flip').onclick = () => {
    checkpoint();
    const c = Math.round(selPivot().x * 1000) / 1000; // rounded, so the flipped selection gives the same line back
    if (wholeOn) { // turned over in its own box (flip), then mirrored around c like an outline whose centre is (50, 50)
      const w = wholeShape();
      setWhole({ ...w, flip: !w.flip, ang: r6(wrap(-w.ang)), ...(w.rot && { rot: wrap(-w.rot) }), ...(w.st && { st: flipSt(w.st, c) }),
        x: r6(2 * c - (50 * w.a + w.x) - 50 * w.a) });
    } else selIdx().forEach((i) => (shapes[i] = flipped(shapes[i], c)));
    const g = groupRec(false);
    if (g) { if (g.st) g.st = flipSt(g.st, c); g.rot = wrap(-g.rot); }
    if (pivotMode === 'corner') pivotCorner = [1, 0, 3, 2][pivotCorner]; // the corner flips sides with the shape
    sync(); render();
  };
  $('se-center').onclick = () => {
    const sh = selState().whole ? wholeShape() : shapes[active], c = selPivot(); // a group (or the whole icon) has no mirroring
    if (!Number.isFinite(c.x + c.y)) return;
    const h = sh.mirror === 'h' || sh.mirror === 'both', v = sh.mirror === 'v' || sh.mirror === 'both';
    const tx = h ? (c.x <= 50 ? 25 : 75) : 50, ty = v ? (c.y <= 50 ? 25 : 75) : 50;
    checkpoint();
    applySel([1, 0, 0, 1], tx - c.x, ty - c.y);
    sync(); render();
  };
  // Shrinks the shape along the long side of its stretch until there's none left, around the pivot.
  $('se-unstretch').onclick = () => {
    const info = stretchInfo(selState()); // a group's own remembered stretch, or the shape's
    if (!info) return;
    const c = selPivot(), f = 1 / info.ratio - 1, { ux, uy } = info;
    const A = [1 + f * ux * ux, f * ux * uy, f * ux * uy, 1 + f * uy * uy];
    checkpoint();
    applySel(A, c.x - A[0] * c.x - A[1] * c.y, c.y - A[2] * c.x - A[3] * c.y);
    // A shape unstretched on its own also ends the stretch its groups remember.
    if (multi.size < 2 && !wholeOn) for (const g of groups) if (g.ids.includes(shapes[active].id)) delete g.st;
    sync(); render();
  };
  $('se-mirror').addEventListener('click', (e) => {
    const p = e.target.closest('[data-pivot]'), c = e.target.closest('[data-corner]');
    // The corner mode opens a small picker of the four corners above it (and again when tapped again).
    if (c) { pivotCorner = +c.dataset.corner; $('se-corner-pick').hidden = true; render(); }
    else if (p) {
      $('se-corner-pick').hidden = p.dataset.pivot !== 'corner' || (pivotMode === 'corner' && !$('se-corner-pick').hidden);
      pivotMode = p.dataset.pivot; render();
    }
  });
  document.addEventListener('pointerdown', (e) => { if (!e.target.closest('.se-corner-wrap')) $('se-corner-pick').hidden = true; });
  // "Hide tools" above the editor: the canvas without anything floating over it. Remembered on this browser.
  const TOOLS = 'murine-shape-editor-bare';
  const bare = (on) => {
    document.querySelector('.se-stage').classList.toggle('se-bare', on);
    $('se-tools-toggle').setAttribute('aria-pressed', on);
    $('se-tools-toggle').textContent = on ? 'Show tools' : 'Hide tools';
    try { if (on) localStorage.setItem(TOOLS, '1'); else localStorage.removeItem(TOOLS); } catch (e) { /* private mode */ }
  };
  $('se-tools-toggle').onclick = () => bare(!document.querySelector('.se-stage').classList.contains('se-bare'));
  try { if (localStorage.getItem(TOOLS)) bare(true); } catch (e) { /* private mode */ }
  // The help bubble: the button toggles it; a press anywhere else or Esc closes it.
  const showHelp = (on) => { $('se-help').hidden = !on; $('se-help-btn').setAttribute('aria-expanded', on); };
  $('se-help-btn').onclick = () => showHelp($('se-help').hidden);
  document.addEventListener('pointerdown', (e) => { if (!e.target.closest('#se-help, #se-help-btn')) showHelp(false); });
  document.addEventListener('keydown', (e) => { if (e.key === 'Escape' && !$('se-help').hidden) showHelp(false); });
  $('se-mirror').addEventListener('click', (e) => {
    const b = e.target.closest('[data-mirror]');
    if (!b || b.dataset.mirror === shapes[active].mirror) return;
    checkpoint();
    shapes[active] = { ...shapes[active], mirror: b.dataset.mirror };
    sync(); render();
  });

  // ---------- panel ----------

  const corner = (key, v) => {
    if (!sliding) { checkpoint(); sliding = true; }
    (sel >= 0 ? selList().map((i) => pts[i]) : pts).forEach((p) => (p[key] = v));
    render();
  };
  // The legend's toggle shows the two values as number fields instead of sliders. Remembered on this browser.
  const TYPED = 'murine-shape-editor-typed';
  const typedValues = () => $('se-corner-set').classList.contains('se-typed');
  const typed = (on) => {
    $('se-corner-set').classList.toggle('se-typed', on);
    const t = on ? 'Use sliders instead' : 'Type the values instead';
    $('se-corner-type').setAttribute('aria-pressed', on); $('se-corner-type').title = t; $('se-corner-type').setAttribute('aria-label', t);
    try { if (on) localStorage.setItem(TYPED, '1'); else localStorage.removeItem(TYPED); } catch (e) { /* private mode */ }
  };
  $('se-corner-type').onclick = () => { typed(!typedValues()); render(); };
  try { if (localStorage.getItem(TYPED)) typed(true); } catch (e) { /* private mode */ }
  // A typed value: one undo step, for the selected corners or all of them; anything not a number puts the value back.
  const typedCorner = (key, field, max, scale) => field.addEventListener('change', () => {
    const v = clamp(+field.value, 0, max);
    if (field.value === '' || !Number.isFinite(v)) { field.blur(); render(); return field.focus(); } // blurred, render refills it
    checkpoint();
    (sel >= 0 ? selList().map((i) => pts[i]) : pts).forEach((p) => (p[key] = v / scale));
    field.value = key === 'r' ? fmt(v) : Math.round(v);
    render();
  });
  typedCorner('r', $('se-size-n'), 500, 1);
  typedCorner('s', $('se-smooth-n'), 100, 100);
  $('se-size').addEventListener('input', (e) => corner('r', +e.target.value));
  $('se-smooth').addEventListener('input', (e) => corner('s', e.target.value / 100));
  ['se-size', 'se-smooth'].forEach((id) => $(id).addEventListener('change', () => (sliding = false)));

  $('se-apply-all').onclick = () => {
    checkpoint();
    const { r, s } = pts[sel];
    pts.forEach((p) => Object.assign(p, { r, s }));
    render();
  };
  ['x', 'y'].forEach((k) =>
    $('se-' + k).addEventListener('change', (e) => {
      const v = clamp(+e.target.value, view.lo, view.hi);
      if (e.target.value === '' || !Number.isFinite(v)) return render(); // puts the current value back
      if (mode === 'move' && pickedCorner >= 0 && activeBox) {
        // A corner moves with the opposite one fixed and the proportions kept, so the other coordinate follows;
        // a side moves with the opposite side fixed, stretching the shape.
        const c = boxHandles(activeBox), a = c[opposite(pickedCorner)], k0 = (v - a[k]) / (c[pickedCorner][k] - a[k]);
        if (!(k0 > 0.05)) return render(); // not past the opposite corner, nor down to nothing
        checkpoint();
        if (pickedCorner < 4) applySel([k0, 0, 0, k0], a.x - k0 * a.x, a.y - k0 * a.y);
        else applySel(k === 'x' ? [k0, 0, 0, 1] : [1, 0, 0, k0], k === 'x' ? a.x - k0 * a.x : 0, k === 'x' ? 0 : a.y - k0 * a.y);
        sync();
      } else if (pts && sel >= 0) {
        checkpoint();
        if (selSet.size > 1) { const c = selCentre(); moveCorners(k === 'x' ? v - c.x : 0, k === 'y' ? v - c.y : 0); }
        else setPoint(sel, { ...wpt(pts[sel]), [k]: v });
      } else return;
      render();
    })
  );
  // Rotation slider: one undo step per drag, and every value is turned from the shape as it was when the
  // drag started, so the points don't pick up rounding from hundreds of small turns.
  let turnFrom = null, turned = null, turnPivot = null;
  // Turning around the middle of the box: that middle moves as the shape turns, so a faded mark stays on
  // the point the turn pivots around, and fades out shortly after the turn.
  let ghostTimer = 0;
  const ghost = (c) => {
    clearTimeout(ghostTimer);
    if (pivotMode === 'mass') return;
    $('se-pivot-ghost').setAttribute('transform', `translate(${c.x} ${c.y})`);
    $('se-pivot-ghost').classList.remove('off');
  };
  const ghostOff = () => { clearTimeout(ghostTimer); ghostTimer = setTimeout(() => $('se-pivot-ghost').classList.add('off'), 800); };
  // A drag ends on change or blur, but some browsers (old Android ones) don't always send either after a touch
  // drag. So a drag also ends on pointer/touch release, and is restarted whenever the shape is no longer the one
  // this drag produced (it was moved, edited, undone, or another shape was picked); and the ghost fades a moment
  // after the last movement whatever happens.
  $('se-turn').addEventListener('input', (e) => {
    const now = () => (wholeOn ? whole : shapes[selIdx()[0]]);
    if (!turnFrom || now() !== turned) { checkpoint(); turnFrom = selBase(); turnPivot = pivotOf(turnFrom.shapes); }
    turnSel(+e.target.value - (turnFrom.group.rot || 0), turnPivot, turnFrom);
    turned = now();
    ghost(turnPivot); ghostOff();
    sync(); render();
  });
  const endTurn = () => { turnFrom = null; ghostOff(); };
  for (const t of ['change', 'blur', 'pointerup', 'pointercancel', 'touchend', 'touchcancel', 'keyup']) $('se-turn').addEventListener(t, endTurn);
  // The icon switches between the slider and typing the angle; any typed angle is wrapped into 0-359.
  // The rotation icon opens the rotation half of the pill; tapped again, it switches slider and typing.
  $('se-turn-mode').onclick = () => {
    if (pillView !== 'rot') pillView = 'rot'; else turnTyping = !turnTyping;
    render();
    if (turnTyping) $('se-turn-num').select();
  };
  $('se-pos-mode').onclick = () => { pillView = 'pos'; render(); };
  // Typing a position moves the shape so its centre point (as picked in the bottom pill) lands there.
  ['x', 'y'].forEach((k) => $('se-p' + k).addEventListener('change', (e) => {
    const v = clamp(+e.target.value, view.lo, view.hi), sh = shapes[active];
    if (e.target.value === '' || !Number.isFinite(v)) return render(); // puts the current value back
    const d = v - selPivot()[k];
    if (Math.abs(d) < 1e-9) return render();
    checkpoint();
    applySel([1, 0, 0, 1], k === 'x' ? d : 0, k === 'y' ? d : 0);
    sync(); render();
  }));
  $('se-turn-num').addEventListener('change', (e) => {
    const v = +e.target.value;
    if (e.target.value === '' || !Number.isFinite(v)) return render(); // puts the current value back
    const deg = ((v - (selState().rot || 0)) % 360 + 360) % 360;
    if (deg < 0.005 || deg > 359.995) return render();
    checkpoint();
    const c = selPivot();
    ghost(c);
    ghostOff();
    turnSel(deg, c);
    sync(); render();
  });
  // Greyed out at 3 points; should it get clicked anyway (re-enabled from the dev tools, say), it shakes like Delete.
  $('se-remove').onclick = () => {
    if (!pts || sel < 0) return;
    if (pts.length - selSet.size < 3) return shake();
    checkpoint(); removeCorners(); selectOnly(-1); render();
  };
  $('se-fit').onclick = () => { checkpoint(); shapes = fitted(shapes); sync(); render(); };
  // Undo and redo each move the current state onto the other stack.
  const travel = (from, to) => {
    if (!from.length) return;
    const now = undoState();
    if (restore(JSON.parse(from.pop()))) { to.push(now); render(); }
  };
  $('se-undo').onclick = () => travel(undo, redo);
  $('se-redo').onclick = () => travel(redo, undo);
  $('se-reset').onclick = () => {
    if (confirm('Start over from the default squircle? Undo can still bring this icon back.')) loadIcon(presetShapes('Squircle'));
  };
  $('se-gen').onclick = () => {
    const n = clamp(+$('se-sides').value || 6, 3, 24), inner = clamp(+$('se-inner').value || 100, 10, 100) / 100;
    const num = (id, max) => clamp(+$(id).value || 0, 0, max); // empty or junk input counts as 0
    const pts = fit(polygon(n, inner, +$('se-rot').value || 0, num('se-gen-r', 50), num('se-gen-ir', 50), num('se-gen-s', 100) / 100));
    replaceShape({ pts, mirror: 'none' }); // a fresh full-size shape: no leftover mirroring either
  };

  $('se-show-grid').onchange = (e) => { grid.show = e.target.checked; drawGrid(); };
  $('se-snap').onchange = (e) => (grid.snap = e.target.checked);
  $('se-step').onchange = (e) => { grid.step = +e.target.value; drawGrid(); };

  // ---------- dialogs (same markup and styles as the site's contact dialog) ----------

  function dialog(id, onClose) {
    const box = $(id);
    document.body.append(box); // out of <main>, so it covers the nav bar like the contact dialog does
    let opener = null;
    const d = {
      open() {
        opener = document.activeElement;
        box.setAttribute('aria-hidden', 'false');
        document.body.style.overflow = 'hidden';
        box.querySelector('button:not(:disabled):not([hidden]):not([data-close])')?.focus();
      },
      close() {
        onClose?.();
        box.setAttribute('aria-hidden', 'true');
        document.body.style.overflow = '';
        opener?.focus();
      },
    };
    box.addEventListener('click', (e) => { if (e.target === box || e.target.closest('[data-close]')) d.close(); });
    box.addEventListener('keydown', (e) => { if (e.key === 'Escape') { e.stopPropagation(); d.close(); } });
    return d;
  }
  // Easter egg: typing "devmode" while Share is open shows a row that copies the icon as data. The key listener
  // only exists while the dialog is open. Matching is KMP: on a wrong key, devAt falls back to the longest part of
  // the word that's still typed (devFail), so "devmdevmode" works, at O(1) amortised per key.
  const DEV = [68, 69, 86, 77, 79, 68, 69]; // keyCodes of d e v m o d e
  const devFail = DEV.map(() => 0);
  for (let i = 1, k = 0; i < DEV.length; i++) {
    while (k && DEV[i] !== DEV[k]) k = devFail[k - 1];
    if (DEV[i] === DEV[k]) k++;
    devFail[i] = k;
  }
  let devAt = 0;
  const devKeys = (e) => {
    if (e.repeat) return;
    while (devAt && e.keyCode !== DEV[devAt]) devAt = devFail[devAt - 1];
    if (e.keyCode === DEV[devAt]) devAt++;
    if (devAt === DEV.length) { devAt = 0; $('se-dev').hidden = false; }
  };
  const shareDialog = dialog('se-share', () => document.removeEventListener('keydown', devKeys)), addDialog = dialog('se-add');
  $('se-share-open').onclick = () => { devAt = 0; document.addEventListener('keydown', devKeys); shareDialog.open(); };

  // What the devmode row copies: the icon's shapes in the editor's format (what edit links and `icon:` presets
  // hold), rounded the way presets want them (corners 2 decimals, stretches 4) and without the editor's ids.
  const rd = (v, d) => +(+v).toFixed(d);
  const iconData = () => ({ shapes: shapes.map(({ id, ...sh }) => ({
    ...sh,
    ...(sh.pts && { pts: sh.pts.map((q) => ({ x: rd(q.x, 2), y: rd(q.y, 2), r: rd(q.r, 2), s: rd(q.s, 2) })) }),
    ...(sh.a !== undefined && { a: rd(sh.a, 4), x: rd(sh.x, 2), y: rd(sh.y, 2), ang: rd(sh.ang, 2) }),
    ...(sh.st && { st: sh.st.map((v) => rd(v, 4)) }),
    rot: rd(sh.rot || 0, 2),
  })), ...(whole && { whole: wholeData() }) });
  // The whole-icon transform, rounded the same way (flip only when it's on).
  const wholeData = () => ({ a: rd(whole.a, 4), x: rd(whole.x, 3), y: rd(whole.y, 3), ang: rd(whole.ang, 2),
    ...(whole.flip && { flip: true }), ...(whole.st && { st: whole.st.map((v) => rd(v, 4)) }), rot: rd(whole.rot || 0, 2) });
  // YAML, block style, with anything holding only plain values (a corner, a stretch) on one line in flow style.
  const plain = (v) => v === null || typeof v !== 'object';
  const yScalar = (v) => (typeof v !== 'string' ? String(v)
    : /^[a-z]+$/i.test(v) && !/^(yes|no|on|off|true|false|null|y|n)$/i.test(v) ? v : JSON.stringify(v));
  const yFlow = (v) => (Array.isArray(v) ? `[${v.map(yScalar).join(', ')}]` : `{${Object.entries(v).map(([k, x]) => `${k}: ${yScalar(x)}`).join(', ')}}`);
  const yaml = (v, pad) => {
    if (plain(v)) return ' ' + yScalar(v);
    if (Object.values(v).every(plain)) return ' ' + yFlow(v);
    if (Array.isArray(v)) return v.map((x) => `\n${pad}-` + yaml(x, pad + '  ').replace(/^\n\s*/, ' ')).join('');
    return Object.entries(v).map(([k, x]) => `\n${pad}${k}:` + yaml(x, pad + '  ')).join('');
  };
  const json = (v) => JSON.stringify(v).replace(/":|,(?=["\d-])/g, (m) => m + ' '); // paths hold neither : nor ,
  const PRESET = '  - name: My shape\n    icon:';
  // The YAML button: the readable form the other entries use (pts or path per shape, with `at` and `angle` for a
  // stretch or turn, `fit: false` only if the icon doesn't already fill the box the way presets get fitted), or
  // the `icon:` form, which holds anything, for the one case the readable form can't: an outline stretched along
  // other directions than its own turn.
  // A shape in the readable form, the reverse of presetItem: its stretch st (symmetric) is a stretch d1 x d2 along
  // axes turned by phi, so the shape is the same corners or outline turned back by phi, stretched onto the
  // rectangle `at`, then turned by `angle` = phi. at is left out when it's the box itself. null if only `icon:`
  // can hold the shape.
  function readable(sh) {
    const [sxx = 1, sxy = 0, syy = 1, cx = 50, cy = 50] = sh.st || [];
    // Corners can be turned back freely, so phi is the stretch's own direction (0 along the axes); an outline's
    // path is fixed, so phi has to be its angle, and its stretch has to run along that.
    const phi = sh.pts ? (Math.abs(sxy) < 1e-9 ? 0 : (Math.atan((2 * sxy) / (sxx - syy)) / 2) * 180 / Math.PI) : sh.ang || 0;
    const t = phi * Math.PI / 180, co = Math.cos(t), si = Math.sin(t);
    const d1 = sxx * co * co + 2 * sxy * si * co + syy * si * si, d2 = sxx * si * si - 2 * sxy * si * co + syy * co * co;
    if (Math.abs((syy - sxx) * si * co + sxy * (co * co - si * si)) > 1e-6) return null;
    const turn = (x, y) => [co * x - si * y, si * x + co * y];
    // Where the 0-100 box's centre lands: the rectangle's centre. For corners (drawn at scale 1, unturned around
    // the stretch's centre), c + R D (50 - c); for an outline (scale a, turned around its own centre f at o),
    // c + S (o - c) + R D a (50 - f).
    let g = 1, mx, my, item;
    if (sh.pts) {
      const [ux, uy] = turn(d1 * (50 - cx), d2 * (50 - cy));
      [mx, my] = [cx + ux, cy + uy];
      item = { pts: sh.pts.map((q) => { const dx = q.x - cx, dy = q.y - cy;
        return { x: cx + co * dx + si * dy, y: cy - si * dx + co * dy, r: q.r, s: q.s }; }) };
    } else {
      g = sh.a;
      const f = outlineC(sh), ox = f.x * g + sh.x - cx, oy = f.y * g + sh.y - cy, [ux, uy] = turn(d1 * g * (50 - f.x), d2 * g * (50 - f.y));
      [mx, my] = [cx + sxx * ox + sxy * oy + ux, cy + sxy * ox + syy * oy + uy];
      item = { path: sh.path ?? FIXED[sh.fixed] };
    }
    const w = 100 * g * d1, h = 100 * g * d2, at = [mx - w / 2, my - h / 2, w, h].map((v) => rd(v, 3));
    const angle = rd(((phi % 360) + 540) % 360 - 180, 2);
    return { ...item, at: at.join() === '0,0,100,100' ? null : at, angle: angle || null, mirror: sh.mirror };
  }
  function presetYaml() {
    const items = shapes.map(readable);
    if (items.includes(null)) return PRESET + yaml(iconData(), '      ') + '\n';
    // Presets get fitted to the box, except a single outline: say fit: false if that would move this icon.
    const b = measure(shapes.flatMap(copies).join(' '));
    const fits = (items.length === 1 && items[0].path) || (Math.abs(Math.max(b.width, b.height) - 100) < 0.1
      && Math.abs(b.x + b.width / 2 - 50) < 0.1 && Math.abs(b.y + b.height / 2 - 50) < 0.1);
    // One shape's lines; corners as [x, y, size, smoothing], two per line, lined up under the first.
    const lines = (it, pad) => {
      const rows = [];
      if (it.pts) for (let i = 0; i < it.pts.length; i += 2) rows.push(it.pts.slice(i, i + 2).map((q) => `[${[rd(q.x, 2), rd(q.y, 2), rd(q.r, 2), rd(q.s, 2)].join(', ')}]`).join(', '));
      return (it.pts ? `${pad}pts: [${rows.join(',\n' + ' '.repeat(pad.length + 6))}]\n` : `${pad}path: "${it.path}"\n`)
        + (it.at ? `${pad}at: [${it.at.join(', ')}]\n` : '') + (it.angle ? `${pad}angle: ${it.angle}\n` : '')
        + (it.mirror !== 'none' ? `${pad}mirror: ${it.mirror}\n` : '');
    };
    // The whole-icon transform stays its own entry, on one line: {a: 1, x: 0, ..., st: [...]}.
    const w = whole ? `    whole: {${Object.entries(wholeData()).map(([k, v]) => `${k}: ${Array.isArray(v) ? `[${v.join(', ')}]` : v}`).join(', ')}}\n` : '';
    return '  - name: My shape\n' + (fits ? '' : '    fit: false\n') + w + (items.length === 1 ? lines(items[0], '    ')
      : '    shapes:\n' + items.map((it) => '      -' + lines(it, '        ').slice(7)).join(''));
  }
  const copyText = async (text) => {
    try { await navigator.clipboard.writeText(text); } catch (e) {
      const t = Object.assign(document.createElement('textarea'), { value: text });
      document.body.append(t); t.select(); document.execCommand('copy'); t.remove();
    }
  };
  const shareTexts = {
    edit: () => links.edit, import: () => links.import, path: () => $('se-out').value,
    json: () => JSON.stringify(iconData()),
    yaml: presetYaml,
    // One shape per line group, its corners one per line, like the entries in _data/icon_shapes.yml.
    yamljson: () => `${PRESET} {"shapes": [\n` + iconData().shapes.map(({ pts, ...rest }) => (pts
      ? `      {"pts": [${pts.map(json).join(',\n               ')}],\n       ${json(rest).slice(1, -1)}}`
      : `      ${json(rest)}`)).join(',\n') + ']' + (whole ? `,\n    "whole": ${json(wholeData())}` : '') + '}\n',
  };
  $('se-share').querySelectorAll('[data-copy]').forEach((card) => {
    const label = card.querySelector('.se-card-sub'), text = label.textContent;
    card.onclick = async (e) => {
      e.preventDefault(); // the Edit link entry is a link: copy, don't follow it
      await copyText(shareTexts[card.dataset.copy]());
      label.textContent = card.dataset.done || 'Copied to the clipboard';
      setTimeout(() => (label.textContent = text), 1500);
    };
  });
  if (navigator.share) {
    $('se-share-native').hidden = false;
    $('se-share-native').onclick = () => navigator.share({ title: 'Murine icon shape', url: links.edit }).catch(() => {});
  }

  $('se-use').addEventListener('click', (e) => { if (e.currentTarget.classList.contains('se-disabled')) e.preventDefault(); });

  // ---------- presets ----------

  // A preset in the page's grid replaces the whole icon; the Add dialog's grid (see renderAddGrid) adds shapes.
  presetNames.forEach((name, k) => {
    const b = document.createElement('button');
    b.type = 'button';
    b.className = 'se-preset';
    if (k >= presetsShown) b.hidden = b.dataset.more = true;
    b.innerHTML = `${presetSvg(name)}<span>${name}</span>`;
    b.onclick = () => { loadIcon(presetShapes(name), presetWhole(name)); svg.scrollIntoView({ behavior: 'smooth', block: 'center' }); };
    $('se-presets').append(b);
  });
  // Both grids (Presets and Custom, see renderCustom) show the first `visible` tiles; one button shows the
  // rest of whichever grid is open, and the other grid follows when switched to.
  let moreOpen = false;
  function showMore() {
    const grid = $('se-presets').hidden ? $('se-custom') : $('se-presets'), more = $('se-presets-more');
    for (const b of document.querySelectorAll('#se-presets [data-more], #se-custom [data-more]')) b.hidden = !moreOpen;
    more.hidden = grid.children.length <= presetsShown;
    more.setAttribute('aria-controls', grid.id);
    more.setAttribute('aria-expanded', moreOpen);
    more.textContent = moreOpen ? 'Fewer shapes' : 'More shapes';
  }
  $('se-presets-more').onclick = () => { moreOpen = !moreOpen; showMore(); };
  showMore();

  // ---------- SVG import ----------

  // An SVG file's filled shapes become shapes with a fixed outline: every path command (relative, H/V, S, Q/T,
  // arcs) is rewritten as absolute M/L/C, transforms are applied, and each closed contour is one piece. Only
  // the file's geometry is read: nothing from it is ever put on the page.
  const NUMRE = /[+-]?(?:\d+\.?\d*|\.\d+)(?:[eE][+-]?\d+)?/y;
  // Endpoint-parameterised arc (SVG spec, appendix B.2.4) as cubics of at most 90° each.
  function arcCubics(x1, y1, rx, ry, phi, large, sweep, x2, y2) {
    if (x1 === x2 && y1 === y2) return [];
    rx = Math.abs(rx); ry = Math.abs(ry);
    if (!rx || !ry) return [[x2, y2]];
    const p = phi * Math.PI / 180, cp = Math.cos(p), sp = Math.sin(p), dx = (x1 - x2) / 2, dy = (y1 - y2) / 2;
    const xp = cp * dx + sp * dy, yp = -sp * dx + cp * dy, lam = (xp * xp) / (rx * rx) + (yp * yp) / (ry * ry);
    if (lam > 1) { rx *= Math.sqrt(lam); ry *= Math.sqrt(lam); }
    const num = rx * rx * ry * ry - rx * rx * yp * yp - ry * ry * xp * xp, den = rx * rx * yp * yp + ry * ry * xp * xp;
    const co = (large === sweep ? -1 : 1) * Math.sqrt(Math.max(0, num / den));
    const cxp = (co * rx * yp) / ry, cyp = (-co * ry * xp) / rx;
    const cx = cp * cxp - sp * cyp + (x1 + x2) / 2, cy = sp * cxp + cp * cyp + (y1 + y2) / 2;
    const ang = (ux, uy, vx, vy) => Math.atan2(ux * vy - uy * vx, ux * vx + uy * vy);
    const ux = (xp - cxp) / rx, uy = (yp - cyp) / ry;
    let t = ang(1, 0, ux, uy), dt = ang(ux, uy, (-xp - cxp) / rx, (-yp - cyp) / ry);
    if (!sweep && dt > 0) dt -= 2 * Math.PI; else if (sweep && dt < 0) dt += 2 * Math.PI;
    const n = Math.max(1, Math.ceil(Math.abs(dt) / (Math.PI / 2) - 1e-9)), h = dt / n, k = (4 / 3) * Math.tan(h / 4);
    const pt = (a) => [cx + rx * Math.cos(a) * cp - ry * Math.sin(a) * sp, cy + rx * Math.cos(a) * sp + ry * Math.sin(a) * cp];
    const dv = (a) => [-rx * Math.sin(a) * cp - ry * Math.cos(a) * sp, -rx * Math.sin(a) * sp + ry * Math.cos(a) * cp];
    const out = [];
    for (let i = 0; i < n; i++, t += h) {
      const a = pt(t), da = dv(t), b = i === n - 1 ? [x2, y2] : pt(t + h), db = dv(t + h);
      out.push([a[0] + k * da[0], a[1] + k * da[1], b[0] - k * db[0], b[1] - k * db[1], b[0], b[1]]);
    }
    return out;
  }
  // Path data as contours { x, y, segs }, each segment [x, y] (line) or [x1, y1, x2, y2, x, y] (cubic), absolute.
  function parseD(d) {
    const subs = [], bad = () => { throw new Error('bad path'); };
    let i = 0, cmd = '', cx = 0, cy = 0, sx = 0, sy = 0, sub = null, last = null; // last: the previous C/Q control point, for S/T
    const ws = () => { while (i < d.length && ' \t\n\r\f,'.includes(d[i])) i++; };
    const num = () => { ws(); NUMRE.lastIndex = i; const m = NUMRE.exec(d); if (!m) bad(); i = NUMRE.lastIndex; return +m[0]; };
    const flag = () => { ws(); const c = d[i++]; if (c !== '0' && c !== '1') bad(); return c === '1'; };
    const seg = (s) => { if (!sub) subs.push(sub = { x: cx, y: cy, segs: [] }); sub.segs.push(s); };
    for (;;) {
      ws();
      if (i >= d.length) break;
      if (/[a-zA-Z]/.test(d[i])) cmd = d[i++]; else if (!cmd || cmd === 'z' || cmd === 'Z') bad();
      const C = cmd.toUpperCase(), ox = cmd === C ? 0 : cx, oy = cmd === C ? 0 : cy;
      if (C === 'M') {
        cx = num() + ox; cy = num() + oy; sx = cx; sy = cy;
        subs.push(sub = { x: cx, y: cy, segs: [] });
        cmd = cmd === 'm' ? 'l' : 'L'; last = null;
      } else if (C === 'Z') {
        if (sub && (cx !== sx || cy !== sy)) sub.segs.push([sx, sy]);
        cx = sx; cy = sy; sub = null; last = null;
      } else if (C === 'L' || C === 'H' || C === 'V') {
        const x = C === 'V' ? cx : num() + ox, y = C === 'H' ? cy : num() + oy;
        seg([x, y]); cx = x; cy = y; last = null;
      } else if (C === 'C' || C === 'S') {
        const [x1, y1] = C === 'C' ? [num() + ox, num() + oy] : last?.[0] === 'C' ? [2 * cx - last[1], 2 * cy - last[2]] : [cx, cy];
        const x2 = num() + ox, y2 = num() + oy, x = num() + ox, y = num() + oy;
        seg([x1, y1, x2, y2, x, y]); last = ['C', x2, y2]; cx = x; cy = y;
      } else if (C === 'Q' || C === 'T') {
        const [qx, qy] = C === 'Q' ? [num() + ox, num() + oy] : last?.[0] === 'Q' ? [2 * cx - last[1], 2 * cy - last[2]] : [cx, cy];
        const x = num() + ox, y = num() + oy; // a quadratic is exactly a cubic with these control points
        seg([cx + (2 / 3) * (qx - cx), cy + (2 / 3) * (qy - cy), x + (2 / 3) * (qx - x), y + (2 / 3) * (qy - y), x, y]);
        last = ['Q', qx, qy]; cx = x; cy = y;
      } else if (C === 'A') {
        const rx = num(), ry = num(), ph = num(), large = flag(), sweep = flag(), x = num() + ox, y = num() + oy;
        for (const s of arcCubics(cx, cy, rx, ry, ph, large, sweep, x, y)) seg(s);
        cx = x; cy = y; last = null;
      } else bad();
    }
    return subs;
  }
  // Basic shapes as path data.
  function elementD(e) {
    const n = (a) => parseFloat(e.getAttribute(a)) || 0;
    switch (e.localName) {
      case 'path': return e.getAttribute('d') || '';
      case 'rect': {
        const x = n('x'), y = n('y'), w = n('width'), h = n('height');
        if (!(w > 0 && h > 0)) return '';
        const rx = clamp(e.hasAttribute('rx') ? n('rx') : n('ry'), 0, w / 2), ry = clamp(e.hasAttribute('ry') ? n('ry') : n('rx'), 0, h / 2);
        if (!rx || !ry) return `M${x} ${y}H${x + w}V${y + h}H${x}Z`;
        const a = `A${rx} ${ry} 0 0 1`;
        return `M${x + rx} ${y}H${x + w - rx}${a} ${x + w} ${y + ry}V${y + h - ry}${a} ${x + w - rx} ${y + h}H${x + rx}${a} ${x} ${y + h - ry}V${y + ry}${a} ${x + rx} ${y}Z`;
      }
      case 'circle': case 'ellipse': {
        const c = e.localName === 'circle', cx = n('cx'), cy = n('cy'), rx = c ? n('r') : n('rx'), ry = c ? n('r') : n('ry');
        return rx > 0 && ry > 0 ? `M${cx - rx} ${cy}A${rx} ${ry} 0 1 0 ${cx + rx} ${cy}A${rx} ${ry} 0 1 0 ${cx - rx} ${cy}Z` : '';
      }
      case 'polygon': case 'polyline': {
        const v = (e.getAttribute('points') || '').match(/[+-]?(?:\d+\.?\d*|\.\d+)(?:[eE][+-]?\d+)?/g) || [];
        return v.length >= 6 ? 'M' + v.slice(0, v.length & ~1).join(' ') + 'Z' : ''; // after M, extra pairs are lines
      }
    }
    return '';
  }
  // A presentation property as it applies to e: its style attribute, then its own attribute, then its parents'.
  function prop(e, name) {
    const re = new RegExp('(?:^|;)\\s*' + name + '\\s*:\\s*([^;!]+)');
    for (let n = e; n?.nodeType === 1; n = n.parentNode) {
      const m = re.exec(n.getAttribute('style') || '');
      if (m) return m[1].trim();
      if (n.hasAttribute(name)) return n.getAttribute(name).trim();
    }
    return null;
  }
  const hiddenEl = (e) => {
    for (let n = e; n?.nodeType === 1; n = n.parentNode) {
      if (n.getAttribute('display') === 'none' || /(^|;)\s*display\s*:\s*none/.test(n.getAttribute('style') || '')) return true;
    }
    return /^(hidden|collapse)$/.test(prop(e, 'visibility') || '');
  };
  // The element's transform, its parents' included, read through a <g> of our own (only the attribute's text is copied).
  const scratchG = document.createElementNS(NS, 'g');
  function ctm(e) {
    let m = new DOMMatrix();
    const chain = [];
    for (let n = e; n?.nodeType === 1; n = n.parentNode) chain.unshift(n);
    for (const n of chain) {
      const t = n.getAttribute('transform');
      if (!t) continue;
      scratchG.setAttribute('transform', t);
      const k = scratchG.transform.baseVal.consolidate()?.matrix;
      if (k) m = m.multiply(new DOMMatrix([k.a, k.b, k.c, k.d, k.e, k.f]));
    }
    return m;
  }
  const ringArea = (r) => r.reduce((s, [x0, y0], i) => { const [x1, y1] = r[(i + 1) % r.length]; return s + x0 * y1 - x1 * y0; }, 0) / 2;
  const insideRing = ([x, y], r) => {
    let inside = false;
    for (let i = 0, j = r.length - 1; i < r.length; j = i++) {
      const [xi, yi] = r[i], [xj, yj] = r[j];
      if ((yi > y) !== (yj > y) && x < ((xj - xi) * (y - yi)) / (yj - yi) + xi) inside = !inside;
    }
    return inside;
  };
  // A contour as a polygon, curves sampled.
  const sampled = (sp) => {
    const r = [[sp.x, sp.y]];
    let [px, py] = [sp.x, sp.y];
    for (const s of sp.segs) {
      if (s.length === 2) r.push(s);
      else for (let k = 1; k <= 8; k++) {
        const t = k / 8, u = 1 - t;
        r.push([u * u * u * px + 3 * u * u * t * s[0] + 3 * u * t * t * s[2] + t * t * t * s[4], u * u * u * py + 3 * u * u * t * s[1] + 3 * u * t * t * s[3] + t * t * t * s[5]]);
      }
      [px, py] = s.slice(-2);
    }
    return r;
  };
  // The file's pieces, scaled together into the 0-100 box: { pieces: [d], holes, strokes }.
  function svgPieces(text) {
    const doc = new DOMParser().parseFromString(text, 'image/svg+xml'), root = doc.documentElement;
    if (doc.getElementsByTagName('parsererror').length || root.localName !== 'svg') throw new Error("That file isn't a readable SVG.");
    const subs = [];
    let holes = 0, strokes = 0;
    for (const e of root.querySelectorAll('path, rect, circle, ellipse, polygon, polyline')) {
      if (e.closest('defs, clipPath, mask, symbol, pattern, marker') || hiddenEl(e)) continue;
      const fill = prop(e, 'fill');
      if (fill === 'none' || fill === 'transparent' || prop(e, 'fill-opacity') === '0') {
        if ((prop(e, 'stroke') || 'none') !== 'none') strokes++;
        continue;
      }
      let own;
      try { own = parseD(elementD(e)); } catch (err) { continue; } // a broken path is skipped, the rest still imports
      const m = ctm(e), tp = ([x, y]) => [m.a * x + m.c * y + m.e, m.b * x + m.d * y + m.f];
      own = own.filter((sp) => sp.segs.length).map((sp) => {
        const [x, y] = tp([sp.x, sp.y]);
        return { x, y, segs: sp.segs.map((s) => (s.length === 2 ? tp(s) : [...tp(s.slice(0, 2)), ...tp(s.slice(2, 4)), ...tp(s.slice(4))])) };
      });
      // Within one element, a contour inside an odd number of the others is a hole: the launcher can't
      // have holes, so it's dropped (and the area filled).
      const rings = own.map(sampled);
      own.forEach((sp, k) => {
        if (Math.abs(ringArea(rings[k])) < 1e-9) return;
        const depth = rings.filter((r, j) => j !== k && insideRing(rings[k][0], r)).length;
        if (depth % 2) holes++; else subs.push(sp);
      });
    }
    if (!subs.length) return { pieces: [], holes, strokes };
    // Scale and centre everything together, keeping how the pieces sit relative to each other.
    const raw = (sp) => `M ${sp.x} ${sp.y} ` + sp.segs.map((s) => (s.length === 2 ? 'L ' : 'C ') + s.join(' ')).join(' ') + ' Z';
    const bb = measure(subs.map(raw).join(' ')), k = 100 / Math.max(bb.width, bb.height, 1e-9);
    const ox = (100 - bb.width * k) / 2 - bb.x * k, oy = (100 - bb.height * k) / 2 - bb.y * k;
    const P = (x, y) => fmt(x * k + ox) + ' ' + fmt(y * k + oy);
    const pieces = subs.map((sp) => {
      const out = ['M ' + P(sp.x, sp.y)];
      let px = sp.x, py = sp.y;
      sp.segs.forEach((s, n) => {
        const [x, y] = s.slice(-2), chord = Math.hypot(x - px, y - py) * k;
        // A cubic whose handles sit on its chord is a line: written as one, like buildPath does.
        const flat = s.length === 6 && [0, 2].every((j) => Math.abs((x - px) * (s[j + 1] - py) - (y - py) * (s[j] - px)) * k * k <= 0.01 * Math.max(chord, 1e-9));
        const closing = n === sp.segs.length - 1 && Math.hypot(x - sp.x, y - sp.y) * k < 0.05;
        if (s.length === 2 || flat) { if (chord >= 0.05 && !closing) out.push('L ' + P(x, y)); }
        else out.push('C ' + P(s[0], s[1]) + ' ' + P(s[2], s[3]) + ' ' + P(x, y));
        px = x; py = y;
      });
      return cleanPath(out.join(' ') + ' Z');
    }).filter(Boolean);
    return { pieces, holes, strokes };
  }
  // Pieces merged into as few outlines as they make (one when they all touch), as straight segments.
  // polygon-clipping can give up on unlucky geometry: then the pieces are merged one at a time, and any
  // piece it still can't take is kept as it is, as a shape of its own.
  function mergedPieces(pieces) {
    let holes = 0, merged;
    const polys = pieces.map((d) => [flatten(d)]), loose = [];
    try { merged = polygonClipping.union(...polys); } catch (err) {
      merged = [];
      polys.forEach((p, k) => { try { merged = polygonClipping.union(merged, p); } catch (e) { loose.push(pieces[k]); } });
    }
    const out = merged.map((poly) => { holes += poly.length - 1; return 'M ' + simplify(poly[0].slice(0, -1), 0.05).map(([x, y]) => fmt(x) + ' ' + fmt(y)).join(' L ') + ' Z'; });
    return { pieces: [...out, ...loose], holes };
  }

  let importNote = ''; // shown under the result until the next edit
  // The Add dialog's grid shows the presets or the saved shapes (Custom, see library), or the pieces of a loaded
  // SVG file until it's unloaded with that switch (closing the dialog keeps it). A tap adds one tile; a long press
  // or Ctrl/Cmd+click starts picking several, after which taps toggle tiles until none are left picked, and the
  // bar under the grid adds them.
  let loaded = null; // { pieces, merged, notes, view }; view 'pieces' or 'merged' picks what the grid shows
  let addLib = 'presets'; // what the grid shows without a loaded file: 'presets' or 'custom'
  const viewList = () => (loaded.view === 'merged' ? loaded.merged.pieces : loaded.pieces);
  const picked = new Set(); // keys of picked tiles: preset names, or saved shape or piece indices
  // A tile's shapes and whole-icon transform (null for none), and the picked tiles' keys in grid order.
  const tileShapes = (key) => (addLib === 'custom' ? clone(library[+key].shapes) : presetShapes(key));
  const tileWhole = (key) => (addLib === 'custom' ? library[+key].whole ?? null : presetWhole(key));
  const pickedKeys = () => (addLib === 'custom' ? [...picked].sort((a, b) => a - b) : presetNames.filter((n) => picked.has(n)));
  const ROOM = 20; // most shapes an icon can have (restore() rejects more)
  const room = () => ROOM - shapes.length;
  const plural = (k) => (k === 1 ? 'one shape' : `${k} shapes`);
  const importMsg = (text) => { $('se-import-msg').textContent = text; $('se-import-msg').hidden = !text; };
  const holesNote = (n) => (n ? `${n} hole${n > 1 ? 's were' : ' was'} filled in: the launcher needs outlines without holes.` : '');
  const apartNote = (n) => (n > 1 ? `Not all pieces touch, so they became ${n} shapes instead of one.` : '');
  function addShapes(list, notes = []) {
    checkpoint();
    active = shapes.length;
    shapes.push(...list);
    selectOnly(-1); mode = 'move';
    importNote = notes.filter(Boolean).join(' ');
    picked.clear();
    sync(); addDialog.close(); render();
  }
  const asShapes = (pieces) => pieces.map((path) => ({ path, a: 1, x: 0, y: 0, ang: 0, mirror: 'none', rot: 0 }));
  const addPieces = (pieces) => addShapes(asShapes(pieces), loaded?.notes);
  // Baked: each tile's shapes and mirrored copies merged into one plain outline, as its picture draws it (stretch,
  // turn and whole-icon transform included), the way an imported SVG's pieces merge (parts that don't touch stay
  // apart). A lone outline keeps its exact curves. Corners can't be edited any more.
  const baked = (keys) => asShapes(keys.flatMap((k) => {
    const w = tileWhole(k), ds = tileShapes(k).flatMap(copies).map((d) => wholeMap(d, w));
    return ds.length > 1 ? mergedPieces(ds).pieces : ds;
  }));
  const addMerged = (m) => addShapes(asShapes(m.pieces), [...(loaded?.notes || []), holesNote(m.holes), apartNote(m.pieces.length)]);

  const tileSvg = (inner) => `<svg viewBox="-4 -4 108 108" aria-hidden="true">${inner}</svg>`;
  function renderAddGrid() {
    const tiles = $('se-add-grid'), full = room() <= 0;
    if (loaded) {
      // Each piece shown in place, over the faded rest of the file, so it's clear which part it is.
      const all = loaded.pieces.map((d) => `<path class="se-tile-ghost" d="${d}"/>`).join(''), name = loaded.view === 'merged' ? 'Merged' : 'Piece';
      tiles.innerHTML = viewList().map((d, k) => `<button type="button" class="se-preset" data-key="${k}" aria-pressed="false">
        ${tileSvg(all + `<path d="${d}"/>`)}<span>${name} ${k + 1}</span></button>`).join('');
    } else if (addLib === 'custom') {
      tiles.innerHTML = library.length ? library.map((it, k) => `<button type="button" class="se-preset" data-key="${k}" aria-pressed="false">
        ${iconSvg(it.shapes, it.whole ?? null, 4)}<span>${esc(it.name)}</span></button>`).join('') : `<p class="se-hint">${EMPTY}</p>`;
    } else {
      tiles.innerHTML = presetNames.map((name) => `<button type="button" class="se-preset" data-key="${name}" aria-pressed="false">
        ${presetSvg(name, 4)}<span>${name}</span></button>`).join('');
    }
    for (const b of tiles.children) b.disabled = full;
    refreshAddUi();
  }
  // Everything around the grid that depends on what's loaded, what's picked and the room left.
  function refreshAddUi() {
    const r = room(), full = r <= 0;
    for (const b of $('se-add-grid').children) {
      const on = picked.has(b.dataset.key);
      b.classList.toggle('picked', on); b.setAttribute('aria-pressed', on);
    }
    $('se-add-desc').textContent = `Tap to add${loaded || addLib === 'custom' ? ' in place' : ' at full size'}. Long-press or Ctrl+click to pick several or see more options.`;
    $('se-import-btn').disabled = full;
    for (const b of $('se-add-lib').children) b.setAttribute('aria-pressed', !loaded && b.dataset.lib === addLib);
    if (full) importMsg(`The icon already has the most shapes it can (${ROOM}): delete one to add more.`);
    else if ($('se-import-msg').dataset.full) importMsg('');
    $('se-import-msg').dataset.full = full ? '1' : '';
    // "Add all" and "merge all" for a loaded file.
    $('se-import-choice').hidden = !loaded;
    if (loaded) {
      const n = loaded.pieces.length, m = loaded.merged.pieces.length;
      // Only worth switching when merging changes something.
      $('se-import-view').hidden = m >= n;
      for (const b of $('se-import-view').children) {
        b.setAttribute('aria-pressed', b.dataset.view === loaded.view);
        b.textContent = (b.dataset.view === 'merged' ? 'Merged' : 'Pieces') + ` (${b.dataset.view === 'merged' ? m : n})`;
      }
      // One short line; the full sentences are its tooltip.
      const { holes, strokes } = loaded, tight = n > r || m > r, s = (k, w) => `${k} ${w}${k === 1 ? '' : 's'}`;
      $('se-import-count').textContent = [`${n} pieces (${m} merged)`, holes && `${s(holes, 'hole')} filled`,
        strokes && `${s(strokes, 'line')} skipped`, tight && `room for ${Math.max(r, 0)}`].filter(Boolean).join(' · ');
      $('se-import-count').title = [`${n} pieces` + (m === 1 ? ', which merge into one shape.' : `; not all of them touch, so merged they'd still be ${plural(m)}.`),
        holesNote(holes), strokes ? `${s(strokes, 'line-only element')} left out.` : '',
        tight ? `There's room for ${Math.max(r, 0)} more shape${r === 1 ? '' : 's'} (${ROOM} at most).` : ''].filter(Boolean).join(' ');
      $('se-import-separate').textContent = `Add all ${n}`;
      $('se-import-separate').disabled = n > r;
      $('se-import-merge').textContent = m === 1 ? 'Merge all into one' : `Merge all (${m} shapes)`;
      $('se-import-merge').disabled = m > r;
    }
    // The bar for picked tiles.
    const k = picked.size;
    $('se-pick-bar').hidden = !k;
    if (k) {
      // Merging picked groups that are already merged wouldn't change anything.
      const sub = loaded && loaded.view === 'pieces' ? [...picked].map(Number).sort((a, b) => a - b).map((i) => loaded.pieces[i]) : null;
      const merged = sub && k > 1 ? mergedPieces(sub) : null;
      // A preset can hold several shapes: the count is of the shapes added, not of the picks.
      const n = loaded ? k : pickedKeys().flatMap(tileShapes).length;
      $('se-pick-count').textContent = `${k} picked` + (n > r ? `, room for ${Math.max(r, 0)}` : '');
      $('se-pick-add').textContent = `Add ${n}`;
      $('se-pick-add').title = loaded && k > 1 ? `Add the ${k} picked as separate shapes` : `Add ${plural(n)}`;
      $('se-pick-add').disabled = n > r;
      $('se-pick-merge').hidden = !merged;
      if (merged) {
        const m = merged.pieces.length;
        $('se-pick-merge').textContent = m === 1 ? 'Merge' : `Merge (${m})`;
        $('se-pick-merge').title = m === 1 ? 'Merge them into one shape' : `Merge them: not all of them touch, so they'd make ${m} shapes`;
        $('se-pick-merge').disabled = m > r;
        $('se-pick-merge').onclick = () => addMerged(merged);
      }
      // Not for a loaded file: its pieces are outlines already.
      const bake = !loaded && baked(pickedKeys());
      $('se-pick-bake').hidden = !bake;
      if (bake) {
        $('se-pick-bake').textContent = `Bake ${bake.length}`;
        $('se-pick-bake').title = `Add each pick merged into one fixed outline (a path)${bake.length > picked.size ? `, ${bake.length} shapes in all as not all parts touch` : ''}: they move, turn and resize, but their corners can't be edited`;
        $('se-pick-bake').disabled = bake.length > r;
        $('se-pick-bake').onclick = () => addShapes(bake);
      }
    }
  }
  $('se-pick-add').onclick = () => {
    const keys = [...picked];
    if (loaded) addPieces(keys.map(Number).sort((a, b) => a - b).map((i) => viewList()[i]));
    else addShapes(pickedKeys().flatMap(tileShapes));
  };
  $('se-pick-clear').onclick = () => { picked.clear(); refreshAddUi(); };
  // Taps, long presses and Ctrl+clicks on the tiles.
  let press = null, longPressed = false;
  const togglePick = (key) => { if (!picked.delete(key)) picked.add(key); refreshAddUi(); };
  const addGrid = $('se-add-grid');
  addGrid.addEventListener('pointerdown', (e) => {
    const b = e.target.closest('.se-preset');
    if (!b || b.disabled || e.button > 0) return;
    longPressed = false;
    press = { x: e.clientX, y: e.clientY, timer: setTimeout(() => { longPressed = true; navigator.vibrate?.(15); togglePick(b.dataset.key); }, 450) };
  });
  addGrid.addEventListener('pointermove', (e) => { if (press && Math.hypot(e.clientX - press.x, e.clientY - press.y) > 10) { clearTimeout(press.timer); press = null; } });
  for (const t of ['pointerup', 'pointercancel', 'pointerleave']) addGrid.addEventListener(t, () => { if (press) clearTimeout(press.timer); press = null; });
  addGrid.addEventListener('contextmenu', (e) => { if (e.target.closest('.se-preset')) e.preventDefault(); }); // a long press isn't a right-click here
  addGrid.addEventListener('click', (e) => {
    const b = e.target.closest('.se-preset');
    if (!b) return;
    if (longPressed) { longPressed = false; return; } // the long press already picked it
    const key = b.dataset.key;
    if (picked.size || e.ctrlKey || e.metaKey) return togglePick(key);
    if (loaded) addPieces([viewList()[+key]]);
    else addShapes(tileShapes(key));
  });

  $('se-import-btn').onclick = () => $('se-import-file').click();
  // Presets or Custom; with a file loaded, either one unloads it.
  $('se-add-lib').addEventListener('click', (e) => {
    const b = e.target.closest('[data-lib]');
    if (!b || (!loaded && b.dataset.lib === addLib)) return;
    addLib = b.dataset.lib; loaded = null; picked.clear(); importMsg(''); renderAddGrid();
  });
  $('se-import-file').onchange = async (e) => {
    const file = e.target.files[0];
    e.target.value = ''; // the same file can be picked again
    if (!file) return;
    importMsg('');
    if (file.size > 2e6) return importMsg('That file is over 2 MB, too big for an icon.');
    let res;
    try { res = svgPieces(await file.text()); } catch (err) { return importMsg(err.message === 'bad path' ? "That file's paths couldn't be read." : err.message); }
    if (!res.pieces.length) {
      return importMsg(res.strokes ? 'This icon is drawn with lines (strokes) only, with nothing filled in, so there is no outline to import.'
        : 'No filled shapes were found in that file.');
    }
    const notes = [holesNote(res.holes), res.strokes ? `${res.strokes} line-only element${res.strokes > 1 ? 's were' : ' was'} left out.` : ''];
    if (res.pieces.length === 1) { loaded = null; picked.clear(); renderAddGrid(); return addShapes(asShapes(res.pieces), notes); } // nothing to choose
    // The merge is worked out now, so the buttons can say how many shapes it makes.
    loaded = { pieces: res.pieces, merged: mergedPieces(res.pieces), notes, holes: res.holes, strokes: res.strokes, view: 'pieces' };
    picked.clear();
    renderAddGrid();
  };
  $('se-import-view').addEventListener('click', (e) => {
    const b = e.target.closest('[data-view]');
    if (!b || !loaded || b.dataset.view === loaded.view) return;
    loaded.view = b.dataset.view; picked.clear(); renderAddGrid();
  });
  $('se-import-separate').onclick = () => loaded && addPieces(loaded.pieces);
  $('se-import-merge').onclick = () => loaded && addMerged(loaded.merged);

  // ---------- saved shapes (Custom) ----------

  // Kept in this browser only (localStorage), in the editor's own JSON, the same an edit link holds:
  // [{ name, shapes, whole? }], checked with cleanShape and cleanWhole when read back, like a link. A built-in
  // outline is saved as a plain path, so a saved shape doesn't depend on the presets staying as they are.
  const SAVED = 'murine-shape-editor-saved';
  const EMPTY = 'Nothing saved yet. Save a shape, or the whole shape, from its card under the editor: it stays in this browser.';
  const clone = (o) => JSON.parse(JSON.stringify(o));
  const esc = (t) => t.replace(/[&<>"']/g, (c) => `&#${c.charCodeAt(0)};`);
  const library = (() => {
    let list = null;
    try { list = JSON.parse(localStorage.getItem(SAVED)); } catch (e) { /* private mode or garbage */ }
    return (Array.isArray(list) ? list : []).map((it) => {
      const name = typeof it?.name === 'string' ? it.name.trim().slice(0, 40) : '';
      const got = Array.isArray(it?.shapes) && it.shapes.length && it.shapes.length <= ROOM ? it.shapes.map(cleanShape) : [null];
      const w = it?.whole === undefined ? null : cleanWhole(it.whole);
      if (!name || got.includes(null) || (it.whole !== undefined && !w)) return null;
      return { name, shapes: got, ...(w && { whole: w }) };
    }).filter(Boolean);
  })();
  const storeLibrary = () => { try { localStorage.setItem(SAVED, JSON.stringify(library)); return true; } catch (e) { return false; } };
  const plainShape = ({ id, fixed, ...sh }) => (fixed ? { path: FIXED[fixed], ...sh } : sh);
  const moved = (w) => w && (w.a !== 1 || w.x || w.y || w.ang || w.flip || w.st);

  // The name dialog, for saving and renaming. done(name) stores it and says whether that worked.
  const nameDialog = dialog('se-name');
  let named = null;
  function askName(title, value, button, done) {
    $('se-name-title').textContent = title;
    $('se-name-ok').textContent = button;
    $('se-name-input').value = value;
    $('se-name-msg').hidden = true;
    named = done;
    nameDialog.open();
    $('se-name-input').select();
  }
  $('se-name-form').addEventListener('submit', (e) => {
    e.preventDefault();
    const name = $('se-name-input').value.trim();
    if (!name) return;
    if (!named(name)) {
      $('se-name-msg').textContent = "Couldn't save: this browser's storage is full or turned off for this site.";
      $('se-name-msg').hidden = false;
      return;
    }
    nameDialog.close(); renderCustom();
  });
  const freeName = () => { let k = library.length + 1; while (library.some((it) => it.name === `Custom ${k}`)) k++; return `Custom ${k}`; };
  // A shape card saves that shape as it is; Global (i = -1) saves the whole shape, with its whole-icon
  // transform kept as such (not baked in) when it changes anything.
  function saveItem(i) {
    const item = clone(i < 0 ? { shapes: shapes.map(plainShape), ...(moved(whole) && { whole }) } : { shapes: [plainShape(shapes[i])] });
    askName(i < 0 ? 'Save the whole shape' : `Save ${shapeName(shapes[i], i)}`, freeName(), 'Save', (name) => {
      library.push({ name, ...item });
      if (storeLibrary()) return true;
      library.pop(); return false;
    });
  }

  // The page's grid: Presets or Custom. A saved shape replaces the icon, like a preset; its corners rename
  // and delete it. A deletion can be taken back until the next one.
  let lastDeleted = null;
  const customMsg = (text, undo = false) => {
    $('se-custom-msg').hidden = !text; $('se-custom-msg').firstChild.textContent = text; $('se-custom-undo').hidden = !undo;
  };
  function renderCustom() {
    $('se-custom').innerHTML = library.length ? library.map((it, k) => `<div class="se-saved"${k >= presetsShown ? ' data-more' : ''}>
        <button type="button" class="se-preset" data-k="${k}" title="${esc(it.name)}">${iconSvg(it.shapes, it.whole ?? null)}<span>${esc(it.name)}</span></button>
        <button type="button" class="se-tile-btn se-tile-edit" data-rename="${k}" title="Rename" aria-label="Rename ${esc(it.name)}">${icon('e3c9')}</button>
        <button type="button" class="se-tile-btn se-tile-del" data-del="${k}" title="Delete" aria-label="Delete ${esc(it.name)}">${icon('e92e')}</button>
      </div>`).join('') : `<p class="se-hint">${EMPTY}</p>`;
    showMore();
  }
  $('se-custom').addEventListener('click', (e) => {
    const b = e.target.closest('button');
    if (!b) return;
    if (b.dataset.k) {
      const it = library[+b.dataset.k];
      loadIcon(clone(it.shapes), it.whole ? clone(it.whole) : null);
      svg.scrollIntoView({ behavior: 'smooth', block: 'center' });
    } else if (b.dataset.rename) {
      const it = library[+b.dataset.rename];
      askName('Rename', it.name, 'Rename', (name) => {
        const old = it.name;
        it.name = name;
        if (storeLibrary()) return true;
        it.name = old; return false;
      });
    } else if (b.dataset.del) {
      const k = +b.dataset.del;
      lastDeleted = { k, it: library.splice(k, 1)[0] };
      storeLibrary(); renderCustom();
      customMsg(`Deleted “${lastDeleted.it.name}”.`, true);
    }
  });
  $('se-custom-undo').onclick = () => {
    if (!lastDeleted) return;
    library.splice(lastDeleted.k, 0, lastDeleted.it);
    lastDeleted = null;
    storeLibrary(); renderCustom(); customMsg('');
  };
  $('se-lib').addEventListener('click', (e) => {
    const b = e.target.closest('[data-lib]');
    if (!b) return;
    const custom = b.dataset.lib === 'custom';
    for (const x of $('se-lib').children) x.setAttribute('aria-pressed', x === b);
    $('se-presets').hidden = custom; $('se-custom').hidden = !custom;
    showMore();
    customMsg(''); lastDeleted = null;
  });
  renderCustom();

  // ---------- start ----------

  let saved = null;
  try { saved = JSON.parse(localStorage.getItem(STORE)); } catch (e) { /* private mode or garbage */ }
  if (!restore(saved)) { shapes = presetShapes('Squircle'); sync(); }
  // An edit link replaces the current work, which stays one Undo away. Pasting a link into a tab that
  // already has the editor open only changes the hash, hence the hashchange listener.
  async function openEditLink() {
    // #edit= is what Share makes (deflated, base64url); #edit-raw= is the same JSON, just percent-encoded,
    // for links written by hand (see "Link format" on the page).
    const raw = location.hash.startsWith('#edit-raw=');
    if (!raw && !location.hash.startsWith('#edit=')) return;
    const data = location.hash.slice(raw ? 10 : 6);
    history.replaceState(null, '', location.pathname + location.search); // a reload then keeps later edits
    let link = null;
    // Drawn shapes pack into a few KB; imported outlines can take more. unpack() caps what a link inflates to.
    if (data.length < 200000) try { link = JSON.parse(raw ? decodeURIComponent(data) : await unpack(data)); } catch (e) { /* malformed link */ }
    const before = undoState();
    if (restore(link)) { undo.push(before); redo.length = 0; }
    render();
  }
  addEventListener('hashchange', openEditLink);
  // Fingers can't hit 5-unit cells (about 13px on a phone-sized canvas), so touch screens start at 10.
  // Pixel density doesn't matter here: sizes are in CSS pixels, which already account for it.
  if (matchMedia('(pointer: coarse)').matches) $('se-step').value = grid.step = 10;
  drawGrid();
  render();
  openEditLink();

  // one self-check, runs on every load; the console says if the output format ever regresses
  for (const sample of [...presetNames.flatMap((n) => presetShapes(n).map(shapePath)), iconPath().d]) {
    console.assert(/^M [\d. -]+( [LC] [\d. -]+)* Z$/.test(sample) && !/[eE]|--|\.\d+\./.test(sample),
      'shape-editor: path not in launcher-safe format', sample);
  }
})();
