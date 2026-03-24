package android.privacy.internal.rappor;

public class RapporEncoder implements android.privacy.DifferentialPrivacyEncoder {
    private static final byte[] INSECURE_SECRET = null;
    private static final java.security.SecureRandom sSecureRandom = null;
    private final android.privacy.internal.rappor.RapporConfig mConfig = null;
    private final boolean mIsSecure = false;
    private RapporEncoder(android.privacy.internal.rappor.RapporConfig p0, boolean p1, byte[] p2) {}
    private long getInsecureSeed(java.lang.String p0) { return 0L; }
    public static android.privacy.internal.rappor.RapporEncoder createEncoder(android.privacy.internal.rappor.RapporConfig p0, byte[] p1) { return null; }
    public static android.privacy.internal.rappor.RapporEncoder createInsecureEncoderForTest(android.privacy.internal.rappor.RapporConfig p0) { return null; }
    public byte[] encodeString(java.lang.String p0) { return null; }
    public byte[] encodeBoolean(boolean p0) { return null; }
    public byte[] encodeBits(byte[] p0) { return null; }
    public android.privacy.internal.rappor.RapporConfig getConfig() { return null; }
    public boolean isInsecureEncoderForTest() { return false; }
}
