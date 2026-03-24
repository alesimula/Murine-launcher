package android.content;

public interface ISyncAdapterUnsyncableAccountCallback extends android.os.IInterface {
    public void onUnsyncableAccountDone(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.content.ISyncAdapterUnsyncableAccountCallback {
        public Default() {}
        public void onUnsyncableAccountDone(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncAdapterUnsyncableAccountCallback {
        private static final java.lang.String DESCRIPTOR = "android.content.ISyncAdapterUnsyncableAccountCallback";
        static final int TRANSACTION_onUnsyncableAccountDone = 1;
        public Stub() { super(); }
        public static android.content.ISyncAdapterUnsyncableAccountCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.ISyncAdapterUnsyncableAccountCallback p0) { return false; }
        public static android.content.ISyncAdapterUnsyncableAccountCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.content.ISyncAdapterUnsyncableAccountCallback {
            private android.os.IBinder mRemote;
            public static android.content.ISyncAdapterUnsyncableAccountCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUnsyncableAccountDone(boolean p0) throws android.os.RemoteException {}
        }
    }
}
