package android.security.authorization;

public class AuthorizationTokens implements android.os.Parcelable {
    public android.hardware.security.keymint.HardwareAuthToken authToken;
    public android.hardware.security.secureclock.TimeStampToken timestampToken;
    public static final android.os.Parcelable.Creator<android.security.authorization.AuthorizationTokens> CREATOR = null;
    public AuthorizationTokens() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
