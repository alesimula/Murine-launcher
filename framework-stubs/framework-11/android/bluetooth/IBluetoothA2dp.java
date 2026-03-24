package android.bluetooth;

public interface IBluetoothA2dp extends android.os.IInterface {
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException;
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException;
    public void setAvrcpAbsoluteVolume(int p0) throws android.os.RemoteException;
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) throws android.os.RemoteException;
    public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothA2dp {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException { return null; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException { return false; }
        public void setAvrcpAbsoluteVolume(int p0) throws android.os.RemoteException {}
        public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) throws android.os.RemoteException {}
        public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
        public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothA2dp {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothA2dp";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getConnectedDevices = 3;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
        static final int TRANSACTION_getConnectionState = 5;
        static final int TRANSACTION_setActiveDevice = 6;
        static final int TRANSACTION_getActiveDevice = 7;
        static final int TRANSACTION_setConnectionPolicy = 8;
        static final int TRANSACTION_getConnectionPolicy = 9;
        static final int TRANSACTION_isAvrcpAbsoluteVolumeSupported = 10;
        static final int TRANSACTION_setAvrcpAbsoluteVolume = 11;
        static final int TRANSACTION_isA2dpPlaying = 12;
        static final int TRANSACTION_getCodecStatus = 13;
        static final int TRANSACTION_setCodecConfigPreference = 14;
        static final int TRANSACTION_enableOptionalCodecs = 15;
        static final int TRANSACTION_disableOptionalCodecs = 16;
        static final int TRANSACTION_supportsOptionalCodecs = 17;
        static final int TRANSACTION_getOptionalCodecsEnabled = 18;
        static final int TRANSACTION_setOptionalCodecsEnabled = 19;
        static final int TRANSACTION_getPriority = 20;
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
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException { return null; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean isAvrcpAbsoluteVolumeSupported() throws android.os.RemoteException { return false; }
            public void setAvrcpAbsoluteVolume(int p0) throws android.os.RemoteException {}
            public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothCodecStatus getCodecStatus(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public void setCodecConfigPreference(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothCodecConfig p1) throws android.os.RemoteException {}
            public void enableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
            public void disableOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
            public int supportsOptionalCodecs(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public void setOptionalCodecsEnabled(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
            public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        }
    }
}
