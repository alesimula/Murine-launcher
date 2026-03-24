package android.hardware.security.keymint;

public class HardwareAuthToken implements android.os.Parcelable {
    public long challenge;
    public long userId;
    public long authenticatorId;
    public int authenticatorType;
    public android.hardware.security.secureclock.Timestamp timestamp;
    public byte[] mac;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.HardwareAuthToken> CREATOR = null;
    public HardwareAuthToken() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
