package android.content.pm;

public abstract class PackageManager {
    private static final java.lang.String TAG = "PackageManager";
    public static final boolean APPLY_DEFAULT_TO_DEVICE_PROTECTED_STORAGE = true;
    public static final int GET_ACTIVITIES = 1;
    public static final int GET_RECEIVERS = 2;
    public static final int GET_SERVICES = 4;
    public static final int GET_PROVIDERS = 8;
    public static final int GET_INSTRUMENTATION = 16;
    public static final int GET_INTENT_FILTERS = 32;
    @java.lang.Deprecated
    public static final int GET_SIGNATURES = 64;
    public static final int GET_RESOLVED_FILTER = 64;
    public static final int GET_META_DATA = 128;
    public static final int GET_GIDS = 256;
    @java.lang.Deprecated
    public static final int GET_DISABLED_COMPONENTS = 512;
    public static final int MATCH_DISABLED_COMPONENTS = 512;
    public static final int GET_SHARED_LIBRARY_FILES = 1024;
    public static final int GET_URI_PERMISSION_PATTERNS = 2048;
    public static final int GET_PERMISSIONS = 4096;
    @java.lang.Deprecated
    public static final int GET_UNINSTALLED_PACKAGES = 8192;
    public static final int MATCH_UNINSTALLED_PACKAGES = 8192;
    public static final int GET_CONFIGURATIONS = 16384;
    @java.lang.Deprecated
    public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 32768;
    public static final int MATCH_DISABLED_UNTIL_USED_COMPONENTS = 32768;
    public static final int MATCH_DEFAULT_ONLY = 65536;
    public static final int MATCH_ALL = 131072;
    public static final int MATCH_DIRECT_BOOT_UNAWARE = 262144;
    public static final int MATCH_DIRECT_BOOT_AWARE = 524288;
    public static final int MATCH_SYSTEM_ONLY = 1048576;
    @android.annotation.SystemApi
    public static final int MATCH_FACTORY_ONLY = 2097152;
    @android.annotation.SystemApi
    public static final int MATCH_ANY_USER = 4194304;
    public static final int MATCH_KNOWN_PACKAGES = 4202496;
    @android.annotation.SystemApi
    public static final int MATCH_INSTANT = 8388608;
    public static final int MATCH_VISIBLE_TO_INSTANT_APP_ONLY = 16777216;
    public static final int MATCH_EXPLICITLY_VISIBLE_ONLY = 33554432;
    public static final int MATCH_STATIC_SHARED_LIBRARIES = 67108864;
    public static final int GET_SIGNING_CERTIFICATES = 134217728;
    public static final int MATCH_DIRECT_BOOT_AUTO = 268435456;
    @java.lang.Deprecated
    public static final int MATCH_DEBUG_TRIAGED_MISSING = 268435456;
    public static final int MATCH_HIDDEN_UNTIL_INSTALLED_COMPONENTS = 536870912;
    public static final int MATCH_APEX = 1073741824;
    public static final int SKIP_CURRENT_PROFILE = 2;
    public static final int ONLY_IF_NO_MATCH_FOUND = 4;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_DENIED = -1;
    public static final int SIGNATURE_MATCH = 0;
    public static final int SIGNATURE_NEITHER_SIGNED = 1;
    public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
    public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
    public static final int SIGNATURE_NO_MATCH = -3;
    public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
    public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
    public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
    public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
    public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
    public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int INSTALL_REPLACE_EXISTING = 2;
    public static final int INSTALL_ALLOW_TEST = 4;
    public static final int INSTALL_INTERNAL = 16;
    public static final int INSTALL_FROM_ADB = 32;
    public static final int INSTALL_ALL_USERS = 64;
    public static final int INSTALL_REQUEST_DOWNGRADE = 128;
    public static final int INSTALL_GRANT_RUNTIME_PERMISSIONS = 256;
    public static final int INSTALL_ALL_WHITELIST_RESTRICTED_PERMISSIONS = 4194304;
    public static final int INSTALL_FORCE_VOLUME_UUID = 512;
    public static final int INSTALL_FORCE_PERMISSION_PROMPT = 1024;
    public static final int INSTALL_INSTANT_APP = 2048;
    public static final int INSTALL_DONT_KILL_APP = 4096;
    public static final int INSTALL_FULL_APP = 16384;
    public static final int INSTALL_ALLOCATE_AGGRESSIVE = 32768;
    public static final int INSTALL_VIRTUAL_PRELOAD = 65536;
    public static final int INSTALL_APEX = 131072;
    public static final int INSTALL_ENABLE_ROLLBACK = 262144;
    public static final int INSTALL_DISABLE_VERIFICATION = 524288;
    public static final int INSTALL_ALLOW_DOWNGRADE = 1048576;
    public static final int INSTALL_STAGED = 2097152;
    public static final int INSTALL_DRY_RUN = 8388608;
    public static final int DONT_KILL_APP = 1;
    public static final int INSTALL_REASON_UNKNOWN = 0;
    public static final int INSTALL_REASON_POLICY = 1;
    public static final int INSTALL_REASON_DEVICE_RESTORE = 2;
    public static final int INSTALL_REASON_DEVICE_SETUP = 3;
    public static final int INSTALL_REASON_USER = 4;
    public static final int INSTALL_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int INSTALL_SUCCEEDED = 1;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_INVALID_APK = -2;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_INVALID_URI = -3;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_NO_SHARED_USER = -6;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_DEXOPT = -11;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_OLDER_SDK = -12;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_NEWER_SDK = -14;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_TEST_ONLY = -15;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_MISSING_FEATURE = -17;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;
    public static final int INSTALL_FAILED_UID_CHANGED = -24;
    public static final int INSTALL_FAILED_VERSION_DOWNGRADE = -25;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_PERMISSION_MODEL_DOWNGRADE = -26;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_SANDBOX_VERSION_DOWNGRADE = -27;
    public static final int INSTALL_FAILED_MISSING_SPLIT = -28;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;
    @android.annotation.SystemApi
    public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;
    @android.annotation.SystemApi
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;
    public static final int INSTALL_FAILED_USER_RESTRICTED = -111;
    public static final int INSTALL_FAILED_DUPLICATE_PERMISSION = -112;
    public static final int INSTALL_FAILED_NO_MATCHING_ABIS = -113;
    @android.annotation.UnsupportedAppUsage
    public static final int NO_NATIVE_LIBRARIES = -114;
    public static final int INSTALL_FAILED_ABORTED = -115;
    public static final int INSTALL_FAILED_INSTANT_APP_INVALID = -116;
    public static final int INSTALL_FAILED_BAD_DEX_METADATA = -117;
    public static final int INSTALL_FAILED_BAD_SIGNATURE = -118;
    public static final int INSTALL_FAILED_OTHER_STAGED_SESSION_IN_PROGRESS = -119;
    public static final int INSTALL_FAILED_MULTIPACKAGE_INCONSISTENCY = -120;
    public static final int INSTALL_FAILED_WRONG_INSTALLED_VERSION = -121;
    public static final int DELETE_KEEP_DATA = 1;
    public static final int DELETE_ALL_USERS = 2;
    public static final int DELETE_SYSTEM_APP = 4;
    public static final int DELETE_DONT_KILL_APP = 8;
    public static final int DELETE_CONTRIBUTED_MEDIA = 16;
    public static final int DELETE_CHATTY = -2147483648;
    public static final int DELETE_SUCCEEDED = 1;
    public static final int DELETE_FAILED_INTERNAL_ERROR = -1;
    public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -2;
    public static final int DELETE_FAILED_USER_RESTRICTED = -3;
    public static final int DELETE_FAILED_OWNER_BLOCKED = -4;
    public static final int DELETE_FAILED_ABORTED = -5;
    public static final int DELETE_FAILED_USED_SHARED_LIBRARY = -6;
    public static final int MOVE_SUCCEEDED = -100;
    public static final int MOVE_FAILED_INSUFFICIENT_STORAGE = -1;
    public static final int MOVE_FAILED_DOESNT_EXIST = -2;
    public static final int MOVE_FAILED_SYSTEM_PACKAGE = -3;
    public static final int MOVE_FAILED_INVALID_LOCATION = -5;
    public static final int MOVE_FAILED_INTERNAL_ERROR = -6;
    public static final int MOVE_FAILED_OPERATION_PENDING = -7;
    public static final int MOVE_FAILED_DEVICE_ADMIN = -8;
    public static final int MOVE_FAILED_3RD_PARTY_NOT_ALLOWED_ON_INTERNAL = -9;
    public static final int MOVE_FAILED_LOCKED_USER = -10;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int MOVE_INTERNAL = 1;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static final int MOVE_EXTERNAL_MEDIA = 2;
    public static final java.lang.String EXTRA_MOVE_ID = "android.content.pm.extra.MOVE_ID";
    public static final int VERIFICATION_ALLOW_WITHOUT_SUFFICIENT = 2;
    public static final int VERIFICATION_ALLOW = 1;
    public static final int VERIFICATION_REJECT = -1;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_VERIFICATION_SUCCESS = 1;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_VERIFICATION_FAILURE = -1;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_UNDEFINED = 0;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ASK = 1;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS = 2;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_NEVER = 3;
    @android.annotation.SystemApi
    public static final int INTENT_FILTER_DOMAIN_VERIFICATION_STATUS_ALWAYS_ASK = 4;
    public static final long MAXIMUM_VERIFICATION_TIMEOUT = 3600000L;
    public static final java.lang.String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";
    public static final java.lang.String FEATURE_AUDIO_OUTPUT = "android.hardware.audio.output";
    public static final java.lang.String FEATURE_AUDIO_PRO = "android.hardware.audio.pro";
    public static final java.lang.String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
    public static final java.lang.String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
    public static final java.lang.String FEATURE_CAMERA = "android.hardware.camera";
    public static final java.lang.String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";
    public static final java.lang.String FEATURE_CAMERA_ANY = "android.hardware.camera.any";
    public static final java.lang.String FEATURE_CAMERA_EXTERNAL = "android.hardware.camera.external";
    public static final java.lang.String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";
    public static final java.lang.String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";
    public static final java.lang.String FEATURE_CAMERA_LEVEL_FULL = "android.hardware.camera.level.full";
    public static final java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR = "android.hardware.camera.capability.manual_sensor";
    public static final java.lang.String FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING = "android.hardware.camera.capability.manual_post_processing";
    public static final java.lang.String FEATURE_CAMERA_CAPABILITY_RAW = "android.hardware.camera.capability.raw";
    public static final java.lang.String FEATURE_CAMERA_AR = "android.hardware.camera.ar";
    public static final java.lang.String FEATURE_CONSUMER_IR = "android.hardware.consumerir";
    public static final java.lang.String FEATURE_CTS = "android.software.cts";
    public static final java.lang.String FEATURE_LOCATION = "android.hardware.location";
    public static final java.lang.String FEATURE_LOCATION_GPS = "android.hardware.location.gps";
    public static final java.lang.String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";
    public static final java.lang.String FEATURE_RAM_LOW = "android.hardware.ram.low";
    public static final java.lang.String FEATURE_RAM_NORMAL = "android.hardware.ram.normal";
    public static final java.lang.String FEATURE_MICROPHONE = "android.hardware.microphone";
    public static final java.lang.String FEATURE_NFC = "android.hardware.nfc";
    @java.lang.Deprecated
    public static final java.lang.String FEATURE_NFC_HCE = "android.hardware.nfc.hce";
    public static final java.lang.String FEATURE_NFC_HOST_CARD_EMULATION = "android.hardware.nfc.hce";
    public static final java.lang.String FEATURE_NFC_HOST_CARD_EMULATION_NFCF = "android.hardware.nfc.hcef";
    public static final java.lang.String FEATURE_NFC_OFF_HOST_CARD_EMULATION_UICC = "android.hardware.nfc.uicc";
    public static final java.lang.String FEATURE_NFC_OFF_HOST_CARD_EMULATION_ESE = "android.hardware.nfc.ese";
    public static final java.lang.String FEATURE_NFC_BEAM = "android.sofware.nfc.beam";
    public static final java.lang.String FEATURE_NFC_ANY = "android.hardware.nfc.any";
    public static final java.lang.String FEATURE_OPENGLES_EXTENSION_PACK = "android.hardware.opengles.aep";
    public static final java.lang.String FEATURE_VULKAN_HARDWARE_LEVEL = "android.hardware.vulkan.level";
    public static final java.lang.String FEATURE_VULKAN_HARDWARE_COMPUTE = "android.hardware.vulkan.compute";
    public static final java.lang.String FEATURE_VULKAN_HARDWARE_VERSION = "android.hardware.vulkan.version";
    @android.annotation.SystemApi
    public static final java.lang.String FEATURE_BROADCAST_RADIO = "android.hardware.broadcastradio";
    public static final java.lang.String FEATURE_SECURE_LOCK_SCREEN = "android.software.secure_lock_screen";
    public static final java.lang.String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";
    public static final java.lang.String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";
    public static final java.lang.String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";
    public static final java.lang.String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";
    public static final java.lang.String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";
    public static final java.lang.String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";
    public static final java.lang.String FEATURE_SENSOR_STEP_COUNTER = "android.hardware.sensor.stepcounter";
    public static final java.lang.String FEATURE_SENSOR_STEP_DETECTOR = "android.hardware.sensor.stepdetector";
    public static final java.lang.String FEATURE_SENSOR_HEART_RATE = "android.hardware.sensor.heartrate";
    public static final java.lang.String FEATURE_SENSOR_HEART_RATE_ECG = "android.hardware.sensor.heartrate.ecg";
    public static final java.lang.String FEATURE_SENSOR_RELATIVE_HUMIDITY = "android.hardware.sensor.relative_humidity";
    public static final java.lang.String FEATURE_SENSOR_AMBIENT_TEMPERATURE = "android.hardware.sensor.ambient_temperature";
    public static final java.lang.String FEATURE_HIFI_SENSORS = "android.hardware.sensor.hifi_sensors";
    public static final java.lang.String FEATURE_ASSIST_GESTURE = "android.hardware.sensor.assist";
    public static final java.lang.String FEATURE_TELEPHONY = "android.hardware.telephony";
    public static final java.lang.String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";
    public static final java.lang.String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";
    @android.annotation.SystemApi
    public static final java.lang.String FEATURE_TELEPHONY_CARRIERLOCK = "android.hardware.telephony.carrierlock";
    public static final java.lang.String FEATURE_TELEPHONY_EUICC = "android.hardware.telephony.euicc";
    public static final java.lang.String FEATURE_TELEPHONY_MBMS = "android.hardware.telephony.mbms";
    public static final java.lang.String FEATURE_TELEPHONY_IMS = "android.hardware.telephony.ims";
    public static final java.lang.String FEATURE_USB_HOST = "android.hardware.usb.host";
    public static final java.lang.String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";
    public static final java.lang.String FEATURE_SIP = "android.software.sip";
    public static final java.lang.String FEATURE_SIP_VOIP = "android.software.sip.voip";
    public static final java.lang.String FEATURE_CONNECTION_SERVICE = "android.software.connectionservice";
    public static final java.lang.String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";
    public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";
    public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";
    public static final java.lang.String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";
    public static final java.lang.String FEATURE_FAKETOUCH = "android.hardware.faketouch";
    public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";
    public static final java.lang.String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";
    public static final java.lang.String FEATURE_FINGERPRINT = "android.hardware.fingerprint";
    public static final java.lang.String FEATURE_FACE = "android.hardware.biometrics.face";
    public static final java.lang.String FEATURE_IRIS = "android.hardware.biometrics.iris";
    public static final java.lang.String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";
    public static final java.lang.String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";
    public static final java.lang.String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";
    public static final java.lang.String FEATURE_APP_WIDGETS = "android.software.app_widgets";
    public static final java.lang.String FEATURE_CANT_SAVE_STATE = "android.software.cant_save_state";
    public static final java.lang.String FEATURE_VOICE_RECOGNIZERS = "android.software.voice_recognizers";
    public static final java.lang.String FEATURE_HOME_SCREEN = "android.software.home_screen";
    public static final java.lang.String FEATURE_INPUT_METHODS = "android.software.input_methods";
    public static final java.lang.String FEATURE_DEVICE_ADMIN = "android.software.device_admin";
    public static final java.lang.String FEATURE_LEANBACK = "android.software.leanback";
    public static final java.lang.String FEATURE_LEANBACK_ONLY = "android.software.leanback_only";
    public static final java.lang.String FEATURE_LIVE_TV = "android.software.live_tv";
    public static final java.lang.String FEATURE_WIFI = "android.hardware.wifi";
    public static final java.lang.String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";
    public static final java.lang.String FEATURE_WIFI_AWARE = "android.hardware.wifi.aware";
    public static final java.lang.String FEATURE_WIFI_PASSPOINT = "android.hardware.wifi.passpoint";
    public static final java.lang.String FEATURE_WIFI_RTT = "android.hardware.wifi.rtt";
    public static final java.lang.String FEATURE_LOWPAN = "android.hardware.lowpan";
    public static final java.lang.String FEATURE_AUTOMOTIVE = "android.hardware.type.automotive";
    @java.lang.Deprecated
    public static final java.lang.String FEATURE_TELEVISION = "android.hardware.type.television";
    public static final java.lang.String FEATURE_WATCH = "android.hardware.type.watch";
    public static final java.lang.String FEATURE_EMBEDDED = "android.hardware.type.embedded";
    public static final java.lang.String FEATURE_PC = "android.hardware.type.pc";
    public static final java.lang.String FEATURE_PRINTING = "android.software.print";
    public static final java.lang.String FEATURE_COMPANION_DEVICE_SETUP = "android.software.companion_device_setup";
    public static final java.lang.String FEATURE_BACKUP = "android.software.backup";
    public static final java.lang.String FEATURE_FREEFORM_WINDOW_MANAGEMENT = "android.software.freeform_window_management";
    public static final java.lang.String FEATURE_PICTURE_IN_PICTURE = "android.software.picture_in_picture";
    public static final java.lang.String FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS = "android.software.activities_on_secondary_displays";
    public static final java.lang.String FEATURE_MANAGED_USERS = "android.software.managed_users";
    public static final java.lang.String FEATURE_MANAGED_PROFILES = "android.software.managed_users";
    public static final java.lang.String FEATURE_VERIFIED_BOOT = "android.software.verified_boot";
    public static final java.lang.String FEATURE_SECURELY_REMOVES_USERS = "android.software.securely_removes_users";
    public static final java.lang.String FEATURE_FILE_BASED_ENCRYPTION = "android.software.file_based_encryption";
    public static final java.lang.String FEATURE_ADOPTABLE_STORAGE = "android.software.adoptable_storage";
    public static final java.lang.String FEATURE_WEBVIEW = "android.software.webview";
    public static final java.lang.String FEATURE_ETHERNET = "android.hardware.ethernet";
    public static final java.lang.String FEATURE_HDMI_CEC = "android.hardware.hdmi.cec";
    public static final java.lang.String FEATURE_GAMEPAD = "android.hardware.gamepad";
    public static final java.lang.String FEATURE_MIDI = "android.software.midi";
    @java.lang.Deprecated
    public static final java.lang.String FEATURE_VR_MODE = "android.software.vr.mode";
    public static final java.lang.String FEATURE_VR_MODE_HIGH_PERFORMANCE = "android.hardware.vr.high_performance";
    public static final java.lang.String FEATURE_AUTOFILL = "android.software.autofill";
    public static final java.lang.String FEATURE_VR_HEADTRACKING = "android.hardware.vr.headtracking";
    public static final java.lang.String FEATURE_STRONGBOX_KEYSTORE = "android.hardware.strongbox_keystore";
    public static final java.lang.String FEATURE_DEVICE_ID_ATTESTATION = "android.software.device_id_attestation";
    public static final java.lang.String FEATURE_IPSEC_TUNNELS = "android.software.ipsec_tunnels";
    public static final java.lang.String EXTRA_VERIFICATION_URI = "android.content.pm.extra.VERIFICATION_URI";
    public static final java.lang.String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";
    public static final java.lang.String EXTRA_VERIFICATION_INSTALLER_PACKAGE = "android.content.pm.extra.VERIFICATION_INSTALLER_PACKAGE";
    public static final java.lang.String EXTRA_VERIFICATION_INSTALL_FLAGS = "android.content.pm.extra.VERIFICATION_INSTALL_FLAGS";
    public static final java.lang.String EXTRA_VERIFICATION_INSTALLER_UID = "android.content.pm.extra.VERIFICATION_INSTALLER_UID";
    public static final java.lang.String EXTRA_VERIFICATION_PACKAGE_NAME = "android.content.pm.extra.VERIFICATION_PACKAGE_NAME";
    public static final java.lang.String EXTRA_VERIFICATION_RESULT = "android.content.pm.extra.VERIFICATION_RESULT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_VERIFICATION_VERSION_CODE = "android.content.pm.extra.VERIFICATION_VERSION_CODE";
    public static final java.lang.String EXTRA_VERIFICATION_LONG_VERSION_CODE = "android.content.pm.extra.VERIFICATION_LONG_VERSION_CODE";
    public static final java.lang.String EXTRA_INTENT_FILTER_VERIFICATION_ID = "android.content.pm.extra.INTENT_FILTER_VERIFICATION_ID";
    public static final java.lang.String EXTRA_INTENT_FILTER_VERIFICATION_URI_SCHEME = "android.content.pm.extra.INTENT_FILTER_VERIFICATION_URI_SCHEME";
    public static final java.lang.String EXTRA_INTENT_FILTER_VERIFICATION_HOSTS = "android.content.pm.extra.INTENT_FILTER_VERIFICATION_HOSTS";
    public static final java.lang.String EXTRA_INTENT_FILTER_VERIFICATION_PACKAGE_NAME = "android.content.pm.extra.INTENT_FILTER_VERIFICATION_PACKAGE_NAME";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_PERMISSIONS = "android.content.pm.action.REQUEST_PERMISSIONS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_REQUEST_PERMISSIONS_NAMES = "android.content.pm.extra.REQUEST_PERMISSIONS_NAMES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_REQUEST_PERMISSIONS_RESULTS = "android.content.pm.extra.REQUEST_PERMISSIONS_RESULTS";
    public static final java.lang.String EXTRA_FAILURE_EXISTING_PACKAGE = "android.content.pm.extra.FAILURE_EXISTING_PACKAGE";
    public static final java.lang.String EXTRA_FAILURE_EXISTING_PERMISSION = "android.content.pm.extra.FAILURE_EXISTING_PERMISSION";
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_USER_SET = 1;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_USER_FIXED = 2;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_POLICY_FIXED = 4;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_REVOKE_ON_UPGRADE = 8;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_SYSTEM_FIXED = 16;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_GRANTED_BY_DEFAULT = 32;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_REVIEW_REQUIRED = 64;
    public static final int FLAG_PERMISSION_REVOKE_WHEN_REQUESTED = 128;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_USER_SENSITIVE_WHEN_GRANTED = 256;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_USER_SENSITIVE_WHEN_DENIED = 512;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_RESTRICTION_INSTALLER_EXEMPT = 2048;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_RESTRICTION_SYSTEM_EXEMPT = 4096;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_RESTRICTION_UPGRADE_EXEMPT = 8192;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_APPLY_RESTRICTION = 16384;
    @android.annotation.SystemApi
    public static final int FLAG_PERMISSION_GRANTED_BY_ROLE = 32768;
    public static final int FLAGS_PERMISSION_RESTRICTION_ANY_EXEMPT = 14336;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int MASK_PERMISSION_FLAGS = 255;
    public static final int MASK_PERMISSION_FLAGS_ALL = 64511;
    public static final java.lang.String APP_DETAILS_ACTIVITY_CLASS_NAME = null;
    public static final int FLAG_PERMISSION_WHITELIST_SYSTEM = 1;
    public static final int FLAG_PERMISSION_WHITELIST_INSTALLER = 2;
    public static final int FLAG_PERMISSION_WHITELIST_UPGRADE = 4;
    public static final java.lang.String SYSTEM_SHARED_LIBRARY_SERVICES = "android.ext.services";
    public static final java.lang.String SYSTEM_SHARED_LIBRARY_SHARED = "android.ext.shared";
    public static final int NOTIFY_PACKAGE_USE_ACTIVITY = 0;
    public static final int NOTIFY_PACKAGE_USE_SERVICE = 1;
    public static final int NOTIFY_PACKAGE_USE_FOREGROUND_SERVICE = 2;
    public static final int NOTIFY_PACKAGE_USE_BROADCAST_RECEIVER = 3;
    public static final int NOTIFY_PACKAGE_USE_CONTENT_PROVIDER = 4;
    public static final int NOTIFY_PACKAGE_USE_BACKUP = 5;
    public static final int NOTIFY_PACKAGE_USE_CROSS_PACKAGE = 6;
    public static final int NOTIFY_PACKAGE_USE_INSTRUMENTATION = 7;
    public static final int NOTIFY_PACKAGE_USE_REASONS_COUNT = 8;
    public static final int VERSION_CODE_HIGHEST = -1;
    @android.annotation.SystemApi
    public static final int RESTRICTION_NONE = 0;
    @android.annotation.SystemApi
    public static final int RESTRICTION_HIDE_FROM_SUGGESTIONS = 1;
    @android.annotation.SystemApi
    public static final int RESTRICTION_HIDE_NOTIFICATIONS = 2;
    public static final int CERT_INPUT_RAW_X509 = 0;
    public static final int CERT_INPUT_SHA256 = 1;
    public PackageManager() {}
    public int getUserId() { return 0; }
    public abstract android.content.pm.PackageInfo getPackageInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.pm.PackageInfo getPackageInfo(android.content.pm.VersionedPackage p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.PackageInfo getPackageInfoAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] p0);
    public abstract java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] p0);
    public abstract android.content.Intent getLaunchIntentForPackage(java.lang.String p0);
    public abstract android.content.Intent getLeanbackLaunchIntentForPackage(java.lang.String p0);
    public abstract android.content.Intent getCarLaunchIntentForPackage(java.lang.String p0);
    public abstract int[] getPackageGids(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract int[] getPackageGids(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract int getPackageUid(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.UnsupportedAppUsage
    public abstract int getPackageUidAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.UnsupportedAppUsage
    public abstract int getPackageUidAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi
    public abstract boolean arePermissionsIndividuallyControlled();
    public abstract boolean isWirelessConsentModeEnabled();
    public abstract android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int p0);
    public abstract android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, int p1, int p2) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi
    public android.content.pm.ApplicationInfo getApplicationInfoAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public abstract android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.pm.ProviderInfo getProviderInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public android.content.pm.ModuleInfo getModuleInfo(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public java.util.List<android.content.pm.ModuleInfo> getInstalledModules(int p0) { return null; }
    public abstract java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int p0);
    public abstract java.util.List<android.content.pm.PackageInfo> getPackagesHoldingPermissions(java.lang.String[] p0, int p1);
    @android.annotation.SystemApi
    public abstract java.util.List<android.content.pm.PackageInfo> getInstalledPackagesAsUser(int p0, int p1);
    public abstract int checkPermission(java.lang.String p0, java.lang.String p1);
    public abstract boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1);
    public abstract java.lang.String getPermissionControllerPackageName();
    public abstract boolean addPermission(android.content.pm.PermissionInfo p0);
    public abstract boolean addPermissionAsync(android.content.pm.PermissionInfo p0);
    public abstract void removePermission(java.lang.String p0);
    @android.annotation.SystemApi
    public abstract void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2);
    @android.annotation.SystemApi
    public abstract void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2);
    @android.annotation.SystemApi
    public abstract int getPermissionFlags(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2);
    @android.annotation.SystemApi
    public abstract void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.UserHandle p4);
    public java.util.Set<java.lang.String> getWhitelistedRestrictedPermissions(java.lang.String p0, int p1) { return null; }
    public boolean addWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public boolean removeWhitelistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public abstract boolean shouldShowRequestPermissionRationale(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public android.content.Intent buildRequestPermissionsIntent(java.lang.String[] p0) { return null; }
    public abstract int checkSignatures(java.lang.String p0, java.lang.String p1);
    public abstract int checkSignatures(int p0, int p1);
    public abstract java.lang.String[] getPackagesForUid(int p0);
    public abstract java.lang.String getNameForUid(int p0);
    public abstract java.lang.String[] getNamesForUids(int[] p0);
    @android.annotation.UnsupportedAppUsage
    public abstract int getUidForSharedUser(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int p0);
    public abstract java.util.List<android.content.pm.ApplicationInfo> getInstalledApplicationsAsUser(int p0, int p1);
    @android.annotation.SystemApi
    public abstract java.util.List<android.content.pm.InstantAppInfo> getInstantApps();
    @android.annotation.SystemApi
    public abstract android.graphics.drawable.Drawable getInstantAppIcon(java.lang.String p0);
    public abstract boolean isInstantApp();
    public abstract boolean isInstantApp(java.lang.String p0);
    public abstract int getInstantAppCookieMaxBytes();
    public abstract int getInstantAppCookieMaxSize();
    public abstract byte[] getInstantAppCookie();
    public abstract void clearInstantAppCookie();
    public abstract void updateInstantAppCookie(byte[] p0);
    public abstract boolean setInstantAppCookie(byte[] p0);
    public abstract java.lang.String[] getSystemSharedLibraryNames();
    public abstract java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibraries(int p0);
    public abstract java.util.List<android.content.pm.SharedLibraryInfo> getSharedLibrariesAsUser(int p0, int p1);
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.SharedLibraryInfo> getDeclaredSharedLibraries(java.lang.String p0, int p1) { return null; }
    public abstract java.lang.String getServicesSystemSharedLibraryPackageName();
    public abstract java.lang.String getSharedSystemSharedLibraryPackageName();
    public abstract android.content.pm.ChangedPackages getChangedPackages(int p0);
    public abstract android.content.pm.FeatureInfo[] getSystemAvailableFeatures();
    public abstract boolean hasSystemFeature(java.lang.String p0);
    public abstract boolean hasSystemFeature(java.lang.String p0, int p1);
    public abstract android.content.pm.ResolveInfo resolveActivity(android.content.Intent p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.ResolveInfo resolveActivityAsUser(android.content.Intent p0, int p1, int p2);
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1, int p2);
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.ResolveInfo> queryIntentActivitiesAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) { return null; }
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName p0, android.content.Intent[] p1, android.content.Intent p2, int p3);
    public abstract java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent p0, int p1);
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceiversAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public abstract java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceiversAsUser(android.content.Intent p0, int p1, int p2);
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent p0, int p1, int p2) { return null; }
    public abstract android.content.pm.ResolveInfo resolveService(android.content.Intent p0, int p1);
    public abstract android.content.pm.ResolveInfo resolveServiceAsUser(android.content.Intent p0, int p1, int p2);
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentServicesAsUser(android.content.Intent p0, int p1, int p2);
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.ResolveInfo> queryIntentServicesAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentContentProvidersAsUser(android.content.Intent p0, int p1, int p2);
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProvidersAsUser(android.content.Intent p0, int p1, android.os.UserHandle p2) { return null; }
    public abstract java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.Intent p0, int p1);
    public abstract android.content.pm.ProviderInfo resolveContentProvider(java.lang.String p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.ProviderInfo resolveContentProviderAsUser(java.lang.String p0, int p1, int p2);
    public abstract java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String p0, int p1, int p2);
    public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String p0, int p1, int p2, java.lang.String p3) { return null; }
    public abstract android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String p0, int p1);
    public abstract android.graphics.drawable.Drawable getDrawable(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2);
    public abstract android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getActivityIcon(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getActivityBanner(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getActivityBanner(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getDefaultActivityIcon();
    public abstract android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo p0);
    public abstract android.graphics.drawable.Drawable getApplicationIcon(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getApplicationBanner(android.content.pm.ApplicationInfo p0);
    public abstract android.graphics.drawable.Drawable getApplicationBanner(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getActivityLogo(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getActivityLogo(android.content.Intent p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getApplicationLogo(android.content.pm.ApplicationInfo p0);
    public abstract android.graphics.drawable.Drawable getApplicationLogo(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.graphics.drawable.Drawable getUserBadgedIcon(android.graphics.drawable.Drawable p0, android.os.UserHandle p1);
    public abstract android.graphics.drawable.Drawable getUserBadgedDrawableForDensity(android.graphics.drawable.Drawable p0, android.os.UserHandle p1, android.graphics.Rect p2, int p3);
    @android.annotation.UnsupportedAppUsage
    public abstract android.graphics.drawable.Drawable getUserBadgeForDensity(android.os.UserHandle p0, int p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.graphics.drawable.Drawable getUserBadgeForDensityNoBackground(android.os.UserHandle p0, int p1);
    public abstract java.lang.CharSequence getUserBadgedLabel(java.lang.CharSequence p0, android.os.UserHandle p1);
    public abstract java.lang.CharSequence getText(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2);
    public abstract android.content.res.XmlResourceParser getXml(java.lang.String p0, int p1, android.content.pm.ApplicationInfo p2);
    public abstract java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo p0);
    public abstract android.content.res.Resources getResourcesForActivity(android.content.ComponentName p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.res.Resources getResourcesForApplication(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.res.Resources getResourcesForApplicationAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public abstract int installExistingPackage(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public abstract int installExistingPackage(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public abstract int installExistingPackageAsUser(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract void verifyPendingInstall(int p0, int p1);
    public abstract void extendVerificationTimeout(int p0, int p1, long p2);
    @android.annotation.SystemApi
    public abstract void verifyIntentFilter(int p0, int p1, java.util.List<java.lang.String> p2);
    @android.annotation.SystemApi
    public abstract int getIntentVerificationStatusAsUser(java.lang.String p0, int p1);
    @android.annotation.SystemApi
    public abstract boolean updateIntentVerificationStatusAsUser(java.lang.String p0, int p1, int p2);
    @android.annotation.SystemApi
    public abstract java.util.List<android.content.pm.IntentFilterVerificationInfo> getIntentFilterVerifications(java.lang.String p0);
    @android.annotation.SystemApi
    public abstract java.util.List<android.content.IntentFilter> getAllIntentFilters(java.lang.String p0);
    @android.annotation.SystemApi
    public abstract java.lang.String getDefaultBrowserPackageNameAsUser(int p0);
    @android.annotation.SystemApi
    public abstract boolean setDefaultBrowserPackageNameAsUser(java.lang.String p0, int p1);
    public abstract void setInstallerPackageName(java.lang.String p0, java.lang.String p1);
    @android.annotation.SystemApi
    public abstract void setUpdateAvailable(java.lang.String p0, boolean p1);
    @android.annotation.UnsupportedAppUsage
    public abstract void deletePackage(java.lang.String p0, android.content.pm.IPackageDeleteObserver p1, int p2);
    @android.annotation.UnsupportedAppUsage
    public abstract void deletePackageAsUser(java.lang.String p0, android.content.pm.IPackageDeleteObserver p1, int p2, int p3);
    public abstract java.lang.String getInstallerPackageName(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public abstract void clearApplicationUserData(java.lang.String p0, android.content.pm.IPackageDataObserver p1);
    @android.annotation.UnsupportedAppUsage
    public abstract void deleteApplicationCacheFiles(java.lang.String p0, android.content.pm.IPackageDataObserver p1);
    @android.annotation.UnsupportedAppUsage
    public abstract void deleteApplicationCacheFilesAsUser(java.lang.String p0, int p1, android.content.pm.IPackageDataObserver p2);
    @android.annotation.UnsupportedAppUsage
    public void freeStorageAndNotify(long p0, android.content.pm.IPackageDataObserver p1) {}
    @android.annotation.UnsupportedAppUsage
    public abstract void freeStorageAndNotify(java.lang.String p0, long p1, android.content.pm.IPackageDataObserver p2);
    @android.annotation.UnsupportedAppUsage
    public void freeStorage(long p0, android.content.IntentSender p1) {}
    @android.annotation.UnsupportedAppUsage
    public abstract void freeStorage(java.lang.String p0, long p1, android.content.IntentSender p2);
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public abstract void getPackageSizeInfoAsUser(java.lang.String p0, int p1, android.content.pm.IPackageStatsObserver p2);
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void getPackageSizeInfo(java.lang.String p0, android.content.pm.IPackageStatsObserver p1) {}
    @java.lang.Deprecated
    public abstract void addPackageToPreferred(java.lang.String p0);
    @java.lang.Deprecated
    public abstract void removePackageFromPreferred(java.lang.String p0);
    @java.lang.Deprecated
    public abstract java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int p0);
    @java.lang.Deprecated
    public abstract void addPreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3);
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void addPreferredActivityAsUser(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public abstract void replacePreferredActivity(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3);
    @android.annotation.SystemApi
    public void replacePreferredActivity(android.content.IntentFilter p0, int p1, java.util.List<android.content.ComponentName> p2, android.content.ComponentName p3) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void replacePreferredActivityAsUser(android.content.IntentFilter p0, int p1, android.content.ComponentName[] p2, android.content.ComponentName p3, int p4) {}
    @java.lang.Deprecated
    public abstract void clearPackagePreferredActivities(java.lang.String p0);
    @java.lang.Deprecated
    public abstract int getPreferredActivities(java.util.List<android.content.IntentFilter> p0, java.util.List<android.content.ComponentName> p1, java.lang.String p2);
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.ComponentName getHomeActivities(java.util.List<android.content.pm.ResolveInfo> p0);
    public abstract void setComponentEnabledSetting(android.content.ComponentName p0, int p1, int p2);
    public abstract int getComponentEnabledSetting(android.content.ComponentName p0);
    @android.annotation.SystemApi
    public void setSyntheticAppDetailsActivityEnabled(java.lang.String p0, boolean p1) {}
    public boolean getSyntheticAppDetailsActivityEnabled(java.lang.String p0) { return false; }
    public abstract void setApplicationEnabledSetting(java.lang.String p0, int p1, int p2);
    public abstract int getApplicationEnabledSetting(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public abstract void flushPackageRestrictionsAsUser(int p0);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean setApplicationHiddenSettingAsUser(java.lang.String p0, boolean p1, android.os.UserHandle p2);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean getApplicationHiddenSettingAsUser(java.lang.String p0, android.os.UserHandle p1);
    public abstract boolean isSafeMode();
    @android.annotation.SystemApi
    public abstract void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0);
    @android.annotation.SystemApi
    public abstract void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0);
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.KeySet getKeySetByAlias(java.lang.String p0, java.lang.String p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.content.pm.KeySet getSigningKeySet(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isSignedBy(java.lang.String p0, android.content.pm.KeySet p1);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isSignedByExactly(java.lang.String p0, android.content.pm.KeySet p1);
    @android.annotation.SystemApi
    public java.lang.String[] setDistractingPackageRestrictions(java.lang.String[] p0, int p1) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String[] setPackagesSuspended(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, java.lang.String p4) { return null; }
    @android.annotation.SystemApi
    public java.lang.String[] setPackagesSuspended(java.lang.String[] p0, boolean p1, android.os.PersistableBundle p2, android.os.PersistableBundle p3, android.content.pm.SuspendDialogInfo p4) { return null; }
    @android.annotation.SystemApi
    public java.lang.String[] getUnsuspendablePackages(java.lang.String[] p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isPackageSuspendedForUser(java.lang.String p0, int p1);
    public boolean isPackageSuspended(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException { return false; }
    public boolean isPackageSuspended() { return false; }
    public android.os.Bundle getSuspendedPackageAppExtras() { return null; }
    public abstract void setApplicationCategoryHint(java.lang.String p0, int p1);
    public static boolean isMoveStatusFinished(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public abstract int getMoveStatus(int p0);
    @android.annotation.UnsupportedAppUsage
    public abstract void registerMoveCallback(android.content.pm.PackageManager.MoveCallback p0, android.os.Handler p1);
    @android.annotation.UnsupportedAppUsage
    public abstract void unregisterMoveCallback(android.content.pm.PackageManager.MoveCallback p0);
    @android.annotation.UnsupportedAppUsage
    public abstract int movePackage(java.lang.String p0, android.os.storage.VolumeInfo p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.os.storage.VolumeInfo getPackageCurrentVolume(android.content.pm.ApplicationInfo p0);
    @android.annotation.UnsupportedAppUsage
    public abstract java.util.List<android.os.storage.VolumeInfo> getPackageCandidateVolumes(android.content.pm.ApplicationInfo p0);
    public abstract int movePrimaryStorage(android.os.storage.VolumeInfo p0);
    public abstract android.os.storage.VolumeInfo getPrimaryStorageCurrentVolume();
    public abstract java.util.List<android.os.storage.VolumeInfo> getPrimaryStorageCandidateVolumes();
    public abstract android.content.pm.VerifierDeviceIdentity getVerifierDeviceIdentity();
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isUpgrade();
    public boolean isDeviceUpgrading() { return false; }
    public abstract android.content.pm.PackageInstaller getPackageInstaller();
    @android.annotation.UnsupportedAppUsage
    public abstract void addCrossProfileIntentFilter(android.content.IntentFilter p0, int p1, int p2, int p3);
    @android.annotation.UnsupportedAppUsage
    public abstract void clearCrossProfileIntentFilters(int p0);
    @android.annotation.UnsupportedAppUsage
    public abstract android.graphics.drawable.Drawable loadItemIcon(android.content.pm.PackageItemInfo p0, android.content.pm.ApplicationInfo p1);
    @android.annotation.UnsupportedAppUsage
    public abstract android.graphics.drawable.Drawable loadUnbadgedItemIcon(android.content.pm.PackageItemInfo p0, android.content.pm.ApplicationInfo p1);
    @android.annotation.UnsupportedAppUsage
    public abstract boolean isPackageAvailable(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String installStatusToString(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String installStatusToString(int p0) { return null; }
    public static int installStatusToPublicStatus(int p0) { return 0; }
    public static java.lang.String deleteStatusToString(int p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String deleteStatusToString(int p0) { return null; }
    public static int deleteStatusToPublicStatus(int p0) { return 0; }
    public static java.lang.String permissionFlagToString(int p0) { return null; }
    public abstract int getInstallReason(java.lang.String p0, android.os.UserHandle p1);
    public abstract boolean canRequestPackageInstalls();
    @android.annotation.SystemApi
    public abstract android.content.ComponentName getInstantAppResolverSettingsComponent();
    @android.annotation.SystemApi
    public abstract android.content.ComponentName getInstantAppInstallerComponent();
    public abstract java.lang.String getInstantAppAndroidId(java.lang.String p0, android.os.UserHandle p1);
    @android.annotation.SystemApi
    public abstract void registerDexModule(java.lang.String p0, android.content.pm.PackageManager.DexModuleRegisterCallback p1);
    @android.annotation.SystemApi
    public android.content.pm.dex.ArtManager getArtManager() { return null; }
    @android.annotation.SystemApi
    public void setHarmfulAppWarning(java.lang.String p0, java.lang.CharSequence p1) {}
    @android.annotation.SystemApi
    public java.lang.CharSequence getHarmfulAppWarning(java.lang.String p0) { return null; }
    public boolean hasSigningCertificate(java.lang.String p0, byte[] p1, int p2) { return false; }
    public boolean hasSigningCertificate(int p0, byte[] p1, int p2) { return false; }
    public java.lang.String getSystemTextClassifierPackageName() { return null; }
    public java.lang.String getAttentionServicePackageName() { return null; }
    public java.lang.String getWellbeingPackageName() { return null; }
    public java.lang.String getAppPredictionServicePackageName() { return null; }
    public java.lang.String getSystemCaptionsServicePackageName() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getIncidentReportApproverPackageName() { return null; }
    public boolean isPackageStateProtected(java.lang.String p0, int p1) { return false; }
    @android.annotation.SystemApi
    public void sendDeviceCustomizationReadyBroadcast() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignatureResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResolveInfoFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionWhitelistFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionInfoFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionGroupInfoFlags {
    }

    @android.annotation.SystemApi
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PackageInfoFlags {
    }

    @android.annotation.SystemApi
    public static interface OnPermissionsChangedListener {
        public void onPermissionsChanged(int p0);
    }

    public static class NameNotFoundException extends android.util.AndroidException {
        public NameNotFoundException() { super(); }
        public NameNotFoundException(java.lang.String p0) { super(); }
    }

    public static abstract class MoveCallback {
        public MoveCallback() {}
        public void onCreated(int p0, android.os.Bundle p1) {}
        public abstract void onStatusChanged(int p0, int p1, long p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModuleInfoFlags {
    }

    public static class LegacyPackageDeleteObserver extends android.app.PackageDeleteObserver {
        private final android.content.pm.IPackageDeleteObserver mLegacy = null;
        public LegacyPackageDeleteObserver(android.content.pm.IPackageDeleteObserver p0) { super(); }
        public void onPackageDeleted(java.lang.String p0, int p1, java.lang.String p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstrumentationInfoFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstallReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstallFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnabledState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnabledFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DistractionRestriction {
    }

    @android.annotation.SystemApi
    public static abstract class DexModuleRegisterCallback {
        public DexModuleRegisterCallback() {}
        public abstract void onDexModuleRegistered(java.lang.String p0, boolean p1, java.lang.String p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeleteFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ComponentInfoFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CertificateInputType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplicationInfoFlags {
    }
}
