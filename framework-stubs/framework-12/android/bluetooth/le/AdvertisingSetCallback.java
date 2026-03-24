package android.bluetooth.le;

public abstract class AdvertisingSetCallback {
    public static final int ADVERTISE_SUCCESS = 0;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
    public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
    public AdvertisingSetCallback() {}
    public void onAdvertisingSetStarted(android.bluetooth.le.AdvertisingSet p0, int p1, int p2) {}
    public void onAdvertisingSetStopped(android.bluetooth.le.AdvertisingSet p0) {}
    public void onAdvertisingEnabled(android.bluetooth.le.AdvertisingSet p0, boolean p1, int p2) {}
    public void onAdvertisingDataSet(android.bluetooth.le.AdvertisingSet p0, int p1) {}
    public void onScanResponseDataSet(android.bluetooth.le.AdvertisingSet p0, int p1) {}
    public void onAdvertisingParametersUpdated(android.bluetooth.le.AdvertisingSet p0, int p1, int p2) {}
    public void onPeriodicAdvertisingParametersUpdated(android.bluetooth.le.AdvertisingSet p0, int p1) {}
    public void onPeriodicAdvertisingDataSet(android.bluetooth.le.AdvertisingSet p0, int p1) {}
    public void onPeriodicAdvertisingEnabled(android.bluetooth.le.AdvertisingSet p0, boolean p1, int p2) {}
    public void onOwnAddressRead(android.bluetooth.le.AdvertisingSet p0, int p1, java.lang.String p2) {}
}
