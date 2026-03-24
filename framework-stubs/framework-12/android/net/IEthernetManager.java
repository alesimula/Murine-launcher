package android.net;

public interface IEthernetManager extends android.os.IInterface {
    public java.lang.String[] getAvailableInterfaces() throws android.os.RemoteException;
    public android.net.IpConfiguration getConfiguration(java.lang.String p0) throws android.os.RemoteException;
    public void setConfiguration(java.lang.String p0, android.net.IpConfiguration p1) throws android.os.RemoteException;
    public boolean isAvailable(java.lang.String p0) throws android.os.RemoteException;
    public void addListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException;
    public void removeListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException;
    public void setIncludeTestInterfaces(boolean p0) throws android.os.RemoteException;
    public void requestTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException;
    public void releaseTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException;

    public static class Default implements android.net.IEthernetManager {
        public Default() {}
        public java.lang.String[] getAvailableInterfaces() throws android.os.RemoteException { return null; }
        public android.net.IpConfiguration getConfiguration(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setConfiguration(java.lang.String p0, android.net.IpConfiguration p1) throws android.os.RemoteException {}
        public boolean isAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void addListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException {}
        public void removeListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException {}
        public void setIncludeTestInterfaces(boolean p0) throws android.os.RemoteException {}
        public void requestTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException {}
        public void releaseTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IEthernetManager {
        public static final java.lang.String DESCRIPTOR = "android.net.IEthernetManager";
        static final int TRANSACTION_getAvailableInterfaces = 1;
        static final int TRANSACTION_getConfiguration = 2;
        static final int TRANSACTION_setConfiguration = 3;
        static final int TRANSACTION_isAvailable = 4;
        static final int TRANSACTION_addListener = 5;
        static final int TRANSACTION_removeListener = 6;
        static final int TRANSACTION_setIncludeTestInterfaces = 7;
        static final int TRANSACTION_requestTetheredInterface = 8;
        static final int TRANSACTION_releaseTetheredInterface = 9;
        public Stub() { super(); }
        public static android.net.IEthernetManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IEthernetManager p0) { return false; }
        public static android.net.IEthernetManager getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IEthernetManager {
            private android.os.IBinder mRemote;
            public static android.net.IEthernetManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getAvailableInterfaces() throws android.os.RemoteException { return null; }
            public android.net.IpConfiguration getConfiguration(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setConfiguration(java.lang.String p0, android.net.IpConfiguration p1) throws android.os.RemoteException {}
            public boolean isAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void addListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException {}
            public void removeListener(android.net.IEthernetServiceListener p0) throws android.os.RemoteException {}
            public void setIncludeTestInterfaces(boolean p0) throws android.os.RemoteException {}
            public void requestTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException {}
            public void releaseTetheredInterface(android.net.ITetheredInterfaceCallback p0) throws android.os.RemoteException {}
        }
    }
}
