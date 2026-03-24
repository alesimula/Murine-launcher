package android.hardware.biometrics;

public class CryptoObject {
    public CryptoObject(java.security.Signature p0) {}
    public CryptoObject(javax.crypto.Cipher p0) {}
    public CryptoObject(javax.crypto.Mac p0) {}
    @java.lang.Deprecated
    public CryptoObject(android.security.identity.IdentityCredential p0) {}
    public CryptoObject(android.security.identity.PresentationSession p0) {}
    public java.security.Signature getSignature() { return null; }
    public javax.crypto.Cipher getCipher() { return null; }
    public javax.crypto.Mac getMac() { return null; }
    @java.lang.Deprecated
    public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
    public android.security.identity.PresentationSession getPresentationSession() { return null; }
    public final long getOpId() { return 0L; }
}
