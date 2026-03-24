package android.content;

public interface ISyncServiceAdapter extends android.os.IInterface {
    public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException;

    public static class Default implements android.content.ISyncServiceAdapter {
        public Default() {}
        public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncServiceAdapter {
        public static final java.lang.String DESCRIPTOR = "android.content.ISyncServiceAdapter";
        static final int TRANSACTION_startSync = 1;
        static final int TRANSACTION_cancelSync = 2;
        public Stub() { super(); }
        public static android.content.ISyncServiceAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.ISyncServiceAdapter p0) { return false; }
        public static android.content.ISyncServiceAdapter getDefaultImpl() { return null; }

        private static class Proxy implements android.content.ISyncServiceAdapter {
            private android.os.IBinder mRemote;
            public static android.content.ISyncServiceAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
        }
    }
}
