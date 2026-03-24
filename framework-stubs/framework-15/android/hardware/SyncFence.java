package android.hardware;

public final class SyncFence implements java.lang.AutoCloseable, android.os.Parcelable {
    public static final long SIGNAL_TIME_INVALID = -1L;
    public static final long SIGNAL_TIME_PENDING = 9223372036854775807L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.SyncFence> CREATOR = null;
    public SyncFence(long p0) {}
    @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
    public SyncFence(android.hardware.SyncFence p0) {}
    @android.annotation.NonNull
    public static android.hardware.SyncFence createEmpty() { return null; }
    @android.annotation.NonNull
    public static android.hardware.SyncFence create(android.os.ParcelFileDescriptor p0) { return null; }
    @android.annotation.NonNull
    public static android.hardware.SyncFence adopt(int p0) { return null; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor getFdDup() throws java.io.IOException { return null; }
    public boolean isValid() { return false; }
    public boolean await(java.time.Duration p0) { return false; }
    public boolean awaitForever() { return false; }
    public long getSignalTime() { return 0L; }
    public void close() {}
    public int describeContents() { return 0; }
    public java.lang.Object getLock() { return null; }
    public long getNativeFence() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
