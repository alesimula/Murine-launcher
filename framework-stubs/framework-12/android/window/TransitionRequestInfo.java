package android.window;

public final class TransitionRequestInfo implements android.os.Parcelable {
    private final int mType = 0;
    private android.app.ActivityManager.RunningTaskInfo mTriggerTask;
    private android.window.IRemoteTransition mRemoteTransition;
    public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo> CREATOR = null;
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.IRemoteTransition p2) {}
    public int getType() { return 0; }
    public android.app.ActivityManager.RunningTaskInfo getTriggerTask() { return null; }
    public android.window.IRemoteTransition getRemoteTransition() { return null; }
    public android.window.TransitionRequestInfo setTriggerTask(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
    public android.window.TransitionRequestInfo setRemoteTransition(android.window.IRemoteTransition p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TransitionRequestInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
