---
layout: default
title: Home
---

<!-- Hero -->
<section class="hero">
  <div class="hero-inner">
    <div class="hero-text">
      <h1>Open launcher,<br><span class="accent">plain and simple.</span></h1>
      <p class="hero-desc">
        A modern, lightweight FOSS Launcher3 fork delivering an enhanced stock Android experience, 
         providing a familiar AOSP feel out of the box, with some sprinkles on top :3 <br/><br/>
        Offers a minimalistic yet polished home screen interface with essential customization options, with zero bloat.
      </p>
      <div class="hero-actions">
        <a href="{{ '/download' | relative_url }}" class="btn-filled">
          <span class="material-symbols-outlined">&#xF090;</span> <!-- download -->
          Download
        </a>
        <a href="https://github.com/alesimula/Murine-launcher" class="btn-outlined" target="_blank" rel="noopener">
          <span class="material-symbols-outlined">&#xE86F;</span> <!-- code -->
          Source Code
        </a>
      </div>
    </div>
    <div class="hero-visual">
      <div class="hero-icon-wrapper" id="heroIcon">
        <button class="hero-icon-flip" aria-label="Flip the icon">
          <img class="hero-icon-face" src="{{ '/assets/img/icon_adaptive_baked.svg' | relative_url }}" alt="Murine Launcher icon">
          <img class="hero-icon-face hero-icon-back" src="{{ '/assets/img/icon_freeform_baked.svg' | relative_url }}" alt="Murine Launcher icon, freeform" aria-hidden="true">
        </button>
      </div>
    </div>
  </div>
</section>

<script>
  const heroIcon = document.getElementById('heroIcon');
  const heroFlip = heroIcon.querySelector('.hero-icon-flip');
  const reduceMotion = window.matchMedia('(prefers-reduced-motion: reduce)');
  heroIcon.addEventListener('click', () => {
    if (reduceMotion.matches) { heroIcon.classList.toggle('flipped'); return; }
    if (!heroIcon.classList.contains('flipping')) {
      heroIcon.classList.add('flipping');   // 3D on, still showing the current face
      void heroFlip.offsetWidth;            // commit that before the transition starts
      heroIcon.classList.add('animating');
    }
    heroIcon.classList.toggle('flipped');   // mid-flip, this reverses from the current angle
  });
  // Back to flat 2D once the flip ends (same pixels, no jump)
  heroFlip.addEventListener('transitionend', () => heroIcon.classList.remove('flipping', 'animating'));
</script>

<!-- Features -->
<section class="features-section">
  <div class="section-header">
    <h2>What it has to offer</h2>
    <p>Built on AOSP Launcher3, Murine Launcher keeps things clean while adding a little touches here and there.</p>
  </div>
  <div class="features-grid">
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">&#xE40A;</span> <!-- palette -->
      </div>
      <h3>Modern UI & Blur Effects</h3>
      <p>Built on the foundations of modern Launcher3, enhanced with AOSP Material Expressive settings and Frosted glass and MICA-style translucency effects (for supported ROMs)</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-private-space"></span>
      </div>
      <h3>Private Space Integration</h3>
      <p>Native support for Android 15's Private Space: every mouse needs a burrow; hide your sensitive apps and data from prying eyes.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">&#xE8B6;</span> <!-- search -->
      </div>
      <h3>Customised QuickSearchBox</h3>
      <p>Can look great without needing Google; disable the Lens button, choose your preferred search engine, or disable it alltogether if it's not your thing.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-feather"></span>
      </div>
      <h3>Lightweight</h3>
      <p>Very close to its AOSP source, with some enhancements but no bloat. Very tiny, very light, very demure.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-bestfeature"></span>
      </div>
      <h3>Designed by a mouse</h3>
      <p>Are you tired of apps designed by humans? This one was built by a mouse, no (excessive) desire for money, will not sell out or sell you out, mice only deal in cheese and crumbs.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-clippy"></span>
      </div>
      <h3>Free &amp; Open Source</h3>
      <p>Fully open source, licensed under the Apache 2.0 license. No tracking, no ads, no data collection, no internet access.</p>
    </div>
  </div>
</section>

<!-- Screenshots -->
<section class="screenshots-section">
  <div class="section-header">
    <h2>See how it looks</h2>
    <p>Screenshots from the latest release. Scroll to explore.</p>
  </div>
  <div id="screenshotGallery">
    <div class="screenshot-loading">
      <span class="material-symbols-outlined">&#xEA5B;</span> <!-- hourglass_top -->
      Loading screenshots&hellip;
    </div>
  </div>
</section>

