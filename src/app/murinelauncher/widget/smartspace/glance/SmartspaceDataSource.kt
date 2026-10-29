// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.content.Context
import android.util.Log
import com.android.launcher3.ConstantItem
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefChangeListener
import com.android.launcher3.LauncherPrefs

/**
 * A source of cards that can be switched off from the widget settings ([enabledPref]).
 * Runs only while started (some widget is on screen), and while enabled and set up.
 * Everything happens on the main thread.
 */
abstract class SmartspaceDataSource(
    val context: Context,
    private val enabledPref: ConstantItem<Boolean>,
) {
    open val isAvailable: Boolean = true

    var cards: List<GlanceCard> = emptyList()
        private set
    var needsSetup = false
        private set

    private var onChange: (() -> Unit)? = null
    private var running = false
    private val prefListener = LauncherPrefChangeListener { _ -> refresh() }

    /** Begins listening for changes, see [publish]. */
    protected abstract fun startSource()

    protected abstract fun stopSource()

    /** Sets the source's current cards. */
    protected fun publish(newCards: List<GlanceCard>) {
        cards = newCards
        onChange?.invoke()
    }

    fun start(onChange: () -> Unit) {
        this.onChange = onChange
        LauncherPrefs.get(context).addListener(prefListener, enabledPref)
        refresh()
    }

    fun stop() {
        LauncherPrefs.get(context).removeListener(prefListener, enabledPref)
        stopRunning()
        onChange = null
    }

    /** Starts the source again, re-checking whether it needs setup. */
    fun restart() {
        stopRunning()
        if (onChange != null) refresh()
    }

    private fun refresh() {
        val enabled = isAvailable && LauncherPrefs.get(context).get(enabledPref)
        needsSetup = enabled && requiresSetup()
        if (enabled && !needsSetup) {
            if (running) return
            running = true
            runCatching { startSource() }.onFailure {
                Log.d("SmartspaceDataSource", "data source errored", it)
                publish(emptyList())
            }
        } else {
            stopRunning()
            publish(emptyList())
        }
    }

    private fun stopRunning() {
        if (!running) return
        running = false
        stopSource()
    }

    open fun requiresSetup(): Boolean = false

    open fun startSetup(launcher: Launcher) {}

    /** Called when the widget becomes visible again. */
    open fun onVisible() {}
}
