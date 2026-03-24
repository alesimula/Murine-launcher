package android.os;

public class VintfObject {
    public static native java.lang.String[] report();
    public static native int verify(java.lang.String[] p0);
    public static native int verifyWithoutAvb();
    public static native java.lang.String[] getHalNamesAndVersions();
    public static native java.lang.String getSepolicyVersion();
    public static native java.util.Map<java.lang.String, java.lang.String[]> getVndkSnapshots();
    public static native java.lang.Long getTargetFrameworkCompatibilityMatrixVersion();
    private VintfObject() {}
}
