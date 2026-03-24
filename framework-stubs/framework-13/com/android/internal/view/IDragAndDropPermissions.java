package com.android.internal.view;

public interface IDragAndDropPermissions extends android.os.IInterface {
    public void take(android.os.IBinder p0) throws android.os.RemoteException;
    public void takeTransient() throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IDragAndDropPermissions {
        public Default() {}
        public void take(android.os.IBinder p0) throws android.os.RemoteException {}
        public void takeTransient() throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IDragAndDropPermissions {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IDragAndDropPermissions";
        static final int TRANSACTION_take = 1;
        static final int TRANSACTION_takeTransient = 2;
        static final int TRANSACTION_release = 3;
        public Stub() { super(); }
        public static com.android.internal.view.IDragAndDropPermissions asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.view.IDragAndDropPermissions {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void take(android.os.IBinder p0) throws android.os.RemoteException {}
            public void takeTransient() throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
        }
    }
}
