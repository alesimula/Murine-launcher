// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.drawable.Icon
import android.media.MediaMetadata
import android.media.session.MediaController
import android.media.session.MediaSessionManager
import android.media.session.PlaybackState
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.getSystemService
import app.murinelauncher.settings.SettingsIconsFragment
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.notification.NotificationListener
import com.android.launcher3.settings.SettingsActivity

/**
 * The media that's playing, from the active media sessions. Lawnchair reads them from its own
 * notifications; the sessions need the same notification access, which notification dots grant.
 */
class NowPlayingProvider(context: Context) :
    SmartspaceDataSource(context, LauncherPrefs.GLANCE_MEDIA) {

    private val listenerComponent = ComponentName(context, NotificationListener::class.java)
    private val defaultIcon = Icon.createWithResource(context, R.drawable.ic_glance_music_note)

    private var hadAccess = hasNotificationAccess(context)

    private val sessionManager = context.getSystemService<MediaSessionManager>()
    private val handler = Handler(Looper.getMainLooper())
    private var controllers = emptyList<MediaController>()
    private var listening = false

    private val callback = object : MediaController.Callback() {
        override fun onPlaybackStateChanged(state: PlaybackState?) = update()
        override fun onMetadataChanged(metadata: MediaMetadata?) = update()
    }
    private val sessionsListener = MediaSessionManager.OnActiveSessionsChangedListener(::setControllers)

    // Without notification access the sessions can't be read: nothing to show until it's granted
    override fun startSource() {
        if (sessionManager == null || !hasNotificationAccess(context)) {
            publish(emptyList())
            return
        }
        listening = true
        sessionManager.addOnActiveSessionsChangedListener(sessionsListener, listenerComponent, handler)
        setControllers(sessionManager.getActiveSessions(listenerComponent))
    }

    override fun stopSource() {
        if (!listening) return
        listening = false
        sessionManager?.removeOnActiveSessionsChangedListener(sessionsListener)
        setControllers(null)
    }

    private fun setControllers(newControllers: List<MediaController>?) {
        controllers.forEach { it.unregisterCallback(callback) }
        controllers = newControllers.orEmpty()
        controllers.forEach { it.registerCallback(callback, handler) }
        update()
    }

    private fun update() {
        val playing = controllers.firstOrNull { it.playbackState?.state == PlaybackState.STATE_PLAYING }
        publish(listOfNotNull(playing?.let(::getCard)))
    }

    private fun getCard(controller: MediaController): GlanceCard? {
        val metadata = controller.metadata ?: return null
        val title = metadata.getString(MediaMetadata.METADATA_KEY_TITLE)?.takeIf { it.isNotEmpty() } ?: return null
        val subtitle = metadata.getString(MediaMetadata.METADATA_KEY_ARTIST)?.takeIf { it.isNotEmpty() }
            ?: appName(controller.packageName)
        val sessionActivity = controller.sessionActivity
        return GlanceCard(
            title = title,
            subtitle = subtitle,
            icon = defaultIcon,
            score = GlanceCard.SCORE_MEDIA,
            pendingIntent = sessionActivity,
            onClick = if (sessionActivity == null) View.OnClickListener { controller.transportControls.pause() } else null,
        )
    }

    private fun appName(packageName: String) = runCatching {
        val pm = context.packageManager
        pm.getApplicationLabel(pm.getApplicationInfo(packageName, 0)).toString()
    }.getOrNull()

    override fun onVisible() {
        val hasAccess = hasNotificationAccess(context)
        if (hasAccess != hadAccess) {
            hadAccess = hasAccess
            restart()
        }
    }

    companion object {
        fun hasNotificationAccess(context: Context) =
            NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.packageName)

        /** The notification dots setting, highlighted. */
        fun notificationDotsSettingsIntent(context: Context): Intent = Intent(context, SettingsActivity::class.java)
            .putExtra(SettingsActivity.EXTRA_FRAGMENT, SettingsIconsFragment::class.java.name)
            .putExtra(SettingsActivity.EXTRA_FRAGMENT_HIGHLIGHT_KEY, SettingsIconsFragment.NOTIFICATION_DOTS_PREFERENCE_KEY)
    }
}
