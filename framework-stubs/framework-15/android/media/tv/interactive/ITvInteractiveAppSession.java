package android.media.tv.interactive;

public interface ITvInteractiveAppSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.interactive.ITvInteractiveAppSession";
    public void startInteractiveApp() throws android.os.RemoteException;
    public void stopInteractiveApp() throws android.os.RemoteException;
    public void resetInteractiveApp() throws android.os.RemoteException;
    public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException;
    public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException;
    public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException;
    public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException;
    public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException;
    public void sendStreamVolume(float p0) throws android.os.RemoteException;
    public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException;
    public void sendTimeShiftMode(int p0) throws android.os.RemoteException;
    public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException;
    public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException;
    public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException;
    public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException;
    public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;
    public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException;
    public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void notifyVideoAvailable() throws android.os.RemoteException;
    public void notifyVideoUnavailable(int p0) throws android.os.RemoteException;
    public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException;
    public void notifyContentAllowed() throws android.os.RemoteException;
    public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException;
    public void notifySignalStrength(int p0) throws android.os.RemoteException;
    public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException;
    public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException;
    public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException;
    public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException;
    public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException;
    public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException;
    public void removeMediaView() throws android.os.RemoteException;

    public static class Default implements android.media.tv.interactive.ITvInteractiveAppSession {
        public Default() {}
        public void startInteractiveApp() throws android.os.RemoteException {}
        public void stopInteractiveApp() throws android.os.RemoteException {}
        public void resetInteractiveApp() throws android.os.RemoteException {}
        public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException {}
        public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException {}
        public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
        public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException {}
        public void sendStreamVolume(float p0) throws android.os.RemoteException {}
        public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
        public void sendTimeShiftMode(int p0) throws android.os.RemoteException {}
        public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException {}
        public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException {}
        public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException {}
        public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
        public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
        public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException {}
        public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void notifyVideoAvailable() throws android.os.RemoteException {}
        public void notifyVideoUnavailable(int p0) throws android.os.RemoteException {}
        public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException {}
        public void notifyContentAllowed() throws android.os.RemoteException {}
        public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
        public void notifySignalStrength(int p0) throws android.os.RemoteException {}
        public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException {}
        public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException {}
        public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
        public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
        public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void removeMediaView() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.interactive.ITvInteractiveAppSession {
        static final int TRANSACTION_startInteractiveApp = 1;
        static final int TRANSACTION_stopInteractiveApp = 2;
        static final int TRANSACTION_resetInteractiveApp = 3;
        static final int TRANSACTION_createBiInteractiveApp = 4;
        static final int TRANSACTION_destroyBiInteractiveApp = 5;
        static final int TRANSACTION_setTeletextAppEnabled = 6;
        static final int TRANSACTION_sendCurrentVideoBounds = 7;
        static final int TRANSACTION_sendCurrentChannelUri = 8;
        static final int TRANSACTION_sendCurrentChannelLcn = 9;
        static final int TRANSACTION_sendStreamVolume = 10;
        static final int TRANSACTION_sendTrackInfoList = 11;
        static final int TRANSACTION_sendCurrentTvInputId = 12;
        static final int TRANSACTION_sendTimeShiftMode = 13;
        static final int TRANSACTION_sendAvailableSpeeds = 14;
        static final int TRANSACTION_sendSigningResult = 15;
        static final int TRANSACTION_sendCertificate = 16;
        static final int TRANSACTION_sendTvRecordingInfo = 17;
        static final int TRANSACTION_sendTvRecordingInfoList = 18;
        static final int TRANSACTION_notifyError = 19;
        static final int TRANSACTION_notifyTimeShiftPlaybackParams = 20;
        static final int TRANSACTION_notifyTimeShiftStatusChanged = 21;
        static final int TRANSACTION_notifyTimeShiftStartPositionChanged = 22;
        static final int TRANSACTION_notifyTimeShiftCurrentPositionChanged = 23;
        static final int TRANSACTION_notifyRecordingConnectionFailed = 24;
        static final int TRANSACTION_notifyRecordingDisconnected = 25;
        static final int TRANSACTION_notifyRecordingTuned = 26;
        static final int TRANSACTION_notifyRecordingError = 27;
        static final int TRANSACTION_notifyRecordingScheduled = 28;
        static final int TRANSACTION_release = 29;
        static final int TRANSACTION_notifyTuned = 30;
        static final int TRANSACTION_notifyTrackSelected = 31;
        static final int TRANSACTION_notifyTracksChanged = 32;
        static final int TRANSACTION_notifyVideoAvailable = 33;
        static final int TRANSACTION_notifyVideoUnavailable = 34;
        static final int TRANSACTION_notifyVideoFreezeUpdated = 35;
        static final int TRANSACTION_notifyContentAllowed = 36;
        static final int TRANSACTION_notifyContentBlocked = 37;
        static final int TRANSACTION_notifySignalStrength = 38;
        static final int TRANSACTION_notifyRecordingStarted = 39;
        static final int TRANSACTION_notifyRecordingStopped = 40;
        static final int TRANSACTION_notifyTvMessage = 41;
        static final int TRANSACTION_setSurface = 42;
        static final int TRANSACTION_dispatchSurfaceChanged = 43;
        static final int TRANSACTION_notifyBroadcastInfoResponse = 44;
        static final int TRANSACTION_notifyAdResponse = 45;
        static final int TRANSACTION_notifyAdBufferConsumed = 46;
        static final int TRANSACTION_sendSelectedTrackInfo = 47;
        static final int TRANSACTION_createMediaView = 48;
        static final int TRANSACTION_relayoutMediaView = 49;
        static final int TRANSACTION_removeMediaView = 50;
        public Stub() { super(); }
        public static android.media.tv.interactive.ITvInteractiveAppSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.interactive.ITvInteractiveAppSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startInteractiveApp() throws android.os.RemoteException {}
            public void stopInteractiveApp() throws android.os.RemoteException {}
            public void resetInteractiveApp() throws android.os.RemoteException {}
            public void createBiInteractiveApp(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void destroyBiInteractiveApp(java.lang.String p0) throws android.os.RemoteException {}
            public void setTeletextAppEnabled(boolean p0) throws android.os.RemoteException {}
            public void sendCurrentVideoBounds(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void sendCurrentChannelUri(android.net.Uri p0) throws android.os.RemoteException {}
            public void sendCurrentChannelLcn(int p0) throws android.os.RemoteException {}
            public void sendStreamVolume(float p0) throws android.os.RemoteException {}
            public void sendTrackInfoList(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void sendCurrentTvInputId(java.lang.String p0) throws android.os.RemoteException {}
            public void sendTimeShiftMode(int p0) throws android.os.RemoteException {}
            public void sendAvailableSpeeds(float[] p0) throws android.os.RemoteException {}
            public void sendSigningResult(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public void sendCertificate(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void sendTvRecordingInfo(android.media.tv.TvRecordingInfo p0) throws android.os.RemoteException {}
            public void sendTvRecordingInfoList(java.util.List<android.media.tv.TvRecordingInfo> p0) throws android.os.RemoteException {}
            public void notifyError(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void notifyTimeShiftPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
            public void notifyTimeShiftStatusChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyTimeShiftStartPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void notifyTimeShiftCurrentPositionChanged(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void notifyRecordingConnectionFailed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingDisconnected(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingTuned(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException {}
            public void notifyRecordingError(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyRecordingScheduled(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
            public void notifyTuned(android.net.Uri p0) throws android.os.RemoteException {}
            public void notifyTrackSelected(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyTracksChanged(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void notifyVideoAvailable() throws android.os.RemoteException {}
            public void notifyVideoUnavailable(int p0) throws android.os.RemoteException {}
            public void notifyVideoFreezeUpdated(boolean p0) throws android.os.RemoteException {}
            public void notifyContentAllowed() throws android.os.RemoteException {}
            public void notifyContentBlocked(java.lang.String p0) throws android.os.RemoteException {}
            public void notifySignalStrength(int p0) throws android.os.RemoteException {}
            public void notifyRecordingStarted(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyRecordingStopped(java.lang.String p0) throws android.os.RemoteException {}
            public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void notifyBroadcastInfoResponse(android.media.tv.BroadcastInfoResponse p0) throws android.os.RemoteException {}
            public void notifyAdResponse(android.media.tv.AdResponse p0) throws android.os.RemoteException {}
            public void notifyAdBufferConsumed(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
            public void sendSelectedTrackInfo(java.util.List<android.media.tv.TvTrackInfo> p0) throws android.os.RemoteException {}
            public void createMediaView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void relayoutMediaView(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void removeMediaView() throws android.os.RemoteException {}
        }
    }
}
