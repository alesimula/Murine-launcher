package android.content.pm.parsing;

public class FrameworkParsingPackageUtils {
    public static final int PARSE_IGNORE_OVERLAY_REQUIRED_SYSTEM_PROPERTY = 128;
    public static final int PARSE_APK_IN_APEX = 512;
    public FrameworkParsingPackageUtils() {}
    public static java.lang.String validateName(java.lang.String p0, boolean p1, boolean p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult validateName(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3) { return null; }
    public static java.security.PublicKey parsePublicKey(java.lang.String p0) { return null; }
    public static java.security.PublicKey parsePublicKey(byte[] p0) { return null; }
    public static boolean checkRequiredSystemProperties(java.lang.String p0, java.lang.String p1) { return false; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3, android.content.pm.SigningDetails p4, int p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.Integer> computeMinSdkVersion(int p0, java.lang.String p1, int p2, java.lang.String[] p3, android.content.pm.parsing.result.ParseInput p4) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.Integer> computeTargetSdkVersion(int p0, java.lang.String p1, java.lang.String[] p2, android.content.pm.parsing.result.ParseInput p3, boolean p4) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.Integer> computeMaxSdkVersion(int p0, int p1, android.content.pm.parsing.result.ParseInput p2) { return null; }
}
