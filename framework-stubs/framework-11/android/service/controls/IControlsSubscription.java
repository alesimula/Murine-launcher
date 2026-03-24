package android.service.controls;

public interface IControlsSubscription extends android.os.IInterface {
    public void request(long p0) throws android.os.RemoteException;
    public void cancel() throws android.os.RemoteException;

    public static class Default implements android.service.controls.IControlsSubscription {
        public Default() {}
        public void request(long p0) throws android.os.RemoteException {}
        public void cancel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.controls.IControlsSubscription {
        private static final java.lang.String DESCRIPTOR = "android.service.controls.IControlsSubscription";
        static final int TRANSACTION_request = 1;
        static final int TRANSACTION_cancel = 2;
        public Stub() { super(); }
        public static android.service.controls.IControlsSubscription asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.controls.IControlsSubscription p0) { return false; }
        public static android.service.controls.IControlsSubscription getDefaultImpl() { return null; }

        private static class Proxy implements android.service.controls.IControlsSubscription {
            private android.os.IBinder mRemote;
            public static android.service.controls.IControlsSubscription sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void request(long p0) throws android.os.RemoteException {}
            public void cancel() throws android.os.RemoteException {}
        }
    }
}
