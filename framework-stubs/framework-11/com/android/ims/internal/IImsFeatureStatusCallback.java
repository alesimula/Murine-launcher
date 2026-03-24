package com.android.ims.internal;

public interface IImsFeatureStatusCallback extends android.os.IInterface {
    public void notifyImsFeatureStatus(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsFeatureStatusCallback {
        public Default() {}
        public void notifyImsFeatureStatus(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsFeatureStatusCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsFeatureStatusCallback";
        static final int TRANSACTION_notifyImsFeatureStatus = 1;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsFeatureStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsFeatureStatusCallback p0) { return false; }
        public static com.android.ims.internal.IImsFeatureStatusCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsFeatureStatusCallback {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsFeatureStatusCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyImsFeatureStatus(int p0) throws android.os.RemoteException {}
        }
    }
}
