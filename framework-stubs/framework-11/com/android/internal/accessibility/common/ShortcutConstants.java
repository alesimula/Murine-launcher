package com.android.internal.accessibility.common;

public final class ShortcutConstants {
    public static final java.lang.String CHOOSER_PACKAGE_NAME = "android";
    public static final char SERVICES_SEPARATOR = ':';
    private ShortcutConstants() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessibilityFragmentType {
        public static final int VOLUME_SHORTCUT_TOGGLE = 0;
        public static final int INVISIBLE_TOGGLE = 1;
        public static final int TOGGLE = 2;
        public static final int LAUNCH_ACTIVITY = 3;
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
    }
}
