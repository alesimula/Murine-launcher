package android.os.incremental;

public class V4Signature {
    public static final java.lang.String EXT = ".idsig";
    public static final int SUPPORTED_VERSION = 2;
    public static final int HASHING_ALGORITHM_SHA256 = 1;
    public static final byte LOG2_BLOCK_SIZE_4096_BYTES = 12;
    public final int version = 0;
    public final byte[] hashingInfo = null;
    public final byte[] signingInfo = null;
    public static android.os.incremental.V4Signature readFrom(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    public static android.os.incremental.V4Signature readFrom(byte[] p0) throws java.io.IOException { return null; }
    public byte[] toByteArray() { return null; }
    public static byte[] getSigningData(long p0, android.os.incremental.V4Signature.HashingInfo p1, android.os.incremental.V4Signature.SigningInfo p2) { return null; }
    public boolean isVersionSupported() { return false; }
    private V4Signature(int p0, byte[] p1, byte[] p2) {}
    private static android.os.incremental.V4Signature readFrom(java.io.InputStream p0) throws java.io.IOException { return null; }
    private void writeTo(java.io.OutputStream p0) throws java.io.IOException {}
    private static int bytesSize(byte[] p0) { return 0; }
    private static void readFully(java.io.InputStream p0, byte[] p1) throws java.io.IOException {}
    private static int readIntLE(java.io.InputStream p0) throws java.io.IOException { return 0; }
    private static void writeIntLE(java.io.OutputStream p0, int p1) throws java.io.IOException {}
    private static byte[] readBytes(java.io.InputStream p0) throws java.io.IOException { return null; }
    private static byte[] readBytes(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    private static void writeBytes(java.io.OutputStream p0, byte[] p1) throws java.io.IOException {}
    private static void writeBytes(java.nio.ByteBuffer p0, byte[] p1) {}

    public static class HashingInfo {
        public final int hashAlgorithm = 0;
        public final byte log2BlockSize = 0;
        public final byte[] salt = null;
        public final byte[] rawRootHash = null;
        HashingInfo(int p0, byte p1, byte[] p2, byte[] p3) {}
        public static android.os.incremental.V4Signature.HashingInfo fromByteArray(byte[] p0) throws java.io.IOException { return null; }
    }

    public static class SigningInfo {
        public final byte[] apkDigest = null;
        public final byte[] certificate = null;
        public final byte[] additionalData = null;
        public final byte[] publicKey = null;
        public final int signatureAlgorithmId = 0;
        public final byte[] signature = null;
        SigningInfo(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5) {}
        public static android.os.incremental.V4Signature.SigningInfo fromByteArray(byte[] p0) throws java.io.IOException { return null; }
    }
}
