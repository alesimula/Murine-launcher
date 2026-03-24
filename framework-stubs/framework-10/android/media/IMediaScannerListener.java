package android.media;

public interface IMediaScannerListener extends android.os.IInterface {
    public void scanCompleted(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaScannerListener {
        private static final java.lang.String DESCRIPTOR = "android.media.IMediaScannerListener";
        static final int TRANSACTION_scanCompleted = 1;
        public Stub() { super(); }
        public static android.media.IMediaScannerListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IMediaScannerListener p0) { return false; }
        public static android.media.IMediaScannerListener getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IMediaScannerListener {
            private android.os.IBinder mRemote;
            public static android.media.IMediaScannerListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void scanCompleted(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.IMediaScannerListener {
        public Default() {}
        public void scanCompleted(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
