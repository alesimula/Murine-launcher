package app.murinelauncher.widget.search

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R

/**
 * Configurable search providers for the Murine search bar.
 * Each provider defines a name, search URL template, and optional homepage.
 */
enum class SearchProvider(
    val displayName: String,
    val searchUrlTemplate: String,
    val homepageUrl: String,
    val iconRes: Int
) {
    CUSTOM(
        displayName = "Custom",
        searchUrlTemplate = "",
        homepageUrl = "",
        iconRes = R.drawable.ic_murine_search_provider_custom
    ),
    GOOGLE(
        displayName = "Google",
        searchUrlTemplate = "https://www.google.com/search?q=%s",
        homepageUrl = "https://www.google.com",
        iconRes = R.drawable.ic_murine_search_provider_google
    ),
    DUCKDUCKGO(
        displayName = "DuckDuckGo",
        searchUrlTemplate = "https://duckduckgo.com/?q=%s",
        homepageUrl = "https://duckduckgo.com",
        iconRes = R.drawable.ic_murine_search_provider_duck
    ),
    STARTPAGE(
        displayName = "Startpage",
        searchUrlTemplate = "https://www.startpage.com/do/dsearch?query=%s",
        homepageUrl = "https://www.startpage.com",
        iconRes = R.drawable.ic_murine_search_provider_startpage
    ),
    QWANT(
        displayName = "Qwant",
        searchUrlTemplate = "https://www.qwant.com/?q=%s",
        homepageUrl = "https://www.qwant.com",
        iconRes = R.drawable.ic_murine_search_provider_qwant
    ),
    ECOSIA(
        displayName = "Ecosia",
        searchUrlTemplate = "https://www.ecosia.org/search?q=%s",
        homepageUrl = "https://www.ecosia.org",
        iconRes = R.drawable.ic_murine_search_provider_ecosia
    ),
    BRAVE(
        displayName = "Brave Search",
        searchUrlTemplate = "https://search.brave.com/search?q=%s",
        homepageUrl = "https://search.brave.com",
        iconRes = R.drawable.ic_murine_search_provider_brave
    ),
    BING(
        displayName = "Bing",
        searchUrlTemplate = "https://www.bing.com/search?q=%s",
        homepageUrl = "https://www.bing.com",
        iconRes = R.drawable.ic_murine_search_provider_bing
    );

    fun buildSearchUrl(context: Context, query: String): String {
        var searchUrlTemplate = if (this.searchUrlTemplate.isBlank())
            LauncherPrefs.QSB_SEARCH_PROVIDER_CUSTOM.get(context) else this.searchUrlTemplate
        try {
            searchUrlTemplate = searchUrlTemplate.format(Uri.encode(query))
        } catch (_: Exception) {}
        return searchUrlTemplate
    }

    fun getDisplayName(context: Context): String =
        if (this == CUSTOM) context.getString(R.string.search_provider_custom) else displayName

    fun buildSearchIntent(context: Context, query: String): Intent {
        var uri: Uri
        try {
            uri = Uri.parse(buildSearchUrl(context, query))
        } catch (_: Exception) {
            uri = Uri.parse(BLANK_PAGE)
        }
        return Intent(Intent.ACTION_VIEW, uri)
    }

    fun buildHomepageIntent(context: Context): Intent {
        var homepageUrl: String = this.homepageUrl
        if (homepageUrl.isBlank()) {
            var searchUrl: String = searchUrlTemplate
            if (searchUrl.isBlank()) searchUrl = LauncherPrefs.QSB_SEARCH_PROVIDER_CUSTOM.get(context)
            try {
                val uri = Uri.parse(LauncherPrefs.QSB_SEARCH_PROVIDER_CUSTOM.get(context))
                homepageUrl = uri.getScheme() + "://" + uri.getEncodedAuthority()
            } catch (_: Exception) {homepageUrl = BLANK_PAGE}
        }
        return Intent(Intent.ACTION_VIEW, Uri.parse(homepageUrl))
    }

    companion object {
        @JvmStatic var current: SearchProvider = DUCKDUCKGO; private set
        const val BLANK_PAGE = "about:blank"

        @JvmStatic
        fun load(context: Context) {
            current = try {
                LauncherPrefs.QSB_SEARCH_PROVIDER.get(context)
            } catch (_: IllegalArgumentException) {
                DUCKDUCKGO
            }
        }

        @JvmStatic
        fun save(context: Context, provider: SearchProvider) {
            current = provider
            LauncherPrefs.get(context)
                .put(LauncherPrefs.QSB_SEARCH_PROVIDER.to(provider));
        }
    }
}
