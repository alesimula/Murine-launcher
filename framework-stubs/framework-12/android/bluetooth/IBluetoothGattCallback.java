package android.bluetooth;

public interface IBluetoothGattCallback extends android.os.IInterface {
    public void onClientRegistered(int p0, int p1) throws android.os.RemoteException;
    public void onClientConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onSearchComplete(java.lang.String p0, java.util.List<android.bluetooth.BluetoothGattService> p1, int p2) throws android.os.RemoteException;
    public void onCharacteristicRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void onCharacteristicWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onExecuteWrite(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onDescriptorRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException;
    public void onDescriptorWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onNotify(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException;
    public void onReadRemoteRssi(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onConfigureMTU(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public void onServiceChanged(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothGattCallback {
        public Default() {}
        public void onClientRegistered(int p0, int p1) throws android.os.RemoteException {}
        public void onClientConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onSearchComplete(java.lang.String p0, java.util.List<android.bluetooth.BluetoothGattService> p1, int p2) throws android.os.RemoteException {}
        public void onCharacteristicRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void onCharacteristicWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onExecuteWrite(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onDescriptorRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
        public void onDescriptorWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onNotify(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public void onReadRemoteRssi(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onConfigureMTU(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void onServiceChanged(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattCallback {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattCallback";
        static final int TRANSACTION_onClientRegistered = 1;
        static final int TRANSACTION_onClientConnectionState = 2;
        static final int TRANSACTION_onPhyUpdate = 3;
        static final int TRANSACTION_onPhyRead = 4;
        static final int TRANSACTION_onSearchComplete = 5;
        static final int TRANSACTION_onCharacteristicRead = 6;
        static final int TRANSACTION_onCharacteristicWrite = 7;
        static final int TRANSACTION_onExecuteWrite = 8;
        static final int TRANSACTION_onDescriptorRead = 9;
        static final int TRANSACTION_onDescriptorWrite = 10;
        static final int TRANSACTION_onNotify = 11;
        static final int TRANSACTION_onReadRemoteRssi = 12;
        static final int TRANSACTION_onConfigureMTU = 13;
        static final int TRANSACTION_onConnectionUpdated = 14;
        static final int TRANSACTION_onServiceChanged = 15;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothGattCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothGattCallback p0) { return false; }
        public static android.bluetooth.IBluetoothGattCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothGattCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothGattCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onClientRegistered(int p0, int p1) throws android.os.RemoteException {}
            public void onClientConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onSearchComplete(java.lang.String p0, java.util.List<android.bluetooth.BluetoothGattService> p1, int p2) throws android.os.RemoteException {}
            public void onCharacteristicRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void onCharacteristicWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onExecuteWrite(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onDescriptorRead(java.lang.String p0, int p1, int p2, byte[] p3) throws android.os.RemoteException {}
            public void onDescriptorWrite(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onNotify(java.lang.String p0, int p1, byte[] p2) throws android.os.RemoteException {}
            public void onReadRemoteRssi(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onConfigureMTU(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void onServiceChanged(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
