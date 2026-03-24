package android.security.keymaster;

public class KeymasterCertificateChain implements android.os.Parcelable {
    private java.util.List<byte[]> mCertificates;
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterCertificateChain> CREATOR = null;
    public KeymasterCertificateChain() {}
    public KeymasterCertificateChain(java.util.List<byte[]> p0) {}
    private KeymasterCertificateChain(android.os.Parcel p0) {}
    public void shallowCopyFrom(android.security.keymaster.KeymasterCertificateChain p0) {}
    public java.util.List<byte[]> getCertificates() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
