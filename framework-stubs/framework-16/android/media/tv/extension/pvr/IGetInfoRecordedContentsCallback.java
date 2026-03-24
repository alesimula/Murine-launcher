package android.media.tv.extension.pvr;

public interface IGetInfoRecordedContentsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback";
    public void onRecordedContentsGetInfo(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback {
        public Default() {}
        public void onRecordedContentsGetInfo(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback {
        static final int TRANSACTION_onRecordedContentsGetInfo = 1;
        public Stub() { super(); }
        public static android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.pvr.IGetInfoRecordedContentsCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRecordedContentsGetInfo(int p0) throws android.os.RemoteException {}
        }
    }
}
