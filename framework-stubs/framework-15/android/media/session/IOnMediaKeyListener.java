package android.media.session;

public interface IOnMediaKeyListener extends android.os.IInterface {
    public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) throws android.os.RemoteException;

    public static class Default implements android.media.session.IOnMediaKeyListener {
        public Default() {}
        public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.IOnMediaKeyListener {
        public static final java.lang.String DESCRIPTOR = "android.media.session.IOnMediaKeyListener";
        static final int TRANSACTION_onMediaKey = 1;
        public Stub() { super(); }
        public static android.media.session.IOnMediaKeyListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.session.IOnMediaKeyListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMediaKey(android.view.KeyEvent p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        }
    }
}
