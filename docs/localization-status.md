---
layout: page
title: Localization status
subtitle: Shows the status of each translation
permalink: /localization-status/
sitemap: false   # keep it out of sitemap.xml
noindex: true    # and out of search engines
---

<style>
.lang-table { width: 100%; border-collapse: collapse; margin: 1.5rem 0; font-size: .95rem; }
.lang-table th, .lang-table td { padding: .7rem .8rem; text-align: left; border-bottom: 1px solid var(--md-outline-variant); }
.lang-table th { font-weight: 600; color: var(--md-on-surface-variant); font-size: .82rem;
                 text-transform: uppercase; letter-spacing: .04em; }
.lang-table tr:last-child td { border-bottom: none; }
.lang-table code { font-size: .85em; }
.lang-native { color: var(--md-on-surface-variant); }
.lang-link { text-decoration: none; }
.lang-link:hover strong { text-decoration: underline; }
.lang-status { white-space: nowrap; }
.lang-credits { max-width: 16ch; }
.lang-bar { display: block; height: 4px; border-radius: var(--md-shape-full);
            background: var(--md-surface-container-highest); overflow: hidden; margin-top: .35rem; }
.lang-bar > span { display: block; height: 100%; background: var(--md-primary); }
.lang-legend { list-style: none; padding: 0; }
.lang-legend li { margin: .3rem 0; }
@media (max-width: 640px) { .lang-hide-sm { display: none; } }
</style>

The launcher's own strings live in `strings_murine.xml`. Everything inherited from
AOSP Launcher3 is translated upstream into 85 locales and is not tracked here.

<table class="lang-table">
  <thead>
    <tr>
      <th>Language</th>
      <th>Code</th>
      <th>Strings</th>
      <th>Status</th>
      <th class="lang-hide-sm">Reviewed by</th>
    </tr>
  </thead>
  <tbody>
  {% for lang in site.data.languages.languages %}
    {% assign pct = lang.strings | times: 100.0 | divided_by: site.data.languages.total %}
    {% if lang.code == 'en' %}{% assign dir = 'values' %}{% else %}{% assign dir = 'values-' | append: lang.code %}{% endif %}
    {% assign strings_url = 'https://github.com/' | append: site.github_repo | append: '/blob/main/res/' | append: dir | append: '/strings_murine.xml' %}
    <tr>
      <td>
        <a href="{{ strings_url }}" class="lang-link">
          <strong>{{ lang.name }}</strong>
          {% if lang.native != lang.name %}<br><span class="lang-native">{{ lang.native }}</span>{% endif %}
        </a>
      </td>
      <td>
        <a href="{{ strings_url }}"><code>{{ lang.code }}</code></a>
      </td>
      <td>
        {{ lang.strings }} / {{ site.data.languages.total }}
        <span class="lang-bar"><span style="width: {{ pct }}%"></span></span>
      </td>
      <td class="lang-status">
        {% case lang.status %}
          {% when 'reviewed' %}✅ Fully reviewed
          {% when 'mostly' %}🟢 Mostly reviewed
          {% when 'partial' %}🟡 Partially reviewed
          {% when 'ai' %}🤖 AI slop
          {% else %}❔ Unknown
        {% endcase %}
        {% if lang.note %}<br><span class="lang-native">{{ lang.note }}</span>{% endif %}
      </td>
      <td class="lang-hide-sm">
        {%- assign gits = lang.by_git | default: '' | split: ', ' -%}
        {%- assign names = lang.by | default: '' | split: ', ' -%}
        {%- capture credits -%}
          {%- for g in gits -%}<a href="https://github.com/{{ g }}">{{ g }}</a>{%- unless forloop.last -%}, {% endunless -%}{%- endfor -%}
          {%- if gits.size > 0 and names.size > 0 -%}, {% endif -%}
          {%- for n in names -%}{{ n }}{%- unless forloop.last -%}, {% endunless -%}{%- endfor -%}
        {%- endcapture -%}
        {%- if credits == blank -%}<span class="lang-native">nobody yet</span>{%- else -%}<div class="lang-credits">{{ credits }}</div>{%- endif -%}
      </td>
    </tr>
  {% endfor %}
  </tbody>
</table>

## What the statuses mean

<ul class="lang-legend">
  <li>✅ <strong>Fully reviewed</strong>: every string read by someone who speaks the language.</li>
  <li>🟢 <strong>Mostly reviewed</strong>: was fully reviewed, then a few strings were added and
      have not been checked yet.</li>
  <li>🟡 <strong>Partially reviewed</strong>: some strings checked by a human, the rest machine-translated.</li>
  <li>🤖 <strong>AI slop</strong>: machine-translated and nobody has read it yet; there may be some mistakes.</li>
</ul>

## Helping out

Click any language above to open its `strings_murine.xml`, then modify or create one and create
a pull request (or just send it to me).
That counts as a review in itself: going through the file to fix the awkward strings means
someone who speaks the language has read it, so it gets marked ✅ unless you say otherwise.
Fixing even a handful of strings is a perfectly good contribution.

Read through one and found nothing worth changing? That is still a review. Just
<a href="#contact" onclick="openContactModal(); return false;">contact me</a> saying which
language you checked and it gets marked accordingly, no pull request needed.

To add a language that is not listed, copy `res/values/strings_murine.xml` into a new
`res/values-<code>/` folder and translate it there.
