package android.system.keystore2;

public class KeyParameters implements android.os.Parcelable {
    public android.hardware.security.keymint.KeyParameter[] keyParameter;
    public static final android.os.Parcelable.Creator<android.system.keystore2.KeyParameters> CREATOR = null;
    public KeyParameters() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
