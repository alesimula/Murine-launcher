package android.content;

public abstract class Context {
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
    public static final int BIND_INCLUDE_CAPABILITIES = 4096;
    public static final int BIND_SCHEDULE_LIKE_TOP_APP = 524288;
    public static final int BIND_ALLOW_BACKGROUND_ACTIVITY_STARTS = 1048576;
    public static final int BIND_RESTRICT_ASSOCIATIONS = 2097152;
    public static final int BIND_ALLOW_INSTANT = 4194304;
    public static final int BIND_IMPORTANT_BACKGROUND = 8388608;
    public static final int BIND_ALLOW_WHITELIST_MANAGEMENT = 16777216;
    public static final int BIND_FOREGROUND_SERVICE_WHILE_AWAKE = 33554432;
    public static final int BIND_FOREGROUND_SERVICE = 67108864;
    public static final int BIND_TREAT_LIKE_ACTIVITY = 134217728;
    public static final int BIND_VISIBLE = 268435456;
    public static final int BIND_SHOWING_UI = 536870912;
    public static final int BIND_NOT_VISIBLE = 1073741824;
    public static final int BIND_EXTERNAL_SERVICE = -2147483648;
    public static final int BIND_REDUCTION_FLAGS = 1073742128;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static int sLastAutofillId;
    public static final java.lang.String POWER_SERVICE = "power";
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
    public static final java.lang.String STORAGE_SERVICE = "storage";
    public static final java.lang.String STORAGE_STATS_SERVICE = "storagestats";
    public static final java.lang.String WALLPAPER_SERVICE = "wallpaper";
    public static final java.lang.String VIBRATOR_SERVICE = "vibrator";
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String STATUS_BAR_SERVICE = "statusbar";
    public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";
    @android.annotation.SystemApi
    public static final java.lang.String NETD_SERVICE = "netd";
    public static final java.lang.String NETWORK_STACK_SERVICE = "network_stack";
    @android.annotation.SystemApi
    public static final java.lang.String TETHERING_SERVICE = "tethering";
    public static final java.lang.String IPSEC_SERVICE = "ipsec";
    public static final java.lang.String VPN_MANAGEMENT_SERVICE = "vpn_management";
    public static final java.lang.String CONNECTIVITY_DIAGNOSTICS_SERVICE = "connectivity_diagnostics";
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
    public static final java.lang.String LOWPAN_SERVICE = "lowpan";
    @android.annotation.SystemApi
    public static final java.lang.String ETHERNET_SERVICE = "ethernet";
    public static final java.lang.String NSD_SERVICE = "servicediscovery";
    public static final java.lang.String AUDIO_SERVICE = "audio";
    public static final java.lang.String AUTH_SERVICE = "auth";
    public static final java.lang.String FINGERPRINT_SERVICE = "fingerprint";
    public static final java.lang.String FACE_SERVICE = "face";
    public static final java.lang.String IRIS_SERVICE = "iris";
    public static final java.lang.String BIOMETRIC_SERVICE = "biometric";
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
    public static final java.lang.String ATTENTION_SERVICE = "attention";
    public static final java.lang.String INPUT_METHOD_SERVICE = "input_method";
    public static final java.lang.String TEXT_SERVICES_MANAGER_SERVICE = "textservices";
    public static final java.lang.String APPWIDGET_SERVICE = "appwidget";
    public static final java.lang.String VOICE_INTERACTION_MANAGER_SERVICE = "voiceinteraction";
    public static final java.lang.String AUTOFILL_MANAGER_SERVICE = "autofill";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String CONTENT_CAPTURE_MANAGER_SERVICE = "content_capture";
    @android.annotation.SystemApi
    public static final java.lang.String CONTENT_SUGGESTIONS_SERVICE = "content_suggestions";
    @android.annotation.SystemApi
    public static final java.lang.String APP_PREDICTION_SERVICE = "app_prediction";
    public static final java.lang.String SOUND_TRIGGER_SERVICE = "soundtrigger";
    public static final java.lang.String SOUND_TRIGGER_MIDDLEWARE_SERVICE = "soundtrigger_middleware";
    @android.annotation.SystemApi
    public static final java.lang.String PERMISSION_SERVICE = "permission";
    public static final java.lang.String PERMISSION_CONTROLLER_SERVICE = "permission_controller";
    @android.annotation.SystemApi
    public static final java.lang.String BACKUP_SERVICE = "backup";
    @android.annotation.SystemApi
    public static final java.lang.String ROLLBACK_SERVICE = "rollback";
    public static final java.lang.String DROPBOX_SERVICE = "dropbox";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String DEVICE_IDLE_CONTROLLER = "deviceidle";
    @android.annotation.SuppressLint("ServiceName")
    public static final java.lang.String POWER_WHITELIST_MANAGER = "power_whitelist";
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
    public static final java.lang.String ROLE_CONTROLLER_SERVICE = "role_controller";
    public static final java.lang.String CAMERA_SERVICE = "camera";
    public static final java.lang.String PRINT_SERVICE = "print";
    public static final java.lang.String COMPANION_DEVICE_SERVICE = "companiondevice";
    public static final java.lang.String CONSUMER_IR_SERVICE = "consumer_ir";
    public static final java.lang.String TRUST_SERVICE = "trust";
    public static final java.lang.String TV_INPUT_SERVICE = "tv_input";
    public static final java.lang.String TV_TUNER_RESOURCE_MGR_SERVICE = "tv_tuner_resource_mgr";
    @android.annotation.SystemApi
    public static final java.lang.String NETWORK_SCORE_SERVICE = "network_score";
    public static final java.lang.String USAGE_STATS_SERVICE = "usagestats";
    public static final java.lang.String JOB_SCHEDULER_SERVICE = "jobscheduler";
    @android.annotation.SystemApi
    public static final java.lang.String PERSISTENT_DATA_BLOCK_SERVICE = "persistent_data_block";
    @android.annotation.SystemApi
    public static final java.lang.String OEM_LOCK_SERVICE = "oem_lock";
    public static final java.lang.String MEDIA_PROJECTION_SERVICE = "media_projection";
    public static final java.lang.String MIDI_SERVICE = "midi";
    public static final java.lang.String RADIO_SERVICE = "broadcastradio";
    public static final java.lang.String HARDWARE_PROPERTIES_SERVICE = "hardware_properties";
    public static final java.lang.String THERMAL_SERVICE = "thermalservice";
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
    @android.annotation.SystemApi
    public static final java.lang.String STATS_MANAGER = "stats";
    public static final java.lang.String PLATFORM_COMPAT_SERVICE = "platform_compat";
    public static final java.lang.String PLATFORM_COMPAT_NATIVE_SERVICE = "platform_compat_native";
    @android.annotation.SystemApi
    public static final java.lang.String BUGREPORT_SERVICE = "bugreport";
    public static final java.lang.String OVERLAY_SERVICE = "overlay";
    public static final java.lang.String IDMAP_SERVICE = "idmap";
    @android.annotation.SystemApi
    public static final java.lang.String VR_SERVICE = "vrmanager";
    public static final java.lang.String TIME_ZONE_RULES_MANAGER_SERVICE = "timezone";
    public static final java.lang.String CROSS_PROFILE_APPS_SERVICE = "crossprofileapps";
    @android.annotation.SystemApi
    public static final java.lang.String SECURE_ELEMENT_SERVICE = "secure_element";
    public static final java.lang.String TIME_DETECTOR_SERVICE = "time_detector";
    public static final java.lang.String TIME_ZONE_DETECTOR_SERVICE = "time_zone_detector";
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
    @android.annotation.SystemApi
    public static final java.lang.String APP_INTEGRITY_SERVICE = "app_integrity";
    public static final java.lang.String DATA_LOADER_MANAGER_SERVICE = "dataloader_manager";
    public static final java.lang.String INCREMENTAL_SERVICE = "incremental";
    public static final java.lang.String FILE_INTEGRITY_SERVICE = "file_integrity";
    public static final java.lang.String LIGHTS_SERVICE = "lights";
    public static final java.lang.String DREAM_SERVICE = "dream";
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
    public final java.lang.CharSequence getText(int p0) { return null; }
    public final java.lang.String getString(int p0) { return null; }
    public final java.lang.String getString(int p0, java.lang.Object... p1) { return null; }
    public final int getColor(int p0) { return 0; }
    public final android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    public final android.content.res.ColorStateList getColorStateList(int p0) { return null; }
    public abstract void setTheme(int p0);
    public int getThemeResId() { return 0; }
    @android.view.ViewDebug.ExportedProperty(deepExport=true)
    public abstract android.content.res.Resources.Theme getTheme();
    public final android.content.res.TypedArray obtainStyledAttributes(int[] p0) { return null; }
    public final android.content.res.TypedArray obtainStyledAttributes(int p0, int[] p1) throws android.content.res.Resources.NotFoundException { return null; }
    public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet p0, int[] p1) { return null; }
    public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet p0, int[] p1, int p2, int p3) { return null; }
    public abstract java.lang.ClassLoader getClassLoader();
    public abstract java.lang.String getPackageName();
    public abstract java.lang.String getBasePackageName();
    public java.lang.String getOpPackageName() { return null; }
    public java.lang.String getAttributionTag() { return null; }
    @java.lang.Deprecated
    public java.lang.String getFeatureId() { return null; }
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
    public java.io.File getCrateDir(java.lang.String p0) { return null; }
    public abstract java.io.File getNoBackupFilesDir();
    public abstract java.io.File getExternalFilesDir(java.lang.String p0);
    public abstract java.io.File[] getExternalFilesDirs(java.lang.String p0);
    public abstract java.io.File getObbDir();
    public abstract java.io.File[] getObbDirs();
    public abstract java.io.File getCacheDir();
    public abstract java.io.File getCodeCacheDir();
    public abstract java.io.File getExternalCacheDir();
    @android.annotation.SystemApi
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
    public void startActivityAsUser(android.content.Intent p0, android.os.UserHandle p1) {}
    public abstract void startActivity(android.content.Intent p0, android.os.Bundle p1);
    public void startActivityAsUser(android.content.Intent p0, android.os.Bundle p1, android.os.UserHandle p2) {}
    public void startActivityForResult(java.lang.String p0, android.content.Intent p1, int p2, android.os.Bundle p3) {}
    public boolean canStartActivityForResult() { return false; }
    public abstract void startActivities(android.content.Intent[] p0);
    public abstract void startActivities(android.content.Intent[] p0, android.os.Bundle p1);
    public int startActivitiesAsUser(android.content.Intent[] p0, android.os.Bundle p1, android.os.UserHandle p2) { return 0; }
    public abstract void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4) throws android.content.IntentSender.SendIntentException;
    public abstract void startIntentSender(android.content.IntentSender p0, android.content.Intent p1, int p2, int p3, int p4, android.os.Bundle p5) throws android.content.IntentSender.SendIntentException;
    public abstract void sendBroadcast(android.content.Intent p0);
    public abstract void sendBroadcast(android.content.Intent p0, java.lang.String p1);
    public void sendBroadcastMultiplePermissions(android.content.Intent p0, java.lang.String[] p1) {}
    public void sendBroadcastWithMultiplePermissions(android.content.Intent p0, java.lang.String[] p1) {}
    public abstract void sendBroadcastAsUserMultiplePermissions(android.content.Intent p0, android.os.UserHandle p1, java.lang.String[] p2);
    @android.annotation.SystemApi
    public abstract void sendBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2);
    public abstract void sendBroadcast(android.content.Intent p0, java.lang.String p1, int p2);
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1);
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6);
    @android.annotation.SystemApi
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, android.os.Bundle p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7);
    public abstract void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, int p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7);
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2);
    @android.annotation.SystemApi
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.os.Bundle p3);
    public abstract void sendBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3);
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7);
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.content.BroadcastReceiver p4, android.os.Handler p5, int p6, java.lang.String p7, android.os.Bundle p8);
    public abstract void sendOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, java.lang.String p2, int p3, android.os.Bundle p4, android.content.BroadcastReceiver p5, android.os.Handler p6, int p7, java.lang.String p8, android.os.Bundle p9);
    public void sendOrderedBroadcast(android.content.Intent p0, java.lang.String p1, java.lang.String p2, android.content.BroadcastReceiver p3, android.os.Handler p4, int p5, java.lang.String p6, android.os.Bundle p7) {}
    public void sendOrderedBroadcast(android.content.Intent p0, int p1, java.lang.String p2, java.lang.String p3, android.content.BroadcastReceiver p4, android.os.Handler p5, java.lang.String p6, android.os.Bundle p7, android.os.Bundle p8) {}
    @java.lang.Deprecated
    public abstract void sendStickyBroadcast(android.content.Intent p0);
    @java.lang.Deprecated
    public abstract void sendStickyOrderedBroadcast(android.content.Intent p0, android.content.BroadcastReceiver p1, android.os.Handler p2, int p3, java.lang.String p4, android.os.Bundle p5);
    @java.lang.Deprecated
    public abstract void removeStickyBroadcast(android.content.Intent p0);
    @java.lang.Deprecated
    public abstract void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    @java.lang.Deprecated
    public abstract void sendStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.os.Bundle p2);
    @java.lang.Deprecated
    public abstract void sendStickyOrderedBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1, android.content.BroadcastReceiver p2, android.os.Handler p3, int p4, java.lang.String p5, android.os.Bundle p6);
    @java.lang.Deprecated
    public abstract void removeStickyBroadcastAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1);
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, int p2);
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3);
    public abstract android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3, int p4);
    @android.annotation.SystemApi
    public android.content.Intent registerReceiverForAllUsers(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3) { return null; }
    public abstract android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4);
    public abstract void unregisterReceiver(android.content.BroadcastReceiver p0);
    public abstract android.content.ComponentName startService(android.content.Intent p0);
    public abstract android.content.ComponentName startForegroundService(android.content.Intent p0);
    public abstract android.content.ComponentName startForegroundServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract boolean stopService(android.content.Intent p0);
    public abstract android.content.ComponentName startServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract boolean stopServiceAsUser(android.content.Intent p0, android.os.UserHandle p1);
    public abstract boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, int p2);
    public boolean bindService(android.content.Intent p0, int p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindIsolatedService(android.content.Intent p0, int p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.UserHandle p3) { return false; }
    public boolean bindServiceAsUser(android.content.Intent p0, android.content.ServiceConnection p1, int p2, android.os.Handler p3, android.os.UserHandle p4) { return false; }
    public void updateServiceGroup(android.content.ServiceConnection p0, int p1, int p2) {}
    public abstract void unbindService(android.content.ServiceConnection p0);
    public abstract boolean startInstrumentation(android.content.ComponentName p0, java.lang.String p1, android.os.Bundle p2);
    public abstract java.lang.Object getSystemService(java.lang.String p0);
    public final <T extends java.lang.Object> T getSystemService(java.lang.Class<T> p0) { return null; }
    public abstract java.lang.String getSystemServiceName(java.lang.Class<?> p0);
    public abstract int checkPermission(java.lang.String p0, int p1, int p2);
    public abstract int checkPermission(java.lang.String p0, int p1, int p2, android.os.IBinder p3);
    public abstract int checkCallingPermission(java.lang.String p0);
    public abstract int checkCallingOrSelfPermission(java.lang.String p0);
    public abstract int checkSelfPermission(java.lang.String p0);
    public abstract void enforcePermission(java.lang.String p0, int p1, int p2, java.lang.String p3);
    public abstract void enforceCallingPermission(java.lang.String p0, java.lang.String p1);
    public abstract void enforceCallingOrSelfPermission(java.lang.String p0, java.lang.String p1);
    public abstract void grantUriPermission(java.lang.String p0, android.net.Uri p1, int p2);
    public abstract void revokeUriPermission(android.net.Uri p0, int p1);
    public abstract void revokeUriPermission(java.lang.String p0, android.net.Uri p1, int p2);
    public abstract int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3);
    public abstract int checkUriPermission(android.net.Uri p0, int p1, int p2, int p3, android.os.IBinder p4);
    public abstract int checkCallingUriPermission(android.net.Uri p0, int p1);
    public abstract int checkCallingOrSelfUriPermission(android.net.Uri p0, int p1);
    public abstract int checkUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5);
    public abstract void enforceUriPermission(android.net.Uri p0, int p1, int p2, int p3, java.lang.String p4);
    public abstract void enforceCallingUriPermission(android.net.Uri p0, int p1, java.lang.String p2);
    public abstract void enforceCallingOrSelfUriPermission(android.net.Uri p0, int p1, java.lang.String p2);
    public abstract void enforceUriPermission(android.net.Uri p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6);
    public abstract android.content.Context createPackageContext(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    @android.annotation.SystemApi
    public android.content.Context createPackageContextAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    public android.content.Context createContextAsUser(android.os.UserHandle p0, int p1) { return null; }
    public abstract android.content.Context createApplicationContext(android.content.pm.ApplicationInfo p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract android.content.Context createContextForSplit(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException;
    public android.os.UserHandle getUser() { return null; }
    public int getUserId() { return 0; }
    public abstract android.content.Context createConfigurationContext(android.content.res.Configuration p0);
    public abstract android.content.Context createDisplayContext(android.view.Display p0);
    public android.content.Context createWindowContext(int p0, android.os.Bundle p1) { return null; }
    public android.content.Context createAttributionContext(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public android.content.Context createFeatureContext(java.lang.String p0) { return null; }
    public abstract android.content.Context createDeviceProtectedStorageContext();
    @android.annotation.SystemApi
    public abstract android.content.Context createCredentialProtectedStorageContext();
    public abstract android.view.DisplayAdjustments getDisplayAdjustments(int p0);
    public android.view.Display getDisplay() { return null; }
    public android.view.Display getDisplayNoVerify() { return null; }
    public abstract int getDisplayId();
    public abstract void updateDisplay(int p0);
    public boolean isRestricted() { return false; }
    public abstract boolean isDeviceProtectedStorage();
    @android.annotation.SystemApi
    public abstract boolean isCredentialProtectedStorage();
    public abstract boolean canLoadUnsafeResources();
    public android.os.IBinder getActivityToken() { return null; }
    public android.app.IServiceConnection getServiceDispatcher(android.content.ServiceConnection p0, android.os.Handler p1, int p2) { return null; }
    public android.app.IApplicationThread getIApplicationThread() { return null; }
    public android.os.Handler getMainThreadHandler() { return null; }
    public android.view.autofill.AutofillManager.AutofillClient getAutofillClient() { return null; }
    public void setAutofillClient(android.view.autofill.AutofillManager.AutofillClient p0) {}
    public android.view.contentcapture.ContentCaptureManager.ContentCaptureClient getContentCaptureClient() { return null; }
    public final boolean isAutofillCompatibilityEnabled() { return false; }
    public android.content.AutofillOptions getAutofillOptions() { return null; }
    public void setAutofillOptions(android.content.AutofillOptions p0) {}
    public android.content.ContentCaptureOptions getContentCaptureOptions() { return null; }
    public void setContentCaptureOptions(android.content.ContentCaptureOptions p0) {}
    public void assertRuntimeOverlayThemable() {}
    public boolean isUiContext() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BindServiceFlags {
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
    public static @interface PreferencesMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RegisterReceiverFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceName {
    }
}
