package android.security.keymaster;

public class KeymasterBlob implements android.os.Parcelable {
    public byte[] blob;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterBlob> CREATOR = null;
    public KeymasterBlob(byte[] p0) {}
    protected KeymasterBlob(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
