package android.media;

public interface IRemoteVolumeController extends android.os.IInterface {
    public void remoteVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException;
    public void updateRemoteController(android.media.session.MediaSession.Token p0) throws android.os.RemoteException;

    public static class Default implements android.media.IRemoteVolumeController {
        public Default() {}
        public void remoteVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
        public void updateRemoteController(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IRemoteVolumeController {
        private static final java.lang.String DESCRIPTOR = "android.media.IRemoteVolumeController";
        static final int TRANSACTION_remoteVolumeChanged = 1;
        static final int TRANSACTION_updateRemoteController = 2;
        public Stub() { super(); }
        public static android.media.IRemoteVolumeController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IRemoteVolumeController p0) { return false; }
        public static android.media.IRemoteVolumeController getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IRemoteVolumeController {
            private android.os.IBinder mRemote;
            public static android.media.IRemoteVolumeController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void remoteVolumeChanged(android.media.session.MediaSession.Token p0, int p1) throws android.os.RemoteException {}
            public void updateRemoteController(android.media.session.MediaSession.Token p0) throws android.os.RemoteException {}
        }
    }
}
