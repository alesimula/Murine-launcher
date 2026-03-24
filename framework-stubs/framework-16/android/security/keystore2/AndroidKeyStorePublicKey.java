package android.security.keystore2;

public abstract class AndroidKeyStorePublicKey extends android.security.keystore2.AndroidKeyStoreKey implements java.security.PublicKey {
    public AndroidKeyStorePublicKey(android.system.keystore2.KeyDescriptor p0, android.system.keystore2.KeyMetadata p1, byte[] p2, java.lang.String p3, android.security.KeyStoreSecurityLevel p4) { super(null, 0L, null, null, null); }
    public byte[] getCertificate() { return null; }
    public byte[] getCertificateChain() { return null; }
    abstract android.security.keystore2.AndroidKeyStorePrivateKey getPrivateKey();
    public java.lang.String getFormat() { return null; }
    public byte[] getEncoded() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
