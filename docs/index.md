---
layout: default
title: Home
---

<!-- Hero -->
<section class="hero">
  <div class="hero-inner">
    <div class="hero-text">
      <h1>r4l.launcher<br><span class="accent">Your home. Your categories.</span></h1>
      <p class="hero-desc">Rafael Maciel's personal Android home screen. Organize your apps with offline categories, swipe between groups, and keep search within reach.</p>
      <div class="hero-actions">
        <a href="{{ '/download' | relative_url }}" class="btn-filled">
          <span class="material-symbols-outlined">&#xF090;</span> <!-- download -->
          Download
        </a>
        <a href="https://github.com/rafaeltj13/r4l.launcher" class="btn-outlined" target="_blank" rel="noopener">
          <span class="material-symbols-outlined">&#xE86F;</span> <!-- code -->
          Source Code
        </a>
      </div>
    </div>
    <div class="hero-visual">
      <div class="hero-icon-wrapper" id="heroIcon">
        <button class="hero-icon-flip" aria-label="Flip the icon">
          <img class="hero-icon-face" src="{{ '/assets/img/icon_adaptive_baked.svg' | relative_url }}" alt="r4l.launcher icon">
          <img class="hero-icon-face hero-icon-back" src="{{ '/assets/img/icon_freeform_baked.svg' | relative_url }}" alt="r4l.launcher icon, freeform" aria-hidden="true">
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
    <p>Built on Murine Launcher and AOSP Launcher3, with optional category tabs and bottom drawer search.</p>
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
      <p>Keep Android 15 Private Space apps in their protected drawer section, separate from ordinary categories.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">&#xE8B6;</span> <!-- search -->
      </div>
      <h3>Customised QuickSearchBox</h3>
      <p>Choose your search provider and optional search buttons. Move drawer search to the bottom to keep it above the keyboard.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-feather"></span>
      </div>
      <h3>Lightweight</h3>
      <p>Built on AOSP Launcher3 with home-screen grids, widgets, icon packs, and gestures.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon icon-bestfeature"></span>
      </div>
      <h3>Offline app categories</h3>
      <p>Create your own groups, choose their icons, and swipe between categories. Sorting and manual assignments stay on your device.</p>
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

<!-- Compatibility -->
<section class="compat-section">
  <div class="compat-card">
    <div class="compat-icon">
      <span class="material-symbols-outlined">&#xE32C;</span> <!-- smartphone -->
    </div>
    <div class="compat-details">
      <h3>Compatibility</h3>
      <p>r4l.launcher supports <strong>Android 8 (Oreo)</strong> and above.</p>
      <p>Blur effects require <strong>Android 12+</strong>. Some OEMs or ROMs may hide or disable window-level blurs - check for an "Allow window-level blurs" option in Display or Developer Options.</p>
      <p>On rooted devices, you can try enabling the <a href="https://github.com/Magisk-Modules-Alt-Repo/enable-blurs" target="_blank" rel="noopener">enable-blurs Magisk module</a>.</p>
    </div>
  </div>
</section>
