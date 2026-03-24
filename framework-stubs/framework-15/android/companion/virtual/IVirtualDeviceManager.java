package android.companion.virtual;

public interface IVirtualDeviceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDeviceManager";
    @android.annotation.EnforcePermission("android.permission.CREATE_VIRTUAL_DEVICE")
    public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException;
    public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException;
    public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException;
    public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException;
    public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException;
    public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException;
    public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException;
    public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException;
    public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException;
    public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException;
    public void playSoundEffect(int p0, int p1) throws android.os.RemoteException;
    public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDeviceManager {
        public Default() {}
        public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
        public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException { return null; }
        public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
        public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
        public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
        public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
        public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
        public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
        public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
        public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDeviceManager {
        static final int TRANSACTION_createVirtualDevice = 1;
        static final int TRANSACTION_getVirtualDevices = 2;
        static final int TRANSACTION_getVirtualDevice = 3;
        static final int TRANSACTION_registerVirtualDeviceListener = 4;
        static final int TRANSACTION_unregisterVirtualDeviceListener = 5;
        static final int TRANSACTION_getDeviceIdForDisplayId = 6;
        static final int TRANSACTION_getDisplayNameForPersistentDeviceId = 7;
        static final int TRANSACTION_isValidVirtualDeviceId = 8;
        static final int TRANSACTION_getDevicePolicy = 9;
        static final int TRANSACTION_createVirtualDisplay = 10;
        static final int TRANSACTION_getAudioPlaybackSessionId = 11;
        static final int TRANSACTION_getAudioRecordingSessionId = 12;
        static final int TRANSACTION_playSoundEffect = 13;
        static final int TRANSACTION_isVirtualDeviceOwnedMirrorDisplay = 14;
        static final int TRANSACTION_getAllPersistentDeviceIds = 15;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void createVirtualDevice_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.IVirtualDeviceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
            public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException { return null; }
            public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
            public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
            public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
            public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
            public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
            public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
            public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
            public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException { return null; }
        }
    }
}
