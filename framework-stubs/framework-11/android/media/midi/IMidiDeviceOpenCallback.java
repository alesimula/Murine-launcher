package android.media.midi;

public interface IMidiDeviceOpenCallback extends android.os.IInterface {
    public void onDeviceOpened(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1) throws android.os.RemoteException;

    public static class Default implements android.media.midi.IMidiDeviceOpenCallback {
        public Default() {}
        public void onDeviceOpened(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiDeviceOpenCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiDeviceOpenCallback";
        static final int TRANSACTION_onDeviceOpened = 1;
        public Stub() { super(); }
        public static android.media.midi.IMidiDeviceOpenCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.midi.IMidiDeviceOpenCallback p0) { return false; }
        public static android.media.midi.IMidiDeviceOpenCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.midi.IMidiDeviceOpenCallback {
            private android.os.IBinder mRemote;
            public static android.media.midi.IMidiDeviceOpenCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDeviceOpened(android.media.midi.IMidiDeviceServer p0, android.os.IBinder p1) throws android.os.RemoteException {}
        }
    }
}
