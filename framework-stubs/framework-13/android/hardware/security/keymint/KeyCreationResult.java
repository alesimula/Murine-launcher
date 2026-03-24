package android.hardware.security.keymint;

public class KeyCreationResult implements android.os.Parcelable {
    public byte[] keyBlob;
    public android.hardware.security.keymint.KeyCharacteristics[] keyCharacteristics;
    public android.hardware.security.keymint.Certificate[] certificateChain;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.KeyCreationResult> CREATOR = null;
    public KeyCreationResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
