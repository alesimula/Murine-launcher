package com.android.ims;

public interface ImsConfigListener extends android.os.IInterface {
    public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException;
    public void onSetVideoQuality(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.ImsConfigListener {
        public Default() {}
        public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException {}
        public void onSetVideoQuality(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.ImsConfigListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.ImsConfigListener";
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
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.ImsConfigListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onSetFeatureResponse(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onGetVideoQuality(int p0, int p1) throws android.os.RemoteException {}
            public void onSetVideoQuality(int p0) throws android.os.RemoteException {}
        }
    }
}
