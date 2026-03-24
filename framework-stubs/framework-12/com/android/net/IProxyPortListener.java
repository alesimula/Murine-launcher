package com.android.net;

public interface IProxyPortListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.net.IProxyPortListener";
    public void setProxyPort(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.net.IProxyPortListener {
        public Default() {}
        public void setProxyPort(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.net.IProxyPortListener {
        static final int TRANSACTION_setProxyPort = 1;
        public Stub() { super(); }
        public static com.android.net.IProxyPortListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.net.IProxyPortListener p0) { return false; }
        public static com.android.net.IProxyPortListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.net.IProxyPortListener {
            private android.os.IBinder mRemote;
            public static com.android.net.IProxyPortListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setProxyPort(int p0) throws android.os.RemoteException {}
        }
    }
}
