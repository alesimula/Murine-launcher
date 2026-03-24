package android.view;

public class RemoteAnimationAdapter implements android.os.Parcelable {
    private final android.view.IRemoteAnimationRunner mRunner = null;
    private final long mDuration = 0L;
    private final long mStatusBarTransitionDelay = 0L;
    private final boolean mChangeNeedsSnapshot = false;
    private int mCallingPid;
    private int mCallingUid;
    public static final android.os.Parcelable.Creator<android.view.RemoteAnimationAdapter> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2, boolean p3) {}
    @android.annotation.UnsupportedAppUsage
    public RemoteAnimationAdapter(android.view.IRemoteAnimationRunner p0, long p1, long p2) {}
    public RemoteAnimationAdapter(android.os.Parcel p0) {}
    public android.view.IRemoteAnimationRunner getRunner() { return null; }
    public long getDuration() { return 0L; }
    public long getStatusBarTransitionDelay() { return 0L; }
    public boolean getChangeNeedsSnapshot() { return false; }
    public void setCallingPidUid(int p0, int p1) {}
    public int getCallingPid() { return 0; }
    public int getCallingUid() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
