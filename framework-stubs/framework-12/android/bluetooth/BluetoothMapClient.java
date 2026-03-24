package android.bluetooth;

@android.annotation.SystemApi
public final class BluetoothMapClient implements android.bluetooth.BluetoothProfile {
    private static final java.lang.String TAG = "BluetoothMapClient";
    private static final boolean DBG = Boolean.valueOf(false);
    private static final boolean VDBG = Boolean.valueOf(false);
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.mapmce.profile.action.CONNECTION_STATE_CHANGED";
    @android.annotation.RequiresPermission("android.permission.RECEIVE_SMS")
    public static final java.lang.String ACTION_MESSAGE_RECEIVED = "android.bluetooth.mapmce.profile.action.MESSAGE_RECEIVED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_MESSAGE_SENT_SUCCESSFULLY = "android.bluetooth.mapmce.profile.action.MESSAGE_SENT_SUCCESSFULLY";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_MESSAGE_DELIVERED_SUCCESSFULLY = "android.bluetooth.mapmce.profile.action.MESSAGE_DELIVERED_SUCCESSFULLY";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_MESSAGE_READ_STATUS_CHANGED = "android.bluetooth.mapmce.profile.action.MESSAGE_READ_STATUS_CHANGED";
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public static final java.lang.String ACTION_MESSAGE_DELETED_STATUS_CHANGED = "android.bluetooth.mapmce.profile.action.MESSAGE_DELETED_STATUS_CHANGED";
    public static final java.lang.String EXTRA_MESSAGE_HANDLE = "android.bluetooth.mapmce.profile.extra.MESSAGE_HANDLE";
    public static final java.lang.String EXTRA_MESSAGE_TIMESTAMP = "android.bluetooth.mapmce.profile.extra.MESSAGE_TIMESTAMP";
    public static final java.lang.String EXTRA_MESSAGE_READ_STATUS = "android.bluetooth.mapmce.profile.extra.MESSAGE_READ_STATUS";
    public static final java.lang.String EXTRA_SENDER_CONTACT_URI = "android.bluetooth.mapmce.profile.extra.SENDER_CONTACT_URI";
    public static final java.lang.String EXTRA_SENDER_CONTACT_NAME = "android.bluetooth.mapmce.profile.extra.SENDER_CONTACT_NAME";
    public static final java.lang.String EXTRA_MESSAGE_DELETED_STATUS = "android.bluetooth.mapmce.profile.extra.MESSAGE_DELETED_STATUS";
    public static final java.lang.String EXTRA_RESULT_CODE = "android.bluetooth.device.extra.RESULT_CODE";
    public static final int STATE_ERROR = -1;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_CANCELED = 2;
    private static final int UPLOADING_FEATURE_BITMASK = 8;
    public static final int UNREAD = 0;
    public static final int READ = 1;
    public static final int UNDELETED = 2;
    public static final int DELETED = 3;
    private final android.bluetooth.BluetoothAdapter mAdapter = null;
    private final android.content.AttributionSource mAttributionSource = null;
    private final android.bluetooth.BluetoothProfileConnector<android.bluetooth.IBluetoothMapClient> mProfileConnector = null;
    BluetoothMapClient(android.content.Context p0, android.bluetooth.BluetoothProfile.ServiceListener p1, android.bluetooth.BluetoothAdapter p2) {}
    public void close() {}
    private android.bluetooth.IBluetoothMapClient getService() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isConnected(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean connect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getPriority(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.SEND_SMS"})
    public boolean sendMessage(android.bluetooth.BluetoothDevice p0, java.util.Collection<android.net.Uri> p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.SEND_SMS"})
    public boolean sendMessage(android.bluetooth.BluetoothDevice p0, android.net.Uri[] p1, java.lang.String p2, android.app.PendingIntent p3, android.app.PendingIntent p4) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.READ_SMS"})
    public boolean getUnreadMessages(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isUploadingSupported(android.bluetooth.BluetoothDevice p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.READ_SMS"})
    public boolean setMessageStatus(android.bluetooth.BluetoothDevice p0, java.lang.String p1, int p2) { return false; }
    private boolean isEnabled() { return false; }
    private static boolean isValidDevice(android.bluetooth.BluetoothDevice p0) { return false; }
}
