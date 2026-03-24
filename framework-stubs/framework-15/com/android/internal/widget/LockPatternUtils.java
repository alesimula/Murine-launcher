package com.android.internal.widget;

public class LockPatternUtils {
    public static final long FAILED_ATTEMPT_COUNTDOWN_INTERVAL_MS = 1000L;
    public static final int FAILED_ATTEMPTS_BEFORE_WIPE_GRACE = 5;
    public static final int MIN_LOCK_PATTERN_SIZE = 4;
    public static final int MIN_LOCK_PASSWORD_SIZE = 4;
    public static final int MIN_PATTERN_REGISTER_FAIL = 4;
    public static final int CREDENTIAL_TYPE_NONE = -1;
    public static final int CREDENTIAL_TYPE_PATTERN = 1;
    public static final int CREDENTIAL_TYPE_PASSWORD_OR_PIN = 2;
    public static final int CREDENTIAL_TYPE_PIN = 3;
    public static final int CREDENTIAL_TYPE_PASSWORD = 4;
    public static final int PIN_LENGTH_UNAVAILABLE = -1;
    public static final int MIN_AUTO_PIN_REQUIREMENT_LENGTH = 6;
    public static final byte[] ENCRYPTED_REMOTE_CREDENTIALS_HEADER = null;
    public static final int VERIFY_FLAG_REQUEST_GK_PW_HANDLE = 1;
    public static final int VERIFY_FLAG_WRITE_REPAIR_MODE_PW = 2;
    public static final int USER_FRP = -9999;
    public static final int USER_REPAIR_MODE = -9998;
    public static final java.lang.String PASSWORD_TYPE_KEY = "lockscreen.password_type";
    @java.lang.Deprecated
    public static final java.lang.String PASSWORD_TYPE_ALTERNATE_KEY = "lockscreen.password_type_alternate";
    public static final java.lang.String LOCK_PASSWORD_SALT_KEY = "lockscreen.password_salt";
    public static final java.lang.String DISABLE_LOCKSCREEN_KEY = "lockscreen.disabled";
    public static final java.lang.String LOCKSCREEN_POWER_BUTTON_INSTANTLY_LOCKS = "lockscreen.power_button_instantly_locks";
    @java.lang.Deprecated
    public static final java.lang.String LOCKSCREEN_WIDGETS_ENABLED = "lockscreen.widgets_enabled";
    public static final java.lang.String PASSWORD_HISTORY_KEY = "lockscreen.passwordhistory";
    public static final java.lang.String AUTO_PIN_CONFIRM = "lockscreen.auto_pin_confirm";
    public static final java.lang.String CURRENT_LSKF_BASED_PROTECTOR_ID_KEY = "sp-handle";
    public static final java.lang.String PASSWORD_HISTORY_DELIMITER = ",";
    public static final java.lang.String FLAG_ENABLE_AUTO_PIN_CONFIRMATION = "AutoPinConfirmation__enable_auto_pin_confirmation";
    public static java.lang.String credentialTypeToString(int p0) { return null; }
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    public void setTrustUsuallyManaged(boolean p0, int p1) {}
    public void userPresent(int p0) {}
    public android.app.admin.DevicePolicyManager getDevicePolicyManager() { return null; }
    public LockPatternUtils(android.content.Context p0) {}
    public LockPatternUtils(android.content.Context p0, com.android.internal.widget.ILockSettings p1) {}
    public com.android.internal.widget.ILockSettings getLockSettings() { return null; }
    public int getRequestedMinimumPasswordLength(int p0) { return 0; }
    public int getMaximumPasswordLength(int p0) { return 0; }
    public android.app.admin.PasswordMetrics getRequestedPasswordMetrics(int p0) { return null; }
    public android.app.admin.PasswordMetrics getRequestedPasswordMetrics(int p0, boolean p1) { return null; }
    public int getRequestedPasswordComplexity(int p0) { return 0; }
    public int getRequestedPasswordComplexity(int p0, boolean p1) { return 0; }
    public void reportFailedPasswordAttempt(int p0) {}
    public void reportSuccessfulPasswordAttempt(int p0) {}
    public void reportPasswordLockout(int p0, int p1) {}
    public int getCurrentFailedPasswordAttempts(int p0) { return 0; }
    public int getMaximumFailedPasswordsForWipe(int p0) { return 0; }
    @android.annotation.NonNull
    public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) { return null; }
    public void removeGatekeeperPasswordHandle(long p0) {}
    public boolean checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p2) throws com.android.internal.widget.LockPatternUtils.RequestThrottledException { return false; }
    @android.annotation.NonNull
    public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public byte[] getPasswordHistoryHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) { return null; }
    public boolean checkPasswordHistory(byte[] p0, byte[] p1, int p2) { return false; }
    public int getPinLength(int p0) { return 0; }
    public boolean refreshStoredPinLength(int p0) { return false; }
    public int getActivePasswordQuality(int p0) { return 0; }
    public void resetKeyStore(int p0) {}
    public void setLockScreenDisabled(boolean p0, int p1) {}
    public boolean isLockScreenDisabled(int p0) { return false; }
    public void setAutoPinConfirm(boolean p0, int p1) {}
    public boolean isAutoPinConfirmEnabled(int p0) { return false; }
    public static boolean isAutoPinConfirmFeatureAvailable() { return false; }
    public static boolean isQualityAlphabeticPassword(int p0) { return false; }
    public static boolean isQualityNumericPin(int p0) { return false; }
    public static int credentialTypeToPasswordQuality(int p0) { return 0; }
    public static int pinOrPasswordQualityToCredentialType(int p0) { return 0; }
    public boolean setLockCredential(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) { return false; }
    public void setOwnerInfo(java.lang.String p0, int p1) {}
    public void setOwnerInfoEnabled(boolean p0, int p1) {}
    public java.lang.String getOwnerInfo(int p0) { return null; }
    public boolean isOwnerInfoEnabled(int p0) { return false; }
    public void setDeviceOwnerInfo(java.lang.String p0) {}
    public java.lang.String getDeviceOwnerInfo() { return null; }
    public boolean isDeviceOwnerInfoEnabled() { return false; }
    public static boolean isDeviceEncryptionEnabled() { return false; }
    public static boolean isFileEncryptionEnabled() { return false; }
    @java.lang.Deprecated
    public int getKeyguardStoredPasswordQuality(int p0) { return 0; }
    public void setSeparateProfileChallengeEnabled(int p0, boolean p1, com.android.internal.widget.LockscreenCredential p2) {}
    public boolean isSeparateProfileChallengeEnabled(int p0) { return false; }
    public boolean isProfileWithUnifiedChallenge(int p0) { return false; }
    public boolean isManagedProfileWithUnifiedChallenge(int p0) { return false; }
    public static java.util.List<com.android.internal.widget.LockPatternView.Cell> byteArrayToPattern(byte[] p0) { return null; }
    public static byte[] patternToByteArray(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) { return null; }
    public static final void invalidateCredentialTypeCache() {}
    public int getCredentialTypeForUser(int p0) { return 0; }
    public boolean isSecure(int p0) { return false; }
    public boolean isLockPasswordEnabled(int p0) { return false; }
    public boolean isLockPatternEnabled(int p0) { return false; }
    public boolean isVisiblePatternEnabled(int p0) { return false; }
    public void setVisiblePatternEnabled(boolean p0, int p1) {}
    public boolean isVisiblePatternEverChosen(int p0) { return false; }
    public boolean isPinEnhancedPrivacyEnabled(int p0) { return false; }
    public void setPinEnhancedPrivacyEnabled(boolean p0, int p1) {}
    public boolean isPinEnhancedPrivacyEverChosen(int p0) { return false; }
    public long setLockoutAttemptDeadline(int p0, int p1) { return 0L; }
    public long getLockoutAttemptDeadline(int p0) { return 0L; }
    public void setPowerButtonInstantlyLocks(boolean p0, int p1) {}
    public boolean getPowerButtonInstantlyLocks(int p0) { return false; }
    public boolean isPowerButtonInstantlyLocksEverChosen(int p0) { return false; }
    public void setEnabledTrustAgents(java.util.Collection<android.content.ComponentName> p0, int p1) {}
    public java.util.List<android.content.ComponentName> getEnabledTrustAgents(int p0) { return null; }
    public void setKnownTrustAgents(java.util.Collection<android.content.ComponentName> p0, int p1) {}
    public java.util.List<android.content.ComponentName> getKnownTrustAgents(int p0) { return null; }
    public void requireCredentialEntry(int p0) {}
    public void requireStrongAuth(int p0, int p1) {}
    public void registerStrongAuthTracker(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0) {}
    public void unregisterStrongAuthTracker(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0) {}
    public boolean registerWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) { return false; }
    public boolean unregisterWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) { return false; }
    public void reportSuccessfulBiometricUnlock(boolean p0, int p1) {}
    public void scheduleNonStrongBiometricIdleTimeout(int p0) {}
    public int getStrongAuthForUser(int p0) { return 0; }
    public boolean isCredentialsDisabledForUser(int p0) { return false; }
    public boolean isTrustAllowedForUser(int p0) { return false; }
    public boolean isBiometricAllowedForUser(int p0) { return false; }
    public boolean isUserInLockdown(int p0) { return false; }
    public long addEscrowToken(byte[] p0, int p1, com.android.internal.widget.LockPatternUtils.EscrowTokenStateChangeCallback p2) { return 0L; }
    public long addWeakEscrowToken(byte[] p0, int p1, com.android.internal.widget.IWeakEscrowTokenActivatedListener p2) { return 0L; }
    public boolean removeEscrowToken(long p0, int p1) { return false; }
    public boolean removeWeakEscrowToken(long p0, int p1) { return false; }
    public boolean isEscrowTokenActive(long p0, int p1) { return false; }
    public boolean isWeakEscrowTokenActive(long p0, int p1) { return false; }
    public boolean isWeakEscrowTokenValid(long p0, byte[] p1, int p2) { return false; }
    public boolean setLockCredentialWithToken(com.android.internal.widget.LockscreenCredential p0, long p1, byte[] p2, int p3) { return false; }
    public boolean unlockUserWithToken(long p0, byte[] p1, int p2) { return false; }
    public boolean hasPendingEscrowToken(int p0) { return false; }
    public boolean hasSecureLockScreen() { return false; }
    public static boolean userOwnsFrpCredential(android.content.Context p0, android.content.pm.UserInfo p1) { return false; }
    public static boolean frpCredentialEnabled(android.content.Context p0) { return false; }
    public static boolean isRepairModeSupported(android.content.Context p0) { return false; }
    public static boolean isRepairModeActive(android.content.Context p0) { return false; }
    public static boolean canUserEnterRepairMode(android.content.Context p0, android.content.pm.UserInfo p1) { return false; }
    public static boolean isGsiRunning() { return false; }
    public static boolean isSpecialUserId(int p0) { return false; }
    public boolean tryUnlockWithCachedUnifiedChallenge(int p0) { return false; }
    public void removeCachedUnifiedChallenge(int p0) {}
    public void unlockUserKeyIfUnsecured(int p0) {}
    public void createNewUser(int p0, int p1) {}
    public void removeUser(int p0) {}
    @android.annotation.NonNull
    public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() { return null; }
    @android.annotation.NonNull
    public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) { return null; }

    public static interface CheckCredentialProgressCallback {
        public void onEarlyMatched();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CredentialType {
    }

    public static interface EscrowTokenStateChangeCallback {
        public void onEscrowTokenActivated(long p0, int p1);
    }

    public static final class RequestThrottledException extends java.lang.Exception {
        public RequestThrottledException(int p0) { super(); }
        public int getTimeoutMs() { return 0; }
    }

    public static class StrongAuthTracker {
        public static final int STRONG_AUTH_NOT_REQUIRED = 0;
        public static final int STRONG_AUTH_REQUIRED_AFTER_BOOT = 1;
        public static final int STRONG_AUTH_REQUIRED_AFTER_DPM_LOCK_NOW = 2;
        public static final int SOME_AUTH_REQUIRED_AFTER_USER_REQUEST = 4;
        public static final int STRONG_AUTH_REQUIRED_AFTER_LOCKOUT = 8;
        public static final int STRONG_AUTH_REQUIRED_AFTER_TIMEOUT = 16;
        public static final int STRONG_AUTH_REQUIRED_AFTER_USER_LOCKDOWN = 32;
        public static final int STRONG_AUTH_REQUIRED_FOR_UNATTENDED_UPDATE = 64;
        public static final int STRONG_AUTH_REQUIRED_AFTER_NON_STRONG_BIOMETRICS_TIMEOUT = 128;
        public static final int SOME_AUTH_REQUIRED_AFTER_TRUSTAGENT_EXPIRED = 256;
        public static final int SOME_AUTH_REQUIRED_AFTER_ADAPTIVE_AUTH_REQUEST = 512;
        public StrongAuthTracker(android.content.Context p0) {}
        public StrongAuthTracker(android.content.Context p0, android.os.Looper p1) {}
        public static int getDefaultFlags(android.content.Context p0) { return 0; }
        public int getStrongAuthForUser(int p0) { return 0; }
        public boolean isTrustAllowedForUser(int p0) { return false; }
        public boolean isBiometricAllowedForUser(boolean p0, int p1) { return false; }
        public boolean isNonStrongBiometricAllowedAfterIdleTimeout(int p0) { return false; }
        public void onStrongAuthRequiredChanged(int p0) {}
        public void onIsNonStrongBiometricAllowedChanged(int p0) {}
        protected void handleStrongAuthRequiredChanged(int p0, int p1) {}
        protected void handleIsNonStrongBiometricAllowedChanged(boolean p0, int p1) {}
        public android.app.trust.IStrongAuthTracker.Stub getStub() { return null; }

        private class H extends android.os.Handler {
            static final int MSG_ON_STRONG_AUTH_REQUIRED_CHANGED = 1;
            static final int MSG_ON_IS_NON_STRONG_BIOMETRIC_ALLOWED_CHANGED = 2;
            public H(com.android.internal.widget.LockPatternUtils.StrongAuthTracker p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StrongAuthFlags {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifyFlag {
    }

    private static class WrappedCallback extends com.android.internal.widget.ICheckCredentialProgressCallback.Stub {
        WrappedCallback(android.os.Handler p0, com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p1) { super(); }
        public void onCredentialVerified() throws android.os.RemoteException {}
    }
}
