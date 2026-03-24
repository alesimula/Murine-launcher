package android.net.lowpan;

public interface ILowpanManager extends android.os.IInterface {
    public static final java.lang.String LOWPAN_SERVICE_NAME = "lowpan";
    public android.net.lowpan.ILowpanInterface getInterface(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getInterfaceList() throws android.os.RemoteException;
    public void addListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException;
    public void removeListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException;
    public void addInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException;
    public void removeInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException;

    public static class Default implements android.net.lowpan.ILowpanManager {
        public Default() {}
        public android.net.lowpan.ILowpanInterface getInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getInterfaceList() throws android.os.RemoteException { return null; }
        public void addListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException {}
        public void removeListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException {}
        public void addInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        public void removeInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.lowpan.ILowpanManager {
        private static final java.lang.String DESCRIPTOR = "android.net.lowpan.ILowpanManager";
        static final int TRANSACTION_getInterface = 1;
        static final int TRANSACTION_getInterfaceList = 2;
        static final int TRANSACTION_addListener = 3;
        static final int TRANSACTION_removeListener = 4;
        static final int TRANSACTION_addInterface = 5;
        static final int TRANSACTION_removeInterface = 6;
        public Stub() { super(); }
        public static android.net.lowpan.ILowpanManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.lowpan.ILowpanManager p0) { return false; }
        public static android.net.lowpan.ILowpanManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.lowpan.ILowpanManager {
            private android.os.IBinder mRemote;
            public static android.net.lowpan.ILowpanManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.lowpan.ILowpanInterface getInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getInterfaceList() throws android.os.RemoteException { return null; }
            public void addListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException {}
            public void removeListener(android.net.lowpan.ILowpanManagerListener p0) throws android.os.RemoteException {}
            public void addInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
            public void removeInterface(android.net.lowpan.ILowpanInterface p0) throws android.os.RemoteException {}
        }
    }
}
