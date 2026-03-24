package com.android.ims.internal;

public interface IImsRcsFeature extends android.os.IInterface {

    public static class Default implements com.android.ims.internal.IImsRcsFeature {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsRcsFeature {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsRcsFeature";
        public Stub() { super(); }
        public static com.android.ims.internal.IImsRcsFeature asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.IImsRcsFeature {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
