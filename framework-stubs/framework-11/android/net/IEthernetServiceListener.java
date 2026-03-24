package android.net;

public interface IEthernetServiceListener extends android.os.IInterface {
    public void onAvailabilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.net.IEthernetServiceListener {
        public Default() {}
        public void onAvailabilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IEthernetServiceListener {
        private static final java.lang.String DESCRIPTOR = "android.net.IEthernetServiceListener";
        static final int TRANSACTION_onAvailabilityChanged = 1;
        public Stub() { super(); }
        public static android.net.IEthernetServiceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IEthernetServiceListener p0) { return false; }
        public static android.net.IEthernetServiceListener getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IEthernetServiceListener {
            private android.os.IBinder mRemote;
            public static android.net.IEthernetServiceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAvailabilityChanged(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
