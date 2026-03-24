package android.security.keystore;

@android.annotation.SystemApi
public abstract class AttestationUtils {
    public static final int ID_TYPE_SERIAL = 1;
    public static final int ID_TYPE_IMEI = 2;
    public static final int ID_TYPE_MEID = 3;
    public static final int USE_INDIVIDUAL_ATTESTATION = 4;
    private AttestationUtils() {}
    public static java.security.cert.X509Certificate[] parseCertificateChain(android.security.keymaster.KeymasterCertificateChain p0) throws android.security.keystore.KeyAttestationException { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static java.security.cert.X509Certificate[] attestDeviceIds(android.content.Context p0, int[] p1, byte[] p2) throws android.security.keystore.DeviceIdAttestationException { return null; }
    private static java.lang.String generateRandomAlias() { return null; }
    public static boolean isChainValid(android.security.keymaster.KeymasterCertificateChain p0) { return false; }
}
