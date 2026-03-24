package android.app;

public class WindowConfiguration implements android.os.Parcelable, java.lang.Comparable<android.app.WindowConfiguration> {
    private final android.graphics.Rect mBounds = null;
    private android.graphics.Rect mAppBounds;
    private final android.graphics.Rect mMaxBounds = null;
    private int mRotation;
    public static final int ROTATION_UNDEFINED = -1;
    @android.app.WindowConfiguration.WindowingMode
    private int mWindowingMode;
    @android.app.WindowConfiguration.WindowingMode
    private int mDisplayWindowingMode;
    public static final int WINDOWING_MODE_UNDEFINED = 0;
    public static final int WINDOWING_MODE_FULLSCREEN = 1;
    public static final int WINDOWING_MODE_PINNED = 2;
    public static final int WINDOWING_MODE_SPLIT_SCREEN_PRIMARY = 3;
    public static final int WINDOWING_MODE_SPLIT_SCREEN_SECONDARY = 4;
    public static final int WINDOWING_MODE_FREEFORM = 5;
    public static final int WINDOWING_MODE_MULTI_WINDOW = 6;
    @android.app.WindowConfiguration.ActivityType
    private int mActivityType;
    public static final int ACTIVITY_TYPE_UNDEFINED = 0;
    public static final int ACTIVITY_TYPE_STANDARD = 1;
    public static final int ACTIVITY_TYPE_HOME = 2;
    public static final int ACTIVITY_TYPE_RECENTS = 3;
    public static final int ACTIVITY_TYPE_ASSISTANT = 4;
    public static final int ACTIVITY_TYPE_DREAM = 5;
    @android.app.WindowConfiguration.AlwaysOnTop
    private int mAlwaysOnTop;
    private static final int ALWAYS_ON_TOP_UNDEFINED = 0;
    private static final int ALWAYS_ON_TOP_ON = 1;
    private static final int ALWAYS_ON_TOP_OFF = 2;
    public static final int WINDOW_CONFIG_BOUNDS = 1;
    public static final int WINDOW_CONFIG_APP_BOUNDS = 2;
    public static final int WINDOW_CONFIG_MAX_BOUNDS = 4;
    public static final int WINDOW_CONFIG_WINDOWING_MODE = 8;
    public static final int WINDOW_CONFIG_ACTIVITY_TYPE = 16;
    public static final int WINDOW_CONFIG_ALWAYS_ON_TOP = 32;
    public static final int WINDOW_CONFIG_ROTATION = 64;
    public static final int WINDOW_CONFIG_DISPLAY_WINDOWING_MODE = 128;
    public static final int PINNED_WINDOWING_MODE_ELEVATION_IN_DIP = 5;
    public static final android.os.Parcelable.Creator<android.app.WindowConfiguration> CREATOR = null;
    public WindowConfiguration() {}
    public WindowConfiguration(android.app.WindowConfiguration p0) {}
    private WindowConfiguration(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void setBounds(android.graphics.Rect p0) {}
    public void setAppBounds(android.graphics.Rect p0) {}
    public void setMaxBounds(android.graphics.Rect p0) {}
    public void setMaxBounds(int p0, int p1, int p2, int p3) {}
    public void setAlwaysOnTop(boolean p0) {}
    private void setAlwaysOnTop(int p0) {}
    public void setAppBounds(int p0, int p1, int p2, int p3) {}
    public android.graphics.Rect getAppBounds() { return null; }
    public android.graphics.Rect getBounds() { return null; }
    public android.graphics.Rect getMaxBounds() { return null; }
    public int getRotation() { return 0; }
    public void setRotation(int p0) {}
    public void setWindowingMode(int p0) {}
    @android.app.WindowConfiguration.WindowingMode
    public int getWindowingMode() { return 0; }
    public void setDisplayWindowingMode(int p0) {}
    @android.app.WindowConfiguration.WindowingMode
    public int getDisplayWindowingMode() { return 0; }
    public void setActivityType(int p0) {}
    @android.app.WindowConfiguration.ActivityType
    public int getActivityType() { return 0; }
    public void setTo(android.app.WindowConfiguration p0) {}
    public void unset() {}
    public void setToDefaults() {}
    @android.app.WindowConfiguration.WindowConfig
    public int updateFrom(android.app.WindowConfiguration p0) { return 0; }
    public void setTo(android.app.WindowConfiguration p0, int p1) {}
    @android.app.WindowConfiguration.WindowConfig
    public long diff(android.app.WindowConfiguration p0, boolean p1) { return 0L; }
    public int compareTo(android.app.WindowConfiguration p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void readFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.io.IOException, android.util.proto.WireTypeMismatchException {}
    public boolean hasWindowShadow() { return false; }
    public boolean hasWindowDecorCaption() { return false; }
    public boolean canResizeTask() { return false; }
    public boolean persistTaskBounds() { return false; }
    public boolean tasksAreFloating() { return false; }
    public static boolean isFloating(int p0) { return false; }
    public static boolean inMultiWindowMode(int p0) { return false; }
    public static boolean isSplitScreenWindowingMode(int p0) { return false; }
    public boolean canReceiveKeys() { return false; }
    public boolean isAlwaysOnTop() { return false; }
    public boolean keepVisibleDeadAppWindowOnScreen() { return false; }
    public boolean useWindowFrameForBackdrop() { return false; }
    public boolean hasMovementAnimations() { return false; }
    public boolean supportSplitScreenWindowingMode() { return false; }
    public static boolean supportSplitScreenWindowingMode(int p0) { return false; }
    public static java.lang.String windowingModeToString(int p0) { return null; }
    public static java.lang.String activityTypeToString(int p0) { return null; }
    public static java.lang.String alwaysOnTopToString(int p0) { return null; }

    public static @interface ActivityType {
    }

    private static @interface AlwaysOnTop {
    }

    public static @interface WindowConfig {
    }

    public static @interface WindowingMode {
    }
}
