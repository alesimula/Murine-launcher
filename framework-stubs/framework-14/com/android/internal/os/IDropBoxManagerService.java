package com.android.internal.os;

public interface IDropBoxManagerService extends android.os.IInterface {
    public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException;
    public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException;
    public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.DropBoxManager.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.os.IDropBoxManagerService {
        public Default() {}
        public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException {}
        public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException {}
        public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.DropBoxManager.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IDropBoxManagerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.os.IDropBoxManagerService";
        static final int TRANSACTION_addData = 1;
        static final int TRANSACTION_addFile = 2;
        static final int TRANSACTION_isTagEnabled = 3;
        static final int TRANSACTION_getNextEntry = 4;
        static final int TRANSACTION_getNextEntryWithAttribution = 5;
        public Stub() { super(); }
        public static com.android.internal.os.IDropBoxManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.os.IDropBoxManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException {}
            public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException {}
            public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.os.DropBoxManager.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.os.DropBoxManager.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        }
    }
}
