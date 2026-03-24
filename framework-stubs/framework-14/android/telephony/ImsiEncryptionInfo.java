package android.telephony;

@android.annotation.SystemApi
public final class ImsiEncryptionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.ImsiEncryptionInfo> CREATOR = null;
    public ImsiEncryptionInfo(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, byte[] p4, java.util.Date p5, int p6) {}
    public ImsiEncryptionInfo(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.security.PublicKey p4, java.util.Date p5, int p6) {}
    public ImsiEncryptionInfo(android.os.Parcel p0) {}
    public java.lang.String getMnc() { return null; }
    public java.lang.String getMcc() { return null; }
    public int getCarrierId() { return 0; }
    public java.lang.String getKeyIdentifier() { return null; }
    public int getKeyType() { return 0; }
    public java.security.PublicKey getPublicKey() { return null; }
    public java.util.Date getExpirationTime() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
