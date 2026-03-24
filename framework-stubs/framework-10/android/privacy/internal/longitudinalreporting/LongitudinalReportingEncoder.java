package android.privacy.internal.longitudinalreporting;

public class LongitudinalReportingEncoder implements android.privacy.DifferentialPrivacyEncoder {
    private static final java.lang.String TAG = "LongitudinalEncoder";
    private static final boolean DEBUG = false;
    private static final java.lang.String PRR1_ENCODER_ID = "prr1_encoder_id";
    private static final java.lang.String PRR2_ENCODER_ID = "prr2_encoder_id";
    private final android.privacy.internal.longitudinalreporting.LongitudinalReportingConfig mConfig = null;
    private final android.privacy.internal.rappor.RapporEncoder mIRREncoder = null;
    private final java.lang.Boolean mFakeValue = null;
    private final boolean mIsSecure = false;
    public static android.privacy.internal.longitudinalreporting.LongitudinalReportingEncoder createEncoder(android.privacy.internal.longitudinalreporting.LongitudinalReportingConfig p0, byte[] p1) { return null; }
    public static android.privacy.internal.longitudinalreporting.LongitudinalReportingEncoder createInsecureEncoderForTest(android.privacy.internal.longitudinalreporting.LongitudinalReportingConfig p0) { return null; }
    private LongitudinalReportingEncoder(android.privacy.internal.longitudinalreporting.LongitudinalReportingConfig p0, boolean p1, byte[] p2) {}
    public byte[] encodeString(java.lang.String p0) { return null; }
    public byte[] encodeBoolean(boolean p0) { return null; }
    public byte[] encodeBits(byte[] p0) { return null; }
    public android.privacy.internal.longitudinalreporting.LongitudinalReportingConfig getConfig() { return null; }
    public boolean isInsecureEncoderForTest() { return false; }
    public static boolean getLongTermRandomizedResult(double p0, boolean p1, byte[] p2, java.lang.String p3) { return false; }
}
