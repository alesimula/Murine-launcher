package android.media.midi;

public interface IBluetoothMidiService extends android.os.IInterface {
    public android.os.IBinder addBluetoothDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException;

    public static class Default implements android.media.midi.IBluetoothMidiService {
        public Default() {}
        public android.os.IBinder addBluetoothDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.midi.IBluetoothMidiService {
        private static final java.lang.String DESCRIPTOR = "android.media.midi.IBluetoothMidiService";
        static final int TRANSACTION_addBluetoothDevice = 1;
        public Stub() { super(); }
        public static android.media.midi.IBluetoothMidiService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.midi.IBluetoothMidiService p0) { return false; }
        public static android.media.midi.IBluetoothMidiService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.midi.IBluetoothMidiService {
            private android.os.IBinder mRemote;
            public static android.media.midi.IBluetoothMidiService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder addBluetoothDevice(android.bluetooth.BluetoothDevice p0) throws android.os.RemoteException { return null; }
        }
    }
}
