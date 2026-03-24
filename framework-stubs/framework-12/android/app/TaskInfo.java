package android.app;

public class TaskInfo {
    private static final java.lang.String TAG = "TaskInfo";
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
    public android.app.ActivityManager.TaskDescription taskDescription;
    public android.content.LocusId mTopActivityLocusId;
    public boolean supportsSplitScreenMultiWindow;
    public boolean supportsMultiWindow;
    public int resizeMode;
    public final android.content.res.Configuration configuration = null;
    public android.window.WindowContainerToken token;
    public android.app.PictureInPictureParams pictureInPictureParams;
    public android.graphics.Rect displayCutoutInsets;
    @android.app.WindowConfiguration.ActivityType
    public int topActivityType;
    public android.content.pm.ActivityInfo topActivityInfo;
    public boolean topActivityInSizeCompat;
    public boolean isResizeable;
    public android.graphics.Point positionInParent;
    public java.util.ArrayList<android.os.IBinder> launchCookies;
    public int parentTaskId;
    public boolean isFocused;
    public boolean isVisible;
    TaskInfo() {}
    private TaskInfo(android.os.Parcel p0) {}
    public android.window.TaskSnapshot getTaskSnapshot(boolean p0) { return null; }
    public android.window.WindowContainerToken getToken() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.app.PictureInPictureParams getPictureInPictureParams() { return null; }
    @android.app.WindowConfiguration.WindowingMode
    public int getWindowingMode() { return 0; }
    @android.app.WindowConfiguration.ActivityType
    public int getActivityType() { return 0; }
    public void addLaunchCookie(android.os.IBinder p0) {}
    public boolean containsLaunchCookie(android.os.IBinder p0) { return false; }
    public int getParentTaskId() { return 0; }
    public boolean hasParentTask() { return false; }
    public boolean equalsForTaskOrganizer(android.app.TaskInfo p0) { return false; }
    public boolean equalsForSizeCompat(android.app.TaskInfo p0) { return false; }
    void readFromParcel(android.os.Parcel p0) {}
    void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
