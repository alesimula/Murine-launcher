package android.view;

public interface WindowManagerPolicyConstants {
    public static final int FLAG_WAKE = 1;
    public static final int FLAG_VIRTUAL = 2;
    public static final int FLAG_INJECTED = 16777216;
    public static final int FLAG_TRUSTED = 33554432;
    public static final int FLAG_FILTERED = 67108864;
    public static final int FLAG_DISABLE_KEY_REPEAT = 134217728;
    public static final int FLAG_INTERACTIVE = 536870912;
    public static final int FLAG_PASS_TO_USER = 1073741824;
    public static final int KEYGUARD_GOING_AWAY_FLAG_TO_SHADE = 1;
    public static final int KEYGUARD_GOING_AWAY_FLAG_NO_WINDOW_ANIMATIONS = 2;
    public static final int KEYGUARD_GOING_AWAY_FLAG_WITH_WALLPAPER = 4;
    public static final int KEYGUARD_GOING_AWAY_FLAG_SUBTLE_WINDOW_ANIMATIONS = 8;
    public static final int PRESENCE_INTERNAL = 1;
    public static final int PRESENCE_EXTERNAL = 2;
    public static final int NAV_BAR_INVALID = -1;
    public static final int NAV_BAR_LEFT = 1;
    public static final int NAV_BAR_RIGHT = 2;
    public static final int NAV_BAR_BOTTOM = 4;
    public static final int NAV_BAR_MODE_3BUTTON = 0;
    public static final int NAV_BAR_MODE_2BUTTON = 1;
    public static final int NAV_BAR_MODE_GESTURAL = 2;
    public static final java.lang.String NAV_BAR_MODE_3BUTTON_OVERLAY = "com.android.internal.systemui.navbar.threebutton";
    public static final java.lang.String NAV_BAR_MODE_2BUTTON_OVERLAY = "com.android.internal.systemui.navbar.twobutton";
    public static final java.lang.String NAV_BAR_MODE_GESTURAL_OVERLAY = "com.android.internal.systemui.navbar.gestural";
    public static final java.lang.String ACTION_USER_ACTIVITY_NOTIFICATION = "android.intent.action.USER_ACTIVITY_NOTIFICATION";
    public static final java.lang.String ACTION_HDMI_PLUGGED = "android.intent.action.HDMI_PLUGGED";
    public static final java.lang.String EXTRA_HDMI_PLUGGED_STATE = "state";
    public static final java.lang.String EXTRA_FROM_HOME_KEY = "android.intent.extra.FROM_HOME_KEY";
    public static final int OFF_BECAUSE_OF_ADMIN = 1;
    public static final int OFF_BECAUSE_OF_USER = 2;
    public static final int OFF_BECAUSE_OF_TIMEOUT = 3;
    public static final int ON_BECAUSE_OF_USER = 1;
    public static final int ON_BECAUSE_OF_APPLICATION = 2;
    public static final int ON_BECAUSE_OF_UNKNOWN = 3;
    public static final int APPLICATION_LAYER = 2;
    public static final int APPLICATION_MEDIA_SUBLAYER = -2;
    public static final int APPLICATION_MEDIA_OVERLAY_SUBLAYER = -1;
    public static final int APPLICATION_PANEL_SUBLAYER = 1;
    public static final int APPLICATION_SUB_PANEL_SUBLAYER = 2;
    public static final int APPLICATION_ABOVE_SUB_PANEL_SUBLAYER = 3;
    public static java.lang.String onReasonToString(int p0) { return null; }
    public static java.lang.String offReasonToString(int p0) { return null; }

    public static interface PointerEventListener {
        public void onPointerEvent(android.view.MotionEvent p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OnReason {
    }
}
