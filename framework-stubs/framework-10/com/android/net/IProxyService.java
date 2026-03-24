package com.android.net;

public interface IProxyService extends android.os.IInterface {
    public java.lang.String resolvePacFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPacFile(java.lang.String p0) throws android.os.RemoteException;
    public void startPacSystem() throws android.os.RemoteException;
    public void stopPacSystem() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.net.IProxyService {
        private static final java.lang.String DESCRIPTOR = "com.android.net.IProxyService";
        static final int TRANSACTION_resolvePacFile = 1;
        static final int TRANSACTION_setPacFile = 2;
        static final int TRANSACTION_startPacSystem = 3;
        static final int TRANSACTION_stopPacSystem = 4;
        public Stub() { super(); }
        public static com.android.net.IProxyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.net.IProxyService p0) { return false; }
        public static com.android.net.IProxyService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.net.IProxyService {
            private android.os.IBinder mRemote;
            public static com.android.net.IProxyService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String resolvePacFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setPacFile(java.lang.String p0) throws android.os.RemoteException {}
            public void startPacSystem() throws android.os.RemoteException {}
            public void stopPacSystem() throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.net.IProxyService {
        public Default() {}
        public java.lang.String resolvePacFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setPacFile(java.lang.String p0) throws android.os.RemoteException {}
        public void startPacSystem() throws android.os.RemoteException {}
        public void stopPacSystem() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
