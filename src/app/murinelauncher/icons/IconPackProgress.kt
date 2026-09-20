package app.murinelauncher.icons

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.pm.LauncherApps
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.doOnAttach
import androidx.core.view.updateLayoutParams
import com.android.launcher3.Utilities
import com.android.launcher3.util.Executors
import com.google.android.material.progressindicator.LinearProgressIndicator
import java.util.concurrent.atomic.AtomicInteger

/**
 * Thin progress bar floating over the current activity while an icon pack is applied.
 */
object IconPackProgress : Application.ActivityLifecycleCallbacks {

    /** No icon for this long ends the bar; must outlast the longest gap between icons. */
    private const val IDLE_MS = 2_000L
    /** The loader may take a while to reach the first icon; [IDLE_MS] only applies after it. */
    private const val START_GRACE_MS = 15_000L

    private val main = Handler(Looper.getMainLooper())
    private val done = AtomicInteger()
    @Volatile private var total = 0
    private var percent = 0
    private var cur: Activity? = null
    private var bar: LinearProgressIndicator? = null
    private val idle = Runnable { stop() }

    @JvmStatic
    fun install(app: Application) = app.registerActivityLifecycleCallbacks(this)

    /**
     * Call right before the model reload that applies a pack.
     */
    @JvmStatic
    fun start(context: Context) {
        val app = context.applicationContext
        done.set(0)
        percent = 0
        Executors.UI_HELPER_EXECUTOR.execute {
            val la = app.getSystemService(LauncherApps::class.java)
            total = la.profiles.sumOf { la.getActivityList(null, it).size }.coerceAtLeast(1)
        }
        main.post { attach()?.progress = 0 }
        main.postDelayed(idle, START_GRACE_MS)
    }

    /**
     * One icon resolved; only calls the main thread then the percentage changes.
     */
    @JvmStatic
    fun tick() {
        val n = done.incrementAndGet()
        val t = total
        if (t == 0) return
        val p = (n * 100 / t).coerceAtMost(99) // the total is an estimate, never finish when reaching it
        if (p == percent) return
        percent = p
        main.post { attach()?.setProgressCompat(p, true) }
        main.removeCallbacks(idle)
        main.postDelayed(idle, IDLE_MS)
    }

    private fun attach(): LinearProgressIndicator? {
        bar?.let { return it }
        val a = cur ?: return null
        val root = a.window.decorView as? ViewGroup ?: return null
        val themed = ContextThemeWrapper(
            a, com.google.android.material.R.style.Theme_Material3_DynamicColors_DayNight)

        fun applyTopMargin(view: View, top: Int) {
            if (top <= 0) return
            val params = view.layoutParams as? FrameLayout.LayoutParams ?: return
            if (params.topMargin != top) {
                params.topMargin = top
                view.layoutParams = params
            }
        }

        val initialTop = ViewCompat.getRootWindowInsets(root)?.getInsets(WindowInsetsCompat.Type.systemBars())?.top ?: 0
        return LinearProgressIndicator(themed).apply {
            max = 100
            layoutParams = FrameLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT, Gravity.TOP).apply { topMargin = initialTop }
            ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
                val top = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top
                applyTopMargin(v, top)
                insets
            }
            root.addView(this)
            doOnAttach { v ->
                val attachedTop = ViewCompat.getRootWindowInsets(v)
                    ?.getInsets(WindowInsetsCompat.Type.systemBars())?.top ?: 0
                applyTopMargin(v, attachedTop)
                ViewCompat.requestApplyInsets(v)
            }
            bar = this
        }
    }

    private fun detach() {
        (bar?.parent as? ViewGroup)?.removeView(bar)
        bar = null
    }

    /**
     * Every queued icon has been written: the reload is done.
     */
    @JvmStatic
    fun finish() {
        if (total == 0) return
        main.removeCallbacks(idle)
        main.post { attach()?.setProgressCompat(100, true); stop() }
    }

    private fun stop() {
        total = 0
        detach()
    }

    override fun onActivityResumed(activity: Activity) {
        cur = activity
        if (total > 0) attach()?.progress = percent
    }

    override fun onActivityPaused(activity: Activity) {
        if (activity === cur) {
            detach()
            cur = null
        }
    }

    override fun onActivityCreated(activity: Activity, state: Bundle?) = Unit
    override fun onActivityStarted(activity: Activity) = Unit
    override fun onActivityStopped(activity: Activity) = Unit
    override fun onActivitySaveInstanceState(activity: Activity, out: Bundle) = Unit
    override fun onActivityDestroyed(activity: Activity) = Unit
}
