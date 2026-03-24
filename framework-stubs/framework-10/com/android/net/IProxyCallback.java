package com.android.net;

public interface IProxyCallback extends android.os.IInterface {
    public void getProxyPort(android.os.IBinder p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.net.IProxyCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.net.IProxyCallback";
        static final int TRANSACTION_getProxyPort = 1;
        public Stub() { super(); }
        public static com.android.net.IProxyCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.net.IProxyCallback p0) { return false; }
        public static com.android.net.IProxyCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.net.IProxyCallback {
            private android.os.IBinder mRemote;
            public static com.android.net.IProxyCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getProxyPort(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.net.IProxyCallback {
        public Default() {}
        public void getProxyPort(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
