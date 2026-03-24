package com.android.internal.content;

public final class F2fsUtils {
    private static final java.lang.String TAG = "F2fsUtils";
    private static final boolean DEBUG_F2FS = false;
    private static final java.io.File sKernelFeatures = null;
    private static final java.io.File sUserDataFeatures = null;
    private static final java.io.File sDataDirectory = null;
    private static final java.lang.String COMPRESSION_FEATURE = "compression";
    private static final boolean sKernelCompressionAvailable = Boolean.valueOf(false);
    private static final boolean sUserDataCompressionAvailable = Boolean.valueOf(false);
    public F2fsUtils() {}
    public static void releaseCompressedBlocks(android.content.ContentResolver p0, java.io.File p1) {}
    private static boolean isCompressionAllowed(java.io.File p0) { return false; }
    private static boolean isChild(java.io.File p0, java.lang.String p1) { return false; }
    private static boolean isCompressionEnabledInKernel() { return false; }
    private static boolean isCompressionEnabledOnUserData() { return false; }
    private static java.util.List<java.io.File> getFilesRecursive(java.io.File p0) { return null; }
    private static java.io.File[] getFilesToRelease(java.io.File p0) { return null; }
    private static native long nativeReleaseCompressedBlocks(java.lang.String p0);
}
