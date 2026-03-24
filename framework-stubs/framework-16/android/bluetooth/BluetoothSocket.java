package android.bluetooth;

public final class BluetoothSocket implements java.io.Closeable {
    public static final int TYPE_L2CAP = 3;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public static final int TYPE_LE = 4;
    public static final int TYPE_RFCOMM = 1;
    public static final int TYPE_SCO = 2;
    BluetoothSocket() {}
    public void close() throws java.io.IOException {}
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public void connect() throws java.io.IOException {}
    public int getConnectionType() { return 0; }
    public java.io.InputStream getInputStream() throws java.io.IOException { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.bt_socket_api_l2cap_cid")
    public int getL2capLocalChannelId() throws java.io.IOException { return 0; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.bt_socket_api_l2cap_cid")
    public int getL2capRemoteChannelId() throws java.io.IOException { return 0; }
    public int getMaxReceivePacketSize() { return 0; }
    public int getMaxTransmitPacketSize() { return 0; }
    public java.io.OutputStream getOutputStream() throws java.io.IOException { return null; }
    public android.bluetooth.BluetoothDevice getRemoteDevice() { return null; }
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.socket_settings_api")
    public long getSocketId() throws java.io.IOException { return 0L; }
    public boolean isConnected() { return false; }
}
