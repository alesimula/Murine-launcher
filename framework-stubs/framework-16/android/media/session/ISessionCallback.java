package android.media.session;

public interface ISessionCallback extends android.os.IInterface {
    public void onCommand(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4, android.os.ResultReceiver p5) throws android.os.RemoteException;
    public void onMediaButton(java.lang.String p0, int p1, int p2, android.content.Intent p3, int p4, android.os.ResultReceiver p5) throws android.os.RemoteException;
    public void onMediaButtonFromController(java.lang.String p0, int p1, int p2, android.content.Intent p3) throws android.os.RemoteException;
    public void onPrepare(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onPrepareFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onPrepareFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onPrepareFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onPlay(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onPlayFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onPlayFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onPlayFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onSkipToTrack(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException;
    public void onPause(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onStop(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onNext(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onPrevious(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onFastForward(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onRewind(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onSeekTo(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException;
    public void onRate(java.lang.String p0, int p1, int p2, android.media.Rating p3) throws android.os.RemoteException;
    public void onSetPlaybackSpeed(java.lang.String p0, int p1, int p2, float p3) throws android.os.RemoteException;
    public void onCustomAction(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException;
    public void onAdjustVolume(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onSetVolumeTo(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.media.session.ISessionCallback {
        public Default() {}
        public void onCommand(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
        public void onMediaButton(java.lang.String p0, int p1, int p2, android.content.Intent p3, int p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
        public void onMediaButtonFromController(java.lang.String p0, int p1, int p2, android.content.Intent p3) throws android.os.RemoteException {}
        public void onPrepare(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onPrepareFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onPrepareFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onPrepareFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onPlay(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onPlayFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onPlayFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onPlayFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onSkipToTrack(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
        public void onPause(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onStop(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onNext(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onPrevious(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onFastForward(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onRewind(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onSeekTo(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
        public void onRate(java.lang.String p0, int p1, int p2, android.media.Rating p3) throws android.os.RemoteException {}
        public void onSetPlaybackSpeed(java.lang.String p0, int p1, int p2, float p3) throws android.os.RemoteException {}
        public void onCustomAction(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
        public void onAdjustVolume(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onSetVolumeTo(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.session.ISessionCallback {
        public static final java.lang.String DESCRIPTOR = "android.media.session.ISessionCallback";
        static final int TRANSACTION_onCommand = 1;
        static final int TRANSACTION_onMediaButton = 2;
        static final int TRANSACTION_onMediaButtonFromController = 3;
        static final int TRANSACTION_onPrepare = 4;
        static final int TRANSACTION_onPrepareFromMediaId = 5;
        static final int TRANSACTION_onPrepareFromSearch = 6;
        static final int TRANSACTION_onPrepareFromUri = 7;
        static final int TRANSACTION_onPlay = 8;
        static final int TRANSACTION_onPlayFromMediaId = 9;
        static final int TRANSACTION_onPlayFromSearch = 10;
        static final int TRANSACTION_onPlayFromUri = 11;
        static final int TRANSACTION_onSkipToTrack = 12;
        static final int TRANSACTION_onPause = 13;
        static final int TRANSACTION_onStop = 14;
        static final int TRANSACTION_onNext = 15;
        static final int TRANSACTION_onPrevious = 16;
        static final int TRANSACTION_onFastForward = 17;
        static final int TRANSACTION_onRewind = 18;
        static final int TRANSACTION_onSeekTo = 19;
        static final int TRANSACTION_onRate = 20;
        static final int TRANSACTION_onSetPlaybackSpeed = 21;
        static final int TRANSACTION_onCustomAction = 22;
        static final int TRANSACTION_onAdjustVolume = 23;
        static final int TRANSACTION_onSetVolumeTo = 24;
        public Stub() { super(); }
        public static android.media.session.ISessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.session.ISessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCommand(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
            public void onMediaButton(java.lang.String p0, int p1, int p2, android.content.Intent p3, int p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
            public void onMediaButtonFromController(java.lang.String p0, int p1, int p2, android.content.Intent p3) throws android.os.RemoteException {}
            public void onPrepare(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onPrepareFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onPrepareFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onPrepareFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onPlay(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onPlayFromMediaId(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onPlayFromSearch(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onPlayFromUri(java.lang.String p0, int p1, int p2, android.net.Uri p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onSkipToTrack(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
            public void onPause(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onStop(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onNext(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onPrevious(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onFastForward(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onRewind(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onSeekTo(java.lang.String p0, int p1, int p2, long p3) throws android.os.RemoteException {}
            public void onRate(java.lang.String p0, int p1, int p2, android.media.Rating p3) throws android.os.RemoteException {}
            public void onSetPlaybackSpeed(java.lang.String p0, int p1, int p2, float p3) throws android.os.RemoteException {}
            public void onCustomAction(java.lang.String p0, int p1, int p2, java.lang.String p3, android.os.Bundle p4) throws android.os.RemoteException {}
            public void onAdjustVolume(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onSetVolumeTo(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}
