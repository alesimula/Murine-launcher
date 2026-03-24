package android.media;

public class AudioSystem {
    private static final boolean DEBUG_VOLUME = false;
    private static final java.lang.String TAG = "AudioSystem";
    public static final int STREAM_DEFAULT = -1;
    public static final int STREAM_VOICE_CALL = 0;
    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_RING = 2;
    public static final int STREAM_MUSIC = 3;
    public static final int STREAM_ALARM = 4;
    public static final int STREAM_NOTIFICATION = 5;
    public static final int STREAM_BLUETOOTH_SCO = 6;
    @android.annotation.UnsupportedAppUsage
    public static final int STREAM_SYSTEM_ENFORCED = 7;
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_TTS = 9;
    public static final int STREAM_ACCESSIBILITY = 10;
    public static final int NUM_STREAMS = 5;
    public static final int OUT_CHANNEL_COUNT_MAX = Integer.valueOf(0);
    private static final int NUM_STREAM_TYPES = 11;
    public static final java.lang.String[] STREAM_NAMES = null;
    public static final int MODE_INVALID = -2;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int NUM_MODES = 4;
    public static final int AUDIO_FORMAT_INVALID = -1;
    public static final int AUDIO_FORMAT_DEFAULT = 0;
    public static final int AUDIO_FORMAT_AAC = 67108864;
    public static final int AUDIO_FORMAT_SBC = 520093696;
    public static final int AUDIO_FORMAT_APTX = 536870912;
    public static final int AUDIO_FORMAT_APTX_HD = 553648128;
    public static final int AUDIO_FORMAT_LDAC = 587202560;
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
    public static final int AUDIO_SESSION_ALLOCATE = 0;
    public static final int AUDIO_STATUS_OK = 0;
    public static final int AUDIO_STATUS_ERROR = 1;
    public static final int AUDIO_STATUS_SERVER_DIED = 100;
    private static android.media.AudioSystem.ErrorCallback mErrorCallback;
    private static final int DYNAMIC_POLICY_EVENT_MIX_STATE_UPDATE = 0;
    private static android.media.AudioSystem.DynamicPolicyCallback sDynPolicyCallback;
    private static android.media.AudioSystem.AudioRecordingCallback sRecordingCallback;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int BAD_VALUE = -2;
    public static final int INVALID_OPERATION = -3;
    public static final int PERMISSION_DENIED = -4;
    public static final int NO_INIT = -5;
    public static final int DEAD_OBJECT = -6;
    public static final int WOULD_BLOCK = -7;
    public static final int DEVICE_NONE = 0;
    public static final int DEVICE_BIT_IN = -2147483648;
    public static final int DEVICE_BIT_DEFAULT = 1073741824;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_EARPIECE = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_SPEAKER = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_SCO = 16;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_HDMI = 1024;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_ANLG_DOCK_HEADSET = 2048;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_DGTL_DOCK_HEADSET = 4096;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_USB_ACCESSORY = 8192;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_REMOTE_SUBMIX = 32768;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_TELEPHONY_TX = 65536;
    public static final int DEVICE_OUT_LINE = 131072;
    public static final int DEVICE_OUT_HDMI_ARC = 262144;
    public static final int DEVICE_OUT_SPDIF = 524288;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_FM = 1048576;
    public static final int DEVICE_OUT_AUX_LINE = 2097152;
    public static final int DEVICE_OUT_SPEAKER_SAFE = 4194304;
    public static final int DEVICE_OUT_IP = 8388608;
    public static final int DEVICE_OUT_BUS = 16777216;
    public static final int DEVICE_OUT_PROXY = 33554432;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_HEARING_AID = 134217728;
    public static final int DEVICE_OUT_DEFAULT = 1073741824;
    public static final int DEVICE_OUT_ALL = 1342177279;
    public static final int DEVICE_OUT_ALL_A2DP = 896;
    public static final int DEVICE_OUT_ALL_SCO = 112;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_OUT_ALL_USB = 67133440;
    public static final int DEVICE_OUT_ALL_HDMI_SYSTEM_AUDIO = 2883584;
    public static final int DEVICE_ALL_HDMI_SYSTEM_AUDIO_AND_SPEAKER = 2883586;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_COMMUNICATION = -2147483647;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_AMBIENT = -2147483646;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_BUILTIN_MIC = -2147483644;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = -2147483640;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_WIRED_HEADSET = -2147483632;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_AUX_DIGITAL = -2147483616;
    public static final int DEVICE_IN_HDMI = -2147483616;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_VOICE_CALL = -2147483584;
    public static final int DEVICE_IN_TELEPHONY_RX = -2147483584;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_BACK_MIC = -2147483520;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_REMOTE_SUBMIX = -2147483392;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_ANLG_DOCK_HEADSET = -2147483136;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_DGTL_DOCK_HEADSET = -2147482624;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_USB_ACCESSORY = -2147481600;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_USB_DEVICE = -2147479552;
    public static final int DEVICE_IN_FM_TUNER = -2147475456;
    public static final int DEVICE_IN_TV_TUNER = -2147467264;
    public static final int DEVICE_IN_LINE = -2147450880;
    public static final int DEVICE_IN_SPDIF = -2147418112;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_BLUETOOTH_A2DP = -2147352576;
    public static final int DEVICE_IN_LOOPBACK = -2147221504;
    public static final int DEVICE_IN_IP = -2146959360;
    public static final int DEVICE_IN_BUS = -2146435072;
    public static final int DEVICE_IN_PROXY = -2130706432;
    public static final int DEVICE_IN_USB_HEADSET = -2113929216;
    public static final int DEVICE_IN_BLUETOOTH_BLE = -2080374784;
    public static final int DEVICE_IN_HDMI_ARC = -2013265920;
    public static final int DEVICE_IN_ECHO_REFERENCE = -1879048192;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_IN_DEFAULT = -1073741824;
    public static final int DEVICE_IN_ALL = -551550977;
    public static final int DEVICE_IN_ALL_SCO = -2147483640;
    public static final int DEVICE_IN_ALL_USB = -2113923072;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_STATE_UNAVAILABLE = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int DEVICE_STATE_AVAILABLE = 1;
    private static final int NUM_DEVICE_STATES = 1;
    public static final java.lang.String DEVICE_OUT_EARPIECE_NAME = "earpiece";
    public static final java.lang.String DEVICE_OUT_SPEAKER_NAME = "speaker";
    public static final java.lang.String DEVICE_OUT_WIRED_HEADSET_NAME = "headset";
    public static final java.lang.String DEVICE_OUT_WIRED_HEADPHONE_NAME = "headphone";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_SCO_NAME = "bt_sco";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_SCO_HEADSET_NAME = "bt_sco_hs";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_SCO_CARKIT_NAME = "bt_sco_carkit";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_A2DP_NAME = "bt_a2dp";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES_NAME = "bt_a2dp_hp";
    public static final java.lang.String DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER_NAME = "bt_a2dp_spk";
    public static final java.lang.String DEVICE_OUT_AUX_DIGITAL_NAME = "aux_digital";
    public static final java.lang.String DEVICE_OUT_HDMI_NAME = "hdmi";
    public static final java.lang.String DEVICE_OUT_ANLG_DOCK_HEADSET_NAME = "analog_dock";
    public static final java.lang.String DEVICE_OUT_DGTL_DOCK_HEADSET_NAME = "digital_dock";
    public static final java.lang.String DEVICE_OUT_USB_ACCESSORY_NAME = "usb_accessory";
    public static final java.lang.String DEVICE_OUT_USB_DEVICE_NAME = "usb_device";
    public static final java.lang.String DEVICE_OUT_REMOTE_SUBMIX_NAME = "remote_submix";
    public static final java.lang.String DEVICE_OUT_TELEPHONY_TX_NAME = "telephony_tx";
    public static final java.lang.String DEVICE_OUT_LINE_NAME = "line";
    public static final java.lang.String DEVICE_OUT_HDMI_ARC_NAME = "hmdi_arc";
    public static final java.lang.String DEVICE_OUT_SPDIF_NAME = "spdif";
    public static final java.lang.String DEVICE_OUT_FM_NAME = "fm_transmitter";
    public static final java.lang.String DEVICE_OUT_AUX_LINE_NAME = "aux_line";
    public static final java.lang.String DEVICE_OUT_SPEAKER_SAFE_NAME = "speaker_safe";
    public static final java.lang.String DEVICE_OUT_IP_NAME = "ip";
    public static final java.lang.String DEVICE_OUT_BUS_NAME = "bus";
    public static final java.lang.String DEVICE_OUT_PROXY_NAME = "proxy";
    public static final java.lang.String DEVICE_OUT_USB_HEADSET_NAME = "usb_headset";
    public static final java.lang.String DEVICE_OUT_HEARING_AID_NAME = "hearing_aid_out";
    public static final java.lang.String DEVICE_IN_COMMUNICATION_NAME = "communication";
    public static final java.lang.String DEVICE_IN_AMBIENT_NAME = "ambient";
    public static final java.lang.String DEVICE_IN_BUILTIN_MIC_NAME = "mic";
    public static final java.lang.String DEVICE_IN_BLUETOOTH_SCO_HEADSET_NAME = "bt_sco_hs";
    public static final java.lang.String DEVICE_IN_WIRED_HEADSET_NAME = "headset";
    public static final java.lang.String DEVICE_IN_AUX_DIGITAL_NAME = "aux_digital";
    public static final java.lang.String DEVICE_IN_TELEPHONY_RX_NAME = "telephony_rx";
    public static final java.lang.String DEVICE_IN_BACK_MIC_NAME = "back_mic";
    public static final java.lang.String DEVICE_IN_REMOTE_SUBMIX_NAME = "remote_submix";
    public static final java.lang.String DEVICE_IN_ANLG_DOCK_HEADSET_NAME = "analog_dock";
    public static final java.lang.String DEVICE_IN_DGTL_DOCK_HEADSET_NAME = "digital_dock";
    public static final java.lang.String DEVICE_IN_USB_ACCESSORY_NAME = "usb_accessory";
    public static final java.lang.String DEVICE_IN_USB_DEVICE_NAME = "usb_device";
    public static final java.lang.String DEVICE_IN_FM_TUNER_NAME = "fm_tuner";
    public static final java.lang.String DEVICE_IN_TV_TUNER_NAME = "tv_tuner";
    public static final java.lang.String DEVICE_IN_LINE_NAME = "line";
    public static final java.lang.String DEVICE_IN_SPDIF_NAME = "spdif";
    public static final java.lang.String DEVICE_IN_BLUETOOTH_A2DP_NAME = "bt_a2dp";
    public static final java.lang.String DEVICE_IN_LOOPBACK_NAME = "loopback";
    public static final java.lang.String DEVICE_IN_IP_NAME = "ip";
    public static final java.lang.String DEVICE_IN_BUS_NAME = "bus";
    public static final java.lang.String DEVICE_IN_PROXY_NAME = "proxy";
    public static final java.lang.String DEVICE_IN_USB_HEADSET_NAME = "usb_headset";
    public static final java.lang.String DEVICE_IN_BLUETOOTH_BLE_NAME = "bt_ble";
    public static final java.lang.String DEVICE_IN_ECHO_REFERENCE_NAME = "echo_reference";
    public static final java.lang.String DEVICE_IN_HDMI_ARC_NAME = "hdmi_arc";
    public static final int PHONE_STATE_OFFCALL = 0;
    public static final int PHONE_STATE_RINGING = 1;
    public static final int PHONE_STATE_INCALL = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int FORCE_NONE = 0;
    public static final int FORCE_SPEAKER = 1;
    public static final int FORCE_HEADPHONES = 2;
    public static final int FORCE_BT_SCO = 3;
    public static final int FORCE_BT_A2DP = 4;
    public static final int FORCE_WIRED_ACCESSORY = 5;
    @android.annotation.UnsupportedAppUsage
    public static final int FORCE_BT_CAR_DOCK = 6;
    @android.annotation.UnsupportedAppUsage
    public static final int FORCE_BT_DESK_DOCK = 7;
    @android.annotation.UnsupportedAppUsage
    public static final int FORCE_ANALOG_DOCK = 8;
    @android.annotation.UnsupportedAppUsage
    public static final int FORCE_DIGITAL_DOCK = 9;
    public static final int FORCE_NO_BT_A2DP = 10;
    public static final int FORCE_SYSTEM_ENFORCED = 11;
    public static final int FORCE_HDMI_SYSTEM_AUDIO_ENFORCED = 12;
    public static final int FORCE_ENCODED_SURROUND_NEVER = 13;
    public static final int FORCE_ENCODED_SURROUND_ALWAYS = 14;
    public static final int FORCE_ENCODED_SURROUND_MANUAL = 15;
    public static final int NUM_FORCE_CONFIG = 16;
    public static final int FORCE_DEFAULT = 0;
    public static final int FOR_COMMUNICATION = 0;
    public static final int FOR_MEDIA = 1;
    public static final int FOR_RECORD = 2;
    public static final int FOR_DOCK = 3;
    public static final int FOR_SYSTEM = 4;
    public static final int FOR_HDMI_SYSTEM_AUDIO = 5;
    public static final int FOR_ENCODED_SURROUND = 6;
    public static final int FOR_VIBRATE_RINGING = 7;
    private static final int NUM_FORCE_USE = 8;
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    public static final int AUDIO_HW_SYNC_INVALID = 0;
    public static final int PLAY_SOUND_DELAY = 300;
    public static final java.lang.String IN_VOICE_COMM_FOCUS_ID = "AudioFocus_For_Phone_Ring_And_Calls";
    public static int[] DEFAULT_STREAM_VOLUME;
    public static final int PLATFORM_DEFAULT = 0;
    public static final int PLATFORM_VOICE = 1;
    public static final int PLATFORM_TELEVISION = 2;
    public static final int DEFAULT_MUTE_STREAMS_AFFECTED = 111;
    static final int NATIVE_EVENT_ROUTING_CHANGE = 1000;
    public AudioSystem() {}
    private static native int native_get_FCC_8();
    @android.annotation.UnsupportedAppUsage
    public static final int getNumStreamTypes() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static native int muteMicrophone(boolean p0);
    @android.annotation.UnsupportedAppUsage
    public static native boolean isMicrophoneMuted();
    public static java.lang.String modeToString(int p0) { return null; }
    public static int audioFormatToBluetoothSourceCodec(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static native boolean isStreamActive(int p0, int p1);
    public static native boolean isStreamActiveRemotely(int p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public static native boolean isSourceActive(int p0);
    public static native int newAudioSessionId();
    public static native int newAudioPlayerId();
    public static native int newAudioRecorderId();
    @android.annotation.UnsupportedAppUsage
    public static native int setParameters(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public static native java.lang.String getParameters(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public static void setErrorCallback(android.media.AudioSystem.ErrorCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    private static void errorCallbackFromNative(int p0) {}
    public static void setDynamicPolicyCallback(android.media.AudioSystem.DynamicPolicyCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    private static void dynamicPolicyCallbackFromNative(int p0, java.lang.String p1, int p2) {}
    public static void setRecordingCallback(android.media.AudioSystem.AudioRecordingCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    private static void recordingCallbackFromNative(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, int[] p7, android.media.audiofx.AudioEffect.Descriptor[] p8, android.media.audiofx.AudioEffect.Descriptor[] p9, int p10) {}
    public static java.lang.String deviceStateToString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getOutputDeviceName(int p0) { return null; }
    public static java.lang.String getInputDeviceName(int p0) { return null; }
    public static java.lang.String forceUseConfigToString(int p0) { return null; }
    public static java.lang.String forceUseUsageToString(int p0) { return null; }
    public static int setStreamVolumeIndexAS(int p0, int p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static native int setDeviceConnectionState(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4);
    @android.annotation.UnsupportedAppUsage
    public static native int getDeviceConnectionState(int p0, java.lang.String p1);
    public static native int handleDeviceConfigChange(int p0, java.lang.String p1, java.lang.String p2, int p3);
    @android.annotation.UnsupportedAppUsage
    public static native int setPhoneState(int p0);
    @android.annotation.UnsupportedAppUsage
    public static native int setForceUse(int p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public static native int getForceUse(int p0);
    @android.annotation.UnsupportedAppUsage
    public static native int initStreamVolume(int p0, int p1, int p2);
    @android.annotation.UnsupportedAppUsage
    private static native int setStreamVolumeIndex(int p0, int p1, int p2);
    public static native int getStreamVolumeIndex(int p0, int p1);
    public static native int setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, int p2);
    public static native int getVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1);
    public static native int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0);
    public static native int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0);
    public static native int setMasterVolume(float p0);
    public static native float getMasterVolume();
    @android.annotation.UnsupportedAppUsage
    public static native int setMasterMute(boolean p0);
    @android.annotation.UnsupportedAppUsage
    public static native boolean getMasterMute();
    @android.annotation.UnsupportedAppUsage
    public static native int getDevicesForStream(int p0);
    public static native boolean getMasterMono();
    public static native int setMasterMono(boolean p0);
    public static native int setRttEnabled(boolean p0);
    public static native float getMasterBalance();
    public static native int setMasterBalance(float p0);
    @android.annotation.UnsupportedAppUsage(trackingBug=134049522L)
    public static native int getPrimaryOutputSamplingRate();
    @android.annotation.UnsupportedAppUsage(trackingBug=134049522L)
    public static native int getPrimaryOutputFrameCount();
    @android.annotation.UnsupportedAppUsage
    public static native int getOutputLatency(int p0);
    public static native int setLowRamDevice(boolean p0, long p1);
    @android.annotation.UnsupportedAppUsage
    public static native int checkAudioFlinger();
    public static native int listAudioPorts(java.util.ArrayList<android.media.AudioPort> p0, int[] p1);
    public static native int createAudioPatch(android.media.AudioPatch[] p0, android.media.AudioPortConfig[] p1, android.media.AudioPortConfig[] p2);
    public static native int releaseAudioPatch(android.media.AudioPatch p0);
    public static native int listAudioPatches(java.util.ArrayList<android.media.AudioPatch> p0, int[] p1);
    public static native int setAudioPortConfig(android.media.AudioPortConfig p0);
    public static native int startAudioSource(android.media.AudioPortConfig p0, android.media.AudioAttributes p1);
    public static native int stopAudioSource(int p0);
    private static final native void native_register_dynamic_policy_callback();
    private static final native void native_register_recording_callback();
    public static native int getAudioHwSyncForSession(int p0);
    public static native int registerPolicyMixes(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0, boolean p1);
    public static native int setUidDeviceAffinities(int p0, int[] p1, java.lang.String[] p2);
    public static native int removeUidDeviceAffinities(int p0);
    public static native int systemReady();
    public static native float getStreamVolumeDB(int p0, int p1, int p2);
    public static native int setAllowedCapturePolicy(int p0, int p1);
    static boolean isOffloadSupported(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return false; }
    private static native boolean native_is_offload_supported(int p0, int p1, int p2, int p3, int p4);
    public static native int getMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0);
    public static native int getSurroundFormats(java.util.Map<java.lang.Integer, java.lang.Boolean> p0, boolean p1);
    public static native int getHwOffloadEncodingFormatsSupportedForA2DP(java.util.ArrayList<java.lang.Integer> p0);
    public static native int setSurroundFormatEnabled(int p0, boolean p1);
    public static native int setAssistantUid(int p0);
    public static native int setA11yServicesUids(int[] p0);
    public static native boolean isHapticPlaybackSupported();
    public static int getValueForVibrateSetting(int p0, int p1, int p2) { return 0; }
    public static int getDefaultStreamVolume(int p0) { return 0; }
    public static java.lang.String streamToString(int p0) { return null; }
    public static int getPlatformType(android.content.Context p0) { return 0; }
    public static boolean isSingleVolume(android.content.Context p0) { return false; }

    public static interface ErrorCallback {
        public void onError(int p0);
    }

    public static interface DynamicPolicyCallback {
        public void onDynamicPolicyMixStateUpdate(java.lang.String p0, int p1);
    }

    public static interface AudioRecordingCallback {
        public void onRecordingConfigurationChanged(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, int[] p7, android.media.audiofx.AudioEffect.Descriptor[] p8, android.media.audiofx.AudioEffect.Descriptor[] p9, int p10, java.lang.String p11);
    }
}
