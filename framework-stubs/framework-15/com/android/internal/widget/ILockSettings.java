package com.android.internal.widget;

public interface ILockSettings extends android.os.IInterface {
    public void setBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public void setString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean getBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public long getLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public java.lang.String getString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setLockCredential(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException;
    public void resetKeyStore(int p0) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.ICheckCredentialProgressCallback p2) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException;
    public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) throws android.os.RemoteException;
    public void removeGatekeeperPasswordHandle(long p0) throws android.os.RemoteException;
    public int getCredentialType(int p0) throws android.os.RemoteException;
    public int getPinLength(int p0) throws android.os.RemoteException;
    public boolean refreshStoredPinLength(int p0) throws android.os.RemoteException;
    public byte[] getHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException;
    public void setSeparateProfileChallengeEnabled(int p0, boolean p1, com.android.internal.widget.LockscreenCredential p2) throws android.os.RemoteException;
    public boolean getSeparateProfileChallengeEnabled(int p0) throws android.os.RemoteException;
    public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException;
    public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException;
    public void requireStrongAuth(int p0, int p1) throws android.os.RemoteException;
    public void reportSuccessfulBiometricUnlock(boolean p0, int p1) throws android.os.RemoteException;
    public void scheduleNonStrongBiometricIdleTimeout(int p0) throws android.os.RemoteException;
    public void systemReady() throws android.os.RemoteException;
    public void userPresent(int p0) throws android.os.RemoteException;
    public int getStrongAuthForUser(int p0) throws android.os.RemoteException;
    public boolean hasPendingEscrowToken(int p0) throws android.os.RemoteException;
    public void initRecoveryServiceWithSigFile(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public android.security.keystore.recovery.KeyChainSnapshot getKeyChainSnapshot() throws android.os.RemoteException;
    public java.lang.String generateKey(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String generateKeyWithMetadata(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public java.lang.String importKey(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public java.lang.String importKeyWithMetadata(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException;
    public java.lang.String getKey(java.lang.String p0) throws android.os.RemoteException;
    public void removeKey(java.lang.String p0) throws android.os.RemoteException;
    public void setSnapshotCreatedPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void setServerParams(byte[] p0) throws android.os.RemoteException;
    public void setRecoveryStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.Map getRecoveryStatus() throws android.os.RemoteException;
    public void setRecoverySecretTypes(int[] p0) throws android.os.RemoteException;
    public int[] getRecoverySecretTypes() throws android.os.RemoteException;
    public byte[] startRecoverySessionWithCertPath(java.lang.String p0, java.lang.String p1, android.security.keystore.recovery.RecoveryCertPath p2, byte[] p3, byte[] p4, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p5) throws android.os.RemoteException;
    public java.util.Map recoverKeyChainSnapshot(java.lang.String p0, byte[] p1, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p2) throws android.os.RemoteException;
    public void closeSession(java.lang.String p0) throws android.os.RemoteException;
    public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() throws android.os.RemoteException;
    public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) throws android.os.RemoteException;
    public boolean hasSecureLockScreen() throws android.os.RemoteException;
    public boolean tryUnlockWithCachedUnifiedChallenge(int p0) throws android.os.RemoteException;
    public void removeCachedUnifiedChallenge(int p0) throws android.os.RemoteException;
    public boolean registerWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException;
    public boolean unregisterWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException;
    public long addWeakEscrowToken(byte[] p0, int p1, com.android.internal.widget.IWeakEscrowTokenActivatedListener p2) throws android.os.RemoteException;
    public boolean removeWeakEscrowToken(long p0, int p1) throws android.os.RemoteException;
    public boolean isWeakEscrowTokenActive(long p0, int p1) throws android.os.RemoteException;
    public boolean isWeakEscrowTokenValid(long p0, byte[] p1, int p2) throws android.os.RemoteException;
    public void unlockUserKeyIfUnsecured(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.widget.ILockSettings {
        public Default() {}
        public void setBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
        public void setString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean getBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
        public long getLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0L; }
        public java.lang.String getString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public boolean setLockCredential(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException { return false; }
        public void resetKeyStore(int p0) throws android.os.RemoteException {}
        public com.android.internal.widget.VerifyCredentialResponse checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.ICheckCredentialProgressCallback p2) throws android.os.RemoteException { return null; }
        public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public void removeGatekeeperPasswordHandle(long p0) throws android.os.RemoteException {}
        public int getCredentialType(int p0) throws android.os.RemoteException { return 0; }
        public int getPinLength(int p0) throws android.os.RemoteException { return 0; }
        public boolean refreshStoredPinLength(int p0) throws android.os.RemoteException { return false; }
        public byte[] getHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException { return null; }
        public void setSeparateProfileChallengeEnabled(int p0, boolean p1, com.android.internal.widget.LockscreenCredential p2) throws android.os.RemoteException {}
        public boolean getSeparateProfileChallengeEnabled(int p0) throws android.os.RemoteException { return false; }
        public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException {}
        public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException {}
        public void requireStrongAuth(int p0, int p1) throws android.os.RemoteException {}
        public void reportSuccessfulBiometricUnlock(boolean p0, int p1) throws android.os.RemoteException {}
        public void scheduleNonStrongBiometricIdleTimeout(int p0) throws android.os.RemoteException {}
        public void systemReady() throws android.os.RemoteException {}
        public void userPresent(int p0) throws android.os.RemoteException {}
        public int getStrongAuthForUser(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasPendingEscrowToken(int p0) throws android.os.RemoteException { return false; }
        public void initRecoveryServiceWithSigFile(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
        public android.security.keystore.recovery.KeyChainSnapshot getKeyChainSnapshot() throws android.os.RemoteException { return null; }
        public java.lang.String generateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String generateKeyWithMetadata(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String importKey(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
        public java.lang.String importKeyWithMetadata(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
        public java.lang.String getKey(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void removeKey(java.lang.String p0) throws android.os.RemoteException {}
        public void setSnapshotCreatedPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void setServerParams(byte[] p0) throws android.os.RemoteException {}
        public void setRecoveryStatus(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public java.util.Map getRecoveryStatus() throws android.os.RemoteException { return null; }
        public void setRecoverySecretTypes(int[] p0) throws android.os.RemoteException {}
        public int[] getRecoverySecretTypes() throws android.os.RemoteException { return null; }
        public byte[] startRecoverySessionWithCertPath(java.lang.String p0, java.lang.String p1, android.security.keystore.recovery.RecoveryCertPath p2, byte[] p3, byte[] p4, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p5) throws android.os.RemoteException { return null; }
        public java.util.Map recoverKeyChainSnapshot(java.lang.String p0, byte[] p1, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p2) throws android.os.RemoteException { return null; }
        public void closeSession(java.lang.String p0) throws android.os.RemoteException {}
        public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() throws android.os.RemoteException { return null; }
        public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) throws android.os.RemoteException { return null; }
        public boolean hasSecureLockScreen() throws android.os.RemoteException { return false; }
        public boolean tryUnlockWithCachedUnifiedChallenge(int p0) throws android.os.RemoteException { return false; }
        public void removeCachedUnifiedChallenge(int p0) throws android.os.RemoteException {}
        public boolean registerWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException { return false; }
        public boolean unregisterWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException { return false; }
        public long addWeakEscrowToken(byte[] p0, int p1, com.android.internal.widget.IWeakEscrowTokenActivatedListener p2) throws android.os.RemoteException { return 0L; }
        public boolean removeWeakEscrowToken(long p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isWeakEscrowTokenActive(long p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isWeakEscrowTokenValid(long p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
        public void unlockUserKeyIfUnsecured(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.ILockSettings {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.widget.ILockSettings";
        static final int TRANSACTION_setBoolean = 1;
        static final int TRANSACTION_setLong = 2;
        static final int TRANSACTION_setString = 3;
        static final int TRANSACTION_getBoolean = 4;
        static final int TRANSACTION_getLong = 5;
        static final int TRANSACTION_getString = 6;
        static final int TRANSACTION_setLockCredential = 7;
        static final int TRANSACTION_resetKeyStore = 8;
        static final int TRANSACTION_checkCredential = 9;
        static final int TRANSACTION_verifyCredential = 10;
        static final int TRANSACTION_verifyTiedProfileChallenge = 11;
        static final int TRANSACTION_verifyGatekeeperPasswordHandle = 12;
        static final int TRANSACTION_removeGatekeeperPasswordHandle = 13;
        static final int TRANSACTION_getCredentialType = 14;
        static final int TRANSACTION_getPinLength = 15;
        static final int TRANSACTION_refreshStoredPinLength = 16;
        static final int TRANSACTION_getHashFactor = 17;
        static final int TRANSACTION_setSeparateProfileChallengeEnabled = 18;
        static final int TRANSACTION_getSeparateProfileChallengeEnabled = 19;
        static final int TRANSACTION_registerStrongAuthTracker = 20;
        static final int TRANSACTION_unregisterStrongAuthTracker = 21;
        static final int TRANSACTION_requireStrongAuth = 22;
        static final int TRANSACTION_reportSuccessfulBiometricUnlock = 23;
        static final int TRANSACTION_scheduleNonStrongBiometricIdleTimeout = 24;
        static final int TRANSACTION_systemReady = 25;
        static final int TRANSACTION_userPresent = 26;
        static final int TRANSACTION_getStrongAuthForUser = 27;
        static final int TRANSACTION_hasPendingEscrowToken = 28;
        static final int TRANSACTION_initRecoveryServiceWithSigFile = 29;
        static final int TRANSACTION_getKeyChainSnapshot = 30;
        static final int TRANSACTION_generateKey = 31;
        static final int TRANSACTION_generateKeyWithMetadata = 32;
        static final int TRANSACTION_importKey = 33;
        static final int TRANSACTION_importKeyWithMetadata = 34;
        static final int TRANSACTION_getKey = 35;
        static final int TRANSACTION_removeKey = 36;
        static final int TRANSACTION_setSnapshotCreatedPendingIntent = 37;
        static final int TRANSACTION_setServerParams = 38;
        static final int TRANSACTION_setRecoveryStatus = 39;
        static final int TRANSACTION_getRecoveryStatus = 40;
        static final int TRANSACTION_setRecoverySecretTypes = 41;
        static final int TRANSACTION_getRecoverySecretTypes = 42;
        static final int TRANSACTION_startRecoverySessionWithCertPath = 43;
        static final int TRANSACTION_recoverKeyChainSnapshot = 44;
        static final int TRANSACTION_closeSession = 45;
        static final int TRANSACTION_startRemoteLockscreenValidation = 46;
        static final int TRANSACTION_validateRemoteLockscreen = 47;
        static final int TRANSACTION_hasSecureLockScreen = 48;
        static final int TRANSACTION_tryUnlockWithCachedUnifiedChallenge = 49;
        static final int TRANSACTION_removeCachedUnifiedChallenge = 50;
        static final int TRANSACTION_registerWeakEscrowTokenRemovedListener = 51;
        static final int TRANSACTION_unregisterWeakEscrowTokenRemovedListener = 52;
        static final int TRANSACTION_addWeakEscrowToken = 53;
        static final int TRANSACTION_removeWeakEscrowToken = 54;
        static final int TRANSACTION_isWeakEscrowTokenActive = 55;
        static final int TRANSACTION_isWeakEscrowTokenValid = 56;
        static final int TRANSACTION_unlockUserKeyIfUnsecured = 57;
        public Stub() { super(); }
        public static com.android.internal.widget.ILockSettings asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.widget.ILockSettings {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
            public void setString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean getBoolean(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return false; }
            public long getLong(java.lang.String p0, long p1, int p2) throws android.os.RemoteException { return 0L; }
            public java.lang.String getString(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public boolean setLockCredential(com.android.internal.widget.LockscreenCredential p0, com.android.internal.widget.LockscreenCredential p1, int p2) throws android.os.RemoteException { return false; }
            public void resetKeyStore(int p0) throws android.os.RemoteException {}
            public com.android.internal.widget.VerifyCredentialResponse checkCredential(com.android.internal.widget.LockscreenCredential p0, int p1, com.android.internal.widget.ICheckCredentialProgressCallback p2) throws android.os.RemoteException { return null; }
            public com.android.internal.widget.VerifyCredentialResponse verifyCredential(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.internal.widget.VerifyCredentialResponse verifyTiedProfileChallenge(com.android.internal.widget.LockscreenCredential p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.internal.widget.VerifyCredentialResponse verifyGatekeeperPasswordHandle(long p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public void removeGatekeeperPasswordHandle(long p0) throws android.os.RemoteException {}
            public int getCredentialType(int p0) throws android.os.RemoteException { return 0; }
            public int getPinLength(int p0) throws android.os.RemoteException { return 0; }
            public boolean refreshStoredPinLength(int p0) throws android.os.RemoteException { return false; }
            public byte[] getHashFactor(com.android.internal.widget.LockscreenCredential p0, int p1) throws android.os.RemoteException { return null; }
            public void setSeparateProfileChallengeEnabled(int p0, boolean p1, com.android.internal.widget.LockscreenCredential p2) throws android.os.RemoteException {}
            public boolean getSeparateProfileChallengeEnabled(int p0) throws android.os.RemoteException { return false; }
            public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException {}
            public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker p0) throws android.os.RemoteException {}
            public void requireStrongAuth(int p0, int p1) throws android.os.RemoteException {}
            public void reportSuccessfulBiometricUnlock(boolean p0, int p1) throws android.os.RemoteException {}
            public void scheduleNonStrongBiometricIdleTimeout(int p0) throws android.os.RemoteException {}
            public void systemReady() throws android.os.RemoteException {}
            public void userPresent(int p0) throws android.os.RemoteException {}
            public int getStrongAuthForUser(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasPendingEscrowToken(int p0) throws android.os.RemoteException { return false; }
            public void initRecoveryServiceWithSigFile(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException {}
            public android.security.keystore.recovery.KeyChainSnapshot getKeyChainSnapshot() throws android.os.RemoteException { return null; }
            public java.lang.String generateKey(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String generateKeyWithMetadata(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String importKey(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return null; }
            public java.lang.String importKeyWithMetadata(java.lang.String p0, byte[] p1, byte[] p2) throws android.os.RemoteException { return null; }
            public java.lang.String getKey(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void removeKey(java.lang.String p0) throws android.os.RemoteException {}
            public void setSnapshotCreatedPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void setServerParams(byte[] p0) throws android.os.RemoteException {}
            public void setRecoveryStatus(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public java.util.Map getRecoveryStatus() throws android.os.RemoteException { return null; }
            public void setRecoverySecretTypes(int[] p0) throws android.os.RemoteException {}
            public int[] getRecoverySecretTypes() throws android.os.RemoteException { return null; }
            public byte[] startRecoverySessionWithCertPath(java.lang.String p0, java.lang.String p1, android.security.keystore.recovery.RecoveryCertPath p2, byte[] p3, byte[] p4, java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p5) throws android.os.RemoteException { return null; }
            public java.util.Map recoverKeyChainSnapshot(java.lang.String p0, byte[] p1, java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p2) throws android.os.RemoteException { return null; }
            public void closeSession(java.lang.String p0) throws android.os.RemoteException {}
            public android.app.RemoteLockscreenValidationSession startRemoteLockscreenValidation() throws android.os.RemoteException { return null; }
            public android.app.RemoteLockscreenValidationResult validateRemoteLockscreen(byte[] p0) throws android.os.RemoteException { return null; }
            public boolean hasSecureLockScreen() throws android.os.RemoteException { return false; }
            public boolean tryUnlockWithCachedUnifiedChallenge(int p0) throws android.os.RemoteException { return false; }
            public void removeCachedUnifiedChallenge(int p0) throws android.os.RemoteException {}
            public boolean registerWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException { return false; }
            public boolean unregisterWeakEscrowTokenRemovedListener(com.android.internal.widget.IWeakEscrowTokenRemovedListener p0) throws android.os.RemoteException { return false; }
            public long addWeakEscrowToken(byte[] p0, int p1, com.android.internal.widget.IWeakEscrowTokenActivatedListener p2) throws android.os.RemoteException { return 0L; }
            public boolean removeWeakEscrowToken(long p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isWeakEscrowTokenActive(long p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isWeakEscrowTokenValid(long p0, byte[] p1, int p2) throws android.os.RemoteException { return false; }
            public void unlockUserKeyIfUnsecured(int p0) throws android.os.RemoteException {}
        }
    }
}
