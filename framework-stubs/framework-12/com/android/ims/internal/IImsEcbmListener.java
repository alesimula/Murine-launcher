package com.android.ims.internal;

public interface IImsEcbmListener extends android.os.IInterface {
    public void enteredECBM() throws android.os.RemoteException;
    public void exitedECBM() throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsEcbmListener {
        public Default() {}
        public void enteredECBM() throws android.os.RemoteException {}
        public void exitedECBM() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsEcbmListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsEcbmListener";
        static final int TRANSACTION_enteredECBM = 1;
        static final int TRANSACTION_exitedECBM = 2;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsEcbmListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsEcbmListener p0) { return false; }
        public static com.android.ims.internal.IImsEcbmListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsEcbmListener {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsEcbmListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void enteredECBM() throws android.os.RemoteException {}
            public void exitedECBM() throws android.os.RemoteException {}
        }
    }
}
