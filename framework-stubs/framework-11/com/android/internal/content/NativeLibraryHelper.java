package com.android.internal.content;

public class NativeLibraryHelper {
    private static final java.lang.String TAG = "NativeHelper";
    private static final boolean DEBUG_NATIVE = false;
    public static final java.lang.String LIB_DIR_NAME = "lib";
    public static final java.lang.String LIB64_DIR_NAME = "lib64";
    public static final java.lang.String CLEAR_ABI_OVERRIDE = "-";
    private static final int BITCODE_PRESENT = 1;
    public NativeLibraryHelper() {}
    private static native long nativeOpenApk(java.lang.String p0);
    private static native long nativeOpenApkFd(java.io.FileDescriptor p0, java.lang.String p1);
    private static native void nativeClose(long p0);
    private static native long nativeSumNativeBinaries(long p0, java.lang.String p1, boolean p2);
    private static native int nativeCopyNativeBinaries(long p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4);
    private static long sumNativeBinaries(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1) { return 0L; }
    public static int copyNativeBinaries(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2) { return 0; }
    public static int findSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String[] p1) { return 0; }
    private static native int nativeFindSupportedAbi(long p0, java.lang.String[] p1, boolean p2);
    public static void removeNativeBinariesLI(java.lang.String p0) {}
    public static void removeNativeBinariesFromDirLI(java.io.File p0, boolean p1) {}
    public static void createNativeLibrarySubdir(java.io.File p0) throws java.io.IOException {}
    private static long sumNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String[] p1) { return 0L; }
    public static int copyNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String[] p2, boolean p3, boolean p4) throws java.io.IOException { return 0; }
    public static int copyNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2, boolean p3) { return 0; }
    public static long sumNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1) throws java.io.IOException { return 0L; }
    private static int incrementalConfigureNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2) { return 0; }
    private static java.lang.String getRelativePath(java.io.File p0, java.io.File p1) { return null; }
    private static native int hasRenderscriptBitcode(long p0);
    public static boolean hasRenderscriptBitcode(com.android.internal.content.NativeLibraryHelper.Handle p0) throws java.io.IOException { return false; }
    public static void waitForNativeBinariesExtraction(android.util.ArraySet<android.os.incremental.IncrementalStorage> p0) {}

    public static class Handle implements java.io.Closeable {
        private volatile boolean mClosed;
        final java.lang.String[] apkPaths = null;
        final long[] apkHandles = null;
        final boolean multiArch = false;
        final boolean extractNativeLibs = false;
        final boolean debuggable = false;
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.io.File p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(android.content.pm.PackageParser.PackageLite p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.util.List<java.lang.String> p0, boolean p1, boolean p2, boolean p3) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle createFd(android.content.pm.PackageParser.PackageLite p0, java.io.FileDescriptor p1) throws java.io.IOException { return null; }
        Handle(java.lang.String[] p0, long[] p1, boolean p2, boolean p3, boolean p4) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
