package android.util.jar;

class StrictJarVerifier {
    StrictJarVerifier(java.lang.String p0, android.util.jar.StrictJarManifest p1, java.util.HashMap<java.lang.String, byte[]> p2, boolean p3) {}
    android.util.jar.StrictJarVerifier.VerifierEntry initEntry(java.lang.String p0) { return null; }
    void addMetaEntry(java.lang.String p0, byte[] p1) {}
    synchronized boolean readCertificates() { return false; }
    static java.security.cert.Certificate[] verifyBytes(byte[] p0, byte[] p1) throws java.security.GeneralSecurityException { return null; }
    boolean isSignedJar() { return false; }
    java.security.cert.Certificate[][] getCertificateChains(java.lang.String p0) { return null; }
    void removeMetaEntries() {}

    static class VerifierEntry extends java.io.OutputStream {
        VerifierEntry(java.lang.String p0, java.security.MessageDigest p1, byte[] p2, java.security.cert.Certificate[][] p3, java.util.Hashtable<java.lang.String, java.security.cert.Certificate[][]> p4) { super(); }
        public void write(int p0) {}
        public void write(byte[] p0, int p1, int p2) {}
        void verify() {}
    }
}
