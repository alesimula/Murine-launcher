package android.media.tv;

public interface ITvInputClient extends android.os.IInterface {
    public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException;
    public void onSessionReleased(int p0) throws android.os.RemoteException;
    public void onSessionEvent(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void onChannelRetuned(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public void onAudioPresentationsChanged(java.util.List<android.media.AudioPresentation> p0, int p1) throws android.os.RemoteException;
    public void onAudioPresentationSelected(int p0, int p1, int p2) throws android.os.RemoteException;
    public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException;
    public void onTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void onVideoAvailable(int p0) throws android.os.RemoteException;
    public void onVideoUnavailable(int p0, int p1) throws android.os.RemoteException;
    public void onContentAllowed(int p0) throws android.os.RemoteException;
    public void onContentBlocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onTimeShiftStatusChanged(int p0, int p1) throws android.os.RemoteException;
    public void onTimeShiftStartPositionChanged(long p0, int p1) throws android.os.RemoteException;
    public void onTimeShiftCurrentPositionChanged(long p0, int p1) throws android.os.RemoteException;
    public void onAitInfoUpdated(android.media.tv.AitInfo p0, int p1) throws android.os.RemoteException;
    public void onSignalStrength(int p0, int p1) throws android.os.RemoteException;
    public void onCueingMessageAvailability(boolean p0, int p1) throws android.os.RemoteException;
    public void onTimeShiftMode(int p0, int p1) throws android.os.RemoteException;
    public void onAvailableSpeeds(float[] p0, int p1) throws android.os.RemoteException;
    public void onTvMessage(int p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void onTuned(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public void onRecordingStopped(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public void onError(int p0, int p1) throws android.os.RemoteException;
    public void onBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0, int p1) throws android.os.RemoteException;
    public void onAdResponse(android.media.tv.AdResponse p0, int p1) throws android.os.RemoteException;
    public void onAdBufferConsumed(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputClient {
        public Default() {}
        public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
        public void onSessionReleased(int p0) throws android.os.RemoteException {}
        public void onSessionEvent(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void onChannelRetuned(android.net.Uri p0, int p1) throws android.os.RemoteException {}
        public void onAudioPresentationsChanged(java.util.List<android.media.AudioPresentation> p0, int p1) throws android.os.RemoteException {}
        public void onAudioPresentationSelected(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException {}
        public void onTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void onVideoAvailable(int p0) throws android.os.RemoteException {}
        public void onVideoUnavailable(int p0, int p1) throws android.os.RemoteException {}
        public void onContentAllowed(int p0) throws android.os.RemoteException {}
        public void onContentBlocked(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onTimeShiftStatusChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onTimeShiftStartPositionChanged(long p0, int p1) throws android.os.RemoteException {}
        public void onTimeShiftCurrentPositionChanged(long p0, int p1) throws android.os.RemoteException {}
        public void onAitInfoUpdated(android.media.tv.AitInfo p0, int p1) throws android.os.RemoteException {}
        public void onSignalStrength(int p0, int p1) throws android.os.RemoteException {}
        public void onCueingMessageAvailability(boolean p0, int p1) throws android.os.RemoteException {}
        public void onTimeShiftMode(int p0, int p1) throws android.os.RemoteException {}
        public void onAvailableSpeeds(float[] p0, int p1) throws android.os.RemoteException {}
        public void onTvMessage(int p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void onTuned(android.net.Uri p0, int p1) throws android.os.RemoteException {}
        public void onRecordingStopped(android.net.Uri p0, int p1) throws android.os.RemoteException {}
        public void onError(int p0, int p1) throws android.os.RemoteException {}
        public void onBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0, int p1) throws android.os.RemoteException {}
        public void onAdResponse(android.media.tv.AdResponse p0, int p1) throws android.os.RemoteException {}
        public void onAdBufferConsumed(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputClient {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputClient";
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionReleased = 2;
        static final int TRANSACTION_onSessionEvent = 3;
        static final int TRANSACTION_onChannelRetuned = 4;
        static final int TRANSACTION_onAudioPresentationsChanged = 5;
        static final int TRANSACTION_onAudioPresentationSelected = 6;
        static final int TRANSACTION_onTracksChanged = 7;
        static final int TRANSACTION_onTrackSelected = 8;
        static final int TRANSACTION_onVideoAvailable = 9;
        static final int TRANSACTION_onVideoUnavailable = 10;
        static final int TRANSACTION_onContentAllowed = 11;
        static final int TRANSACTION_onContentBlocked = 12;
        static final int TRANSACTION_onLayoutSurface = 13;
        static final int TRANSACTION_onTimeShiftStatusChanged = 14;
        static final int TRANSACTION_onTimeShiftStartPositionChanged = 15;
        static final int TRANSACTION_onTimeShiftCurrentPositionChanged = 16;
        static final int TRANSACTION_onAitInfoUpdated = 17;
        static final int TRANSACTION_onSignalStrength = 18;
        static final int TRANSACTION_onCueingMessageAvailability = 19;
        static final int TRANSACTION_onTimeShiftMode = 20;
        static final int TRANSACTION_onAvailableSpeeds = 21;
        static final int TRANSACTION_onTvMessage = 22;
        static final int TRANSACTION_onTuned = 23;
        static final int TRANSACTION_onRecordingStopped = 24;
        static final int TRANSACTION_onError = 25;
        static final int TRANSACTION_onBroadcastInfoResponse = 26;
        static final int TRANSACTION_onAdResponse = 27;
        static final int TRANSACTION_onAdBufferConsumed = 28;
        public Stub() { super(); }
        public static android.media.tv.ITvInputClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ITvInputClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(java.lang.String p0, android.os.IBinder p1, android.view.InputChannel p2, int p3) throws android.os.RemoteException {}
            public void onSessionReleased(int p0) throws android.os.RemoteException {}
            public void onSessionEvent(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void onChannelRetuned(android.net.Uri p0, int p1) throws android.os.RemoteException {}
            public void onAudioPresentationsChanged(java.util.List<android.media.AudioPresentation> p0, int p1) throws android.os.RemoteException {}
            public void onAudioPresentationSelected(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void onTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0, int p1) throws android.os.RemoteException {}
            public void onTrackSelected(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void onVideoAvailable(int p0) throws android.os.RemoteException {}
            public void onVideoUnavailable(int p0, int p1) throws android.os.RemoteException {}
            public void onContentAllowed(int p0) throws android.os.RemoteException {}
            public void onContentBlocked(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onLayoutSurface(int p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onTimeShiftStatusChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onTimeShiftStartPositionChanged(long p0, int p1) throws android.os.RemoteException {}
            public void onTimeShiftCurrentPositionChanged(long p0, int p1) throws android.os.RemoteException {}
            public void onAitInfoUpdated(android.media.tv.AitInfo p0, int p1) throws android.os.RemoteException {}
            public void onSignalStrength(int p0, int p1) throws android.os.RemoteException {}
            public void onCueingMessageAvailability(boolean p0, int p1) throws android.os.RemoteException {}
            public void onTimeShiftMode(int p0, int p1) throws android.os.RemoteException {}
            public void onAvailableSpeeds(float[] p0, int p1) throws android.os.RemoteException {}
            public void onTvMessage(int p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void onTuned(android.net.Uri p0, int p1) throws android.os.RemoteException {}
            public void onRecordingStopped(android.net.Uri p0, int p1) throws android.os.RemoteException {}
            public void onError(int p0, int p1) throws android.os.RemoteException {}
            public void onBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0, int p1) throws android.os.RemoteException {}
            public void onAdResponse(android.media.tv.AdResponse p0, int p1) throws android.os.RemoteException {}
            public void onAdBufferConsumed(android.media.tv.AdBuffer p0, int p1) throws android.os.RemoteException {}
        }
    }
}
