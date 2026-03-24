package android.window;

public final class StartingWindowInfo implements android.os.Parcelable {
    public static final int STARTING_WINDOW_TYPE_NONE = 0;
    public static final int STARTING_WINDOW_TYPE_SPLASH_SCREEN = 1;
    public static final int STARTING_WINDOW_TYPE_SNAPSHOT = 2;
    public static final int STARTING_WINDOW_TYPE_SOLID_COLOR_SPLASH_SCREEN = 3;
    public static final int STARTING_WINDOW_TYPE_LEGACY_SPLASH_SCREEN = 4;
    public android.app.ActivityManager.RunningTaskInfo taskInfo;
    public android.content.pm.ActivityInfo targetActivityInfo;
    public android.view.InsetsState topOpaqueWindowInsetsState;
    public android.view.WindowManager.LayoutParams topOpaqueWindowLayoutParams;
    public android.view.WindowManager.LayoutParams mainWindowLayoutParams;
    public static final int TYPE_PARAMETER_NEW_TASK = 1;
    public static final int TYPE_PARAMETER_TASK_SWITCH = 2;
    public static final int TYPE_PARAMETER_PROCESS_RUNNING = 4;
    public static final int TYPE_PARAMETER_ALLOW_TASK_SNAPSHOT = 8;
    public static final int TYPE_PARAMETER_ACTIVITY_CREATED = 16;
    public static final int TYPE_PARAMETER_USE_SOLID_COLOR_SPLASH_SCREEN = 32;
    public static final int TYPE_PARAMETER_ACTIVITY_DRAWN = 64;
    public static final int TYPE_PARAMETER_ALLOW_HANDLE_SOLID_COLOR_SCREEN = 128;
    public static final int TYPE_PARAMETER_LEGACY_SPLASH_SCREEN = -2147483648;
    public int startingWindowTypeParameter;
    public int splashScreenThemeResId;
    public boolean isKeyguardOccluded;
    public android.window.TaskSnapshot taskSnapshot;
    public final android.view.InsetsVisibilities requestedVisibilities = null;
    public static final android.os.Parcelable.Creator<android.window.StartingWindowInfo> CREATOR = null;
    public StartingWindowInfo() {}
    public boolean allowHandleSolidColorSplashScreen() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }

    public static @interface StartingTypeParams {
    }

    public static @interface StartingWindowType {
    }
}
