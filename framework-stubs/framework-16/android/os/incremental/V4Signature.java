package android.os.incremental;

public class V4Signature {
    public static final java.lang.String EXT = ".idsig";
    public static final int SUPPORTED_VERSION = 2;
    public static final int HASHING_ALGORITHM_SHA256 = 1;
    public static final byte LOG2_BLOCK_SIZE_4096_BYTES = 12;
    public static final int INCFS_MAX_SIGNATURE_SIZE = 8096;
    public final int version = 0;
    @android.annotation.Nullable
    public final byte[] hashingInfo = null;
    @android.annotation.Nullable
    public final byte[] signingInfos = null;
    public static android.os.incremental.V4Signature readFrom(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.os.incremental.V4Signature readFrom(byte[] p0) throws java.io.IOException { return null; }
    public byte[] toByteArray() { return null; }
    public static byte[] getSignedData(long p0, android.os.incremental.V4Signature.HashingInfo p1, android.os.incremental.V4Signature.SigningInfo p2) { return null; }
    public boolean isVersionSupported() { return false; }
    public static android.os.incremental.V4Signature readFrom(java.io.InputStream p0) throws java.io.IOException { return null; }

    public static class HashingInfo {
        public final int hashAlgorithm = 0;
        public final byte log2BlockSize = 0;
        @android.annotation.Nullable
        public final byte[] salt = null;
        @android.annotation.Nullable
        public final byte[] rawRootHash = null;
        HashingInfo(int p0, byte p1, byte[] p2, byte[] p3) {}
        @android.annotation.NonNull
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
        public static android.os.incremental.V4Signature.SigningInfo fromByteBuffer(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    }

    public static class SigningInfoBlock {
        public final int blockId = 0;
        public final byte[] signingInfo = null;
        public SigningInfoBlock(int p0, byte[] p1) {}
        static android.os.incremental.V4Signature.SigningInfoBlock fromByteBuffer(java.nio.ByteBuffer p0) throws java.io.IOException { return null; }
    }

    public static class SigningInfos {
        public final android.os.incremental.V4Signature.SigningInfo signingInfo = null;
        public final android.os.incremental.V4Signature.SigningInfoBlock[] signingInfoBlocks = null;
        public SigningInfos(android.os.incremental.V4Signature.SigningInfo p0) {}
        public SigningInfos(android.os.incremental.V4Signature.SigningInfo p0, android.os.incremental.V4Signature.SigningInfoBlock... p1) {}
        public static android.os.incremental.V4Signature.SigningInfos fromByteArray(byte[] p0) throws java.io.IOException { return null; }
    }
}
