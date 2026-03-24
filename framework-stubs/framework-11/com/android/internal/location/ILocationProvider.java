package com.android.internal.location;

public interface ILocationProvider extends android.os.IInterface {
    public void setLocationProviderManager(com.android.internal.location.ILocationProviderManager p0) throws android.os.RemoteException;
    public void setRequest(com.android.internal.location.ProviderRequest p0, android.os.WorkSource p1) throws android.os.RemoteException;
    public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.location.ILocationProvider {
        public Default() {}
        public void setLocationProviderManager(com.android.internal.location.ILocationProviderManager p0) throws android.os.RemoteException {}
        public void setRequest(com.android.internal.location.ProviderRequest p0, android.os.WorkSource p1) throws android.os.RemoteException {}
        public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.location.ILocationProvider {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.location.ILocationProvider";
        static final int TRANSACTION_setLocationProviderManager = 1;
        static final int TRANSACTION_setRequest = 2;
        static final int TRANSACTION_sendExtraCommand = 3;
        public Stub() { super(); }
        public static com.android.internal.location.ILocationProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.location.ILocationProvider p0) { return false; }
        public static com.android.internal.location.ILocationProvider getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.location.ILocationProvider {
            private android.os.IBinder mRemote;
            public static com.android.internal.location.ILocationProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setLocationProviderManager(com.android.internal.location.ILocationProviderManager p0) throws android.os.RemoteException {}
            public void setRequest(com.android.internal.location.ProviderRequest p0, android.os.WorkSource p1) throws android.os.RemoteException {}
            public void sendExtraCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}
