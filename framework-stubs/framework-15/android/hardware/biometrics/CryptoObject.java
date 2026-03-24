package android.hardware.biometrics;

public class CryptoObject {
    public CryptoObject(java.security.Signature p0) {}
    public CryptoObject(javax.crypto.Cipher p0) {}
    public CryptoObject(javax.crypto.Mac p0) {}
    @java.lang.Deprecated
    public CryptoObject(android.security.identity.IdentityCredential p0) {}
    public CryptoObject(android.security.identity.PresentationSession p0) {}
    @android.annotation.FlaggedApi("android.hardware.biometrics.add_key_agreement_crypto_object")
    public CryptoObject(javax.crypto.KeyAgreement p0) {}
    public CryptoObject(long p0) {}
    @android.annotation.Nullable
    public java.security.Signature getSignature() { return null; }
    @android.annotation.Nullable
    public javax.crypto.Cipher getCipher() { return null; }
    @android.annotation.Nullable
    public javax.crypto.Mac getMac() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
    @android.annotation.Nullable
    public android.security.identity.PresentationSession getPresentationSession() { return null; }
    @android.annotation.FlaggedApi("android.hardware.biometrics.add_key_agreement_crypto_object")
    @android.annotation.Nullable
    public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
    public long getOpId() { return 0L; }
}
