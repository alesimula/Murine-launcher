package android.util.apk;

public abstract class VerityBuilder {
    @android.annotation.NonNull
    public static android.util.apk.VerityBuilder.VerityResult generateApkVerityTree(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, android.util.apk.ByteBufferFactory p2) throws java.io.IOException, java.lang.SecurityException, java.security.NoSuchAlgorithmException, java.security.DigestException { return null; }
    static void generateApkVerityFooter(java.io.RandomAccessFile p0, android.util.apk.SignatureInfo p1, java.nio.ByteBuffer p2) throws java.io.IOException {}
    public static byte[] generateFsVerityRootHash(java.lang.String p0, byte[] p1, android.util.apk.ByteBufferFactory p2) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.DigestException { return null; }
    @android.annotation.NonNull
    static byte[] generateApkVerity(java.lang.String p0, android.util.apk.ByteBufferFactory p1, android.util.apk.SignatureInfo p2) throws java.io.IOException, android.util.apk.SignatureNotFoundException, java.lang.SecurityException, java.security.DigestException, java.security.NoSuchAlgorithmException { return null; }

    private static class BufferedDigester implements android.util.apk.DataDigester {
        public void consume(java.nio.ByteBuffer p0) throws java.security.DigestException {}
        public void assertEmptyBuffer() throws java.security.DigestException {}
    }

    public static class VerityResult {
        public final java.nio.ByteBuffer verityData = null;
        public final int merkleTreeSize = 0;
        public final byte[] rootHash = null;
    }
}
