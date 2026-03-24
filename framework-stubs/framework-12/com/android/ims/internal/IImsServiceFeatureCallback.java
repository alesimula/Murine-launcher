package com.android.ims.internal;

public interface IImsServiceFeatureCallback extends android.os.IInterface {
    public void imsFeatureCreated(com.android.ims.ImsFeatureContainer p0) throws android.os.RemoteException;
    public void imsFeatureRemoved(int p0) throws android.os.RemoteException;
    public void imsStatusChanged(int p0) throws android.os.RemoteException;
    public void updateCapabilities(long p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsServiceFeatureCallback {
        public Default() {}
        public void imsFeatureCreated(com.android.ims.ImsFeatureContainer p0) throws android.os.RemoteException {}
        public void imsFeatureRemoved(int p0) throws android.os.RemoteException {}
        public void imsStatusChanged(int p0) throws android.os.RemoteException {}
        public void updateCapabilities(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsServiceFeatureCallback {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsServiceFeatureCallback";
        static final int TRANSACTION_imsFeatureCreated = 1;
        static final int TRANSACTION_imsFeatureRemoved = 2;
        static final int TRANSACTION_imsStatusChanged = 3;
        static final int TRANSACTION_updateCapabilities = 4;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsServiceFeatureCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsServiceFeatureCallback p0) { return false; }
        public static com.android.ims.internal.IImsServiceFeatureCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsServiceFeatureCallback {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsServiceFeatureCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void imsFeatureCreated(com.android.ims.ImsFeatureContainer p0) throws android.os.RemoteException {}
            public void imsFeatureRemoved(int p0) throws android.os.RemoteException {}
            public void imsStatusChanged(int p0) throws android.os.RemoteException {}
            public void updateCapabilities(long p0) throws android.os.RemoteException {}
        }
    }
}
