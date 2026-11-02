// Material Expressive - Theme Toggle & Nav Scroll
(function () {
  'use strict';

  // --- Theme ---
  const STORAGE_KEY = 'murine-theme';

  function getPreferred() {
    const stored = localStorage.getItem(STORAGE_KEY);
    if (stored) return stored;
    return window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light';
  }

  function applyTheme(theme) {
    document.documentElement.setAttribute('data-theme', theme);
    const icon = document.getElementById('themeIcon');
    if (icon) icon.textContent = theme === 'dark' ? '\uE518' /*light_mode*/ : '\uE51C' /*dark_mode*/;
  }

  applyTheme(getPreferred());

  document.addEventListener('DOMContentLoaded', function () {
    applyTheme(getPreferred());

    var toggle = document.getElementById('themeToggle');
    if (toggle) {
      toggle.addEventListener('click', function () {
        var current = document.documentElement.getAttribute('data-theme') || 'light';
        var next = current === 'dark' ? 'light' : 'dark';
        localStorage.setItem(STORAGE_KEY, next);
        applyTheme(next);
      });
    }

    // --- Pages bubble ---
    var pagesBtn = document.getElementById('pagesBtn');
    var bubble = document.getElementById('pagesBubble');
    function placeBubble() { // centred under the button, kept 12px inside the viewport; the tail follows the button
      var r = pagesBtn.getBoundingClientRect(), w = bubble.offsetWidth, vw = document.documentElement.clientWidth;
      var cx = r.left + r.width / 2, left = Math.min(Math.max(cx - w / 2, 12), vw - w - 12);
      bubble.style.left = left + 'px';
      bubble.style.top = (r.bottom + 12) + 'px';
      bubble.style.setProperty('--tail-x', (cx - left) + 'px');
    }
    function setBubbleOpen(open) {
      if (open) placeBubble();
      bubble.classList.toggle('open', open);
      pagesBtn.setAttribute('aria-expanded', open);
    }
    if (pagesBtn && bubble) {
      pagesBtn.addEventListener('click', function (e) {
        e.stopPropagation();
        setBubbleOpen(!bubble.classList.contains('open'));
      });
      document.addEventListener('click', function (e) { if (!bubble.contains(e.target)) setBubbleOpen(false); });
      document.addEventListener('keydown', function (e) { if (e.key === 'Escape') setBubbleOpen(false); });
      window.addEventListener('resize', function () { if (bubble.classList.contains('open')) placeBubble(); });
      window.addEventListener('scroll', function () { setBubbleOpen(false); }, { passive: true });
    }

    // --- Nav scroll shadow ---
    var nav = document.getElementById('topNav');
    if (nav) {
      window.addEventListener('scroll', function () {
        if (window.scrollY > 8) {
          nav.classList.add('scrolled');
        } else {
          nav.classList.remove('scrolled');
        }
      }, { passive: true });
    }
  });
})();
