package com.android.internal.accessibility.common;

public final class ShortcutConstants {
    public static final java.lang.String CHOOSER_PACKAGE_NAME = "android";
    public static final char SERVICES_SEPARATOR = ':';
    public static final int[] USER_SHORTCUT_TYPES = null;
    public static final java.lang.String[] GENERAL_SHORTCUT_SETTINGS = null;
    public static final java.lang.String[] MAGNIFICATION_SHORTCUT_SETTINGS = null;
    public static final java.util.Map<android.content.ComponentName, android.content.ComponentName> A11Y_FEATURE_TO_FRAMEWORK_TILE = null;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessibilityFragmentType {
        public static final int VOLUME_SHORTCUT_TOGGLE = 0;
        public static final int INVISIBLE_TOGGLE = 1;
        public static final int TOGGLE = 2;
        public static final int LAUNCH_ACTIVITY = 3;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FloatingMenuSize {
        public static final int UNKNOWN = -1;
        public static final int SMALL = 0;
        public static final int LARGE = 1;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShortcutMenuMode {
        public static final int LAUNCH = 0;
        public static final int EDIT = 1;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserShortcutType {
        public static final int DEFAULT = 0;
        public static final int SOFTWARE = 1;
        public static final int HARDWARE = 2;
        public static final int TRIPLETAP = 4;
        public static final int TWOFINGER_DOUBLETAP = 8;
        public static final int QUICK_SETTINGS = 16;
        public static final int GESTURE = 32;
        public static final int KEY_GESTURE = 64;
        public static final int ALL = 127;
    }
}
