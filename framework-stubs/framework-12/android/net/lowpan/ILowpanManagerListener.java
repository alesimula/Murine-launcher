package android.net.lowpan;

public interface ILowpanManagerListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanManagerListener";
    public void onInterfaceAdded(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException;
    public void onInterfaceRemoved(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException;

    public static class Default implements android.net.lowpan.ILowpanManagerListener {
        public Default() {}
        public void onInterfaceAdded(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        public void onInterfaceRemoved(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanManagerListener {
        static final int TRANSACTION_onInterfaceAdded = 1;
        static final int TRANSACTION_onInterfaceRemoved = 2;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanManagerListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.lowpan.ILowpanManagerListener p0) { return false; }
        public static android.net.lowpan.ILowpanManagerListener getDefaultImpl() { return null; }

        private static class Proxy implements android.net.lowpan.ILowpanManagerListener {
            private android.os.IBinder mRemote;
            public static android.net.lowpan.ILowpanManagerListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInterfaceAdded(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
            public void onInterfaceRemoved(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        }
    }
}
