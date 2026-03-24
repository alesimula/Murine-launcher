package android.media.tv.extension.pvr;

public interface IRecordedContents extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.pvr.IRecordedContents";
    public void deleteRecordedContents(java.lang.String[] p0, android.media.tv.extension.pvr.IDeleteRecordedContentsCallback p1) throws android.os.RemoteException;
    public int getRecordedContentsLockInfoSync(java.lang.String p0) throws android.os.RemoteException;
    public void getRecordedContentsLockInfoAsync(java.lang.String p0, android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.pvr.IRecordedContents {
        public Default() {}
        public void deleteRecordedContents(java.lang.String[] p0, android.media.tv.extension.pvr.IDeleteRecordedContentsCallback p1) throws android.os.RemoteException {}
        public int getRecordedContentsLockInfoSync(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void getRecordedContentsLockInfoAsync(java.lang.String p0, android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.pvr.IRecordedContents {
        static final int TRANSACTION_deleteRecordedContents = 1;
        static final int TRANSACTION_getRecordedContentsLockInfoSync = 2;
        static final int TRANSACTION_getRecordedContentsLockInfoAsync = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.pvr.IRecordedContents asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.pvr.IRecordedContents {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void deleteRecordedContents(java.lang.String[] p0, android.media.tv.extension.pvr.IDeleteRecordedContentsCallback p1) throws android.os.RemoteException {}
            public int getRecordedContentsLockInfoSync(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void getRecordedContentsLockInfoAsync(java.lang.String p0, android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback p1) throws android.os.RemoteException {}
        }
    }
}
