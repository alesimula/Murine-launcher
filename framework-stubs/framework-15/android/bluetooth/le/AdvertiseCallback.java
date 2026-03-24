package android.bluetooth.le;

public abstract class AdvertiseCallback {
    public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
    public AdvertiseCallback() {}
    public void onStartFailure(int p0) {}
    public void onStartSuccess(android.bluetooth.le.AdvertiseSettings p0) {}
}
