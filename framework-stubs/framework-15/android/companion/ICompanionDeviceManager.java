package android.companion;

public interface ICompanionDeviceManager extends android.os.IInterface {
    public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_COMPANION_DEVICES")
    public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void disassociate(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_COMPANION_DEVICES")
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_OBSERVE_COMPANION_DEVICE_PRESENCE")
    public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ASSOCIATE_COMPANION_DEVICES")
    public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_COMPANION_TRANSPORTS")
    public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_COMPANION_TRANSPORTS")
    public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_COMPANION_TRANSPORTS")
    public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_COMPANION_TRANSPORTS")
    public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.USE_COMPANION_TRANSPORTS")
    public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.REQUEST_COMPANION_SELF_MANAGED")
    public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException;
    public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DELIVER_COMPANION_MESSAGES")
    public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public void enablePermissionsSync(int p0) throws android.os.RemoteException;
    public void disablePermissionsSync(int p0) throws android.os.RemoteException;
    public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void enableSecureTransport(boolean p0) throws android.os.RemoteException;
    public void setAssociationTag(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearAssociationTag(int p0) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH_CONNECT")
    public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceManager {
        public Default() {}
        public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
        public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void disassociate(int p0) throws android.os.RemoteException {}
        public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
        public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException {}
        public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException {}
        public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
        public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public void enablePermissionsSync(int p0) throws android.os.RemoteException {}
        public void disablePermissionsSync(int p0) throws android.os.RemoteException {}
        public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException { return null; }
        public void enableSecureTransport(boolean p0) throws android.os.RemoteException {}
        public void setAssociationTag(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearAssociationTag(int p0) throws android.os.RemoteException {}
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException {}
        public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceManager {
        public static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceManager";
        static final int TRANSACTION_associate = 1;
        static final int TRANSACTION_getAssociations = 2;
        static final int TRANSACTION_getAllAssociationsForUser = 3;
        static final int TRANSACTION_legacyDisassociate = 4;
        static final int TRANSACTION_disassociate = 5;
        static final int TRANSACTION_hasNotificationAccess = 6;
        static final int TRANSACTION_requestNotificationAccess = 7;
        static final int TRANSACTION_isDeviceAssociatedForWifiConnection = 8;
        static final int TRANSACTION_legacyStartObservingDevicePresence = 9;
        static final int TRANSACTION_legacyStopObservingDevicePresence = 10;
        static final int TRANSACTION_startObservingDevicePresence = 11;
        static final int TRANSACTION_stopObservingDevicePresence = 12;
        static final int TRANSACTION_canPairWithoutPrompt = 13;
        static final int TRANSACTION_createAssociation = 14;
        static final int TRANSACTION_addOnAssociationsChangedListener = 15;
        static final int TRANSACTION_removeOnAssociationsChangedListener = 16;
        static final int TRANSACTION_addOnTransportsChangedListener = 17;
        static final int TRANSACTION_removeOnTransportsChangedListener = 18;
        static final int TRANSACTION_sendMessage = 19;
        static final int TRANSACTION_addOnMessageReceivedListener = 20;
        static final int TRANSACTION_removeOnMessageReceivedListener = 21;
        static final int TRANSACTION_notifySelfManagedDeviceAppeared = 22;
        static final int TRANSACTION_notifySelfManagedDeviceDisappeared = 23;
        static final int TRANSACTION_buildPermissionTransferUserConsentIntent = 24;
        static final int TRANSACTION_isPermissionTransferUserConsented = 25;
        static final int TRANSACTION_startSystemDataTransfer = 26;
        static final int TRANSACTION_attachSystemDataTransport = 27;
        static final int TRANSACTION_detachSystemDataTransport = 28;
        static final int TRANSACTION_isCompanionApplicationBound = 29;
        static final int TRANSACTION_buildAssociationCancellationIntent = 30;
        static final int TRANSACTION_enableSystemDataSync = 31;
        static final int TRANSACTION_disableSystemDataSync = 32;
        static final int TRANSACTION_enablePermissionsSync = 33;
        static final int TRANSACTION_disablePermissionsSync = 34;
        static final int TRANSACTION_getPermissionSyncRequest = 35;
        static final int TRANSACTION_enableSecureTransport = 36;
        static final int TRANSACTION_setAssociationTag = 37;
        static final int TRANSACTION_clearAssociationTag = 38;
        static final int TRANSACTION_getBackupPayload = 39;
        static final int TRANSACTION_applyRestoredPayload = 40;
        static final int TRANSACTION_removeBond = 41;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getAllAssociationsForUser_enforcePermission() throws java.lang.SecurityException {}
        protected void isDeviceAssociatedForWifiConnection_enforcePermission() throws java.lang.SecurityException {}
        protected void legacyStartObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void legacyStopObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void startObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void stopObservingDevicePresence_enforcePermission() throws java.lang.SecurityException {}
        protected void createAssociation_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnAssociationsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnAssociationsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnTransportsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnTransportsChangedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void sendMessage_enforcePermission() throws java.lang.SecurityException {}
        protected void addOnMessageReceivedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void removeOnMessageReceivedListener_enforcePermission() throws java.lang.SecurityException {}
        protected void notifySelfManagedDeviceAppeared_enforcePermission() throws java.lang.SecurityException {}
        protected void notifySelfManagedDeviceDisappeared_enforcePermission() throws java.lang.SecurityException {}
        protected void attachSystemDataTransport_enforcePermission() throws java.lang.SecurityException {}
        protected void detachSystemDataTransport_enforcePermission() throws java.lang.SecurityException {}
        protected void enableSecureTransport_enforcePermission() throws java.lang.SecurityException {}
        protected void removeBond_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.ICompanionDeviceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException { return null; }
            public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void disassociate(int p0) throws android.os.RemoteException {}
            public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void legacyStartObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void legacyStopObservingDevicePresence(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void startObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void stopObservingDevicePresence(android.companion.ObservingDevicePresenceRequest p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
            public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void notifySelfManagedDeviceAppeared(int p0) throws android.os.RemoteException {}
            public void notifySelfManagedDeviceDisappeared(int p0) throws android.os.RemoteException {}
            public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public boolean isPermissionTransferUserConsented(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
            public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public void enablePermissionsSync(int p0) throws android.os.RemoteException {}
            public void disablePermissionsSync(int p0) throws android.os.RemoteException {}
            public android.companion.datatransfer.PermissionSyncRequest getPermissionSyncRequest(int p0) throws android.os.RemoteException { return null; }
            public void enableSecureTransport(boolean p0) throws android.os.RemoteException {}
            public void setAssociationTag(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearAssociationTag(int p0) throws android.os.RemoteException {}
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public void applyRestoredPayload(byte[] p0, int p1) throws android.os.RemoteException {}
            public boolean removeBond(int p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        }
    }
}
