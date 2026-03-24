package com.android.internal.backup;

public interface IBackupTransport extends android.os.IInterface {
    public void name(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException;
    public void configurationIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException;
    public void currentDestinationString(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException;
    public void dataManagementIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException;
    public void dataManagementIntentLabel(com.android.internal.infra.AndroidFuture<java.lang.CharSequence> p0) throws android.os.RemoteException;
    public void transportDirName(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException;
    public void requestBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException;
    public void initializeDevice(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException;
    public void performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException;
    public void clearBackupData(android.content.pm.PackageInfo p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException;
    public void finishBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException;
    public void getAvailableRestoreSets(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.RestoreSet>> p0) throws android.os.RemoteException;
    public void getCurrentRestoreSet(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException;
    public void startRestore(long p0, android.content.pm.PackageInfo[] p1, com.android.internal.backup.ITransportStatusCallback p2) throws android.os.RemoteException;
    public void nextRestorePackage(com.android.internal.infra.AndroidFuture<android.app.backup.RestoreDescription> p0) throws android.os.RemoteException;
    public void getRestoreData(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException;
    public void finishRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException;
    public void requestFullBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException;
    public void performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException;
    public void checkFullBackupSize(long p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException;
    public void sendBackupData(int p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException;
    public void cancelFullBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException;
    public void isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p2) throws android.os.RemoteException;
    public void getBackupQuota(java.lang.String p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Long> p2) throws android.os.RemoteException;
    public void getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException;
    public void abortFullRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException;
    public void getTransportFlags(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException;
    public void getBackupManagerMonitor(com.android.internal.infra.AndroidFuture<android.app.backup.IBackupManagerMonitor> p0) throws android.os.RemoteException;
    public void getPackagesThatShouldNotUseRestrictedMode(java.util.List<java.lang.String> p0, int p1, com.android.internal.infra.AndroidFuture<java.util.List<java.lang.String>> p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.backup.IBackupTransport {
        public Default() {}
        public void name(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void configurationIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
        public void currentDestinationString(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void dataManagementIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
        public void dataManagementIntentLabel(com.android.internal.infra.AndroidFuture<java.lang.CharSequence> p0) throws android.os.RemoteException {}
        public void transportDirName(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
        public void requestBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void initializeDevice(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
        public void clearBackupData(android.content.pm.PackageInfo p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void finishBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void getAvailableRestoreSets(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.RestoreSet>> p0) throws android.os.RemoteException {}
        public void getCurrentRestoreSet(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void startRestore(long p0, android.content.pm.PackageInfo[] p1, com.android.internal.backup.ITransportStatusCallback p2) throws android.os.RemoteException {}
        public void nextRestorePackage(com.android.internal.infra.AndroidFuture<android.app.backup.RestoreDescription> p0) throws android.os.RemoteException {}
        public void getRestoreData(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void finishRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void requestFullBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
        public void performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
        public void checkFullBackupSize(long p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void sendBackupData(int p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void cancelFullBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p2) throws android.os.RemoteException {}
        public void getBackupQuota(java.lang.String p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Long> p2) throws android.os.RemoteException {}
        public void getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
        public void abortFullRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
        public void getTransportFlags(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException {}
        public void getBackupManagerMonitor(com.android.internal.infra.AndroidFuture<android.app.backup.IBackupManagerMonitor> p0) throws android.os.RemoteException {}
        public void getPackagesThatShouldNotUseRestrictedMode(java.util.List<java.lang.String> p0, int p1, com.android.internal.infra.AndroidFuture<java.util.List<java.lang.String>> p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IBackupTransport {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IBackupTransport";
        static final int TRANSACTION_name = 1;
        static final int TRANSACTION_configurationIntent = 2;
        static final int TRANSACTION_currentDestinationString = 3;
        static final int TRANSACTION_dataManagementIntent = 4;
        static final int TRANSACTION_dataManagementIntentLabel = 5;
        static final int TRANSACTION_transportDirName = 6;
        static final int TRANSACTION_requestBackupTime = 7;
        static final int TRANSACTION_initializeDevice = 8;
        static final int TRANSACTION_performBackup = 9;
        static final int TRANSACTION_clearBackupData = 10;
        static final int TRANSACTION_finishBackup = 11;
        static final int TRANSACTION_getAvailableRestoreSets = 12;
        static final int TRANSACTION_getCurrentRestoreSet = 13;
        static final int TRANSACTION_startRestore = 14;
        static final int TRANSACTION_nextRestorePackage = 15;
        static final int TRANSACTION_getRestoreData = 16;
        static final int TRANSACTION_finishRestore = 17;
        static final int TRANSACTION_requestFullBackupTime = 18;
        static final int TRANSACTION_performFullBackup = 19;
        static final int TRANSACTION_checkFullBackupSize = 20;
        static final int TRANSACTION_sendBackupData = 21;
        static final int TRANSACTION_cancelFullBackup = 22;
        static final int TRANSACTION_isAppEligibleForBackup = 23;
        static final int TRANSACTION_getBackupQuota = 24;
        static final int TRANSACTION_getNextFullRestoreDataChunk = 25;
        static final int TRANSACTION_abortFullRestore = 26;
        static final int TRANSACTION_getTransportFlags = 27;
        static final int TRANSACTION_getBackupManagerMonitor = 28;
        static final int TRANSACTION_getPackagesThatShouldNotUseRestrictedMode = 29;
        public Stub() { super(); }
        public static com.android.internal.backup.IBackupTransport asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.backup.IBackupTransport {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void name(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
            public void configurationIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
            public void currentDestinationString(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
            public void dataManagementIntent(com.android.internal.infra.AndroidFuture<android.content.Intent> p0) throws android.os.RemoteException {}
            public void dataManagementIntentLabel(com.android.internal.infra.AndroidFuture<java.lang.CharSequence> p0) throws android.os.RemoteException {}
            public void transportDirName(com.android.internal.infra.AndroidFuture<java.lang.String> p0) throws android.os.RemoteException {}
            public void requestBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
            public void initializeDevice(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
            public void performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
            public void clearBackupData(android.content.pm.PackageInfo p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
            public void finishBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
            public void getAvailableRestoreSets(com.android.internal.infra.AndroidFuture<java.util.List<android.app.backup.RestoreSet>> p0) throws android.os.RemoteException {}
            public void getCurrentRestoreSet(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
            public void startRestore(long p0, android.content.pm.PackageInfo[] p1, com.android.internal.backup.ITransportStatusCallback p2) throws android.os.RemoteException {}
            public void nextRestorePackage(com.android.internal.infra.AndroidFuture<android.app.backup.RestoreDescription> p0) throws android.os.RemoteException {}
            public void getRestoreData(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
            public void finishRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
            public void requestFullBackupTime(com.android.internal.infra.AndroidFuture<java.lang.Long> p0) throws android.os.RemoteException {}
            public void performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2, com.android.internal.backup.ITransportStatusCallback p3) throws android.os.RemoteException {}
            public void checkFullBackupSize(long p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
            public void sendBackupData(int p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
            public void cancelFullBackup(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
            public void isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p2) throws android.os.RemoteException {}
            public void getBackupQuota(java.lang.String p0, boolean p1, com.android.internal.infra.AndroidFuture<java.lang.Long> p2) throws android.os.RemoteException {}
            public void getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0, com.android.internal.backup.ITransportStatusCallback p1) throws android.os.RemoteException {}
            public void abortFullRestore(com.android.internal.backup.ITransportStatusCallback p0) throws android.os.RemoteException {}
            public void getTransportFlags(com.android.internal.infra.AndroidFuture<java.lang.Integer> p0) throws android.os.RemoteException {}
            public void getBackupManagerMonitor(com.android.internal.infra.AndroidFuture<android.app.backup.IBackupManagerMonitor> p0) throws android.os.RemoteException {}
            public void getPackagesThatShouldNotUseRestrictedMode(java.util.List<java.lang.String> p0, int p1, com.android.internal.infra.AndroidFuture<java.util.List<java.lang.String>> p2) throws android.os.RemoteException {}
        }
    }
}
