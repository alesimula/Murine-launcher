package android.app.wearable;

@android.annotation.SystemApi
public class WearableSensingManager {
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.wearable.WearableSensingStatusBundleKey";
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNSUPPORTED = 2;
    public static final int STATUS_SERVICE_UNAVAILABLE = 3;
    public static final int STATUS_WEARABLE_UNAVAILABLE = 4;
    public static final int STATUS_ACCESS_DENIED = 5;
    public WearableSensingManager(android.content.Context p0, android.app.wearable.IWearableSensingManager p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideDataStream(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_WEARABLE_SENSING_SERVICE")
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}

    public static @interface StatusCode {
    }
}
