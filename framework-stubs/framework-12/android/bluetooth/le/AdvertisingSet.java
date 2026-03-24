package android.bluetooth.le;

public final class AdvertisingSet {
    private static final java.lang.String TAG = "AdvertisingSet";
    private final android.bluetooth.IBluetoothGatt mGatt = null;
    private int mAdvertiserId;
    private android.content.AttributionSource mAttributionSource;
    AdvertisingSet(int p0, android.bluetooth.IBluetoothManager p1, android.content.AttributionSource p2) {}
    void setAdvertiserId(int p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void enableAdvertising(boolean p0, int p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setAdvertisingData(android.bluetooth.le.AdvertiseData p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setScanResponseData(android.bluetooth.le.AdvertiseData p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setAdvertisingParameters(android.bluetooth.le.AdvertisingSetParameters p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingParameters(android.bluetooth.le.PeriodicAdvertisingParameters p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingData(android.bluetooth.le.AdvertiseData p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_ADVERTISE")
    public void setPeriodicAdvertisingEnabled(boolean p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void getOwnAddress() {}
    @android.annotation.RequiresNoPermission
    public int getAdvertiserId() { return 0; }
}
