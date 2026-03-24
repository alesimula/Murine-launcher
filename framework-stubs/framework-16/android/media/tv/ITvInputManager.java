package android.media.tv;

public interface ITvInputManager extends android.os.IInterface {
    public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException;
    public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException;
    public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.IBinder getExtensionInterface(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException;
    public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException;
    public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException;
    public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException;
    public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, android.content.AttributionSource p2, boolean p3, int p4, int p5) throws android.os.RemoteException;
    public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public int getClientPid(java.lang.String p0) throws android.os.RemoteException;
    public int getClientPriority(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getClientUserId(java.lang.String p0) throws android.os.RemoteException;
    public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException;
    public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void selectAudioPresentation(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setInteractiveAppNotificationEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public void sendAppPrivateCommand(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void createOverlayView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException;
    public void relayoutOverlayView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException;
    public void removeOverlayView(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void unblockContent(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void timeShiftPlay(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException;
    public void timeShiftPause(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void timeShiftResume(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void timeShiftSeekTo(android.os.IBinder p0, long p1, int p2) throws android.os.RemoteException;
    public void timeShiftSetPlaybackParams(android.os.IBinder p0, android.media.PlaybackParams p1, int p2) throws android.os.RemoteException;
    public void timeShiftSetMode(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException;
    public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void resumePlayback(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void stopPlayback(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void requestBroadcastInfo(android.os.IBinder p0, android.media.tv.BroadcastInfoRequest p1, int p2) throws android.os.RemoteException;
    public void removeBroadcastInfo(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException;
    public void requestAd(android.os.IBinder p0, android.media.tv.AdRequest p1, int p2) throws android.os.RemoteException;
    public void notifyAdBufferReady(android.os.IBinder p0, android.media.tv.AdBuffer p1, int p2) throws android.os.RemoteException;
    public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void setTvMessageEnabled(android.os.IBinder p0, int p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TvInputHardwareInfo> getHardwareList() throws android.os.RemoteException;
    public android.media.tv.ITvInputHardware acquireTvInputHardware(int p0, android.media.tv.ITvInputHardwareCallback p1, android.media.tv.TvInputInfo p2, int p3, java.lang.String p4, int p5) throws android.os.RemoteException;
    public void releaseTvInputHardware(int p0, android.media.tv.ITvInputHardware p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TvStreamConfig> getAvailableTvStreamConfigList(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean captureFrame(java.lang.String p0, android.view.Surface p1, android.media.tv.TvStreamConfig p2, int p3) throws android.os.RemoteException;
    public boolean isSingleSessionActive(int p0) throws android.os.RemoteException;
    public java.util.List<android.media.tv.DvbDeviceInfo> getDvbDeviceList() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openDvbDevice(android.media.tv.DvbDeviceInfo p0, int p1) throws android.os.RemoteException;
    public void sendTvInputNotifyIntent(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public void requestChannelBrowsable(android.net.Uri p0, int p1) throws android.os.RemoteException;
    public void addHardwareDevice(int p0) throws android.os.RemoteException;
    public void removeHardwareDevice(int p0) throws android.os.RemoteException;
    public void setVideoFrozen(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public void notifyTvAdSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputManager {
        public Default() {}
        public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException { return null; }
        public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException {}
        public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder getExtensionInterface(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException { return null; }
        public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
        public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException { return null; }
        public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, android.content.AttributionSource p2, boolean p3, int p4, int p5) throws android.os.RemoteException {}
        public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public int getClientPid(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getClientPriority(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int getClientUserId(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
        public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void selectAudioPresentation(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setInteractiveAppNotificationEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void sendAppPrivateCommand(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void createOverlayView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
        public void relayoutOverlayView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
        public void removeOverlayView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void unblockContent(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void timeShiftPlay(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
        public void timeShiftPause(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void timeShiftResume(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void timeShiftSeekTo(android.os.IBinder p0, long p1, int p2) throws android.os.RemoteException {}
        public void timeShiftSetPlaybackParams(android.os.IBinder p0, android.media.PlaybackParams p1, int p2) throws android.os.RemoteException {}
        public void timeShiftSetMode(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException { return null; }
        public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void resumePlayback(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void stopPlayback(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void requestBroadcastInfo(android.os.IBinder p0, android.media.tv.BroadcastInfoRequest p1, int p2) throws android.os.RemoteException {}
        public void removeBroadcastInfo(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
        public void requestAd(android.os.IBinder p0, android.media.tv.AdRequest p1, int p2) throws android.os.RemoteException {}
        public void notifyAdBufferReady(android.os.IBinder p0, android.media.tv.AdBuffer p1, int p2) throws android.os.RemoteException {}
        public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void setTvMessageEnabled(android.os.IBinder p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
        public java.util.List<android.media.tv.TvInputHardwareInfo> getHardwareList() throws android.os.RemoteException { return null; }
        public android.media.tv.ITvInputHardware acquireTvInputHardware(int p0, android.media.tv.ITvInputHardwareCallback p1, android.media.tv.TvInputInfo p2, int p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
        public void releaseTvInputHardware(int p0, android.media.tv.ITvInputHardware p1, int p2) throws android.os.RemoteException {}
        public java.util.List<android.media.tv.TvStreamConfig> getAvailableTvStreamConfigList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean captureFrame(java.lang.String p0, android.view.Surface p1, android.media.tv.TvStreamConfig p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isSingleSessionActive(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.media.tv.DvbDeviceInfo> getDvbDeviceList() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openDvbDevice(android.media.tv.DvbDeviceInfo p0, int p1) throws android.os.RemoteException { return null; }
        public void sendTvInputNotifyIntent(android.content.Intent p0, int p1) throws android.os.RemoteException {}
        public void requestChannelBrowsable(android.net.Uri p0, int p1) throws android.os.RemoteException {}
        public void addHardwareDevice(int p0) throws android.os.RemoteException {}
        public void removeHardwareDevice(int p0) throws android.os.RemoteException {}
        public void setVideoFrozen(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void notifyTvAdSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputManager {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputManager";
        static final int TRANSACTION_getTvInputList = 1;
        static final int TRANSACTION_getTvInputInfo = 2;
        static final int TRANSACTION_updateTvInputInfo = 3;
        static final int TRANSACTION_getTvInputState = 4;
        static final int TRANSACTION_getAvailableExtensionInterfaceNames = 5;
        static final int TRANSACTION_getExtensionInterface = 6;
        static final int TRANSACTION_getTvContentRatingSystemList = 7;
        static final int TRANSACTION_registerCallback = 8;
        static final int TRANSACTION_unregisterCallback = 9;
        static final int TRANSACTION_isParentalControlsEnabled = 10;
        static final int TRANSACTION_setParentalControlsEnabled = 11;
        static final int TRANSACTION_isRatingBlocked = 12;
        static final int TRANSACTION_getBlockedRatings = 13;
        static final int TRANSACTION_addBlockedRating = 14;
        static final int TRANSACTION_removeBlockedRating = 15;
        static final int TRANSACTION_createSession = 16;
        static final int TRANSACTION_releaseSession = 17;
        static final int TRANSACTION_getClientPid = 18;
        static final int TRANSACTION_getClientPriority = 19;
        static final int TRANSACTION_getClientUserId = 20;
        static final int TRANSACTION_setMainSession = 21;
        static final int TRANSACTION_setSurface = 22;
        static final int TRANSACTION_dispatchSurfaceChanged = 23;
        static final int TRANSACTION_setVolume = 24;
        static final int TRANSACTION_tune = 25;
        static final int TRANSACTION_setCaptionEnabled = 26;
        static final int TRANSACTION_selectTrack = 27;
        static final int TRANSACTION_selectAudioPresentation = 28;
        static final int TRANSACTION_setInteractiveAppNotificationEnabled = 29;
        static final int TRANSACTION_sendAppPrivateCommand = 30;
        static final int TRANSACTION_createOverlayView = 31;
        static final int TRANSACTION_relayoutOverlayView = 32;
        static final int TRANSACTION_removeOverlayView = 33;
        static final int TRANSACTION_unblockContent = 34;
        static final int TRANSACTION_timeShiftPlay = 35;
        static final int TRANSACTION_timeShiftPause = 36;
        static final int TRANSACTION_timeShiftResume = 37;
        static final int TRANSACTION_timeShiftSeekTo = 38;
        static final int TRANSACTION_timeShiftSetPlaybackParams = 39;
        static final int TRANSACTION_timeShiftSetMode = 40;
        static final int TRANSACTION_timeShiftEnablePositionTracking = 41;
        static final int TRANSACTION_getCurrentTunedInfos = 42;
        static final int TRANSACTION_startRecording = 43;
        static final int TRANSACTION_stopRecording = 44;
        static final int TRANSACTION_pauseRecording = 45;
        static final int TRANSACTION_resumeRecording = 46;
        static final int TRANSACTION_resumePlayback = 47;
        static final int TRANSACTION_stopPlayback = 48;
        static final int TRANSACTION_requestBroadcastInfo = 49;
        static final int TRANSACTION_removeBroadcastInfo = 50;
        static final int TRANSACTION_requestAd = 51;
        static final int TRANSACTION_notifyAdBufferReady = 52;
        static final int TRANSACTION_notifyTvMessage = 53;
        static final int TRANSACTION_setTvMessageEnabled = 54;
        static final int TRANSACTION_getHardwareList = 55;
        static final int TRANSACTION_acquireTvInputHardware = 56;
        static final int TRANSACTION_releaseTvInputHardware = 57;
        static final int TRANSACTION_getAvailableTvStreamConfigList = 58;
        static final int TRANSACTION_captureFrame = 59;
        static final int TRANSACTION_isSingleSessionActive = 60;
        static final int TRANSACTION_getDvbDeviceList = 61;
        static final int TRANSACTION_openDvbDevice = 62;
        static final int TRANSACTION_sendTvInputNotifyIntent = 63;
        static final int TRANSACTION_requestChannelBrowsable = 64;
        static final int TRANSACTION_addHardwareDevice = 65;
        static final int TRANSACTION_removeHardwareDevice = 66;
        static final int TRANSACTION_setVideoFrozen = 67;
        static final int TRANSACTION_notifyTvAdSessionData = 68;
        public Stub() { super(); }
        public static android.media.tv.ITvInputManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ITvInputManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException { return null; }
            public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException {}
            public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.IBinder getExtensionInterface(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException { return null; }
            public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
            public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException { return null; }
            public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, android.content.AttributionSource p2, boolean p3, int p4, int p5) throws android.os.RemoteException {}
            public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public int getClientPid(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getClientPriority(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int getClientUserId(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
            public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void selectAudioPresentation(android.os.IBinder p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setInteractiveAppNotificationEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void sendAppPrivateCommand(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void createOverlayView(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, int p3) throws android.os.RemoteException {}
            public void relayoutOverlayView(android.os.IBinder p0, android.graphics.Rect p1, int p2) throws android.os.RemoteException {}
            public void removeOverlayView(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void unblockContent(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void timeShiftPlay(android.os.IBinder p0, android.net.Uri p1, int p2) throws android.os.RemoteException {}
            public void timeShiftPause(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void timeShiftResume(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void timeShiftSeekTo(android.os.IBinder p0, long p1, int p2) throws android.os.RemoteException {}
            public void timeShiftSetPlaybackParams(android.os.IBinder p0, android.media.PlaybackParams p1, int p2) throws android.os.RemoteException {}
            public void timeShiftSetMode(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException { return null; }
            public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void resumePlayback(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void stopPlayback(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void requestBroadcastInfo(android.os.IBinder p0, android.media.tv.BroadcastInfoRequest p1, int p2) throws android.os.RemoteException {}
            public void removeBroadcastInfo(android.os.IBinder p0, int p1, int p2) throws android.os.RemoteException {}
            public void requestAd(android.os.IBinder p0, android.media.tv.AdRequest p1, int p2) throws android.os.RemoteException {}
            public void notifyAdBufferReady(android.os.IBinder p0, android.media.tv.AdBuffer p1, int p2) throws android.os.RemoteException {}
            public void notifyTvMessage(android.os.IBinder p0, int p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void setTvMessageEnabled(android.os.IBinder p0, int p1, boolean p2, int p3) throws android.os.RemoteException {}
            public java.util.List<android.media.tv.TvInputHardwareInfo> getHardwareList() throws android.os.RemoteException { return null; }
            public android.media.tv.ITvInputHardware acquireTvInputHardware(int p0, android.media.tv.ITvInputHardwareCallback p1, android.media.tv.TvInputInfo p2, int p3, java.lang.String p4, int p5) throws android.os.RemoteException { return null; }
            public void releaseTvInputHardware(int p0, android.media.tv.ITvInputHardware p1, int p2) throws android.os.RemoteException {}
            public java.util.List<android.media.tv.TvStreamConfig> getAvailableTvStreamConfigList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean captureFrame(java.lang.String p0, android.view.Surface p1, android.media.tv.TvStreamConfig p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isSingleSessionActive(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.media.tv.DvbDeviceInfo> getDvbDeviceList() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openDvbDevice(android.media.tv.DvbDeviceInfo p0, int p1) throws android.os.RemoteException { return null; }
            public void sendTvInputNotifyIntent(android.content.Intent p0, int p1) throws android.os.RemoteException {}
            public void requestChannelBrowsable(android.net.Uri p0, int p1) throws android.os.RemoteException {}
            public void addHardwareDevice(int p0) throws android.os.RemoteException {}
            public void removeHardwareDevice(int p0) throws android.os.RemoteException {}
            public void setVideoFrozen(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void notifyTvAdSessionData(android.os.IBinder p0, java.lang.String p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        }
    }
}
