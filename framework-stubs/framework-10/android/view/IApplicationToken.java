package android.view;

public interface IApplicationToken extends android.os.IInterface {
    public java.lang.String getName() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IApplicationToken {
        private static final java.lang.String DESCRIPTOR = "android.view.IApplicationToken";
        static final int TRANSACTION_getName = 1;
        public Stub() { super(); }
        public static android.view.IApplicationToken asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IApplicationToken p0) { return false; }
        public static android.view.IApplicationToken getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IApplicationToken {
            private android.os.IBinder mRemote;
            public static android.view.IApplicationToken sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getName() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.view.IApplicationToken {
        public Default() {}
        public java.lang.String getName() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
