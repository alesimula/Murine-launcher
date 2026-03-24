package android.media.tv;

public interface ITvInputSession extends android.os.IInterface {
    public void release() throws android.os.RemoteException;
    public void setMain(boolean p0) throws android.os.RemoteException;
    public void setSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setVolume(float p0) throws android.os.RemoteException;
    public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setCaptionEnabled(boolean p0) throws android.os.RemoteException;
    public void selectAudioPresentation(int p0, int p1) throws android.os.RemoteException;
    public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setInteractiveAppNotificationEnabled(boolean p0) throws android.os.RemoteException;
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException;
    public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException;
    public void removeOverlayView() throws android.os.RemoteException;
    public void unblockContent(java.lang.String p0) throws android.os.RemoteException;
    public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException;
    public void timeShiftPause() throws android.os.RemoteException;
    public void timeShiftResume() throws android.os.RemoteException;
    public void timeShiftSeekTo(long p0) throws android.os.RemoteException;
    public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException;
    public void timeShiftSetMode(int p0) throws android.os.RemoteException;
    public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException;
    public void resumePlayback() throws android.os.RemoteException;
    public void stopPlayback(int p0) throws android.os.RemoteException;
    public void startRecording(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void stopRecording() throws android.os.RemoteException;
    public void pauseRecording(android.os.Bundle p0) throws android.os.RemoteException;
    public void resumeRecording(android.os.Bundle p0) throws android.os.RemoteException;
    public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException;
    public void removeBroadcastInfo(int p0) throws android.os.RemoteException;
    public void requestAd(android.media.tv.AdRequest p0) throws android.os.RemoteException;
    public void notifyAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException;
    public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setTvMessageEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void setVideoFrozen(boolean p0) throws android.os.RemoteException;
    public void notifyTvAdSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputSession {
        public Default() {}
        public void release() throws android.os.RemoteException {}
        public void setMain(boolean p0) throws android.os.RemoteException {}
        public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void setVolume(float p0) throws android.os.RemoteException {}
        public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setCaptionEnabled(boolean p0) throws android.os.RemoteException {}
        public void selectAudioPresentation(int p0, int p1) throws android.os.RemoteException {}
        public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setInteractiveAppNotificationEnabled(boolean p0) throws android.os.RemoteException {}
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
        public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void removeOverlayView() throws android.os.RemoteException {}
        public void unblockContent(java.lang.String p0) throws android.os.RemoteException {}
        public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException {}
        public void timeShiftPause() throws android.os.RemoteException {}
        public void timeShiftResume() throws android.os.RemoteException {}
        public void timeShiftSeekTo(long p0) throws android.os.RemoteException {}
        public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
        public void timeShiftSetMode(int p0) throws android.os.RemoteException {}
        public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException {}
        public void resumePlayback() throws android.os.RemoteException {}
        public void stopPlayback(int p0) throws android.os.RemoteException {}
        public void startRecording(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void stopRecording() throws android.os.RemoteException {}
        public void pauseRecording(android.os.Bundle p0) throws android.os.RemoteException {}
        public void resumeRecording(android.os.Bundle p0) throws android.os.RemoteException {}
        public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
        public void removeBroadcastInfo(int p0) throws android.os.RemoteException {}
        public void requestAd(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
        public void notifyAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
        public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setTvMessageEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void setVideoFrozen(boolean p0) throws android.os.RemoteException {}
        public void notifyTvAdSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputSession {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputSession";
        static final int TRANSACTION_release = 1;
        static final int TRANSACTION_setMain = 2;
        static final int TRANSACTION_setSurface = 3;
        static final int TRANSACTION_dispatchSurfaceChanged = 4;
        static final int TRANSACTION_setVolume = 5;
        static final int TRANSACTION_tune = 6;
        static final int TRANSACTION_setCaptionEnabled = 7;
        static final int TRANSACTION_selectAudioPresentation = 8;
        static final int TRANSACTION_selectTrack = 9;
        static final int TRANSACTION_setInteractiveAppNotificationEnabled = 10;
        static final int TRANSACTION_appPrivateCommand = 11;
        static final int TRANSACTION_createOverlayView = 12;
        static final int TRANSACTION_relayoutOverlayView = 13;
        static final int TRANSACTION_removeOverlayView = 14;
        static final int TRANSACTION_unblockContent = 15;
        static final int TRANSACTION_timeShiftPlay = 16;
        static final int TRANSACTION_timeShiftPause = 17;
        static final int TRANSACTION_timeShiftResume = 18;
        static final int TRANSACTION_timeShiftSeekTo = 19;
        static final int TRANSACTION_timeShiftSetPlaybackParams = 20;
        static final int TRANSACTION_timeShiftSetMode = 21;
        static final int TRANSACTION_timeShiftEnablePositionTracking = 22;
        static final int TRANSACTION_resumePlayback = 23;
        static final int TRANSACTION_stopPlayback = 24;
        static final int TRANSACTION_startRecording = 25;
        static final int TRANSACTION_stopRecording = 26;
        static final int TRANSACTION_pauseRecording = 27;
        static final int TRANSACTION_resumeRecording = 28;
        static final int TRANSACTION_requestBroadcastInfo = 29;
        static final int TRANSACTION_removeBroadcastInfo = 30;
        static final int TRANSACTION_requestAd = 31;
        static final int TRANSACTION_notifyAdBufferReady = 32;
        static final int TRANSACTION_notifyTvMessage = 33;
        static final int TRANSACTION_setTvMessageEnabled = 34;
        static final int TRANSACTION_setVideoFrozen = 35;
        static final int TRANSACTION_notifyTvAdSessionData = 36;
        public Stub() { super(); }
        public static android.media.tv.ITvInputSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ITvInputSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void release() throws android.os.RemoteException {}
            public void setMain(boolean p0) throws android.os.RemoteException {}
            public void setSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void setVolume(float p0) throws android.os.RemoteException {}
            public void tune(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setCaptionEnabled(boolean p0) throws android.os.RemoteException {}
            public void selectAudioPresentation(int p0, int p1) throws android.os.RemoteException {}
            public void selectTrack(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setInteractiveAppNotificationEnabled(boolean p0) throws android.os.RemoteException {}
            public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void createOverlayView(android.os.IBinder p0, android.graphics.Rect p1) throws android.os.RemoteException {}
            public void relayoutOverlayView(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void removeOverlayView() throws android.os.RemoteException {}
            public void unblockContent(java.lang.String p0) throws android.os.RemoteException {}
            public void timeShiftPlay(android.net.Uri p0) throws android.os.RemoteException {}
            public void timeShiftPause() throws android.os.RemoteException {}
            public void timeShiftResume() throws android.os.RemoteException {}
            public void timeShiftSeekTo(long p0) throws android.os.RemoteException {}
            public void timeShiftSetPlaybackParams(android.media.PlaybackParams p0) throws android.os.RemoteException {}
            public void timeShiftSetMode(int p0) throws android.os.RemoteException {}
            public void timeShiftEnablePositionTracking(boolean p0) throws android.os.RemoteException {}
            public void resumePlayback() throws android.os.RemoteException {}
            public void stopPlayback(int p0) throws android.os.RemoteException {}
            public void startRecording(android.net.Uri p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void stopRecording() throws android.os.RemoteException {}
            public void pauseRecording(android.os.Bundle p0) throws android.os.RemoteException {}
            public void resumeRecording(android.os.Bundle p0) throws android.os.RemoteException {}
            public void requestBroadcastInfo(android.media.tv.BroadcastInfoRequest p0) throws android.os.RemoteException {}
            public void removeBroadcastInfo(int p0) throws android.os.RemoteException {}
            public void requestAd(android.media.tv.AdRequest p0) throws android.os.RemoteException {}
            public void notifyAdBufferReady(android.media.tv.AdBuffer p0) throws android.os.RemoteException {}
            public void notifyTvMessage(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setTvMessageEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void setVideoFrozen(boolean p0) throws android.os.RemoteException {}
            public void notifyTvAdSessionData(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}
