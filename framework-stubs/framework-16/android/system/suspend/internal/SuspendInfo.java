package android.system.suspend.internal;

public class SuspendInfo implements android.os.Parcelable {
    public long suspendAttemptCount;
    public long failedSuspendCount;
    public long shortSuspendCount;
    public long suspendTimeMillis;
    public long shortSuspendTimeMillis;
    public long suspendOverheadTimeMillis;
    public long failedSuspendOverheadTimeMillis;
    public long newBackoffCount;
    public long backoffContinueCount;
    public long sleepTimeMillis;
    public static final android.os.Parcelable.Creator<android.system.suspend.internal.SuspendInfo> CREATOR = null;
    public SuspendInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
