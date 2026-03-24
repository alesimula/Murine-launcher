package android.media.session;

public interface ICallback extends android.os.IInterface {
    public void onMediaKeyEventDispatchedToMediaSession(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) throws android.os.RemoteException;
    public void onMediaKeyEventDispatchedToMediaButtonReceiver(android.view.KeyEvent p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public void onAddressedPlayerChangedToMediaSession(android.media.session.MediaSession.Token p0) throws android.os.RemoteException;
    public void onAddressedPlayerChangedToMediaButtonReceiver(android.content.ComponentName p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.session.ICallback {
        private static final java.lang.String DESCRIPTOR = "android.media.session.ICallback";
        static final int TRANSACTION_onMediaKeyEventDispatchedToMediaSession = 1;
        static final int TRANSACTION_onMediaKeyEventDispatchedToMediaButtonReceiver = 2;
        static final int TRANSACTION_onAddressedPlayerChangedToMediaSession = 3;
        static final int TRANSACTION_onAddressedPlayerChangedToMediaButtonReceiver = 4;
        public Stub() { super(); }
        public static android.media.session.ICallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ICallback p0) { return false; }
        public static android.media.session.ICallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ICallback {
            private android.os.IBinder mRemote;
            public static android.media.session.ICallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMediaKeyEventDispatchedToMediaSession(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) throws android.os.RemoteException {}
            public void onMediaKeyEventDispatchedToMediaButtonReceiver(android.view.KeyEvent p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public void onAddressedPlayerChangedToMediaSession(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
            public void onAddressedPlayerChangedToMediaButtonReceiver(android.content.ComponentName p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.session.ICallback {
        public Default() {}
        public void onMediaKeyEventDispatchedToMediaSession(android.view.KeyEvent p0, android.media.session.MediaSession.Token p1) throws android.os.RemoteException {}
        public void onMediaKeyEventDispatchedToMediaButtonReceiver(android.view.KeyEvent p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void onAddressedPlayerChangedToMediaSession(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
        public void onAddressedPlayerChangedToMediaButtonReceiver(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
