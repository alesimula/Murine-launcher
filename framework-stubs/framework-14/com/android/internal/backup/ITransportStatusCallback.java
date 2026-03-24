package com.android.internal.backup;

public interface ITransportStatusCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.backup.ITransportStatusCallback";
    public void onOperationCompleteWithStatus(int p0) throws android.os.RemoteException;
    public void onOperationComplete() throws android.os.RemoteException;

    public static class Default implements com.android.internal.backup.ITransportStatusCallback {
        public Default() {}
        public void onOperationCompleteWithStatus(int p0) throws android.os.RemoteException {}
        public void onOperationComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.backup.ITransportStatusCallback {
        static final int TRANSACTION_onOperationCompleteWithStatus = 1;
        static final int TRANSACTION_onOperationComplete = 2;
        public Stub() { super(); }
        public static com.android.internal.backup.ITransportStatusCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.backup.ITransportStatusCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onOperationCompleteWithStatus(int p0) throws android.os.RemoteException {}
            public void onOperationComplete() throws android.os.RemoteException {}
        }
    }
}
