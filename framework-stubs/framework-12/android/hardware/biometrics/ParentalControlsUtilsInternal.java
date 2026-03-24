package android.hardware.biometrics;

public class ParentalControlsUtilsInternal {
    private static final java.lang.String TEST_ALWAYS_REQUIRE_CONSENT = "android.hardware.biometrics.ParentalControlsUtilsInternal.always_require_consent";
    public ParentalControlsUtilsInternal() {}
    public static boolean isTestModeEnabled(android.content.Context p0) { return false; }
    public static boolean parentConsentRequired(android.content.Context p0, android.app.admin.DevicePolicyManager p1, int p2, android.os.UserHandle p3) { return false; }
    public static boolean parentConsentRequired(android.app.admin.DevicePolicyManager p0, int p1, android.os.UserHandle p2) { return false; }
    public static android.content.ComponentName getSupervisionComponentName(android.app.admin.DevicePolicyManager p0, android.os.UserHandle p1) { return null; }
    private static boolean containsFlag(int p0, int p1) { return false; }
}
