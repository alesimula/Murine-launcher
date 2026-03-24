package android.media;

public class AudioManager {
    public static final java.lang.String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
    public static final java.lang.String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
    public static final java.lang.String INTERNAL_RINGER_MODE_CHANGED_ACTION = "android.media.INTERNAL_RINGER_MODE_CHANGED_ACTION";
    public static final java.lang.String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
    public static final java.lang.String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
    public static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String ACTION_VOLUME_CHANGED = "android.media.VOLUME_CHANGED_ACTION";
    public static final java.lang.String STREAM_DEVICES_CHANGED_ACTION = "android.media.STREAM_DEVICES_CHANGED_ACTION";
    public static final java.lang.String STREAM_MUTE_CHANGED_ACTION = "android.media.STREAM_MUTE_CHANGED_ACTION";
    public static final java.lang.String MASTER_MUTE_CHANGED_ACTION = "android.media.MASTER_MUTE_CHANGED_ACTION";
    public static final java.lang.String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
    public static final java.lang.String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final java.lang.String EXTRA_VOLUME_STREAM_TYPE_ALIAS = "android.media.EXTRA_VOLUME_STREAM_TYPE_ALIAS";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ActionValue")
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
    @android.annotation.SystemApi
    public static final int STREAM_BLUETOOTH_SCO = 6;
    public static final int STREAM_SYSTEM_ENFORCED = 7;
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_TTS = 9;
    public static final int STREAM_ACCESSIBILITY = 10;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
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
    @android.annotation.SystemApi
    public static final int FLAG_BLUETOOTH_ABS_VOLUME = 64;
    public static final int FLAG_SHOW_SILENT_HINT = 128;
    public static final int FLAG_HDMI_SYSTEM_AUDIO_VOLUME = 256;
    public static final int FLAG_ACTIVE_MEDIA_ONLY = 512;
    public static final int FLAG_SHOW_UI_WARNINGS = 1024;
    public static final int FLAG_SHOW_VIBRATE_HINT = 2048;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int FLAG_FROM_KEY = 4096;
    public static final int FLAG_ABSOLUTE_VOLUME = 8192;
    public static final int ENCODED_SURROUND_OUTPUT_UNKNOWN = -1;
    public static final int ENCODED_SURROUND_OUTPUT_AUTO = 0;
    public static final int ENCODED_SURROUND_OUTPUT_NEVER = 1;
    public static final int ENCODED_SURROUND_OUTPUT_ALWAYS = 2;
    public static final int ENCODED_SURROUND_OUTPUT_MANUAL = 3;
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
    public static final int DIRECT_PLAYBACK_NOT_SUPPORTED = 0;
    public static final int DIRECT_PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final int DIRECT_PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 3;
    public static final int DIRECT_PLAYBACK_BITSTREAM_SUPPORTED = 4;
    public static final int PLAYBACK_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final int PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 2;
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
    public static final long CALL_REDIRECTION_AUDIO_MODES = 189472651L;
    public static final int MODE_INVALID = -2;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_CALL_SCREENING = 4;
    public static final int MODE_CALL_REDIRECT = 5;
    public static final int MODE_COMMUNICATION_REDIRECT = 6;
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
    public static final int FX_BACK = 10;
    public static final int FX_HOME = 11;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_1 = 12;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_2 = 13;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_3 = 14;
    public static final int FX_FOCUS_NAVIGATION_REPEAT_4 = 15;
    public static final int NUM_SOUND_EFFECTS = 16;
    public static final int NUM_NAVIGATION_REPEAT_SOUND_EFFECTS = 4;
    public static final int AUDIOFOCUS_NONE = 0;
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_LOSS = -1;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
    public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
    public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
    public static final int AUDIOFOCUS_REQUEST_WAITING_FOR_EXT_POLICY = 100;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_DELAY_OK = 1;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_PAUSES_ON_DUCKABLE_LOSS = 2;
    @android.annotation.SystemApi
    public static final int AUDIOFOCUS_FLAG_LOCK = 4;
    public static final int AUDIOFOCUS_FLAG_TEST = 8;
    public static final int AUDIOFOCUS_FLAGS_APPS = 3;
    public static final int AUDIOFOCUS_FLAGS_SYSTEM = 7;
    public static final int RECORD_CONFIG_EVENT_NONE = -1;
    public static final int RECORD_CONFIG_EVENT_START = 0;
    public static final int RECORD_CONFIG_EVENT_STOP = 1;
    public static final int RECORD_CONFIG_EVENT_UPDATE = 2;
    public static final int RECORD_CONFIG_EVENT_RELEASE = 3;
    public static final int RECORD_RIID_INVALID = -1;
    public static final int RECORDER_STATE_STARTED = 0;
    public static final int RECORDER_STATE_STOPPED = 1;
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
    public static final int DEVICE_OUT_HDMI_EARC = 262145;
    public static final int DEVICE_OUT_SPDIF = 524288;
    public static final int DEVICE_OUT_FM = 1048576;
    public static final int DEVICE_OUT_ECHO_CANCELLER = 268435456;
    public static final int DEVICE_OUT_BLE_HEADSET = 536870912;
    public static final int DEVICE_OUT_BLE_SPEAKER = 536870913;
    public static final int DEVICE_OUT_BLE_BROADCAST = 536870914;
    public static final int DEVICE_OUT_DEFAULT = 1073741824;
    public static final int DEVICE_IN_BUILTIN_MIC = -2147483644;
    public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = -2147483640;
    public static final int DEVICE_IN_WIRED_HEADSET = -2147483632;
    public static final int DEVICE_IN_HDMI = -2147483616;
    public static final int DEVICE_IN_HDMI_ARC = -2013265920;
    public static final int DEVICE_IN_HDMI_EARC = -2013265919;
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
    public static final int DEVICE_IN_ECHO_REFERENCE = -1879048192;
    public static final int DEVICE_IN_BLE_HEADSET = -1610612736;
    public static final int DEVICE_VOLUME_BEHAVIOR_UNSET = -1;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_VARIABLE = 0;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FULL = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FIXED = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE = 3;
    @android.annotation.SystemApi
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
    public static final int GET_DEVICES_INPUTS = 1;
    public static final int GET_DEVICES_OUTPUTS = 2;
    public static final int GET_DEVICES_ALL = 3;
    public static final int CALL_REDIRECT_NONE = 0;
    public static final int CALL_REDIRECT_PSTN = 1;
    public static final int CALL_REDIRECT_VOIP = 2;
    public static final int[] getPublicStreamTypes() { return null; }
    public static final java.lang.String adjustToString(int p0) { return null; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public AudioManager() {}
    public AudioManager(android.content.Context p0) {}
    static android.media.IAudioService getService() { return null; }
    public void dispatchMediaKeyEvent(android.view.KeyEvent p0) {}
    public void preDispatchKeyEvent(android.view.KeyEvent p0, int p1) {}
    public boolean isVolumeFixed() { return false; }
    public void adjustStreamVolume(int p0, int p1, int p2) {}
    public void adjustVolume(int p0, int p1) {}
    public void adjustSuggestedStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setMasterMute(boolean p0, int p1) {}
    public int getRingerMode() { return 0; }
    public boolean isRampingRingerEnabled() { return false; }
    public void setRampingRingerEnabled(boolean p0) {}
    public static boolean isValidRingerMode(int p0) { return false; }
    public int getStreamMaxVolume(int p0) { return 0; }
    public int getStreamMinVolume(int p0) { return 0; }
    public int getStreamMinVolumeInt(int p0) { return 0; }
    public int getStreamVolume(int p0) { return 0; }
    public float getStreamVolumeDb(int p0, int p1, int p2) { return 0.0f; }
    public static boolean isPublicStreamType(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    public int getLastAudibleStreamVolume(int p0) { return 0; }
    public int getUiSoundsStreamType() { return 0; }
    public void setRingerMode(int p0) {}
    public void setStreamVolume(int p0, int p1, int p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0) { return 0; }
    public int getVolumeGroupIdForAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setVolumeGroupVolumeIndex(int p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getVolumeGroupVolumeIndex(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getVolumeGroupMaxVolumeIndex(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int getVolumeGroupMinVolumeIndex(int p0) { return 0; }
    public void adjustVolumeGroupVolume(int p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    public int getLastAudibleVolumeGroupVolume(int p0) { return 0; }
    public boolean isVolumeGroupMuted(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setSupportedSystemUsages(int[] p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getSupportedSystemUsages() { return null; }
    @java.lang.Deprecated
    public void setStreamSolo(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void setStreamMute(int p0, boolean p1) {}
    public boolean isStreamMute(int p0) { return false; }
    public boolean isMasterMute() { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void forceVolumeControlStream(int p0) {}
    public boolean shouldVibrate(int p0) { return false; }
    public int getVibrateSetting(int p0) { return 0; }
    public void setVibrateSetting(int p0, int p1) {}
    public void setSpeakerphoneOn(boolean p0) {}
    public boolean isSpeakerphoneOn() { return false; }
    public void setAllowedCapturePolicy(int p0) {}
    public int getAllowedCapturePolicy() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean setPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean removePreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public android.media.AudioDeviceAttributes getPreferredDeviceForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean setPreferredDevicesForStrategy(android.media.audiopolicy.AudioProductStrategy p0, java.util.List<android.media.AudioDeviceAttributes> p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForStrategy(android.media.audiopolicy.AudioProductStrategy p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addOnPreferredDeviceForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeOnPreferredDeviceForStrategyChangedListener(android.media.AudioManager.OnPreferredDeviceForStrategyChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addOnPreferredDevicesForStrategyChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeOnPreferredDevicesForStrategyChangedListener(android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean setPreferredDeviceForCapturePreset(int p0, android.media.AudioDeviceAttributes p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public boolean clearPreferredDevicesForCapturePreset(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public java.util.List<android.media.AudioDeviceAttributes> getPreferredDevicesForCapturePreset(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addOnPreferredDevicesForCapturePresetChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnPreferredDevicesForCapturePresetChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeOnPreferredDevicesForCapturePresetChangedListener(android.media.AudioManager.OnPreferredDevicesForCapturePresetChangedListener p0) {}
    public static int getDirectPlaybackSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return 0; }
    public static boolean isOffloadedPlaybackSupported(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return false; }
    @java.lang.Deprecated
    public static int getPlaybackOffloadSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return 0; }
    public android.media.Spatializer getSpatializer() { return null; }
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
    public void addOnModeChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnModeChangedListener p1) {}
    public void removeOnModeChangedListener(android.media.AudioManager.OnModeChangedListener p0) {}
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
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void setHfpEnabled(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void setHfpVolume(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void setHfpSamplingRate(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void setBluetoothHeadsetProperties(java.lang.String p0, boolean p1, boolean p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void setA2dpSuspended(boolean p0) {}
    public java.lang.String getParameters(java.lang.String p0) { return null; }
    public static int getNthNavigationRepeatSoundEffect(int p0) { return 0; }
    public void setNavigationRepeatSoundEffectsEnabled(boolean p0) {}
    public boolean areNavigationRepeatSoundEffectsEnabled() { return false; }
    public void setHomeSoundEffectEnabled(boolean p0) {}
    public boolean isHomeSoundEffectEnabled() { return false; }
    public void playSoundEffect(int p0) {}
    public void playSoundEffect(int p0, int p1) {}
    public void playSoundEffect(int p0, float p1) {}
    public void loadSoundEffects() {}
    public void unloadSoundEffects() {}
    public static java.lang.String audioFocusToString(int p0) { return null; }
    public void registerAudioFocusRequest(android.media.AudioFocusRequest p0) {}
    public void unregisterAudioFocusRequest(android.media.AudioManager.OnAudioFocusChangeListener p0) {}
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, int p1, int p2) { return 0; }
    public int requestAudioFocus(android.media.AudioFocusRequest p0) { return 0; }
    public int abandonAudioFocusRequest(android.media.AudioFocusRequest p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3) throws java.lang.IllegalArgumentException { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_PHONE_STATE", "android.permission.MODIFY_AUDIO_ROUTING"})
    public int requestAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0, android.media.AudioAttributes p1, int p2, int p3, android.media.audiopolicy.AudioPolicy p4) throws java.lang.IllegalArgumentException { return 0; }
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    public int requestAudioFocusForTest(android.media.AudioFocusRequest p0, java.lang.String p1, int p2, int p3) { return 0; }
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    public int abandonAudioFocusForTest(android.media.AudioFocusRequest p0, java.lang.String p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.QUERY_AUDIO_STATE")
    public long getFadeOutDurationOnFocusLossMillis(android.media.AudioAttributes p0) { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int requestAudioFocus(android.media.AudioFocusRequest p0, android.media.audiopolicy.AudioPolicy p1) { return 0; }
    public void requestAudioFocusForCall(int p0, int p1) {}
    public int getFocusRampTimeMs(int p0, android.media.AudioAttributes p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setFocusRequestResult(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int dispatchAudioFocusChange(android.media.AudioFocusInfo p0, int p1, android.media.audiopolicy.AudioPolicy p2) { return 0; }
    public void abandonAudioFocusForCall() {}
    public int abandonAudioFocus(android.media.AudioManager.OnAudioFocusChangeListener p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
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
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int registerAudioPolicy(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    static int registerAudioPolicyStatic(android.media.audiopolicy.AudioPolicy p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void unregisterAudioPolicyAsync(android.media.audiopolicy.AudioPolicy p0) {}
    static void unregisterAudioPolicyAsyncStatic(android.media.audiopolicy.AudioPolicy p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void unregisterAudioPolicy(android.media.audiopolicy.AudioPolicy p0) {}
    public boolean hasRegisteredDynamicPolicy() { return false; }
    public void registerAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0, android.os.Handler p1) {}
    public void unregisterAudioPlaybackCallback(android.media.AudioManager.AudioPlaybackCallback p0) {}
    public java.util.List<android.media.AudioPlaybackConfiguration> getActivePlaybackConfigurations() { return null; }
    public void registerAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0, android.os.Handler p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public java.util.List<android.media.AudioRecordingConfiguration> getActiveRecordingConfigurations() { return null; }
    public void reloadAudioSettings() {}
    public boolean isSilentMode() { return false; }
    public static boolean isOutputDevice(int p0) { return false; }
    public static boolean isInputDevice(int p0) { return false; }
    @java.lang.Deprecated
    public int getDevicesForStream(int p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public java.util.List<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0) { return null; }
    public java.util.List<android.media.AudioDeviceInfo> getAudioDevicesForAttributes(android.media.AudioAttributes p0) { return null; }
    public static void enforceValidVolumeBehavior(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public boolean isFullVolumeDevice() { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setWiredDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setWiredDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setTestDeviceConnectionState(android.media.AudioDeviceAttributes p0, boolean p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_STACK")
    public void handleBluetoothActiveDeviceChanged(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothDevice p1, android.media.BluetoothProfileConnectionInfo p2) {}
    public android.media.IRingtonePlayer getRingtonePlayer() { return null; }
    public java.lang.String getProperty(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
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
    @android.annotation.SuppressLint("RequiresPermission")
    public boolean isHdmiSystemAudioSupported() { return false; }
    public static int listAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static int listPreviousAudioPorts(java.util.ArrayList<android.media.AudioPort> p0) { return 0; }
    public static int listAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    public static int listPreviousAudioDevicePorts(java.util.ArrayList<android.media.AudioDevicePort> p0) { return 0; }
    public static int createAudioPatch(android.media.AudioPatch[] p0, android.media.AudioPortConfig[] p1, android.media.AudioPortConfig[] p2) { return 0; }
    public static int releaseAudioPatch(android.media.AudioPatch p0) { return 0; }
    public static int listAudioPatches(java.util.ArrayList<android.media.AudioPatch> p0) { return 0; }
    public static int setAudioPortGain(android.media.AudioPort p0, android.media.AudioGainConfig p1) { return 0; }
    public void registerAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    public void unregisterAudioPortUpdateListener(android.media.AudioManager.OnAudioPortUpdateListener p0) {}
    static int resetAudioPortGeneration() { return 0; }
    static int updateAudioPortCache(java.util.ArrayList<android.media.AudioPort> p0, java.util.ArrayList<android.media.AudioPatch> p1, java.util.ArrayList<android.media.AudioPort> p2) { return 0; }
    static android.media.AudioPortConfig updatePortConfig(android.media.AudioPortConfig p0, java.util.ArrayList<android.media.AudioPort> p1) { return null; }
    public android.media.AudioDeviceInfo[] getDevices(int p0) { return null; }
    public static android.media.AudioDeviceInfo[] getDevicesStatic(int p0) { return null; }
    public static android.media.AudioDeviceInfo getDeviceForPortId(int p0, int p1) { return null; }
    public void registerAudioDeviceCallback(android.media.AudioDeviceCallback p0, android.os.Handler p1) {}
    public void unregisterAudioDeviceCallback(android.media.AudioDeviceCallback p0) {}
    public static void setPortIdForMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0) {}
    public static android.media.MicrophoneInfo microphoneInfoFromAudioDeviceInfo(android.media.AudioDeviceInfo p0) { return null; }
    public java.util.List<android.media.MicrophoneInfo> getMicrophones() throws java.io.IOException { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.bluetooth.BluetoothCodecConfig> getHwOffloadFormatsSupportedForA2dp() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getHwOffloadFormatsSupportedForLeAudio() { return null; }
    @android.annotation.SystemApi
    public void setAudioServerStateCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioServerStateCallback p1) {}
    @android.annotation.SystemApi
    public void clearAudioServerStateCallback() {}
    @android.annotation.SystemApi
    public boolean isAudioServerRunning() { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public boolean setEncodedSurroundMode(int p0) { return false; }
    public int getEncodedSurroundMode() { return 0; }
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getSurroundFormats() { return null; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public boolean setSurroundFormatEnabled(int p0, boolean p1) { return false; }
    public boolean isSurroundFormatEnabled(int p0) { return false; }
    public java.util.List<java.lang.Integer> getReportedSurroundFormats() { return null; }
    public static boolean isHapticPlaybackSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_ULTRASOUND")
    public boolean isUltrasoundSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static java.util.List<android.media.audiopolicy.AudioVolumeGroup> getAudioVolumeGroups() { return null; }
    @android.annotation.SystemApi
    public void registerVolumeGroupCallback(java.util.concurrent.Executor p0, android.media.AudioManager.VolumeGroupCallback p1) {}
    @android.annotation.SystemApi
    public void unregisterVolumeGroupCallback(android.media.AudioManager.VolumeGroupCallback p0) {}
    public static boolean hasHapticChannelsImpl(android.content.Context p0, android.net.Uri p1) { return false; }
    public static boolean hasHapticChannels(android.content.Context p0, android.net.Uri p1) { return false; }
    public static void setRttEnabled(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void adjustSuggestedStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void adjustStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setStreamVolumeForUid(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setMultiAudioFocusEnabled(boolean p0) {}
    public int getAudioHwSyncForSession(int p0) { return 0; }
    public boolean setCommunicationDevice(android.media.AudioDeviceInfo p0) { return false; }
    public void clearCommunicationDevice() {}
    public android.media.AudioDeviceInfo getCommunicationDevice() { return null; }
    public java.util.List<android.media.AudioDeviceInfo> getAvailableCommunicationDevices() { return null; }
    public java.util.List<android.media.AudioProfile> getDirectProfilesForAttributes(android.media.AudioAttributes p0) { return null; }
    public static android.media.AudioDeviceInfo getDeviceInfoFromType(int p0) { return null; }
    public static android.media.AudioDeviceInfo getDeviceInfoFromTypeAndAddress(int p0, java.lang.String p1) { return null; }
    public void addOnCommunicationDeviceChangedListener(java.util.concurrent.Executor p0, android.media.AudioManager.OnCommunicationDeviceChangedListener p1) {}
    public void removeOnCommunicationDeviceChangedListener(android.media.AudioManager.OnCommunicationDeviceChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CALL_AUDIO_INTERCEPTION")
    public boolean isPstnCallAudioInterceptable() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CALL_AUDIO_INTERCEPTION")
    public android.media.AudioTrack getCallUplinkInjectionAudioTrack(android.media.AudioFormat p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CALL_AUDIO_INTERCEPTION")
    public android.media.AudioRecord getCallDownlinkExtractionAudioRecord(android.media.AudioFormat p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void muteAwaitConnection(int[] p0, android.media.AudioDeviceAttributes p1, long p2, java.util.concurrent.TimeUnit p3) throws java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public android.media.AudioDeviceAttributes getMutingExpectedDevice() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void cancelMuteAwaitConnection(android.media.AudioDeviceAttributes p0) throws java.lang.IllegalStateException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void registerMuteAwaitConnectionCallback(java.util.concurrent.Executor p0, android.media.AudioManager.MuteAwaitConnectionCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void unregisterMuteAwaitConnectionCallback(android.media.AudioManager.MuteAwaitConnectionCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void addAssistantServicesUids(int[] p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void removeAssistantServicesUids(int[] p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getAssistantServicesUids() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void setActiveAssistantServiceUids(int[] p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public int[] getActiveAssistantServicesUids() { return null; }
    public static java.lang.String getHalVersion() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDeviceRole {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDirectPlaybackMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioOffloadMode {
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
        BlockingFocusResultReceiver(java.lang.String p0) {}
        boolean receivedResult() { return false; }
        int requestResult() { return 0; }
        void notifyResult(int p0) {}
        public void waitForResult(long p0) {}
    }

    class CallIRedirectionClientInfo {
        public java.lang.ref.WeakReference trackOrRecord;
        public int redirectMode;
        CallIRedirectionClientInfo(android.media.AudioManager p0) {}
    }

    class CallInjectionModeChangedListener implements android.media.AudioManager.OnModeChangedListener {
        CallInjectionModeChangedListener(android.media.AudioManager p0) {}
        public void onModeChanged(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallRedirectionMode {
    }

    private final class CapturePresetDevicesRoleDispatcherStub extends android.media.ICapturePresetDevicesRoleDispatcher.Stub {
        public void dispatchDevicesRoleChanged(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) {}
    }

    private final class CommunicationDeviceDispatcherStub extends android.media.ICommunicationDeviceDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        public void dispatchCommunicationDeviceChanged(int p0) {}
    }

    private class DevRoleListenerInfo<T extends java.lang.Object> {
        final java.util.concurrent.Executor mExecutor = null;
        final T mListener = null;
        DevRoleListenerInfo(java.util.concurrent.Executor p0, T p1) {}
    }

    private class DevRoleListeners<T extends java.lang.Object> {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehaviorState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncodedSurroundOutputMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    private static class FocusRequestInfo {
        final android.media.AudioFocusRequest mRequest = null;
        final android.os.Handler mHandler = null;
        FocusRequestInfo(android.media.AudioFocusRequest p0, android.os.Handler p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FocusRequestResult {
    }

    final class ModeDispatcherStub extends android.media.IAudioModeDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        ModeDispatcherStub(android.media.AudioManager p0) { super(); }
        public void register(boolean p0) {}
        public void dispatchAudioModeChanged(int p0) {}
    }

    @android.annotation.SystemApi
    public static abstract class MuteAwaitConnectionCallback {
        public static final int EVENT_CONNECTION = 1;
        public static final int EVENT_TIMEOUT = 2;
        public static final int EVENT_CANCEL = 3;
        public MuteAwaitConnectionCallback() {}
        public void onMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) {}
        public void onUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UnmuteEvent {
        }
    }

    private final class MuteAwaitConnectionDispatcherStub extends android.media.IMuteAwaitConnectionCallback.Stub {
        public void register(boolean p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchOnMutedUntilConnection(android.media.AudioDeviceAttributes p0, int[] p1) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchOnUnmutedEvent(int p0, android.media.AudioDeviceAttributes p1, int[] p2) {}
    }

    private class NativeEventHandlerDelegate {
        NativeEventHandlerDelegate(android.media.AudioManager p0, android.media.AudioDeviceCallback p1, android.os.Handler p2) {}
        android.os.Handler getHandler() { return null; }
    }

    private class OnAmPortUpdateListener implements android.media.AudioManager.OnAudioPortUpdateListener {
        static final java.lang.String TAG = "OnAmPortUpdateListener";
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

    public static interface OnCommunicationDeviceChangedListener {
        public void onCommunicationDeviceChanged(android.media.AudioDeviceInfo p0);
    }

    public static interface OnModeChangedListener {
        public void onModeChanged(int p0);
    }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static interface OnPreferredDeviceForStrategyChangedListener {
        public void onPreferredDeviceForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, android.media.AudioDeviceAttributes p1);
    }

    @android.annotation.SystemApi
    public static interface OnPreferredDevicesForCapturePresetChangedListener {
        public void onPreferredDevicesForCapturePresetChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    @android.annotation.SystemApi
    public static interface OnPreferredDevicesForStrategyChangedListener {
        public void onPreferredDevicesForStrategyChanged(android.media.audiopolicy.AudioProductStrategy p0, java.util.List<android.media.AudioDeviceAttributes> p1);
    }

    private static final class PlaybackConfigChangeCallbackData {
        final android.media.AudioManager.AudioPlaybackCallback mCb = null;
        final java.util.List<android.media.AudioPlaybackConfiguration> mConfigs = null;
        PlaybackConfigChangeCallbackData(android.media.AudioManager.AudioPlaybackCallback p0, java.util.List<android.media.AudioPlaybackConfiguration> p1) {}
    }

    private static class PrefDevListenerInfo {
        final android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        PrefDevListenerInfo(android.media.AudioManager.OnPreferredDevicesForStrategyChangedListener p0, java.util.concurrent.Executor p1) {}
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
        public void safeNotify() {}
        public void safeWait(long p0) throws java.lang.InterruptedException {}
    }

    private class ServiceEventHandlerDelegate {
        ServiceEventHandlerDelegate(android.media.AudioManager p0, android.os.Handler p1) {}
        android.os.Handler getHandler() { return null; }
    }

    private final class StrategyPreferredDevicesDispatcherStub extends android.media.IStrategyPreferredDevicesDispatcher.Stub {
        public void dispatchPrefDevicesChanged(int p0, java.util.List<android.media.AudioDeviceAttributes> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemSoundEffect {
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
