package android.content;

public interface IContentService extends android.os.IInterface {
    public void unregisterContentObserver(android.database.IContentObserver p0) throws android.os.RemoteException;
    public void registerContentObserver(android.net.Uri p0, boolean p1, android.database.IContentObserver p2, int p3, int p4) throws android.os.RemoteException;
    public void notifyChange(android.net.Uri[] p0, android.database.IContentObserver p1, boolean p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException;
    public void requestSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException;
    public void sync(android.content.SyncRequest p0, java.lang.String p1) throws android.os.RemoteException;
    public void syncAsUser(android.content.SyncRequest p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void cancelSync(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void cancelSyncAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException;
    public void cancelRequest(android.content.SyncRequest p0) throws android.os.RemoteException;
    public boolean getSyncAutomatically(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean getSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setSyncAutomatically(android.accounts.Account p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.content.PeriodicSync> getPeriodicSyncs(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void addPeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3) throws android.os.RemoteException;
    public void removePeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public int getIsSyncable(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException;
    public int getIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setIsSyncable(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void setMasterSyncAutomatically(boolean p0) throws android.os.RemoteException;
    public void setMasterSyncAutomaticallyAsUser(boolean p0, int p1) throws android.os.RemoteException;
    public boolean getMasterSyncAutomatically() throws android.os.RemoteException;
    public boolean getMasterSyncAutomaticallyAsUser(int p0) throws android.os.RemoteException;
    public java.util.List<android.content.SyncInfo> getCurrentSyncs() throws android.os.RemoteException;
    public java.util.List<android.content.SyncInfo> getCurrentSyncsAsUser(int p0) throws android.os.RemoteException;
    public android.content.SyncAdapterType[] getSyncAdapterTypes() throws android.os.RemoteException;
    public android.content.SyncAdapterType[] getSyncAdapterTypesAsUser(int p0) throws android.os.RemoteException;
    public java.lang.String[] getSyncAdapterPackagesForAuthorityAsUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.lang.String getSyncAdapterPackageAsUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_SYNC_STATS")
    public boolean isSyncActive(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public android.content.SyncStatusInfo getSyncStatus(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public android.content.SyncStatusInfo getSyncStatusAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException;
    public boolean isSyncPending(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_SYNC_STATS")
    public boolean isSyncPendingAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException;
    public void addStatusChangeListener(int p0, android.content.ISyncStatusObserver p1) throws android.os.RemoteException;
    public void removeStatusChangeListener(android.content.ISyncStatusObserver p0) throws android.os.RemoteException;
    public void putCache(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public android.os.Bundle getCache(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void resetTodayStats() throws android.os.RemoteException;
    public void onDbCorruption(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.content.IContentService {
        public Default() {}
        public void unregisterContentObserver(android.database.IContentObserver p0) throws android.os.RemoteException {}
        public void registerContentObserver(android.net.Uri p0, boolean p1, android.database.IContentObserver p2, int p3, int p4) throws android.os.RemoteException {}
        public void notifyChange(android.net.Uri[] p0, android.database.IContentObserver p1, boolean p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException {}
        public void requestSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException {}
        public void sync(android.content.SyncRequest p0, java.lang.String p1) throws android.os.RemoteException {}
        public void syncAsUser(android.content.SyncRequest p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void cancelSync(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException {}
        public void cancelSyncAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException {}
        public void cancelRequest(android.content.SyncRequest p0) throws android.os.RemoteException {}
        public boolean getSyncAutomatically(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean getSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setSyncAutomatically(android.accounts.Account p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException {}
        public java.util.List<android.content.PeriodicSync> getPeriodicSyncs(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return null; }
        public void addPeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3) throws android.os.RemoteException {}
        public void removePeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public int getIsSyncable(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void setIsSyncable(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public void setMasterSyncAutomatically(boolean p0) throws android.os.RemoteException {}
        public void setMasterSyncAutomaticallyAsUser(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean getMasterSyncAutomatically() throws android.os.RemoteException { return false; }
        public boolean getMasterSyncAutomaticallyAsUser(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.content.SyncInfo> getCurrentSyncs() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.SyncInfo> getCurrentSyncsAsUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.SyncAdapterType[] getSyncAdapterTypes() throws android.os.RemoteException { return null; }
        public android.content.SyncAdapterType[] getSyncAdapterTypesAsUser(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getSyncAdapterPackagesForAuthorityAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.String getSyncAdapterPackageAsUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public boolean isSyncActive(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return false; }
        public android.content.SyncStatusInfo getSyncStatus(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return null; }
        public android.content.SyncStatusInfo getSyncStatusAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException { return null; }
        public boolean isSyncPending(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return false; }
        public boolean isSyncPendingAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException { return false; }
        public void addStatusChangeListener(int p0, android.content.ISyncStatusObserver p1) throws android.os.RemoteException {}
        public void removeStatusChangeListener(android.content.ISyncStatusObserver p0) throws android.os.RemoteException {}
        public void putCache(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public android.os.Bundle getCache(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException { return null; }
        public void resetTodayStats() throws android.os.RemoteException {}
        public void onDbCorruption(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.IContentService {
        public static final java.lang.String DESCRIPTOR = "android.content.IContentService";
        static final int TRANSACTION_unregisterContentObserver = 1;
        static final int TRANSACTION_registerContentObserver = 2;
        static final int TRANSACTION_notifyChange = 3;
        static final int TRANSACTION_requestSync = 4;
        static final int TRANSACTION_sync = 5;
        static final int TRANSACTION_syncAsUser = 6;
        static final int TRANSACTION_cancelSync = 7;
        static final int TRANSACTION_cancelSyncAsUser = 8;
        static final int TRANSACTION_cancelRequest = 9;
        static final int TRANSACTION_getSyncAutomatically = 10;
        static final int TRANSACTION_getSyncAutomaticallyAsUser = 11;
        static final int TRANSACTION_setSyncAutomatically = 12;
        static final int TRANSACTION_setSyncAutomaticallyAsUser = 13;
        static final int TRANSACTION_getPeriodicSyncs = 14;
        static final int TRANSACTION_addPeriodicSync = 15;
        static final int TRANSACTION_removePeriodicSync = 16;
        static final int TRANSACTION_getIsSyncable = 17;
        static final int TRANSACTION_getIsSyncableAsUser = 18;
        static final int TRANSACTION_setIsSyncable = 19;
        static final int TRANSACTION_setIsSyncableAsUser = 20;
        static final int TRANSACTION_setMasterSyncAutomatically = 21;
        static final int TRANSACTION_setMasterSyncAutomaticallyAsUser = 22;
        static final int TRANSACTION_getMasterSyncAutomatically = 23;
        static final int TRANSACTION_getMasterSyncAutomaticallyAsUser = 24;
        static final int TRANSACTION_getCurrentSyncs = 25;
        static final int TRANSACTION_getCurrentSyncsAsUser = 26;
        static final int TRANSACTION_getSyncAdapterTypes = 27;
        static final int TRANSACTION_getSyncAdapterTypesAsUser = 28;
        static final int TRANSACTION_getSyncAdapterPackagesForAuthorityAsUser = 29;
        static final int TRANSACTION_getSyncAdapterPackageAsUser = 30;
        static final int TRANSACTION_isSyncActive = 31;
        static final int TRANSACTION_getSyncStatus = 32;
        static final int TRANSACTION_getSyncStatusAsUser = 33;
        static final int TRANSACTION_isSyncPending = 34;
        static final int TRANSACTION_isSyncPendingAsUser = 35;
        static final int TRANSACTION_addStatusChangeListener = 36;
        static final int TRANSACTION_removeStatusChangeListener = 37;
        static final int TRANSACTION_putCache = 38;
        static final int TRANSACTION_getCache = 39;
        static final int TRANSACTION_resetTodayStats = 40;
        static final int TRANSACTION_onDbCorruption = 41;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.content.IContentService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void isSyncActive_enforcePermission() throws java.lang.SecurityException {}
        protected void isSyncPendingAsUser_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.IContentService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void unregisterContentObserver(android.database.IContentObserver p0) throws android.os.RemoteException {}
            public void registerContentObserver(android.net.Uri p0, boolean p1, android.database.IContentObserver p2, int p3, int p4) throws android.os.RemoteException {}
            public void notifyChange(android.net.Uri[] p0, android.database.IContentObserver p1, boolean p2, int p3, int p4, int p5, java.lang.String p6) throws android.os.RemoteException {}
            public void requestSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, java.lang.String p3) throws android.os.RemoteException {}
            public void sync(android.content.SyncRequest p0, java.lang.String p1) throws android.os.RemoteException {}
            public void syncAsUser(android.content.SyncRequest p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void cancelSync(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException {}
            public void cancelSyncAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException {}
            public void cancelRequest(android.content.SyncRequest p0) throws android.os.RemoteException {}
            public boolean getSyncAutomatically(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean getSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setSyncAutomatically(android.accounts.Account p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setSyncAutomaticallyAsUser(android.accounts.Account p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException {}
            public java.util.List<android.content.PeriodicSync> getPeriodicSyncs(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return null; }
            public void addPeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3) throws android.os.RemoteException {}
            public void removePeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public int getIsSyncable(android.accounts.Account p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void setIsSyncable(android.accounts.Account p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setIsSyncableAsUser(android.accounts.Account p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public void setMasterSyncAutomatically(boolean p0) throws android.os.RemoteException {}
            public void setMasterSyncAutomaticallyAsUser(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean getMasterSyncAutomatically() throws android.os.RemoteException { return false; }
            public boolean getMasterSyncAutomaticallyAsUser(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.content.SyncInfo> getCurrentSyncs() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.SyncInfo> getCurrentSyncsAsUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.SyncAdapterType[] getSyncAdapterTypes() throws android.os.RemoteException { return null; }
            public android.content.SyncAdapterType[] getSyncAdapterTypesAsUser(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getSyncAdapterPackagesForAuthorityAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.String getSyncAdapterPackageAsUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public boolean isSyncActive(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return false; }
            public android.content.SyncStatusInfo getSyncStatus(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return null; }
            public android.content.SyncStatusInfo getSyncStatusAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException { return null; }
            public boolean isSyncPending(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2) throws android.os.RemoteException { return false; }
            public boolean isSyncPendingAsUser(android.accounts.Account p0, java.lang.String p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException { return false; }
            public void addStatusChangeListener(int p0, android.content.ISyncStatusObserver p1) throws android.os.RemoteException {}
            public void removeStatusChangeListener(android.content.ISyncStatusObserver p0) throws android.os.RemoteException {}
            public void putCache(java.lang.String p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public android.os.Bundle getCache(java.lang.String p0, android.net.Uri p1, int p2) throws android.os.RemoteException { return null; }
            public void resetTodayStats() throws android.os.RemoteException {}
            public void onDbCorruption(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}
