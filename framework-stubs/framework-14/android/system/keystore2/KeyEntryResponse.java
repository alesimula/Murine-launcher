package android.system.keystore2;

public class KeyEntryResponse implements android.os.Parcelable {
    public android.system.keystore2.IKeystoreSecurityLevel iSecurityLevel;
    public android.system.keystore2.KeyMetadata metadata;
    public static final android.os.Parcelable.Creator<android.system.keystore2.KeyEntryResponse> CREATOR = null;
    public KeyEntryResponse() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
