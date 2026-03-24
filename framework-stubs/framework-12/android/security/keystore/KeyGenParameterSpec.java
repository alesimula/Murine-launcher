package android.security.keystore;

public final class KeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec, android.security.keystore.UserAuthArgs {
    private static final javax.security.auth.x500.X500Principal DEFAULT_ATTESTATION_CERT_SUBJECT = null;
    private static final javax.security.auth.x500.X500Principal DEFAULT_SELF_SIGNED_CERT_SUBJECT = null;
    private static final java.math.BigInteger DEFAULT_CERT_SERIAL_NUMBER = null;
    private static final java.util.Date DEFAULT_CERT_NOT_BEFORE = null;
    private static final java.util.Date DEFAULT_CERT_NOT_AFTER = null;
    private final java.lang.String mKeystoreAlias = null;
    private final int mNamespace = 0;
    private final int mKeySize = 0;
    private final java.security.spec.AlgorithmParameterSpec mSpec = null;
    private final javax.security.auth.x500.X500Principal mCertificateSubject = null;
    private final java.math.BigInteger mCertificateSerialNumber = null;
    private final java.util.Date mCertificateNotBefore = null;
    private final java.util.Date mCertificateNotAfter = null;
    private final java.util.Date mKeyValidityStart = null;
    private final java.util.Date mKeyValidityForOriginationEnd = null;
    private final java.util.Date mKeyValidityForConsumptionEnd = null;
    private final int mPurposes = 0;
    private final java.lang.String[] mDigests = null;
    private final java.lang.String[] mEncryptionPaddings = null;
    private final java.lang.String[] mSignaturePaddings = null;
    private final java.lang.String[] mBlockModes = null;
    private final boolean mRandomizedEncryptionRequired = false;
    private final boolean mUserAuthenticationRequired = false;
    private final int mUserAuthenticationValidityDurationSeconds = 0;
    private final int mUserAuthenticationType = 0;
    private final boolean mUserPresenceRequired = false;
    private final byte[] mAttestationChallenge = null;
    private final boolean mDevicePropertiesAttestationIncluded = false;
    private final int[] mAttestationIds = null;
    private final boolean mUniqueIdIncluded = false;
    private final boolean mUserAuthenticationValidWhileOnBody = false;
    private final boolean mInvalidatedByBiometricEnrollment = false;
    private final boolean mIsStrongBoxBacked = false;
    private final boolean mUserConfirmationRequired = false;
    private final boolean mUnlockedDeviceRequired = false;
    private final boolean mCriticalToDeviceEncryption = false;
    private final int mMaxUsageCount = 0;
    private final java.lang.String mAttestKeyAlias = null;
    public KeyGenParameterSpec(java.lang.String p0, int p1, int p2, java.security.spec.AlgorithmParameterSpec p3, javax.security.auth.x500.X500Principal p4, java.math.BigInteger p5, java.util.Date p6, java.util.Date p7, java.util.Date p8, java.util.Date p9, java.util.Date p10, int p11, java.lang.String[] p12, java.lang.String[] p13, java.lang.String[] p14, java.lang.String[] p15, boolean p16, boolean p17, int p18, int p19, boolean p20, byte[] p21, boolean p22, int[] p23, boolean p24, boolean p25, boolean p26, boolean p27, boolean p28, boolean p29, boolean p30, int p31, java.lang.String p32) {}
    public java.lang.String getKeystoreAlias() { return null; }
    @java.lang.Deprecated
    public int getUid() { return 0; }
    @android.annotation.SystemApi
    public int getNamespace() { return 0; }
    public int getKeySize() { return 0; }
    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() { return null; }
    public javax.security.auth.x500.X500Principal getCertificateSubject() { return null; }
    public java.math.BigInteger getCertificateSerialNumber() { return null; }
    public java.util.Date getCertificateNotBefore() { return null; }
    public java.util.Date getCertificateNotAfter() { return null; }
    public java.util.Date getKeyValidityStart() { return null; }
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public int getPurposes() { return 0; }
    public java.lang.String[] getDigests() { return null; }
    public boolean isDigestsSpecified() { return false; }
    public java.lang.String[] getEncryptionPaddings() { return null; }
    public java.lang.String[] getSignaturePaddings() { return null; }
    public java.lang.String[] getBlockModes() { return null; }
    public boolean isRandomizedEncryptionRequired() { return false; }
    public boolean isUserAuthenticationRequired() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public int getUserAuthenticationType() { return 0; }
    public boolean isUserPresenceRequired() { return false; }
    public byte[] getAttestationChallenge() { return null; }
    public boolean isDevicePropertiesAttestationIncluded() { return false; }
    @android.annotation.SystemApi
    public int[] getAttestationIds() { return null; }
    public boolean isUniqueIdIncluded() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public boolean isStrongBoxBacked() { return false; }
    public boolean isUnlockedDeviceRequired() { return false; }
    public long getBoundToSpecificSecureUserId() { return 0L; }
    public boolean isCriticalToDeviceEncryption() { return false; }
    public int getMaxUsageCount() { return 0; }
    public java.lang.String getAttestKeyAlias() { return null; }

