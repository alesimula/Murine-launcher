package android.app.wearable;

@android.annotation.SystemApi
public class WearableSensingManager {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    public static final java.lang.String EXTRA_WEARABLE_SENSING_DATA_REQUEST = "android.app.wearable.extra.WEARABLE_SENSING_DATA_REQUEST";
    public static final int CONNECTION_ID_INVALID = -1;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    @java.lang.Deprecated
    public static final int STATUS_UNSUPPORTED = 2;
    public static final int STATUS_SERVICE_UNAVAILABLE = 3;
    public static final int STATUS_WEARABLE_UNAVAILABLE = 4;
    public static final int STATUS_ACCESS_DENIED = 5;
    public static final int STATUS_UNSUPPORTED_OPERATION = 6;
    public static final int STATUS_CHANNEL_ERROR = 7;
    public static final int STATUS_UNSUPPORTED_DATA_TYPE = 8;
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    public static final int STATUS_MAX_CONCURRENT_CONNECTIONS_EXCEEDED = 9;
    static final long ALLOW_WEARABLE_SENSING_SERVICE_FILE_READ = 330701114L;
    @android.annotation.Nullable
    public static android.app.wearable.WearableSensingDataRequest getDataRequestFromIntent(android.content.Intent p0) { return null; }
    public WearableSensingManager(android.content.Context p0, android.app.wearable.IWearableSensingManager p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    public int getAvailableConnectionCount() { return 0; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideConnection(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    public void provideConnection(android.app.wearable.WearableConnection p0, java.util.concurrent.Executor p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    public void removeConnection(android.app.wearable.WearableConnection p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    @android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
    public void removeAllConnections() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    @android.annotation.FlaggedApi("android.app.wearable.enable_provide_read_only_pfd")
    public void provideReadOnlyParcelFileDescriptor(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideDataStream(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void registerDataRequestObserver(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void unregisterDataRequestObserver(int p0, android.app.PendingIntent p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void startHotwordRecognition(android.content.ComponentName p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.FlaggedApi("android.app.wearable.enable_hotword_wearable_sensing_api")
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void stopHotwordRecognition(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusCode {
    }
}
