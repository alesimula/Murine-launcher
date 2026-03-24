package android.companion;

public interface ICompanionDeviceManager extends android.os.IInterface {
    public void associate(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public void stopScan(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void disassociate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.companion.ICompanionDeviceManager {
        public Default() {}
        public void associate(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public void stopScan(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void disassociate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.ICompanionDeviceManager {
        private static final java.lang.String DESCRIPTOR = "android.companion.ICompanionDeviceManager";
        static final int TRANSACTION_associate = 1;
        static final int TRANSACTION_stopScan = 2;
        static final int TRANSACTION_getAssociations = 3;
        static final int TRANSACTION_disassociate = 4;
        static final int TRANSACTION_hasNotificationAccess = 5;
        static final int TRANSACTION_requestNotificationAccess = 6;
        static final int TRANSACTION_isDeviceAssociatedForWifiConnection = 7;
        public Stub() { super(); }
        public static android.companion.ICompanionDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.companion.ICompanionDeviceManager p0) { return false; }
        public static android.companion.ICompanionDeviceManager getDefaultImpl() { return null; }

        private static class Proxy implements android.companion.ICompanionDeviceManager {
            private android.os.IBinder mRemote;
            public static android.companion.ICompanionDeviceManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void associate(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException {}
            public void stopScan(android.companion.AssociationRequest p0, android.companion.IFindDeviceCallback p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAssociations(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void disassociate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean hasNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public android.app.PendingIntent requestNotificationAccess(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        }
    }
}
