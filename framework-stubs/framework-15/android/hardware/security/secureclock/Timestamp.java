package android.hardware.security.secureclock;

public class Timestamp implements android.os.Parcelable {
    public long milliSeconds;
    public static final android.os.Parcelable.Creator<android.hardware.security.secureclock.Timestamp> CREATOR = null;
    public Timestamp() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
