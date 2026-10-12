package app.murinelauncher.settings

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import androidx.core.graphics.PathParser
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.graphics.ThemeManager
import com.android.launcher3.settings.SettingsActivity
import com.android.launcher3.shapes.ShapesProvider
import java.io.ByteArrayOutputStream
import java.util.zip.Inflater
import java.util.zip.InflaterInputStream

/**
 * The Custom icon shape: made on the website's editor, sent back with murine-home://icon-shape?shape=...
 */
object CustomIconShape {
    private const val EDITOR_URL = "https://www.murinelauncher.app/icon-shapes/"
    private const val MAX_PATH = 200_000 // characters, far more than the website's shapes take

    fun openEditor(context: Context) =
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(EDITOR_URL)).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))

    /**
     * The website's import link: a path that checks out is saved and picked as the icon shape, then Settings
     * reopens (replacing whatever it had open) on Icons, with Icon shape highlighted.
     */
    private fun importShape(activity: Activity) {
        activity.intent?.data?.getQueryParameter("shape")?.let(::unpack)?.let { path ->
            LauncherPrefs.get(activity).put(
                ThemeManager.PREF_CUSTOM_ICON_SHAPE to path,
                ThemeManager.PREF_ICON_SHAPE to ShapesProvider.IconShape.CUSTOM)
        }
        activity.startActivities(arrayOf(
            Intent(activity, SettingsActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK),
            Intent(activity, SettingsActivity::class.java)
                .putExtra(SettingsActivity.EXTRA_FRAGMENT, SettingsIconsFragment::class.java.name)
                .putExtra(SettingsActivity.EXTRA_FRAGMENT_HIGHLIGHT_KEY, SettingsIconsFragment.ICON_SHAPE_KEY)))
    }

    /**
     * Receives the import link (see AndroidManifest-common.xml) in a task of its own: sent to SettingsActivity,
     * a Settings task already open would just come to the front, and the link would never arrive.
     */
    class ImportActivity : Activity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            importShape(this)
            finish()
        }
    }

    /**
     * The link's path (raw deflate, base64url, in the 0-100 box), or null unless it inflates to a sane size and
     * parses: anyone can send this link, and a path that doesn't parse would break icon loading.
     */
    private fun unpack(data: String): String? = try {
        // The extra 0 byte: raw ("nowrap") inflating may need one past the end of the data
        val bytes = Base64.decode(data, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP) + 0.toByte()
        val out = ByteArrayOutputStream()
        InflaterInputStream(bytes.inputStream(), Inflater(true)).use { input ->
            val buf = ByteArray(8192)
            var n = 0
            while (out.size() <= MAX_PATH && input.read(buf).also { n = it } >= 0) out.write(buf, 0, n)
        }
        out.takeIf { it.size() <= MAX_PATH }?.toString("UTF-8")?.trim()
            ?.takeIf { it.startsWith("M") }?.also { PathParser.createPathFromPathData(it) }
    } catch (e: Exception) {
        null
    }
}
