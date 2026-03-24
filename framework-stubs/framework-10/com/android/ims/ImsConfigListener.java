package com.android.ims;

public interface ImsConfigListener extends android.os.IInterface {
    public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException;
    public void onSetVideoQuality(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.ims.ImsConfigListener {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.ImsConfigListener";
        static final int TRANSACTION_onGetFeatureResponse = 1;
        static final int TRANSACTION_onSetFeatureResponse = 2;
        static final int TRANSACTION_onGetVideoQuality = 3;
        static final int TRANSACTION_onSetVideoQuality = 4;
        public Stub() { super(); }
        public static com.android.ims.ImsConfigListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.ImsConfigListener p0) { return false; }
        public static com.android.ims.ImsConfigListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.ImsConfigListener {
            private android.os.IBinder mRemote;
            public static com.android.ims.ImsConfigListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException {}
            public void onSetVideoQuality(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.ims.ImsConfigListener {
        public Default() {}
        public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException {}
        public void onSetVideoQuality(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
