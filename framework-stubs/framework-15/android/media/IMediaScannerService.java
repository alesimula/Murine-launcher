package android.media;

public interface IMediaScannerService extends android.os.IInterface {
    public void requestScanFile(java.lang.String p0, java.lang.String p1, android.media.IMediaScannerListener p2) throws android.os.RemoteException;
    public void scanFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaScannerService {
        public Default() {}
        public void requestScanFile(java.lang.String p0, java.lang.String p1, android.media.IMediaScannerListener p2) throws android.os.RemoteException {}
        public void scanFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaScannerService {
        public static final java.lang.String DESCRIPTOR = "android.media.IMediaScannerService";
        static final int TRANSACTION_requestScanFile = 1;
        static final int TRANSACTION_scanFile = 2;
        public Stub() { super(); }
        public static android.media.IMediaScannerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IMediaScannerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void requestScanFile(java.lang.String p0, java.lang.String p1, android.media.IMediaScannerListener p2) throws android.os.RemoteException {}
            public void scanFile(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
