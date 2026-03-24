package com.android.internal.backup;

public interface IBackupTransport extends android.os.IInterface {
    public java.lang.String name() throws android.os.RemoteException;
    public android.content.Intent configurationIntent() throws android.os.RemoteException;
    public java.lang.String currentDestinationString() throws android.os.RemoteException;
    public android.content.Intent dataManagementIntent() throws android.os.RemoteException;
    public java.lang.CharSequence dataManagementIntentLabel() throws android.os.RemoteException;
    public java.lang.String transportDirName() throws android.os.RemoteException;
    public long requestBackupTime() throws android.os.RemoteException;
    public int initializeDevice() throws android.os.RemoteException;
    public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException;
    public int clearBackupData(android.content.pm.PackageInfo p0) throws android.os.RemoteException;
    public int finishBackup() throws android.os.RemoteException;
    public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException;
    public long getCurrentRestoreSet() throws android.os.RemoteException;
    public int startRestore(long p0, android.content.pm.PackageInfo[] p1) throws android.os.RemoteException;
    public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException;
    public int getRestoreData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void finishRestore() throws android.os.RemoteException;
    public long requestFullBackupTime() throws android.os.RemoteException;
    public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException;
    public int checkFullBackupSize(long p0) throws android.os.RemoteException;
    public int sendBackupData(int p0) throws android.os.RemoteException;
    public void cancelFullBackup() throws android.os.RemoteException;
    public boolean isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1) throws android.os.RemoteException;
    public long getBackupQuota(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public int abortFullRestore() throws android.os.RemoteException;
    public int getTransportFlags() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.IBackupTransport {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.backup.IBackupTransport";
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
        public Stub() { super(); }
        public static com.android.internal.backup.IBackupTransport asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.backup.IBackupTransport p0) { return false; }
        public static com.android.internal.backup.IBackupTransport getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.backup.IBackupTransport {
            private android.os.IBinder mRemote;
            public static com.android.internal.backup.IBackupTransport sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String name() throws android.os.RemoteException { return null; }
            public android.content.Intent configurationIntent() throws android.os.RemoteException { return null; }
            public java.lang.String currentDestinationString() throws android.os.RemoteException { return null; }
            public android.content.Intent dataManagementIntent() throws android.os.RemoteException { return null; }
            public java.lang.CharSequence dataManagementIntentLabel() throws android.os.RemoteException { return null; }
            public java.lang.String transportDirName() throws android.os.RemoteException { return null; }
            public long requestBackupTime() throws android.os.RemoteException { return 0L; }
            public int initializeDevice() throws android.os.RemoteException { return 0; }
            public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
            public int clearBackupData(android.content.pm.PackageInfo p0) throws android.os.RemoteException { return 0; }
            public int finishBackup() throws android.os.RemoteException { return 0; }
            public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException { return null; }
            public long getCurrentRestoreSet() throws android.os.RemoteException { return 0L; }
            public int startRestore(long p0, android.content.pm.PackageInfo[] p1) throws android.os.RemoteException { return 0; }
            public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException { return null; }
            public int getRestoreData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
            public void finishRestore() throws android.os.RemoteException {}
            public long requestFullBackupTime() throws android.os.RemoteException { return 0L; }
            public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
            public int checkFullBackupSize(long p0) throws android.os.RemoteException { return 0; }
            public int sendBackupData(int p0) throws android.os.RemoteException { return 0; }
            public void cancelFullBackup() throws android.os.RemoteException {}
            public boolean isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1) throws android.os.RemoteException { return false; }
            public long getBackupQuota(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0L; }
            public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
            public int abortFullRestore() throws android.os.RemoteException { return 0; }
            public int getTransportFlags() throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements com.android.internal.backup.IBackupTransport {
        public Default() {}
        public java.lang.String name() throws android.os.RemoteException { return null; }
        public android.content.Intent configurationIntent() throws android.os.RemoteException { return null; }
        public java.lang.String currentDestinationString() throws android.os.RemoteException { return null; }
        public android.content.Intent dataManagementIntent() throws android.os.RemoteException { return null; }
        public java.lang.CharSequence dataManagementIntentLabel() throws android.os.RemoteException { return null; }
        public java.lang.String transportDirName() throws android.os.RemoteException { return null; }
        public long requestBackupTime() throws android.os.RemoteException { return 0L; }
        public int initializeDevice() throws android.os.RemoteException { return 0; }
        public int performBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
        public int clearBackupData(android.content.pm.PackageInfo p0) throws android.os.RemoteException { return 0; }
        public int finishBackup() throws android.os.RemoteException { return 0; }
        public android.app.backup.RestoreSet[] getAvailableRestoreSets() throws android.os.RemoteException { return null; }
        public long getCurrentRestoreSet() throws android.os.RemoteException { return 0L; }
        public int startRestore(long p0, android.content.pm.PackageInfo[] p1) throws android.os.RemoteException { return 0; }
        public android.app.backup.RestoreDescription nextRestorePackage() throws android.os.RemoteException { return null; }
        public int getRestoreData(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
        public void finishRestore() throws android.os.RemoteException {}
        public long requestFullBackupTime() throws android.os.RemoteException { return 0L; }
        public int performFullBackup(android.content.pm.PackageInfo p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
        public int checkFullBackupSize(long p0) throws android.os.RemoteException { return 0; }
        public int sendBackupData(int p0) throws android.os.RemoteException { return 0; }
        public void cancelFullBackup() throws android.os.RemoteException {}
        public boolean isAppEligibleForBackup(android.content.pm.PackageInfo p0, boolean p1) throws android.os.RemoteException { return false; }
        public long getBackupQuota(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0L; }
        public int getNextFullRestoreDataChunk(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException { return 0; }
        public int abortFullRestore() throws android.os.RemoteException { return 0; }
        public int getTransportFlags() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
