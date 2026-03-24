package android.security;

@java.lang.Deprecated
public final class KeyPairGeneratorSpec implements java.security.spec.AlgorithmParameterSpec {
    public KeyPairGeneratorSpec(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, java.security.spec.AlgorithmParameterSpec p4, javax.security.auth.x500.X500Principal p5, java.math.BigInteger p6, java.util.Date p7, java.util.Date p8, int p9) {}
    public android.content.Context getContext() { return null; }
    public java.lang.String getKeystoreAlias() { return null; }
    @android.annotation.Nullable
    public java.lang.String getKeyType() { return null; }
    public int getKeySize() { return 0; }
    @android.annotation.NonNull
    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { return null; }
    @android.annotation.NonNull
    public javax.security.auth.x500.X500Principal getSubjectDN() { return null; }
    @android.annotation.NonNull
    public java.math.BigInteger getSerialNumber() { return null; }
    @android.annotation.NonNull
    public java.util.Date getStartDate() { return null; }
    @android.annotation.NonNull
    public java.util.Date getEndDate() { return null; }
    public int getFlags() { return 0; }
    @java.lang.Deprecated
    public boolean isEncryptionRequired() { return false; }

    @java.lang.Deprecated
    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setAlias(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setKeyType(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setKeySize(int p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec p0) { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setSubject(javax.security.auth.x500.X500Principal p0) { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setSerialNumber(java.math.BigInteger p0) { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setStartDate(java.util.Date p0) { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setEndDate(java.util.Date p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec.Builder setEncryptionRequired() { return null; }
        @android.annotation.NonNull
        public android.security.KeyPairGeneratorSpec build() { return null; }
    }
}
