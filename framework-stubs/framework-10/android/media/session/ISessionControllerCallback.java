package android.media.session;

public interface ISessionControllerCallback extends android.os.IInterface {
    public void onEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onSessionDestroyed() throws android.os.RemoteException;
    public void onPlaybackStateChanged(android.media.session.PlaybackState p0) throws android.os.RemoteException;
    public void onMetadataChanged(android.media.MediaMetadata p0) throws android.os.RemoteException;
    public void onQueueChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException;
    public void onQueueTitleChanged(java.lang.CharSequence p0) throws android.os.RemoteException;
    public void onExtrasChanged(android.os.Bundle p0) throws android.os.RemoteException;
    public void onVolumeInfoChanged(android.media.session.MediaController.PlaybackInfo p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISessionControllerCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.session.ISessionControllerCallback";
        static final int TRANSACTION_onEvent = 1;
        static final int TRANSACTION_onSessionDestroyed = 2;
        static final int TRANSACTION_onPlaybackStateChanged = 3;
        static final int TRANSACTION_onMetadataChanged = 4;
        static final int TRANSACTION_onQueueChanged = 5;
        static final int TRANSACTION_onQueueTitleChanged = 6;
        static final int TRANSACTION_onExtrasChanged = 7;
        static final int TRANSACTION_onVolumeInfoChanged = 8;
        public Stub() { super(); }
        public static android.media.session.ISessionControllerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.session.ISessionControllerCallback p0) { return false; }
        public static android.media.session.ISessionControllerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.session.ISessionControllerCallback {
            private android.os.IBinder mRemote;
            public static android.media.session.ISessionControllerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onSessionDestroyed() throws android.os.RemoteException {}
            public void onPlaybackStateChanged(android.media.session.PlaybackState p0) throws android.os.RemoteException {}
            public void onMetadataChanged(android.media.MediaMetadata p0) throws android.os.RemoteException {}
            public void onQueueChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
            public void onQueueTitleChanged(java.lang.CharSequence p0) throws android.os.RemoteException {}
            public void onExtrasChanged(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onVolumeInfoChanged(android.media.session.MediaController.PlaybackInfo p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.session.ISessionControllerCallback {
        public Default() {}
        public void onEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onSessionDestroyed() throws android.os.RemoteException {}
        public void onPlaybackStateChanged(android.media.session.PlaybackState p0) throws android.os.RemoteException {}
        public void onMetadataChanged(android.media.MediaMetadata p0) throws android.os.RemoteException {}
        public void onQueueChanged(android.content.pm.ParceledListSlice p0) throws android.os.RemoteException {}
        public void onQueueTitleChanged(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public void onExtrasChanged(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onVolumeInfoChanged(android.media.session.MediaController.PlaybackInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
