package android.content.pm;

public class ActivityInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public int theme;
    public static final int LAUNCH_MULTIPLE = 0;
    public static final int LAUNCH_SINGLE_TOP = 1;
    public static final int LAUNCH_SINGLE_TASK = 2;
    public static final int LAUNCH_SINGLE_INSTANCE = 3;
    public static final int LAUNCH_SINGLE_INSTANCE_PER_TASK = 4;
    public int launchMode;
    public static final int DOCUMENT_LAUNCH_NONE = 0;
    public static final int DOCUMENT_LAUNCH_INTO_EXISTING = 1;
    public static final int DOCUMENT_LAUNCH_ALWAYS = 2;
    public static final int DOCUMENT_LAUNCH_NEVER = 3;
    public int documentLaunchMode;
    public static final int PERSIST_ROOT_ONLY = 0;
    public static final int PERSIST_NEVER = 1;
    public static final int PERSIST_ACROSS_REBOOTS = 2;
    public int persistableMode;
    public int maxRecents;
    public java.lang.String permission;
    public java.lang.String taskAffinity;
    public java.lang.String targetActivity;
    public java.lang.String launchToken;
    public static final int RESIZE_MODE_UNRESIZEABLE = 0;
    public static final int RESIZE_MODE_RESIZEABLE_VIA_SDK_VERSION = 1;
    public static final int RESIZE_MODE_RESIZEABLE = 2;
    public static final int RESIZE_MODE_RESIZEABLE_AND_PIPABLE_DEPRECATED = 3;
    public static final int RESIZE_MODE_FORCE_RESIZEABLE = 4;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_LANDSCAPE_ONLY = 5;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_PORTRAIT_ONLY = 6;
    public static final int RESIZE_MODE_FORCE_RESIZABLE_PRESERVE_ORIENTATION = 7;
    public int resizeMode;
    public boolean supportsSizeChanges;
    public java.lang.String requestedVrComponent;
    public static final int COLOR_MODE_DEFAULT = 0;
    public static final int COLOR_MODE_WIDE_COLOR_GAMUT = 1;
    public static final int COLOR_MODE_HDR = 2;
    public static final int COLOR_MODE_A8 = 4;
    public int colorMode;
    public static final int FLAG_MULTIPROCESS = 1;
    public static final int FLAG_FINISH_ON_TASK_LAUNCH = 2;
    public static final int FLAG_CLEAR_TASK_ON_LAUNCH = 4;
    public static final int FLAG_ALWAYS_RETAIN_TASK_STATE = 8;
    public static final int FLAG_STATE_NOT_NEEDED = 16;
    public static final int FLAG_EXCLUDE_FROM_RECENTS = 32;
    public static final int FLAG_ALLOW_TASK_REPARENTING = 64;
    public static final int FLAG_NO_HISTORY = 128;
    public static final int FLAG_FINISH_ON_CLOSE_SYSTEM_DIALOGS = 256;
    public static final int FLAG_HARDWARE_ACCELERATED = 512;
    public static final int FLAG_SHOW_FOR_ALL_USERS = 1024;
    public static final int FLAG_IMMERSIVE = 2048;
    public static final int FLAG_RELINQUISH_TASK_IDENTITY = 4096;
    public static final int FLAG_AUTO_REMOVE_FROM_RECENTS = 8192;
    public static final int FLAG_RESUME_WHILE_PAUSING = 16384;
    public static final int FLAG_ENABLE_VR_MODE = 32768;
    public static final int FLAG_CAN_DISPLAY_ON_REMOTE_DEVICES = 65536;
    public static final int FLAG_ALWAYS_FOCUSABLE = 262144;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public static final int FLAG_IMPLICITLY_VISIBLE_TO_INSTANT_APP = 2097152;
    public static final int FLAG_SUPPORTS_PICTURE_IN_PICTURE = 4194304;
    public static final int FLAG_SHOW_WHEN_LOCKED = 8388608;
    public static final int FLAG_TURN_SCREEN_ON = 16777216;
    public static final int FLAG_PREFER_MINIMAL_POST_PROCESSING = 33554432;
    public static final int FLAG_ALLOW_UNTRUSTED_ACTIVITY_EMBEDDING = 268435456;
    public static final int FLAG_SYSTEM_USER_ONLY = 536870912;
    public static final int FLAG_SINGLE_USER = 1073741824;
    @java.lang.Deprecated
    public static final int FLAG_ALLOW_EMBEDDED = -2147483648;
    public int flags;
    public static final int FLAG_INHERIT_SHOW_WHEN_LOCKED = 1;
    public static final int PRIVATE_FLAG_HOME_TRANSITION_SOUND = 2;
    public int privateFlags;
    public static final int SCREEN_ORIENTATION_UNSET = -2;
    public static final int SCREEN_ORIENTATION_UNSPECIFIED = -1;
    public static final int SCREEN_ORIENTATION_LANDSCAPE = 0;
    public static final int SCREEN_ORIENTATION_PORTRAIT = 1;
    public static final int SCREEN_ORIENTATION_USER = 2;
    public static final int SCREEN_ORIENTATION_BEHIND = 3;
    public static final int SCREEN_ORIENTATION_SENSOR = 4;
    public static final int SCREEN_ORIENTATION_NOSENSOR = 5;
    public static final int SCREEN_ORIENTATION_SENSOR_LANDSCAPE = 6;
    public static final int SCREEN_ORIENTATION_SENSOR_PORTRAIT = 7;
    public static final int SCREEN_ORIENTATION_REVERSE_LANDSCAPE = 8;
    public static final int SCREEN_ORIENTATION_REVERSE_PORTRAIT = 9;
    public static final int SCREEN_ORIENTATION_FULL_SENSOR = 10;
    public static final int SCREEN_ORIENTATION_USER_LANDSCAPE = 11;
    public static final int SCREEN_ORIENTATION_USER_PORTRAIT = 12;
    public static final int SCREEN_ORIENTATION_FULL_USER = 13;
    public static final int SCREEN_ORIENTATION_LOCKED = 14;
    public int screenOrientation;
    public static final int CONFIG_MCC = 1;
    public static final int CONFIG_MNC = 2;
    public static final int CONFIG_LOCALE = 4;
    public static final int CONFIG_TOUCHSCREEN = 8;
    public static final int CONFIG_KEYBOARD = 16;
    public static final int CONFIG_KEYBOARD_HIDDEN = 32;
    public static final int CONFIG_NAVIGATION = 64;
    public static final int CONFIG_ORIENTATION = 128;
    public static final int CONFIG_SCREEN_LAYOUT = 256;
    public static final int CONFIG_UI_MODE = 512;
    public static final int CONFIG_SCREEN_SIZE = 1024;
    public static final int CONFIG_SMALLEST_SCREEN_SIZE = 2048;
    public static final int CONFIG_DENSITY = 4096;
    public static final int CONFIG_LAYOUT_DIRECTION = 8192;
    public static final int CONFIG_COLOR_MODE = 16384;
    public static final int CONFIG_ASSETS_PATHS = -2147483648;
    public static final int CONFIG_FONT_SCALE = 1073741824;
    public static final int CONFIG_WINDOW_CONFIGURATION = 536870912;
    public static final int CONFIG_FONT_WEIGHT_ADJUSTMENT = 268435456;
    public static int[] CONFIG_NATIVE_BITS;
    public static final long FORCE_RESIZE_APP = 174042936L;
    public static final long FORCE_NON_RESIZE_APP = 181136395L;
    public static final int SIZE_CHANGES_UNSUPPORTED_METADATA = 0;
    public static final int SIZE_CHANGES_UNSUPPORTED_OVERRIDE = 1;
    public static final int SIZE_CHANGES_SUPPORTED_METADATA = 2;
    public static final int SIZE_CHANGES_SUPPORTED_OVERRIDE = 3;
    public static final long OVERRIDE_ENABLE_COMPAT_IGNORE_REQUESTED_ORIENTATION = 254631730L;
    public static final long OVERRIDE_ENABLE_COMPAT_IGNORE_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED = 273509367L;
    public static final long NEVER_SANDBOX_DISPLAY_APIS = 184838306L;
    public static final long ALWAYS_SANDBOX_DISPLAY_APIS = 185004937L;
    public static final long OVERRIDE_RESPECT_REQUESTED_ORIENTATION = 236283604L;
    public static final long OVERRIDE_CAMERA_COMPAT_DISABLE_FORCE_ROTATION = 263959004L;
    public static final long OVERRIDE_CAMERA_COMPAT_DISABLE_REFRESH = 264304459L;
    public static final long OVERRIDE_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE = 264301586L;
    public static final long OVERRIDE_SANDBOX_VIEW_BOUNDS_APIS = 237531167L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO = 174042980L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_PORTRAIT_ONLY = 203647190L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_MEDIUM = 180326845L;
    public static final float OVERRIDE_MIN_ASPECT_RATIO_MEDIUM_VALUE = 1.5f;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_LARGE = 180326787L;
    public static final float OVERRIDE_MIN_ASPECT_RATIO_LARGE_VALUE = 1.7777777910232544f;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_TO_ALIGN_WITH_SPLIT_SCREEN = 208648326L;
    public static final long OVERRIDE_MIN_ASPECT_RATIO_EXCLUDE_PORTRAIT_FULLSCREEN = 218959984L;
    public static final long OVERRIDE_ENABLE_COMPAT_FAKE_FOCUS = 263259275L;
    public static final long OVERRIDE_UNDEFINED_ORIENTATION_TO_PORTRAIT = 265452344L;
    public static final long OVERRIDE_UNDEFINED_ORIENTATION_TO_NOSENSOR = 265451093L;
    public static final long OVERRIDE_LANDSCAPE_ORIENTATION_TO_REVERSE_LANDSCAPE = 266124927L;
    public static final long OVERRIDE_ANY_ORIENTATION = 265464455L;
    public static final long OVERRIDE_ORIENTATION_ONLY_FOR_CAMERA = 265456536L;
    public static final long OVERRIDE_USE_DISPLAY_LANDSCAPE_NATURAL_ORIENTATION = 255940284L;
    public int configChanges;
    public int softInputMode;
    public int uiOptions;
    public static final int UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW = 1;
    public java.lang.String parentActivityName;
    public int rotationAnimation;
    public static final int LOCK_TASK_LAUNCH_MODE_DEFAULT = 0;
    public static final int LOCK_TASK_LAUNCH_MODE_NEVER = 1;
    public static final int LOCK_TASK_LAUNCH_MODE_ALWAYS = 2;
    public static final int LOCK_TASK_LAUNCH_MODE_IF_ALLOWLISTED = 3;
    public int lockTaskLaunchMode;
    public android.content.pm.ActivityInfo.WindowLayout windowLayout;
    public static final android.os.Parcelable.Creator<android.content.pm.ActivityInfo> CREATOR = null;
    public static java.lang.String launchModeToString(int p0) { return null; }
    public static int activityInfoConfigJavaToNative(int p0) { return 0; }
    public static int activityInfoConfigNativeToJava(int p0) { return 0; }
    public int getRealConfigChanged() { return 0; }
    public static final java.lang.String lockTaskLaunchModeToString(int p0) { return null; }
    public ActivityInfo() { super(); }
    public ActivityInfo(android.content.pm.ActivityInfo p0) { super(); }
    public final int getThemeResource() { return 0; }
    public boolean hasFixedAspectRatio() { return false; }
    public boolean isFixedOrientation() { return false; }
    public static boolean isFixedOrientation(int p0) { return false; }
    boolean isFixedOrientationLandscape() { return false; }
    public static boolean isFixedOrientationLandscape(int p0) { return false; }
    boolean isFixedOrientationPortrait() { return false; }
    public static boolean isFixedOrientationPortrait(int p0) { return false; }
    public static int reverseOrientation(int p0) { return 0; }
    public boolean supportsPictureInPicture() { return false; }
    public int supportsSizeChanges() { return 0; }
    public boolean neverSandboxDisplayApis(android.content.pm.ConstrainDisplayApisConfig p0) { return false; }
    public boolean alwaysSandboxDisplayApis(android.content.pm.ConstrainDisplayApisConfig p0) { return false; }
    public void setMaxAspectRatio(float p0) {}
    public float getMaxAspectRatio() { return 0.0f; }
    public void setMinAspectRatio(float p0) {}
    public float getMinAspectRatio() { return 0.0f; }
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts() { return null; }
    public void setKnownActivityEmbeddingCerts(java.util.Set<java.lang.String> p0) {}
    public boolean isChangeEnabled(long p0) { return false; }
    public float getManifestMinAspectRatio() { return 0.0f; }
    public static boolean isResizeableMode(int p0) { return false; }
    public static boolean isPreserveOrientationMode(int p0) { return false; }
    public static java.lang.String resizeModeToString(int p0) { return null; }
    public static java.lang.String sizeChangesSupportModeToString(int p0) { return null; }
    public boolean shouldCheckMinWidthHeightForMultiWindow() { return false; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean isTranslucentOrFloating(android.content.res.TypedArray p0) { return false; }
    public static java.lang.String screenOrientationToString(int p0) { return null; }
    public static java.lang.String colorModeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Config {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LaunchMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenOrientation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SizeChangesSupportMode {
    }

    public static final class WindowLayout {
        public final int width = 0;
        public final float widthFraction = 0.0f;
        public final int height = 0;
        public final float heightFraction = 0.0f;
        public final int gravity = 0;
        public final int minWidth = 0;
        public final int minHeight = 0;
        public java.lang.String windowLayoutAffinity;
        public WindowLayout(int p0, float p1, int p2, float p3, int p4, int p5, int p6) {}
        public WindowLayout(int p0, float p1, int p2, float p3, int p4, int p5, int p6, java.lang.String p7) {}
        public WindowLayout(android.os.Parcel p0) {}
        public boolean hasSpecifiedSize() { return false; }
        public void writeToParcel(android.os.Parcel p0) {}
    }
}
