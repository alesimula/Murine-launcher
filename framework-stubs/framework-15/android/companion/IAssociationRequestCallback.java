package android.companion;

public interface IAssociationRequestCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.IAssociationRequestCallback";
    public void onAssociationPending(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void onAssociationCreated(android.companion.AssociationInfo p0) throws android.os.RemoteException;
    public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException;

    public static class Default implements android.companion.IAssociationRequestCallback {
        public Default() {}
        public void onAssociationPending(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void onAssociationCreated(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.IAssociationRequestCallback {
        static final int TRANSACTION_onAssociationPending = 1;
        static final int TRANSACTION_onAssociationCreated = 2;
        static final int TRANSACTION_onFailure = 3;
        public Stub() { super(); }
        public static android.companion.IAssociationRequestCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.IAssociationRequestCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAssociationPending(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void onAssociationCreated(android.companion.AssociationInfo p0) throws android.os.RemoteException {}
            public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        }
    }
}
