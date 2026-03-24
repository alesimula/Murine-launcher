package android.view;

public interface WindowManager extends android.view.ViewManager {
    public static final int DOCKED_INVALID = -1;
    public static final int DOCKED_LEFT = 1;
    public static final int DOCKED_TOP = 2;
    public static final int DOCKED_RIGHT = 3;
    public static final int DOCKED_BOTTOM = 4;
    public static final java.lang.String INPUT_CONSUMER_PIP = "pip_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_NAVIGATION = "nav_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_WALLPAPER = "wallpaper_input_consumer";
    public static final java.lang.String INPUT_CONSUMER_RECENTS_ANIMATION = "recents_animation_input_consumer";
    public static final int SHELL_ROOT_LAYER_DIVIDER = 0;
    public static final int SHELL_ROOT_LAYER_PIP = 1;
    public static final int TRANSIT_OLD_UNSET = -1;
    public static final int TRANSIT_OLD_NONE = 0;
    public static final int TRANSIT_OLD_ACTIVITY_OPEN = 6;
    public static final int TRANSIT_OLD_ACTIVITY_CLOSE = 7;
    public static final int TRANSIT_OLD_TASK_OPEN = 8;
    public static final int TRANSIT_OLD_TASK_CLOSE = 9;
    public static final int TRANSIT_OLD_TASK_TO_FRONT = 10;
    public static final int TRANSIT_OLD_TASK_TO_BACK = 11;
    public static final int TRANSIT_OLD_WALLPAPER_CLOSE = 12;
    public static final int TRANSIT_OLD_WALLPAPER_OPEN = 13;
    public static final int TRANSIT_OLD_WALLPAPER_INTRA_OPEN = 14;
    public static final int TRANSIT_OLD_WALLPAPER_INTRA_CLOSE = 15;
    public static final int TRANSIT_OLD_TASK_OPEN_BEHIND = 16;
    public static final int TRANSIT_OLD_ACTIVITY_RELAUNCH = 18;
    public static final int TRANSIT_OLD_KEYGUARD_GOING_AWAY = 20;
    public static final int TRANSIT_OLD_KEYGUARD_GOING_AWAY_ON_WALLPAPER = 21;
    public static final int TRANSIT_OLD_KEYGUARD_OCCLUDE = 22;
    public static final int TRANSIT_OLD_KEYGUARD_UNOCCLUDE = 23;
    public static final int TRANSIT_OLD_TRANSLUCENT_ACTIVITY_OPEN = 24;
    public static final int TRANSIT_OLD_TRANSLUCENT_ACTIVITY_CLOSE = 25;
    public static final int TRANSIT_OLD_CRASHING_ACTIVITY_CLOSE = 26;
    public static final int TRANSIT_OLD_TASK_CHANGE_WINDOWING_MODE = 27;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_OPEN = 1;
    public static final int TRANSIT_CLOSE = 2;
    public static final int TRANSIT_TO_FRONT = 3;
    public static final int TRANSIT_TO_BACK = 4;
    public static final int TRANSIT_RELAUNCH = 5;
    public static final int TRANSIT_CHANGE = 6;
    public static final int TRANSIT_KEYGUARD_GOING_AWAY = 7;
    public static final int TRANSIT_KEYGUARD_OCCLUDE = 8;
    public static final int TRANSIT_KEYGUARD_UNOCCLUDE = 9;
    public static final int TRANSIT_FIRST_CUSTOM = 10;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_TO_SHADE = 1;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_NO_ANIMATION = 2;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_WITH_WALLPAPER = 4;
    public static final int TRANSIT_FLAG_KEYGUARD_GOING_AWAY_SUBTLE_ANIMATION = 8;
    public static final int TRANSIT_FLAG_APP_CRASHED = 16;
    public static final int TRANSIT_FLAG_OPEN_BEHIND = 32;
    public static final int TRANSIT_FLAG_KEYGUARD_LOCKED = 64;
    public static final int REMOVE_CONTENT_MODE_UNDEFINED = 0;
    public static final int REMOVE_CONTENT_MODE_MOVE_TO_PRIMARY = 1;
    public static final int REMOVE_CONTENT_MODE_DESTROY = 2;
    public static final int DISPLAY_IME_POLICY_LOCAL = 0;
    public static final int DISPLAY_IME_POLICY_FALLBACK_DISPLAY = 1;
    public static final int DISPLAY_IME_POLICY_HIDE = 2;
    public static final int TAKE_SCREENSHOT_FULLSCREEN = 1;
    public static final int TAKE_SCREENSHOT_SELECTED_REGION = 2;
    public static final int TAKE_SCREENSHOT_PROVIDED_IMAGE = 3;
    public static final java.lang.String PARCEL_KEY_SHORTCUTS_ARRAY = "shortcuts_array";
    @java.lang.Deprecated
    public android.view.Display getDefaultDisplay();
    public void removeViewImmediate(android.view.View p0);
    default public android.view.WindowMetrics getCurrentWindowMetrics() { return null; }
    default public android.view.WindowMetrics getMaximumWindowMetrics() { return null; }
    public void requestAppKeyboardShortcuts(android.view.WindowManager.KeyboardShortcutsReceiver p0, int p1);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public android.graphics.Region getCurrentImeTouchRegion();
    default public void setShouldShowWithInsecureKeyguard(int p0, boolean p1) {}
    default public void setShouldShowSystemDecors(int p0, boolean p1) {}
    default public boolean shouldShowSystemDecors(int p0) { return false; }
    default public void setDisplayImePolicy(int p0, int p1) {}
    @android.view.WindowManager.DisplayImePolicy
    default public int getDisplayImePolicy(int p0) { return 0; }
    default public boolean isCrossWindowBlurEnabled() { return false; }
    default public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    default public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    default public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    public static java.lang.String transitTypeToString(int p0) { return null; }
    default public void holdLock(android.os.IBinder p0, int p1) {}
    default public boolean isTaskSnapshotSupported() { return false; }

