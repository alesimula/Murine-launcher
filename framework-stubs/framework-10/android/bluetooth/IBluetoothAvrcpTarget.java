package android.bluetooth;

public interface IBluetoothAvrcpTarget extends android.os.IInterface {
    public void sendVolumeChanged(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothAvrcpTarget {
        private static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothAvrcpTarget";
        static final int TRANSACTION_sendVolumeChanged = 1;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothAvrcpTarget asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothAvrcpTarget p0) { return false; }
        public static android.bluetooth.IBluetoothAvrcpTarget getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothAvrcpTarget {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothAvrcpTarget sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendVolumeChanged(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.bluetooth.IBluetoothAvrcpTarget {
        public Default() {}
        public void sendVolumeChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
