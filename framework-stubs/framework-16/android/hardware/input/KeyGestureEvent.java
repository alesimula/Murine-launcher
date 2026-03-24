package android.hardware.input;

public final class KeyGestureEvent {
    public static final int KEY_GESTURE_TYPE_SYSTEM_RESERVED = -1;
    public static final int KEY_GESTURE_TYPE_UNSPECIFIED = 0;
    public static final int KEY_GESTURE_TYPE_HOME = 1;
    public static final int KEY_GESTURE_TYPE_RECENT_APPS = 2;
    public static final int KEY_GESTURE_TYPE_BACK = 3;
    public static final int KEY_GESTURE_TYPE_APP_SWITCH = 4;
    public static final int KEY_GESTURE_TYPE_LAUNCH_ASSISTANT = 5;
    public static final int KEY_GESTURE_TYPE_LAUNCH_VOICE_ASSISTANT = 6;
    public static final int KEY_GESTURE_TYPE_LAUNCH_SYSTEM_SETTINGS = 7;
    public static final int KEY_GESTURE_TYPE_TOGGLE_NOTIFICATION_PANEL = 8;
    public static final int KEY_GESTURE_TYPE_TOGGLE_TASKBAR = 9;
    public static final int KEY_GESTURE_TYPE_TAKE_SCREENSHOT = 10;
    public static final int KEY_GESTURE_TYPE_SCREENSHOT_CHORD = 11;
    public static final int KEY_GESTURE_TYPE_OPEN_SHORTCUT_HELPER = 12;
    public static final int KEY_GESTURE_TYPE_BRIGHTNESS_UP = 13;
    public static final int KEY_GESTURE_TYPE_BRIGHTNESS_DOWN = 14;
    public static final int KEY_GESTURE_TYPE_KEYBOARD_BACKLIGHT_UP = 15;
    public static final int KEY_GESTURE_TYPE_KEYBOARD_BACKLIGHT_DOWN = 16;
    public static final int KEY_GESTURE_TYPE_KEYBOARD_BACKLIGHT_TOGGLE = 17;
    public static final int KEY_GESTURE_TYPE_VOLUME_UP = 18;
    public static final int KEY_GESTURE_TYPE_VOLUME_DOWN = 19;
    public static final int KEY_GESTURE_TYPE_VOLUME_MUTE = 20;
    public static final int KEY_GESTURE_TYPE_ALL_APPS = 21;
    public static final int KEY_GESTURE_TYPE_LAUNCH_SEARCH = 22;
    public static final int KEY_GESTURE_TYPE_LANGUAGE_SWITCH = 23;
    @java.lang.Deprecated
    public static final int DEPRECATED_KEY_GESTURE_TYPE_ACCESSIBILITY_ALL_APPS = 24;
    public static final int KEY_GESTURE_TYPE_TOGGLE_CAPS_LOCK = 25;
    public static final int KEY_GESTURE_TYPE_SYSTEM_MUTE = 26;
    public static final int KEY_GESTURE_TYPE_SPLIT_SCREEN_NAVIGATION_LEFT = 27;
    public static final int KEY_GESTURE_TYPE_SPLIT_SCREEN_NAVIGATION_RIGHT = 28;
    public static final int KEY_GESTURE_TYPE_CHANGE_SPLITSCREEN_FOCUS_LEFT = 29;
    public static final int KEY_GESTURE_TYPE_CHANGE_SPLITSCREEN_FOCUS_RIGHT = 30;
    public static final int KEY_GESTURE_TYPE_TRIGGER_BUG_REPORT = 31;
    public static final int KEY_GESTURE_TYPE_LOCK_SCREEN = 32;
    public static final int KEY_GESTURE_TYPE_OPEN_NOTES = 33;
    public static final int KEY_GESTURE_TYPE_TOGGLE_POWER = 34;
    public static final int KEY_GESTURE_TYPE_SYSTEM_NAVIGATION = 35;
    public static final int KEY_GESTURE_TYPE_SLEEP = 36;
    public static final int KEY_GESTURE_TYPE_WAKEUP = 37;
    public static final int KEY_GESTURE_TYPE_MEDIA_KEY = 38;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_BROWSER = 39;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_EMAIL = 40;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_CONTACTS = 41;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_CALENDAR = 42;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_CALCULATOR = 43;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_MUSIC = 44;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_MAPS = 45;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_MESSAGING = 46;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_GALLERY = 47;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_FILES = 48;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_WEATHER = 49;
    public static final int KEY_GESTURE_TYPE_LAUNCH_DEFAULT_FITNESS = 50;
    public static final int KEY_GESTURE_TYPE_LAUNCH_APPLICATION = 51;
    public static final int KEY_GESTURE_TYPE_DESKTOP_MODE = 52;
    public static final int KEY_GESTURE_TYPE_MULTI_WINDOW_NAVIGATION = 53;
    public static final int KEY_GESTURE_TYPE_RECENT_APPS_SWITCHER = 54;
    public static final int KEY_GESTURE_TYPE_ACCESSIBILITY_SHORTCUT_CHORD = 55;
    public static final int KEY_GESTURE_TYPE_RINGER_TOGGLE_CHORD = 56;
    public static final int KEY_GESTURE_TYPE_GLOBAL_ACTIONS = 57;
    @java.lang.Deprecated
    public static final int DEPRECATED_KEY_GESTURE_TYPE_TV_ACCESSIBILITY_SHORTCUT_CHORD = 58;
    public static final int KEY_GESTURE_TYPE_TV_TRIGGER_BUG_REPORT = 59;
    public static final int KEY_GESTURE_TYPE_ACCESSIBILITY_SHORTCUT = 60;
    public static final int KEY_GESTURE_TYPE_CLOSE_ALL_DIALOGS = 61;
    public static final int KEY_GESTURE_TYPE_MOVE_TO_NEXT_DISPLAY = 62;
    public static final int KEY_GESTURE_TYPE_TOGGLE_SCREEN_READER = 63;
    public static final int KEY_GESTURE_TYPE_TOGGLE_STICKY_KEYS = 64;
    public static final int KEY_GESTURE_TYPE_TOGGLE_BOUNCE_KEYS = 65;
    public static final int KEY_GESTURE_TYPE_TOGGLE_SLOW_KEYS = 66;
    public static final int KEY_GESTURE_TYPE_TOGGLE_MOUSE_KEYS = 67;
    public static final int KEY_GESTURE_TYPE_SNAP_LEFT_FREEFORM_WINDOW = 68;
    public static final int KEY_GESTURE_TYPE_SNAP_RIGHT_FREEFORM_WINDOW = 69;
    public static final int KEY_GESTURE_TYPE_MINIMIZE_FREEFORM_WINDOW = 70;
    public static final int KEY_GESTURE_TYPE_TOGGLE_MAXIMIZE_FREEFORM_WINDOW = 71;
    public static final int KEY_GESTURE_TYPE_TOGGLE_MAGNIFICATION = 72;
    public static final int KEY_GESTURE_TYPE_ACTIVATE_SELECT_TO_SPEAK = 73;
    public static final int KEY_GESTURE_TYPE_MAXIMIZE_FREEFORM_WINDOW = 74;
    public static final int KEY_GESTURE_TYPE_TOGGLE_DO_NOT_DISTURB = 75;
    public static final int KEY_GESTURE_TYPE_TOGGLE_VOICE_ACCESS = 76;
    public static final int KEY_GESTURE_TYPE_SWITCH_TO_PREVIOUS_DESK = 77;
    public static final int KEY_GESTURE_TYPE_SWITCH_TO_NEXT_DESK = 78;
    public static final int FLAG_CANCELLED = 1;
    public static final int FLAG_LONG_PRESS = 2;
    public static final int ACTION_GESTURE_START = 1;
    public static final int ACTION_GESTURE_COMPLETE = 2;
    public static boolean isVisibleBackgrounduserAllowedGesture(int p0) { return false; }
    public KeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) {}
    public boolean hasModifiers(int p0) { return false; }
    public int getDeviceId() { return 0; }
    @android.annotation.NonNull
    public int[] getKeycodes() { return null; }
    public int getModifierState() { return 0; }
    public int getKeyGestureType() { return 0; }
    public int getAction() { return 0; }
    public int getDisplayId() { return 0; }
    public int getFlags() { return 0; }
    public boolean isCancelled() { return false; }
    public boolean isLongPress() { return false; }
    public int getLogEvent() { return 0; }
    @android.annotation.Nullable
    public android.hardware.input.AppLaunchData getAppLaunchData() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        public Builder() {}
        public android.hardware.input.KeyGestureEvent.Builder setDeviceId(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setKeycodes(int[] p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setModifierState(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setKeyGestureType(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setAction(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setDisplayId(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setFlags(int p0) { return null; }
        public android.hardware.input.KeyGestureEvent.Builder setAppLaunchData(android.hardware.input.AppLaunchData p0) { return null; }
        public android.hardware.input.KeyGestureEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyGestureType {
    }
}
