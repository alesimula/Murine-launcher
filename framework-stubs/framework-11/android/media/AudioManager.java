package android.media;

public class AudioManager {
    private android.content.Context mOriginalContext;
    private android.content.Context mApplicationContext;
    private long mVolumeKeyUpTime;
    private final boolean mUseVolumeKeySounds = false;
    private final boolean mUseFixedVolume = false;
    private static final java.lang.String TAG = "AudioManager";
    private static final boolean DEBUG = false;
    private static final android.media.AudioPortEventHandler sAudioPortEventHandler = null;
    private static final android.media.audiopolicy.AudioVolumeGroupChangeHandler sAudioAudioVolumeGroupChangedHandler = null;
    public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
    public static final java.lang.String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
    public static final java.lang.String INTERNAL_RINGER_MODE_CHANGED_ACTION = "android.media.INTERNAL_RINGER_MODE_CHANGED_ACTION";
    public static final java.lang.String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
    public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
    public static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    public static final java.lang.String STREAM_DEVICES_CHANGED_ACTION = "android.media.STREAM_DEVICES_CHANGED_ACTION";
    public static final java.lang.String STREAM_MUTE_CHANGED_ACTION = "android.media.STREAM_MUTE_CHANGED_ACTION";
    public static final java.lang.String MASTER_MUTE_CHANGED_ACTION = "android.media.MASTER_MUTE_CHANGED_ACTION";
    public static final java.lang.String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
    public static final java.lang.String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE_ALIAS = "android.media.EXTRA_VOLUME_STREAM_TYPE_ALIAS";
    public static final java.lang.String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    public static final java.lang.String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_DEVICES = "android.media.EXTRA_VOLUME_STREAM_DEVICES";
    public static final java.lang.String EXTRA_PREV_VOLUME_STREAM_DEVICES = "android.media.EXTRA_PREV_VOLUME_STREAM_DEVICES";
    public static final java.lang.String EXTRA_MASTER_VOLUME_MUTED = "android.media.EXTRA_MASTER_VOLUME_MUTED";
    public static final java.lang.String EXTRA_STREAM_VOLUME_MUTED = "android.media.EXTRA_STREAM_VOLUME_MUTED";
    public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final java.lang.String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
    public static final java.lang.String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
    public static final java.lang.String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
    public static final java.lang.String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
    public static final int STREAM_VOICE_CALL = 0;
    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_RING = 2;
    public static final int STREAM_MUSIC = 3;
    public static final int STREAM_ALARM = 4;
    public static final int STREAM_NOTIFICATION = 5;
    public static final int STREAM_BLUETOOTH_SCO = 6;
    public static final int STREAM_SYSTEM_ENFORCED = 7;
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_TTS = 9;
    public static final int STREAM_ACCESSIBILITY = 10;
    @android.annotation.SystemApi
    public static final int STREAM_ASSISTANT = 11;
    @java.lang.Deprecated
    public static final int NUM_STREAMS = 5;
    public static final int ADJUST_RAISE = 1;
    public static final int ADJUST_LOWER = -1;
    public static final int ADJUST_SAME = 0;
    public static final int ADJUST_MUTE = -100;
    public static final int ADJUST_UNMUTE = 100;
    public static final int ADJUST_TOGGLE_MUTE = 101;
    public static final int FLAG_SHOW_UI = 1;
    public static final int FLAG_ALLOW_RINGER_MODES = 2;
    public static final int FLAG_PLAY_SOUND = 4;
    public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int FLAG_VIBRATE = 16;
    public static final int FLAG_FIXED_VOLUME = 32;
    public static final int FLAG_BLUETOOTH_ABS_VOLUME = 64;
    public static final int FLAG_SHOW_SILENT_HINT = 128;
    public static final int FLAG_HDMI_SYSTEM_AUDIO_VOLUME = 256;
    public static final int FLAG_ACTIVE_MEDIA_ONLY = 512;
    public static final int FLAG_SHOW_UI_WARNINGS = 1024;
    public static final int FLAG_SHOW_VIBRATE_HINT = 2048;
    public static final int FLAG_FROM_KEY = 4096;
    private static final java.util.TreeMap<java.lang.Integer, java.lang.String> FLAG_NAMES = null;
    public static final int RINGER_MODE_SILENT = 0;
    public static final int RINGER_MODE_VIBRATE = 1;
    public static final int RINGER_MODE_NORMAL = 2;
    public static final int RINGER_MODE_MAX = 2;
    public static final int VIBRATE_TYPE_RINGER = 0;
    public static final int VIBRATE_TYPE_NOTIFICATION = 1;
    public static final int VIBRATE_SETTING_OFF = 0;
    public static final int VIBRATE_SETTING_ON = 1;
    public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
    public static final int USE_DEFAULT_STREAM_TYPE = -2147483648;
    private static android.media.IAudioService sService;
    private static final float VOLUME_MIN_DB = -758.0f;
    private final java.lang.Object mPrefDevListenerLock = null;
    private java.util.ArrayList<android.media.AudioManager.PrefDevListenerInfo> mPrefDevListeners;
    private android.media.AudioManager.StrategyPreferredDeviceDispatcherStub mPrefDevDispatcherStub;
    @java.lang.Deprecated
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
    public static final java.lang.String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    public static final java.lang.String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
    public static final java.lang.String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
    public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
    public static final int SCO_AUDIO_STATE_CONNECTED = 1;
    public static final int SCO_AUDIO_STATE_CONNECTING = 2;
    public static final int SCO_AUDIO_STATE_ERROR = -1;
    public static final java.lang.String ACTION_MICROPHONE_MUTE_CHANGED = "android.media.action.MICROPHONE_MUTE_CHANGED";
    public static final java.lang.String ACTION_SPEAKERPHONE_STATE_CHANGED = "android.media.action.SPEAKERPHONE_STATE_CHANGED";
    public static final int MODE_INVALID = -2;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_CALL_SCREENING = 4;
    @java.lang.Deprecated
    public static final int ROUTE_EARPIECE = 1;
    @java.lang.Deprecated
    public static final int ROUTE_SPEAKER = 2;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH = 4;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH_SCO = 4;
    @java.lang.Deprecated
    public static final int ROUTE_HEADSET = 8;
    @java.lang.Deprecated
    public static final int ROUTE_BLUETOOTH_A2DP = 16;
    @java.lang.Deprecated
    public static final int ROUTE_ALL = -1;
    public static final int AUDIO_SESSION_ID_GENERATE = 0;
    public static final int FX_KEY_CLICK = 0;
    public static final int FX_FOCUS_NAVIGATION_UP = 1;
    public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
    public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
    public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
    public static final int FX_KEYPRESS_STANDARD = 5;
    public static final int FX_KEYPRESS_SPACEBAR = 6;
    public static final int FX_KEYPRESS_DELETE = 7;
    public static final int FX_KEYPRESS_RETURN = 8;
    public static final int FX_KEYPRESS_INVALID = 9;
    public static final int NUM_SOUND_EFFECTS = 10;
    public static final int AUDIOFOCUS_NONE = 0;
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_LOSS = -1;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, android.media.AudioManager.FocusRequestInfo> mAudioFocusIdListenerMap = null;
    private final android.media.AudioManager.ServiceEventHandlerDelegate mServiceEventHandlerDelegate = null;
    private static final int MSSG_FOCUS_CHANGE = 0;
    private static final int MSSG_RECORDING_CONFIG_CHANGE = 1;
    private static final int MSSG_PLAYBACK_CONFIG_CHANGE = 2;
    private final android.media.IAudioFocusDispatcher mAudioFocusDispatcher = null;
    public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
    public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
    public static final int AUDIOFOCUS_REQUEST_WAITING_FOR_EXT_POLICY = 100;
    private static final int EXT_FOCUS_POLICY_TIMEOUT_MS = 200;
    private static final java.lang.String FOCUS_CLIENT_ID_STRING = "android_audio_focus_client_id";
    private final java.lang.Object mFocusRequestsLock = null;
    private java.util.HashMap<java.lang.String, android.media.AudioManager.BlockingFocusResultReceiver> mFocusRequestsAwaitingResult;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_DELAY_OK = 1;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_PAUSES_ON_DUCKABLE_LOSS = 2;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_LOCK = 4;
    public static final int AUDIOFOCUS_FLAGS_APPS = 3;
    public static final int AUDIOFOCUS_FLAGS_SYSTEM = 7;
    private java.util.List<android.media.AudioManager.AudioPlaybackCallbackInfo> mPlaybackCallbackList;
    private final java.lang.Object mPlaybackCallbackLock = null;
    private final android.media.IPlaybackConfigDispatcher mPlayCb = null;
    public static final int RECORD_CONFIG_EVENT_NONE = -1;
    public static final int RECORD_CONFIG_EVENT_START = 0;
    public static final int RECORD_CONFIG_EVENT_STOP = 1;
    public static final int RECORD_CONFIG_EVENT_UPDATE = 2;
    public static final int RECORD_CONFIG_EVENT_RELEASE = 3;
    public static final int RECORD_RIID_INVALID = -1;
    public static final int RECORDER_STATE_STARTED = 0;
    public static final int RECORDER_STATE_STOPPED = 1;
    private java.util.List<android.media.AudioManager.AudioRecordingCallbackInfo> mRecordCallbackList;
    private final java.lang.Object mRecordCallbackLock = null;
    private final android.media.IRecordingConfigDispatcher mRecCb = null;
    private final android.os.IBinder mICallBack = null;
    public static final int DEVICE_NONE = 0;
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_BLUETOOTH_SCO = 16;
    public static final int DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
    public static final int DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_HDMI = 1024;
    public static final int DEVICE_OUT_ANLG_DOCK_HEADSET = 2048;
    public static final int DEVICE_OUT_DGTL_DOCK_HEADSET = 4096;
    public static final int DEVICE_OUT_USB_ACCESSORY = 8192;
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    public static final int DEVICE_OUT_REMOTE_SUBMIX = 32768;
    public static final int DEVICE_OUT_TELEPHONY_TX = 65536;
    public static final int DEVICE_OUT_LINE = 131072;
    public static final int DEVICE_OUT_HDMI_ARC = 262144;
    public static final int DEVICE_OUT_SPDIF = 524288;
    public static final int DEVICE_OUT_FM = 1048576;
    public static final int DEVICE_OUT_DEFAULT = 1073741824;
    public static final int DEVICE_IN_BUILTIN_MIC = -2147483644;
    public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = -2147483640;
    public static final int DEVICE_IN_WIRED_HEADSET = -2147483632;
    public static final int DEVICE_IN_HDMI = -2147483616;
    public static final int DEVICE_IN_HDMI_ARC = -2013265920;
    public static final int DEVICE_IN_TELEPHONY_RX = -2147483584;
    public static final int DEVICE_IN_BACK_MIC = -2147483520;
    public static final int DEVICE_IN_ANLG_DOCK_HEADSET = -2147483136;
    public static final int DEVICE_IN_DGTL_DOCK_HEADSET = -2147482624;
    public static final int DEVICE_IN_USB_ACCESSORY = -2147481600;
    public static final int DEVICE_IN_USB_DEVICE = -2147479552;
    public static final int DEVICE_IN_FM_TUNER = -2147475456;
    public static final int DEVICE_IN_TV_TUNER = -2147467264;
    public static final int DEVICE_IN_LINE = -2147450880;
    public static final int DEVICE_IN_SPDIF = -2147418112;
    public static final int DEVICE_IN_LOOPBACK = -2147221504;
    public static final int DEVICE_VOLUME_BEHAVIOR_UNSET = -1;
    public static final int DEVICE_VOLUME_BEHAVIOR_VARIABLE = 0;
    public static final int DEVICE_VOLUME_BEHAVIOR_FULL = 1;
    public static final int DEVICE_VOLUME_BEHAVIOR_FIXED = 2;
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE = 3;
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_MULTI_MODE = 4;
    public static final java.lang.String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
    public static final java.lang.String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
    public static final java.lang.String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
    public static final java.lang.String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
    public static final java.lang.String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = "android.media.property.SUPPORT_AUDIO_SOURCE_UNPROCESSED";
    @android.annotation.SystemApi
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int ERROR_PERMISSION_DENIED = -4;
    public static final int ERROR_NO_INIT = -5;
    public static final int ERROR_DEAD_OBJECT = -6;
    static final int AUDIOPORT_GENERATION_INIT = 0;
    static java.lang.Integer sAudioPortGeneration;
    static java.util.ArrayList<android.media.AudioPort> sAudioPortsCached;
    static java.util.ArrayList<android.media.AudioPort> sPreviousAudioPortsCached;
    static java.util.ArrayList<android.media.AudioPatch> sAudioPatchesCached;
    private android.media.AudioManager.OnAmPortUpdateListener mPortListener;
    private static final int MSG_DEVICES_CALLBACK_REGISTERED = 0;
    private static final int MSG_DEVICES_DEVICES_ADDED = 1;
    private static final int MSG_DEVICES_DEVICES_REMOVED = 2;
    private final android.util.ArrayMap<android.media.AudioDeviceCallback, android.media.AudioManager.NativeEventHandlerDelegate> mDeviceCallbacks = null;
    public static final int GET_DEVICES_INPUTS = 1;
    public static final int GET_DEVICES_OUTPUTS = 2;
    public static final int GET_DEVICES_ALL = 3;
    private java.util.ArrayList<android.media.AudioDevicePort> mPreviousPorts;
    private java.util.concurrent.Executor mAudioServerStateExec;
    private android.media.AudioManager.AudioServerStateCallback mAudioServerStateCb;
    private final java.lang.Object mAudioServerStateCbLock = null;
    private final android.media.IAudioServerStateDispatcher mAudioServerStateDispatcher = null;
    public static final java.lang.String adjustToString(int p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public AudioManager() {}
    public AudioManager(android.content.Context p0) {}
    private android.content.Context getContext() { return null; }
    private void setContext(android.content.Context p0) {}
    private static android.media.IAudioService getService() { return null; }
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0) {}
    public void preDispatchKeyEvent(android.view.KeyEvent p0, int p1) {}
    public boolean isVolumeFixed() { return false; }
    public void adjustStreamVolume(int p0, int p1, int p2) {}
    public void adjustVolume(int p0, int p1) {}
    public void adjustSuggestedStreamVolume(int p0, int p1, int p2) {}
    public void setMasterMute(boolean p0, int p1) {}
    public int getRingerMode() { return 0; }
    public static boolean isValidRingerMode(int p0) { return false; }
    public int getStreamMaxVolume(int p0) { return 0; }
    public int getStreamMinVolume(int p0) { return 0; }
    public int getStreamMinVolumeInt(int p0) { return 0; }
    public int getStreamVolume(int p0) { return 0; }
    public float getStreamVolumeDb(int p0, int p1, int p2) { return 0.0f; }
    private static boolean isPublicStreamType(int p0) { return false; }
    public int getLastAudibleStreamVolume(int p0) { return 0; }
    public int getUiSoundsStreamType() { return 0; }
    public void setRingerMode(int p0) {}
    public void setStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2) {}
    @android.annotation.SystemApi
    public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public void setSupportedSystemUsages(int[] p0) {}
    @android.annotation.SystemApi
    public int[] getSupportedSystemUsages() { return null; }
    @java.lang.Deprecated
    public void setStreamSolo(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void setStreamMute(int p0, boolean p1) {}
    public boolean isStreamMute(int p0) { return false; }
    public boolean isMasterMute() { return false; }
    public void forceVolumeControlStream(int p0) {}
    public boolean shouldVibrate(int p0) { return false; }
    public int getVibrateSetting(int p0) { return 0; }
    public void setVibrateSetting(int p0, int p1) {}
    public void setSpeakerphoneOn(boolean p0) {}
    public boolean isSpeakerphoneOn() { return false; }
    public void setAllowedCapturePolicy(int p0) {}
    public int getAllowedCapturePolicy() { return 0; }
    @android.annotation.SystemApi
    public boolean setPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    public boolean removePreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return false; }
    @android.annotation.SystemApi
    public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    @android.annotation.SystemApi
    public void addOnPreferredDeviceForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public void removeOnPreferredDeviceForStrategyChangedListener(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) {}
    private android.media.AudioManager.PrefDevListenerInfo getPrefDevListenerInfo(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) { return null; }
    private boolean hasPrefDevListener(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) { return false; }
    private boolean removePrefDevListener(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) { return false; }
    public static boolean isOffloadedPlaybackSupported(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return false; }
    public boolean isBluetoothScoAvailableOffCall() { return false; }
    public void startBluetoothSco() {}
    public void startBluetoothScoVirtualCall() {}
    public void stopBluetoothSco() {}
    public void setBluetoothScoOn(boolean p0) {}
    public boolean isBluetoothScoOn() { return false; }
    @java.lang.Deprecated
    public void setBluetoothA2dpOn(boolean p0) {}
    public boolean isBluetoothA2dpOn() { return false; }
    @java.lang.Deprecated
    public void setWiredHeadsetOn(boolean p0) {}
    public boolean isWiredHeadsetOn() { return false; }
    public void setMicrophoneMute(boolean p0) {}
    public void setMicrophoneMuteFromSwitch(boolean p0) {}
    public boolean isMicrophoneMute() { return false; }
    public void setMode(int p0) {}
    public int getMode() { return 0; }
    public boolean isCallScreeningModeSupported() { return false; }
    @java.lang.Deprecated
    public void setRouting(int p0, int p1, int p2) {}
    @java.lang.Deprecated
    public int getRouting(int p0) { return 0; }
    public boolean isMusicActive() { return false; }
    public boolean isMusicActiveRemotely() { return false; }
    public boolean isAudioFocusExclusive() { return false; }
    public int generateAudioSessionId() { return 0; }
    @java.lang.Deprecated
    public void setParameter(java.lang.String p0, java.lang.String p1) {}
    public void setParameters(java.lang.String p0) {}
    public java.lang.String getParameters(java.lang.String p0) { return null; }
    public void playSoundEffect(int p0) {}
    public void playSoundEffect(int p0, int p1) {}
    public void playSoundEffect(int p0, float p1) {}
    private boolean querySoundEffectsEnabled(int p0) { return false; }
    public void loadSoundEffects() {}
    public void unloadSoundEffects() {}
    public static java.lang.String audioFocusToString(int p0) { return null; }
    private android.media.AudioManager.FocusRequestInfo findFocusRequestInfo(java.lang.String p0) { return null; }
    private java.lang.String getIdForAudioFocusListener(android.media.AudioManager.OnAudioFocusChangeListener p0) { return null; }
    public void registerAudioFocusRequest(android.media.AudioFocusRequest p0) {}
    public void unregisterAudioFocusRequest(android.media.AudioManager.OnAudioFocusChangeListener p0) {}
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, int p1, int p2) { return 0; }
    public int requestAudioFocus(android.media.AudioFocusRequest p0) { return 0; }
    public int abandonAudioFocusRequest(android.media.AudioFocusRequest p0) { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3) throws java.lang.IllegalArgumentException { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3, android.media.audiopolicy.AudioPolicy p4) throws java.lang.IllegalArgumentException { return 0; }
    @android.annotation.SystemApi
    public int requestAudioFocus(android.media.AudioFocusRequest p0, android.media.audiopolicy.AudioPolicy p1) { return 0; }
    public void requestAudioFocusForCall(int p0, int p1) {}
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) { return 0; }
    @android.annotation.SystemApi
    public void setFocusRequestResult(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) {}
    @android.annotation.SystemApi
    public int dispatchAudioFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) { return 0; }
    public void abandonAudioFocusForCall() {}
    public int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1) { return 0; }
    @java.lang.Deprecated
    public void registerMediaButtonEventReceiver(android.content.ComponentName p0) {}
    @java.lang.Deprecated
    public void registerMediaButtonEventReceiver(android.app.PendingIntent p0) {}
    public void registerMediaButtonIntent(android.app.PendingIntent p0, android.content.ComponentName p1) {}
    @java.lang.Deprecated
    public void unregisterMediaButtonEventReceiver(android.content.ComponentName p0) {}
    @java.lang.Deprecated
    public void unregisterMediaButtonEventReceiver(android.app.PendingIntent p0) {}
    public void unregisterMediaButtonIntent(android.app.PendingIntent p0) {}
    @java.lang.Deprecated
    public void registerRemoteControlClient(android.media.RemoteControlClient p0) {}
    @java.lang.Deprecated
    public void unregisterRemoteControlClient(android.media.RemoteControlClient p0) {}
    @java.lang.Deprecated
    public boolean registerRemoteController(android.media.RemoteController p0) { return false; }
    @java.lang.Deprecated
    public void unregisterRemoteController(android.media.RemoteController p0) {}
    @android.annotation.SystemApi
    public int registerAudioPolicy(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    static int registerAudioPolicyStatic(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    @android.annotation.SystemApi
    public void unregisterAudioPolicyAsync(android.media.audiopolicy.AudioPolicy p0) {}
    static void unregisterAudioPolicyAsyncStatic(android.media.audiopolicy.AudioPolicy p0) {}
    @android.annotation.SystemApi
    public void unregisterAudioPolicy(android.media.audiopolicy.AudioPolicy p0) {}
    public boolean hasRegisteredDynamicPolicy() { return false; }
    public void registerAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0, android.os.Handler p1) {}
    public void unregisterAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0) {}
    public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() { return null; }
    private boolean hasPlaybackCallback_sync(android.media.AudioManager.AudioPlaybackCallback p0) { return false; }
    private boolean removePlaybackCallback_sync(android.media.AudioManager.AudioPlaybackCallback p0) { return false; }
    public void registerAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0, android.os.Handler p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() { return null; }
    private boolean hasRecordCallback_sync(android.media.AudioManager.AudioRecordingCallback p0) { return false; }
    private boolean removeRecordCallback_sync(android.media.AudioManager.AudioRecordingCallback p0) { return false; }
    public void reloadAudioSettings() {}
    public void avrcpSupportsAbsoluteVolume(java.lang.String p0, boolean p1) {}
    public boolean isSilentMode() { return false; }
    public static boolean isOutputDevice(int p0) { return false; }
    public static boolean isInputDevice(int p0) { return false; }
    public int getDevicesForStream(int p0) { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) { return null; }
    public static void enforceValidVolumeBehavior(int p0) {}
    public void setDeviceVolumeBehavior(int p0, java.lang.String p1, int p2) {}
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1) {}
    public int getDeviceVolumeBehavior(int p0, java.lang.String p1) { return 0; }
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) { return 0; }
    public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void setBluetoothHearingAidDeviceConnectionState(android.bluetooth.BluetoothDevice p0, int p1, boolean p2, int p3) {}
    public void setBluetoothA2dpDeviceConnectionStateSuppressNoisyIntent(android.bluetooth.BluetoothDevice p0, int p1, int p2, boolean p3, int p4) {}
    public void handleBluetoothA2dpDeviceConfigChange(android.bluetooth.BluetoothDevice p0) {}
    public android.media.IRingtonePlayer getRingtonePlayer() { return null; }
    public java.lang.String getProperty(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public boolean setAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0, long p1) { return false; }
    @android.annotation.SystemApi
    public long getAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0) { return 0L; }
    @android.annotation.SystemApi
    public long getMaxAdditionalOutputDeviceDelay(android.media.AudioDeviceInfo p0) { return 0L; }
    public int getOutputLatency(int p0) { return 0; }
    public void setVolumeController(android.media.IVolumeController p0) {}
    public void notifyVolumeControllerVisible(android.media.IVolumeController p0, boolean p1) {}
    public boolean isStreamAffectedByRingerMode(int p0) { return false; }
    public boolean isStreamAffectedByMute(int p0) { return false; }
    public void disableSafeMediaVolume() {}
    public void setRingerModeInternal(int p0) {}
    public int getRingerModeInternal() { return 0; }
    public void setVolumePolicy(android.media.VolumePolicy p0) {}
    public int setHdmiSystemAudioSupported(boolean p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("Doclava125")
    public boolean isHdmiSystemAudioSupported() { return false; }
    public static int listAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static int listPreviousAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static int listAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    public static int listPreviousAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    private static void filterDevicePorts(java.util.ArrayList<android.media.AudioPort> p0, java.util.ArrayList<android.media.AudioDevicePort> p1) {}
    public static int createAudioPatch(android.media.AudioPatch[] p0, android.media.AudioPortConfig[] p1, android.media.AudioPortConfig[] p2) { return 0; }
    public static int releaseAudioPatch(android.media.AudioPatch p0) { return 0; }
    public static int listAudioPatches(java.util.ArrayList<android.media.AudioPatch> p0) { return 0; }
    public static int setAudioPortGain(android.media.AudioPort p0, android.media.AudioGainConfig p1) { return 0; }
    public void registerAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    public void unregisterAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    static int resetAudioPortGeneration() { return 0; }
    static int updateAudioPortCache(java.util.ArrayList<android.media.AudioPort> p0, java.util.ArrayList<android.media.AudioPatch> p1, java.util.ArrayList<android.media.AudioPort> p2) { return 0; }
    static android.media.AudioPortConfig updatePortConfig(android.media.AudioPortConfig p0, java.util.ArrayList<android.media.AudioPort> p1) { return null; }
    private static boolean checkFlags(android.media.AudioDevicePort p0, int p1) { return false; }
    private static boolean checkTypes(android.media.AudioDevicePort p0) { return false; }
    public android.media.AudioDeviceInfo[] getDevices(int p0) { return null; }
    private static android.media.AudioDeviceInfo[] infoListFromPortList(java.util.ArrayList<android.media.AudioDevicePort> p0, int p1) { return null; }
    private static android.media.AudioDeviceInfo[] calcListDeltas(java.util.ArrayList<android.media.AudioDevicePort> p0, java.util.ArrayList<android.media.AudioDevicePort> p1, int p2) { return null; }
    public static android.media.AudioDeviceInfo[] getDevicesStatic(int p0) { return null; }
    public void registerAudioDeviceCallback(android.media.AudioDeviceCallback p0, android.os.Handler p1) {}
    public void unregisterAudioDeviceCallback(android.media.AudioDeviceCallback p0) {}
    public static void setPortIdForMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0) {}
    public static android.media.MicrophoneInfo microphoneInfoFromAudioDeviceInfo(android.media.AudioDeviceInfo p0) { return null; }
    private void addMicrophonesFromAudioDeviceInfo(java.util.ArrayList<android.media.MicrophoneInfo> p0, java.util.HashSet<java.lang.Integer> p1) {}
    public java.util.List<android.media.MicrophoneInfo> getMicrophones() throws java.io.IOException { return null; }
    public java.util.List<android.bluetooth.BluetoothCodecConfig> getHwOffloadEncodingFormatsSupportedForA2DP() { return null; }
    private void broadcastDeviceListChange_sync(android.os.Handler p0) {}
    @android.annotation.SystemApi
    public void setAudioServerStateCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioServerStateCallback p1) {}
    @android.annotation.SystemApi
    public void clearAudioServerStateCallback() {}
    @android.annotation.SystemApi
    public boolean isAudioServerRunning() { return false; }
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getSurroundFormats() { return null; }
    public boolean setSurroundFormatEnabled(int p0, boolean p1) { return false; }
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getReportedSurroundFormats() { return null; }
    public static boolean isHapticPlaybackSupported() { return false; }
    @android.annotation.SystemApi
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    @android.annotation.SystemApi
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    @android.annotation.SystemApi
    public void registerVolumeGroupCallback(java.util.concurrent.Executor p0, android.media.AudioManager.VolumeGroupCallback p1) {}
    @android.annotation.SystemApi
    public void unregisterVolumeGroupCallback(android.media.AudioManager.VolumeGroupCallback p0) {}
    public static boolean hasHapticChannels(android.net.Uri p0) { return false; }
    public static void setRttEnabled(boolean p0) {}
    public void setMultiAudioFocusEnabled(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioMode {
    }

    public static abstract class AudioPlaybackCallback {
        public AudioPlaybackCallback() {}
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) {}
    }

    private static class AudioPlaybackCallbackInfo {
        final android.media.AudioManager.AudioPlaybackCallback mCb = null;
        final android.os.Handler mHandler = null;
        AudioPlaybackCallbackInfo(android.media.AudioManager.AudioPlaybackCallback p0, android.os.Handler p1) {}
    }

    public static abstract class AudioRecordingCallback {
        public AudioRecordingCallback() {}
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
    }

    private static class AudioRecordingCallbackInfo {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final android.os.Handler mHandler = null;
        AudioRecordingCallbackInfo(android.media.AudioManager.AudioRecordingCallback p0, android.os.Handler p1) {}
    }

    @android.annotation.SystemApi
    public static abstract class AudioServerStateCallback {
        public AudioServerStateCallback() {}
        public void onAudioServerDown() {}
        public void onAudioServerUp() {}
    }

    private static final class BlockingFocusResultReceiver {
        private final android.media.AudioManager.SafeWaitObject mLock = null;
        private boolean mResultReceived;
        private int mFocusRequestResult;
        private final java.lang.String mFocusClientId = null;
        BlockingFocusResultReceiver(java.lang.String p0) {}
        boolean receivedResult() { return false; }
        int requestResult() { return 0; }
        void notifyResult(int p0) {}
        public void waitForResult(long p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehaviorState {
    }

    private static class FocusRequestInfo {
        final android.media.AudioFocusRequest mRequest = null;
        final android.os.Handler mHandler = null;
        FocusRequestInfo(android.media.AudioFocusRequest p0, android.os.Handler p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusRequestResult {
    }

    private class NativeEventHandlerDelegate {
        private final android.os.Handler mHandler = null;
        NativeEventHandlerDelegate(android.media.AudioManager p0, android.media.AudioDeviceCallback p1, android.os.Handler p2) {}
        android.os.Handler getHandler() { return null; }
    }

    private class OnAmPortUpdateListener implements android.media.AudioManager.OnAudioPortUpdateListener {
        static final java.lang.String TAG = "OnAmPortUpdateListener";
        private OnAmPortUpdateListener(android.media.AudioManager p0) {}
        public void onAudioPortListUpdate(android.media.AudioPort[] p0) {}
        public void onAudioPatchListUpdate(android.media.AudioPatch[] p0) {}
        public void onServiceDied() {}
    }

    public static interface OnAudioFocusChangeListener {
        public void onAudioFocusChange(int p0);
    }

    public static interface OnAudioPortUpdateListener {
        public void onAudioPortListUpdate(android.media.AudioPort[] p0);
        public void onAudioPatchListUpdate(android.media.AudioPatch[] p0);
        public void onServiceDied();
    }

    @android.annotation.SystemApi
    public static interface OnPreferredDeviceForStrategyChangedListener {
        public void onPreferredDeviceForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1);
    }

    private static final class PlaybackConfigChangeCallbackData {
        final android.media.AudioManager.AudioPlaybackCallback mCb = null;
        final java.util.List<android.media.AudioPlaybackConfiguration> mConfigs = null;
        PlaybackConfigChangeCallbackData(android.media.AudioManager.AudioPlaybackCallback p0, java.util.List<android.media.AudioPlaybackConfiguration> p1) {}
    }

    private static class PrefDevListenerInfo {
        final android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        PrefDevListenerInfo(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0, java.util.concurrent.Executor p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublicStreamTypes {
    }

    private static final class RecordConfigChangeCallbackData {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final java.util.List<android.media.AudioRecordingConfiguration> mConfigs = null;
        RecordConfigChangeCallbackData(android.media.AudioManager.AudioRecordingCallback p0, java.util.List<android.media.AudioRecordingConfiguration> p1) {}
    }

    private static final class SafeWaitObject {
        private boolean mQuit;
        private SafeWaitObject() {}
        public void safeNotify() {}
        public void safeWait(long p0) throws java.lang.InterruptedException {}
    }

    private class ServiceEventHandlerDelegate {
        private final android.os.Handler mHandler = null;
        ServiceEventHandlerDelegate(android.media.AudioManager p0, android.os.Handler p1) {}
        android.os.Handler getHandler() { return null; }
    }

    private final class StrategyPreferredDeviceDispatcherStub extends android.media.IStrategyPreferredDeviceDispatcher.Stub {
        private StrategyPreferredDeviceDispatcherStub(android.media.AudioManager p0) { super(); }
        public void dispatchPrefDeviceChanged(int p0, android.media.AudioDeviceAttributes p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustment {
    }

    @android.annotation.SystemApi
    public static abstract class VolumeGroupCallback {
        public VolumeGroupCallback() {}
        public void onAudioVolumeGroupChanged(int p0, int p1) {}
    }
}
