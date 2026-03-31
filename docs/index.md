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
          <span class="material-symbols-outlined">download</span>
          Download
        </a>
        <a href="https://github.com/alesimula/Murine-launcher" class="btn-outlined" target="_blank" rel="noopener">
          <span class="material-symbols-outlined">code</span>
          Source Code
        </a>
      </div>
    </div>
    <div class="hero-visual">
      <div class="hero-icon-wrapper">
        <img src="https://raw.githubusercontent.com/alesimula/Murine-launcher/refs/heads/main/image/app_icon/icon_browser_fullsize.svg" alt="Murine Launcher icon">
      </div>
    </div>
  </div>
</section>

<!-- Features -->
<section class="features-section">
  <div class="section-header">
    <h2>What it has to offer</h2>
    <p>Built on AOSP Launcher3, Murine Launcher keeps things clean while adding a little touches here and there.</p>
  </div>
  <div class="features-grid">
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">palette</span>
      </div>
      <h3>Modern UI</h3>
      <p>Built on the foundations of modern Launcher3, and enhanced with AOSP Material Expressive settings ported from LineageOS</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">blur_on</span>
      </div>
      <h3>Blur Effects</h3>
      <p>Frosted glass and MICA-style translucency effects on the app drawer and search bar. Supported on Android 12+ with compatible OEM/ROMs.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">search</span>
      </div>
      <h3>Customised QuickSearchBox</h3>
      <p>Can look great without needing Google; disable the Lens button, choose your preferred search engine, or disable it alltogether if it's not your thing.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="material-symbols-outlined">speed</span>
      </div>
      <h3>Lightweight</h3>
      <p>Very close to its AOSP source, with some enhancements but no bloat. Very tiny, very light, very demure.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon" style="--icon-url: url('{{ '/assets/img/ic_bestfeature.svg' | relative_url }}')"></span>
      </div>
      <h3>Designed by a mouse</h3>
      <p>Are you tired of apps designed by humans? This one was built by a mouse, no (excessive) desire for money, will not sell out or sell you out, mice only deal in cheese and crumbs.</p>
    </div>
    <div class="feature-card">
      <div class="feature-icon">
        <span class="custom-icon" style="--icon-url: url('{{ '/assets/img/ic_clippy.svg' | relative_url }}')"></span>
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
      <span class="material-symbols-outlined">hourglass_top</span>
      Loading screenshots&hellip;
    </div>
  </div>
</section>

<!-- Compatibility -->
<section class="compat-section">
  <div class="compat-card">
    <div class="compat-icon">
      <span class="material-symbols-outlined">smartphone</span>
    </div>
    <div class="compat-details">
      <h3>Compatibility</h3>
      <p>Murine Launcher supports <strong>Android 8 (Oreo)</strong> and above.</p>
      <p>Blur effects require <strong>Android 12+</strong>. Some OEMs or ROMs may hide or disable window-level blurs - check for an "Allow window-level blurs" option in Display or Developer Options.</p>
      <p>On rooted devices, you can try enabling the <a href="https://github.com/Magisk-Modules-Alt-Repo/enable-blurs" target="_blank" rel="noopener">enable-blurs Magisk module</a>.</p>
    </div>
  </div>
</section>
