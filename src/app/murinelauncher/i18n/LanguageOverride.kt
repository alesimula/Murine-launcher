package app.murinelauncher.i18n

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import com.android.launcher3.LauncherFiles
import java.util.Locale

object LanguageOverride {
    const val LANGUAGE_SYSTEM = "system"
    const val LANGUAGE_NORWEGIAN = "nb"
    const val LANGUAGE_ENGLISH = "en"
    const val PREF_LANGUAGE = "pref_launcher_language"

    @JvmStatic
    fun getLanguage(context: Context): String =
        context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
            .getString(PREF_LANGUAGE, LANGUAGE_SYSTEM) ?: LANGUAGE_SYSTEM

    @JvmStatic
    fun setLanguage(context: Context, languageTag: String) {
        context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
            .edit()
            .putString(PREF_LANGUAGE, languageTag)
            .apply()
        updateApplicationResources(context.applicationContext, languageTag)
    }

    @JvmStatic
    @JvmOverloads
    fun applyLocale(context: Context, prefContext: Context = context): Context {
        val languageTag = getLanguage(prefContext)
        if (languageTag == LANGUAGE_SYSTEM) return context

        val configuration = Configuration(context.resources.configuration)
        val locale = Locale.forLanguageTag(languageTag)
        configuration.setLocale(locale)
        configuration.setLayoutDirection(locale)
        return context.createConfigurationContext(configuration)
    }

    @JvmStatic
    fun isLocaleStale(context: Context): Boolean {
        val selected = getLanguage(context)
        val expected = if (selected == LANGUAGE_SYSTEM) {
            Resources.getSystem().configuration.locales[0].toLanguageTag()
        } else {
            Locale.forLanguageTag(selected).toLanguageTag()
        }
        val current = context.resources.configuration.locales[0].toLanguageTag()
        return current != expected
    }

    @Suppress("DEPRECATION")
    private fun updateApplicationResources(context: Context, languageTag: String) {
        val locale = if (languageTag == LANGUAGE_SYSTEM) {
            Resources.getSystem().configuration.locales[0]
        } else {
            Locale.forLanguageTag(languageTag)
        }
        val configuration = Configuration(context.resources.configuration)
        configuration.setLocale(locale)
        configuration.setLayoutDirection(locale)
        context.resources.updateConfiguration(configuration, context.resources.displayMetrics)
    }
}
