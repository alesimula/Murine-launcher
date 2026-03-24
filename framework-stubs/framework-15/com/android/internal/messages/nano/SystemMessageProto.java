package com.android.internal.messages.nano;

public interface SystemMessageProto {

    public static final class SystemMessage extends com.android.framework.protobuf.nano.MessageNano {
        public static final int NOTE_UNKNOWN = 0;
        public static final int NOTE_GLOBAL_SCREENSHOT = 1;
        public static final int NOTE_BAD_CHARGER = 2;
        public static final int NOTE_POWER_LOW = 3;
        public static final int NOTE_HIGH_TEMP = 4;
        public static final int NOTE_HIDDEN_NOTIFICATIONS = 5;
        public static final int NOTE_PLUGIN = 6;
        public static final int NOTE_INSTANT_APPS = 7;
        public static final int NOTE_SELECT_INPUT_METHOD = 8;
        public static final int NOTE_FBE_ENCRYPTED_NOTIFICATION = 9;
        public static final int NOTE_CAR_MODE_DISABLE = 10;
        public static final int NOTE_HEAVY_WEIGHT_NOTIFICATION = 11;
        public static final int NOTE_DUMP_HEAP_NOTIFICATION = 12;
        public static final int NOTE_SYSTEM_UPGRADING = 13;
        public static final int NOTE_TETHER_GENERAL = 14;
        public static final int NOTE_TETHER_USB = 15;
        public static final int NOTE_TETHER_BLUETOOTH = 16;
        public static final int NOTE_VPN_DISCONNECTED = 17;
        public static final int NOTE_SYNC_ERROR = 18;
        public static final int NOTE_SELECT_KEYBOARD_LAYOUT = 19;
        public static final int NOTE_VPN_STATUS = 20;
        public static final int NOTE_PACKAGE_STATE = 21;
        public static final int NOTE_LOW_STORAGE = 23;
        public static final int NOTE_RETAIL_RESET = 24;
        public static final int NOTE_USB_MTP_TAP = 25;
        public static final int NOTE_ADB_ACTIVE = 26;
        public static final int NOTE_USB_MTP = 27;
        public static final int NOTE_USB_PTP = 28;
        public static final int NOTE_USB_MIDI = 29;
        public static final int NOTE_USB_ACCESSORY = 30;
        public static final int NOTE_USB_SUPPLYING = 31;
        public static final int NOTE_USB_CHARGING = 32;
        public static final int NOTE_SSL_CERT_INFO = 33;
        public static final int NOTE_NET_WARNING = 34;
        public static final int NOTE_NET_LIMIT = 35;
        public static final int NOTE_NET_LIMIT_SNOOZED = 36;
        public static final int NOTE_ACCOUNT_REQUIRE_SIGNIN = 37;
        public static final int NOTE_ACCOUNT_CREDENTIAL_PERMISSION = 38;
        public static final int NOTE_THERMAL_SHUTDOWN = 39;
        public static final int NOTE_FOREGROUND_SERVICES = 40;
        public static final int NOTE_USB_AUDIO_ACCESSORY_NOT_SUPPORTED = 41;
        public static final int NOTE_WIFI_WRONG_PASSWORD = 42;
        public static final int NOTE_WIFI_WAKE_ONBOARD = 43;
        public static final int NOTE_WIFI_WAKE_TURNED_BACK_ON = 44;
        public static final int NOTE_NET_RAPID = 45;
        public static final int NOTE_CARRIER_NETWORK_AVAILABLE = 46;
        public static final int NOTE_USB_TETHER = 47;
        public static final int NOTE_ZEN_UPGRADE = 48;
        public static final int NOTE_AUTO_SAVER_SUGGESTION = 49;
        public static final int NOTE_SOFTAP_CONFIG_CHANGED = 50;
        public static final int NOTE_NETWORK_SUGGESTION_AVAILABLE = 51;
        public static final int NOTE_USB_CONTAMINANT_DETECTED = 52;
        public static final int NOTE_USB_CONTAMINANT_NOT_DETECTED = 53;
        public static final int NOTE_TEST_HARNESS_MODE_ENABLED = 54;
        public static final int NOTE_SERIAL_CONSOLE_ENABLED = 55;
        public static final int NOTE_NETWORK_NO_MAC_RANDOMIZATION_SUPPORT = 56;
        public static final int NOTE_WIFI_EAP_FAILURE = 57;
        public static final int NOTE_SOFTAP_AUTO_DISABLED = 58;
        public static final int NOTE_LOCATION_CHANGED = 59;
        public static final int NOTE_ID_WIFI_SIM_REQUIRED = 60;
        public static final int NOTE_FOREGROUND_SERVICE_BG_LAUNCH = 61;
        public static final int NOTE_ADB_WIFI_ACTIVE = 62;
        public static final int NOTE_CARRIER_SUGGESTION_AVAILABLE = 63;
        public static final int NOTE_NAS_UPGRADE = 64;
        public static final int NOTE_UNBLOCK_MIC_TOGGLE = 65;
        public static final int NOTE_UNBLOCK_CAM_TOGGLE = 66;
        public static final int NOTE_SERVER_CA_CERTIFICATE = 67;
        public static final int NOTE_SETUP_DREAM = 68;
        public static final int NOTE_MTE_OVERRIDE_ENABLED = 69;
        public static final int NOTE_GUEST_SESSION = 70;
        public static final int NOTE_REVIEW_NOTIFICATION_PERMISSIONS = 71;
        public static final int NOTE_SETUP_DOCK = 72;
        public static final int NOTE_WIFI_APM_NOTIFICATION = 73;
        public static final int NOTE_BT_APM_NOTIFICATION = 74;
        public static final int NOTE_USB_UVC = 75;
        public static final int NOTE_NETWORK_SIGN_IN = 740;
        public static final int NOTE_NETWORK_NO_INTERNET = 741;
        public static final int NOTE_NETWORK_LOST_INTERNET = 742;
        public static final int NOTE_NETWORK_SWITCH = 743;
        public static final int NOTE_NETWORK_LOGGED_IN = 744;
        public static final int NOTE_NETWORK_PARTIAL_CONNECTIVITY = 745;
        public static final int NOTE_NETWORK_PRIVATE_DNS_BROKEN = 746;
        public static final int NOTE_PROFILE_WIPED = 1001;
        public static final int NOTE_NETWORK_LOGGING = 1002;
        public static final int NOTE_REMOVE_GUEST = 1010;
        public static final int NOTE_LOGOUT_USER = 1011;
        public static final int NOTE_TV_PIP = 1100;
        public static final int NOTE_BATTERY_SAVER_WARNING = 1200;
        public static final int NOTE_NETWORK_AVAILABLE = 17303299;
        public static final int NOTE_REMOTE_BUGREPORT = 678432343;
        public static final int NOTE_STORAGE_PUBLIC = 1397773634;
        public static final int NOTE_STORAGE_PRIVATE = 1397772886;
        public static final int NOTE_STORAGE_DISK = 1396986699;
        public static final int NOTE_STORAGE_MOVE = 1397575510;
        public static final int NOTE_PERSONAL_APPS_SUSPENDED = 1003;
        public static final int NOTE_A11Y_WINDOW_MAGNIFICATION_FEATURE = 1004;
        public static final int NOTE_A11Y_VIEW_AND_CONTROL_ACCESS = 1005;
        public static final int NOTE_ABUSIVE_BG_APPS_BASE = 203105544;
        public static final int NOTE_ALL_MANAGED_SUBSCRIPTIONS_AND_MANAGED_PROFILE_OFF = 1006;
        public static final int NOTE_CSD_LOWER_AUDIO = 1007;
        public static final int NOTE_GLOBAL_SCREENSHOT_EXTERNAL_DISPLAY = 1008;
        public static final int NOTE_A11Y_FLOATING_MENU_HIDDEN = 1009;
        public static com.android.internal.messages.nano.SystemMessageProto.SystemMessage[] emptyArray() { return null; }
        public SystemMessage() { super(); }
        public com.android.internal.messages.nano.SystemMessageProto.SystemMessage clear() { return null; }
        public com.android.internal.messages.nano.SystemMessageProto.SystemMessage mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.messages.nano.SystemMessageProto.SystemMessage parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.messages.nano.SystemMessageProto.SystemMessage parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
