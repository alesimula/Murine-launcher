package android.bluetooth;

public interface IBluetoothProfileServiceConnection extends android.os.IInterface {
    @android.annotation.RequiresNoPermission
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void onServiceDisconnected(android.content.ComponentName p0) throws android.os.RemoteException;

    public static class Default implements android.bluetooth.IBluetoothProfileServiceConnection {
        public Default() {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void onServiceDisconnected(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.bluetooth.IBluetoothProfileServiceConnection {
        public static final java.lang.String DESCRIPTOR = "android.bluetooth.IBluetoothProfileServiceConnection";
        static final int TRANSACTION_onServiceConnected = 1;
        static final int TRANSACTION_onServiceDisconnected = 2;
        public Stub() { super(); }
        public static android.bluetooth.IBluetoothProfileServiceConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.bluetooth.IBluetoothProfileServiceConnection p0) { return false; }
        public static android.bluetooth.IBluetoothProfileServiceConnection getDefaultImpl() { return null; }

        private static class Proxy implements android.bluetooth.IBluetoothProfileServiceConnection {
            private android.os.IBinder mRemote;
            public static android.bluetooth.IBluetoothProfileServiceConnection sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void onServiceDisconnected(android.content.ComponentName p0) throws android.os.RemoteException {}
        }
    }
}
