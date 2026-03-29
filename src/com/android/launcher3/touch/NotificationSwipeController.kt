package com.android.launcher3.touch

import android.graphics.PointF
import android.view.MotionEvent
import android.view.ViewConfiguration
import com.android.launcher3.AbstractFloatingView
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.LauncherState
import com.android.launcher3.MotionEventsUtils
import com.android.launcher3.util.TouchController
import kotlin.math.abs

/**
 * TouchController that detects a downward swipe on the workspace and expands the notifications.
 */
class NotificationSwipeController(private val mLauncher: Launcher) : TouchController {
    private val mTouchSlop: Float
    private var mCanIntercept = false
    private val mDownPoint = PointF()

    init {
        // Double the touch-slop to guard against accidental taps / micro-moves.
        mTouchSlop = (2 * ViewConfiguration.get(mLauncher).getScaledTouchSlop()).toFloat()
    }

    override fun onControllerInterceptTouchEvent(ev: MotionEvent): Boolean {
        val action = ev.getActionMasked()

        if (action == MotionEvent.ACTION_DOWN) {
            mCanIntercept = canInterceptTouch(ev)
            if (mCanIntercept) mDownPoint.set(ev.getX(), ev.getY())
            return false
        }
        if (!mCanIntercept) return false
        if (action == MotionEvent.ACTION_MOVE && ev.getPointerCount() == 1) {
            val dy = ev.getY() - mDownPoint.y
            val dx = ev.getX() - mDownPoint.x

            if (dy > mTouchSlop && dy > abs(dx)) {
                expandNotifications()
                return true
            }
            // Horizontal movement won; cancel gesture
            if (abs(dx) > mTouchSlop) mCanIntercept = false
        }
        return false
    }

    override fun onControllerTouchEvent(ev: MotionEvent): Boolean {
        // After intercept, just consume until the gesture ends.
        val action = ev.getActionMasked()
        return action != MotionEvent.ACTION_UP && action != MotionEvent.ACTION_CANCEL
    }

    private fun canInterceptTouch(ev: MotionEvent) = !MotionEventsUtils.isTrackpadScroll(ev) &&
            LauncherPrefs.GESTURE_SWIPE_DOWN_NOTIFICATIONS.get(mLauncher) &&
            mLauncher.isInState(LauncherState.NORMAL) &&
            AbstractFloatingView.getTopOpenView(mLauncher) == null &&
            // Ignore touches in the navbar region.
            ev.getY() <= (mLauncher.getDragLayer().getHeight() - mLauncher.deviceProfile.getInsets().bottom);

    private fun expandNotifications() {
        try {
            val sbService = mLauncher.getSystemService("statusbar")
            if (sbService != null) sbService.javaClass.getMethod("expandNotificationsPanel")
                .invoke(sbService)
        } catch (_: Exception) {}
    }
}
