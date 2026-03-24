package android.gsi;

public class GsiProgress implements android.os.Parcelable {
    public java.lang.String step;
    public int status;
    public long bytes_processed;
    public long total_bytes;
    public static final android.os.Parcelable.Creator<android.gsi.GsiProgress> CREATOR = null;
    public GsiProgress() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
