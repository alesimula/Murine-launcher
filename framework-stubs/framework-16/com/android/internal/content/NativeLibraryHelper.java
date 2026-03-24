package com.android.internal.content;

public class NativeLibraryHelper {
    public static final java.lang.String LIB_DIR_NAME = "lib";
    public static final java.lang.String LIB64_DIR_NAME = "lib64";
    public static final java.lang.String CLEAR_ABI_OVERRIDE = "-";
    public NativeLibraryHelper() {}
    public static int copyNativeBinaries(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2) { return 0; }
    public static int findSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String[] p1) { return 0; }
    public static void removeNativeBinariesLI(java.lang.String p0) {}
    public static void removeNativeBinariesFromDirLI(java.io.File p0, boolean p1) {}
    public static void createNativeLibrarySubdir(java.io.File p0) throws java.io.IOException {}
    public static int copyNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String[] p2, boolean p3, boolean p4) throws java.io.IOException { return 0; }
    public static int copyNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2, boolean p3) { return 0; }
    public static int checkAlignmentForCompatMode(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1, boolean p2, java.lang.String p3) { return 0; }
    public static long sumNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1) throws java.io.IOException { return 0L; }
    public static boolean hasRenderscriptBitcode(com.android.internal.content.NativeLibraryHelper.Handle p0) throws java.io.IOException { return false; }

    public static class Handle implements java.io.Closeable {
        final java.lang.String[] apkPaths = null;
        final long[] apkHandles = null;
        final boolean multiArch = false;
        final boolean extractNativeLibs = false;
        final boolean debuggable = false;
        final boolean pageSizeCompatDisabled = false;
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.io.File p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(android.content.pm.parsing.PackageLite p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.util.List<java.lang.String> p0, boolean p1, boolean p2, boolean p3, boolean p4) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle createFd(android.content.pm.parsing.PackageLite p0, java.io.FileDescriptor p1) throws java.io.IOException { return null; }
        Handle(java.lang.String[] p0, long[] p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
