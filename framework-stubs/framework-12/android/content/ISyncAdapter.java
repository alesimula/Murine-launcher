package android.content;

public interface ISyncAdapter extends android.os.IInterface {
    public void onUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) throws android.os.RemoteException;
    public void startSync(android.content.ISyncContext p0, java.lang.String p1, android.accounts.Account p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException;

    public static class Default implements android.content.ISyncAdapter {
        public Default() {}
        public void onUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) throws android.os.RemoteException {}
        public void startSync(android.content.ISyncContext p0, java.lang.String p1, android.accounts.Account p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncAdapter {
        public static final java.lang.String DESCRIPTOR = "android.content.ISyncAdapter";
        static final int TRANSACTION_onUnsyncableAccount = 1;
        static final int TRANSACTION_startSync = 2;
        static final int TRANSACTION_cancelSync = 3;
        public Stub() { super(); }
        public static android.content.ISyncAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.ISyncAdapter p0) { return false; }
        public static android.content.ISyncAdapter getDefaultImpl() { return null; }

        private static class Proxy implements android.content.ISyncAdapter {
            private android.os.IBinder mRemote;
            public static android.content.ISyncAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) throws android.os.RemoteException {}
            public void startSync(android.content.ISyncContext p0, java.lang.String p1, android.accounts.Account p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
        }
    }
}
