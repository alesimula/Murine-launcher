package android.webkit;

public class WebViewLibraryLoader {
    private static final java.lang.String LOGTAG = null;
    private static final java.lang.String CHROMIUM_WEBVIEW_NATIVE_RELRO_32 = "/data/misc/shared_relro/libwebviewchromium32.relro";
    private static final java.lang.String CHROMIUM_WEBVIEW_NATIVE_RELRO_64 = "/data/misc/shared_relro/libwebviewchromium64.relro";
    private static final boolean DEBUG = false;
    private static boolean sAddressSpaceReserved;
    public WebViewLibraryLoader() {}
    static void createRelroFile(boolean p0, java.lang.String p1, java.lang.String p2) {}
    static int prepareNativeLibraries(android.content.pm.PackageInfo p0) { return 0; }
    private static int createRelros(java.lang.String p0, java.lang.String p1) { return 0; }
    static void reserveAddressSpaceInZygote() {}
    public static int loadNativeLibrary(java.lang.ClassLoader p0, java.lang.String p1) { return 0; }
    static native boolean nativeReserveAddressSpace(long p0);
    static native boolean nativeCreateRelroFile(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2);
    static native int nativeLoadWithRelroFile(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2);

    private static class RelroFileCreator {
        private RelroFileCreator() {}
        public static void main(java.lang.String[] p0) {}
    }
}
