package android.security;

@java.lang.Deprecated
public final class KeyPairGeneratorSpec implements java.security.spec.AlgorithmParameterSpec {
    private final android.content.Context mContext = null;
    private final java.lang.String mKeystoreAlias = null;
    private final java.lang.String mKeyType = null;
    private final int mKeySize = 0;
    private final java.security.spec.AlgorithmParameterSpec mSpec = null;
    private final javax.security.auth.x500.X500Principal mSubjectDN = null;
    private final java.math.BigInteger mSerialNumber = null;
    private final java.util.Date mStartDate = null;
    private final java.util.Date mEndDate = null;
    public KeyPairGeneratorSpec(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, java.security.spec.AlgorithmParameterSpec p4, javax.security.auth.x500.X500Principal p5, java.math.BigInteger p6, java.util.Date p7, java.util.Date p8, int p9) {}
    public android.content.Context getContext() { return null; }
    public java.lang.String getKeystoreAlias() { return null; }
    public java.lang.String getKeyType() { return null; }
    public int getKeySize() { return 0; }
    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { return null; }
    public javax.security.auth.x500.X500Principal getSubjectDN() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public java.util.Date getStartDate() { return null; }
    public java.util.Date getEndDate() { return null; }
    public int getFlags() { return 0; }
    @java.lang.Deprecated
    public boolean isEncryptionRequired() { return false; }

    @java.lang.Deprecated
    public static final class Builder {
        private final android.content.Context mContext = null;
        private java.lang.String mKeystoreAlias;
        private java.lang.String mKeyType;
        private int mKeySize;
        private java.security.spec.AlgorithmParameterSpec mSpec;
        private javax.security.auth.x500.X500Principal mSubjectDN;
        private java.math.BigInteger mSerialNumber;
        private java.util.Date mStartDate;
        private java.util.Date mEndDate;
        public Builder(android.content.Context p0) {}
        public android.security.KeyPairGeneratorSpec.Builder setAlias(java.lang.String p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setKeyType(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setKeySize(int p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setSubject(javax.security.auth.x500.X500Principal p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setSerialNumber(java.math.BigInteger p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setStartDate(java.util.Date p0) { return null; }
        public android.security.KeyPairGeneratorSpec.Builder setEndDate(java.util.Date p0) { return null; }
        @java.lang.Deprecated
        public android.security.KeyPairGeneratorSpec.Builder setEncryptionRequired() { return null; }
        public android.security.KeyPairGeneratorSpec build() { return null; }
    }
}
