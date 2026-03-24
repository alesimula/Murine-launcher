package android.system.suspend;

public class WakeLockInfo implements android.os.Parcelable {
    public java.lang.String name;
    public long activeCount;
    public long lastChange;
    public long maxTime;
    public long totalTime;
    public boolean isActive;
    public long activeTime;
    public boolean isKernelWakelock;
    public int pid;
    public long eventCount;
    public long expireCount;
    public long preventSuspendTime;
    public long wakeupCount;
    public static final android.os.Parcelable.Creator<android.system.suspend.WakeLockInfo> CREATOR = null;
    public WakeLockInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
