package android.bluetooth;

public interface IBluetoothGattServerCallback extends android.os.IInterface {
    public void onServerRegistered(int p0, int p1) throws android.os.RemoteException;
    public void onServerConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException;
    public void onServiceAdded(int p0, android.bluetooth.BluetoothGattService p1) throws android.os.RemoteException;
    public void onCharacteristicReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public void onDescriptorReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public void onCharacteristicWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException;
    public void onDescriptorWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException;
    public void onExecuteWrite(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onNotificationSent(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onMtuChanged(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothGattServerCallback {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothGattServerCallback";
        static final int TRANSACTION_onServerRegistered = 1;
        static final int TRANSACTION_onServerConnectionState = 2;
        static final int TRANSACTION_onServiceAdded = 3;
        static final int TRANSACTION_onCharacteristicReadRequest = 4;
        static final int TRANSACTION_onDescriptorReadRequest = 5;
        static final int TRANSACTION_onCharacteristicWriteRequest = 6;
        static final int TRANSACTION_onDescriptorWriteRequest = 7;
        static final int TRANSACTION_onExecuteWrite = 8;
        static final int TRANSACTION_onNotificationSent = 9;
        static final int TRANSACTION_onMtuChanged = 10;
        static final int TRANSACTION_onPhyUpdate = 11;
        static final int TRANSACTION_onPhyRead = 12;
        static final int TRANSACTION_onConnectionUpdated = 13;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothGattServerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothGattServerCallback p0) { return false; }
        public static android.bluetooth.IBluetoothGattServerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothGattServerCallback {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothGattServerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onServerRegistered(int p0, int p1) throws android.os.RemoteException {}
            public void onServerConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
            public void onServiceAdded(int p0, android.bluetooth.BluetoothGattService p1) throws android.os.RemoteException {}
            public void onCharacteristicReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
            public void onDescriptorReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
            public void onCharacteristicWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException {}
            public void onDescriptorWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException {}
            public void onExecuteWrite(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onNotificationSent(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onMtuChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.bluetooth.IBluetoothGattServerCallback {
        public Default() {}
        public void onServerRegistered(int p0, int p1) throws android.os.RemoteException {}
        public void onServerConnectionState(int p0, int p1, boolean p2, java.lang.String p3) throws android.os.RemoteException {}
        public void onServiceAdded(int p0, android.bluetooth.BluetoothGattService p1) throws android.os.RemoteException {}
        public void onCharacteristicReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
        public void onDescriptorReadRequest(java.lang.String p0, int p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
        public void onCharacteristicWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException {}
        public void onDescriptorWriteRequest(java.lang.String p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, byte[] p7) throws android.os.RemoteException {}
        public void onExecuteWrite(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onNotificationSent(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onMtuChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onPhyUpdate(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onPhyRead(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onConnectionUpdated(java.lang.String p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
