package android.app;

public class WindowConfiguration implements android.os.Parcelable, java.lang.Comparable<android.app.WindowConfiguration> {
    public static final int ROTATION_UNDEFINED = -1;
    public static final int WINDOWING_MODE_UNDEFINED = 0;
    public static final int WINDOWING_MODE_FULLSCREEN = 1;
    public static final int WINDOWING_MODE_PINNED = 2;
    public static final int WINDOWING_MODE_FREEFORM = 5;
    public static final int WINDOWING_MODE_MULTI_WINDOW = 6;
    public static final int ACTIVITY_TYPE_UNDEFINED = 0;
    public static final int ACTIVITY_TYPE_STANDARD = 1;
    public static final int ACTIVITY_TYPE_HOME = 2;
    public static final int ACTIVITY_TYPE_RECENTS = 3;
    public static final int ACTIVITY_TYPE_ASSISTANT = 4;
    public static final int ACTIVITY_TYPE_DREAM = 5;
    public static final int WINDOW_CONFIG_BOUNDS = 1;
    public static final int WINDOW_CONFIG_APP_BOUNDS = 2;
    public static final int WINDOW_CONFIG_MAX_BOUNDS = 4;
    public static final int WINDOW_CONFIG_WINDOWING_MODE = 8;
    public static final int WINDOW_CONFIG_ACTIVITY_TYPE = 16;
    public static final int WINDOW_CONFIG_ALWAYS_ON_TOP = 32;
    public static final int WINDOW_CONFIG_ROTATION = 64;
    public static final int WINDOW_CONFIG_DISPLAY_ROTATION = 128;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.WindowConfiguration> CREATOR = null;
    public WindowConfiguration() {}
    public WindowConfiguration(android.app.WindowConfiguration p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void setBounds(android.graphics.Rect p0) {}
    public void setAppBounds(android.graphics.Rect p0) {}
    public void setMaxBounds(android.graphics.Rect p0) {}
    public void setMaxBounds(int p0, int p1, int p2, int p3) {}
    public void setDisplayRotation(int p0) {}
    public void setAlwaysOnTop(boolean p0) {}
    public void unsetAlwaysOnTop() {}
    public void setAppBounds(int p0, int p1, int p2, int p3) {}
    @android.annotation.Nullable
    public android.graphics.Rect getAppBounds() { return null; }
    @android.annotation.NonNull
    public android.graphics.Rect getBounds() { return null; }
    @android.annotation.NonNull
    public android.graphics.Rect getMaxBounds() { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getDisplayRotation() { return 0; }
    public int getRotation() { return 0; }
    public void setRotation(int p0) {}
    public void setWindowingMode(int p0) {}
    public int getWindowingMode() { return 0; }
    public void setActivityType(int p0) {}
    public int getActivityType() { return 0; }
    public void setTo(android.app.WindowConfiguration p0) {}
    public void unset() {}
    public void setToDefaults() {}
    public void scale(float p0) {}
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
    public boolean canResizeTask() { return false; }
    public boolean persistTaskBounds() { return false; }
    public boolean tasksAreFloating() { return false; }
    public static boolean isFloating(int p0) { return false; }
    public static boolean inMultiWindowMode(int p0) { return false; }
    public boolean canReceiveKeys() { return false; }
    public boolean isAlwaysOnTop() { return false; }
    public boolean useWindowFrameForBackdrop() { return false; }
    public boolean hasMovementAnimations() { return false; }
    public boolean supportSplitScreenWindowingMode() { return false; }
    public static boolean supportSplitScreenWindowingMode(int p0) { return false; }
    public static boolean areConfigurationsEqualForDisplay(android.content.res.Configuration p0, android.content.res.Configuration p1) { return false; }
    public static java.lang.String windowingModeToString(int p0) { return null; }
    public static java.lang.String activityTypeToString(int p0) { return null; }
    public static java.lang.String alwaysOnTopToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActivityType {
    }

    private static @interface AlwaysOnTop {
    }

    public static @interface WindowConfig {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowingMode {
    }
}