<!-- Icon shapes -->
<section class="compat-section shapes-section">
  <div class="compat-card shapes-card">
    <div class="compat-icon">
      <span class="material-symbols-outlined">&#xE602;</span> <!-- shapes -->
    </div>
    <div class="compat-details">
      <h3>Make your own icon shape</h3>
      <p>Pick a preset, draw your own shape or import an SVG, then send it straight to Murine Launcher
        (<strong>Settings &rsaquo; Icons &rsaquo; Icon shape &rsaquo; Custom</strong>).</p>
      <a href="{{ '/icon-shapes/' | relative_url }}" class="btn-filled">
        <span class="material-symbols-outlined">&#xE602;</span> <!-- shapes -->
        Open shape editor
      </a>
    </div>
    <div class="shapes-preview" aria-hidden="true">
      <svg viewBox="0 0 100 100"><circle cx="50" cy="50" r="50"/></svg>
      <svg viewBox="0 0 100 100"><path d="M50 0C88 0 100 12 100 50S88 100 50 100 0 88 0 50 12 0 50 0Z"/></svg>
      <svg viewBox="0 0 100 100"><path d="M50 0C52.2 0 54.3 2.1 56 4.5C57.7 6.9 59 9.2 60.8 9.7C62.6 10.2 64.9 8.9 67.6 7.6C70.2 6.4 73.1 5.6 75 6.7C76.9 7.8 77.7 10.7 77.9 13.6C78.2 16.5 78.2 19.2 79.5 20.5C80.8 21.8 83.5 21.8 86.4 22.1C89.3 22.3 92.2 23.1 93.3 25C94.4 26.9 93.6 29.8 92.4 32.4C91.1 35.1 89.8 37.4 90.3 39.2C90.8 41 93.1 42.3 95.5 44C97.9 45.7 100 47.8 100 50C100 52.2 97.9 54.3 95.5 56C93.1 57.7 90.8 59 90.3 60.8C89.8 62.6 91.1 64.9 92.4 67.6C93.6 70.2 94.4 73.1 93.3 75C92.2 76.9 89.3 77.7 86.4 77.9C83.5 78.2 80.8 78.2 79.5 79.5C78.2 80.8 78.2 83.5 77.9 86.4C77.7 89.3 76.9 92.2 75 93.3C73.1 94.4 70.2 93.6 67.6 92.4C64.9 91.1 62.6 89.8 60.8 90.3C59 90.8 57.7 93.1 56 95.5C54.3 97.9 52.2 100 50 100C47.8 100 45.7 97.9 44 95.5C42.3 93.1 41 90.8 39.2 90.3C37.4 89.8 35.1 91.1 32.4 92.4C29.8 93.6 26.9 94.4 25 93.3C23.1 92.2 22.3 89.3 22.1 86.4C21.8 83.5 21.8 80.8 20.5 79.5C19.2 78.2 16.5 78.2 13.6 77.9C10.7 77.7 7.8 76.9 6.7 75C5.6 73.1 6.4 70.2 7.6 67.6C8.9 64.9 10.2 62.6 9.7 60.8C9.2 59 6.9 57.7 4.5 56C2.1 54.3 0 52.2 0 50C0 47.8 2.1 45.7 4.5 44C6.9 42.3 9.2 41 9.7 39.2C10.2 37.4 8.9 35.1 7.6 32.4C6.4 29.8 5.6 26.9 6.7 25C7.8 23.1 10.7 22.3 13.6 22.1C16.5 21.8 19.2 21.8 20.5 20.5C21.8 19.2 21.8 16.5 22.1 13.6C22.3 10.7 23.1 7.8 25 6.7C26.9 5.6 29.8 6.4 32.4 7.6C35.1 8.9 37.4 10.2 39.2 9.7C41 9.2 42.3 6.9 44 4.5C45.7 2.1 47.8 0 50 0Z"/></svg>
      <svg viewBox="0 0 100 100"><path d="M 0 50 C 0 22.39 22.39 0 50 0 L 88 0 C 94.63 0 100 5.37 100 12 L 100 50 C 100 77.61 77.61 100 50 100 L 12 100 C 5.37 100 0 94.63 0 88 Z"/></svg>
      <svg viewBox="0 0 100 100"><path d="M50 2C62 2 64 14 76 18S98 26 98 50 88 78 76 82 62 98 50 98 38 86 24 82 2 74 2 50 12 22 24 18 38 2 50 2Z"/></svg>
      <svg viewBox="0 0 100 100"><path d="M50 0C55.2 0 60.1 4.4 63.2 9.4C66.3 14.4 67.8 19.1 70.8 21.3C73.9 23.5 78.9 23.5 84.6 24.9C90.3 26.3 95.9 29.6 97.6 34.5C99.2 39.5 96.5 45.5 92.7 50C88.9 54.5 84.9 57.4 83.7 61C82.6 64.5 84.1 69.3 84.6 75.1C85 81 83.6 87.4 79.4 90.5C75.2 93.5 68.6 92.9 63.2 90.6C57.8 88.4 53.7 85.5 50 85.5C46.3 85.5 42.2 88.4 36.8 90.6C31.4 92.9 24.8 93.5 20.6 90.5C16.4 87.4 15 81 15.4 75.1C15.9 69.3 17.4 64.5 16.3 61C15.1 57.4 11.1 54.5 7.3 50C3.5 45.5 0.8 39.5 2.4 34.5C4.1 29.6 9.7 26.3 15.4 24.9C21.1 23.5 26.1 23.5 29.2 21.3C32.2 19.1 33.7 14.4 36.8 9.4C39.9 4.4 44.8 0 50 0Z"/></svg>
    </div>
  </div>
</section>

<!-- Compatibility -->
<section class="compat-section">
  <div class="compat-card">
    <div class="compat-icon">
      <span class="material-symbols-outlined">&#xE32C;</span> <!-- smartphone -->
    </div>
    <div class="compat-details">
      <h3>Compatibility</h3>
      <p>Murine Launcher supports <strong>Android 8 (Oreo)</strong> and above.</p>
      <p>Blur effects require <strong>Android 12+</strong>. Some OEMs or ROMs may hide or disable window-level blurs - check for an "Allow window-level blurs" option in Display or Developer Options.</p>
      <p>On rooted devices, you can try enabling the <a href="https://github.com/Magisk-Modules-Alt-Repo/enable-blurs" target="_blank" rel="noopener">enable-blurs Magisk module</a>.</p>
    </div>
  </div>
</section>