    public static final class Builder {
        private final java.lang.String mKeystoreAlias = null;
        private int mPurposes;
        private int mNamespace;
        private int mKeySize;
        private java.security.spec.AlgorithmParameterSpec mSpec;
        private javax.security.auth.x500.X500Principal mCertificateSubject;
        private java.math.BigInteger mCertificateSerialNumber;
        private java.util.Date mCertificateNotBefore;
        private java.util.Date mCertificateNotAfter;
        private java.util.Date mKeyValidityStart;
        private java.util.Date mKeyValidityForOriginationEnd;
        private java.util.Date mKeyValidityForConsumptionEnd;
        private java.lang.String[] mDigests;
        private java.lang.String[] mEncryptionPaddings;
        private java.lang.String[] mSignaturePaddings;
        private java.lang.String[] mBlockModes;
        private boolean mRandomizedEncryptionRequired;
        private boolean mUserAuthenticationRequired;
        private int mUserAuthenticationValidityDurationSeconds;
        private int mUserAuthenticationType;
        private boolean mUserPresenceRequired;
        private byte[] mAttestationChallenge;
        private boolean mDevicePropertiesAttestationIncluded;
        private int[] mAttestationIds;
        private boolean mUniqueIdIncluded;
        private boolean mUserAuthenticationValidWhileOnBody;
        private boolean mInvalidatedByBiometricEnrollment;
        private boolean mIsStrongBoxBacked;
        private boolean mUserConfirmationRequired;
        private boolean mUnlockedDeviceRequired;
        private boolean mCriticalToDeviceEncryption;
        private int mMaxUsageCount;
        private java.lang.String mAttestKeyAlias;
        public Builder(java.lang.String p0, int p1) {}
        public Builder(android.security.keystore.KeyGenParameterSpec p0) {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.security.keystore.KeyGenParameterSpec.Builder setUid(int p0) { return null; }
        @android.annotation.SystemApi
        public android.security.keystore.KeyGenParameterSpec.Builder setNamespace(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeySize(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateSubject(javax.security.auth.x500.X500Principal p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateSerialNumber(java.math.BigInteger p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotBefore(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotAfter(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityStart(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForOriginationEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForConsumptionEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setDigests(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setEncryptionPaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setSignaturePaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setBlockModes(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setRandomizedEncryptionRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserConfirmationRequired(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidityDurationSeconds(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationParameters(int p0, int p1) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserPresenceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestationChallenge(byte[] p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setDevicePropertiesAttestationIncluded(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestationIds(int[] p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUniqueIdIncluded(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidWhileOnBody(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setInvalidatedByBiometricEnrollment(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setIsStrongBoxBacked(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setUnlockedDeviceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setCriticalToDeviceEncryption(boolean p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setMaxUsageCount(int p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec.Builder setAttestKeyAlias(java.lang.String p0) { return null; }
        public android.security.keystore.KeyGenParameterSpec build() { return null; }
    }
}
