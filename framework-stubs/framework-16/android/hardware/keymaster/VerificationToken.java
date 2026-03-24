package android.hardware.keymaster;

public class VerificationToken implements android.os.Parcelable {
    public long challenge;
    public android.hardware.keymaster.Timestamp timestamp;
    public int securityLevel;
    public byte[] mac;
    public static final android.os.Parcelable.Creator<android.hardware.keymaster.VerificationToken> CREATOR = null;
    public VerificationToken() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
