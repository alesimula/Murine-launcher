package android.security.keystore2;

public abstract class KeyStore2ParameterUtils {
    public KeyStore2ParameterUtils() {}
    static android.hardware.security.keymint.KeyParameter makeBool(int p0) { return null; }
    static android.hardware.security.keymint.KeyParameter makeEnum(int p0, int p1) { return null; }
    static android.hardware.security.keymint.KeyParameter makeInt(int p0, int p1) { return null; }
    static android.hardware.security.keymint.KeyParameter makeLong(int p0, long p1) { return null; }
    static android.hardware.security.keymint.KeyParameter makeBytes(int p0, byte[] p1) { return null; }
    static android.hardware.security.keymint.KeyParameter makeBignum(int p0, java.math.BigInteger p1) { return null; }
    static android.hardware.security.keymint.KeyParameter makeDate(int p0, java.util.Date p1) { return null; }
    static boolean isSecureHardware(int p0) { return false; }
    static long getUnsignedInt(android.system.keystore2.Authorization p0) { return 0L; }
    static java.util.Date getDate(android.system.keystore2.Authorization p0) { return null; }
    static void forEachSetFlag(int p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    private static long getRootSid() { return 0L; }
    private static void addSids(java.util.List<android.hardware.security.keymint.KeyParameter> p0, android.security.keystore.UserAuthArgs p1) {}
    static void addUserAuthArgs(java.util.List<android.hardware.security.keymint.KeyParameter> p0, android.security.keystore.UserAuthArgs p1) {}
}
