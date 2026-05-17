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
