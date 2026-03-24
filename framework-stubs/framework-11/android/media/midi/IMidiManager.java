package android.media.midi;

public interface IMidiManager extends android.os.IInterface {
    public android.media.midi.MidiDeviceInfo[] getDevices() throws android.os.RemoteException;
    public void registerListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException;
    public void unregisterListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException;
    public void openDevice(android.os.IBinder p0, android.media.midi.MidiDeviceInfo p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException;
    public void openBluetoothDevice(android.os.IBinder p0, android.bluetooth.BluetoothDevice p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException;
    public void closeDevice(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public android.media.midi.MidiDeviceInfo registerDeviceServer(android.media.midi.IMidiDeviceServer p0, int p1, int p2, java.lang.String[] p3, java.lang.String[] p4, android.os.Bundle p5, int p6) throws android.os.RemoteException;
    public void unregisterDeviceServer(android.media.midi.IMidiDeviceServer p0) throws android.os.RemoteException;
    public android.media.midi.MidiDeviceInfo getServiceDeviceInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.media.midi.MidiDeviceStatus getDeviceStatus(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException;
    public void setDeviceStatus(android.media.midi.IMidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1) throws android.os.RemoteException;

    public static class Default implements android.media.midi.IMidiManager {
        public Default() {}
        public android.media.midi.MidiDeviceInfo[] getDevices() throws android.os.RemoteException { return null; }
        public void registerListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException {}
        public void unregisterListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException {}
        public void openDevice(android.os.IBinder p0, android.media.midi.MidiDeviceInfo p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException {}
        public void openBluetoothDevice(android.os.IBinder p0, android.bluetooth.BluetoothDevice p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException {}
        public void closeDevice(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.media.midi.MidiDeviceInfo registerDeviceServer(android.media.midi.IMidiDeviceServer p0, int p1, int p2, java.lang.String[] p3, java.lang.String[] p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return null; }
        public void unregisterDeviceServer(android.media.midi.IMidiDeviceServer p0) throws android.os.RemoteException {}
        public android.media.midi.MidiDeviceInfo getServiceDeviceInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.media.midi.MidiDeviceStatus getDeviceStatus(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException { return null; }
        public void setDeviceStatus(android.media.midi.IMidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiManager {
        private static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiManager";
        static final int TRANSACTION_getDevices = 1;
        static final int TRANSACTION_registerListener = 2;
        static final int TRANSACTION_unregisterListener = 3;
        static final int TRANSACTION_openDevice = 4;
        static final int TRANSACTION_openBluetoothDevice = 5;
        static final int TRANSACTION_closeDevice = 6;
        static final int TRANSACTION_registerDeviceServer = 7;
        static final int TRANSACTION_unregisterDeviceServer = 8;
        static final int TRANSACTION_getServiceDeviceInfo = 9;
        static final int TRANSACTION_getDeviceStatus = 10;
        static final int TRANSACTION_setDeviceStatus = 11;
        public Stub() { super(); }
        public static android.media.midi.IMidiManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.midi.IMidiManager p0) { return false; }
        public static android.media.midi.IMidiManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.midi.IMidiManager {
            private android.os.IBinder mRemote;
            public static android.media.midi.IMidiManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.midi.MidiDeviceInfo[] getDevices() throws android.os.RemoteException { return null; }
            public void registerListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException {}
            public void unregisterListener(android.os.IBinder p0, android.media.midi.IMidiDeviceListener p1) throws android.os.RemoteException {}
            public void openDevice(android.os.IBinder p0, android.media.midi.MidiDeviceInfo p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException {}
            public void openBluetoothDevice(android.os.IBinder p0, android.bluetooth.BluetoothDevice p1, android.media.midi.IMidiDeviceOpenCallback p2) throws android.os.RemoteException {}
            public void closeDevice(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public android.media.midi.MidiDeviceInfo registerDeviceServer(android.media.midi.IMidiDeviceServer p0, int p1, int p2, java.lang.String[] p3, java.lang.String[] p4, android.os.Bundle p5, int p6) throws android.os.RemoteException { return null; }
            public void unregisterDeviceServer(android.media.midi.IMidiDeviceServer p0) throws android.os.RemoteException {}
            public android.media.midi.MidiDeviceInfo getServiceDeviceInfo(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.media.midi.MidiDeviceStatus getDeviceStatus(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException { return null; }
            public void setDeviceStatus(android.media.midi.IMidiDeviceServer p0, android.media.midi.MidiDeviceStatus p1) throws android.os.RemoteException {}
        }
    }
}
