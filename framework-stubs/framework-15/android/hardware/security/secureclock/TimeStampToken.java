package android.hardware.security.secureclock;

public class TimeStampToken implements android.os.Parcelable {
    public long challenge;
    public android.hardware.security.secureclock.Timestamp timestamp;
    public byte[] mac;
    public static final android.os.Parcelable.Creator<android.hardware.security.secureclock.TimeStampToken> CREATOR = null;
    public TimeStampToken() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
