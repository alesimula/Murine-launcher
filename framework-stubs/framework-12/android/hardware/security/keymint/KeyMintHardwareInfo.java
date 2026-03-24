package android.hardware.security.keymint;

public class KeyMintHardwareInfo implements android.os.Parcelable {
    public int versionNumber;
    public int securityLevel;
    public java.lang.String keyMintName;
    public java.lang.String keyMintAuthorName;
    public boolean timestampTokenRequired;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.KeyMintHardwareInfo> CREATOR = null;
    public KeyMintHardwareInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
