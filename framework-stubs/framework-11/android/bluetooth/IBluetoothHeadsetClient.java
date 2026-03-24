package android.bluetooth;

public interface IBluetoothHeadsetClient extends android.os.IInterface {
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothHeadsetClientCall> getCurrentCalls(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.os.Bundle getCurrentAgEvents(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean acceptCall(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public boolean holdCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean rejectCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean terminateCall(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHeadsetClientCall p1) throws android.os.RemoteException;
    public boolean enterPrivateMode(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public boolean explicitCallTransfer(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothHeadsetClientCall dial(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean sendDTMF(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException;
    public boolean getLastVoiceTagNumber(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean connectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public void setAudioRouteAllowed(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException;
    public boolean getAudioRouteAllowed(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean sendVendorAtCommand(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.Bundle getCurrentAgFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothHeadsetClient {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothHeadsetClientCall> getCurrentCalls(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getCurrentAgEvents(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public boolean acceptCall(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public boolean holdCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean rejectCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean terminateCall(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHeadsetClientCall p1) throws android.os.RemoteException { return false; }
        public boolean enterPrivateMode(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public boolean explicitCallTransfer(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public android.bluetooth.BluetoothHeadsetClientCall dial(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean sendDTMF(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException { return false; }
        public boolean getLastVoiceTagNumber(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean connectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public void setAudioRouteAllowed(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAudioRouteAllowed(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean sendVendorAtCommand(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.os.Bundle getCurrentAgFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHeadsetClient {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHeadsetClient";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getConnectedDevices = 3;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
        static final int TRANSACTION_getConnectionState = 5;
        static final int TRANSACTION_setConnectionPolicy = 6;
        static final int TRANSACTION_getConnectionPolicy = 7;
        static final int TRANSACTION_startVoiceRecognition = 8;
        static final int TRANSACTION_stopVoiceRecognition = 9;
        static final int TRANSACTION_getCurrentCalls = 10;
        static final int TRANSACTION_getCurrentAgEvents = 11;
        static final int TRANSACTION_acceptCall = 12;
        static final int TRANSACTION_holdCall = 13;
        static final int TRANSACTION_rejectCall = 14;
        static final int TRANSACTION_terminateCall = 15;
        static final int TRANSACTION_enterPrivateMode = 16;
        static final int TRANSACTION_explicitCallTransfer = 17;
        static final int TRANSACTION_dial = 18;
        static final int TRANSACTION_sendDTMF = 19;
        static final int TRANSACTION_getLastVoiceTagNumber = 20;
        static final int TRANSACTION_getAudioState = 21;
        static final int TRANSACTION_connectAudio = 22;
        static final int TRANSACTION_disconnectAudio = 23;
        static final int TRANSACTION_setAudioRouteAllowed = 24;
        static final int TRANSACTION_getAudioRouteAllowed = 25;
        static final int TRANSACTION_sendVendorAtCommand = 26;
        static final int TRANSACTION_getCurrentAgFeatures = 27;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHeadsetClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHeadsetClient p0) { return false; }
        public static android.bluetooth.IBluetoothHeadsetClient getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHeadsetClient {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHeadsetClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean setConnectionPolicy(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getConnectionPolicy(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean startVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean stopVoiceRecognition(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothHeadsetClientCall> getCurrentCalls(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getCurrentAgEvents(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public boolean acceptCall(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public boolean holdCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean rejectCall(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean terminateCall(android.bluetooth.BluetoothDevice p0, android.bluetooth.BluetoothHeadsetClientCall p1) throws android.os.RemoteException { return false; }
            public boolean enterPrivateMode(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public boolean explicitCallTransfer(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public android.bluetooth.BluetoothHeadsetClientCall dial(android.bluetooth.BluetoothDevice p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean sendDTMF(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException { return false; }
            public boolean getLastVoiceTagNumber(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public int getAudioState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean connectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnectAudio(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public void setAudioRouteAllowed(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAudioRouteAllowed(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean sendVendorAtCommand(android.bluetooth.BluetoothDevice p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.os.Bundle getCurrentAgFeatures(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        }
    }
}
