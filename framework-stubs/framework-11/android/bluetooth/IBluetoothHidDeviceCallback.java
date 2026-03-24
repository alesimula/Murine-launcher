package android.bluetooth;

public interface IBluetoothHidDeviceCallback extends android.os.IInterface {
    public void onAppStatusChanged(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException;
    public void onConnectionStateChanged(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException;
    public void onGetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) throws android.os.RemoteException;
    public void onSetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException;
    public void onSetProtocol(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException;
    public void onInterruptData(android.bluetooth.BluetoothDevice p0, byte p1, byte[] p2) throws android.os.RemoteException;
    public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothHidDeviceCallback {
        public Default() {}
        public void onAppStatusChanged(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException {}
        public void onConnectionStateChanged(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
        public void onGetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) throws android.os.RemoteException {}
        public void onSetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException {}
        public void onSetProtocol(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException {}
        public void onInterruptData(android.bluetooth.BluetoothDevice p0, byte p1, byte[] p2) throws android.os.RemoteException {}
        public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothHidDeviceCallback {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothHidDeviceCallback";
        static final int TRANSACTION_onAppStatusChanged = 1;
        static final int TRANSACTION_onConnectionStateChanged = 2;
        static final int TRANSACTION_onGetReport = 3;
        static final int TRANSACTION_onSetReport = 4;
        static final int TRANSACTION_onSetProtocol = 5;
        static final int TRANSACTION_onInterruptData = 6;
        static final int TRANSACTION_onVirtualCableUnplug = 7;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothHidDeviceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothHidDeviceCallback p0) { return false; }
        public static android.bluetooth.IBluetoothHidDeviceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothHidDeviceCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothHidDeviceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAppStatusChanged(android.bluetooth.BluetoothDevice p0, boolean p1) throws android.os.RemoteException {}
            public void onConnectionStateChanged(android.bluetooth.BluetoothDevice p0, int p1) throws android.os.RemoteException {}
            public void onGetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, int p3) throws android.os.RemoteException {}
            public void onSetReport(android.bluetooth.BluetoothDevice p0, byte p1, byte p2, byte[] p3) throws android.os.RemoteException {}
            public void onSetProtocol(android.bluetooth.BluetoothDevice p0, byte p1) throws android.os.RemoteException {}
            public void onInterruptData(android.bluetooth.BluetoothDevice p0, byte p1, byte[] p2) throws android.os.RemoteException {}
            public void onVirtualCableUnplug(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException {}
        }
    }
}
