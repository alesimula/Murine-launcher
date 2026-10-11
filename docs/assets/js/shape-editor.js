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

  const PRESETS = {
    Circle: () => box(50, 50, 50, 50),
    Squircle: () => box(50, 50, 50, 50, 1),
    'Rounded square': () => box(24, 24, 24, 24, 0.6),
    Square: () => box(8, 8, 8, 8),
    Arch: () => box(50, 50, 14, 14),
    Teardrop: () => box(50, 10, 50, 50),
    Leaf: () => box(50, 12, 50, 12),
    Cut: () => box(22, 22, 22, 22, 0),
    Triangle: () => polygon(3, 1, 0, 18),
    Hexagon: () => polygon(6, 1, 0, 14),
    Octagon: () => polygon(8, 1, 22.5, 8),
    'Cookie 4': () => polygon(4, 0.62, 45, 45, 14),
    'Cookie 7': () => polygon(7, 0.8, 0, 20, 8),
    Flower: () => polygon(6, 0.62, 0, 30, 2),
    Burst: () => polygon(12, 0.86, 0, 4, 2),
    Diamond: () => polygon(4, 1, 0, 16),
    // Two circular lobes meeting at a sharp notch, slightly rounded sides and a softened tip. Each lobe is three
    // corners of a polygon around its circle, rounded (at s 0.5) exactly into arcs of that circle. The side corners
    // take all the room the lobes leave (27.2), so no straight piece is left between a lobe and its side.
    Heart: () => [[50, 21.02, 0, 0], [55.64, 4.94, 17.05, 0.5], [89.68, 2.82, 17.05, 0.5], [104.9, 33.32, 17.04, 0.5],
      [80, 70, 27.2, 0.6], [50, 97.53, 2.92, 0.5], [20, 70, 27.2, 0.6], [-4.9, 33.32, 17.04, 0.5], [10.32, 2.82, 17.05, 0.5],
      [44.36, 4.94, 17.05, 0.5]].map(([x, y, r, s]) => ({ x, y, r, s })),
  };

  // Ready-made paths that can't be expressed as one rounded polygon, so they aren't editable point by point.
  const FIXED = {
    // App icon head: outer silhouette + forehead + goatee fused into one contour (the launcher
    // only reads the first contour), eye/whisker cut-outs dropped, simplified to 0.05 units.
    Murine: 'M 9.38 59.57 L 10.34 60.94 L 11.76 62.66 L 13.13 64.1 L 14.6 65.44 L 14.91 65.86 L 15.1 66.52 L 15.08 67.03 L 14.82 67.67 L 14.38 68.15 L 15.92 69.39 L 17.76 70.65 L 19.7 71.81 L 22.13 73.01 L 24.4 74.01 L 28.59 75.67 L 32.42 78.33 L 34.36 79.44 L 36.36 80.43 L 37.27 80.84 L 37.71 80.54 L 38.2 80.38 L 38.72 80.38 L 39.36 80.6 L 39.88 81.05 L 40.21 81.62 L 40.97 82.54 L 42.8 84.45 L 44.66 86.14 L 46.74 87.76 L 47.54 87.52 L 48.25 87.62 L 48.73 87.87 L 49.92 88.77 L 51.22 87.83 L 51.68 87.58 L 52.36 87.48 L 53.26 87.7 L 55.15 86.26 L 56.9 84.65 L 58.61 82.8 L 59.67 81.51 L 60.04 80.87 L 60.45 80.53 L 60.93 80.32 L 61.63 80.28 L 62.14 80.43 L 62.64 80.78 L 64.15 80.17 L 67.84 78.1 L 71.36 75.7 L 77.07 73.41 L 80.63 71.67 L 83.17 70.11 L 84.98 68.81 L 85.74 68.16 L 85.3 67.67 L 85.02 67.03 L 85.02 66.33 L 85.19 65.84 L 85.49 65.41 L 86.97 64.07 L 88.32 62.63 L 89.42 61.29 L 90.59 59.67 L 90.48 59.53 L 85.59 57.99 L 85.14 57.72 L 84.9 57.47 L 84.63 57.03 L 84.51 56.52 L 84.53 56 L 84.71 55.51 L 86.56 53.36 L 87.65 51.76 L 84.31 51.74 L 83.64 51.54 L 83.11 51.1 L 82.84 50.65 L 82.7 49.96 L 82.78 49.45 L 83.17 48.5 L 83.53 48.1 L 83.82 47.91 L 86.26 47.22 L 88.31 46.38 L 90.26 45.29 L 92.07 43.96 L 93.54 42.63 L 95.04 40.98 L 96.35 39.19 L 97.49 37.26 L 98.5 35.01 L 99.27 32.65 L 99.72 30.45 L 99.97 27.99 L 99.95 25.51 L 99.67 23.3 L 99.13 21.14 L 98.41 19.28 L 97.46 17.53 L 96.1 15.78 L 94.66 14.4 L 92.83 13.12 L 90.84 12.15 L 88.94 11.57 L 86.96 11.27 L 84.73 11.28 L 82.53 11.64 L 80.18 12.4 L 77.94 13.47 L 75.65 14.93 L 73.69 16.46 L 71.85 18.13 L 69.18 21.06 L 66.81 24.13 L 66.41 24.48 L 65.92 24.69 L 65.4 24.74 L 65.05 24.69 L 64.56 24.49 L 64.27 24.28 L 63.94 23.87 L 63.79 23.55 L 63.7 22.83 L 62.22 23.17 L 58.96 24.1 L 55.59 25.25 L 52.37 24.93 L 49.72 24.84 L 47.44 24.92 L 44.26 25.26 L 41.24 24.21 L 36.13 22.81 L 35.93 23.6 L 35.5 24.14 L 34.9 24.48 L 34.21 24.56 L 33.7 24.44 L 33.12 24.07 L 31.48 21.93 L 30.05 20.22 L 27.44 17.58 L 26.51 16.75 L 24.97 15.5 L 23.55 14.49 L 22.07 13.58 L 20.74 12.89 L 19.14 12.22 L 17.48 11.7 L 15.79 11.37 L 14.31 11.24 L 12.8 11.27 L 11.35 11.47 L 9.91 11.85 L 8.5 12.38 L 6.57 13.45 L 4.99 14.68 L 3.45 16.3 L 2.18 18.13 L 1.22 20.14 L 0.48 22.5 L 0.11 24.71 L 0 27.18 L 0.1 28.91 L 0.33 30.63 L 0.75 32.56 L 1.27 34.23 L 2 36.07 L 2.77 37.62 L 3.68 39.1 L 4.7 40.53 L 5.8 41.85 L 6.83 42.93 L 9.11 44.85 L 10.77 45.91 L 12.33 46.68 L 13.96 47.29 L 16.14 47.92 L 16.56 48.25 L 16.79 48.53 L 17.21 49.53 L 17.26 50.06 L 17.09 50.75 L 16.65 51.32 L 16.2 51.6 L 15.51 51.76 L 12.27 51.78 L 12.29 51.93 L 13.3 53.26 L 15.22 55.55 L 15.39 56.04 L 15.42 56.56 L 15.29 57.06 L 15.02 57.51 L 14.78 57.75 L 14.34 58.02 Z',
  };

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
  const shapePath = (sh) => (sh.st ? mapPath(basePath(sh), (x, y) => toWorld(sh, { x, y })) : basePath(sh));
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
  const presetShapes = (name) => (Object.hasOwn(FIXED, name)
    ? [{ fixed: name, a: 1, x: 0, y: 0, mirror: 'none' }]
    : [{ pts: fit(PRESETS[name]()), mirror: 'none' }]);
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
  function iconPath() {
    const all = shapes.flatMap(copies);
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
  let pts = null, fixed = false; // shortcuts into shapes[active]: its points, or whether its outline is fixed
  // Several shapes picked from their cards (long press or Ctrl+click) are moved, resized, stretched and turned
  // together, in Move mode only. groups remembers each picked set's own stretch and angle, by the shapes' ids,
  // until one of them is deleted; each shape still stores its full stretch and angle itself.
  let multi = new Set(), groups = [];
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
    pts = shapes[active].pts || null;
    fixed = !shapes[active].pts;
    if (fixed) mode = 'move';
    if (synced !== active + mode) pickedCorner = -1; // another shape or mode: the corner selection goes
    synced = active + mode;
  };
  const undo = [], redo = [];

  // Everything needed to resume editing. Undo, localStorage and edit links all go through this pair,
  // so a new piece of state only has to be added to snapshot() and restore().
  const snapshot = () => ({ shapes, active, groups, ...(multi.size > 1 && { multi: [...multi] }) });
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
    const p = s.pts.map((q) => ({ x: clamp(+q?.x, -500, 600), y: clamp(+q?.y, -500, 600), r: clamp(+q?.r, 0, 500), s: clamp(+q?.s, 0, 1) }));
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
    active = Number.isInteger(o.active) ? o.active : 0;
    sel = -1; multi = new Set(Array.isArray(o.multi) ? o.multi.filter((i) => Number.isInteger(i) && i >= 0) : []);
    sync(); // drops a multi that doesn't fit the shapes
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
  }
  const grid = { show: true, snap: true, step: 5 };
  const snap = (v) => clamp(grid.snap ? Math.round(v / grid.step) * grid.step : +v.toFixed(2), view.lo, view.hi);
  const checkpoint = () => {
    importNote = '';
    turnFrom = null; // any other edit ends a rotation-slider drag (see the slider's input handler)
    undo.push(JSON.stringify(snapshot()));
    if (undo.length > 100) undo.shift();
    redo.length = 0; // a new edit starts a new branch, so there's nothing left to redo
  };
  // Whole icon (presets, Reset) or just the selected shape (Generate).
  const loadIcon = (list) => { checkpoint(); shapes = list; active = 0; sel = -1; multi = new Set(); mode = 'edit'; sync(); render(); };
  const replaceShape = (sh) => { checkpoint(); shapes[active] = sh; sel = -1; multi = new Set(); mode = 'edit'; sync(); render(); };

  // ---------- Move mode's selection: the picked group, or the selected shape ----------

  const selIdx = () => (multi.size > 1 ? [...multi].sort((a, b) => a - b) : [active]);
  const selShapes = () => selIdx().map((i) => shapes[i]);
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
  const selState = () => (multi.size > 1 ? groupRec(false) || { rot: 0 } : shapes[active]);
  // The selection as it is now, for drags that apply each step to where they started.
  const selBase = () => ({ shapes: selShapes(), group: (({ st, rot }) => ({ st, rot }))(selState()) });
  // Applies w -> A w + t to the selected shapes (as they were in base, when given) and to the group's record,
  // which follows the same maths as a shape with no outline of its own.
  function applySel(A, tx, ty, base = null) {
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
    if (multi.size > 1) groupRec(true).rot = rot; else shapes[active].rot = rot;
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
    const lines = shapes.map(copies); // per shape: own outline, then its mirrored copies
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
    const out = iconPath();
    const crossed = shapes.findIndex((sh) => sh.pts && selfIntersects(sh.pts));
    const bad = !!out.error || crossed >= 0;

    // Each shape and mirrored copy is filled and outlined on its own. The selected one is drawn last: while
    // selected it sits on top, and clicks on it reach it first (see shapeAt).
    // The others go in two layers, fills (whose overlaps are capped, see #se-cap-*) and outlines.
    const picks = selIdx(), on = new Set(picks);
    const back = shapes.flatMap((_, i) => (on.has(i) ? [] : lines[i].map((d, c) => ({ d, cls: 'se-line' + (c ? ' copy' : '') }))));
    const front = picks.flatMap((i) => lines[i].map((d, c) => ({ d, cls: 'se-line active' + (c ? ' copy' : '') })));
    for (const [id, list] of [['se-back-fill', back], ['se-back-stroke', back], ['se-front', front]]) {
      const layer = $(id);
      resize(layer, list.length, () => el('path', {}));
      list.forEach((s, k) => { layer.children[k].setAttribute('d', s.d); layer.children[k].setAttribute('class', s.cls); });
    }
    $('se-outline').setAttribute('points', pts && mode === 'edit' ? pts.map(wpt).map((p) => p.x + ',' + p.y).join(' ') : '');

    // Neighbours whose rounding the selected corner is currently eating into.
    const squeezed = new Set();
    if (pts && sel >= 0) {
      const now = cornerSizes(pts), alone = cornerSizes(withSize(sel, 0));
      for (const j of neighbours(sel)) if (now[j] < alone[j] - 0.01) squeezed.add(j);
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
      h.setAttribute('class', 'se-handle' + (i === sel ? ' selected' : '') + (squeezed.has(i) ? ' squeezed' : ''));
      for (const c of h.children) { c.setAttribute('cx', p.x); c.setAttribute('cy', p.y); }
    });
    if (focused && sel >= 0 && document.activeElement !== handles.children[sel]) handles.children[sel]?.focus();

    // Move mode: a box around the selected shape, with a resize handle on each corner.
    const moving = mode === 'move';
    $('se-move').style.display = moving ? '' : 'none';
    if (moving) {
      activeBox = measure(picks.map((i) => lines[i][0]).join(' '));
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
      b.setAttribute('aria-pressed', b.dataset.mirror === shapes[active].mirror);
      b.disabled = many; // a group's shapes have no mirroring (see toggleMulti)
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
    $('se-corner-set').disabled = !editable;
    // Top-left pill: the selected point (Edit mode) or the selected corner (Move mode).
    const at = moving ? (pickedCorner >= 0 && activeBox ? boxHandles(activeBox)[pickedCorner] : null) : (pts && sel >= 0 ? wpt(pts[sel]) : null);
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
      $('se-point-pill').setAttribute('aria-label', moving ? (pickedCorner < 4 ? 'Corner' : 'Side') : `Point ${sel + 1}`);
      // A side handle only has the one coordinate it stretches.
      $('se-x').parentElement.hidden = moving && pickedCorner >= 4 && sideAxis(pickedCorner) !== 'x';
      $('se-y').parentElement.hidden = moving && pickedCorner >= 4 && sideAxis(pickedCorner) !== 'y';
      $('se-remove').hidden = moving;
      $('se-remove').disabled = moving || pts.length <= 3;
    }
    $('se-fixed-note').hidden = editable;
    if (editable) {
      const cur = pts[Math.max(sel, 0)];
      $('se-corner-legend').textContent = sel >= 0 ? `Corner ${sel + 1}` : 'All corners';
      // The slider ends where the shape stops changing: two corners sharing an edge split it, so with every
      // corner the same size each one saturates at half its shorter edge; a lone corner can take more.
      const reach = (i) => Math.min(dist(pts[i], pts[(i + pts.length - 1) % pts.length]), dist(pts[i], pts[(i + 1) % pts.length]));
      const maxSize = sel >= 0 ? reach(sel) : Math.max(...pts.map((_, i) => reach(i) / 2));
      $('se-size').max = Math.max(0.1, Math.ceil(maxSize * 10) / 10); // set before value, which the browser clamps to it
      $('se-size').value = cur.r; $('se-size-v').textContent = fmt(Math.min(cur.r, +$('se-size').max));
      const max = +$('se-size').max, zone = sel >= 0 ? squeezeStart(sel, max) : max, hasZone = zone < max - 0.05;
      $('se-size-track').classList.toggle('has-zone', hasZone);
      $('se-size-track').style.setProperty('--squeeze', zone / max);
      // Only the text changes while the slider is dragged (the zone depends on the neighbours, not on this
      // corner's size): showing or hiding an element under the thumb makes Chrome drop the drag.
      const warn = $('se-size-warn');
      warn.hidden = !hasZone;
      warn.classList.toggle('active', squeezed.size > 0);
      warn.textContent = squeezed.size ? 'Shrinking the highlighted neighbouring corners'
        : 'Past the red mark it also shrinks the neighbouring corners';
      $('se-smooth').value = Math.round(cur.s * 100); $('se-smooth-v').textContent = Math.round(cur.s * 100) + '%';
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
    const key = JSON.stringify([shapes, active, mode, [...multi]]);
    if (key === cardsKey) return;
    cardsKey = key;
    const cards = $('se-cards'), focus = document.activeElement?.closest?.('#se-cards [data-act]');
    const refocus = focus && focus.dataset.act + ':' + focus.dataset.card;
    const many = multi.size > 1;
    cards.innerHTML = shapes.map((sh, i) => {
      const on = many ? multi.has(i) : i === active, name = shapeName(sh, i);
      return `<div class="se-card${on ? ' active' : ''}" role="listitem">
        <button type="button" class="se-card-pick" data-act="pick" data-card="${i}" aria-pressed="${on}" aria-label="Select ${name}">
          <svg viewBox="-10 -10 120 120" aria-hidden="true"><rect class="se-card-box" x="0" y="0" width="100" height="100"/>
            ${copies(sh).map((d, c) => `<path class="${c ? 'copy' : ''}" d="${d}"/>`).join('')}</svg>
          <span>${name}</span>
        </button>
        ${shapes.length > 1 ? `<button type="button" class="se-card-del" data-act="del" data-card="${i}" title="Delete ${name}" aria-label="Delete ${name}">${icon('e92e')}</button>` : ''}
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
    const n = list.length, what = n > 1 ? `these ${n} shapes` : shapeName(shapes[list[0]], list[0]);
    if (!confirm(`Delete ${what}? Undo can still bring ${n > 1 ? 'them' : 'it'} back.`)) return;
    checkpoint();
    for (const i of [...list].sort((a, b) => b - a)) shapes.splice(i, 1);
    active = Math.min(...list); multi = new Set();
    sel = -1; sync(); render();
  }
  const deleteShape = (i) => deleteShapes([i]);
  // Picking several cards: a long press or Ctrl/Cmd+click starts (with the selected shape, unless
  // that one is mirrored), then plain taps toggle cards until one is left. Mirrored shapes can't join:
  // the canvas shakes instead.
  function toggleMulti(i) {
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
    sel = -1; pickedCorner = -1; sync(); render();
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
    else if (b.dataset.act === 'pick') { active = i; sel = -1; sync(); render(); } // keeps the mode, like a tap on the canvas
    else if (b.dataset.act === 'edit' || b.dataset.act === 'move') { mode = b.dataset.act; sel = -1; sync(); render(); }
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
    if (multi.size > 1) { multi = new Set(); if (tap >= 0) active = tap; sel = -1; sync(); tap = null; return render(); }
    if (tap >= 0 && tap !== active) { active = tap; sel = -1; mode = shapes[tap].pts ? mode : 'move'; sync(); render(); }
    else if (sel >= 0 || pickedCorner >= 0) { sel = -1; pickedCorner = -1; render(); }
    tap = null;
  });

  // Clicks and taps focus the canvas too; this keeps Chrome from showing its keyboard focus ring for it.
  svg.addEventListener('pointerdown', () => svg.setAttribute('data-pointer', ''), true);
  svg.addEventListener('blur', () => svg.removeAttribute('data-pointer'));
  // A long press on a shape picks it too (or drops it from the group), as on the cards; one that started
  // moving the selection takes that back first.
  let hold = null;
  const letGo = () => { if (hold) clearTimeout(hold.timer); hold = null; };
  svg.addEventListener('pointerdown', (e) => {
    const pick = e.ctrlKey || e.metaKey, g = pick ? null : grabAt(e.clientX, e.clientY, e.pointerType === 'touch');
    tap = g ? null : shapeAt(e);
    letGo();
    const under = g ? (g.move ? shapeAt(e) : -1) : tap;
    if (!pick && under >= 0 && (multi.size > 1 || under !== active)) {
      hold = { x: e.clientX, y: e.clientY, timer: setTimeout(() => {
        hold = null; tap = null;
        if (drag) { drag = null; restore(JSON.parse(undo.pop())); render(); }
        navigator.vibrate?.(15);
        toggleMulti(under);
      }, 450) };
    }
    if (!g) return;
    checkpoint();
    const at = toSvg(e);
    if (g.point !== undefined || g.add !== undefined) {
      if (g.add !== undefined) {
        const a = pts[g.add], m = lerp(wpt(a), wpt(pts[(g.add + 1) % pts.length]), 0.5);
        pts.splice(g.add + 1, 0, { x: 0, y: 0, r: a.r, s: a.s });
        setPoint(g.add + 1, { x: snap(m.x), y: snap(m.y) });
        sel = g.add + 1;
      } else sel = g.point;
      const w = wpt(pts[sel]);
      drag = { kind: 'point', dx: w.x - at.x, dy: w.y - at.y }; // the point keeps its distance from the finger
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
    svg.setPointerCapture(e.pointerId);
    e.preventDefault(); // this also stops the browser focusing the canvas, so do it here:
    svg.focus({ preventScroll: true }); // Delete, arrows and Esc then act on what was just grabbed
    render();
  });
  svg.addEventListener('pointermove', (e) => {
    if (hold && Math.hypot(e.clientX - hold.x, e.clientY - hold.y) > 10) letGo();
    if (!drag) return;
    const p = toSvg(e);
    if (drag.kind === 'point') {
      setPoint(sel, { x: snap(p.x + drag.dx), y: snap(p.y + drag.dy) });
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
  const endDrag = () => { if (drag) { drag = null; render(); } };
  for (const t of ['pointerup', 'pointercancel']) svg.addEventListener(t, () => { letGo(); endDrag(); });
  svg.addEventListener('contextmenu', (e) => { if (shapeAt(e) >= 0) e.preventDefault(); });
  svg.addEventListener('focusin', (e) => {
    const h = e.target.closest('[data-i]');
    if (h && +h.dataset.i !== sel) { sel = +h.dataset.i; render(); }
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
    const shapeKey = mode === 'move' && pickedCorner < 0 && del;
    const pointKey = (sel >= 0 && mode === 'edit' && (del || e.key === 'Escape') || (pickedCorner >= 0 || multi.size > 1) && e.key === 'Escape' || shapeKey)
      && !typing && !e.target.closest('.contact-modal-overlay');
    if (!pointKey && !svg.contains(document.activeElement)) return;
    const step = grid.snap ? grid.step : e.shiftKey ? 5 : 0.5;
    const mv = { ArrowLeft: [-1, 0], ArrowRight: [1, 0], ArrowUp: [0, -1], ArrowDown: [0, 1] }[e.key];
    if (mode === 'move') { // arrows move the whole shape, Esc deselects the corner, Delete deletes the shape
      if (e.key === 'Escape') { // the handle first, then the picked group
        if (pickedCorner >= 0) pickedCorner = -1; else { multi = new Set(); sync(); }
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
      const w = wpt(pts[sel]);
      setPoint(sel, { x: snap(w.x + mv[0] * step), y: snap(w.y + mv[1] * step) });
    } else if (e.key === 'Delete' || e.key === 'Backspace') {
      if (pts.length <= 3) return shake();
      checkpoint();
      pts.splice(sel, 1);
      sel = Math.min(sel, pts.length - 1);
    } else if (e.key === 'Escape') {
      sel = -1;
    } else return;
    e.preventDefault();
    render();
  });

  // Move mode's buttons on the canvas: fit this shape, and mirroring.
  $('se-fit-shape').onclick = () => { checkpoint(); fitted(selShapes()).forEach((sh, k) => (shapes[selIdx()[k]] = sh)); sync(); render(); };
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
  $('se-center').onclick = () => {
    const sh = shapes[active], c = selPivot(); // a group has no mirroring, so it goes to the canvas middle
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
    if (multi.size < 2) for (const g of groups) if (g.ids.includes(shapes[active].id)) delete g.st;
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
    (sel >= 0 ? [pts[sel]] : pts).forEach((p) => (p[key] = v));
    render();
  };
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
        setPoint(sel, { ...wpt(pts[sel]), [k]: v });
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
    if (!turnFrom || shapes[selIdx()[0]] !== turned) { checkpoint(); turnFrom = selBase(); turnPivot = pivotOf(turnFrom.shapes); }
    turnSel(+e.target.value - (turnFrom.group.rot || 0), turnPivot, turnFrom);
    turned = shapes[selIdx()[0]];
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
    if (pts.length <= 3) return shake();
    checkpoint(); pts.splice(sel, 1); sel = -1; render();
  };
  $('se-fit').onclick = () => { checkpoint(); shapes = fitted(shapes); sync(); render(); };
  // Undo and redo each move the current state onto the other stack.
  const travel = (from, to) => {
    if (!from.length) return;
    const now = JSON.stringify(snapshot());
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

  function dialog(id) {
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
        box.setAttribute('aria-hidden', 'true');
        document.body.style.overflow = '';
        opener?.focus();
      },
    };
    box.addEventListener('click', (e) => { if (e.target === box || e.target.closest('[data-close]')) d.close(); });
    box.addEventListener('keydown', (e) => { if (e.key === 'Escape') { e.stopPropagation(); d.close(); } });
    return d;
  }
  const shareDialog = dialog('se-share'), addDialog = dialog('se-add');
  $('se-share-open').onclick = shareDialog.open;

  const copyText = async (text) => {
    try { await navigator.clipboard.writeText(text); } catch (e) {
      const t = Object.assign(document.createElement('textarea'), { value: text });
      document.body.append(t); t.select(); document.execCommand('copy'); t.remove();
    }
  };
  const shareTexts = { edit: () => links.edit, import: () => links.import, path: () => $('se-out').value };
  $('se-share').querySelectorAll('[data-copy]').forEach((card) => {
    const label = card.querySelector('.se-card-sub'), text = label.textContent;
    card.onclick = async () => {
      await copyText(shareTexts[card.dataset.copy]());
      label.textContent = 'Copied to the clipboard';
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
  for (const name of [...Object.keys(PRESETS), ...Object.keys(FIXED)]) {
    const b = document.createElement('button');
    b.type = 'button';
    b.className = 'se-preset';
    b.innerHTML = `<svg viewBox="0 0 100 100" aria-hidden="true"><path d="${presetShapes(name).map(shapePath).join(' ')}"/></svg><span>${name}</span>`;
    b.onclick = () => { loadIcon(presetShapes(name)); svg.scrollIntoView({ behavior: 'smooth', block: 'center' }); };
    $('se-presets').append(b);
  }

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
  // The Add dialog's grid shows the presets, or the pieces of a loaded SVG file until it's unloaded (closing
  // the dialog keeps it). A tap adds one tile; a long press or Ctrl/Cmd+click starts picking several, after
  // which taps toggle tiles until none are left picked, and the bar under the grid adds them.
  let loaded = null; // { pieces, merged, notes, view }; view 'pieces' or 'merged' picks what the grid shows
  const viewList = () => (loaded.view === 'merged' ? loaded.merged.pieces : loaded.pieces);
  const picked = new Set(); // keys of picked tiles: preset names, or piece indices
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
    sel = -1; mode = 'move';
    importNote = notes.filter(Boolean).join(' ');
    picked.clear();
    sync(); addDialog.close(); render();
  }
  const asShapes = (pieces) => pieces.map((path) => ({ path, a: 1, x: 0, y: 0, ang: 0, mirror: 'none', rot: 0 }));
  const addPieces = (pieces) => addShapes(asShapes(pieces), loaded?.notes);
  const addMerged = (m) => addShapes(asShapes(m.pieces), [...(loaded?.notes || []), holesNote(m.holes), apartNote(m.pieces.length)]);

  const tileSvg = (inner) => `<svg viewBox="-4 -4 108 108" aria-hidden="true">${inner}</svg>`;
  function renderAddGrid() {
    const tiles = $('se-add-grid'), full = room() <= 0;
    if (loaded) {
      // Each piece shown in place, over the faded rest of the file, so it's clear which part it is.
      const all = loaded.pieces.map((d) => `<path class="se-tile-ghost" d="${d}"/>`).join(''), name = loaded.view === 'merged' ? 'Merged' : 'Piece';
      tiles.innerHTML = viewList().map((d, k) => `<button type="button" class="se-preset" data-key="${k}" aria-pressed="false">
        ${tileSvg(all + `<path d="${d}"/>`)}<span>${name} ${k + 1}</span></button>`).join('');
    } else {
      tiles.innerHTML = [...Object.keys(PRESETS), ...Object.keys(FIXED)].map((name) => `<button type="button" class="se-preset" data-key="${name}" aria-pressed="false">
        ${tileSvg(`<path d="${presetShapes(name).map(shapePath).join(' ')}"/>`)}<span>${name}</span></button>`).join('');
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
    $('se-add-desc').textContent = `Tap to add${loaded ? ' in place' : ' at full size'}. Long-press or Ctrl+click to pick several.`;
    $('se-import-btn').disabled = full;
    $('se-import-unload').hidden = !loaded;
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
      $('se-pick-count').textContent = `${k} picked` + (k > r ? `, room for ${Math.max(r, 0)}` : '');
      $('se-pick-add').textContent = `Add ${k}`;
      $('se-pick-add').title = loaded && k > 1 ? `Add the ${k} picked as separate shapes` : `Add ${plural(k)}`;
      $('se-pick-add').disabled = k > r;
      $('se-pick-merge').hidden = !merged;
      if (merged) {
        const m = merged.pieces.length;
        $('se-pick-merge').textContent = m === 1 ? 'Merge' : `Merge (${m})`;
        $('se-pick-merge').title = m === 1 ? 'Merge them into one shape' : `Merge them: not all of them touch, so they'd make ${m} shapes`;
        $('se-pick-merge').disabled = m > r;
        $('se-pick-merge').onclick = () => addMerged(merged);
      }
    }
  }
  $('se-pick-add').onclick = () => {
    const keys = [...picked];
    if (loaded) addPieces(keys.map(Number).sort((a, b) => a - b).map((i) => viewList()[i]));
    else addShapes(Object.keys({ ...PRESETS, ...FIXED }).filter((n) => picked.has(n)).flatMap(presetShapes));
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
    else addShapes(presetShapes(key));
  });

  $('se-import-btn').onclick = () => $('se-import-file').click();
  $('se-import-unload').onclick = () => { loaded = null; picked.clear(); importMsg(''); renderAddGrid(); };
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

  // ---------- start ----------

  let saved = null;
  try { saved = JSON.parse(localStorage.getItem(STORE)); } catch (e) { /* private mode or garbage */ }
  if (!restore(saved)) { shapes = presetShapes('Squircle'); sync(); }
  // An edit link replaces the current work, which stays one Undo away. Pasting a link into a tab that
  // already has the editor open only changes the hash, hence the hashchange listener.
  async function openEditLink() {
    if (!location.hash.startsWith('#edit=')) return;
    const data = location.hash.slice(6);
    history.replaceState(null, '', location.pathname + location.search); // a reload then keeps later edits
    let link = null;
    // Drawn shapes pack into a few KB; imported outlines can take more. unpack() caps what a link inflates to.
    if (data.length < 200000) try { link = JSON.parse(await unpack(data)); } catch (e) { /* malformed link */ }
    const before = JSON.stringify(snapshot());
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
  for (const sample of [buildPath(fit(PRESETS['Cookie 7']())), ...Object.values(FIXED), iconPath().d]) {
    console.assert(/^M [\d. -]+( [LC] [\d. -]+)* Z$/.test(sample) && !/[eE]|--|\.\d+\./.test(sample),
      'shape-editor: path not in launcher-safe format', sample);
  }
})();
