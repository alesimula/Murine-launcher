package com.android.internal.os;

public interface IDropBoxManagerService extends android.os.IInterface {
    public void add(android.os.DropBoxManager.Entry p0) throws android.os.RemoteException;
    public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IDropBoxManagerService {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.os.IDropBoxManagerService";
        static final int TRANSACTION_add = 1;
        static final int TRANSACTION_isTagEnabled = 2;
        static final int TRANSACTION_getNextEntry = 3;
        public Stub() { super(); }
        public static com.android.internal.os.IDropBoxManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.os.IDropBoxManagerService p0) { return false; }
        public static com.android.internal.os.IDropBoxManagerService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.os.IDropBoxManagerService {
            private android.os.IBinder mRemote;
            public static com.android.internal.os.IDropBoxManagerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void add(android.os.DropBoxManager.Entry p0) throws android.os.RemoteException {}
            public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements com.android.internal.os.IDropBoxManagerService {
        public Default() {}
        public void add(android.os.DropBoxManager.Entry p0) throws android.os.RemoteException {}
        public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
