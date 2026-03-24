package android.hardware.gnss;

public class BlocklistedSource implements android.os.Parcelable {
    public int constellation;
    public int svid;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.BlocklistedSource> CREATOR = null;
    public BlocklistedSource() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
