package android.bluetooth.le;

public final class AdvertisingSet {
    private static final java.lang.String TAG = "AdvertisingSet";
    private final android.bluetooth.IBluetoothGatt mGatt = null;
    private int mAdvertiserId;
    AdvertisingSet(int p0, android.bluetooth.IBluetoothManager p1) {}
    void setAdvertiserId(int p0) {}
    public void enableAdvertising(boolean p0, int p1, int p2) {}
    public void setAdvertisingData(android.bluetooth.le.AdvertiseData p0) {}
    public void setScanResponseData(android.bluetooth.le.AdvertiseData p0) {}
    public void setAdvertisingParameters(android.bluetooth.le.AdvertisingSetParameters p0) {}
    public void setPeriodicAdvertisingParameters(android.bluetooth.le.PeriodicAdvertisingParameters p0) {}
    public void setPeriodicAdvertisingData(android.bluetooth.le.AdvertiseData p0) {}
    public void setPeriodicAdvertisingEnabled(boolean p0) {}
    public void getOwnAddress() {}
    public int getAdvertiserId() { return 0; }
}
