package app.murinelauncher.service

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Intent
import android.view.accessibility.AccessibilityEvent

class MurineAccessibilityService: AccessibilityService() {
    public companion object {
        @JvmField public var INSTANCE: MurineAccessibilityService? = null;
    }

    override fun onServiceConnected() {
        serviceInfo = AccessibilityServiceInfo().apply {
            // Set the type of events that this service wants to listen to.  Others
            // won't be passed to this service.
            eventTypes = 0

            // If you only want this service to work with specific applications, set their
            // package names here.  Otherwise, when the service is activated, it will listen
            // to events from all applications.
            packageNames = emptyArray()
        }
        INSTANCE = this
        super.onServiceConnected()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        INSTANCE = null;
        return super.onUnbind(intent)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int = START_STICKY

    override fun onAccessibilityEvent(p0: AccessibilityEvent?) {}

    override fun onInterrupt() {}
}
