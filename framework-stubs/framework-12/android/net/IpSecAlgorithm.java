package android.net;

public final class IpSecAlgorithm implements android.os.Parcelable {
    private static final java.lang.String TAG = "IpSecAlgorithm";
    public static final java.lang.String CRYPT_NULL = "ecb(cipher_null)";
    public static final java.lang.String CRYPT_AES_CBC = "cbc(aes)";
    public static final java.lang.String CRYPT_AES_CTR = "rfc3686(ctr(aes))";
    public static final java.lang.String AUTH_HMAC_MD5 = "hmac(md5)";
    public static final java.lang.String AUTH_HMAC_SHA1 = "hmac(sha1)";
    public static final java.lang.String AUTH_HMAC_SHA256 = "hmac(sha256)";
    public static final java.lang.String AUTH_HMAC_SHA384 = "hmac(sha384)";
    public static final java.lang.String AUTH_HMAC_SHA512 = "hmac(sha512)";
    public static final java.lang.String AUTH_AES_XCBC = "xcbc(aes)";
    public static final java.lang.String AUTH_AES_CMAC = "cmac(aes)";
    public static final java.lang.String AUTH_CRYPT_AES_GCM = "rfc4106(gcm(aes))";
    public static final java.lang.String AUTH_CRYPT_CHACHA20_POLY1305 = "rfc7539esp(chacha20,poly1305)";
    public static final java.util.Map<java.lang.String, java.lang.Integer> ALGO_TO_REQUIRED_FIRST_SDK = null;
    private static final int SDK_VERSION_ZERO = 0;
    private static final java.util.Set<java.lang.String> ENABLED_ALGOS = null;
    private final java.lang.String mName = null;
    private final byte[] mKey = null;
    private final int mTruncLenBits = 0;
    public static final android.os.Parcelable.Creator<android.net.IpSecAlgorithm> CREATOR = null;
    public IpSecAlgorithm(java.lang.String p0, byte[] p1) {}
    public IpSecAlgorithm(java.lang.String p0, byte[] p1, int p2) {}
    public java.lang.String getName() { return null; }
    public byte[] getKey() { return null; }
    public int getTruncationLengthBits() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.util.Set<java.lang.String> getSupportedAlgorithms() { return null; }
    public static java.util.Set<java.lang.String> loadAlgos(android.content.res.Resources p0) { return null; }
    private static void checkValidOrThrow(java.lang.String p0, int p1, int p2) {}
    public boolean isAuthentication() { return false; }
    public boolean isEncryption() { return false; }
    public boolean isAead() { return false; }
    private static boolean isUnsafeBuild() { return false; }
    public java.lang.String toString() { return null; }
    public static boolean equals(android.net.IpSecAlgorithm p0, android.net.IpSecAlgorithm p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlgorithmName {
    }
}
