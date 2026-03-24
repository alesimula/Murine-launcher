package com.android.internal.widget;

public class LockPatternUtils {
    public static final java.lang.String LEGACY_LOCK_PATTERN_ENABLED = "legacy_lock_pattern_enabled";
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
    public static final int VERIFY_FLAG_REQUEST_GK_PW_HANDLE = 1;
    public static final int USER_FRP = -9999;
    @java.lang.Deprecated
    public static final java.lang.String LOCKOUT_PERMANENT_KEY = "lockscreen.lockedoutpermanently";
    public static final java.lang.String PATTERN_EVER_CHOSEN_KEY = "lockscreen.patterneverchosen";
    public static final java.lang.String PASSWORD_TYPE_KEY = "lockscreen.password_type";
    @java.lang.Deprecated
    public static final java.lang.String PASSWORD_TYPE_ALTERNATE_KEY = "lockscreen.password_type_alternate";
    public static final java.lang.String LOCK_PASSWORD_SALT_KEY = "lockscreen.password_salt";
    public static final java.lang.String DISABLE_LOCKSCREEN_KEY = "lockscreen.disabled";
    public static final java.lang.String LOCKSCREEN_OPTIONS = "lockscreen.options";
    @java.lang.Deprecated
    public static final java.lang.String LOCKSCREEN_BIOMETRIC_WEAK_FALLBACK = "lockscreen.biometric_weak_fallback";
    @java.lang.Deprecated
    public static final java.lang.String BIOMETRIC_WEAK_EVER_CHOSEN_KEY = "lockscreen.biometricweakeverchosen";
    public static final java.lang.String LOCKSCREEN_POWER_BUTTON_INSTANTLY_LOCKS = "lockscreen.power_button_instantly_locks";
    @java.lang.Deprecated
    public static final java.lang.String LOCKSCREEN_WIDGETS_ENABLED = "lockscreen.widgets_enabled";
    public static final java.lang.String PASSWORD_HISTORY_KEY = "lockscreen.passwordhistory";
    public static final java.lang.String PROFILE_KEY_NAME_ENCRYPT = "profile_key_name_encrypt_";
    public static final java.lang.String PROFILE_KEY_NAME_DECRYPT = "profile_key_name_decrypt_";
    public static final java.lang.String SYNTHETIC_PASSWORD_KEY_PREFIX = "synthetic_password_";
    public static final java.lang.String SYNTHETIC_PASSWORD_HANDLE_KEY = "sp-handle";
    public static final java.lang.String SYNTHETIC_PASSWORD_ENABLED_KEY = "enable-sp";
    public static final int SYNTHETIC_PASSWORD_ENABLED_BY_DEFAULT = 1;
    public static final java.lang.String PASSWORD_HISTORY_DELIMITER = ",";
    public boolean isTrustUsuallyManaged(int p0) { return false; }
    public void setTrustUsuallyManaged(boolean p0, int p1) {}
    public void userPresent(int p0) {}
    public android.app.admin.DevicePolicyManager getDevicePolicyManager() { return null; }
    public LockPatternUtils(android.content.Context p0) {}
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
    public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) { return null; }
    public void removeGatekeeperPasswordHandle(long p0) {}
    public boolean checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.LockPatternUtils.CheckCredentialProgressCallback p2) throws com.android.internal.widget.LockPatternUtils.RequestThrottledException { return false; }
    public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) { return null; }
    public byte[] getPasswordHistoryHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) { return null; }
    public boolean checkPasswordHistory(byte[] p0, byte[] p1, int p2) { return false; }
    public boolean isPatternEverChosen(int p0) { return false; }
    public void reportPatternWasChosen(int p0) {}
    public int getActivePasswordQuality(int p0) { return 0; }
    public void resetKeyStore(int p0) {}
    public void setLockScreenDisabled(boolean p0, int p1) {}
    public boolean isLockScreenDisabled(int p0) { return false; }
    public static boolean isQualityAlphabeticPassword(int p0) { return false; }
    public static boolean isQualityNumericPin(int p0) { return false; }
    public static int credentialTypeToPasswordQuality(int p0) { return 0; }
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
    public boolean isManagedProfileWithUnifiedChallenge(int p0) { return false; }
    public static java.util.List<com.android.internal.widget.LockPatternView.Cell> byteArrayToPattern(byte[] p0) { return null; }
    public static byte[] patternToByteArray(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0) { return null; }
    public static final void invalidateCredentialTypeCache() {}
    public int getCredentialTypeForUser(int p0) { return 0; }
    public boolean isSecure(int p0) { return false; }
    public boolean isLockPasswordEnabled(int p0) { return false; }
    public boolean isLockPatternEnabled(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isLegacyLockPatternEnabled(int p0) { return false; }
    @java.lang.Deprecated
    public void setLegacyLockPatternEnabled(int p0) {}
    public boolean isVisiblePatternEnabled(int p0) { return false; }
    public void setVisiblePatternEnabled(boolean p0, int p1) {}
    public boolean isVisiblePatternEverChosen(int p0) { return false; }
    public void setVisiblePasswordEnabled(boolean p0, int p1) {}
    public long setLockoutAttemptDeadline(int p0, int p1) { return 0L; }
    public long getLockoutAttemptDeadline(int p0) { return 0L; }
    public void setPowerButtonInstantlyLocks(boolean p0, int p1) {}
    public boolean getPowerButtonInstantlyLocks(int p0) { return false; }
    public boolean isPowerButtonInstantlyLocksEverChosen(int p0) { return false; }
    public void setEnabledTrustAgents(java.util.Collection<android.content.ComponentName> p0, int p1) {}
    public java.util.List<android.content.ComponentName> getEnabledTrustAgents(int p0) { return null; }
    public void requireCredentialEntry(int p0) {}
    public void requireStrongAuth(int p0, int p1) {}
    public boolean isCredentialRequiredToDecrypt(boolean p0) { return false; }
    public void setCredentialRequiredToDecrypt(boolean p0) {}
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
    public void enableSyntheticPassword() {}
    public void disableSyntheticPassword() {}
    public boolean isSyntheticPasswordEnabled() { return false; }
    public boolean hasPendingEscrowToken(int p0) { return false; }
    public boolean hasSecureLockScreen() { return false; }
    public static boolean userOwnsFrpCredential(android.content.Context p0, android.content.pm.UserInfo p1) { return false; }
    public static boolean frpCredentialEnabled(android.content.Context p0) { return false; }
    public boolean tryUnlockWithCachedUnifiedChallenge(int p0) { return false; }
    public void removeCachedUnifiedChallenge(int p0) {}

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
