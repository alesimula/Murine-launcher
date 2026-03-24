package android.app.admin;

public class PolicySizeVerifier {
    public static final int MAX_POLICY_STRING_LENGTH = 65535;
    public static final int MAX_PACKAGE_NAME_LENGTH = 223;
    public static final int MAX_PROFILE_NAME_LENGTH = 200;
    public static final int MAX_LONG_SUPPORT_MESSAGE_LENGTH = 20000;
    public static final int MAX_SHORT_SUPPORT_MESSAGE_LENGTH = 200;
    public static final int MAX_ORG_NAME_LENGTH = 200;
    public PolicySizeVerifier() {}
    public static void enforceMaxStringLength(java.lang.String p0, java.lang.String p1) {}
    public static void enforceMaxPackageNameLength(java.lang.String p0) {}
    public static void enforceMaxStringLength(android.os.PersistableBundle p0, java.lang.String p1) {}
    public static void enforceMaxBundleFieldsLength(android.os.Bundle p0) {}
    public static void enforceMaxComponentNameLength(android.content.ComponentName p0) {}
    public static java.lang.CharSequence truncateIfLonger(java.lang.CharSequence p0, int p1) { return null; }
}