    public static class BadTokenException extends java.lang.RuntimeException {
        public BadTokenException() { super(); }
        public BadTokenException(java.lang.String p0) { super(); }
    }

    public static @interface DisplayImePolicy {
    }

    public static class InvalidDisplayException extends java.lang.RuntimeException {
        public InvalidDisplayException() { super(); }
        public InvalidDisplayException(java.lang.String p0) { super(); }
    }

    public static interface KeyboardShortcutsReceiver {
        public void onKeyboardShortcutsReceived(java.util.List<android.view.KeyboardShortcutGroup> p0);
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams implements android.os.Parcelable {
        @android.view.ViewDebug.ExportedProperty
        public int x;
        @android.view.ViewDebug.ExportedProperty
        public int y;
        @android.view.ViewDebug.ExportedProperty
        public float horizontalWeight;
        @android.view.ViewDebug.ExportedProperty
        public float verticalWeight;
        @android.view.ViewDebug.ExportedProperty(mapping={@android.view.ViewDebug.IntToString(from=1, to="BASE_APPLICATION"), @android.view.ViewDebug.IntToString(from=2, to="APPLICATION"), @android.view.ViewDebug.IntToString(from=3, to="APPLICATION_STARTING"), @android.view.ViewDebug.IntToString(from=4, to="DRAWN_APPLICATION"), @android.view.ViewDebug.IntToString(from=1000, to="APPLICATION_PANEL"), @android.view.ViewDebug.IntToString(from=1001, to="APPLICATION_MEDIA"), @android.view.ViewDebug.IntToString(from=1002, to="APPLICATION_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=1005, to="APPLICATION_ABOVE_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=1003, to="APPLICATION_ATTACHED_DIALOG"), @android.view.ViewDebug.IntToString(from=1004, to="APPLICATION_MEDIA_OVERLAY"), @android.view.ViewDebug.IntToString(from=2000, to="STATUS_BAR"), @android.view.ViewDebug.IntToString(from=2001, to="SEARCH_BAR"), @android.view.ViewDebug.IntToString(from=2002, to="PHONE"), @android.view.ViewDebug.IntToString(from=2003, to="SYSTEM_ALERT"), @android.view.ViewDebug.IntToString(from=2005, to="TOAST"), @android.view.ViewDebug.IntToString(from=2006, to="SYSTEM_OVERLAY"), @android.view.ViewDebug.IntToString(from=2007, to="PRIORITY_PHONE"), @android.view.ViewDebug.IntToString(from=2008, to="SYSTEM_DIALOG"), @android.view.ViewDebug.IntToString(from=2009, to="KEYGUARD_DIALOG"), @android.view.ViewDebug.IntToString(from=2010, to="SYSTEM_ERROR"), @android.view.ViewDebug.IntToString(from=2011, to="INPUT_METHOD"), @android.view.ViewDebug.IntToString(from=2012, to="INPUT_METHOD_DIALOG"), @android.view.ViewDebug.IntToString(from=2013, to="WALLPAPER"), @android.view.ViewDebug.IntToString(from=2014, to="STATUS_BAR_PANEL"), @android.view.ViewDebug.IntToString(from=2015, to="SECURE_SYSTEM_OVERLAY"), @android.view.ViewDebug.IntToString(from=2016, to="DRAG"), @android.view.ViewDebug.IntToString(from=2017, to="STATUS_BAR_SUB_PANEL"), @android.view.ViewDebug.IntToString(from=2018, to="POINTER"), @android.view.ViewDebug.IntToString(from=2019, to="NAVIGATION_BAR"), @android.view.ViewDebug.IntToString(from=2020, to="VOLUME_OVERLAY"), @android.view.ViewDebug.IntToString(from=2021, to="BOOT_PROGRESS"), @android.view.ViewDebug.IntToString(from=2022, to="INPUT_CONSUMER"), @android.view.ViewDebug.IntToString(from=2024, to="NAVIGATION_BAR_PANEL"), @android.view.ViewDebug.IntToString(from=2026, to="DISPLAY_OVERLAY"), @android.view.ViewDebug.IntToString(from=2027, to="MAGNIFICATION_OVERLAY"), @android.view.ViewDebug.IntToString(from=2037, to="PRESENTATION"), @android.view.ViewDebug.IntToString(from=2030, to="PRIVATE_PRESENTATION"), @android.view.ViewDebug.IntToString(from=2031, to="VOICE_INTERACTION"), @android.view.ViewDebug.IntToString(from=2033, to="VOICE_INTERACTION_STARTING"), @android.view.ViewDebug.IntToString(from=2034, to="DOCK_DIVIDER"), @android.view.ViewDebug.IntToString(from=2035, to="QS_DIALOG"), @android.view.ViewDebug.IntToString(from=2036, to="SCREENSHOT"), @android.view.ViewDebug.IntToString(from=2038, to="APPLICATION_OVERLAY")})
        public int type;
        public static final int FIRST_APPLICATION_WINDOW = 1;
        public static final int TYPE_BASE_APPLICATION = 1;
        public static final int TYPE_APPLICATION = 2;
        public static final int TYPE_APPLICATION_STARTING = 3;
        public static final int TYPE_DRAWN_APPLICATION = 4;
        public static final int LAST_APPLICATION_WINDOW = 99;
        public static final int FIRST_SUB_WINDOW = 1000;
        public static final int TYPE_APPLICATION_PANEL = 1000;
        public static final int TYPE_APPLICATION_MEDIA = 1001;
        public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
        public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
        public static final int TYPE_APPLICATION_MEDIA_OVERLAY = 1004;
        public static final int TYPE_APPLICATION_ABOVE_SUB_PANEL = 1005;
        public static final int LAST_SUB_WINDOW = 1999;
        public static final int FIRST_SYSTEM_WINDOW = 2000;
        public static final int TYPE_STATUS_BAR = 2000;
        public static final int TYPE_SEARCH_BAR = 2001;
        @java.lang.Deprecated
        public static final int TYPE_PHONE = 2002;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_ALERT = 2003;
        public static final int TYPE_KEYGUARD = 2004;
        @java.lang.Deprecated
        public static final int TYPE_TOAST = 2005;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_OVERLAY = 2006;
        @java.lang.Deprecated
        public static final int TYPE_PRIORITY_PHONE = 2007;
        public static final int TYPE_SYSTEM_DIALOG = 2008;
        public static final int TYPE_KEYGUARD_DIALOG = 2009;
        @java.lang.Deprecated
        public static final int TYPE_SYSTEM_ERROR = 2010;
        public static final int TYPE_INPUT_METHOD = 2011;
        public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
        public static final int TYPE_WALLPAPER = 2013;
        public static final int TYPE_STATUS_BAR_PANEL = 2014;
        public static final int TYPE_SECURE_SYSTEM_OVERLAY = 2015;
        public static final int TYPE_DRAG = 2016;
        public static final int TYPE_STATUS_BAR_SUB_PANEL = 2017;
        public static final int TYPE_POINTER = 2018;
        public static final int TYPE_NAVIGATION_BAR = 2019;
        public static final int TYPE_VOLUME_OVERLAY = 2020;
        public static final int TYPE_BOOT_PROGRESS = 2021;
        public static final int TYPE_INPUT_CONSUMER = 2022;
        public static final int TYPE_NAVIGATION_BAR_PANEL = 2024;
        public static final int TYPE_DISPLAY_OVERLAY = 2026;
        public static final int TYPE_MAGNIFICATION_OVERLAY = 2027;
        public static final int TYPE_PRIVATE_PRESENTATION = 2030;
        public static final int TYPE_VOICE_INTERACTION = 2031;
        public static final int TYPE_ACCESSIBILITY_OVERLAY = 2032;
        public static final int TYPE_VOICE_INTERACTION_STARTING = 2033;
        public static final int TYPE_DOCK_DIVIDER = 2034;
        public static final int TYPE_QS_DIALOG = 2035;
        public static final int TYPE_SCREENSHOT = 2036;
        public static final int TYPE_PRESENTATION = 2037;
        public static final int TYPE_APPLICATION_OVERLAY = 2038;
        public static final int TYPE_ACCESSIBILITY_MAGNIFICATION_OVERLAY = 2039;
        public static final int TYPE_NOTIFICATION_SHADE = 2040;
        public static final int TYPE_STATUS_BAR_ADDITIONAL = 2041;
        public static final int LAST_SYSTEM_WINDOW = 2999;
        public static final int INVALID_WINDOW_TYPE = -1;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_NORMAL = 0;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_HARDWARE = 1;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_GPU = 2;
        @java.lang.Deprecated
        public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
        @java.lang.Deprecated
        public int memoryType;
        public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
        public static final int FLAG_DIM_BEHIND = 2;
        public static final int FLAG_BLUR_BEHIND = 4;
        public static final int FLAG_NOT_FOCUSABLE = 8;
        public static final int FLAG_NOT_TOUCHABLE = 16;
        public static final int FLAG_NOT_TOUCH_MODAL = 32;
        @java.lang.Deprecated
        public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
        public static final int FLAG_KEEP_SCREEN_ON = 128;
        public static final int FLAG_LAYOUT_IN_SCREEN = 256;
        public static final int FLAG_LAYOUT_NO_LIMITS = 512;
        @java.lang.Deprecated
        public static final int FLAG_FULLSCREEN = 1024;
        @java.lang.Deprecated
        public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
        @java.lang.Deprecated
        public static final int FLAG_DITHER = 4096;
        public static final int FLAG_SECURE = 8192;
        public static final int FLAG_SCALED = 16384;
        public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
        public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
        public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
        @java.lang.Deprecated
        public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
        public static final int FLAG_SHOW_WALLPAPER = 1048576;
        @java.lang.Deprecated
        public static final int FLAG_TURN_SCREEN_ON = 2097152;
        @java.lang.Deprecated
        public static final int FLAG_DISMISS_KEYGUARD = 4194304;
        public static final int FLAG_SPLIT_TOUCH = 8388608;
        public static final int FLAG_HARDWARE_ACCELERATED = 16777216;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_IN_OVERSCAN = 33554432;
        @java.lang.Deprecated
        public static final int FLAG_TRANSLUCENT_STATUS = 67108864;
        @java.lang.Deprecated
        public static final int FLAG_TRANSLUCENT_NAVIGATION = 134217728;
        public static final int FLAG_LOCAL_FOCUS_MODE = 268435456;
        public static final int FLAG_SLIPPERY = 536870912;
        @java.lang.Deprecated
        public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = 1073741824;
        public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = -2147483648;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="ALLOW_LOCK_WHILE_SCREEN_ON"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="DIM_BEHIND"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="BLUR_BEHIND"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="NOT_FOCUSABLE"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="NOT_TOUCHABLE"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="NOT_TOUCH_MODAL"), @android.view.ViewDebug.FlagToString(mask=64, equals=64, name="TOUCHABLE_WHEN_WAKING"), @android.view.ViewDebug.FlagToString(mask=128, equals=128, name="KEEP_SCREEN_ON"), @android.view.ViewDebug.FlagToString(mask=256, equals=256, name="LAYOUT_IN_SCREEN"), @android.view.ViewDebug.FlagToString(mask=512, equals=512, name="LAYOUT_NO_LIMITS"), @android.view.ViewDebug.FlagToString(mask=1024, equals=1024, name="FULLSCREEN"), @android.view.ViewDebug.FlagToString(mask=2048, equals=2048, name="FORCE_NOT_FULLSCREEN"), @android.view.ViewDebug.FlagToString(mask=4096, equals=4096, name="DITHER"), @android.view.ViewDebug.FlagToString(mask=8192, equals=8192, name="SECURE"), @android.view.ViewDebug.FlagToString(mask=16384, equals=16384, name="SCALED"), @android.view.ViewDebug.FlagToString(mask=32768, equals=32768, name="IGNORE_CHEEK_PRESSES"), @android.view.ViewDebug.FlagToString(mask=65536, equals=65536, name="LAYOUT_INSET_DECOR"), @android.view.ViewDebug.FlagToString(mask=131072, equals=131072, name="ALT_FOCUSABLE_IM"), @android.view.ViewDebug.FlagToString(mask=262144, equals=262144, name="WATCH_OUTSIDE_TOUCH"), @android.view.ViewDebug.FlagToString(mask=524288, equals=524288, name="SHOW_WHEN_LOCKED"), @android.view.ViewDebug.FlagToString(mask=1048576, equals=1048576, name="SHOW_WALLPAPER"), @android.view.ViewDebug.FlagToString(mask=2097152, equals=2097152, name="TURN_SCREEN_ON"), @android.view.ViewDebug.FlagToString(mask=4194304, equals=4194304, name="DISMISS_KEYGUARD"), @android.view.ViewDebug.FlagToString(mask=8388608, equals=8388608, name="SPLIT_TOUCH"), @android.view.ViewDebug.FlagToString(mask=16777216, equals=16777216, name="HARDWARE_ACCELERATED"), @android.view.ViewDebug.FlagToString(mask=33554432, equals=33554432, name="LOCAL_FOCUS_MODE"), @android.view.ViewDebug.FlagToString(mask=67108864, equals=67108864, name="TRANSLUCENT_STATUS"), @android.view.ViewDebug.FlagToString(mask=134217728, equals=134217728, name="TRANSLUCENT_NAVIGATION"), @android.view.ViewDebug.FlagToString(mask=268435456, equals=268435456, name="LOCAL_FOCUS_MODE"), @android.view.ViewDebug.FlagToString(mask=536870912, equals=536870912, name="FLAG_SLIPPERY"), @android.view.ViewDebug.FlagToString(mask=1073741824, equals=1073741824, name="FLAG_LAYOUT_ATTACHED_IN_DECOR"), @android.view.ViewDebug.FlagToString(mask=-2147483648, equals=-2147483648, name="DRAWS_SYSTEM_BAR_BACKGROUNDS")}, formatToHexString=true)
        public int flags;
        public static final int PRIVATE_FLAG_FORCE_HARDWARE_ACCELERATED = 2;
        public static final int PRIVATE_FLAG_WANTS_OFFSET_NOTIFICATIONS = 4;
        @android.annotation.RequiresPermission("android.permission.SYSTEM_APPLICATION_OVERLAY")
        public static final int PRIVATE_FLAG_SYSTEM_APPLICATION_OVERLAY = 8;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.INTERNAL_SYSTEM_WINDOW")
        public static final int SYSTEM_FLAG_SHOW_FOR_ALL_USERS = 16;
        public static final int PRIVATE_FLAG_NO_MOVE_ANIMATION = 64;
        public static final int PRIVATE_FLAG_COMPATIBLE_WINDOW = 128;
        public static final int PRIVATE_FLAG_SYSTEM_ERROR = 256;
        public static final int PRIVATE_FLAG_DISABLE_WALLPAPER_TOUCH_EVENTS = 2048;
        public static final int PRIVATE_FLAG_FORCE_SHOW_STATUS_BAR = 4096;
        public static final int PRIVATE_FLAG_FORCE_DECOR_VIEW_VISIBILITY = 16384;
        public static final int PRIVATE_FLAG_WILL_NOT_REPLACE_ON_RELAUNCH = 32768;
        public static final int PRIVATE_FLAG_LAYOUT_CHILD_WINDOW_IN_PARENT_FRAME = 65536;
        public static final int PRIVATE_FLAG_FORCE_DRAW_BAR_BACKGROUNDS = 131072;
        public static final int PRIVATE_FLAG_SUSTAINED_PERFORMANCE_MODE = 262144;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.HIDE_NON_SYSTEM_OVERLAY_WINDOWS")
        public static final int SYSTEM_FLAG_HIDE_NON_SYSTEM_OVERLAY_WINDOWS = 524288;
        public static final int PRIVATE_FLAG_IS_ROUNDED_CORNERS_OVERLAY = 1048576;
        public static final int PRIVATE_FLAG_NOT_MAGNIFIABLE = 4194304;
        public static final int PRIVATE_FLAG_STATUS_FORCE_SHOW_NAVIGATION = 8388608;
        public static final int PRIVATE_FLAG_COLOR_SPACE_AGNOSTIC = 16777216;
        public static final int PRIVATE_FLAG_USE_BLAST = 33554432;
        public static final int PRIVATE_FLAG_APPEARANCE_CONTROLLED = 67108864;
        public static final int PRIVATE_FLAG_BEHAVIOR_CONTROLLED = 134217728;
        public static final int PRIVATE_FLAG_FIT_INSETS_CONTROLLED = 268435456;
        public static final int PRIVATE_FLAG_TRUSTED_OVERLAY = 536870912;
        public static final int PRIVATE_FLAG_INSET_PARENT_FRAME_BY_IME = 1073741824;
        @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
        public static final int PRIVATE_FLAG_INTERCEPT_GLOBAL_DRAG_AND_DROP = -2147483648;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=2, equals=2, name="FORCE_HARDWARE_ACCELERATED"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="WANTS_OFFSET_NOTIFICATIONS"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="SHOW_FOR_ALL_USERS"), @android.view.ViewDebug.FlagToString(mask=64, equals=64, name="NO_MOVE_ANIMATION"), @android.view.ViewDebug.FlagToString(mask=128, equals=128, name="COMPATIBLE_WINDOW"), @android.view.ViewDebug.FlagToString(mask=256, equals=256, name="SYSTEM_ERROR"), @android.view.ViewDebug.FlagToString(mask=2048, equals=2048, name="DISABLE_WALLPAPER_TOUCH_EVENTS"), @android.view.ViewDebug.FlagToString(mask=4096, equals=4096, name="FORCE_STATUS_BAR_VISIBLE"), @android.view.ViewDebug.FlagToString(mask=16384, equals=16384, name="FORCE_DECOR_VIEW_VISIBILITY"), @android.view.ViewDebug.FlagToString(mask=32768, equals=32768, name="WILL_NOT_REPLACE_ON_RELAUNCH"), @android.view.ViewDebug.FlagToString(mask=65536, equals=65536, name="LAYOUT_CHILD_WINDOW_IN_PARENT_FRAME"), @android.view.ViewDebug.FlagToString(mask=131072, equals=131072, name="FORCE_DRAW_STATUS_BAR_BACKGROUND"), @android.view.ViewDebug.FlagToString(mask=262144, equals=262144, name="SUSTAINED_PERFORMANCE_MODE"), @android.view.ViewDebug.FlagToString(mask=524288, equals=524288, name="HIDE_NON_SYSTEM_OVERLAY_WINDOWS"), @android.view.ViewDebug.FlagToString(mask=1048576, equals=1048576, name="IS_ROUNDED_CORNERS_OVERLAY"), @android.view.ViewDebug.FlagToString(mask=4194304, equals=4194304, name="NOT_MAGNIFIABLE"), @android.view.ViewDebug.FlagToString(mask=8388608, equals=8388608, name="STATUS_FORCE_SHOW_NAVIGATION"), @android.view.ViewDebug.FlagToString(mask=16777216, equals=16777216, name="COLOR_SPACE_AGNOSTIC"), @android.view.ViewDebug.FlagToString(mask=33554432, equals=33554432, name="USE_BLAST"), @android.view.ViewDebug.FlagToString(mask=67108864, equals=67108864, name="APPEARANCE_CONTROLLED"), @android.view.ViewDebug.FlagToString(mask=134217728, equals=134217728, name="BEHAVIOR_CONTROLLED"), @android.view.ViewDebug.FlagToString(mask=268435456, equals=268435456, name="FIT_INSETS_CONTROLLED"), @android.view.ViewDebug.FlagToString(mask=536870912, equals=536870912, name="TRUSTED_OVERLAY"), @android.view.ViewDebug.FlagToString(mask=1073741824, equals=1073741824, name="INSET_PARENT_FRAME_BY_IME"), @android.view.ViewDebug.FlagToString(mask=-2147483648, equals=-2147483648, name="INTERCEPT_GLOBAL_DRAG_AND_DROP"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="PRIVATE_FLAG_SYSTEM_APPLICATION_OVERLAY")})
        @android.view.WindowManager.LayoutParams.PrivateFlags
        public int privateFlags;
        public static final int SOFT_INPUT_MASK_STATE = 15;
        public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
        public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
        public static final int SOFT_INPUT_STATE_HIDDEN = 2;
        public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
        public static final int SOFT_INPUT_STATE_VISIBLE = 4;
        public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
        public static final int SOFT_INPUT_MASK_ADJUST = 240;
        public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
        @java.lang.Deprecated
        public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
        public static final int SOFT_INPUT_ADJUST_PAN = 32;
        public static final int SOFT_INPUT_ADJUST_NOTHING = 48;
        public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
        public int softInputMode;
        public int gravity;
        public float horizontalMargin;
        public float verticalMargin;
        public final android.graphics.Rect surfaceInsets = null;
        public boolean hasManualSurfaceInsets;
        public boolean receiveInsetsIgnoringZOrder;
        public boolean preservePreviousSurfaceInsets;
        public int format;
        public int windowAnimations;
        public float alpha;
        public float dimAmount;
        public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0f;
        public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0f;
        public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0f;
        public float screenBrightness;
        public float buttonBrightness;
        public static final int ROTATION_ANIMATION_UNSPECIFIED = -1;
        public static final int ROTATION_ANIMATION_ROTATE = 0;
        public static final int ROTATION_ANIMATION_CROSSFADE = 1;
        public static final int ROTATION_ANIMATION_JUMPCUT = 2;
        public static final int ROTATION_ANIMATION_SEAMLESS = 3;
        public int rotationAnimation;
        public android.os.IBinder token;
        public android.os.IBinder mWindowContextToken;
        public java.lang.String packageName;
        public int screenOrientation;
        @java.lang.Deprecated
        public float preferredRefreshRate;
        public int preferredDisplayModeId;
        public float preferredMinDisplayRefreshRate;
        public float preferredMaxDisplayRefreshRate;
        @java.lang.Deprecated
        public int systemUiVisibility;
        public int subtreeSystemUiVisibility;
        public boolean hasSystemUiListeners;
        public int layoutInDisplayCutoutMode;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT = 0;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = 1;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER = 2;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS = 3;
        public static final int INPUT_FEATURE_DISABLE_POINTER_GESTURES = 1;
        public static final int INPUT_FEATURE_NO_INPUT_CHANNEL = 2;
        public static final int INPUT_FEATURE_DISABLE_USER_ACTIVITY = 4;
        public int inputFeatures;
        public long userActivityTimeout;
        public long accessibilityIdOfAnchor;
        public java.lang.CharSequence accessibilityTitle;
        public long hideTimeoutMilliseconds;
        public boolean preferMinimalPostProcessing;
        private int mBlurBehindRadius;
        private int mColorMode;
        public final android.view.InsetsFlags insetsFlags = null;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="STATUS_BARS"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="NAVIGATION_BARS"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="CAPTION_BAR"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="IME"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="SYSTEM_GESTURES"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="MANDATORY_SYSTEM_GESTURES"), @android.view.ViewDebug.FlagToString(mask=64, equals=64, name="TAPPABLE_ELEMENT"), @android.view.ViewDebug.FlagToString(mask=256, equals=256, name="WINDOW_DECOR")})
        private int mFitInsetsTypes;
        @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="LEFT"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="TOP"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="RIGHT"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="BOTTOM")})
        private int mFitInsetsSides;
        private boolean mFitInsetsIgnoringVisibility;
        public int[] providesInsetsTypes;
        public static final android.os.Parcelable.Creator<android.view.WindowManager.LayoutParams> CREATOR = null;
        public static final int LAYOUT_CHANGED = 1;
        public static final int TYPE_CHANGED = 2;
        public static final int FLAGS_CHANGED = 4;
        public static final int FORMAT_CHANGED = 8;
        public static final int ANIMATION_CHANGED = 16;
        public static final int DIM_AMOUNT_CHANGED = 32;
        public static final int TITLE_CHANGED = 64;
        public static final int ALPHA_CHANGED = 128;
        public static final int MEMORY_TYPE_CHANGED = 256;
        public static final int SOFT_INPUT_MODE_CHANGED = 512;
        public static final int SCREEN_ORIENTATION_CHANGED = 1024;
        public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
        public static final int ROTATION_ANIMATION_CHANGED = 4096;
        public static final int BUTTON_BRIGHTNESS_CHANGED = 8192;
        public static final int SYSTEM_UI_VISIBILITY_CHANGED = 16384;
        public static final int SYSTEM_UI_LISTENER_CHANGED = 32768;
        public static final int INPUT_FEATURES_CHANGED = 65536;
        public static final int PRIVATE_FLAGS_CHANGED = 131072;
        public static final int USER_ACTIVITY_TIMEOUT_CHANGED = 262144;
        public static final int TRANSLUCENT_FLAGS_CHANGED = 524288;
        public static final int SURFACE_INSETS_CHANGED = 1048576;
        public static final int PREFERRED_REFRESH_RATE_CHANGED = 2097152;
        public static final int PREFERRED_DISPLAY_MODE_ID = 8388608;
        public static final int ACCESSIBILITY_ANCHOR_CHANGED = 16777216;
        public static final int ACCESSIBILITY_TITLE_CHANGED = 33554432;
        public static final int COLOR_MODE_CHANGED = 67108864;
        public static final int INSET_FLAGS_CHANGED = 134217728;
        public static final int MINIMAL_POST_PROCESSING_PREFERENCE_CHANGED = 268435456;
        public static final int BLUR_BEHIND_RADIUS_CHANGED = 536870912;
        public static final int PREFERRED_MIN_DISPLAY_REFRESH_RATE = 1073741824;
        public static final int PREFERRED_MAX_DISPLAY_REFRESH_RATE = -2147483648;
        private int[] mCompatibilityParamsBackup;
        private java.lang.CharSequence mTitle;
        public static boolean isSystemAlertWindowType(int p0) { return false; }
        public static boolean mayUseInputMethod(int p0) { return false; }
        public void setFitInsetsTypes(int p0) {}
        public void setFitInsetsSides(int p0) {}
        public void setFitInsetsIgnoringVisibility(boolean p0) {}
        public void setTrustedOverlay() {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.SYSTEM_APPLICATION_OVERLAY")
        public void setSystemApplicationOverlay(boolean p0) {}
        @android.annotation.SystemApi
        public boolean isSystemApplicationOverlay() { return false; }
        public int getFitInsetsTypes() { return 0; }
        public int getFitInsetsSides() { return 0; }
        public boolean isFitInsetsIgnoringVisibility() { return false; }
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2, int p3, int p4) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super((android.view.ViewGroup.LayoutParams)null); }
        public final void setTitle(java.lang.CharSequence p0) {}
        public final java.lang.CharSequence getTitle() { return null; }
        public final void setSurfaceInsets(android.view.View p0, boolean p1, boolean p2) {}
        public void setColorMode(int p0) {}
        public int getColorMode() { return 0; }
        public void setBlurBehindRadius(int p0) {}
        public int getBlurBehindRadius() { return 0; }
        @android.annotation.SystemApi
        public final void setUserActivityTimeout(long p0) {}
        @android.annotation.SystemApi
        public final long getUserActivityTimeout() { return 0L; }
        public final void setWindowContextToken(android.os.IBinder p0) {}
        public final android.os.IBinder getWindowContextToken() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public LayoutParams(android.os.Parcel p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public final int copyFrom(android.view.WindowManager.LayoutParams p0) { return 0; }
        public java.lang.String debug(java.lang.String p0) { return null; }
        public java.lang.String toString() { return null; }
        public void dumpDimensions(java.lang.StringBuilder p0) {}
        public java.lang.String toString(java.lang.String p0) { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public void scale(float p0) {}
        void backup() {}
        void restore() {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
        public boolean isFullscreen() { return false; }
        private static java.lang.String layoutInDisplayCutoutModeToString(int p0) { return null; }
        private static java.lang.String softInputModeToString(int p0) { return null; }
        private static java.lang.String rotationAnimationToString(int p0) { return null; }
        private static java.lang.String inputFeatureToString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InputFeatureFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface LayoutInDisplayCutoutMode {
        }

        public static @interface PrivateFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SoftInputModeFlags {
        }

        @android.annotation.SystemApi
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SystemFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SystemUiVisibilityFlags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface WindowType {
        }
    }

    public static @interface RemoveContentMode {
    }

    public static @interface ScreenshotSource {
        public static final int SCREENSHOT_GLOBAL_ACTIONS = 0;
        public static final int SCREENSHOT_KEY_CHORD = 1;
        public static final int SCREENSHOT_KEY_OTHER = 2;
        public static final int SCREENSHOT_OVERVIEW = 3;
        public static final int SCREENSHOT_ACCESSIBILITY_ACTIONS = 4;
        public static final int SCREENSHOT_OTHER = 5;
        public static final int SCREENSHOT_VENDOR_GESTURE = 6;
    }

    public static @interface ScreenshotType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShellRootLayer {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionOldType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransitionType {
    }
}
