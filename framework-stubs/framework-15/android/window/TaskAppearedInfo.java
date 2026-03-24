package android.window;

public final class TaskAppearedInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskAppearedInfo> CREATOR = null;
    public TaskAppearedInfo(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.app.ActivityManager.RunningTaskInfo getTaskInfo() { return null; }
    @android.annotation.NonNull
    public android.view.SurfaceControl getLeash() { return null; }
}
