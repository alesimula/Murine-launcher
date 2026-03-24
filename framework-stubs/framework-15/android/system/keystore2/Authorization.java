package android.system.keystore2;

public class Authorization implements android.os.Parcelable {
    public int securityLevel;
    public android.hardware.security.keymint.KeyParameter keyParameter;
    public static final android.os.Parcelable.Creator<android.system.keystore2.Authorization> CREATOR = null;
    public Authorization() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
