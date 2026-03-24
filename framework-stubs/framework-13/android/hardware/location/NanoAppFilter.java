package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NanoAppFilter implements android.os.Parcelable {
    public static final int FLAGS_VERSION_ANY = -1;
    public static final int FLAGS_VERSION_GREAT_THAN = 2;
    public static final int FLAGS_VERSION_LESS_THAN = 4;
    public static final int FLAGS_VERSION_STRICTLY_EQUAL = 8;
    public static final int APP_ANY = -1;
    public static final int VENDOR_ANY = -1;
    public static final int HUB_ANY = -1;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppFilter> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public NanoAppFilter(long p0, int p1, int p2, long p3) {}
    public boolean testMatch(android.hardware.location.NanoAppInstanceInfo p0) { return false; }
    public java.lang.String toString() { return null; }
}
