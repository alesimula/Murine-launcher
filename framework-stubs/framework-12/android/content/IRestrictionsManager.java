package android.content;

public interface IRestrictionsManager extends android.os.IInterface {
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasRestrictionsProvider() throws android.os.RemoteException;
    public void requestPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) throws android.os.RemoteException;
    public void notifyPermissionResponse(java.lang.String p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public android.content.Intent createLocalApprovalIntent() throws android.os.RemoteException;

    public static class Default implements android.content.IRestrictionsManager {
        public Default() {}
        public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean hasRestrictionsProvider() throws android.os.RemoteException { return false; }
        public void requestPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
        public void notifyPermissionResponse(java.lang.String p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public android.content.Intent createLocalApprovalIntent() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.IRestrictionsManager {
        public static final java.lang.String DESCRIPTOR = "android.content.IRestrictionsManager";
        static final int TRANSACTION_getApplicationRestrictions = 1;
        static final int TRANSACTION_hasRestrictionsProvider = 2;
        static final int TRANSACTION_requestPermission = 3;
        static final int TRANSACTION_notifyPermissionResponse = 4;
        static final int TRANSACTION_createLocalApprovalIntent = 5;
        public Stub() { super(); }
        public static android.content.IRestrictionsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.IRestrictionsManager p0) { return false; }
        public static android.content.IRestrictionsManager getDefaultImpl() { return null; }

        private static class Proxy implements android.content.IRestrictionsManager {
            private android.os.IBinder mRemote;
            public static android.content.IRestrictionsManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean hasRestrictionsProvider() throws android.os.RemoteException { return false; }
            public void requestPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
            public void notifyPermissionResponse(java.lang.String p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public android.content.Intent createLocalApprovalIntent() throws android.os.RemoteException { return null; }
        }
    }
}
