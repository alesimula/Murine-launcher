package android.os;

public class VintfObject {
    public static native java.lang.String[] report();
    public static native int verifyBuildAtBoot();
    public static native java.lang.String[] getHalNamesAndVersions();
    public static native java.lang.String getSepolicyVersion();
    @android.annotation.NonNull
    public static native java.lang.String getPlatformSepolicyVersion();
    public static native java.util.Map<java.lang.String, java.lang.String[]> getVndkSnapshots();
    public static native java.lang.Long getTargetFrameworkCompatibilityMatrixVersion();
}
