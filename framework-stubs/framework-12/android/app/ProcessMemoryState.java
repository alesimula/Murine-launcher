package android.app;

public final class ProcessMemoryState implements android.os.Parcelable {
    public final int uid = 0;
    public final int pid = 0;
    public final java.lang.String processName = null;
    public final int oomScore = 0;
    public static final android.os.Parcelable.Creator<android.app.ProcessMemoryState> CREATOR = null;
    public ProcessMemoryState(int p0, int p1, java.lang.String p2, int p3) {}
    private ProcessMemoryState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
