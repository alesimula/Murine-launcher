package android.content;

public abstract class Context {
    public static final long OVERRIDABLE_COMPONENT_CALLBACKS = 193247900L;
    public static final int DEVICE_ID_DEFAULT = 0;
    public static final int DEVICE_ID_INVALID = -1;
    public static final int MODE_PRIVATE = 0;
    @java.lang.Deprecated
    public static final int MODE_WORLD_READABLE = 1;
    @java.lang.Deprecated
    public static final int MODE_WORLD_WRITEABLE = 2;
    public static final int MODE_APPEND = 32768;
    @java.lang.Deprecated
    public static final int MODE_MULTI_PROCESS = 4;
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;
    public static final int MODE_NO_LOCALIZED_COLLATORS = 16;
    public static final int BIND_AUTO_CREATE = 1;
    public static final int BIND_DEBUG_UNBIND = 2;
    public static final int BIND_NOT_FOREGROUND = 4;
    public static final int BIND_ABOVE_CLIENT = 8;
    public static final int BIND_ALLOW_OOM_MANAGEMENT = 16;
    public static final int BIND_WAIVE_PRIORITY = 32;
    public static final int BIND_IMPORTANT = 64;
    public static final int BIND_ADJUST_WITH_ACTIVITY = 128;
    public static final int BIND_NOT_PERCEPTIBLE = 256;
    public static final int BIND_ALLOW_ACTIVITY_STARTS = 512;
    public static final int BIND_INCLUDE_CAPABILITIES = 4096;
    public static final int BIND_SHARED_ISOLATED_PROCESS = 8192;
    @android.annotation.FlaggedApi("android.content.flags.enable_bind_package_isolated_process")
    public static final int BIND_PACKAGE_ISOLATED_PROCESS = 16384;
    public static final int BIND_NOT_APP_COMPONENT_USAGE = 32768;
    public static final int BIND_ALMOST_PERCEPTIBLE = 65536;
    public static final int BIND_BYPASS_POWER_NETWORK_RESTRICTIONS = 131072;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int BIND_ALLOW_FOREGROUND_SERVICE_STARTS_FROM_BACKGROUND = 262144;
    public static final int BIND_SCHEDULE_LIKE_TOP_APP = 524288;
    @android.annotation.SystemApi
    public static final int BIND_ALLOW_BACKGROUND_ACTIVITY_STARTS = 1048576;
    public static final int BIND_RESTRICT_ASSOCIATIONS = 2097152;
    public static final int BIND_ALLOW_INSTANT = 4194304;
    public static final int BIND_IMPORTANT_BACKGROUND = 8388608;
    public static final int BIND_ALLOW_WHITELIST_MANAGEMENT = 16777216;
    public static final int BIND_FOREGROUND_SERVICE_WHILE_AWAKE = 33554432;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence_module")
    public static final int BIND_FOREGROUND_SERVICE = 67108864;
    public static final int BIND_TREAT_LIKE_ACTIVITY = 134217728;
    @java.lang.Deprecated
    public static final int BIND_VISIBLE = 268435456;
    public static final int BIND_TREAT_LIKE_VISIBLE_FOREGROUND_SERVICE = 268435456;
    public static final int BIND_SHOWING_UI = 536870912;
    public static final int BIND_NOT_VISIBLE = 1073741824;
    public static final int BIND_EXTERNAL_SERVICE = -2147483648;
    public static final long BIND_EXTERNAL_SERVICE_LONG = 4611686018427387904L;
    public static final long BIND_BYPASS_USER_NETWORK_RESTRICTIONS = 4294967296L;
    public static final long BIND_MATCH_QUARANTINED_COMPONENTS = 8589934592L;
    public static final long BIND_ALLOW_FREEZE = 17179869184L;
    public static final long BIND_SIMULATE_ALLOW_FREEZE = 34359738368L;
    public static final long BIND_REDUCTION_FLAGS = 1073742128L;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    public static final int RECEIVER_EXPORTED = 2;
    @java.lang.Deprecated
    public static final int RECEIVER_EXPORTED_UNAUDITED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int PERMISSION_REQUEST_STATE_GRANTED = 0;
    public static final int PERMISSION_REQUEST_STATE_REQUESTABLE = 1;
    public static final int PERMISSION_REQUEST_STATE_UNREQUESTABLE = 2;
    public static final java.lang.String POWER_SERVICE = "power";
    public static final java.lang.String POWER_STATS_SERVICE = "powerstats";
    public static final java.lang.String RECOVERY_SERVICE = "recovery";
    @android.annotation.SystemApi
    public static final java.lang.String SYSTEM_UPDATE_SERVICE = "system_update";
    public static final java.lang.String WINDOW_SERVICE = "window";
    public static final java.lang.String LAYOUT_INFLATER_SERVICE = "layout_inflater";
    public static final java.lang.String ACCOUNT_SERVICE = "account";
    public static final java.lang.String ACTIVITY_SERVICE = "activity";
    public static final java.lang.String ACTIVITY_TASK_SERVICE = "activity_task";
    public static final java.lang.String URI_GRANTS_SERVICE = "uri_grants";
    public static final java.lang.String ALARM_SERVICE = "alarm";
    public static final java.lang.String NOTIFICATION_SERVICE = "notification";
    public static final java.lang.String ACCESSIBILITY_SERVICE = "accessibility";
    public static final java.lang.String CAPTIONING_SERVICE = "captioning";
    public static final java.lang.String KEYGUARD_SERVICE = "keyguard";
    public static final java.lang.String LOCATION_SERVICE = "location";
    public static final java.lang.String COUNTRY_DETECTOR = "country_detector";
    public static final java.lang.String SEARCH_SERVICE = "search";
    public static final java.lang.String SENSOR_SERVICE = "sensor";
    public static final java.lang.String SENSOR_PRIVACY_SERVICE = "sensor_privacy";
    @android.annotation.FlaggedApi("android.security.keystore_grant_api")
    public static final java.lang.String KEYSTORE_SERVICE = "keystore";
    public static final java.lang.String STORAGE_SERVICE = "storage";
    public static final java.lang.String STORAGE_STATS_SERVICE = "storagestats";
    public static final java.lang.String WALLPAPER_SERVICE = "wallpaper";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String VIBRATOR_MANAGER_SERVICE = "vibrator_manager";
    @java.lang.Deprecated
    public static final java.lang.String VIBRATOR_SERVICE = "vibrator";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String STATUS_BAR_SERVICE = "statusbar";
    public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String PAC_PROXY_SERVICE = "pac_proxy";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.os.mainline_vcn_platform_api")
    public static final java.lang.String VCN_MANAGEMENT_SERVICE = "vcn_management";
    @android.annotation.SystemApi
    public static final java.lang.String NETD_SERVICE = "netd";
    public static final java.lang.String NETWORK_STACK_SERVICE = "network_stack";
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final java.lang.String TETHERING_SERVICE = "tethering";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.net.thread.platform.flags.thread_enabled_platform")
    public static final java.lang.String THREAD_NETWORK_SERVICE = "thread_network";
    public static final java.lang.String IPSEC_SERVICE = "ipsec";
    public static final java.lang.String VPN_MANAGEMENT_SERVICE = "vpn_management";
    public static final java.lang.String CONNECTIVITY_DIAGNOSTICS_SERVICE = "connectivity_diagnostics";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String TEST_NETWORK_SERVICE = "test_network";
    public static final java.lang.String UPDATE_LOCK_SERVICE = "updatelock";
    public static final java.lang.String NETWORKMANAGEMENT_SERVICE = "network_management";
    public static final java.lang.String SLICE_SERVICE = "slice";
    public static final java.lang.String NETWORK_STATS_SERVICE = "netstats";
    public static final java.lang.String NETWORK_POLICY_SERVICE = "netpolicy";
    public static final java.lang.String NETWORK_WATCHLIST_SERVICE = "network_watchlist";
    public static final java.lang.String WIFI_SERVICE = "wifi";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String WIFI_NL80211_SERVICE = "wifinl80211";
    public static final java.lang.String WIFI_P2P_SERVICE = "wifip2p";
    public static final java.lang.String WIFI_AWARE_SERVICE = "wifiaware";
    @android.annotation.SystemApi
    public static final java.lang.String WIFI_SCANNING_SERVICE = "wifiscanner";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String WIFI_RTT_SERVICE = "rttmanager";
    public static final java.lang.String WIFI_RTT_RANGING_SERVICE = "wifirtt";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.net.wifi.flags.usd")
    public static final java.lang.String WIFI_USD_SERVICE = "wifi_usd";
    public static final java.lang.String LOWPAN_SERVICE = "lowpan";
    @android.annotation.SystemApi
    public static final java.lang.String ETHERNET_SERVICE = "ethernet";
    public static final java.lang.String NSD_SERVICE = "servicediscovery";
    public static final java.lang.String AUDIO_SERVICE = "audio";
    @android.annotation.SystemApi
    public static final java.lang.String AUDIO_DEVICE_VOLUME_SERVICE = "audio_device_volume";
    @android.annotation.SystemApi
    public static final java.lang.String MEDIA_TRANSCODING_SERVICE = "media_transcoding";
    public static final java.lang.String AUTH_SERVICE = "auth";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.security.secure_lockdown")
    public static final java.lang.String AUTHENTICATION_POLICY_SERVICE = "authentication_policy";
    public static final java.lang.String FINGERPRINT_SERVICE = "fingerprint";
    public static final java.lang.String FACE_SERVICE = "face";
    public static final java.lang.String IRIS_SERVICE = "iris";
    public static final java.lang.String BIOMETRIC_SERVICE = "biometric";
    public static final java.lang.String MEDIA_COMMUNICATION_SERVICE = "media_communication";
    public static final java.lang.String MEDIA_ROUTER_SERVICE = "media_router";
    public static final java.lang.String MEDIA_SESSION_SERVICE = "media_session";
    public static final java.lang.String TELEPHONY_SERVICE = "phone";
    public static final java.lang.String TELEPHONY_SUBSCRIPTION_SERVICE = "telephony_subscription_service";
    public static final java.lang.String TELECOM_SERVICE = "telecom";
    public static final java.lang.String CARRIER_CONFIG_SERVICE = "carrier_config";
    public static final java.lang.String EUICC_SERVICE = "euicc";
    @android.annotation.SystemApi
    public static final java.lang.String EUICC_CARD_SERVICE = "euicc_card";
    public static final java.lang.String MMS_SERVICE = "mms";
    public static final java.lang.String CLIPBOARD_SERVICE = "clipboard";
    public static final java.lang.String TEXT_CLASSIFICATION_SERVICE = "textclassification";
    public static final java.lang.String SELECTION_TOOLBAR_SERVICE = "selection_toolbar";
    @android.annotation.SystemApi
    public static final java.lang.String FONT_SERVICE = "font";
    public static final java.lang.String ATTENTION_SERVICE = "attention";
    public static final java.lang.String ROTATION_RESOLVER_SERVICE = "resolver";
    public static final java.lang.String INPUT_METHOD_SERVICE = "input_method";
    public static final java.lang.String TEXT_SERVICES_MANAGER_SERVICE = "textservices";
    public static final java.lang.String APPWIDGET_SERVICE = "appwidget";
    public static final java.lang.String VOICE_INTERACTION_MANAGER_SERVICE = "voiceinteraction";
    public static final java.lang.String AUTOFILL_MANAGER_SERVICE = "autofill";
    public static final java.lang.String TEXT_TO_SPEECH_MANAGER_SERVICE = "texttospeech";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String CONTENT_CAPTURE_MANAGER_SERVICE = "content_capture";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String TRANSLATION_MANAGER_SERVICE = "translation";
    @android.annotation.SystemApi
    public static final java.lang.String UI_TRANSLATION_SERVICE = "ui_translation";
    @android.annotation.SystemApi
    public static final java.lang.String CONTENT_SUGGESTIONS_SERVICE = "content_suggestions";
    @android.annotation.SystemApi
    public static final java.lang.String APP_PREDICTION_SERVICE = "app_prediction";
    public static final java.lang.String FEATURE_FLAGS_SERVICE = "feature_flags";
    @android.annotation.SystemApi
    public static final java.lang.String SEARCH_UI_SERVICE = "search_ui";
    @android.annotation.SystemApi
    public static final java.lang.String SMARTSPACE_SERVICE = "smartspace";
    @android.annotation.SystemApi
    public static final java.lang.String CONTEXTUAL_SEARCH_SERVICE = "contextual_search";
    @android.annotation.SystemApi
    public static final java.lang.String CLOUDSEARCH_SERVICE = "cloudsearch";
    public static final java.lang.String SOUND_TRIGGER_SERVICE = "soundtrigger";
    public static final java.lang.String SOUND_TRIGGER_MIDDLEWARE_SERVICE = "soundtrigger_middleware";
    @android.annotation.SystemApi
    public static final java.lang.String WALLPAPER_EFFECTS_GENERATION_SERVICE = "wallpaper_effects_generation";
    @android.annotation.SystemApi
    public static final java.lang.String MUSIC_RECOGNITION_SERVICE = "music_recognition";
    @android.annotation.SystemApi
    public static final java.lang.String PERMISSION_SERVICE = "permission";
    public static final java.lang.String LEGACY_PERMISSION_SERVICE = "legacy_permission";
    @android.annotation.SystemApi
    public static final java.lang.String PERMISSION_CONTROLLER_SERVICE = "permission_controller";
    public static final java.lang.String PERMISSION_CHECKER_SERVICE = "permission_checker";
    public static final java.lang.String PERMISSION_ENFORCER_SERVICE = "permission_enforcer";
    @android.annotation.SystemApi
    public static final java.lang.String APP_HIBERNATION_SERVICE = "app_hibernation";
    @android.annotation.SystemApi
    public static final java.lang.String BACKUP_SERVICE = "backup";
    @android.annotation.SystemApi
    public static final java.lang.String ROLLBACK_SERVICE = "rollback";
    @android.annotation.SystemApi
    public static final java.lang.String REBOOT_READINESS_SERVICE = "reboot_readiness";
    public static final java.lang.String DROPBOX_SERVICE = "dropbox";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String BACKGROUND_INSTALL_CONTROL_SERVICE = "background_install_control";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String BINARY_TRANSPARENCY_SERVICE = "transparency";
    @android.annotation.FlaggedApi("android.security.afl_api")
    public static final java.lang.String INTRUSION_DETECTION_SERVICE = "intrusion_detection";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String DEVICE_IDLE_CONTROLLER = "deviceidle";
    @java.lang.Deprecated
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String POWER_WHITELIST_MANAGER = "power_whitelist";
    public static final java.lang.String POWER_EXEMPTION_SERVICE = "power_exemption";
    public static final java.lang.String DEVICE_POLICY_SERVICE = "device_policy";
    public static final java.lang.String UI_MODE_SERVICE = "uimode";
    public static final java.lang.String DOWNLOAD_SERVICE = "download";
    public static final java.lang.String BATTERY_SERVICE = "batterymanager";
    public static final java.lang.String NFC_SERVICE = "nfc";
    public static final java.lang.String BLUETOOTH_SERVICE = "bluetooth";
    public static final java.lang.String SIP_SERVICE = "sip";
    public static final java.lang.String USB_SERVICE = "usb";
    public static final java.lang.String ADB_SERVICE = "adb";
    public static final java.lang.String SERIAL_SERVICE = "serial";
    @android.annotation.SystemApi
    public static final java.lang.String HDMI_CONTROL_SERVICE = "hdmi_control";
    public static final java.lang.String INPUT_SERVICE = "input";
    public static final java.lang.String DISPLAY_SERVICE = "display";
    public static final java.lang.String COLOR_DISPLAY_SERVICE = "color_display";
    public static final java.lang.String USER_SERVICE = "user";
    public static final java.lang.String LAUNCHER_APPS_SERVICE = "launcherapps";
    public static final java.lang.String RESTRICTIONS_SERVICE = "restrictions";
    public static final java.lang.String APP_OPS_SERVICE = "appops";
    public static final java.lang.String ROLE_SERVICE = "role";
    public static final java.lang.String CAMERA_SERVICE = "camera";
    public static final java.lang.String PRINT_SERVICE = "print";
    public static final java.lang.String COMPANION_DEVICE_SERVICE = "companiondevice";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String VIRTUAL_DEVICE_SERVICE = "virtualdevice";
    public static final java.lang.String CONSUMER_IR_SERVICE = "consumer_ir";
    public static final java.lang.String TRUST_SERVICE = "trust";
    public static final java.lang.String TV_INTERACTIVE_APP_SERVICE = "tv_interactive_app";
    public static final java.lang.String TV_INPUT_SERVICE = "tv_input";
    @android.annotation.FlaggedApi("android.media.tv.flags.enable_ad_service_fw")
    public static final java.lang.String TV_AD_SERVICE = "tv_ad";
    public static final java.lang.String TV_TUNER_RESOURCE_MGR_SERVICE = "tv_tuner_resource_mgr";
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String NETWORK_SCORE_SERVICE = "network_score";
    public static final java.lang.String USAGE_STATS_SERVICE = "usagestats";
    public static final java.lang.String JOB_SCHEDULER_SERVICE = "jobscheduler";
    @android.annotation.FlaggedApi("android.security.frp_enforcement")
    public static final java.lang.String PERSISTENT_DATA_BLOCK_SERVICE = "persistent_data_block";
    @android.annotation.SystemApi
    public static final java.lang.String OEM_LOCK_SERVICE = "oem_lock";
    public static final java.lang.String MEDIA_PROJECTION_SERVICE = "media_projection";
    public static final java.lang.String MIDI_SERVICE = "midi";
    public static final java.lang.String RADIO_SERVICE = "broadcastradio";
    public static final java.lang.String HARDWARE_PROPERTIES_SERVICE = "hardware_properties";
    public static final java.lang.String THERMAL_SERVICE = "thermalservice";
    public static final java.lang.String PERFORMANCE_HINT_SERVICE = "performance_hint";
    public static final java.lang.String SHORTCUT_SERVICE = "shortcut";
    @android.annotation.SystemApi
    public static final java.lang.String CONTEXTHUB_SERVICE = "contexthub";
    public static final java.lang.String SYSTEM_HEALTH_SERVICE = "systemhealth";
    public static final java.lang.String GATEKEEPER_SERVICE = "android.service.gatekeeper.IGateKeeperService";
    public static final java.lang.String DEVICE_IDENTIFIERS_SERVICE = "device_identifiers";
    public static final java.lang.String INCIDENT_SERVICE = "incident";
    public static final java.lang.String INCIDENT_COMPANION_SERVICE = "incidentcompanion";
    public static final java.lang.String STATS_MANAGER_SERVICE = "statsmanager";
    public static final java.lang.String STATS_COMPANION_SERVICE = "statscompanion";
    public static final java.lang.String STATS_BOOTSTRAP_ATOM_SERVICE = "statsbootstrap";
    @android.annotation.SystemApi
    public static final java.lang.String STATS_MANAGER = "stats";
    public static final java.lang.String PLATFORM_COMPAT_SERVICE = "platform_compat";
    public static final java.lang.String PLATFORM_COMPAT_NATIVE_SERVICE = "platform_compat_native";
    public static final java.lang.String BUGREPORT_SERVICE = "bugreport";
    public static final java.lang.String OVERLAY_SERVICE = "overlay";
    public static final java.lang.String RESOURCES_SERVICE = "resources";
    public static final java.lang.String IDMAP_SERVICE = "idmap";
    @android.annotation.SystemApi
    public static final java.lang.String VR_SERVICE = "vrmanager";
    public static final java.lang.String CROSS_PROFILE_APPS_SERVICE = "crossprofileapps";
    @android.annotation.SystemApi
    public static final java.lang.String SECURE_ELEMENT_SERVICE = "secure_element";
    public static final java.lang.String TIME_DETECTOR_SERVICE = "time_detector";
    public static final java.lang.String TIME_ZONE_DETECTOR_SERVICE = "time_zone_detector";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String TIME_MANAGER_SERVICE = "time_manager";
    public static final java.lang.String APP_BINDING_SERVICE = "app_binding";
    public static final java.lang.String TELEPHONY_IMS_SERVICE = "telephony_ims";
    @android.annotation.SystemApi
    public static final java.lang.String SYSTEM_CONFIG_SERVICE = "system_config";
    public static final java.lang.String TELEPHONY_RCS_MESSAGE_SERVICE = "ircsmessage";
    public static final java.lang.String DYNAMIC_SYSTEM_SERVICE = "dynamic_system";
    public static final java.lang.String BLOB_STORE_SERVICE = "blob_store";
    public static final java.lang.String TELEPHONY_REGISTRY_SERVICE = "telephony_registry";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String BATTERY_STATS_SERVICE = "batterystats";
    public static final java.lang.String APP_SEARCH_SERVICE = "app_search";
    @android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
    public static final java.lang.String APP_FUNCTION_SERVICE = "app_function";
    @android.annotation.SystemApi
    public static final java.lang.String APP_INTEGRITY_SERVICE = "app_integrity";
    public static final java.lang.String DATA_LOADER_MANAGER_SERVICE = "dataloader_manager";
    public static final java.lang.String INCREMENTAL_SERVICE = "incremental";
    public static final java.lang.String ATTESTATION_VERIFICATION_SERVICE = "attestation_verification";
    @android.annotation.FlaggedApi("android.security.aapm_api")
    public static final java.lang.String ADVANCED_PROTECTION_SERVICE = "advanced_protection";
    public static final java.lang.String FILE_INTEGRITY_SERVICE = "file_integrity";
    public static final java.lang.String REMOTE_PROVISIONING_SERVICE = "remote_provisioning";
    public static final java.lang.String LIGHTS_SERVICE = "lights";
    @android.annotation.SystemApi
    public static final java.lang.String UWB_SERVICE = "uwb";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
    public static final java.lang.String RANGING_SERVICE = "ranging";
    public static final java.lang.String DREAM_SERVICE = "dream";
    public static final java.lang.String SMS_SERVICE = "sms";
    public static final java.lang.String PEOPLE_SERVICE = "people";
    public static final java.lang.String DEVICE_STATE_SERVICE = "device_state";
    public static final java.lang.String MEDIA_METRICS_SERVICE = "media_metrics";
    public static final java.lang.String SPEECH_RECOGNITION_SERVICE = "speech_recognition";
    public static final java.lang.String GAME_SERVICE = "game";
    public static final java.lang.String DOMAIN_VERIFICATION_SERVICE = "domain_verification";
    public static final java.lang.String DISPLAY_HASH_SERVICE = "display_hash";
    public static final java.lang.String LOCALE_SERVICE = "locale";
    @android.annotation.SystemApi
    public static final java.lang.String SAFETY_CENTER_SERVICE = "safety_center";
    @android.annotation.SystemApi
    public static final java.lang.String NEARBY_SERVICE = "nearby";
    public static final java.lang.String REMOTE_AUTH_SERVICE = "remote_auth";
    @android.annotation.SystemApi
    public static final java.lang.String AMBIENT_CONTEXT_SERVICE = "ambient_context";
    @android.annotation.SystemApi
    public static final java.lang.String WEARABLE_SENSING_SERVICE = "wearable_sensing";
    public static final java.lang.String TASK_CONTINUITY_SERVICE = "task_continuity";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
    public static final java.lang.String ON_DEVICE_INTELLIGENCE_SERVICE = "on_device_intelligence";
    public static final java.lang.String HEALTHCONNECT_SERVICE = "healthconnect";
    public static final java.lang.String CREDENTIAL_SERVICE = "credential";
    public static final java.lang.String DEVICE_LOCK_SERVICE = "device_lock";
    @android.annotation.SystemApi
    public static final java.lang.String VIRTUALIZATION_SERVICE = "virtualization";
    public static final java.lang.String GRAMMATICAL_INFLECTION_SERVICE = "grammatical_inflection";
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_state_change_listener")
    public static final java.lang.String SATELLITE_SERVICE = "satellite";
    @android.annotation.SystemApi
    public static final java.lang.String SHARED_CONNECTIVITY_SERVICE = "shared_connectivity";
    @android.annotation.FlaggedApi("android.os.security_state_service")
    public static final java.lang.String SECURITY_STATE_SERVICE = "security_state";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.enhanced_confirmation_mode_apis_enabled")
    public static final java.lang.String ECM_ENHANCED_CONFIRMATION_SERVICE = "ecm_enhanced_confirmation";
    public static final java.lang.String SENSITIVE_CONTENT_PROTECTION_SERVICE = "sensitive_content_protection_service";
    @android.annotation.FlaggedApi("android.provider.user_keys")
    public static final java.lang.String CONTACT_KEYS_SERVICE = "contact_keys";
    @android.annotation.FlaggedApi("android.os.telemetry_apis_framework_initialization")
    public static final java.lang.String PROFILING_SERVICE = "profiling";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.webkit.update_service_ipc_wrapper")
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String WEBVIEW_UPDATE_SERVICE = "webviewupdate";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.server.telecom.flags.telecom_mainline_blocked_numbers_manager")
    public static final java.lang.String BLOCKED_NUMBERS_SERVICE = "blocked_numbers";
    public static final java.lang.String PROTOLOG_CONFIGURATION_SERVICE = "protolog_configuration";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.supervision_manager_apis")
    public static final java.lang.String SUPERVISION_SERVICE = "supervision";
    @android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
    public static final java.lang.String MEDIA_QUALITY_SERVICE = "media_quality";
    public static final java.lang.String DYNAMIC_INSTRUMENTATION_SERVICE = "dynamic_instrumentation";
    @android.annotation.FlaggedApi("android.service.chooser.interactive_chooser")
    public static final java.lang.String CHOOSER_SERVICE = "chooser";
    public static final int CONTEXT_INCLUDE_CODE = 1;
    public static final int CONTEXT_IGNORE_SECURITY = 2;
    public static final int CONTEXT_RESTRICTED = 4;
    public static final int CONTEXT_DEVICE_PROTECTED_STORAGE = 8;
    public static final int CONTEXT_CREDENTIAL_PROTECTED_STORAGE = 16;
    public static final int CONTEXT_REGISTER_PACKAGE = 1073741824;
    public Context() {}
    public abstract android.content.res.AssetManager getAssets();
    public abstract android.content.res.Resources getResources();
    public abstract android.content.pm.PackageManager getPackageManager();
    public abstract android.content.ContentResolver getContentResolver();
    public abstract android.os.Looper getMainLooper();
    public java.util.concurrent.Executor getMainExecutor() { return null; }
    public abstract android.content.Context getApplicationContext();
    public int getNextAutofillId() { return 0; }
    public void registerComponentCallbacks(android.content.ComponentCallbacks p0) {}
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks p0) {}
    @android.annotation.NonNull
    public final java.lang.CharSequence getText(int p0) { return null; }
    @android.annotation.NonNull
    public final java.lang.String getString(int p0) { return null; }
    @android.annotation.NonNull
    public final java.lang.String getString(int p0, java.lang.Object... p1) { return null; }
    public final int getColor(int p0) { return 0; }
    @android.annotation.Nullable
    public final android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    @android.annotation.NonNull
    public final android.content.res.ColorStateList getColorStateList(int p0) { return null; }
    public abstract void setTheme(int p0);
    public int getThemeResId() { return 0; }
    @android.view.ViewDebug.ExportedProperty(deepExport=true)
    public abstract android.content.res.Resources.Theme getTheme();
    @android.annotation.NonNull
    public final android.content.res.TypedArray obtainStyledAttributes(int[] p0) { return null; }
    @android.annotation.NonNull
    public final android.content.res.TypedArray obtainStyledAttributes(int p0, int[] p1) throws android.content.res.Resources.NotFoundException { return null; }
    @android.annotation.NonNull
    public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet p0, int[] p1) { return null; }
    @android.annotation.NonNull
    public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet p0, int[] p1, int p2, int p3) { return null; }
    public abstract java.lang.ClassLoader getClassLoader();
    public abstract java.lang.String getPackageName();
    public abstract java.lang.String getBasePackageName();
    @android.annotation.NonNull
    public java.lang.String getOpPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.NonNull
    public android.content.AttributionSource getAttributionSource() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.lang.String getFeatureId() { return null; }
    @android.annotation.Nullable
    public android.content.ContextParams getParams() { return null; }
    public abstract android.content.pm.ApplicationInfo getApplicationInfo();
    public abstract java.lang.String getPackageResourcePath();
    public abstract java.lang.String getPackageCodePath();
    @java.lang.Deprecated
    public java.io.File getSharedPrefsFile(java.lang.String p0) { return null; }
    public abstract android.content.SharedPreferences getSharedPreferences(java.lang.String p0, int p1);
    public abstract android.content.SharedPreferences getSharedPreferences(java.io.File p0, int p1);
    public abstract boolean moveSharedPreferencesFrom(android.content.Context p0, java.lang.String p1);
    public abstract boolean deleteSharedPreferences(java.lang.String p0);
    public abstract void reloadSharedPreferences();
    public abstract java.io.FileInputStream openFileInput(java.lang.String p0) throws java.io.FileNotFoundException;
    public abstract java.io.FileOutputStream openFileOutput(java.lang.String p0, int p1) throws java.io.FileNotFoundException;
    public abstract boolean deleteFile(java.lang.String p0);
    public abstract java.io.File getFileStreamPath(java.lang.String p0);
    public abstract java.io.File getSharedPreferencesPath(java.lang.String p0);
    public abstract java.io.File getDataDir();
    public abstract java.io.File getFilesDir();
    @android.annotation.NonNull
    public java.io.File getCrateDir(java.lang.String p0) { return null; }
    public abstract java.io.File getNoBackupFilesDir();
    @android.annotation.Nullable
    public abstract java.io.File getExternalFilesDir(java.lang.String p0);
    public abstract java.io.File[] getExternalFilesDirs(java.lang.String p0);
    public abstract java.io.File getObbDir();
    public abstract java.io.File[] getObbDirs();
    public abstract java.io.File getCacheDir();
    public abstract java.io.File getCodeCacheDir();
    @android.annotation.Nullable
    public abstract java.io.File getExternalCacheDir();
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public abstract java.io.File getPreloadsFileCache();
    public abstract java.io.File[] getExternalCacheDirs();
    @java.lang.Deprecated
    public abstract java.io.File[] getExternalMediaDirs();
    public abstract java.lang.String[] fileList();
    public abstract java.io.File getDir(java.lang.String p0, int p1);
    public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2);
    public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String p0, int p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, android.database.DatabaseErrorHandler p3);
    public abstract boolean moveDatabaseFrom(android.content.Context p0, java.lang.String p1);
    public abstract boolean deleteDatabase(java.lang.String p0);
    public abstract java.io.File getDatabasePath(java.lang.String p0);
    public abstract java.lang.String[] databaseList();
    @java.lang.Deprecated
    public abstract android.graphics.drawable.Drawable getWallpaper();
    @java.lang.Deprecated
    public abstract android.graphics.drawable.Drawable peekWallpaper();
    @java.lang.Deprecated
    public abstract int getWallpaperDesiredMinimumWidth();
    @java.lang.Deprecated
    public abstract int getWallpaperDesiredMinimumHeight();
    @java.lang.Deprecated
    public abstract void setWallpaper(android.graphics.Bitmap p0) throws java.io.IOException;
    @java.lang.Deprecated
    public abstract void setWallpaper(java.io.InputStream p0) throws java.io.IOException;
    @java.lang.Deprecated
    public abstract void clearWallpaper() throws java.io.IOException;
    public abstract void startActivity(android.content.Intent p0);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public void startActivityAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public abstract void startActivity(android.content.Intent p0, android.os.Bundle p1);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public void startActivityAsUser(android.content.Intent p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    public void startActivityForResult(java.lang.String p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public boolean canStartActivityForResult() { return false; }
    public abstract void startActivities(android.content.Intent[] p0);
    public abstract void startActivities(android.content.Intent[] p0, android.os.Bundle p1);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public int startActivitiesAsUser(android.content.Intent[] p0, android.os.Bundle p1, android.os.UserHandle p2) { return 0; }
    public abstract void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4) throws android.content.IntentSender.SendIntentException;
    public abstract void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.content.IntentSender.SendIntentException;
    public abstract void sendBroadcast(android.content.Intent p0);
    public abstract void sendBroadcast(android.content.Intent p0, java.lang.String p1);
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String[] p2) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3, android.app.BroadcastOptions p4) {}
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, android.os.Bundle p2) {}
    @android.annotation.SystemApi
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, android.app.BroadcastOptions p2) {}
    public void sendBroadcastWithMultiplePermissions(android.content.Intent p0, java.lang.String[] p1) {}
    public abstract void sendBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2);
    public void sendBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2) {}
    public abstract void sendBroadcast(android.content.Intent p0, java.lang.String p1, int p2);
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1);
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2) {}
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6);
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, int p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2);
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.os.Bundle p3);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.content.BroadcastReceiver p4, android.os.Handler p5, int p6, java.lang.String p7, android.os.Bundle p8);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.os.Bundle p4, android.content.BroadcastReceiver p5, android.os.Handler p6, int p7, java.lang.String p8, android.os.Bundle p9);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public void sendOrderedBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2, int p3, android.os.Bundle p4, android.content.BroadcastReceiver p5, android.os.Handler p6, int p7, java.lang.String p8, android.os.Bundle p9) {}
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public void sendOrderedBroadcast(android.content.Intent p0, int p1, java.lang.String p2, java.lang.String p3, android.content.BroadcastReceiver p4, android.os.Handler p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.ordered_broadcast_multiple_permissions")
    public void sendOrderedBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BROADCAST_STICKY")
    public abstract void sendStickyBroadcast(android.content.Intent p0);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BROADCAST_STICKY")
    public void sendStickyBroadcast(android.content.Intent p0, android.os.Bundle p1) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BROADCAST_STICKY")
    public abstract void sendStickyOrderedBroadcast(android.content.Intent p0, android.content.BroadcastReceiver p1, android.os.Handler p2, int p3, java.lang.String p4, android.os.Bundle p5);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.BROADCAST_STICKY")
    public abstract void removeStickyBroadcast(android.content.Intent p0);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.BROADCAST_STICKY"})
    public abstract void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.BROADCAST_STICKY"})
    public abstract void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.os.Bundle p2);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.BROADCAST_STICKY"})
    public abstract void sendStickyOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6);
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.BROADCAST_STICKY"})
    public abstract void removeStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    @android.annotation.Nullable
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1);
    @android.annotation.Nullable
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, int p2);
    @android.annotation.Nullable
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3);
    @android.annotation.Nullable
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3, int p4);
    @android.annotation.SystemApi
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public android.content.Intent registerReceiverForAllUsers(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3) { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("IntentBuilderName")
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public android.content.Intent registerReceiverForAllUsers(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3, int p4) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public abstract android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4);
    @android.annotation.SuppressLint("IntentBuilderName")
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public abstract android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4, int p5);
    public abstract void unregisterReceiver(android.content.BroadcastReceiver p0);
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public java.util.List<android.content.IntentFilter> getRegisteredIntentFilters(android.content.BroadcastReceiver p0) { return null; }
    @android.annotation.Nullable
    public abstract android.content.ComponentName startService(android.content.Intent p0);
    @android.annotation.Nullable
    public abstract android.content.ComponentName startForegroundService(android.content.Intent p0);
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract android.content.ComponentName startForegroundServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract boolean stopService(android.content.Intent p0);
    @android.annotation.Nullable
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract android.content.ComponentName startServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    public abstract boolean stopServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, int p2);
    public boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2) { return false; }
    public boolean bindService(android.content.Intent p0, int p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindService(android.content.Intent p0, android.content.Context.BindServiceFlags p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindIsolatedService(android.content.Intent p0, int p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
    public boolean bindIsolatedService(android.content.Intent p0, android.content.Context.BindServiceFlags p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_PROFILES"}, conditional=true)
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.UserHandle p3) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_PROFILES"}, conditional=true)
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2, android.os.UserHandle p3) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_PROFILES"}, conditional=true)
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.Handler p3, android.os.UserHandle p4) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL", "android.permission.INTERACT_ACROSS_PROFILES"}, conditional=true)
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, android.content.Context.BindServiceFlags p2, android.os.Handler p3, android.os.UserHandle p4) { return false; }
    public void updateServiceGroup(android.content.ServiceConnection p0, int p1, int p2) {}
    public abstract void unbindService(android.content.ServiceConnection p0);
    public abstract boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, android.os.Bundle p2);
    public abstract java.lang.Object getSystemService(java.lang.String p0);
    public final <T extends java.lang.Object> T getSystemService(java.lang.Class<T> p0) { return null; }
    @android.annotation.Nullable
    public abstract java.lang.String getSystemServiceName(java.lang.Class<?> p0);
    @android.annotation.PermissionMethod
    public abstract int checkPermission(java.lang.String p0, int p1, int p2);
    public abstract int checkPermission(java.lang.String p0, int p1, int p2, android.os.IBinder p3);
    @android.annotation.PermissionMethod
    public abstract int checkCallingPermission(java.lang.String p0);
    @android.annotation.PermissionMethod(orSelf=true)
    public abstract int checkCallingOrSelfPermission(java.lang.String p0);
    public abstract int checkSelfPermission(java.lang.String p0);
    @android.annotation.PermissionMethod
    public abstract void enforcePermission(java.lang.String p0, int p1, int p2, java.lang.String p3);
    @android.annotation.PermissionMethod
    public abstract void enforceCallingPermission(java.lang.String p0, java.lang.String p1);
    @android.annotation.PermissionMethod(orSelf=true)
    public abstract void enforceCallingOrSelfPermission(java.lang.String p0, java.lang.String p1);
    public int getPermissionRequestState(java.lang.String p0) { return 0; }
    public abstract void grantUriPermission(java.lang.String p0, android.net.Uri p1, int p2);
    public abstract void revokeUriPermission(android.net.Uri p0, int p1);
    public abstract void revokeUriPermission(java.lang.String p0, android.net.Uri p1, int p2);
    public abstract int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3);
    @android.annotation.FlaggedApi("android.security.content_uri_permission_apis")
    public int checkContentUriPermissionFull(android.net.Uri p0, int p1, int p2, int p3) { return 0; }
    @android.annotation.NonNull
    public int[] checkUriPermissions(java.util.List<android.net.Uri> p0, int p1, int p2, int p3) { return null; }
    public abstract int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, android.os.IBinder p4);
    public abstract int checkCallingUriPermission(android.net.Uri p0, int p1);
    @android.annotation.NonNull
    public int[] checkCallingUriPermissions(java.util.List<android.net.Uri> p0, int p1) { return null; }
    public abstract int checkCallingOrSelfUriPermission(android.net.Uri p0, int p1);
    @android.annotation.NonNull
    public int[] checkCallingOrSelfUriPermissions(java.util.List<android.net.Uri> p0, int p1) { return null; }
    public abstract int checkUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5);
    public abstract void enforceUriPermission(android.net.Uri p0, int p1, int p2, int p3, java.lang.String p4);
    public abstract void enforceCallingUriPermission(android.net.Uri p0, int p1, java.lang.String p2);
    public abstract void enforceCallingOrSelfUriPermission(android.net.Uri p0, int p1, java.lang.String p2);
    public abstract void enforceUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6);
    public void revokeSelfPermissionOnKill(java.lang.String p0) {}
    public void revokeSelfPermissionsOnKill(java.util.Collection<java.lang.String> p0) {}
    public abstract android.content.Context createPackageContext(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.content.Context createPackageContextAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.content.Context createContextAsUser(android.os.UserHandle p0, int p1) { return null; }
    public abstract android.content.Context createApplicationContext(android.content.pm.ApplicationInfo p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public android.content.Context createContextForSdkInSandbox(android.content.pm.ApplicationInfo p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public abstract android.content.Context createContextForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public android.os.UserHandle getUser() { return null; }
    public int getUserId() { return 0; }
    public abstract android.content.Context createConfigurationContext(android.content.res.Configuration p0);
    public abstract android.content.Context createDisplayContext(android.view.Display p0);
    @android.annotation.NonNull
    public android.content.Context createDeviceContext(int p0) { return null; }
    @android.annotation.NonNull
    public android.content.Context createWindowContext(int p0, android.os.Bundle p1) { return null; }
    @android.annotation.NonNull
    public android.content.Context createWindowContext(android.view.Display p0, int p1, android.os.Bundle p2) { return null; }
    @android.annotation.NonNull
    public android.content.Context createContext(android.content.ContextParams p0) { return null; }
    @android.annotation.NonNull
    public android.content.Context createAttributionContext(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.content.Context createFeatureContext(java.lang.String p0) { return null; }
    public abstract android.content.Context createDeviceProtectedStorageContext();
    @android.annotation.SystemApi
    public abstract android.content.Context createCredentialProtectedStorageContext();
    @android.annotation.NonNull
    public android.content.Context createTokenContext(android.os.IBinder p0, android.view.Display p1) { return null; }
    public abstract android.view.DisplayAdjustments getDisplayAdjustments(int p0);
    @android.annotation.NonNull
    public android.view.Display getDisplay() { return null; }
    @android.annotation.Nullable
    public android.view.Display getDisplayNoVerify() { return null; }
    public abstract int getDisplayId();
    public int getAssociatedDisplayId() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public abstract void updateDisplay(int p0);
    public void updateDeviceId(int p0) {}
    public int getDeviceId() { return 0; }
    public void registerDeviceIdChangeListener(java.util.concurrent.Executor p0, java.util.function.IntConsumer p1) {}
    public void unregisterDeviceIdChangeListener(java.util.function.IntConsumer p0) {}
    public boolean isRestricted() { return false; }
    public abstract boolean isDeviceProtectedStorage();
    @android.annotation.SystemApi
    public abstract boolean isCredentialProtectedStorage();
    public abstract boolean canLoadUnsafeResources();
    @android.annotation.Nullable
    public android.os.IBinder getActivityToken() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getWindowContextToken() { return null; }
    @android.annotation.Nullable
    public static android.os.IBinder getToken(android.content.Context p0) { return null; }
    @android.annotation.Nullable
    public android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.os.Handler p1, long p2) { return null; }
    public android.app.IApplicationThread getIApplicationThread() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public android.os.IBinder getProcessToken() { return null; }
    public android.os.Handler getMainThreadHandler() { return null; }
    public android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }
    public void setAutofillClient(android.view.autofill.AutofillManager.AutofillClient p0) {}
    @android.annotation.Nullable
    public android.view.contentcapture.ContentCaptureManager.ContentCaptureClient getContentCaptureClient() { return null; }
    public final boolean isAutofillCompatibilityEnabled() { return false; }
    @android.annotation.Nullable
    public android.content.AutofillOptions getAutofillOptions() { return null; }
    public void setAutofillOptions(android.content.AutofillOptions p0) {}
    @android.annotation.Nullable
    public android.content.ContentCaptureOptions getContentCaptureOptions() { return null; }
    public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) {}
    public void assertRuntimeOverlayThemable() {}
    public boolean isUiContext() { return false; }
    public void destroy() {}
    public boolean isConfigurationContext() { return false; }
    @android.annotation.RequiresPermission("android.permission.BROADCAST_CLOSE_SYSTEM_DIALOGS")
    public void closeSystemDialogs() {}

    public static final class BindServiceFlags {
        public long getValue() { return 0L; }
        @android.annotation.NonNull
        public static android.content.Context.BindServiceFlags of(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BindServiceFlagsBits {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BindServiceFlagsLongBits {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CreatePackageOptions {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatabaseMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FileMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionRequestState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PreferencesMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RegisterReceiverFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceName {
    }
}
