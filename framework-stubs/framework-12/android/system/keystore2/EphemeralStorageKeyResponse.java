package android.system.keystore2;

public class EphemeralStorageKeyResponse implements android.os.Parcelable {
    public byte[] ephemeralKey;
    public byte[] upgradedBlob;
    public static final android.os.Parcelable.Creator<android.system.keystore2.EphemeralStorageKeyResponse> CREATOR = null;
    public EphemeralStorageKeyResponse() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
