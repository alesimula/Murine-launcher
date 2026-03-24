package android.companion.virtual;

public interface IVirtualDeviceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDeviceManager";
    public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, java.lang.String p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException;
    public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException;
    public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException;
    public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException;
    public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException;
    public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException;
    public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException;
    public void playSoundEffect(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDeviceManager {
        public Default() {}
        public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, java.lang.String p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
        public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
        public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
        public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
        public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
        public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDeviceManager {
        static final int TRANSACTION_createVirtualDevice = 1;
        static final int TRANSACTION_getVirtualDevices = 2;
        static final int TRANSACTION_getDeviceIdForDisplayId = 3;
        static final int TRANSACTION_isValidVirtualDeviceId = 4;
        static final int TRANSACTION_getDevicePolicy = 5;
        static final int TRANSACTION_createVirtualDisplay = 6;
        static final int TRANSACTION_getAudioPlaybackSessionId = 7;
        static final int TRANSACTION_getAudioRecordingSessionId = 8;
        static final int TRANSACTION_playSoundEffect = 9;
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.IVirtualDeviceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, java.lang.String p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
            public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
            public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
            public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
            public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
            public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
