package android.bluetooth.le;

public abstract class PeriodicAdvertisingCallback {
    public static final int SYNC_SUCCESS = 0;
    public static final int SYNC_NO_RESPONSE = 1;
    public static final int SYNC_NO_RESOURCES = 2;
    public PeriodicAdvertisingCallback() {}
    public void onSyncEstablished(int p0, android.bluetooth.BluetoothDevice p1, int p2, int p3, int p4, int p5) {}
    public void onPeriodicAdvertisingReport(android.bluetooth.le.PeriodicAdvertisingReport p0) {}
    public void onSyncLost(int p0) {}
}
