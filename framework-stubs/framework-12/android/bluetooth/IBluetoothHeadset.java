package android.bluetooth;

public interface IBluetoothHeadset extends android.os.IInterface {
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2, android.content.AttributionSource p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_PRIVILEGED"})
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getAudioState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isAudioOn(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean connectAudio(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean disconnectAudio(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setAudioRouteAllowed(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean getAudioRouteAllowed(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public void setForceScoAudio(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean startScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean stopScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.content.AttributionSource p6) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6, android.content.AttributionSource p7) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isInbandRingingEnabled(android.content.AttributionSource p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(allOf={"android.permission.BLUETOOTH_CONNECT", "android.permission.MODIFY_PHONE_STATE"})
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isNoiseReductionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    public boolean isVoiceRecognitionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothHeadset {
        public Default() {}
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2, android.content.AttributionSource p3) throws android.os.RemoteException { return false; }
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public int getAudioState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean isAudioOn(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean connectAudio(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean disconnectAudio(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public void setAudioRouteAllowed(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public boolean getAudioRouteAllowed(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public void setForceScoAudio(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
        public boolean startScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean stopScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
        public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6, android.content.AttributionSource p7) throws android.os.RemoteException {}
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
        public boolean isInbandRingingEnabled(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
        public boolean isNoiseReductionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public boolean isVoiceRecognitionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadset {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadset";
        static final int TRANSACTION_getConnectedDevices = 1;
        static final int TRANSACTION_getConnectedDevicesWithAttribution = 2;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 3;
        static final int TRANSACTION_getConnectionState = 4;
        static final int TRANSACTION_getConnectionStateWithAttribution = 5;
        static final int TRANSACTION_startVoiceRecognition = 6;
        static final int TRANSACTION_stopVoiceRecognition = 7;
        static final int TRANSACTION_isAudioConnected = 8;
        static final int TRANSACTION_sendVendorSpecificResultCode = 9;
        static final int TRANSACTION_connect = 10;
        static final int TRANSACTION_connectWithAttribution = 11;
        static final int TRANSACTION_disconnect = 12;
        static final int TRANSACTION_disconnectWithAttribution = 13;
        static final int TRANSACTION_setConnectionPolicy = 14;
        static final int TRANSACTION_getConnectionPolicy = 15;
        static final int TRANSACTION_getAudioState = 16;
        static final int TRANSACTION_isAudioOn = 17;
        static final int TRANSACTION_connectAudio = 18;
        static final int TRANSACTION_disconnectAudio = 19;
        static final int TRANSACTION_setAudioRouteAllowed = 20;
        static final int TRANSACTION_getAudioRouteAllowed = 21;
        static final int TRANSACTION_setForceScoAudio = 22;
        static final int TRANSACTION_startScoUsingVirtualVoiceCall = 23;
        static final int TRANSACTION_stopScoUsingVirtualVoiceCall = 24;
        static final int TRANSACTION_phoneStateChanged = 25;
        static final int TRANSACTION_clccResponse = 26;
        static final int TRANSACTION_setActiveDevice = 27;
        static final int TRANSACTION_getActiveDevice = 28;
        static final int TRANSACTION_isInbandRingingEnabled = 29;
        static final int TRANSACTION_setPriority = 30;
        static final int TRANSACTION_getPriority = 31;
        static final int TRANSACTION_isNoiseReductionSupported = 32;
        static final int TRANSACTION_isVoiceRecognitionSupported = 33;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHeadset asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHeadset p0) { return false; }
        public static android.bluetooth.IBluetoothHeadset getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHeadset {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHeadset sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevicesWithAttribution(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0, android.content.AttributionSource p1) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getConnectionStateWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2, android.content.AttributionSource p3) throws android.os.RemoteException { return false; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean connectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnectWithAttribution(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public int getAudioState(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean isAudioOn(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean connectAudio(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean disconnectAudio(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public void setAudioRouteAllowed(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public boolean getAudioRouteAllowed(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public void setForceScoAudio(boolean p0, android.content.AttributionSource p1) throws android.os.RemoteException {}
            public boolean startScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean stopScoUsingVirtualVoiceCall(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5, android.content.AttributionSource p6) throws android.os.RemoteException {}
            public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6, android.content.AttributionSource p7) throws android.os.RemoteException {}
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothDevice getActiveDevice(android.content.AttributionSource p0) throws android.os.RemoteException { return null; }
            public boolean isInbandRingingEnabled(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public int getPriority(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return 0; }
            public boolean isNoiseReductionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
            public boolean isVoiceRecognitionSupported(android.bluetooth.BluetoothDevice p0, android.content.AttributionSource p1) throws android.os.RemoteException { return false; }
        }
    }
}
