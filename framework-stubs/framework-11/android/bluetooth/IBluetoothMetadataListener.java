package android.bluetooth;

public interface IBluetoothMetadataListener extends android.os.IInterface {
    public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothMetadataListener {
        public Default() {}
        public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothMetadataListener {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothMetadataListener";
        static final int TRANSACTION_onMetadataChanged = 1;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothMetadataListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothMetadataListener p0) { return false; }
        public static android.bluetooth.IBluetoothMetadataListener getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothMetadataListener {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothMetadataListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onMetadataChanged(android.bluetooth.BluetoothDevice p0, int p1, byte[] p2) throws android.os.RemoteException {}
        }
    }
}
