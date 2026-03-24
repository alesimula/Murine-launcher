package android.security.keystore;

public abstract class KeymasterUtils {
    private KeymasterUtils() {}
    public static int getDigestOutputSizeBits(int p0) { return 0; }
    public static boolean isKeymasterBlockModeIndCpaCompatibleWithSymmetricCrypto(int p0) { return false; }
    public static boolean isKeymasterPaddingSchemeIndCpaCompatibleWithAsymmetricCrypto(int p0) { return false; }
    public static void addUserAuthArgs(android.security.keymaster.KeymasterArguments p0, android.security.keystore.UserAuthArgs p1) {}
    public static void addMinMacLengthAuthorizationIfNecessary(android.security.keymaster.KeymasterArguments p0, int p1, int[] p2, int[] p3) {}
    private static long getRootSid() { return 0L; }
}
