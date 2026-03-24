package android.content.pm;

public class ServiceInfo extends android.content.pm.ComponentInfo implements android.os.Parcelable {
    public java.lang.String permission;
    public static final int FLAG_STOP_WITH_TASK = 1;
    public static final int FLAG_ISOLATED_PROCESS = 2;
    public static final int FLAG_EXTERNAL_SERVICE = 4;
    public static final int FLAG_USE_APP_ZYGOTE = 8;
    public static final int FLAG_ALLOW_SHARED_ISOLATED_PROCESS = 16;
    public static final int FLAG_VISIBLE_TO_INSTANT_APP = 1048576;
    public static final int FLAG_SYSTEM_USER_ONLY = 536870912;
    public static final int FLAG_SINGLE_USER = 1073741824;
    public int flags;
    @java.lang.Deprecated
    public static final int FOREGROUND_SERVICE_TYPE_NONE = 0;
    @android.annotation.RequiresPermission(value="android.permission.FOREGROUND_SERVICE_DATA_SYNC", conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_DATA_SYNC = 1;
    @android.annotation.RequiresPermission(value="android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK", conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK = 2;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_PHONE_CALL", anyOf="android.permission.MANAGE_OWN_CALLS", conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_PHONE_CALL = 4;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_LOCATION", anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_LOCATION = 8;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE", anyOf={"android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.CHANGE_NETWORK_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.CHANGE_WIFI_MULTICAST_STATE", "android.permission.NFC", "android.permission.TRANSMIT_IR", "android.permission.UWB_RANGING"}, conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE = 16;
    @android.annotation.RequiresPermission(value="android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION", conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION = 32;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_CAMERA", anyOf="android.permission.CAMERA", conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_CAMERA = 64;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_MICROPHONE", anyOf={"android.permission.CAPTURE_AUDIO_OUTPUT", "android.permission.RECORD_AUDIO"}, conditional=true)
    public static final int FOREGROUND_SERVICE_TYPE_MICROPHONE = 128;
    @android.annotation.RequiresPermission(allOf="android.permission.FOREGROUND_SERVICE_HEALTH", anyOf={"android.permission.ACTIVITY_RECOGNITION", "android.permission.BODY_SENSORS", "android.permission.HIGH_SAMPLING_RATE_SENSORS"})
    public static final int FOREGROUND_SERVICE_TYPE_HEALTH = 256;
    @android.annotation.RequiresPermission("android.permission.FOREGROUND_SERVICE_REMOTE_MESSAGING")
    public static final int FOREGROUND_SERVICE_TYPE_REMOTE_MESSAGING = 512;
    @android.annotation.RequiresPermission("android.permission.FOREGROUND_SERVICE_SYSTEM_EXEMPTED")
    public static final int FOREGROUND_SERVICE_TYPE_SYSTEM_EXEMPTED = 1024;
    public static final int FOREGROUND_SERVICE_TYPE_SHORT_SERVICE = 2048;
    @android.annotation.RequiresPermission("android.permission.FOREGROUND_SERVICE_FILE_MANAGEMENT")
    public static final int FOREGROUND_SERVICE_TYPE_FILE_MANAGEMENT = 4096;
    @android.annotation.RequiresPermission("android.permission.FOREGROUND_SERVICE_MEDIA_PROCESSING")
    @android.annotation.FlaggedApi("android.content.pm.introduce_media_processing_type")
    public static final int FOREGROUND_SERVICE_TYPE_MEDIA_PROCESSING = 8192;
    @android.annotation.RequiresPermission("android.permission.FOREGROUND_SERVICE_SPECIAL_USE")
    public static final int FOREGROUND_SERVICE_TYPE_SPECIAL_USE = 1073741824;
    public static final int FOREGROUND_SERVICE_TYPES_MAX_INDEX = 30;
    public static final int FOREGROUND_SERVICE_TYPE_MANIFEST = -1;
    public int mForegroundServiceType;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.ServiceInfo> CREATOR = null;
    public ServiceInfo() { super(); }
    public ServiceInfo(android.content.pm.ServiceInfo p0) { super(); }
    public int getForegroundServiceType() { return 0; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    void dump(android.util.Printer p0, java.lang.String p1, int p2) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String foregroundServiceTypeToLabel(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServiceType {
    }
}
