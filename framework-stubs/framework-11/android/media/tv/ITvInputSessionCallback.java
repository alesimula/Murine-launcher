package android.media.tv;

public interface ITvInputSessionCallback extends android.os.IInterface {
    public void onSessionCreated(android.media.tv.ITvInputSession p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void onSessionEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onChannelRetuned(android.net.Uri p0) throws android.os.RemoteException;
    public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void onTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onVideoAvailable() throws android.os.RemoteException;
    public void onVideoUnavailable(int p0) throws android.os.RemoteException;
    public void onContentAllowed() throws android.os.RemoteException;
    public void onContentBlocked(java.lang.String p0) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onTimeShiftStatusChanged(int p0) throws android.os.RemoteException;
    public void onTimeShiftStartPositionChanged(long p0) throws android.os.RemoteException;
    public void onTimeShiftCurrentPositionChanged(long p0) throws android.os.RemoteException;
    public void onTuned(android.net.Uri p0) throws android.os.RemoteException;
    public void onRecordingStopped(android.net.Uri p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputSessionCallback {
        public Default() {}
        public void onSessionCreated(android.media.tv.ITvInputSession p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void onSessionEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onChannelRetuned(android.net.Uri p0) throws android.os.RemoteException {}
        public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void onTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onVideoAvailable() throws android.os.RemoteException {}
        public void onVideoUnavailable(int p0) throws android.os.RemoteException {}
        public void onContentAllowed() throws android.os.RemoteException {}
        public void onContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onTimeShiftStatusChanged(int p0) throws android.os.RemoteException {}
        public void onTimeShiftStartPositionChanged(long p0) throws android.os.RemoteException {}
        public void onTimeShiftCurrentPositionChanged(long p0) throws android.os.RemoteException {}
        public void onTuned(android.net.Uri p0) throws android.os.RemoteException {}
        public void onRecordingStopped(android.net.Uri p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputSessionCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputSessionCallback";
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionEvent = 2;
        static final int TRANSACTION_onChannelRetuned = 3;
        static final int TRANSACTION_onTracksChanged = 4;
        static final int TRANSACTION_onTrackSelected = 5;
        static final int TRANSACTION_onVideoAvailable = 6;
        static final int TRANSACTION_onVideoUnavailable = 7;
        static final int TRANSACTION_onContentAllowed = 8;
        static final int TRANSACTION_onContentBlocked = 9;
        static final int TRANSACTION_onLayoutSurface = 10;
        static final int TRANSACTION_onTimeShiftStatusChanged = 11;
        static final int TRANSACTION_onTimeShiftStartPositionChanged = 12;
        static final int TRANSACTION_onTimeShiftCurrentPositionChanged = 13;
        static final int TRANSACTION_onTuned = 14;
        static final int TRANSACTION_onRecordingStopped = 15;
        static final int TRANSACTION_onError = 16;
        public Stub() { super(); }
        public static android.media.tv.ITvInputSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputSessionCallback p0) { return false; }
        public static android.media.tv.ITvInputSessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputSessionCallback {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputSessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(android.media.tv.ITvInputSession p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void onSessionEvent(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onChannelRetuned(android.net.Uri p0) throws android.os.RemoteException {}
            public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void onTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onVideoAvailable() throws android.os.RemoteException {}
            public void onVideoUnavailable(int p0) throws android.os.RemoteException {}
            public void onContentAllowed() throws android.os.RemoteException {}
            public void onContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onTimeShiftStatusChanged(int p0) throws android.os.RemoteException {}
            public void onTimeShiftStartPositionChanged(long p0) throws android.os.RemoteException {}
            public void onTimeShiftCurrentPositionChanged(long p0) throws android.os.RemoteException {}
            public void onTuned(android.net.Uri p0) throws android.os.RemoteException {}
            public void onRecordingStopped(android.net.Uri p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}
