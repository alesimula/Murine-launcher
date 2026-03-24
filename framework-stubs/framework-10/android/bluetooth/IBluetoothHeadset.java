package android.bluetooth;

public interface IBluetoothHeadset extends android.os.IInterface {
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isAudioOn() throws android.os.RemoteException;
    public boolean connectAudio() throws android.os.RemoteException;
    public boolean disconnectAudio() throws android.os.RemoteException;
    public void setAudioRouteAllowed(boolean p0) throws android.os.RemoteException;
    public boolean getAudioRouteAllowed() throws android.os.RemoteException;
    public void setForceScoAudio(boolean p0) throws android.os.RemoteException;
    public boolean startScoUsingVirtualVoiceCall() throws android.os.RemoteException;
    public boolean stopScoUsingVirtualVoiceCall() throws android.os.RemoteException;
    public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException;
    public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException;
    public boolean isInbandRingingEnabled() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadset {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadset";
        static final int TRANSACTION_getConnectedDevices = 1;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 2;
        static final int TRANSACTION_getConnectionState = 3;
        static final int TRANSACTION_startVoiceRecognition = 4;
        static final int TRANSACTION_stopVoiceRecognition = 5;
        static final int TRANSACTION_isAudioConnected = 6;
        static final int TRANSACTION_sendVendorSpecificResultCode = 7;
        static final int TRANSACTION_connect = 8;
        static final int TRANSACTION_disconnect = 9;
        static final int TRANSACTION_setPriority = 10;
        static final int TRANSACTION_getPriority = 11;
        static final int TRANSACTION_getAudioState = 12;
        static final int TRANSACTION_isAudioOn = 13;
        static final int TRANSACTION_connectAudio = 14;
        static final int TRANSACTION_disconnectAudio = 15;
        static final int TRANSACTION_setAudioRouteAllowed = 16;
        static final int TRANSACTION_getAudioRouteAllowed = 17;
        static final int TRANSACTION_setForceScoAudio = 18;
        static final int TRANSACTION_startScoUsingVirtualVoiceCall = 19;
        static final int TRANSACTION_stopScoUsingVirtualVoiceCall = 20;
        static final int TRANSACTION_phoneStateChanged = 21;
        static final int TRANSACTION_clccResponse = 22;
        static final int TRANSACTION_setActiveDevice = 23;
        static final int TRANSACTION_getActiveDevice = 24;
        static final int TRANSACTION_isInbandRingingEnabled = 25;
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
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean isAudioOn() throws android.os.RemoteException { return false; }
            public boolean connectAudio() throws android.os.RemoteException { return false; }
            public boolean disconnectAudio() throws android.os.RemoteException { return false; }
            public void setAudioRouteAllowed(boolean p0) throws android.os.RemoteException {}
            public boolean getAudioRouteAllowed() throws android.os.RemoteException { return false; }
            public void setForceScoAudio(boolean p0) throws android.os.RemoteException {}
            public boolean startScoUsingVirtualVoiceCall() throws android.os.RemoteException { return false; }
            public boolean stopScoUsingVirtualVoiceCall() throws android.os.RemoteException { return false; }
            public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
            public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException { return null; }
            public boolean isInbandRingingEnabled() throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.bluetooth.IBluetoothHeadset {
        public Default() {}
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean isAudioConnected(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean sendVendorSpecificResultCode(android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean isAudioOn() throws android.os.RemoteException { return false; }
        public boolean connectAudio() throws android.os.RemoteException { return false; }
        public boolean disconnectAudio() throws android.os.RemoteException { return false; }
        public void setAudioRouteAllowed(boolean p0) throws android.os.RemoteException {}
        public boolean getAudioRouteAllowed() throws android.os.RemoteException { return false; }
        public void setForceScoAudio(boolean p0) throws android.os.RemoteException {}
        public boolean startScoUsingVirtualVoiceCall() throws android.os.RemoteException { return false; }
        public boolean stopScoUsingVirtualVoiceCall() throws android.os.RemoteException { return false; }
        public void phoneStateChanged(int p0, int p1, int p2, java.lang.String p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void clccResponse(int p0, int p1, int p2, int p3, boolean p4, java.lang.String p5, int p6) throws android.os.RemoteException {}
        public boolean setActiveDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothDevice getActiveDevice() throws android.os.RemoteException { return null; }
        public boolean isInbandRingingEnabled() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
