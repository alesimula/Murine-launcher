package com.android.ims.internal;

public interface IImsStreamMediaSession extends android.os.IInterface {
    public void close() throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsStreamMediaSession {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsStreamMediaSession {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsStreamMediaSession";
        static final int TRANSACTION_close = 1;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsStreamMediaSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsStreamMediaSession p0) { return false; }
        public static com.android.ims.internal.IImsStreamMediaSession getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsStreamMediaSession {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsStreamMediaSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
        }
    }
}
