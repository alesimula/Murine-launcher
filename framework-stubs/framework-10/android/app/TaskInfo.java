package android.app;

public class TaskInfo {
    private static final java.lang.String TAG = "TaskInfo";
    @android.annotation.UnsupportedAppUsage
    public int userId;
    @android.annotation.UnsupportedAppUsage
    public int stackId;
    public int taskId;
    public boolean isRunning;
    public android.content.Intent baseIntent;
    public android.content.ComponentName baseActivity;
    public android.content.ComponentName topActivity;
    public android.content.ComponentName origActivity;
    public android.content.ComponentName realActivity;
    public int numActivities;
    @android.annotation.UnsupportedAppUsage
    public long lastActiveTime;
    public int displayId;
    public android.app.ActivityManager.TaskDescription taskDescription;
    @android.annotation.UnsupportedAppUsage
    public boolean supportsSplitScreenMultiWindow;
    @android.annotation.UnsupportedAppUsage
    public int resizeMode;
    @android.annotation.UnsupportedAppUsage
    public final android.content.res.Configuration configuration = null;
    TaskInfo() {}
    private TaskInfo(android.os.Parcel p0) {}
    public android.app.ActivityManager.TaskSnapshot getTaskSnapshot(boolean p0) { return null; }
    void readFromParcel(android.os.Parcel p0) {}
    void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
