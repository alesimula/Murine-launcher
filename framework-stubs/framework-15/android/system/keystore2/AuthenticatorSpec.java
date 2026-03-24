package android.system.keystore2;

public class AuthenticatorSpec implements android.os.Parcelable {
    public int authenticatorType;
    public long authenticatorId;
    public static final android.os.Parcelable.Creator<android.system.keystore2.AuthenticatorSpec> CREATOR = null;
    public AuthenticatorSpec() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
