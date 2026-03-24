package android.bluetooth.le;

public final class BluetoothLeAdvertiser {
    private static final java.lang.String TAG = "BluetoothLeAdvertiser";
    private static final int MAX_ADVERTISING_DATA_BYTES = 1650;
    private static final int MAX_LEGACY_ADVERTISING_DATA_BYTES = 31;
    private static final int OVERHEAD_BYTES_PER_FIELD = 2;
    private static final int FLAGS_FIELD_BYTES = 3;
    private static final int MANUFACTURER_SPECIFIC_DATA_LENGTH = 2;
    private final android.bluetooth.IBluetoothManager mBluetoothManager = null;
    private final android.os.Handler mHandler = null;
    private android.bluetooth.BluetoothAdapter mBluetoothAdapter;
    private final java.util.Map<android.bluetooth.le.AdvertiseCallback, android.bluetooth.le.AdvertisingSetCallback> mLegacyAdvertisers = null;
    private final java.util.Map<android.bluetooth.le.AdvertisingSetCallback, android.bluetooth.le.IAdvertisingSetCallback> mCallbackWrappers = null;
    private final java.util.Map<java.lang.Integer, android.bluetooth.le.AdvertisingSet> mAdvertisingSets = null;
    public BluetoothLeAdvertiser(android.bluetooth.IBluetoothManager p0) {}
    public void startAdvertising(android.bluetooth.le.AdvertiseSettings p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseCallback p2) {}
    public void startAdvertising(android.bluetooth.le.AdvertiseSettings p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.AdvertiseCallback p3) {}
    android.bluetooth.le.AdvertisingSetCallback wrapOldCallback(android.bluetooth.le.AdvertiseCallback p0, android.bluetooth.le.AdvertiseSettings p1) { return null; }
    public void stopAdvertising(android.bluetooth.le.AdvertiseCallback p0) {}
    public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, android.bluetooth.le.AdvertisingSetCallback p5) {}
    public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, android.bluetooth.le.AdvertisingSetCallback p5, android.os.Handler p6) {}
    public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, int p5, int p6, android.bluetooth.le.AdvertisingSetCallback p7) {}
    public void startAdvertisingSet(android.bluetooth.le.AdvertisingSetParameters p0, android.bluetooth.le.AdvertiseData p1, android.bluetooth.le.AdvertiseData p2, android.bluetooth.le.PeriodicAdvertisingParameters p3, android.bluetooth.le.AdvertiseData p4, int p5, int p6, android.bluetooth.le.AdvertisingSetCallback p7, android.os.Handler p8) {}
    public void stopAdvertisingSet(android.bluetooth.le.AdvertisingSetCallback p0) {}
    public void cleanup() {}
    private int totalBytes(android.bluetooth.le.AdvertiseData p0, boolean p1) { return 0; }
    private int byteLength(byte[] p0) { return 0; }
    android.bluetooth.le.IAdvertisingSetCallback wrap(android.bluetooth.le.AdvertisingSetCallback p0, android.os.Handler p1) { return null; }
    private void postStartSetFailure(android.os.Handler p0, android.bluetooth.le.AdvertisingSetCallback p1, int p2) {}
    private void postStartFailure(android.bluetooth.le.AdvertiseCallback p0, int p1) {}
    private void postStartSuccess(android.bluetooth.le.AdvertiseCallback p0, android.bluetooth.le.AdvertiseSettings p1) {}
}
