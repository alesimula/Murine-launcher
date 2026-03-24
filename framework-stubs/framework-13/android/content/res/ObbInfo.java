package android.content.res;

public class ObbInfo implements android.os.Parcelable {
    public static final int OBB_OVERLAY = 1;
    public java.lang.String filename;
    public java.lang.String packageName;
    public int version;
    public int flags;
    public byte[] salt;
    public static final android.os.Parcelable.Creator<android.content.res.ObbInfo> CREATOR = null;
    ObbInfo() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
