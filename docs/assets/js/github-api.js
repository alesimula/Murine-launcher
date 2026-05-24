// GitHub API - Dynamic release info & screenshots
(function () {
  'use strict';

  var REPO = 'alesimula/Murine-launcher';
  var API = 'https://api.github.com/repos/' + REPO;

  // --- Markdown to HTML (lightweight) ---
  function mdToHtml(md) {
    if (!md) return '';
    var html = md
      // code blocks
      .replace(/```(\w*)\n([\s\S]*?)```/g, '<pre><code>$2</code></pre>')
      // inline code
      .replace(/`([^`]+)`/g, '<code>$1</code>')
      // headings
      .replace(/^### (.+)$/gm, '<h3>$1</h3>')
      .replace(/^## (.+)$/gm, '<h2>$1</h2>')
      .replace(/^# (.+)$/gm, '<h1>$1</h1>')
      // bold + italic
      .replace(/\*\*\*(.+?)\*\*\*/g, '<strong><em>$1</em></strong>')
      .replace(/\*\*(.+?)\*\*/g, '<strong>$1</strong>')
      .replace(/\*(.+?)\*/g, '<em>$1</em>')
      // images
      .replace(/!\[([^\]]*)\]\(([^)]+)\)/g, '<img alt="$1" src="$2">')
      // links
      .replace(/\[([^\]]+)\]\(([^)]+)\)/g, '<a href="$2" target="_blank" rel="noopener">$1</a>')
      // unordered lists
      .replace(/^\s*[-*] (.+)$/gm, '<li>$1</li>')
      // blockquote
      .replace(/^> (.+)$/gm, '<blockquote>$1</blockquote>')
      // horizontal rules
      .replace(/^---+$/gm, '<hr>')
      // paragraphs (double newline)
      .replace(/\n\n+/g, '</p><p>')
      // single newlines to <br>
      .replace(/\n/g, '<br>');

    // wrap consecutive <li> in <ul>
    html = html.replace(/((?:<li>.*?<\/li><br>?)+)/g, function (match) {
      return '<ul>' + match.replace(/<br>/g, '') + '</ul>';
    });

    return '<p>' + html + '</p>';
  }

  function formatBytes(bytes) {
    if (!bytes) return '';
    var sizes = ['B', 'KB', 'MB', 'GB'];
    var i = Math.floor(Math.log(bytes) / Math.log(1024));
    return (bytes / Math.pow(1024, i)).toFixed(1) + ' ' + sizes[i];
  }

  function formatDate(dateStr) {
    var d = new Date(dateStr);
    return d.toLocaleDateString('en-US', { year: 'numeric', month: 'short', day: 'numeric' });
  }

  // --- Latest Release ---
  function loadLatestRelease() {
    var container = document.getElementById('latestRelease');
    if (!container) return;

    fetch(API + '/releases/latest')
      .then(function (res) {
        if (!res.ok) throw new Error('HTTP ' + res.status);
        return res.json();
      })
      .then(function (release) {
        renderRelease(release, container);
        // Update hero version
        var badge = document.getElementById('versionBadge');
        if (badge) badge.textContent = release.tag_name;
        var heroDesc = document.getElementById('releaseDate');
        if (heroDesc) heroDesc.textContent = 'Released ' + formatDate(release.published_at);
      })
      .catch(function (err) {
        console.error('Failed to load release:', err);
        container.innerHTML =
          '<div class="error-state">' +
          '<span class="material-symbols-outlined">&#xE2C1;</span>' /* cloud_off */ +
          '<p>Could not load release info.</p>' +
          '<p style="font-size:0.8125rem">Check the <a href="https://github.com/' + REPO + '/releases" target="_blank">releases page</a> directly.</p>' +
          '</div>';
      });
  }

  function renderRelease(release, container) {
    var apkAssets = release.assets.filter(function (a) {
      return a.name.endsWith('.apk');
    });
    apkAssets.sort(function (a, b) {
      var aDebug = /debug/i.test(a.name) ? 1 : 0;
      var bDebug = /debug/i.test(b.name) ? 1 : 0;
      return aDebug - bDebug;
    });
    var otherAssets = release.assets.filter(function (a) {
      return !a.name.endsWith('.apk');
    });

    var assetsHtml = '';
    if (apkAssets.length > 0 || otherAssets.length > 0) {
      assetsHtml = '<div class="release-assets"><h3>Assets</h3><div class="asset-list">';

      apkAssets.forEach(function (asset) {
        assetsHtml +=
          '<a href="' + asset.browser_download_url + '" class="asset-item">' +
          '<div class="asset-info"><span class="material-symbols-outlined">&#xE859;</span>' /* android */ +
          '<span class="asset-name">' + asset.name + '</span></div>' +
          '<span class="asset-size">' + formatBytes(asset.size) + '</span></a>';
      });

      otherAssets.forEach(function (asset) {
        assetsHtml +=
          '<a href="' + asset.browser_download_url + '" class="asset-item">' +
          '<div class="asset-info"><span class="material-symbols-outlined">&#xE873;</span>' /* description */ +
          '<span class="asset-name">' + asset.name + '</span></div>' +
          '<span class="asset-size">' + formatBytes(asset.size) + '</span></a>';
      });

      assetsHtml += '</div></div>';
    }

    container.innerHTML =
      '<div class="release-card">' +
      '<div class="release-card-header">' +
      '<h2><span class="material-symbols-outlined">&#xE031;</span>' /* new_releases */ + (release.name || release.tag_name) + '</h2>' +
      '<div class="release-meta">' +
      '<span><span class="material-symbols-outlined">&#xE935;</span>' /* calendar_today */ + formatDate(release.published_at) + '</span>' +
      '<span><span class="material-symbols-outlined">&#xF05B;</span>' /* sell */ + release.tag_name + '</span>' +
      '</div></div>' +
      '<div class="release-body"><div class="release-notes">' + mdToHtml(release.body) + '</div></div>' +
      assetsHtml +
      '<div class="release-footer">' +
      '<a href="https://github.com/' + REPO + '/releases" class="btn-text" target="_blank" rel="noopener">' +
      '<span class="material-symbols-outlined">&#xE889;</span>View all releases</a>' /* history */ +
      '</div></div>';

    // Also update download button href
    if (apkAssets.length > 0) {
      var dlBtn = document.getElementById('downloadBtn');
      if (dlBtn) dlBtn.href = apkAssets[0].browser_download_url;
    }
  }

  // --- Screenshots ---
  function loadScreenshots() {
    var container = document.getElementById('screenshotGallery');
    if (!container) return;

    // Fetch directory listing from GitHub API
    fetch(API + '/contents/fastlane/metadata/android/en-US/images/phoneScreenshots')
      .then(function (res) {
        if (!res.ok) throw new Error('HTTP ' + res.status);
        return res.json();
      })
      .then(function (files) {
        // Filter to image files and sort
        var images = files
          .filter(function (f) {
            return /\.(png|jpg|jpeg|webp)$/i.test(f.name);
          })
          .sort(function (a, b) {
            return a.name.localeCompare(b.name, undefined, { numeric: true });
          });

        if (images.length === 0) {
          container.innerHTML = '<div class="error-state"><p>No screenshots found.</p></div>';
          return;
        }

        var html = '<div class="screenshot-scroll">';
        images.forEach(function (img) {
          var rawUrl = 'https://raw.githubusercontent.com/' + REPO + '/main/fastlane/metadata/android/en-US/images/phoneScreenshots/' + img.name;
          html +=
            '<div class="screenshot-item">' +
            '<img src="' + rawUrl + '" alt="Screenshot ' + img.name + '" loading="lazy">' +
            '</div>';
        });
        html += '</div>';
        container.innerHTML = html;
      })
      .catch(function (err) {
        console.error('Failed to load screenshots:', err);
        // Fallback: use known screenshot names
        var html = '<div class="screenshot-scroll">';
        for (var i = 1; i <= 7; i++) {
          var rawUrl = 'https://raw.githubusercontent.com/' + REPO + '/main/fastlane/metadata/android/en-US/images/phoneScreenshots/' + i + '.png';
          html +=
            '<div class="screenshot-item">' +
            '<img src="' + rawUrl + '" alt="Screenshot ' + i + '" loading="lazy">' +
            '</div>';
        }
        html += '</div>';
        container.innerHTML = html;
      });
  }

  // --- Init ---
  document.addEventListener('DOMContentLoaded', function () {
    loadLatestRelease();
    loadScreenshots();
  });
})();
