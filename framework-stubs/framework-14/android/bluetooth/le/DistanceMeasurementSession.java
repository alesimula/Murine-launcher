package android.bluetooth.le;

public final class DistanceMeasurementSession {
    DistanceMeasurementSession() {}
    public int stopSession() { return 0; }

    public static interface Callback {
        public void onStarted(android.bluetooth.le.DistanceMeasurementSession p0);
        public void onStartFail(int p0);
        public void onStopped(android.bluetooth.le.DistanceMeasurementSession p0, int p1);
        public void onResult(android.bluetooth.BluetoothDevice p0, android.bluetooth.le.DistanceMeasurementResult p1);
    }
}
