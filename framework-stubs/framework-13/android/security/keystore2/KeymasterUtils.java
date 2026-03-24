package android.security.keystore2;

public abstract class KeymasterUtils {
    static int getDigestOutputSizeBits(int p0) { return 0; }
    static boolean isKeymasterBlockModeIndCpaCompatibleWithSymmetricCrypto(int p0) { return false; }
    static boolean isKeymasterPaddingSchemeIndCpaCompatibleWithAsymmetricCrypto(int p0) { return false; }
    public static void addMinMacLengthAuthorizationIfNecessary(android.security.keymaster.KeymasterArguments p0, int p1, int[] p2, int[] p3) {}
}
