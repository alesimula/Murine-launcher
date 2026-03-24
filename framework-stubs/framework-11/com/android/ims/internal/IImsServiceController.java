package com.android.ims.internal;

public interface IImsServiceController extends android.os.IInterface {
    public com.android.ims.internal.IImsMMTelFeature createEmergencyMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsMMTelFeature createMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException;
    public com.android.ims.internal.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException;
    public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsServiceController {
        public Default() {}
        public com.android.ims.internal.IImsMMTelFeature createEmergencyMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsMMTelFeature createMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
        public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsServiceController {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsServiceController";
        static final int TRANSACTION_createEmergencyMMTelFeature = 1;
        static final int TRANSACTION_createMMTelFeature = 2;
        static final int TRANSACTION_createRcsFeature = 3;
        static final int TRANSACTION_removeImsFeature = 4;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsServiceController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsServiceController p0) { return false; }
        public static com.android.ims.internal.IImsServiceController getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsServiceController {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsServiceController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.ims.internal.IImsMMTelFeature createEmergencyMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsMMTelFeature createMMTelFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.IImsRcsFeature createRcsFeature(int p0, com.android.ims.internal.IImsFeatureStatusCallback p1) throws android.os.RemoteException { return null; }
            public void removeImsFeature(int p0, int p1, com.android.ims.internal.IImsFeatureStatusCallback p2) throws android.os.RemoteException {}
        }
    }
}
