package android.bluetooth;

final class BluetoothInputStream extends java.io.InputStream {
    private android.bluetooth.BluetoothSocket mSocket;
    BluetoothInputStream(android.bluetooth.BluetoothSocket p0) { super(); }
    public int available() throws java.io.IOException { return 0; }
    public void close() throws java.io.IOException {}
    public int read() throws java.io.IOException { return 0; }
    public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
}
