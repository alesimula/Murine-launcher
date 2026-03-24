package android.hardware.security.keymint;

public class KeyCharacteristics implements android.os.Parcelable {
    public int securityLevel;
    public android.hardware.security.keymint.KeyParameter[] authorizations;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.KeyCharacteristics> CREATOR = null;
    public KeyCharacteristics() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
