package android.app;

public final class ProcessMemoryState implements android.os.Parcelable {
    public final int uid = 0;
    public final int pid = 0;
    public final java.lang.String processName = null;
    public final int oomScore = 0;
    public final boolean hasForegroundServices = false;
    public static final android.os.Parcelable.Creator<android.app.ProcessMemoryState> CREATOR = null;
    public ProcessMemoryState(int p0, int p1, java.lang.String p2, int p3, boolean p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
