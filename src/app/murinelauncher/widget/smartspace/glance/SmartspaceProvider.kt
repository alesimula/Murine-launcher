// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.content.Context
import android.view.View
import com.android.launcher3.Launcher
import com.android.launcher3.R
import com.android.launcher3.views.ActivityContext

/** Combines all card sources; shared by every At a Glance widget, running only while one is on screen. */
class SmartspaceProvider private constructor(private val context: Context) {

    private val dataSources = listOf(
        SmartspaceWidgetReader(context),
        BatteryStatusProvider(context),
        TorchProvider(context),
        NowPlayingProvider(context),
    )
    private val listeners = mutableListOf<(List<GlanceCard>) -> Unit>()
    private var cards = emptyList<GlanceCard>()

    /** Calls [listener] with the current cards now and on every change, until removed. */
    fun addListener(listener: (List<GlanceCard>) -> Unit) {
        if (listeners.isEmpty()) dataSources.forEach { it.start(::update) }
        listeners += listener
        listener(cards)
    }

    fun removeListener(listener: (List<GlanceCard>) -> Unit) {
        listeners -= listener
        if (listeners.isEmpty()) dataSources.forEach { it.stop() }
    }

    private fun update() {
        val needSetup = dataSources.filter { it.needsSetup }
        cards = (if (needSetup.isEmpty()) emptyList() else listOf(setupTarget(needSetup))) + dataSources.flatMap { it.cards }
        listeners.forEach { it(cards) }
    }

    /** Lets sources whose setup state may have changed while away (e.g. notification access) restart. */
    fun onVisible() = dataSources.forEach { it.onVisible() }

    private fun setupTarget(sources: List<SmartspaceDataSource>) = GlanceCard(
        // title = context.getString(R.string.glance_setup_required),
        title = "Tap to setup",
        score = GlanceCard.SCORE_SETUP,
        onClick = View.OnClickListener { view ->
            val launcher = ActivityContext.lookupContext<Launcher>(view.context)
            sources.forEach { it.startSetup(launcher) }
        },
    )

    companion object {
        private var instance: SmartspaceProvider? = null

        /** Main thread only, like everything here. */
        fun get(context: Context) = instance ?: SmartspaceProvider(context.applicationContext).also { instance = it }
    }
}
