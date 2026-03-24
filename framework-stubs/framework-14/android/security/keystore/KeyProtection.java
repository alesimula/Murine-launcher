package android.security.keystore;

public final class KeyProtection implements java.security.KeyStore.ProtectionParameter, android.security.keystore.UserAuthArgs {
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
    public boolean isRollbackResistant() { return false; }

    public static final class Builder {
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
        public android.security.keystore.KeyProtection.Builder setRollbackResistant(boolean p0) { return null; }
        public android.security.keystore.KeyProtection build() { return null; }
    }
}
