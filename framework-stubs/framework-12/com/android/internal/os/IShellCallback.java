package com.android.internal.os;

public interface IShellCallback extends android.os.IInterface {
    public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.os.IShellCallback {
        public Default() {}
        public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IShellCallback {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.os.IShellCallback";
        static final int TRANSACTION_openFile = 1;
        public Stub() { super(); }
        public static com.android.internal.os.IShellCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.os.IShellCallback p0) { return false; }
        public static com.android.internal.os.IShellCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.os.IShellCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.os.IShellCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        }
    }
}
