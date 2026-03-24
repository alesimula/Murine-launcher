package android.media;

public class MediaPlayer extends android.media.PlayerBase implements android.media.SubtitleController.Listener, android.media.VolumeAutomation, android.media.AudioRouting {
    public static final boolean METADATA_UPDATE_ONLY = true;
    @android.annotation.UnsupportedAppUsage
    public static final boolean METADATA_ALL = false;
    public static final boolean APPLY_METADATA_FILTER = true;
    @android.annotation.UnsupportedAppUsage
    public static final boolean BYPASS_METADATA_FILTER = false;
    private static final java.lang.String TAG = "MediaPlayer";
    private static final java.lang.String IMEDIA_PLAYER = "android.media.IMediaPlayer";
    private long mNativeContext;
    private long mNativeSurfaceTexture;
    private int mListenerContext;
    private android.view.SurfaceHolder mSurfaceHolder;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.EventHandler mEventHandler;
    private android.os.PowerManager.WakeLock mWakeLock;
    private boolean mScreenOnWhilePlaying;
    private boolean mStayAwake;
    private int mStreamType;
    private int mUsage;
    private java.util.UUID mDrmUUID;
    private final java.lang.Object mDrmLock = null;
    private android.media.MediaPlayer.DrmInfo mDrmInfo;
    private android.media.MediaDrm mDrmObj;
    private byte[] mDrmSessionId;
    private boolean mDrmInfoResolved;
    private boolean mActiveDrmScheme;
    private boolean mDrmConfigAllowed;
    private boolean mDrmProvisioningInProgress;
    private boolean mPrepareDrmInProgress;
    private android.media.MediaPlayer.ProvisioningThread mDrmProvisioningThread;
    private static final int INVOKE_ID_GET_TRACK_INFO = 1;
    private static final int INVOKE_ID_ADD_EXTERNAL_SOURCE = 2;
    private static final int INVOKE_ID_ADD_EXTERNAL_SOURCE_FD = 3;
    private static final int INVOKE_ID_SELECT_TRACK = 4;
    private static final int INVOKE_ID_DESELECT_TRACK = 5;
    private static final int INVOKE_ID_SET_VIDEO_SCALE_MODE = 6;
    private static final int INVOKE_ID_GET_SELECTED_TRACK = 7;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    private android.media.AudioDeviceInfo mPreferredDevice;
    private android.util.ArrayMap<android.media.AudioRouting.OnRoutingChangedListener, android.media.NativeRoutingEventHandlerDelegate> mRoutingChangeListeners;
    public static final int PLAYBACK_RATE_AUDIO_MODE_RESAMPLE = 2;
    public static final int PLAYBACK_RATE_AUDIO_MODE_STRETCH = 1;
    public static final int PLAYBACK_RATE_AUDIO_MODE_DEFAULT = 0;
    public static final int SEEK_PREVIOUS_SYNC = 0;
    public static final int SEEK_NEXT_SYNC = 1;
    public static final int SEEK_CLOSEST_SYNC = 2;
    public static final int SEEK_CLOSEST = 3;
    private static final int KEY_PARAMETER_AUDIO_ATTRIBUTES = 1400;
    private java.util.Vector<android.util.Pair<java.lang.Integer, android.media.SubtitleTrack>> mIndexTrackPairs;
    private java.util.BitSet mInbandTrackIndices;
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_VTT = "text/vtt";
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_CEA_608 = "text/cea-608";
    public static final java.lang.String MEDIA_MIMETYPE_TEXT_CEA_708 = "text/cea-708";
    private android.media.SubtitleController mSubtitleController;
    private int mSelectedSubtitleTrackIndex;
    private java.util.Vector<java.io.InputStream> mOpenSubtitleSources;
    private final android.media.MediaPlayer.OnSubtitleDataListener mIntSubtitleDataListener = null;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_STARTED = 6;
    private static final int MEDIA_PAUSED = 7;
    private static final int MEDIA_STOPPED = 8;
    private static final int MEDIA_SKIPPED = 9;
    private static final int MEDIA_NOTIFY_TIME = 98;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_SUBTITLE_DATA = 201;
    private static final int MEDIA_META_DATA = 202;
    private static final int MEDIA_DRM_INFO = 210;
    private static final int MEDIA_TIME_DISCONTINUITY = 211;
    private static final int MEDIA_AUDIO_ROUTING_CHANGED = 10000;
    private android.media.MediaPlayer.TimeProvider mTimeProvider;
    private final java.lang.Object mTimeProviderLock = null;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private final android.media.MediaPlayer.OnCompletionListener mOnCompletionInternalListener = null;
    private android.media.MediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private android.media.MediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnTimedTextListener mOnTimedTextListener;
    private boolean mSubtitleDataListenerDisabled;
    private android.media.MediaPlayer.OnSubtitleDataListener mExtSubtitleDataListener;
    private android.os.Handler mExtSubtitleDataHandler;
    private android.media.MediaPlayer.OnMediaTimeDiscontinuityListener mOnMediaTimeDiscontinuityListener;
    private android.os.Handler mOnMediaTimeDiscontinuityHandler;
    private android.media.MediaPlayer.OnTimedMetaDataAvailableListener mOnTimedMetaDataAvailableListener;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_SYSTEM = -2147483648;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    @android.annotation.UnsupportedAppUsage
    public static final int MEDIA_INFO_EXTERNAL_METADATA_UPDATE = 803;
    public static final int MEDIA_INFO_AUDIO_NOT_PLAYING = 804;
    public static final int MEDIA_INFO_VIDEO_NOT_PLAYING = 805;
    @android.annotation.UnsupportedAppUsage
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer.OnInfoListener mOnInfoListener;
    private android.media.MediaPlayer.OnDrmConfigHelper mOnDrmConfigHelper;
    private android.media.MediaPlayer.OnDrmInfoHandlerDelegate mOnDrmInfoHandlerDelegate;
    public static final int PREPARE_DRM_STATUS_SUCCESS = 0;
    public static final int PREPARE_DRM_STATUS_PROVISIONING_NETWORK_ERROR = 1;
    public static final int PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR = 2;
    public static final int PREPARE_DRM_STATUS_PREPARATION_ERROR = 3;
    private android.media.MediaPlayer.OnDrmPreparedHandlerDelegate mOnDrmPreparedHandlerDelegate;
    public MediaPlayer() { super(null, 0); }
    private native void _setVideoSurface(android.view.Surface p0);
    @android.annotation.UnsupportedAppUsage
    public android.os.Parcel newRequest() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void invoke(android.os.Parcel p0, android.os.Parcel p1) {}
    public void setDisplay(android.view.SurfaceHolder p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setVideoScalingMode(int p0) {}
    public static android.media.MediaPlayer create(android.content.Context p0, android.net.Uri p1) { return null; }
    public static android.media.MediaPlayer create(android.content.Context p0, android.net.Uri p1, android.view.SurfaceHolder p2) { return null; }
    public static android.media.MediaPlayer create(android.content.Context p0, android.net.Uri p1, android.view.SurfaceHolder p2, android.media.AudioAttributes p3, int p4) { return null; }
    public static android.media.MediaPlayer create(android.content.Context p0, int p1) { return null; }
    public static android.media.MediaPlayer create(android.content.Context p0, int p1, android.media.AudioAttributes p2, int p3) { return null; }
    public void setDataSource(android.content.Context p0, android.net.Uri p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    public void setDataSource(android.content.Context p0, android.net.Uri p1, java.util.Map<java.lang.String, java.lang.String> p2, java.util.List<java.net.HttpCookie> p3) throws java.io.IOException {}
    public void setDataSource(android.content.Context p0, android.net.Uri p1, java.util.Map<java.lang.String, java.lang.String> p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    private boolean attemptDataSource(android.content.ContentResolver p0, android.net.Uri p1) { return false; }
    public void setDataSource(java.lang.String p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.UnsupportedAppUsage
    public void setDataSource(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.UnsupportedAppUsage
    private void setDataSource(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1, java.util.List<java.net.HttpCookie> p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    @android.annotation.UnsupportedAppUsage
    private void setDataSource(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2, java.util.List<java.net.HttpCookie> p3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException {}
    private native void nativeSetDataSource(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.SecurityException, java.lang.IllegalStateException;
    public void setDataSource(android.content.res.AssetFileDescriptor p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setDataSource(java.io.FileDescriptor p0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void setDataSource(java.io.FileDescriptor p0, long p1, long p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    private native void _setDataSource(java.io.FileDescriptor p0, long p1, long p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void setDataSource(android.media.MediaDataSource p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    private native void _setDataSource(android.media.MediaDataSource p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public void prepare() throws java.io.IOException, java.lang.IllegalStateException {}
    private native void _prepare() throws java.io.IOException, java.lang.IllegalStateException;
    public native void prepareAsync() throws java.lang.IllegalStateException;
    public void start() throws java.lang.IllegalStateException {}
    private void startImpl() {}
    private native void _start() throws java.lang.IllegalStateException;
    private int getAudioStreamType() { return 0; }
    private native int _getAudioStreamType() throws java.lang.IllegalStateException;
    public void stop() throws java.lang.IllegalStateException {}
    private native void _stop() throws java.lang.IllegalStateException;
    public void pause() throws java.lang.IllegalStateException {}
    private native void _pause() throws java.lang.IllegalStateException;
    void playerStart() {}
    void playerPause() {}
    void playerStop() {}
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    public android.media.VolumeShaper createVolumeShaper(android.media.VolumeShaper.Configuration p0) { return null; }
    private native int native_applyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1);
    private native android.media.VolumeShaper.State native_getVolumeShaperState(int p0);
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    private void enableNativeRoutingCallbacksLocked(boolean p0) {}
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    private final native boolean native_setOutputDevice(int p0);
    private final native int native_getRoutedDeviceId();
    private final native void native_enableDeviceCallback(boolean p0);
    public void setWakeMode(android.content.Context p0, int p1) {}
    public void setScreenOnWhilePlaying(boolean p0) {}
    private void stayAwake(boolean p0) {}
    private void updateSurfaceScreenOn() {}
    public native int getVideoWidth();
    public native int getVideoHeight();
    public android.os.PersistableBundle getMetrics() { return null; }
    private native android.os.PersistableBundle native_getMetrics();
    public native boolean isPlaying();
    public android.media.PlaybackParams easyPlaybackParams(float p0, int p1) { return null; }
    public native void setPlaybackParams(android.media.PlaybackParams p0);
    public native android.media.PlaybackParams getPlaybackParams();
    public native void setSyncParams(android.media.SyncParams p0);
    public native android.media.SyncParams getSyncParams();
    private final native void _seekTo(long p0, int p1);
    public void seekTo(long p0, int p1) {}
    public void seekTo(int p0) throws java.lang.IllegalStateException {}
    public android.media.MediaTimestamp getTimestamp() { return null; }
    public native int getCurrentPosition();
    public native int getDuration();
    @android.annotation.UnsupportedAppUsage
    public android.media.Metadata getMetadata(boolean p0, boolean p1) { return null; }
    public int setMetadataFilter(java.util.Set<java.lang.Integer> p0, java.util.Set<java.lang.Integer> p1) { return 0; }
    public native void setNextMediaPlayer(android.media.MediaPlayer p0);
    public void release() {}
    private native void _release();
    public void reset() {}
    private native void _reset();
    public void notifyAt(long p0) {}
    private native void _notifyAt(long p0);
    public void setAudioStreamType(int p0) {}
    private native void _setAudioStreamType(int p0);
    @android.annotation.UnsupportedAppUsage
    private native boolean setParameter(int p0, android.os.Parcel p1);
    public void setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException {}
    public native void setLooping(boolean p0);
    public native boolean isLooping();
    public void setVolume(float p0, float p1) {}
    void playerSetVolume(boolean p0, float p1, float p2) {}
    private native void _setVolume(float p0, float p1);
    public void setVolume(float p0) {}
    public native void setAudioSessionId(int p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;
    public native int getAudioSessionId();
    public native void attachAuxEffect(int p0);
    public void setAuxEffectSendLevel(float p0) {}
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    private native void _setAuxEffectSendLevel(float p0);
    private final native int native_invoke(android.os.Parcel p0, android.os.Parcel p1);
    private final native boolean native_getMetadata(boolean p0, boolean p1, android.os.Parcel p2);
    private final native int native_setMetadataFilter(android.os.Parcel p0);
    private static final native void native_init();
    private final native void native_setup(java.lang.Object p0);
    private final native void native_finalize();
    public android.media.MediaPlayer.TrackInfo[] getTrackInfo() throws java.lang.IllegalStateException { return null; }
    private android.media.MediaPlayer.TrackInfo[] getInbandTrackInfo() throws java.lang.IllegalStateException { return null; }
    private static boolean availableMimeTypeForExternalSource(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void setSubtitleAnchor(android.media.SubtitleController p0, android.media.SubtitleController.Anchor p1) {}
    private synchronized void setSubtitleAnchor() {}
    public void onSubtitleTrackSelected(android.media.SubtitleTrack p0) {}
    @android.annotation.UnsupportedAppUsage
    public void addSubtitleSource(java.io.InputStream p0, android.media.MediaFormat p1) throws java.lang.IllegalStateException {}
    private void scanInternalSubtitleTracks() {}
    private void populateInbandTracks() {}
    public void addTimedTextSource(java.lang.String p0, java.lang.String p1) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void addTimedTextSource(android.content.Context p0, android.net.Uri p1, java.lang.String p2) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void addTimedTextSource(java.io.FileDescriptor p0, java.lang.String p1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public void addTimedTextSource(java.io.FileDescriptor p0, long p1, long p2, java.lang.String p3) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {}
    public int getSelectedTrack(int p0) throws java.lang.IllegalStateException { return 0; }
    public void selectTrack(int p0) throws java.lang.IllegalStateException {}
    public void deselectTrack(int p0) throws java.lang.IllegalStateException {}
    private void selectOrDeselectTrack(int p0, boolean p1) throws java.lang.IllegalStateException {}
    private void selectOrDeselectInbandTrack(int p0, boolean p1) throws java.lang.IllegalStateException {}
    public static native int native_pullBatteryData(android.os.Parcel p0);
    @android.annotation.UnsupportedAppUsage
    public void setRetransmitEndpoint(java.net.InetSocketAddress p0) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {}
    private final native int native_setRetransmitEndpoint(java.lang.String p0, int p1);
    protected void finalize() {}
    @android.annotation.UnsupportedAppUsage
    public android.media.MediaTimeProvider getMediaTimeProvider() { return null; }
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener p0) {}
    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener p0) {}
    public void setOnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener p0) {}
    public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener p0) {}
    public void setOnVideoSizeChangedListener(android.media.MediaPlayer.OnVideoSizeChangedListener p0) {}
    public void setOnTimedTextListener(android.media.MediaPlayer.OnTimedTextListener p0) {}
    public void setOnSubtitleDataListener(android.media.MediaPlayer.OnSubtitleDataListener p0, android.os.Handler p1) {}
    public void setOnSubtitleDataListener(android.media.MediaPlayer.OnSubtitleDataListener p0) {}
    public void clearOnSubtitleDataListener() {}
    private void setOnSubtitleDataListenerInt(android.media.MediaPlayer.OnSubtitleDataListener p0, android.os.Handler p1) {}
    public void setOnMediaTimeDiscontinuityListener(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener p0, android.os.Handler p1) {}
    public void setOnMediaTimeDiscontinuityListener(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener p0) {}
    public void clearOnMediaTimeDiscontinuityListener() {}
    private void setOnMediaTimeDiscontinuityListenerInt(android.media.MediaPlayer.OnMediaTimeDiscontinuityListener p0, android.os.Handler p1) {}
    public void setOnTimedMetaDataAvailableListener(android.media.MediaPlayer.OnTimedMetaDataAvailableListener p0) {}
    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener p0) {}
    public void setOnDrmConfigHelper(android.media.MediaPlayer.OnDrmConfigHelper p0) {}
    public void setOnDrmInfoListener(android.media.MediaPlayer.OnDrmInfoListener p0) {}
    public void setOnDrmInfoListener(android.media.MediaPlayer.OnDrmInfoListener p0, android.os.Handler p1) {}
    public void setOnDrmPreparedListener(android.media.MediaPlayer.OnDrmPreparedListener p0) {}
    public void setOnDrmPreparedListener(android.media.MediaPlayer.OnDrmPreparedListener p0, android.os.Handler p1) {}
    public android.media.MediaPlayer.DrmInfo getDrmInfo() { return null; }
    public void prepareDrm(java.util.UUID p0) throws android.media.UnsupportedSchemeException, android.media.ResourceBusyException, android.media.MediaPlayer.ProvisioningNetworkErrorException, android.media.MediaPlayer.ProvisioningServerErrorException {}
    private native void _releaseDrm();
    public void releaseDrm() throws android.media.MediaPlayer.NoDrmSchemeException {}
    public android.media.MediaDrm.KeyRequest getKeyRequest(byte[] p0, byte[] p1, java.lang.String p2, int p3, java.util.Map<java.lang.String, java.lang.String> p4) throws android.media.MediaPlayer.NoDrmSchemeException { return null; }
    public byte[] provideKeyResponse(byte[] p0, byte[] p1) throws android.media.MediaPlayer.NoDrmSchemeException, android.media.DeniedByServerException { return null; }
    public void restoreKeys(byte[] p0) throws android.media.MediaPlayer.NoDrmSchemeException {}
    public java.lang.String getDrmPropertyString(java.lang.String p0) throws android.media.MediaPlayer.NoDrmSchemeException { return null; }
    public void setDrmPropertyString(java.lang.String p0, java.lang.String p1) throws android.media.MediaPlayer.NoDrmSchemeException {}
    private native void _prepareDrm(byte[] p0, byte[] p1);
    private void prepareDrm_createDrmStep(java.util.UUID p0) throws android.media.UnsupportedSchemeException {}
    private void prepareDrm_openSessionStep(java.util.UUID p0) throws android.media.NotProvisionedException, android.media.ResourceBusyException {}
    private int HandleProvisioninig(java.util.UUID p0) { return 0; }
    private boolean resumePrepareDrm(java.util.UUID p0) { return false; }
    private void resetDrmState() {}
    private void cleanDrmObj() {}
    private static final byte[] getByteArrayFromUUID(java.util.UUID p0) { return null; }
    private boolean isVideoScalingModeSupported(int p0) { return false; }

    public static class TrackInfo implements android.os.Parcelable {
        public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
        public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
        public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
        public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
        public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
        public static final int MEDIA_TRACK_TYPE_METADATA = 5;
        final int mTrackType = 0;
        final android.media.MediaFormat mFormat = null;
        @android.annotation.UnsupportedAppUsage
        static final android.os.Parcelable.Creator<android.media.MediaPlayer.TrackInfo> CREATOR = null;
        public int getTrackType() { return 0; }
        public java.lang.String getLanguage() { return null; }
        public android.media.MediaFormat getFormat() { return null; }
        TrackInfo(android.os.Parcel p0) {}
        TrackInfo(int p0, android.media.MediaFormat p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface TrackType {
        }
    }

    static class TimeProvider implements android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaTimeProvider {
        private static final java.lang.String TAG = "MTP";
        private static final long MAX_NS_WITHOUT_POSITION_CHECK = 5000000000L;
        private static final long MAX_EARLY_CALLBACK_US = 1000L;
        private static final long TIME_ADJUSTMENT_RATE = 2L;
        private long mLastTimeUs;
        private android.media.MediaPlayer mPlayer;
        private boolean mPaused;
        private boolean mStopped;
        private boolean mBuffering;
        private long mLastReportedTime;
        private android.media.MediaTimeProvider.OnMediaTimeListener[] mListeners;
        private long[] mTimes;
        private android.os.Handler mEventHandler;
        private boolean mRefresh;
        private boolean mPausing;
        private boolean mSeeking;
        private static final int NOTIFY = 1;
        private static final int NOTIFY_TIME = 0;
        private static final int NOTIFY_STOP = 2;
        private static final int NOTIFY_SEEK = 3;
        private static final int NOTIFY_TRACK_DATA = 4;
        private android.os.HandlerThread mHandlerThread;
        public boolean DEBUG;
        public TimeProvider(android.media.MediaPlayer p0) {}
        private void scheduleNotification(int p0, long p1) {}
        public void close() {}
        protected void finalize() {}
        public void onNotifyTime() {}
        public void onPaused(boolean p0) {}
        public void onBuffering(boolean p0) {}
        public void onStopped() {}
        public void onSeekComplete(android.media.MediaPlayer p0) {}
        public void onNewPlayer() {}
        private synchronized void notifySeek() {}
        private synchronized void notifyTrackData(android.util.Pair<android.media.SubtitleTrack, byte[]> p0) {}
        private synchronized void notifyStop() {}
        private int registerListener(android.media.MediaTimeProvider.OnMediaTimeListener p0) { return 0; }
        public void notifyAt(long p0, android.media.MediaTimeProvider.OnMediaTimeListener p1) {}
        public void scheduleUpdate(android.media.MediaTimeProvider.OnMediaTimeListener p0) {}
        public void cancelNotifications(android.media.MediaTimeProvider.OnMediaTimeListener p0) {}
        private synchronized void notifyTimedEvent(boolean p0) {}
        public long getCurrentTimeUs(boolean p0, boolean p1) throws java.lang.IllegalStateException { return 0L; }

        private class EventHandler extends android.os.Handler {
            public EventHandler(android.media.MediaPlayer.TimeProvider p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SeekMode {
    }

    private class ProvisioningThread extends java.lang.Thread {
        public static final int TIMEOUT_MS = 60000;
        private java.util.UUID uuid;
        private java.lang.String urlStr;
        private java.lang.Object drmLock;
        private android.media.MediaPlayer.OnDrmPreparedHandlerDelegate onDrmPreparedHandlerDelegate;
        private android.media.MediaPlayer mediaPlayer;
        private int status;
        private boolean finished;
        private ProvisioningThread(android.media.MediaPlayer p0) { super(); }
        public int status() { return 0; }
        public android.media.MediaPlayer.ProvisioningThread initialize(android.media.MediaDrm.ProvisionRequest p0, java.util.UUID p1, android.media.MediaPlayer p2) { return null; }
        public void run() {}
    }

    public static final class ProvisioningServerErrorException extends android.media.MediaDrmException {
        public ProvisioningServerErrorException(java.lang.String p0) { super(null); }
    }

    public static final class ProvisioningNetworkErrorException extends android.media.MediaDrmException {
        public ProvisioningNetworkErrorException(java.lang.String p0) { super(null); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrepareDrmStatusCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackRateAudioMode {
    }

    public static interface OnVideoSizeChangedListener {
        public void onVideoSizeChanged(android.media.MediaPlayer p0, int p1, int p2);
    }

    public static interface OnTimedTextListener {
        public void onTimedText(android.media.MediaPlayer p0, android.media.TimedText p1);
    }

    public static interface OnTimedMetaDataAvailableListener {
        public void onTimedMetaDataAvailable(android.media.MediaPlayer p0, android.media.TimedMetaData p1);
    }

    public static interface OnSubtitleDataListener {
        public void onSubtitleData(android.media.MediaPlayer p0, android.media.SubtitleData p1);
    }

    public static interface OnSeekCompleteListener {
        public void onSeekComplete(android.media.MediaPlayer p0);
    }

    public static interface OnPreparedListener {
        public void onPrepared(android.media.MediaPlayer p0);
    }

    public static interface OnMediaTimeDiscontinuityListener {
        public void onMediaTimeDiscontinuity(android.media.MediaPlayer p0, android.media.MediaTimestamp p1);
    }

    public static interface OnInfoListener {
        public boolean onInfo(android.media.MediaPlayer p0, int p1, int p2);
    }

    public static interface OnErrorListener {
        public boolean onError(android.media.MediaPlayer p0, int p1, int p2);
    }

    public static interface OnDrmPreparedListener {
        public void onDrmPrepared(android.media.MediaPlayer p0, int p1);
    }

    private class OnDrmPreparedHandlerDelegate {
        private android.media.MediaPlayer mMediaPlayer;
        private android.media.MediaPlayer.OnDrmPreparedListener mOnDrmPreparedListener;
        private android.os.Handler mHandler;
        OnDrmPreparedHandlerDelegate(android.media.MediaPlayer p0, android.media.MediaPlayer p1, android.media.MediaPlayer.OnDrmPreparedListener p2, android.os.Handler p3) {}
        void notifyClient(int p0) {}
    }

    public static interface OnDrmInfoListener {
        public void onDrmInfo(android.media.MediaPlayer p0, android.media.MediaPlayer.DrmInfo p1);
    }

    private class OnDrmInfoHandlerDelegate {
        private android.media.MediaPlayer mMediaPlayer;
        private android.media.MediaPlayer.OnDrmInfoListener mOnDrmInfoListener;
        private android.os.Handler mHandler;
        OnDrmInfoHandlerDelegate(android.media.MediaPlayer p0, android.media.MediaPlayer p1, android.media.MediaPlayer.OnDrmInfoListener p2, android.os.Handler p3) {}
        void notifyClient(android.media.MediaPlayer.DrmInfo p0) {}
    }

    public static interface OnDrmConfigHelper {
        public void onDrmConfig(android.media.MediaPlayer p0);
    }

    public static interface OnCompletionListener {
        public void onCompletion(android.media.MediaPlayer p0);
    }

    public static interface OnBufferingUpdateListener {
        public void onBufferingUpdate(android.media.MediaPlayer p0, int p1);
    }

    public static final class NoDrmSchemeException extends android.media.MediaDrmException {
        public NoDrmSchemeException(java.lang.String p0) { super(null); }
    }

    public static final class MetricsConstants {
        public static final java.lang.String MIME_TYPE_VIDEO = "android.media.mediaplayer.video.mime";
        public static final java.lang.String CODEC_VIDEO = "android.media.mediaplayer.video.codec";
        public static final java.lang.String WIDTH = "android.media.mediaplayer.width";
        public static final java.lang.String HEIGHT = "android.media.mediaplayer.height";
        public static final java.lang.String FRAMES = "android.media.mediaplayer.frames";
        public static final java.lang.String FRAMES_DROPPED = "android.media.mediaplayer.dropped";
        public static final java.lang.String MIME_TYPE_AUDIO = "android.media.mediaplayer.audio.mime";
        public static final java.lang.String CODEC_AUDIO = "android.media.mediaplayer.audio.codec";
        public static final java.lang.String DURATION = "android.media.mediaplayer.durationMs";
        public static final java.lang.String PLAYING = "android.media.mediaplayer.playingMs";
        public static final java.lang.String ERRORS = "android.media.mediaplayer.err";
        public static final java.lang.String ERROR_CODE = "android.media.mediaplayer.errcode";
        private MetricsConstants() {}
    }

    private class EventHandler extends android.os.Handler {
        private android.media.MediaPlayer mMediaPlayer;
        public EventHandler(android.media.MediaPlayer p0, android.media.MediaPlayer p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static final class DrmInfo {
        private java.util.Map<java.util.UUID, byte[]> mapPssh;
        private java.util.UUID[] supportedSchemes;
        public java.util.Map<java.util.UUID, byte[]> getPssh() { return null; }
        public java.util.UUID[] getSupportedSchemes() { return null; }
        private DrmInfo(java.util.Map<java.util.UUID, byte[]> p0, java.util.UUID[] p1) {}
        private DrmInfo(android.os.Parcel p0) {}
        private android.media.MediaPlayer.DrmInfo makeCopy() { return null; }
        private java.lang.String arrToHex(byte[] p0) { return null; }
        private java.util.UUID bytesToUUID(byte[] p0) { return null; }
        private java.util.Map<java.util.UUID, byte[]> parsePSSH(byte[] p0, int p1) { return null; }
    }
}
