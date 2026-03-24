package android.app;

public class TaskInfo {
    private static final java.lang.String TAG = "TaskInfo";
    public int userId;
    public int stackId;
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
    public boolean supportsSplitScreenMultiWindow;
    public int resizeMode;
    public final android.content.res.Configuration configuration = null;
    public android.window.WindowContainerToken token;
    public android.app.PictureInPictureParams pictureInPictureParams;
    @android.app.WindowConfiguration.ActivityType
    public int topActivityType;
    public android.content.pm.ActivityInfo topActivityInfo;
    public boolean isResizeable;
    public int requestedOrientation;
    TaskInfo() {}
    private TaskInfo(android.os.Parcel p0) {}
    public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(boolean p0) { return null; }
    public android.window.WindowContainerToken getToken() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    void readFromParcel(android.os.Parcel p0) {}
    void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
