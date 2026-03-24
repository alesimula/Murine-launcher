package android.media;

public class AudioSystem {
    public static final int STREAM_DEFAULT = -1;
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
    public static final int STREAM_ASSISTANT = 11;
    public static final int NUM_STREAMS = 5;
    public static final int OUT_CHANNEL_COUNT_MAX = Integer.valueOf(0);
    public static final int SAMPLE_RATE_HZ_MAX = Integer.valueOf(0);
    public static final int SAMPLE_RATE_HZ_MIN = Integer.valueOf(0);
    public static final int FCC_24 = 24;
    public static final java.lang.String[] STREAM_NAMES = null;
    public static final int MODE_INVALID = -2;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_CALL_SCREENING = 4;
    public static final int MODE_CALL_REDIRECT = 5;
    public static final int MODE_COMMUNICATION_REDIRECT = 6;
    public static final int NUM_MODES = 7;
    public static final int AUDIO_FORMAT_INVALID = -1;
    public static final int AUDIO_FORMAT_DEFAULT = 0;
    public static final int AUDIO_FORMAT_AAC = 67108864;
    public static final int AUDIO_FORMAT_SBC = 520093696;
    public static final int AUDIO_FORMAT_APTX = 536870912;
    public static final int AUDIO_FORMAT_APTX_HD = 553648128;
    public static final int AUDIO_FORMAT_LDAC = 587202560;
    public static final int AUDIO_FORMAT_LC3 = 721420288;
    public static final int AUDIO_FORMAT_OPUS = 134217728;
    public static final int AUDIO_FORMAT_OPUS_HI_RES = 134217729;
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
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
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
    public static final int DEVICE_OUT_AUX_LINE = 2097152;
    public static final int DEVICE_OUT_SPEAKER_SAFE = 4194304;
    public static final int DEVICE_OUT_IP = 8388608;
    public static final int DEVICE_OUT_MULTICHANNEL_GROUP = 8388609;
    public static final int DEVICE_OUT_BUS = 16777216;
    public static final int DEVICE_OUT_PROXY = 33554432;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_HEARING_AID = 134217728;
    public static final int DEVICE_OUT_ECHO_CANCELLER = 268435456;
    public static final int DEVICE_OUT_BLE_HEADSET = 536870912;
    public static final int DEVICE_OUT_BLE_SPEAKER = 536870913;
    public static final int DEVICE_OUT_BLE_BROADCAST = 536870914;
    public static final int DEVICE_OUT_DEFAULT = 1073741824;
    public static final int DEVICE_OUT_ALL_USB = 67133440;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_A2DP_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_SCO_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_USB_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_HDMI_SYSTEM_AUDIO_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_ALL_HDMI_SYSTEM_AUDIO_AND_SPEAKER_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_ALL_BLE_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_OUT_PICK_FOR_VOLUME_SET = null;
    public static final int DEVICE_IN_COMMUNICATION = -2147483647;
    public static final int DEVICE_IN_AMBIENT = -2147483646;
    public static final int DEVICE_IN_BUILTIN_MIC = -2147483644;
    public static final int DEVICE_IN_BLUETOOTH_SCO_HEADSET = -2147483640;
    public static final int DEVICE_IN_WIRED_HEADSET = -2147483632;
    public static final int DEVICE_IN_AUX_DIGITAL = -2147483616;
    public static final int DEVICE_IN_HDMI = -2147483616;
    public static final int DEVICE_IN_VOICE_CALL = -2147483584;
    public static final int DEVICE_IN_TELEPHONY_RX = -2147483584;
    public static final int DEVICE_IN_BACK_MIC = -2147483520;
    public static final int DEVICE_IN_REMOTE_SUBMIX = -2147483392;
    public static final int DEVICE_IN_ANLG_DOCK_HEADSET = -2147483136;
    public static final int DEVICE_IN_DGTL_DOCK_HEADSET = -2147482624;
    public static final int DEVICE_IN_USB_ACCESSORY = -2147481600;
    public static final int DEVICE_IN_USB_DEVICE = -2147479552;
    public static final int DEVICE_IN_FM_TUNER = -2147475456;
    public static final int DEVICE_IN_TV_TUNER = -2147467264;
    public static final int DEVICE_IN_LINE = -2147450880;
    public static final int DEVICE_IN_SPDIF = -2147418112;
    public static final int DEVICE_IN_BLUETOOTH_A2DP = -2147352576;
    public static final int DEVICE_IN_LOOPBACK = -2147221504;
    public static final int DEVICE_IN_IP = -2146959360;
    public static final int DEVICE_IN_BUS = -2146435072;
    public static final int DEVICE_IN_PROXY = -2130706432;
    public static final int DEVICE_IN_USB_HEADSET = -2113929216;
    public static final int DEVICE_IN_BLUETOOTH_BLE = -2080374784;
    public static final int DEVICE_IN_HDMI_ARC = -2013265920;
    public static final int DEVICE_IN_HDMI_EARC = -2013265919;
    public static final int DEVICE_IN_ECHO_REFERENCE = -1879048192;
    public static final int DEVICE_IN_BLE_HEADSET = -1610612736;
    public static final int DEVICE_IN_DEFAULT = -1073741824;
    public static final java.util.Set<java.lang.Integer> DEVICE_IN_ALL_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_IN_ALL_SCO_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_IN_ALL_USB_SET = null;
    public static final java.util.Set<java.lang.Integer> DEVICE_IN_ALL_BLE_SET = null;
    public static final java.lang.String LEGACY_REMOTE_SUBMIX_ADDRESS = "0";
    public static final int DEVICE_STATE_UNAVAILABLE = 0;
    public static final int DEVICE_STATE_AVAILABLE = 1;
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
    public static final java.lang.String DEVICE_OUT_HDMI_ARC_NAME = "hdmi_arc";
    public static final java.lang.String DEVICE_OUT_HDMI_EARC_NAME = "hdmi_earc";
    public static final java.lang.String DEVICE_OUT_SPDIF_NAME = "spdif";
    public static final java.lang.String DEVICE_OUT_FM_NAME = "fm_transmitter";
    public static final java.lang.String DEVICE_OUT_AUX_LINE_NAME = "aux_line";
    public static final java.lang.String DEVICE_OUT_SPEAKER_SAFE_NAME = "speaker_safe";
    public static final java.lang.String DEVICE_OUT_IP_NAME = "ip";
    public static final java.lang.String DEVICE_OUT_MULTICHANNEL_GROUP_NAME = "multichannel_group";
    public static final java.lang.String DEVICE_OUT_BUS_NAME = "bus";
    public static final java.lang.String DEVICE_OUT_PROXY_NAME = "proxy";
    public static final java.lang.String DEVICE_OUT_USB_HEADSET_NAME = "usb_headset";
    public static final java.lang.String DEVICE_OUT_HEARING_AID_NAME = "hearing_aid_out";
    public static final java.lang.String DEVICE_OUT_ECHO_CANCELLER_NAME = "echo_canceller";
    public static final java.lang.String DEVICE_OUT_BLE_HEADSET_NAME = "ble_headset";
    public static final java.lang.String DEVICE_OUT_BLE_SPEAKER_NAME = "ble_speaker";
    public static final java.lang.String DEVICE_OUT_BLE_BROADCAST_NAME = "ble_broadcast";
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
    public static final java.lang.String DEVICE_IN_HDMI_EARC_NAME = "hdmi_earc";
    public static final java.lang.String DEVICE_IN_BLE_HEADSET_NAME = "ble_headset";
    public static final int PHONE_STATE_OFFCALL = 0;
    public static final int PHONE_STATE_RINGING = 1;
    public static final int PHONE_STATE_INCALL = 2;
    public static final int FORCE_NONE = 0;
    public static final int FORCE_SPEAKER = 1;
    public static final int FORCE_HEADPHONES = 2;
    public static final int FORCE_BT_SCO = 3;
    public static final int FORCE_BT_A2DP = 4;
    public static final int FORCE_WIRED_ACCESSORY = 5;
    public static final int FORCE_BT_CAR_DOCK = 6;
    public static final int FORCE_BT_DESK_DOCK = 7;
    public static final int FORCE_ANALOG_DOCK = 8;
    public static final int FORCE_DIGITAL_DOCK = 9;
    public static final int FORCE_NO_BT_A2DP = 10;
    public static final int FORCE_SYSTEM_ENFORCED = 11;
    public static final int FORCE_HDMI_SYSTEM_AUDIO_ENFORCED = 12;
    public static final int FORCE_ENCODED_SURROUND_NEVER = 13;
    public static final int FORCE_ENCODED_SURROUND_ALWAYS = 14;
    public static final int FORCE_ENCODED_SURROUND_MANUAL = 15;
    public static final int FORCE_BT_BLE = 16;
    public static final int NUM_FORCE_CONFIG = 17;
    public static final int FORCE_DEFAULT = 0;
    public static final int FOR_COMMUNICATION = 0;
    public static final int FOR_MEDIA = 1;
    public static final int FOR_RECORD = 2;
    public static final int FOR_DOCK = 3;
    public static final int FOR_SYSTEM = 4;
    public static final int FOR_HDMI_SYSTEM_AUDIO = 5;
    public static final int FOR_ENCODED_SURROUND = 6;
    public static final int FOR_VIBRATE_RINGING = 7;
    public static final int DEVICE_ROLE_NONE = 0;
    public static final int DEVICE_ROLE_PREFERRED = 1;
    public static final int DEVICE_ROLE_DISABLED = 2;
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    public static final int SYNC_EVENT_SHARE_AUDIO_HISTORY = 100;
    public static final int AUDIO_HW_SYNC_INVALID = 0;
    public static final int DIRECT_NOT_SUPPORTED = 0;
    public static final int DIRECT_OFFLOAD_SUPPORTED = 1;
    public static final int DIRECT_OFFLOAD_GAPLESS_SUPPORTED = 3;
    public static final int DIRECT_BITSTREAM_SUPPORTED = 4;
    public static final int OFFLOAD_NOT_SUPPORTED = 0;
    public static final int OFFLOAD_SUPPORTED = 1;
    public static final int OFFLOAD_GAPLESS_SUPPORTED = 2;
    public static final int PLAY_SOUND_DELAY = 300;
    public static final java.lang.String IN_VOICE_COMM_FOCUS_ID = "AudioFocus_For_Phone_Ring_And_Calls";
    public static int[] DEFAULT_STREAM_VOLUME;
    public static final int PLATFORM_DEFAULT = 0;
    public static final int PLATFORM_VOICE = 1;
    public static final int PLATFORM_TELEVISION = 2;
    public static final int PLATFORM_AUTOMOTIVE = 3;
    public static final int PLATFORM_PC = 4;
    public static final int DEFAULT_MUTE_STREAMS_AFFECTED = 111;
    static final int NATIVE_EVENT_ROUTING_CHANGE = 1000;
    public static final int getNumStreamTypes() { return 0; }
    public static native int muteMicrophone(boolean p0);
    public static native boolean isMicrophoneMuted();
    public static java.lang.String modeToString(int p0) { return null; }
    public static int audioFormatToBluetoothSourceCodec(int p0) { return 0; }
    public static int audioFormatToBluetoothLeAudioSourceCodec(int p0) { return 0; }
    public static int bluetoothA2dpCodecToAudioFormat(int p0) { return 0; }
    public static int bluetoothLeCodecToAudioFormat(int p0) { return 0; }
    public static java.lang.String audioFormatToString(int p0) { return null; }
    public static native boolean isStreamActive(int p0, int p1);
    public static native boolean isStreamActiveRemotely(int p0, int p1);
    public static native boolean isSourceActive(int p0);
    public static native int newAudioSessionId();
    public static native int newAudioPlayerId();
    public static native int newAudioRecorderId();
    public static native int setParameters(java.lang.String p0);
    public static native java.lang.String getParameters(java.lang.String p0);
    public static void setErrorCallback(android.media.AudioSystem.ErrorCallback p0) {}
    public static void setDynamicPolicyCallback(android.media.AudioSystem.DynamicPolicyCallback p0) {}
    public static void setRecordingCallback(android.media.AudioSystem.AudioRecordingCallback p0) {}
    public static void setRoutingCallback(android.media.AudioSystem.RoutingUpdateCallback p0) {}
    public static void setVolumeRangeInitRequestCallback(android.media.AudioSystem.VolumeRangeInitRequestCallback p0) {}
    public static java.lang.String audioSystemErrorToString(int p0) { return null; }
    public static boolean isInputDevice(int p0) { return false; }
    public static boolean isBluetoothDevice(int p0) { return false; }
    public static boolean isBluetoothOutDevice(int p0) { return false; }
    public static boolean isBluetoothInDevice(int p0) { return false; }
    public static boolean isBluetoothA2dpOutDevice(int p0) { return false; }
    public static boolean isBluetoothScoOutDevice(int p0) { return false; }
    public static boolean isBluetoothScoInDevice(int p0) { return false; }
    public static boolean isBluetoothScoDevice(int p0) { return false; }
    public static boolean isBluetoothLeOutDevice(int p0) { return false; }
    public static boolean isBluetoothLeInDevice(int p0) { return false; }
    public static boolean isBluetoothLeDevice(int p0) { return false; }
    public static boolean isRemoteSubmixDevice(int p0) { return false; }
    public static java.lang.String deviceStateToString(int p0) { return null; }
    public static java.lang.String getOutputDeviceName(int p0) { return null; }
    public static java.lang.String getInputDeviceName(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getDeviceName(int p0) { return null; }
    public static java.lang.String forceUseConfigToString(int p0) { return null; }
    public static java.lang.String forceUseUsageToString(int p0) { return null; }
    public static int setStreamVolumeIndexAS(int p0, int p1, boolean p2, int p3) { return 0; }
    public static int setDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, int p2) { return 0; }
    public static int setDeviceConnectionState(android.media.AudioDeviceAttributes p0, int p1, int p2, boolean p3) { return 0; }
    public static native int setDeviceConnectionState(int p0, android.os.Parcel p1, int p2, boolean p3);
    public static native int getDeviceConnectionState(int p0, java.lang.String p1);
    public static native int handleDeviceConfigChange(int p0, java.lang.String p1, java.lang.String p2, int p3);
    public static int setPhoneState(int p0) { return 0; }
    public static native int setPhoneState(int p0, int p1);
    public static native int setForceUse(int p0, int p1);
    public static native int getForceUse(int p0);
    public static native int setDeviceAbsoluteVolumeEnabled(int p0, java.lang.String p1, boolean p2, int p3);
    public static native int initStreamVolume(int p0, int p1, int p2);
    public static native int getStreamVolumeIndex(int p0, int p1);
    public static native int setVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1, boolean p2, int p3);
    public static native int getVolumeIndexForAttributes(android.media.AudioAttributes p0, int p1);
    public static native int getMinVolumeIndexForAttributes(android.media.AudioAttributes p0);
    public static native int getMaxVolumeIndexForAttributes(android.media.AudioAttributes p0);
    public static native int setVolumeIndexForGroup(int p0, int p1, boolean p2, int p3);
    public static native int getVolumeIndexForGroup(int p0, int p1);
    public static native int getMinVolumeIndexForGroup(int p0);
    public static native int setMinVolumeIndexForGroup(int p0, int p1);
    public static native int getMaxVolumeIndexForGroup(int p0);
    public static native int setMaxVolumeIndexForGroup(int p0, int p1);
    public static native int setMasterVolume(float p0);
    public static native float getMasterVolume();
    public static native int setMasterMute(boolean p0);
    public static native boolean getMasterMute();
    @java.lang.Deprecated
    public static int getDevicesForStream(int p0) { return 0; }
    public static int getDeviceMaskFromSet(java.util.Set<android.media.AudioDeviceAttributes> p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String deviceSetToString(java.util.Set<android.media.AudioDeviceAttributes> p0) { return null; }
    @android.annotation.NonNull
    public static java.util.ArrayList<android.media.AudioDeviceAttributes> getDevicesForAttributes(android.media.AudioAttributes p0, boolean p1) { return null; }
    public static native boolean getMasterMono();
    public static native int setMasterMono(boolean p0);
    public static native int setRttEnabled(boolean p0);
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS")
    public static native float getMasterBalance();
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS")
    public static native int setMasterBalance(float p0);
    public static native int getPrimaryOutputSamplingRate();
    public static native int getPrimaryOutputFrameCount();
    public static native int getOutputLatency(int p0);
    public static native int setLowRamDevice(boolean p0, long p1);
    public static native int checkAudioFlinger();
    public static native void setAudioFlingerBinder(android.os.IBinder p0);
    public static native int listAudioPorts(java.util.ArrayList<android.media.AudioPort> p0, int[] p1);
    public static native int getSupportedDeviceTypes(int p0, android.util.IntArray p1);
    public static native int createAudioPatch(android.media.AudioPatch[] p0, android.media.AudioPortConfig[] p1, android.media.AudioPortConfig[] p2);
    public static native int releaseAudioPatch(android.media.AudioPatch p0);
    public static native int listAudioPatches(java.util.ArrayList<android.media.AudioPatch> p0, int[] p1);
    public static native int setAudioPortConfig(android.media.AudioPortConfig p0);
    public static native int startAudioSource(android.media.AudioPortConfig p0, android.media.AudioAttributes p1);
    public static native int stopAudioSource(int p0);
    public static native int getAudioHwSyncForSession(int p0);
    public static native int registerPolicyMixes(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0, boolean p1);
    public static native int getRegisteredPolicyMixes(java.util.List<android.media.audiopolicy.AudioMix> p0);
    public static native int updatePolicyMixes(android.media.audiopolicy.AudioMix[] p0, android.media.audiopolicy.AudioMixingRule[] p1);
    public static native int setUidDeviceAffinities(int p0, int[] p1, java.lang.String[] p2);
    public static native int removeUidDeviceAffinities(int p0);
    public static native int setUserIdDeviceAffinities(int p0, int[] p1, java.lang.String[] p2);
    public static native int removeUserIdDeviceAffinities(int p0);
    public static native int systemReady();
    public static native float getStreamVolumeDB(int p0, int p1, int p2);
    public static native int setSupportedSystemUsages(int[] p0);
    public static native int setAllowedCapturePolicy(int p0, int p1);
    public static native int getDirectPlaybackSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1);
    static int getOffloadSupport(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return 0; }
    public static native int getMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0);
    public static native int getSurroundFormats(java.util.Map<java.lang.Integer, java.lang.Boolean> p0);
    public static native int getReportedSurroundFormats(java.util.ArrayList<java.lang.Integer> p0);
    public static native int getHwOffloadFormatsSupportedForBluetoothMedia(int p0, java.util.ArrayList<java.lang.Integer> p1);
    public static native int setSurroundFormatEnabled(int p0, boolean p1);
    public static native int setActiveAssistantServicesUids(int[] p0);
    public static native int setAssistantServicesUids(int[] p0);
    public static native int setA11yServicesUids(int[] p0);
    public static native int setCurrentImeUid(int p0);
    public static native boolean isHapticPlaybackSupported();
    public static native boolean isUltrasoundSupported();
    public static native int setAudioHalPids(int[] p0);
    public static native boolean isCallScreeningModeSupported();
    public static int setDevicesRoleForStrategy(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) { return 0; }
    public static int removeDevicesRoleForStrategy(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) { return 0; }
    public static native int removeDevicesRoleForStrategy(int p0, int p1, int[] p2, java.lang.String[] p3);
    public static native int clearDevicesRoleForStrategy(int p0, int p1);
    public static native int getDevicesForRoleAndStrategy(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2);
    public static int setDevicesRoleForCapturePreset(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) { return 0; }
    public static int addDevicesRoleForCapturePreset(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) { return 0; }
    public static int removeDevicesRoleForCapturePreset(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2) { return 0; }
    public static native int clearDevicesRoleForCapturePreset(int p0, int p1);
    public static native int getDevicesForRoleAndCapturePreset(int p0, int p1, java.util.List<android.media.AudioDeviceAttributes> p2);
    public static native int setVibratorInfos(java.util.List<android.os.Vibrator> p0);
    @android.annotation.Nullable
    public static android.media.ISpatializer getSpatializer(android.media.INativeSpatializerCallback p0) { return null; }
    public static native boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1, android.media.AudioDeviceAttributes[] p2);
    @android.annotation.Nullable
    public static android.media.ISoundDose getSoundDoseInterface(android.media.ISoundDoseCallback p0) { return null; }
    public static native int getDirectProfilesForAttributes(android.media.AudioAttributes p0, java.util.ArrayList<android.media.AudioProfile> p1);
    public static int getValueForVibrateSetting(int p0, int p1, int p2) { return 0; }
    public static int getDefaultStreamVolume(int p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String streamToString(int p0) { return null; }
    public static int getPlatformType(android.content.Context p0) { return 0; }
    public static boolean isSingleVolume(android.content.Context p0) { return false; }
    @android.annotation.NonNull
    public static java.util.Set<android.media.AudioDeviceAttributes> generateAudioDeviceTypesSet(java.util.List<android.media.AudioDeviceAttributes> p0) { return null; }
    public static java.util.Set<android.media.AudioDeviceAttributes> intersectionAudioDeviceTypes(java.util.Set<java.lang.Integer> p0, java.util.Set<android.media.AudioDeviceAttributes> p1) { return null; }
    public static boolean isSingleAudioDeviceType(java.util.Set<java.lang.Integer> p0, int p1) { return false; }
    public static boolean isLeAudioDeviceType(int p0) { return false; }
    public static native int getSupportedMixerAttributes(int p0, java.util.List<android.media.AudioMixerAttributes> p1);
    public static native int setPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, int p2, android.media.AudioMixerAttributes p3);
    public static native int getPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, java.util.List<android.media.AudioMixerAttributes> p2);
    public static native int clearPreferredMixerAttributes(android.media.AudioAttributes p0, int p1, int p2);
    public static native boolean supportsBluetoothVariableLatency();
    public static native int setBluetoothVariableLatencyEnabled(boolean p0);
    public static native boolean isBluetoothVariableLatencyEnabled();
    public static native long listenForSystemPropertyChange(java.lang.String p0, java.lang.Runnable p1);
    public static native void triggerSystemPropertyUpdate(long p0);
    public static native int registerAudioVolumeGroupCallback(android.media.INativeAudioVolumeGroupCallback p0);
    public static native int unregisterAudioVolumeGroupCallback(android.media.INativeAudioVolumeGroupCallback p0);
    public static native int setSimulateDeviceConnections(boolean p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioFormatNativeEnumForBtCodec {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioFormatNativeEnumForBtLeAudioCodec {
    }

    public static interface AudioRecordingCallback {
        public void onRecordingConfigurationChanged(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, int[] p7, android.media.audiofx.AudioEffect.Descriptor[] p8, android.media.audiofx.AudioEffect.Descriptor[] p9, int p10, java.lang.String p11);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioSystemError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BtOffloadDeviceType {
    }

    public static interface DynamicPolicyCallback {
        public void onDynamicPolicyMixStateUpdate(java.lang.String p0, int p1);
    }

    public static interface ErrorCallback {
        public void onError(int p0);
    }

    public static interface RoutingUpdateCallback {
        public void onRoutingUpdated();
    }

    public static interface VolumeRangeInitRequestCallback {
        public void onVolumeRangeInitializationRequested();
    }
}
