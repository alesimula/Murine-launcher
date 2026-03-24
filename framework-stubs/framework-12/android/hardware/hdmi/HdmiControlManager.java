package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiControlManager {
    private static final java.lang.String TAG = "HdmiControlManager";
    private final android.hardware.hdmi.IHdmiControlService mService = null;
    private static final int INVALID_PHYSICAL_ADDRESS = 65535;
    private int mLocalPhysicalAddress;
    private final java.lang.Object mLock = null;
    public static final java.lang.String ACTION_OSD_MESSAGE = "android.hardware.hdmi.action.OSD_MESSAGE";
    public static final int OSD_MESSAGE_ARC_CONNECTED_INVALID_PORT = 1;
    public static final int OSD_MESSAGE_AVR_VOLUME_CHANGED = 2;
    public static final java.lang.String EXTRA_MESSAGE_ID = "android.hardware.hdmi.extra.MESSAGE_ID";
    public static final java.lang.String EXTRA_MESSAGE_EXTRA_PARAM1 = "android.hardware.hdmi.extra.MESSAGE_EXTRA_PARAM1";
    public static final int AVR_VOLUME_MUTED = 101;
    public static final int POWER_STATUS_UNKNOWN = -1;
    public static final int POWER_STATUS_ON = 0;
    public static final int POWER_STATUS_STANDBY = 1;
    public static final int POWER_STATUS_TRANSIENT_TO_ON = 2;
    public static final int POWER_STATUS_TRANSIENT_TO_STANDBY = 3;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_TIMEOUT = 1;
    public static final int RESULT_SOURCE_NOT_AVAILABLE = 2;
    public static final int RESULT_TARGET_NOT_AVAILABLE = 3;
    @java.lang.Deprecated
    public static final int RESULT_ALREADY_IN_PROGRESS = 4;
    public static final int RESULT_EXCEPTION = 5;
    public static final int RESULT_INCORRECT_MODE = 6;
    public static final int RESULT_COMMUNICATION_FAILED = 7;
    public static final int DEVICE_EVENT_ADD_DEVICE = 1;
    public static final int DEVICE_EVENT_REMOVE_DEVICE = 2;
    public static final int DEVICE_EVENT_UPDATE_DEVICE = 3;
    public static final int ONE_TOUCH_RECORD_RECORDING_CURRENTLY_SELECTED_SOURCE = 1;
    public static final int ONE_TOUCH_RECORD_RECORDING_DIGITAL_SERVICE = 2;
    public static final int ONE_TOUCH_RECORD_RECORDING_ANALOGUE_SERVICE = 3;
    public static final int ONE_TOUCH_RECORD_RECORDING_EXTERNAL_INPUT = 4;
    public static final int ONE_TOUCH_RECORD_UNABLE_DIGITAL_SERVICE = 5;
    public static final int ONE_TOUCH_RECORD_UNABLE_ANALOGUE_SERVICE = 6;
    public static final int ONE_TOUCH_RECORD_UNABLE_SELECTED_SERVICE = 7;
    public static final int ONE_TOUCH_RECORD_INVALID_EXTERNAL_PLUG_NUMBER = 9;
    public static final int ONE_TOUCH_RECORD_INVALID_EXTERNAL_PHYSICAL_ADDRESS = 10;
    public static final int ONE_TOUCH_RECORD_UNSUPPORTED_CA = 11;
    public static final int ONE_TOUCH_RECORD_NO_OR_INSUFFICIENT_CA_ENTITLEMENTS = 12;
    public static final int ONE_TOUCH_RECORD_DISALLOW_TO_COPY = 13;
    public static final int ONE_TOUCH_RECORD_DISALLOW_TO_FUTHER_COPIES = 14;
    public static final int ONE_TOUCH_RECORD_NO_MEDIA = 16;
    public static final int ONE_TOUCH_RECORD_PLAYING = 17;
    public static final int ONE_TOUCH_RECORD_ALREADY_RECORDING = 18;
    public static final int ONE_TOUCH_RECORD_MEDIA_PROTECTED = 19;
    public static final int ONE_TOUCH_RECORD_NO_SOURCE_SIGNAL = 20;
    public static final int ONE_TOUCH_RECORD_MEDIA_PROBLEM = 21;
    public static final int ONE_TOUCH_RECORD_NOT_ENOUGH_SPACE = 22;
    public static final int ONE_TOUCH_RECORD_PARENT_LOCK_ON = 23;
    public static final int ONE_TOUCH_RECORD_RECORDING_TERMINATED_NORMALLY = 26;
    public static final int ONE_TOUCH_RECORD_RECORDING_ALREADY_TERMINATED = 27;
    public static final int ONE_TOUCH_RECORD_OTHER_REASON = 31;
    public static final int ONE_TOUCH_RECORD_PREVIOUS_RECORDING_IN_PROGRESS = 48;
    public static final int ONE_TOUCH_RECORD_CHECK_RECORDER_CONNECTION = 49;
    public static final int ONE_TOUCH_RECORD_FAIL_TO_RECORD_DISPLAYED_SCREEN = 50;
    public static final int ONE_TOUCH_RECORD_CEC_DISABLED = 51;
    public static final int TIMER_RECORDING_TYPE_DIGITAL = 1;
    public static final int TIMER_RECORDING_TYPE_ANALOGUE = 2;
    public static final int TIMER_RECORDING_TYPE_EXTERNAL = 3;
    public static final int TIMER_STATUS_MEDIA_INFO_PRESENT_NOT_PROTECTED = 0;
    public static final int TIMER_STATUS_MEDIA_INFO_PRESENT_PROTECTED = 1;
    public static final int TIMER_STATUS_MEDIA_INFO_NOT_PRESENT = 2;
    public static final int TIMER_STATUS_PROGRAMMED_INFO_ENOUGH_SPACE = 8;
    public static final int TIMER_STATUS_PROGRAMMED_INFO_NOT_ENOUGH_SPACE = 9;
    public static final int TIMER_STATUS_PROGRAMMED_INFO_MIGHT_NOT_ENOUGH_SPACE = 11;
    public static final int TIMER_STATUS_PROGRAMMED_INFO_NO_MEDIA_INFO = 10;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_NO_FREE_TIME = 1;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_DATE_OUT_OF_RANGE = 2;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_SEQUENCE = 3;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_EXTERNAL_PLUG_NUMBER = 4;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_INVALID_EXTERNAL_PHYSICAL_NUMBER = 5;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_CA_NOT_SUPPORTED = 6;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_NO_CA_ENTITLEMENTS = 7;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_UNSUPPORTED_RESOLUTION = 8;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_PARENTAL_LOCK_ON = 9;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_CLOCK_FAILURE = 10;
    public static final int TIMER_STATUS_NOT_PROGRAMMED_DUPLICATED = 14;
    public static final int TIMER_RECORDING_RESULT_EXTRA_NO_ERROR = 0;
    public static final int TIMER_RECORDING_RESULT_EXTRA_CHECK_RECORDER_CONNECTION = 1;
    public static final int TIMER_RECORDING_RESULT_EXTRA_FAIL_TO_RECORD_SELECTED_SOURCE = 2;
    public static final int TIMER_RECORDING_RESULT_EXTRA_CEC_DISABLED = 3;
    public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_RECORDING = 0;
    public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_NO_MATCHING = 1;
    public static final int CLEAR_TIMER_STATUS_TIMER_NOT_CLEARED_NO_INFO_AVAILABLE = 2;
    public static final int CLEAR_TIMER_STATUS_TIMER_CLEARED = 128;
    public static final int CLEAR_TIMER_STATUS_CHECK_RECORDER_CONNECTION = 160;
    public static final int CLEAR_TIMER_STATUS_FAIL_TO_CLEAR_SELECTED_SOURCE = 161;
    public static final int CLEAR_TIMER_STATUS_CEC_DISABLE = 162;
    public static final int CONTROL_STATE_CHANGED_REASON_START = 0;
    public static final int CONTROL_STATE_CHANGED_REASON_SETTING = 1;
    public static final int CONTROL_STATE_CHANGED_REASON_WAKEUP = 2;
    public static final int CONTROL_STATE_CHANGED_REASON_STANDBY = 3;
    @android.annotation.SystemApi
    public static final int HDMI_CEC_CONTROL_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int HDMI_CEC_CONTROL_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int HDMI_CEC_VERSION_1_4_B = 5;
    @android.annotation.SystemApi
    public static final int HDMI_CEC_VERSION_2_0 = 6;
    @android.annotation.SystemApi
    public static final java.lang.String POWER_CONTROL_MODE_TV = "to_tv";
    @android.annotation.SystemApi
    public static final java.lang.String POWER_CONTROL_MODE_BROADCAST = "broadcast";
    @android.annotation.SystemApi
    public static final java.lang.String POWER_CONTROL_MODE_NONE = "none";
    @android.annotation.SystemApi
    public static final java.lang.String POWER_STATE_CHANGE_ON_ACTIVE_SOURCE_LOST_NONE = "none";
    @android.annotation.SystemApi
    public static final java.lang.String POWER_STATE_CHANGE_ON_ACTIVE_SOURCE_LOST_STANDBY_NOW = "standby_now";
    @android.annotation.SystemApi
    public static final int SYSTEM_AUDIO_MODE_MUTING_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int SYSTEM_AUDIO_MODE_MUTING_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int VOLUME_CONTROL_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int VOLUME_CONTROL_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int TV_WAKE_ON_ONE_TOUCH_PLAY_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int TV_WAKE_ON_ONE_TOUCH_PLAY_DISABLED = 0;
    @android.annotation.SystemApi
    public static final int TV_SEND_STANDBY_ON_SLEEP_ENABLED = 1;
    @android.annotation.SystemApi
    public static final int TV_SEND_STANDBY_ON_SLEEP_DISABLED = 0;
    public static final int RC_PROFILE_TV_NONE = 0;
    public static final int RC_PROFILE_TV_ONE = 2;
    public static final int RC_PROFILE_TV_TWO = 6;
    public static final int RC_PROFILE_TV_THREE = 10;
    public static final int RC_PROFILE_TV_FOUR = 14;
    public static final int RC_PROFILE_SOURCE_ROOT_MENU_HANDLED = 1;
    public static final int RC_PROFILE_SOURCE_ROOT_MENU_NOT_HANDLED = 0;
    public static final int RC_PROFILE_SOURCE_SETUP_MENU_HANDLED = 1;
    public static final int RC_PROFILE_SOURCE_SETUP_MENU_NOT_HANDLED = 0;
    public static final int RC_PROFILE_SOURCE_CONTENTS_MENU_HANDLED = 1;
    public static final int RC_PROFILE_SOURCE_CONTENTS_MENU_NOT_HANDLED = 0;
    public static final int RC_PROFILE_SOURCE_TOP_MENU_HANDLED = 1;
    public static final int RC_PROFILE_SOURCE_TOP_MENU_NOT_HANDLED = 0;
    public static final int RC_PROFILE_SOURCE_MEDIA_CONTEXT_SENSITIVE_MENU_HANDLED = 1;
    public static final int RC_PROFILE_SOURCE_MEDIA_CONTEXT_SENSITIVE_MENU_NOT_HANDLED = 0;
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_HDMI_CEC_ENABLED = "hdmi_cec_enabled";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_HDMI_CEC_VERSION = "hdmi_cec_version";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_POWER_CONTROL_MODE = "power_control_mode";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_POWER_STATE_CHANGE_ON_ACTIVE_SOURCE_LOST = "power_state_change_on_active_source_lost";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_SYSTEM_AUDIO_MODE_MUTING = "system_audio_mode_muting";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_VOLUME_CONTROL_MODE = "volume_control_enabled";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_TV_WAKE_ON_ONE_TOUCH_PLAY = "tv_wake_on_one_touch_play";
    @android.annotation.SystemApi
    public static final java.lang.String CEC_SETTING_NAME_TV_SEND_STANDBY_ON_SLEEP = "tv_send_standby_on_sleep";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_TV = "rc_profile_tv";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_SOURCE_HANDLES_ROOT_MENU = "rc_profile_source_handles_root_menu";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_SOURCE_HANDLES_SETUP_MENU = "rc_profile_source_handles_setup_menu";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_SOURCE_HANDLES_CONTENTS_MENU = "rc_profile_source_handles_contents_menu";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_SOURCE_HANDLES_TOP_MENU = "rc_profile_source_handles_top_menu";
    public static final java.lang.String CEC_SETTING_NAME_RC_PROFILE_SOURCE_HANDLES_MEDIA_CONTEXT_SENSITIVE_MENU = "rc_profile_source_handles_media_context_sensitive_menu";
    private final boolean mHasPlaybackDevice = false;
    private final boolean mHasTvDevice = false;
    private final boolean mHasAudioSystemDevice = false;
    private final boolean mHasSwitchDevice = false;
    private final boolean mIsSwitchDevice = false;
    private final android.util.ArrayMap<android.hardware.hdmi.HdmiControlManager.HotplugEventListener, android.hardware.hdmi.IHdmiHotplugEventListener> mHotplugEventListeners = null;
    private final android.util.ArrayMap<android.hardware.hdmi.HdmiControlManager.HdmiControlStatusChangeListener, android.hardware.hdmi.IHdmiControlStatusChangeListener> mHdmiControlStatusChangeListeners = null;
    private final android.util.ArrayMap<android.hardware.hdmi.HdmiControlManager.HdmiCecVolumeControlFeatureListener, android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener> mHdmiCecVolumeControlFeatureListeners = null;
    private final android.util.ArrayMap<java.lang.String, android.util.ArrayMap<android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener, android.hardware.hdmi.IHdmiCecSettingChangeListener>> mCecSettingChangeListeners = null;
    private void setLocalPhysicalAddress(int p0) {}
    private int getLocalPhysicalAddress() { return 0; }
    public HdmiControlManager(android.hardware.hdmi.IHdmiControlService p0) {}
    private static boolean hasDeviceType(int[] p0, int p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public android.hardware.hdmi.HdmiClient getClient(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public android.hardware.hdmi.HdmiPlaybackClient getPlaybackClient() { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public android.hardware.hdmi.HdmiTvClient getTvClient() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    public android.hardware.hdmi.HdmiAudioSystemClient getAudioSystemClient() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    public android.hardware.hdmi.HdmiSwitchClient getSwitchClient() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getConnectedDevices() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public java.util.List<android.hardware.hdmi.HdmiDeviceInfo> getConnectedDevicesList() { return null; }
    @android.annotation.SystemApi
    public void powerOffDevice(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void powerOffRemoteDevice(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    public void powerOnDevice(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void powerOnRemoteDevice(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    @android.annotation.SystemApi
    public void setActiveSource(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void requestRemoteDeviceToBecomeActiveSource(android.hardware.hdmi.HdmiDeviceInfo p0) {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setStandbyMode(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void toggleAndFollowTvPower() {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public boolean shouldHandleTvPowerKey() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setHdmiCecVolumeControlEnabled(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getHdmiCecVolumeControlEnabled() { return 0; }
    public boolean getSystemAudioMode() { return false; }
    @android.annotation.SystemApi
    public int getPhysicalAddress() { return 0; }
    @android.annotation.SystemApi
    public boolean isDeviceConnected(android.hardware.hdmi.HdmiDeviceInfo p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isRemoteDeviceConnected(android.hardware.hdmi.HdmiDeviceInfo p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHotplugEventListener(android.hardware.hdmi.HdmiControlManager.HotplugEventListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHotplugEventListener(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HotplugEventListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void removeHotplugEventListener(android.hardware.hdmi.HdmiControlManager.HotplugEventListener p0) {}
    private android.hardware.hdmi.IHdmiHotplugEventListener getHotplugEventListenerWrapper(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HotplugEventListener p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHdmiControlStatusChangeListener(android.hardware.hdmi.HdmiControlManager.HdmiControlStatusChangeListener p0) {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHdmiControlStatusChangeListener(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HdmiControlStatusChangeListener p1) {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void removeHdmiControlStatusChangeListener(android.hardware.hdmi.HdmiControlManager.HdmiControlStatusChangeListener p0) {}
    private android.hardware.hdmi.IHdmiControlStatusChangeListener getHdmiControlStatusChangeListenerWrapper(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HdmiControlStatusChangeListener p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHdmiCecVolumeControlFeatureListener(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HdmiCecVolumeControlFeatureListener p1) {}
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void removeHdmiCecVolumeControlFeatureListener(android.hardware.hdmi.HdmiControlManager.HdmiCecVolumeControlFeatureListener p0) {}
    private android.hardware.hdmi.IHdmiCecVolumeControlFeatureListener createHdmiCecVolumeControlFeatureListenerWrapper(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.HdmiCecVolumeControlFeatureListener p1) { return null; }
    private void addCecSettingChangeListener(java.lang.String p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p2) {}
    private void removeCecSettingChangeListener(java.lang.String p0, android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p1) {}
    private android.hardware.hdmi.IHdmiCecSettingChangeListener getCecSettingChangeListenerWrapper(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p1) { return null; }
    @android.annotation.SystemApi
    @android.hardware.hdmi.HdmiControlManager.CecSettingName
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public java.util.List<java.lang.String> getUserCecSettings() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public java.util.List<java.lang.String> getAllowedCecSettingStringValues(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public java.util.List<java.lang.Integer> getAllowedCecSettingIntValues(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setHdmiCecEnabled(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getHdmiCecEnabled() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHdmiCecEnabledChangeListener(android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void addHdmiCecEnabledChangeListener(java.util.concurrent.Executor p0, android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void removeHdmiCecEnabledChangeListener(android.hardware.hdmi.HdmiControlManager.CecSettingChangeListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setHdmiCecVersion(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getHdmiCecVersion() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setPowerControlMode(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public java.lang.String getPowerControlMode() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setPowerStateChangeOnActiveSourceLost(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public java.lang.String getPowerStateChangeOnActiveSourceLost() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setSystemAudioModeMuting(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getSystemAudioModeMuting() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setTvWakeOnOneTouchPlay(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getTvWakeOnOneTouchPlay() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public void setTvSendStandbyOnSleep(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.HDMI_CEC")
    public int getTvSendStandbyOnSleep() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActiveSourceLostBehavior {
    }

    @android.annotation.SystemApi
    public static interface CecSettingChangeListener {
        public void onChange(java.lang.String p0);
    }

    public static @interface CecSettingName {
    }

    private final class ClientHotplugEventListener implements android.hardware.hdmi.HdmiControlManager.HotplugEventListener {
        private ClientHotplugEventListener(android.hardware.hdmi.HdmiControlManager p0) {}
        public void onReceived(android.hardware.hdmi.HdmiHotplugEvent p0) {}
    }

    @android.annotation.SystemApi
    public static @interface ControlCallbackResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HdmiCecControl {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HdmiCecVersion {
    }

    public static interface HdmiCecVolumeControlFeatureListener {
        public void onHdmiCecVolumeControlFeature(int p0);
    }

    public static interface HdmiControlStatusChangeListener {
        public void onStatusChange(int p0, boolean p1);
    }

    @android.annotation.SystemApi
    public static interface HotplugEventListener {
        public void onReceived(android.hardware.hdmi.HdmiHotplugEvent p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerControlMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileSourceHandlesContentsMenu {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileSourceHandlesMediaContextSensitiveMenu {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileSourceHandlesRootMenu {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileSourceHandlesSetupMenu {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileSourceHandlesTopMenu {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RcProfileTv {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemAudioModeMuting {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TvSendStandbyOnSleep {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TvWakeOnOneTouchPlay {
    }

    @android.annotation.SystemApi
    public static interface VendorCommandListener {
        public void onReceived(int p0, int p1, byte[] p2, boolean p3);
        public void onControlStateChanged(boolean p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeControl {
    }
}
