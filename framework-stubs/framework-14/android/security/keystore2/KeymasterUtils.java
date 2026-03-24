package android.security.keystore2;

public abstract class KeymasterUtils {
    static int getDigestOutputSizeBits(int p0) { return 0; }
    static boolean isKeymasterBlockModeIndCpaCompatibleWithSymmetricCrypto(int p0) { return false; }
    static boolean isKeymasterPaddingSchemeIndCpaCompatibleWithAsymmetricCrypto(int p0) { return false; }
    public static void addMinMacLengthAuthorizationIfNecessary(android.security.keymaster.KeymasterArguments p0, int p1, int[] p2, int[] p3) {}
    static java.lang.String getEcCurveFromKeymaster(int p0) { return null; }
    static int getKeymasterEcCurve(java.lang.String p0) { return 0; }
    static java.security.spec.ECParameterSpec getCurveSpec(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidParameterSpecException { return null; }
    static java.lang.String getCurveName(java.security.spec.ECParameterSpec p0) { return null; }
}
