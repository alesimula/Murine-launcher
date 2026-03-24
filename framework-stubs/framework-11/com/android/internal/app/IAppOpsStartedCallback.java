package com.android.internal.app;

public interface IAppOpsStartedCallback extends android.os.IInterface {
    public void opStarted(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IAppOpsStartedCallback {
        public Default() {}
        public void opStarted(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAppOpsStartedCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAppOpsStartedCallback";
        static final int TRANSACTION_opStarted = 1;
        public Stub() { super(); }
        public static com.android.internal.app.IAppOpsStartedCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IAppOpsStartedCallback p0) { return false; }
        public static com.android.internal.app.IAppOpsStartedCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IAppOpsStartedCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IAppOpsStartedCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void opStarted(int p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        }
    }
}
