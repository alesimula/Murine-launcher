package app.murinelauncher.widget.search

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.annotation.DrawableRes
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
    QWANT(
        displayName = "Qwant",
        searchUrlTemplate = "https://www.qwant.com/?q=%s",
        homepageUrl = "https://www.qwant.com",
        iconRes = R.drawable.ic_murine_search_provider_google
    ),
    ECOSIA(
        displayName = "Ecosia",
        searchUrlTemplate = "https://www.ecosia.org/search?q=%s",
        homepageUrl = "https://www.ecosia.org",
        iconRes = R.drawable.ic_murine_search_provider_google
    ),
    STARTPAGE(
        displayName = "Startpage",
        searchUrlTemplate = "https://www.startpage.com/do/dsearch?query=%s",
        homepageUrl = "https://www.startpage.com",
        iconRes = R.drawable.ic_murine_search_provider_google
    ),
    BRAVE(
        displayName = "Brave Search",
        searchUrlTemplate = "https://search.brave.com/search?q=%s",
        homepageUrl = "https://search.brave.com",
        iconRes = R.drawable.ic_murine_search_provider_google
    );

    fun buildSearchUrl(query: String): String {
        return searchUrlTemplate.format(Uri.encode(query))
    }

    fun buildSearchIntent(query: String): Intent {
        return Intent(Intent.ACTION_VIEW, Uri.parse(buildSearchUrl(query)))
    }

    fun buildHomepageIntent(): Intent {
        return Intent(Intent.ACTION_VIEW, Uri.parse(homepageUrl))
    }

    companion object {
        @JvmStatic var current: SearchProvider = DUCKDUCKGO; private set

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
