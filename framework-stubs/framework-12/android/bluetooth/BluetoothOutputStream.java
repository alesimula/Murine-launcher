package android.bluetooth;

@android.annotation.SuppressLint("AndroidFrameworkBluetoothPermission")
final class BluetoothOutputStream extends java.io.OutputStream {
    private android.bluetooth.BluetoothSocket mSocket;
    BluetoothOutputStream(android.bluetooth.BluetoothSocket p0) { super(); }
    public void close() throws java.io.IOException {}
    public void write(int p0) throws java.io.IOException {}
    public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
}
