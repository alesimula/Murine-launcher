package android.bluetooth;

public final class BluetoothMapClient implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothMapClient";
    private static final boolean DBG = Boolean.valueOf(false);
    private static final boolean VDBG = Boolean.valueOf(false);
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.mapmce.profile.action.CONNECTION_STATE_CHANGED";
    public static final java.lang.String ACTION_MESSAGE_RECEIVED = "android.bluetooth.mapmce.profile.action.MESSAGE_RECEIVED";
    public static final java.lang.String ACTION_MESSAGE_SENT_SUCCESSFULLY = "android.bluetooth.mapmce.profile.action.MESSAGE_SENT_SUCCESSFULLY";
    public static final java.lang.String ACTION_MESSAGE_DELIVERED_SUCCESSFULLY = "android.bluetooth.mapmce.profile.action.MESSAGE_DELIVERED_SUCCESSFULLY";
    public static final java.lang.String EXTRA_MESSAGE_HANDLE = "android.bluetooth.mapmce.profile.extra.MESSAGE_HANDLE";
    public static final java.lang.String EXTRA_MESSAGE_TIMESTAMP = "android.bluetooth.mapmce.profile.extra.MESSAGE_TIMESTAMP";
    public static final java.lang.String EXTRA_MESSAGE_READ_STATUS = "android.bluetooth.mapmce.profile.extra.MESSAGE_READ_STATUS";
    public static final java.lang.String EXTRA_SENDER_CONTACT_URI = "android.bluetooth.mapmce.profile.extra.SENDER_CONTACT_URI";
    public static final java.lang.String EXTRA_SENDER_CONTACT_NAME = "android.bluetooth.mapmce.profile.extra.SENDER_CONTACT_NAME";
    public static final int STATE_ERROR = -1;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private static final int UPLOADING_FEATURE_BITMASK = 8;
    private android.bluetooth.BluetoothAdapter mAdapter;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothMapClient> mProfileConnector = null;
    BluetoothMapClient(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    private android.bluetooth.IBluetoothMapClient getService() { return null; }
    public boolean isConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.SystemApi
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    public boolean sendMessage(android.bluetooth.BluetoothDevice p0, android.net.Uri[] p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) { return false; }
    public boolean getUnreadMessages(android.bluetooth.BluetoothDevice p0) { return false; }
    public boolean isUploadingSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
}
