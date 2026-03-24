package android.media.midi;

public interface IMidiDeviceServer extends android.os.IInterface {
    public java.io.FileDescriptor openInputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public java.io.FileDescriptor openOutputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void closePort(android.os.IBinder p0) throws android.os.RemoteException;
    public void closeDevice() throws android.os.RemoteException;
    public int connectPorts(android.os.IBinder p0, java.io.FileDescriptor p1, int p2) throws android.os.RemoteException;
    public android.media.midi.MidiDeviceInfo getDeviceInfo() throws android.os.RemoteException;
    public void setDeviceInfo(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.midi.IMidiDeviceServer {
        private static final java.lang.String DESCRIPTOR = "android.media.midi.IMidiDeviceServer";
        static final int TRANSACTION_openInputPort = 1;
        static final int TRANSACTION_openOutputPort = 2;
        static final int TRANSACTION_closePort = 3;
        static final int TRANSACTION_closeDevice = 4;
        static final int TRANSACTION_connectPorts = 5;
        static final int TRANSACTION_getDeviceInfo = 6;
        static final int TRANSACTION_setDeviceInfo = 7;
        public Stub() { super(); }
        public static android.media.midi.IMidiDeviceServer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.midi.IMidiDeviceServer p0) { return false; }
        public static android.media.midi.IMidiDeviceServer getDefaultImpl() { return null; }

        private static class Proxy implements android.media.midi.IMidiDeviceServer {
            private android.os.IBinder mRemote;
            public static android.media.midi.IMidiDeviceServer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.io.FileDescriptor openInputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
            public java.io.FileDescriptor openOutputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
            public void closePort(android.os.IBinder p0) throws android.os.RemoteException {}
            public void closeDevice() throws android.os.RemoteException {}
            public int connectPorts(android.os.IBinder p0, java.io.FileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
            public android.media.midi.MidiDeviceInfo getDeviceInfo() throws android.os.RemoteException { return null; }
            public void setDeviceInfo(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.midi.IMidiDeviceServer {
        public Default() {}
        public java.io.FileDescriptor openInputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
        public java.io.FileDescriptor openOutputPort(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
        public void closePort(android.os.IBinder p0) throws android.os.RemoteException {}
        public void closeDevice() throws android.os.RemoteException {}
        public int connectPorts(android.os.IBinder p0, java.io.FileDescriptor p1, int p2) throws android.os.RemoteException { return 0; }
        public android.media.midi.MidiDeviceInfo getDeviceInfo() throws android.os.RemoteException { return null; }
        public void setDeviceInfo(android.media.midi.MidiDeviceInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
