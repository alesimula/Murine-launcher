package android.system.keystore2;

public class KeyMetadata implements android.os.Parcelable {
    public android.system.keystore2.KeyDescriptor key;
    public int keySecurityLevel;
    public android.system.keystore2.Authorization[] authorizations;
    public byte[] certificate;
    public byte[] certificateChain;
    public long modificationTimeMs;
    public static final android.os.Parcelable.Creator<android.system.keystore2.KeyMetadata> CREATOR = null;
    public KeyMetadata() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
