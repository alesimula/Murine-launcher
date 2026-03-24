package android.view;

public class RemoteAnimationAdapter implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationAdapter> CREATOR = null;
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2, boolean p3) {}
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2) {}
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2, android.app.IApplicationThread p3) {}
    public RemoteAnimationAdapter(android.os.Parcel p0) {}
    public android.view.IRemoteAnimationRunner getRunner() { return null; }
    public long getDuration() { return 0L; }
    public long getStatusBarTransitionDelay() { return 0L; }
    public boolean getChangeNeedsSnapshot() { return false; }
    public void setCallingPidUid(int p0, int p1) {}
    public int getCallingPid() { return 0; }
    public int getCallingUid() { return 0; }
    public android.app.IApplicationThread getCallingApplication() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
