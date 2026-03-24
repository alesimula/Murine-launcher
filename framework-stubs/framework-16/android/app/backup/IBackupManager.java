package android.app.backup;

public interface IBackupManager extends android.os.IInterface {
    public void dataChangedForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void dataChanged(java.lang.String p0) throws android.os.RemoteException;
    public void clearBackupDataForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void clearBackupData(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void initializeTransportsForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2) throws android.os.RemoteException;
    public void restoreAtInstallForUser(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void restoreAtInstall(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setBackupEnabledForUser(int p0, boolean p1) throws android.os.RemoteException;
    public void setFrameworkSchedulingEnabledForUser(int p0, boolean p1) throws android.os.RemoteException;
    public void setBackupEnabled(boolean p0) throws android.os.RemoteException;
    public void setAutoRestoreForUser(int p0, boolean p1) throws android.os.RemoteException;
    public void setAutoRestore(boolean p0) throws android.os.RemoteException;
    public boolean isBackupEnabledForUser(int p0) throws android.os.RemoteException;
    public boolean isBackupEnabled() throws android.os.RemoteException;
    public boolean setBackupPassword(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasBackupPassword() throws android.os.RemoteException;
    public void backupNowForUser(int p0) throws android.os.RemoteException;
    public void backupNow() throws android.os.RemoteException;
    public void adbBackup(int p0, android.os.ParcelFileDescriptor p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9, java.lang.String[] p10) throws android.os.RemoteException;
    public void fullTransportBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void adbRestore(int p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException;
    public void acknowledgeFullBackupOrRestoreForUser(int p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, android.app.backup.IFullBackupRestoreObserver p5) throws android.os.RemoteException;
    public void acknowledgeFullBackupOrRestore(int p0, boolean p1, java.lang.String p2, java.lang.String p3, android.app.backup.IFullBackupRestoreObserver p4) throws android.os.RemoteException;
    public void updateTransportAttributesForUser(int p0, android.content.ComponentName p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.content.Intent p5, java.lang.CharSequence p6) throws android.os.RemoteException;
    public java.lang.String getCurrentTransportForUser(int p0) throws android.os.RemoteException;
    public java.lang.String getCurrentTransport() throws android.os.RemoteException;
    public android.content.ComponentName getCurrentTransportComponentForUser(int p0) throws android.os.RemoteException;
    public java.lang.String[] listAllTransportsForUser(int p0) throws android.os.RemoteException;
    public java.lang.String[] listAllTransports() throws android.os.RemoteException;
    public android.content.ComponentName[] listAllTransportComponentsForUser(int p0) throws android.os.RemoteException;
    public java.lang.String[] getTransportWhitelist() throws android.os.RemoteException;
    public java.lang.String selectBackupTransportForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String selectBackupTransport(java.lang.String p0) throws android.os.RemoteException;
    public void selectBackupTransportAsyncForUser(int p0, android.content.ComponentName p1, android.app.backup.ISelectBackupTransportCallback p2) throws android.os.RemoteException;
    public android.content.Intent getConfigurationIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.Intent getConfigurationIntent(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDestinationStringForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getDestinationString(java.lang.String p0) throws android.os.RemoteException;
    public android.content.Intent getDataManagementIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.Intent getDataManagementIntent(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.CharSequence getDataManagementLabelForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.backup.IRestoreSession beginRestoreSessionForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void opCompleteForUser(int p0, int p1, long p2) throws android.os.RemoteException;
    public void opComplete(int p0, long p1) throws android.os.RemoteException;
    public void setBackupServiceActive(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isBackupServiceActive(int p0) throws android.os.RemoteException;
    public boolean isUserReadyForBackup(int p0) throws android.os.RemoteException;
    public long getAvailableRestoreTokenForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isAppEligibleForBackupForUser(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] filterAppsEligibleForBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException;
    public int requestBackupForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2, android.app.backup.IBackupManagerMonitor p3, int p4) throws android.os.RemoteException;
    public int requestBackup(java.lang.String[] p0, android.app.backup.IBackupObserver p1, android.app.backup.IBackupManagerMonitor p2, int p3) throws android.os.RemoteException;
    public void cancelBackupsForUser(int p0) throws android.os.RemoteException;
    public void cancelBackups() throws android.os.RemoteException;
    public android.os.UserHandle getUserForAncestralSerialNumber(long p0) throws android.os.RemoteException;
    public void setAncestralSerialNumber(long p0) throws android.os.RemoteException;
    public void excludeKeysFromRestore(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void reportDelayedRestoreResult(java.lang.String p0, java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult> p1) throws android.os.RemoteException;

    public static class Default implements android.app.backup.IBackupManager {
        public Default() {}
        public void dataChangedForUser(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void dataChanged(java.lang.String p0) throws android.os.RemoteException {}
        public void clearBackupDataForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void clearBackupData(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void initializeTransportsForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2) throws android.os.RemoteException {}
        public void restoreAtInstallForUser(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void restoreAtInstall(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setBackupEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public void setFrameworkSchedulingEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public void setBackupEnabled(boolean p0) throws android.os.RemoteException {}
        public void setAutoRestoreForUser(int p0, boolean p1) throws android.os.RemoteException {}
        public void setAutoRestore(boolean p0) throws android.os.RemoteException {}
        public boolean isBackupEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isBackupEnabled() throws android.os.RemoteException { return false; }
        public boolean setBackupPassword(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasBackupPassword() throws android.os.RemoteException { return false; }
        public void backupNowForUser(int p0) throws android.os.RemoteException {}
        public void backupNow() throws android.os.RemoteException {}
        public void adbBackup(int p0, android.os.ParcelFileDescriptor p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9, java.lang.String[] p10) throws android.os.RemoteException {}
        public void fullTransportBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void adbRestore(int p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
        public void acknowledgeFullBackupOrRestoreForUser(int p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, android.app.backup.IFullBackupRestoreObserver p5) throws android.os.RemoteException {}
        public void acknowledgeFullBackupOrRestore(int p0, boolean p1, java.lang.String p2, java.lang.String p3, android.app.backup.IFullBackupRestoreObserver p4) throws android.os.RemoteException {}
        public void updateTransportAttributesForUser(int p0, android.content.ComponentName p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.content.Intent p5, java.lang.CharSequence p6) throws android.os.RemoteException {}
        public java.lang.String getCurrentTransportForUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCurrentTransport() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getCurrentTransportComponentForUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] listAllTransportsForUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] listAllTransports() throws android.os.RemoteException { return null; }
        public android.content.ComponentName[] listAllTransportComponentsForUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getTransportWhitelist() throws android.os.RemoteException { return null; }
        public java.lang.String selectBackupTransportForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String selectBackupTransport(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void selectBackupTransportAsyncForUser(int p0, android.content.ComponentName p1, android.app.backup.ISelectBackupTransportCallback p2) throws android.os.RemoteException {}
        public android.content.Intent getConfigurationIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.Intent getConfigurationIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDestinationStringForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.String getDestinationString(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.Intent getDataManagementIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.Intent getDataManagementIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getDataManagementLabelForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.app.backup.IRestoreSession beginRestoreSessionForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void opCompleteForUser(int p0, int p1, long p2) throws android.os.RemoteException {}
        public void opComplete(int p0, long p1) throws android.os.RemoteException {}
        public void setBackupServiceActive(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean isBackupServiceActive(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserReadyForBackup(int p0) throws android.os.RemoteException { return false; }
        public long getAvailableRestoreTokenForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public boolean isAppEligibleForBackupForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String[] filterAppsEligibleForBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public int requestBackupForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2, android.app.backup.IBackupManagerMonitor p3, int p4) throws android.os.RemoteException { return 0; }
        public int requestBackup(java.lang.String[] p0, android.app.backup.IBackupObserver p1, android.app.backup.IBackupManagerMonitor p2, int p3) throws android.os.RemoteException { return 0; }
        public void cancelBackupsForUser(int p0) throws android.os.RemoteException {}
        public void cancelBackups() throws android.os.RemoteException {}
        public android.os.UserHandle getUserForAncestralSerialNumber(long p0) throws android.os.RemoteException { return null; }
        public void setAncestralSerialNumber(long p0) throws android.os.RemoteException {}
        public void excludeKeysFromRestore(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void reportDelayedRestoreResult(java.lang.String p0, java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.backup.IBackupManager {
        public static final java.lang.String DESCRIPTOR = "android.app.backup.IBackupManager";
        static final int TRANSACTION_dataChangedForUser = 1;
        static final int TRANSACTION_dataChanged = 2;
        static final int TRANSACTION_clearBackupDataForUser = 3;
        static final int TRANSACTION_clearBackupData = 4;
        static final int TRANSACTION_initializeTransportsForUser = 5;
        static final int TRANSACTION_restoreAtInstallForUser = 6;
        static final int TRANSACTION_restoreAtInstall = 7;
        static final int TRANSACTION_setBackupEnabledForUser = 8;
        static final int TRANSACTION_setFrameworkSchedulingEnabledForUser = 9;
        static final int TRANSACTION_setBackupEnabled = 10;
        static final int TRANSACTION_setAutoRestoreForUser = 11;
        static final int TRANSACTION_setAutoRestore = 12;
        static final int TRANSACTION_isBackupEnabledForUser = 13;
        static final int TRANSACTION_isBackupEnabled = 14;
        static final int TRANSACTION_setBackupPassword = 15;
        static final int TRANSACTION_hasBackupPassword = 16;
        static final int TRANSACTION_backupNowForUser = 17;
        static final int TRANSACTION_backupNow = 18;
        static final int TRANSACTION_adbBackup = 19;
        static final int TRANSACTION_fullTransportBackupForUser = 20;
        static final int TRANSACTION_adbRestore = 21;
        static final int TRANSACTION_acknowledgeFullBackupOrRestoreForUser = 22;
        static final int TRANSACTION_acknowledgeFullBackupOrRestore = 23;
        static final int TRANSACTION_updateTransportAttributesForUser = 24;
        static final int TRANSACTION_getCurrentTransportForUser = 25;
        static final int TRANSACTION_getCurrentTransport = 26;
        static final int TRANSACTION_getCurrentTransportComponentForUser = 27;
        static final int TRANSACTION_listAllTransportsForUser = 28;
        static final int TRANSACTION_listAllTransports = 29;
        static final int TRANSACTION_listAllTransportComponentsForUser = 30;
        static final int TRANSACTION_getTransportWhitelist = 31;
        static final int TRANSACTION_selectBackupTransportForUser = 32;
        static final int TRANSACTION_selectBackupTransport = 33;
        static final int TRANSACTION_selectBackupTransportAsyncForUser = 34;
        static final int TRANSACTION_getConfigurationIntentForUser = 35;
        static final int TRANSACTION_getConfigurationIntent = 36;
        static final int TRANSACTION_getDestinationStringForUser = 37;
        static final int TRANSACTION_getDestinationString = 38;
        static final int TRANSACTION_getDataManagementIntentForUser = 39;
        static final int TRANSACTION_getDataManagementIntent = 40;
        static final int TRANSACTION_getDataManagementLabelForUser = 41;
        static final int TRANSACTION_beginRestoreSessionForUser = 42;
        static final int TRANSACTION_opCompleteForUser = 43;
        static final int TRANSACTION_opComplete = 44;
        static final int TRANSACTION_setBackupServiceActive = 45;
        static final int TRANSACTION_isBackupServiceActive = 46;
        static final int TRANSACTION_isUserReadyForBackup = 47;
        static final int TRANSACTION_getAvailableRestoreTokenForUser = 48;
        static final int TRANSACTION_isAppEligibleForBackupForUser = 49;
        static final int TRANSACTION_filterAppsEligibleForBackupForUser = 50;
        static final int TRANSACTION_requestBackupForUser = 51;
        static final int TRANSACTION_requestBackup = 52;
        static final int TRANSACTION_cancelBackupsForUser = 53;
        static final int TRANSACTION_cancelBackups = 54;
        static final int TRANSACTION_getUserForAncestralSerialNumber = 55;
        static final int TRANSACTION_setAncestralSerialNumber = 56;
        static final int TRANSACTION_excludeKeysFromRestore = 57;
        static final int TRANSACTION_reportDelayedRestoreResult = 58;
        public Stub() { super(); }
        public static android.app.backup.IBackupManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.backup.IBackupManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dataChangedForUser(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void dataChanged(java.lang.String p0) throws android.os.RemoteException {}
            public void clearBackupDataForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void clearBackupData(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void initializeTransportsForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2) throws android.os.RemoteException {}
            public void restoreAtInstallForUser(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void restoreAtInstall(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setBackupEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public void setFrameworkSchedulingEnabledForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public void setBackupEnabled(boolean p0) throws android.os.RemoteException {}
            public void setAutoRestoreForUser(int p0, boolean p1) throws android.os.RemoteException {}
            public void setAutoRestore(boolean p0) throws android.os.RemoteException {}
            public boolean isBackupEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isBackupEnabled() throws android.os.RemoteException { return false; }
            public boolean setBackupPassword(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasBackupPassword() throws android.os.RemoteException { return false; }
            public void backupNowForUser(int p0) throws android.os.RemoteException {}
            public void backupNow() throws android.os.RemoteException {}
            public void adbBackup(int p0, android.os.ParcelFileDescriptor p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9, java.lang.String[] p10) throws android.os.RemoteException {}
            public void fullTransportBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void adbRestore(int p0, android.os.ParcelFileDescriptor p1) throws android.os.RemoteException {}
            public void acknowledgeFullBackupOrRestoreForUser(int p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, android.app.backup.IFullBackupRestoreObserver p5) throws android.os.RemoteException {}
            public void acknowledgeFullBackupOrRestore(int p0, boolean p1, java.lang.String p2, java.lang.String p3, android.app.backup.IFullBackupRestoreObserver p4) throws android.os.RemoteException {}
            public void updateTransportAttributesForUser(int p0, android.content.ComponentName p1, java.lang.String p2, android.content.Intent p3, java.lang.String p4, android.content.Intent p5, java.lang.CharSequence p6) throws android.os.RemoteException {}
            public java.lang.String getCurrentTransportForUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCurrentTransport() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getCurrentTransportComponentForUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] listAllTransportsForUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] listAllTransports() throws android.os.RemoteException { return null; }
            public android.content.ComponentName[] listAllTransportComponentsForUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getTransportWhitelist() throws android.os.RemoteException { return null; }
            public java.lang.String selectBackupTransportForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String selectBackupTransport(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void selectBackupTransportAsyncForUser(int p0, android.content.ComponentName p1, android.app.backup.ISelectBackupTransportCallback p2) throws android.os.RemoteException {}
            public android.content.Intent getConfigurationIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.Intent getConfigurationIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDestinationStringForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.String getDestinationString(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.Intent getDataManagementIntentForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.Intent getDataManagementIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getDataManagementLabelForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.app.backup.IRestoreSession beginRestoreSessionForUser(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void opCompleteForUser(int p0, int p1, long p2) throws android.os.RemoteException {}
            public void opComplete(int p0, long p1) throws android.os.RemoteException {}
            public void setBackupServiceActive(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean isBackupServiceActive(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserReadyForBackup(int p0) throws android.os.RemoteException { return false; }
            public long getAvailableRestoreTokenForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public boolean isAppEligibleForBackupForUser(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String[] filterAppsEligibleForBackupForUser(int p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public int requestBackupForUser(int p0, java.lang.String[] p1, android.app.backup.IBackupObserver p2, android.app.backup.IBackupManagerMonitor p3, int p4) throws android.os.RemoteException { return 0; }
            public int requestBackup(java.lang.String[] p0, android.app.backup.IBackupObserver p1, android.app.backup.IBackupManagerMonitor p2, int p3) throws android.os.RemoteException { return 0; }
            public void cancelBackupsForUser(int p0) throws android.os.RemoteException {}
            public void cancelBackups() throws android.os.RemoteException {}
            public android.os.UserHandle getUserForAncestralSerialNumber(long p0) throws android.os.RemoteException { return null; }
            public void setAncestralSerialNumber(long p0) throws android.os.RemoteException {}
            public void excludeKeysFromRestore(java.lang.String p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void reportDelayedRestoreResult(java.lang.String p0, java.util.List<android.app.backup.BackupRestoreEventLogger.DataTypeResult> p1) throws android.os.RemoteException {}
        }
    }
}
