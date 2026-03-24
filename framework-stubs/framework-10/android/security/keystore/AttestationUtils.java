package android.security.keystore;

@android.annotation.SystemApi
public abstract class AttestationUtils {
    public static final int ID_TYPE_SERIAL = 1;
    public static final int ID_TYPE_IMEI = 2;
    public static final int ID_TYPE_MEID = 3;
    private AttestationUtils() {}
    public static java.security.cert.X509Certificate[] parseCertificateChain(android.security.keymaster.KeymasterCertificateChain p0) throws android.security.keystore.KeyAttestationException { return null; }
    private static android.security.keymaster.KeymasterArguments prepareAttestationArgumentsForDeviceId(android.content.Context p0, int[] p1, byte[] p2) throws android.security.keystore.DeviceIdAttestationException { return null; }
    public static android.security.keymaster.KeymasterArguments prepareAttestationArguments(android.content.Context p0, int[] p1, byte[] p2) throws android.security.keystore.DeviceIdAttestationException { return null; }
    public static android.security.keymaster.KeymasterArguments prepareAttestationArgumentsIfMisprovisioned(android.content.Context p0, int[] p1, byte[] p2) throws android.security.keystore.DeviceIdAttestationException { return null; }
    private static boolean isPotentiallyMisprovisionedDevice(android.content.Context p0) { return false; }
    private static android.security.keymaster.KeymasterArguments prepareAttestationArguments(android.content.Context p0, int[] p1, byte[] p2, java.lang.String p3) throws android.security.keystore.DeviceIdAttestationException { return null; }
    public static java.security.cert.X509Certificate[] attestDeviceIds(android.content.Context p0, int[] p1, byte[] p2) throws android.security.keystore.DeviceIdAttestationException { return null; }
    public static boolean isChainValid(android.security.keymaster.KeymasterCertificateChain p0) { return false; }
}
