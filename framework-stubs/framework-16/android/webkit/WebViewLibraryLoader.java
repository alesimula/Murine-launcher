package android.webkit;

public class WebViewLibraryLoader {
    public WebViewLibraryLoader() {}
    static void createRelroFile(boolean p0, java.lang.String p1, java.lang.String p2) {}
    static int prepareNativeLibraries(android.content.pm.PackageInfo p0) { return 0; }
    static void reserveAddressSpaceInZygote() {}
    public static int loadNativeLibrary(java.lang.ClassLoader p0, java.lang.String p1) { return 0; }
    static native boolean nativeReserveAddressSpace(long p0);
    static native boolean nativeCreateRelroFile(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2);
    static native int nativeLoadWithRelroFile(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2);

    private static class RelroFileCreator {
        public static void main(java.lang.String[] p0) {}
    }
}
