package android.security.keystore;

public final class KeyProtection implements java.security.KeyStore.ProtectionParameter, android.security.keystore.UserAuthArgs {
    private final java.util.Date mKeyValidityStart = null;
    private final java.util.Date mKeyValidityForOriginationEnd = null;
    private final java.util.Date mKeyValidityForConsumptionEnd = null;
    private final int mPurposes = 0;
    private final java.lang.String[] mEncryptionPaddings = null;
    private final java.lang.String[] mSignaturePaddings = null;
    private final java.lang.String[] mDigests = null;
    private final java.lang.String[] mBlockModes = null;
    private final boolean mRandomizedEncryptionRequired = false;
    private final boolean mUserAuthenticationRequired = false;
    private final int mUserAuthenticationType = 0;
    private final int mUserAuthenticationValidityDurationSeconds = 0;
    private final boolean mUserPresenceRequred = false;
    private final boolean mUserAuthenticationValidWhileOnBody = false;
    private final boolean mInvalidatedByBiometricEnrollment = false;
    private final long mBoundToSecureUserId = 0L;
    private final boolean mCriticalToDeviceEncryption = false;
    private final boolean mUserConfirmationRequired = false;
    private final boolean mUnlockedDeviceRequired = false;
    private final boolean mIsStrongBoxBacked = false;
    private final int mMaxUsageCount = 0;
    private KeyProtection(java.util.Date p0, java.util.Date p1, java.util.Date p2, int p3, java.lang.String[] p4, java.lang.String[] p5, java.lang.String[] p6, java.lang.String[] p7, boolean p8, boolean p9, int p10, int p11, boolean p12, boolean p13, boolean p14, long p15, boolean p16, boolean p17, boolean p18, boolean p19, int p20) {}
    public java.util.Date getKeyValidityStart() { return null; }
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public int getPurposes() { return 0; }
    public java.lang.String[] getEncryptionPaddings() { return null; }
    public java.lang.String[] getSignaturePaddings() { return null; }
    public java.lang.String[] getDigests() { return null; }
    public boolean isDigestsSpecified() { return false; }
    public java.lang.String[] getBlockModes() { return null; }
    public boolean isRandomizedEncryptionRequired() { return false; }
    public boolean isUserAuthenticationRequired() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public int getUserAuthenticationType() { return 0; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public boolean isUserPresenceRequired() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public long getBoundToSpecificSecureUserId() { return 0L; }
    public boolean isCriticalToDeviceEncryption() { return false; }
    public boolean isUnlockedDeviceRequired() { return false; }
    public boolean isStrongBoxBacked() { return false; }
    public int getMaxUsageCount() { return 0; }

    public static final class Builder {
        private int mPurposes;
        private java.util.Date mKeyValidityStart;
        private java.util.Date mKeyValidityForOriginationEnd;
        private java.util.Date mKeyValidityForConsumptionEnd;
        private java.lang.String[] mEncryptionPaddings;
        private java.lang.String[] mSignaturePaddings;
        private java.lang.String[] mDigests;
        private java.lang.String[] mBlockModes;
        private boolean mRandomizedEncryptionRequired;
        private boolean mUserAuthenticationRequired;
        private int mUserAuthenticationValidityDurationSeconds;
        private int mUserAuthenticationType;
        private boolean mUserPresenceRequired;
        private boolean mUserAuthenticationValidWhileOnBody;
        private boolean mInvalidatedByBiometricEnrollment;
        private boolean mUserConfirmationRequired;
        private boolean mUnlockedDeviceRequired;
        private long mBoundToSecureUserId;
        private boolean mCriticalToDeviceEncryption;
        private boolean mIsStrongBoxBacked;
        private int mMaxUsageCount;
        private java.lang.String mAttestKeyAlias;
        public Builder(int p0) {}
        public android.security.keystore.KeyProtection.Builder setKeyValidityStart(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityForOriginationEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setKeyValidityForConsumptionEnd(java.util.Date p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setEncryptionPaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setSignaturePaddings(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setDigests(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setBlockModes(java.lang.String... p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setRandomizedEncryptionRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserConfirmationRequired(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationValidityDurationSeconds(int p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationParameters(int p0, int p1) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserPresenceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUserAuthenticationValidWhileOnBody(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setInvalidatedByBiometricEnrollment(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setBoundToSpecificSecureUserId(long p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setCriticalToDeviceEncryption(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setUnlockedDeviceRequired(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setIsStrongBoxBacked(boolean p0) { return null; }
        public android.security.keystore.KeyProtection.Builder setMaxUsageCount(int p0) { return null; }
        public android.security.keystore.KeyProtection build() { return null; }
    }
}
