package android.net.nsd;

public interface INsdManager extends android.os.IInterface {
    public android.os.Messenger getMessenger() throws android.os.RemoteException;
    public void setEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.net.nsd.INsdManager {
        public Default() {}
        public android.os.Messenger getMessenger() throws android.os.RemoteException { return null; }
        public void setEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.nsd.INsdManager {
        public static final java.lang.String DESCRIPTOR = "android.net.nsd.INsdManager";
        static final int TRANSACTION_getMessenger = 1;
        static final int TRANSACTION_setEnabled = 2;
        public Stub() { super(); }
        public static android.net.nsd.INsdManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.nsd.INsdManager p0) { return false; }
        public static android.net.nsd.INsdManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.nsd.INsdManager {
            private android.os.IBinder mRemote;
            public static android.net.nsd.INsdManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Messenger getMessenger() throws android.os.RemoteException { return null; }
            public void setEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
