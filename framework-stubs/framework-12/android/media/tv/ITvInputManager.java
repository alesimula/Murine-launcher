package android.media.tv;

public interface ITvInputManager extends android.os.IInterface {
    public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException;
    public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException;
    public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException;
    public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException;
    public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException;
    public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException;
    public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, boolean p2, int p3, int p4) throws android.os.RemoteException;
    public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public int getClientPid(java.lang.String p0) throws android.os.RemoteException;
    public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException;
    public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException;
    public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
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
    public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException;
    public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException;
    public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
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

    public static class Default implements android.media.tv.ITvInputManager {
        public Default() {}
        public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException { return null; }
        public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException {}
        public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException { return null; }
        public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
        public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException { return null; }
        public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, boolean p2, int p3, int p4) throws android.os.RemoteException {}
        public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public int getClientPid(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
        public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
        public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
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
        public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
        public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException { return null; }
        public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
        public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
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
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputManager {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputManager";
        static final int TRANSACTION_getTvInputList = 1;
        static final int TRANSACTION_getTvInputInfo = 2;
        static final int TRANSACTION_updateTvInputInfo = 3;
        static final int TRANSACTION_getTvInputState = 4;
        static final int TRANSACTION_getTvContentRatingSystemList = 5;
        static final int TRANSACTION_registerCallback = 6;
        static final int TRANSACTION_unregisterCallback = 7;
        static final int TRANSACTION_isParentalControlsEnabled = 8;
        static final int TRANSACTION_setParentalControlsEnabled = 9;
        static final int TRANSACTION_isRatingBlocked = 10;
        static final int TRANSACTION_getBlockedRatings = 11;
        static final int TRANSACTION_addBlockedRating = 12;
        static final int TRANSACTION_removeBlockedRating = 13;
        static final int TRANSACTION_createSession = 14;
        static final int TRANSACTION_releaseSession = 15;
        static final int TRANSACTION_getClientPid = 16;
        static final int TRANSACTION_setMainSession = 17;
        static final int TRANSACTION_setSurface = 18;
        static final int TRANSACTION_dispatchSurfaceChanged = 19;
        static final int TRANSACTION_setVolume = 20;
        static final int TRANSACTION_tune = 21;
        static final int TRANSACTION_setCaptionEnabled = 22;
        static final int TRANSACTION_selectTrack = 23;
        static final int TRANSACTION_sendAppPrivateCommand = 24;
        static final int TRANSACTION_createOverlayView = 25;
        static final int TRANSACTION_relayoutOverlayView = 26;
        static final int TRANSACTION_removeOverlayView = 27;
        static final int TRANSACTION_unblockContent = 28;
        static final int TRANSACTION_timeShiftPlay = 29;
        static final int TRANSACTION_timeShiftPause = 30;
        static final int TRANSACTION_timeShiftResume = 31;
        static final int TRANSACTION_timeShiftSeekTo = 32;
        static final int TRANSACTION_timeShiftSetPlaybackParams = 33;
        static final int TRANSACTION_timeShiftEnablePositionTracking = 34;
        static final int TRANSACTION_getCurrentTunedInfos = 35;
        static final int TRANSACTION_startRecording = 36;
        static final int TRANSACTION_stopRecording = 37;
        static final int TRANSACTION_pauseRecording = 38;
        static final int TRANSACTION_resumeRecording = 39;
        static final int TRANSACTION_getHardwareList = 40;
        static final int TRANSACTION_acquireTvInputHardware = 41;
        static final int TRANSACTION_releaseTvInputHardware = 42;
        static final int TRANSACTION_getAvailableTvStreamConfigList = 43;
        static final int TRANSACTION_captureFrame = 44;
        static final int TRANSACTION_isSingleSessionActive = 45;
        static final int TRANSACTION_getDvbDeviceList = 46;
        static final int TRANSACTION_openDvbDevice = 47;
        static final int TRANSACTION_sendTvInputNotifyIntent = 48;
        static final int TRANSACTION_requestChannelBrowsable = 49;
        static final int TRANSACTION_addHardwareDevice = 50;
        static final int TRANSACTION_removeHardwareDevice = 51;
        public Stub() { super(); }
        public static android.media.tv.ITvInputManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputManager p0) { return false; }
        public static android.media.tv.ITvInputManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputManager {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.tv.TvInputInfo> getTvInputList(int p0) throws android.os.RemoteException { return null; }
            public android.media.tv.TvInputInfo getTvInputInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void updateTvInputInfo(android.media.tv.TvInputInfo p0, int p1) throws android.os.RemoteException {}
            public int getTvInputState(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.media.tv.TvContentRatingSystemInfo> getTvContentRatingSystemList(int p0) throws android.os.RemoteException { return null; }
            public void registerCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.ITvInputManagerCallback p0, int p1) throws android.os.RemoteException {}
            public boolean isParentalControlsEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setParentalControlsEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isRatingBlocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getBlockedRatings(int p0) throws android.os.RemoteException { return null; }
            public void addBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removeBlockedRating(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void createSession(android.media.tv.ITvInputClient p0, java.lang.String p1, boolean p2, int p3, int p4) throws android.os.RemoteException {}
            public void releaseSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public int getClientPid(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setMainSession(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void setSurface(android.os.IBinder p0, android.view.Surface p1, int p2) throws android.os.RemoteException {}
            public void dispatchSurfaceChanged(android.os.IBinder p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void setVolume(android.os.IBinder p0, float p1, int p2) throws android.os.RemoteException {}
            public void tune(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void setCaptionEnabled(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void selectTrack(android.os.IBinder p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
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
            public void timeShiftEnablePositionTracking(android.os.IBinder p0, boolean p1, int p2) throws android.os.RemoteException {}
            public java.util.List<android.media.tv.TunedInfo> getCurrentTunedInfos(int p0) throws android.os.RemoteException { return null; }
            public void startRecording(android.os.IBinder p0, android.net.Uri p1, android.os.Bundle p2, int p3) throws android.os.RemoteException {}
            public void stopRecording(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void pauseRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public void resumeRecording(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
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
        }
    }
}
