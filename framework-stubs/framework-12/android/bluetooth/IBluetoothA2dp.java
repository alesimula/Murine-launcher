package android.bluetooth;

public interface IBluetoothA2dp extends android.os.IInterface {
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStatesWithAttribution(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setAvrcpAbsoluteVolume(int p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getDynamicBufferSupport(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public android.bluetooth.BufferConstraints getBufferConstraints(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public boolean setBufferLengthMillis(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothA2dp {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStatesWithAttribution(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException { return false; }
        public void setAvrcpAbsoluteVolume(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public int getDynamicBufferSupport(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BufferConstraints getBufferConstraints(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean setBufferLengthMillis(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothA2dp {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothA2dp";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_connectWithAttribution = 2;
        static final int TRANSACTION_disconnect = 3;
        static final int TRANSACTION_disconnectWithAttribution = 4;
        static final int TRANSACTION_getConnectedDevices = 5;
        static final int TRANSACTION_getConnectedDevicesWithAttribution = 6;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 7;
        static final int TRANSACTION_getDevicesMatchingConnectionStatesWithAttribution = 8;
        static final int TRANSACTION_getConnectionState = 9;
        static final int TRANSACTION_getConnectionStateWithAttribution = 10;
        static final int TRANSACTION_setActiveDevice = 11;
        static final int TRANSACTION_getActiveDevice = 12;
        static final int TRANSACTION_setConnectionPolicy = 13;
        static final int TRANSACTION_getConnectionPolicy = 14;
        static final int TRANSACTION_isAvrcpAbsoluteVolumeSupported = 15;
        static final int TRANSACTION_setAvrcpAbsoluteVolume = 16;
        static final int TRANSACTION_isA2dpPlaying = 17;
        static final int TRANSACTION_getCodecStatus = 18;
        static final int TRANSACTION_setCodecConfigPreference = 19;
        static final int TRANSACTION_enableOptionalCodecs = 20;
        static final int TRANSACTION_disableOptionalCodecs = 21;
        static final int TRANSACTION_supportsOptionalCodecs = 22;
        static final int TRANSACTION_getOptionalCodecsEnabled = 23;
        static final int TRANSACTION_setOptionalCodecsEnabled = 24;
        static final int TRANSACTION_getDynamicBufferSupport = 25;
        static final int TRANSACTION_getBufferConstraints = 26;
        static final int TRANSACTION_setBufferLengthMillis = 27;
        static final int TRANSACTION_getPriority = 28;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothA2dp asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothA2dp p0) { return false; }
        public static android.bluetooth.IBluetoothA2dp getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothA2dp {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothA2dp sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStatesWithAttribution(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException { return false; }
            public void setAvrcpAbsoluteVolume(int p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public int getDynamicBufferSupport(android.content.AttributionSource p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BufferConstraints getBufferConstraints(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean setBufferLengthMillis(int p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        }
    }
}
