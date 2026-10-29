// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.content.Context
import android.graphics.drawable.Icon
import android.hardware.camera2.CameraManager
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.content.getSystemService
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R

/** "Flashlight on", tapping it turns the flashlight off. */
class TorchProvider(context: Context) :
    SmartspaceDataSource(context, LauncherPrefs.GLANCE_TORCH) {

    private val cameraManager = context.getSystemService<CameraManager>()

    // Torch callbacks only come for cameras with a flash: remember the one that's on
    private var torchCameraId: String? = null
    private val callback = object : CameraManager.TorchCallback() {
        override fun onTorchModeChanged(cameraId: String, enabled: Boolean) {
            if (enabled) torchCameraId = cameraId else if (cameraId == torchCameraId) torchCameraId = null
            publish(listOfNotNull(torchCameraId?.let(::getCard)))
        }

        override fun onTorchModeUnavailable(cameraId: String) = onTorchModeChanged(cameraId, false)
    }

    override fun startSource() {
        torchCameraId = null
        publish(emptyList())
        cameraManager?.registerTorchCallback(callback, Handler(Looper.getMainLooper()))
    }

    override fun stopSource() {
        cameraManager?.unregisterTorchCallback(callback)
    }

    private fun getCard(cameraId: String) = GlanceCard(
        title = context.getString(R.string.glance_torch_on),
        subtitle = context.getString(R.string.glance_torch_off_action),
        icon = Icon.createWithResource(context, R.drawable.ic_glance_flashlight_off),
        score = GlanceCard.SCORE_FLASHLIGHT,
        onClick = View.OnClickListener { runCatching { cameraManager?.setTorchMode(cameraId, false) } },
    )
}
