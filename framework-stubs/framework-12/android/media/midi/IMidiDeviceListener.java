package android.media.midi;

public interface IMidiDeviceListener extends android.os.IInterface {
    public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException;
    public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException;
    public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) throws android.os.RemoteException;

    public static class Default implements android.media.midi.IMidiDeviceListener {
        public Default() {}
        public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
        public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
        public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiDeviceListener {
        public static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiDeviceListener";
        static final int TRANSACTION_onDeviceAdded = 1;
        static final int TRANSACTION_onDeviceRemoved = 2;
        static final int TRANSACTION_onDeviceStatusChanged = 3;
        public Stub() { super(); }
        public static android.media.midi.IMidiDeviceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.midi.IMidiDeviceListener p0) { return false; }
        public static android.media.midi.IMidiDeviceListener getDefaultImpl() { return null; }

        private static class Proxy implements android.media.midi.IMidiDeviceListener {
            private android.os.IBinder mRemote;
            public static android.media.midi.IMidiDeviceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceAdded(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
            public void onDeviceRemoved(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
            public void onDeviceStatusChanged(android.media.midi.MidiDeviceStatus p0) throws android.os.RemoteException {}
        }
    }
}
