package dalvik.system;

public final class ZipPathValidator {
    ZipPathValidator() {}
    public static void clearCallback() {}
    public static void setCallback(dalvik.system.ZipPathValidator.Callback p0) {}

    public static interface Callback {
        default public void onZipEntryAccess(java.lang.String p0) throws java.util.zip.ZipException {}
    }
}
