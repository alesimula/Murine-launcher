package android.net;

public final class IpSecAlgorithm implements android.os.Parcelable {
    public static final java.lang.String AUTH_AES_CMAC = "cmac(aes)";
    public static final java.lang.String AUTH_AES_XCBC = "xcbc(aes)";
    public static final java.lang.String AUTH_CRYPT_AES_GCM = "rfc4106(gcm(aes))";
    public static final java.lang.String AUTH_CRYPT_CHACHA20_POLY1305 = "rfc7539esp(chacha20,poly1305)";
    public static final java.lang.String AUTH_HMAC_MD5 = "hmac(md5)";
    public static final java.lang.String AUTH_HMAC_SHA1 = "hmac(sha1)";
    public static final java.lang.String AUTH_HMAC_SHA256 = "hmac(sha256)";
    public static final java.lang.String AUTH_HMAC_SHA384 = "hmac(sha384)";
    public static final java.lang.String AUTH_HMAC_SHA512 = "hmac(sha512)";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.IpSecAlgorithm> CREATOR = null;
    public static final java.lang.String CRYPT_AES_CBC = "cbc(aes)";
    public static final java.lang.String CRYPT_AES_CTR = "rfc3686(ctr(aes))";
    public IpSecAlgorithm(java.lang.String p0, byte[] p1) {}
    public IpSecAlgorithm(java.lang.String p0, byte[] p1, int p2) {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public byte[] getKey() { return null; }
    public int getTruncationLengthBits() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public static java.util.Set<java.lang.String> getSupportedAlgorithms() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
