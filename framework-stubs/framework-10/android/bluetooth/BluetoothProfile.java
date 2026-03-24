package android.bluetooth;

public interface BluetoothProfile {
    public static final java.lang.String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";
    public static final java.lang.String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_DISCONNECTING = 3;
    public static final int HEADSET = 1;
    public static final int A2DP = 2;
    @java.lang.Deprecated
    public static final int HEALTH = 3;
    public static final int HID_HOST = 4;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final int PAN = 5;
    public static final int PBAP = 6;
    public static final int GATT = 7;
    public static final int GATT_SERVER = 8;
    public static final int MAP = 9;
    public static final int SAP = 10;
    @android.annotation.UnsupportedAppUsage
    public static final int A2DP_SINK = 11;
    @android.annotation.UnsupportedAppUsage
    public static final int AVRCP_CONTROLLER = 12;
    public static final int AVRCP = 13;
    public static final int HEADSET_CLIENT = 16;
    public static final int PBAP_CLIENT = 17;
    public static final int MAP_CLIENT = 18;
    public static final int HID_DEVICE = 19;
    public static final int OPP = 20;
    public static final int HEARING_AID = 21;
    public static final int MAX_PROFILE_ID = 21;
    @android.annotation.UnsupportedAppUsage
    public static final int PRIORITY_AUTO_CONNECT = 1000;
    @android.annotation.SystemApi
    public static final int PRIORITY_ON = 100;
    @android.annotation.SystemApi
    public static final int PRIORITY_OFF = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int PRIORITY_UNDEFINED = -1;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices();
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0);
    public int getConnectionState(android.bluetooth.BluetoothDevice p0);
    public static java.lang.String getConnectionStateName(int p0) { return null; }

    public static interface ServiceListener {
        public void onServiceConnected(int p0, android.bluetooth.BluetoothProfile p1);
        public void onServiceDisconnected(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BtProfileState {
    }
}
