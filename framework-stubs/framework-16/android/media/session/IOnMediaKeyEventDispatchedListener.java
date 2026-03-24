package android.media.session;

public interface IOnMediaKeyEventDispatchedListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.session.IOnMediaKeyEventDispatchedListener";
    public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException;

    public static class Default implements android.media.session.IOnMediaKeyEventDispatchedListener {
        public Default() {}
        public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.IOnMediaKeyEventDispatchedListener {
        static final int TRANSACTION_onMediaKeyEventDispatched = 1;
        public Stub() { super(); }
        public static android.media.session.IOnMediaKeyEventDispatchedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.session.IOnMediaKeyEventDispatchedListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMediaKeyEventDispatched(android.view.KeyEvent p0, java.lang.String p1, android.media.session.MediaSession.Token p2) throws android.os.RemoteException {}
        }
    }
}
