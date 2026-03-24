package android.bluetooth;

public final class BluetoothSocket implements java.io.Closeable {
    public static final int TYPE_L2CAP = 3;
    public static final int TYPE_RFCOMM = 1;
    public static final int TYPE_SCO = 2;
    BluetoothSocket() {}
    public void close() throws java.io.IOException {}
    public void connect() throws java.io.IOException {}
    public int getConnectionType() { return 0; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    public int getMaxReceivePacketSize() { return 0; }
    public int getMaxTransmitPacketSize() { return 0; }
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothDevice getRemoteDevice() { return null; }
    public boolean isConnected() { return false; }
    public int getL2capLocalChannelId() throws java.io.IOException { return 0; }
    public int getL2capRemoteChannelId() throws java.io.IOException { return 0; }
}
