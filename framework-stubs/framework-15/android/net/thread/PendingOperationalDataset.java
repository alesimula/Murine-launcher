package android.net.thread;

public final class PendingOperationalDataset implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.thread.PendingOperationalDataset> CREATOR = null;
    public PendingOperationalDataset(android.net.thread.ActiveOperationalDataset p0, android.net.thread.OperationalDatasetTimestamp p1, java.time.Duration p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.net.thread.PendingOperationalDataset fromThreadTlvs(byte[] p0) { return null; }
    @android.annotation.NonNull
    public android.net.thread.ActiveOperationalDataset getActiveOperationalDataset() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getDelayTimer() { return null; }
    @android.annotation.NonNull
    public android.net.thread.OperationalDatasetTimestamp getPendingTimestamp() { return null; }
    @android.annotation.NonNull
    public byte[] toThreadTlvs() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
