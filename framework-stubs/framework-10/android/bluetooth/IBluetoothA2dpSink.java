package android.bluetooth;

public interface IBluetoothA2dpSink extends android.os.IInterface {
    public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException;
    public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException;
    public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;
    public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothA2dpSink {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothA2dpSink";
        static final int TRANSACTION_connect = 1;
        static final int TRANSACTION_disconnect = 2;
        static final int TRANSACTION_getConnectedDevices = 3;
        static final int TRANSACTION_getDevicesMatchingConnectionStates = 4;
        static final int TRANSACTION_getConnectionState = 5;
        static final int TRANSACTION_getAudioConfig = 6;
        static final int TRANSACTION_setPriority = 7;
        static final int TRANSACTION_getPriority = 8;
        static final int TRANSACTION_isA2dpPlaying = 9;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothA2dpSink asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothA2dpSink p0) { return false; }
        public static android.bluetooth.IBluetoothA2dpSink getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothA2dpSink {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothA2dpSink sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
            public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
            public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
            public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
            public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
            public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.bluetooth.IBluetoothA2dpSink {
        public Default() {}
        public boolean connect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public boolean disconnect(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() throws android.os.RemoteException { return null; }
        public java.util.List<android.bluetooth.BluetoothDevice> getDevicesMatchingConnectionStates(int[] p0) throws android.os.RemoteException { return null; }
        public int getConnectionState(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public android.bluetooth.BluetoothAudioConfig getAudioConfig(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public boolean setPriority(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException { return false; }
        public int getPriority(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return 0; }
        public boolean isA2dpPlaying(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
