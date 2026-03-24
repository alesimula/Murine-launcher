package com.android.internal.security;

public abstract class VerityUtils {
    private static final java.lang.String TAG = "VerityUtils";
    public static final java.lang.String FSVERITY_SIGNATURE_FILE_EXTENSION = ".fsv_sig";
    private static final int MAX_SIGNATURE_FILE_SIZE_BYTES = 8192;
    private static final int HASH_SIZE_BYTES = 32;
    private static final boolean DEBUG = false;
    public VerityUtils() {}
    public static boolean isFsVeritySupported() { return false; }
    public static boolean isFsveritySignatureFile(java.io.File p0) { return false; }
    public static java.lang.String getFsveritySignatureFilePath(java.lang.String p0) { return null; }
    public static void setUpFsverity(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public static void setUpFsverity(java.lang.String p0, byte[] p1) throws java.io.IOException {}
    public static boolean hasFsverity(java.lang.String p0) { return false; }
    public static byte[] getFsverityRootHash(java.lang.String p0) { return null; }
    private static native int enableFsverityNative(java.lang.String p0, byte[] p1);
    private static native int measureFsverityNative(java.lang.String p0, byte[] p1);
    private static native int statxForFsverityNative(java.lang.String p0);
    @java.lang.Deprecated
    public static com.android.internal.security.VerityUtils.SetupResult generateApkVeritySetupData(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static byte[] generateApkVerityRootHash(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.DigestException, java.io.IOException { return null; }
    @java.lang.Deprecated
    public static byte[] getVerityRootHash(java.lang.String p0) throws java.io.IOException, android.util.apk.SignatureNotFoundException { return null; }
    private static android.util.Pair<android.os.SharedMemory, java.lang.Integer> generateFsVerityIntoSharedMemory(java.lang.String p0, byte[] p1) throws java.io.IOException, java.security.DigestException, java.security.NoSuchAlgorithmException, android.util.apk.SignatureNotFoundException { return null; }
    private static java.lang.String bytesToString(byte[] p0) { return null; }

    @java.lang.Deprecated
    public static class SetupResult {
        private static final int RESULT_OK = 1;
        private static final int RESULT_SKIPPED = 2;
        private static final int RESULT_FAILED = 3;
        private final int mCode = 0;
        private final java.io.FileDescriptor mFileDescriptor = null;
        private final int mContentSize = 0;
        @java.lang.Deprecated
        public static com.android.internal.security.VerityUtils.SetupResult ok(java.io.FileDescriptor p0, int p1) { return null; }
        @java.lang.Deprecated
        public static com.android.internal.security.VerityUtils.SetupResult skipped() { return null; }
        @java.lang.Deprecated
        public static com.android.internal.security.VerityUtils.SetupResult failed() { return null; }
        private SetupResult(int p0, java.io.FileDescriptor p1, int p2) {}
        public boolean isFailed() { return false; }
        public boolean isOk() { return false; }
        public java.io.FileDescriptor getUnownedFileDescriptor() { return null; }
        public int getContentSize() { return 0; }
    }

    private static class TrackedShmBufferFactory implements android.util.apk.ByteBufferFactory {
        private android.os.SharedMemory mShm;
        private java.nio.ByteBuffer mBuffer;
        private TrackedShmBufferFactory() {}
        public java.nio.ByteBuffer create(int p0) { return null; }
        public android.os.SharedMemory releaseSharedMemory() { return null; }
        public int getBufferLimit() { return 0; }
    }
}
