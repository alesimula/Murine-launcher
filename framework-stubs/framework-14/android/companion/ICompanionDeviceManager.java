package android.companion;

public interface ICompanionDeviceManager extends android.os.IInterface {
    public void associate(android.companion.AssociationRequest p0, android.companion.IAssociationRequestCallback p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.companion.AssociationInfo> getAllAssociationsForUser(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void legacyDisassociate(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void disassociate(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void registerDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void unregisterDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException;
    public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException;
    public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException;
    public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException;
    public void notifyDeviceAppeared(int p0) throws android.os.RemoteException;
    public void notifyDeviceDisappeared(int p0) throws android.os.RemoteException;
    public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException;
    public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException;
    public void enableSecureTransport(boolean p0) throws android.os.RemoteException;

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
        public void registerDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void unregisterDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
        public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
        public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
        public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
        public void notifyDeviceAppeared(int p0) throws android.os.RemoteException {}
        public void notifyDeviceDisappeared(int p0) throws android.os.RemoteException {}
        public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
        public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
        public void enableSecureTransport(boolean p0) throws android.os.RemoteException {}
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
        static final int TRANSACTION_registerDevicePresenceListenerService = 9;
        static final int TRANSACTION_unregisterDevicePresenceListenerService = 10;
        static final int TRANSACTION_canPairWithoutPrompt = 11;
        static final int TRANSACTION_createAssociation = 12;
        static final int TRANSACTION_addOnAssociationsChangedListener = 13;
        static final int TRANSACTION_removeOnAssociationsChangedListener = 14;
        static final int TRANSACTION_addOnTransportsChangedListener = 15;
        static final int TRANSACTION_removeOnTransportsChangedListener = 16;
        static final int TRANSACTION_sendMessage = 17;
        static final int TRANSACTION_addOnMessageReceivedListener = 18;
        static final int TRANSACTION_removeOnMessageReceivedListener = 19;
        static final int TRANSACTION_notifyDeviceAppeared = 20;
        static final int TRANSACTION_notifyDeviceDisappeared = 21;
        static final int TRANSACTION_buildPermissionTransferUserConsentIntent = 22;
        static final int TRANSACTION_startSystemDataTransfer = 23;
        static final int TRANSACTION_attachSystemDataTransport = 24;
        static final int TRANSACTION_detachSystemDataTransport = 25;
        static final int TRANSACTION_isCompanionApplicationBound = 26;
        static final int TRANSACTION_buildAssociationCancellationIntent = 27;
        static final int TRANSACTION_enableSystemDataSync = 28;
        static final int TRANSACTION_disableSystemDataSync = 29;
        static final int TRANSACTION_enableSecureTransport = 30;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
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
            public void registerDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void unregisterDevicePresenceListenerService(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean canPairWithoutPrompt(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void createAssociation(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void addOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void removeOnAssociationsChangedListener(android.companion.IOnAssociationsChangedListener p0, int p1) throws android.os.RemoteException {}
            public void addOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void removeOnTransportsChangedListener(android.companion.IOnTransportsChangedListener p0) throws android.os.RemoteException {}
            public void sendMessage(int p0, byte[] p1, int[] p2) throws android.os.RemoteException {}
            public void addOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void removeOnMessageReceivedListener(int p0, android.companion.IOnMessageReceivedListener p1) throws android.os.RemoteException {}
            public void notifyDeviceAppeared(int p0) throws android.os.RemoteException {}
            public void notifyDeviceDisappeared(int p0) throws android.os.RemoteException {}
            public android.app.PendingIntent buildPermissionTransferUserConsentIntent(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void startSystemDataTransfer(java.lang.String p0, int p1, int p2, android.companion.ISystemDataTransferCallback p3) throws android.os.RemoteException {}
            public void attachSystemDataTransport(java.lang.String p0, int p1, int p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public void detachSystemDataTransport(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean isCompanionApplicationBound(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent buildAssociationCancellationIntent(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void enableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public void disableSystemDataSync(int p0, int p1) throws android.os.RemoteException {}
            public void enableSecureTransport(boolean p0) throws android.os.RemoteException {}
        }
    }
}
