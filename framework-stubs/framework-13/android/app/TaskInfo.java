package android.app;

public class TaskInfo {
    public static final int PROPERTY_VALUE_UNSET = -1;
    public int userId;
    public int taskId;
    public boolean isRunning;
    public android.content.Intent baseIntent;
    public android.content.ComponentName baseActivity;
    public android.content.ComponentName topActivity;
    public android.content.ComponentName origActivity;
    public android.content.ComponentName realActivity;
    public int numActivities;
    public long lastActiveTime;
    public int displayId;
    public int displayAreaFeatureId;
    public android.app.ActivityManager.TaskDescription taskDescription;
    public android.content.LocusId mTopActivityLocusId;
    public boolean supportsMultiWindow;
    public int resizeMode;
    public final android.content.res.Configuration configuration = null;
    public android.window.WindowContainerToken token;
    public android.app.PictureInPictureParams pictureInPictureParams;
    public boolean shouldDockBigOverlays;
    public int launchIntoPipHostTaskId;
    public int lastParentTaskIdBeforePip;
    public android.graphics.Rect displayCutoutInsets;
    @android.app.WindowConfiguration.ActivityType
    public int topActivityType;
    public android.content.pm.ActivityInfo topActivityInfo;
    public boolean topActivityInSizeCompat;
    public boolean topActivityEligibleForLetterboxEducation;
    public boolean isLetterboxDoubleTapEnabled;
    public boolean isFromLetterboxDoubleTap;
    public int topActivityLetterboxVerticalPosition;
    public int topActivityLetterboxHorizontalPosition;
    public int topActivityLetterboxWidth;
    public int topActivityLetterboxHeight;
    public boolean isResizeable;
    public int minWidth;
    public int minHeight;
    public int defaultMinSize;
    public android.graphics.Point positionInParent;
    public java.util.ArrayList<android.os.IBinder> launchCookies;
    public int parentTaskId;
    public boolean isFocused;
    public boolean isVisible;
    public boolean isSleeping;
    public static final int CAMERA_COMPAT_CONTROL_HIDDEN = 0;
    public static final int CAMERA_COMPAT_CONTROL_TREATMENT_SUGGESTED = 1;
    public static final int CAMERA_COMPAT_CONTROL_TREATMENT_APPLIED = 2;
    public static final int CAMERA_COMPAT_CONTROL_DISMISSED = 3;
    public int cameraCompatControlState;
    TaskInfo() {}
    public boolean isVisible() { return false; }
    public android.window.WindowContainerToken getToken() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.app.PictureInPictureParams getPictureInPictureParams() { return null; }
    public boolean shouldDockBigOverlays() { return false; }
    @android.app.WindowConfiguration.WindowingMode
    public int getWindowingMode() { return 0; }
    @android.app.WindowConfiguration.ActivityType
    public int getActivityType() { return 0; }
    public void addLaunchCookie(android.os.IBinder p0) {}
    public boolean hasCameraCompatControl() { return false; }
    public boolean hasCompatUI() { return false; }
    public boolean containsLaunchCookie(android.os.IBinder p0) { return false; }
    public int getParentTaskId() { return 0; }
    public boolean hasParentTask() { return false; }
    public boolean equalsForTaskOrganizer(android.app.TaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.TaskInfo p0) { return false; }
    void readFromParcel(android.os.Parcel p0) {}
    void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String cameraCompatControlStateToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CameraCompatControlState {
    }
}
