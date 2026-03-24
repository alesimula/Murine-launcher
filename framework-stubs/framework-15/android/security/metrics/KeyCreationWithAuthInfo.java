package android.security.metrics;

public class KeyCreationWithAuthInfo implements android.os.Parcelable {
    public int user_auth_type;
    public int log10_auth_key_timeout_seconds;
    public int security_level;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeyCreationWithAuthInfo> CREATOR = null;
    public KeyCreationWithAuthInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
