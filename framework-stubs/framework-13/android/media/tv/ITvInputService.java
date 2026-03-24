package android.media.tv;

public interface ITvInputService extends android.os.IInterface {
    public void registerCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, android.media.tv.ITvInputSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void createRecordingSession(android.media.tv.ITvInputSessionCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames() throws android.os.RemoteException;
    public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getExtensionInterfacePermission(java.lang.String p0) throws android.os.RemoteException;
    public void notifyHardwareAdded(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException;
    public void notifyHardwareRemoved(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException;
    public void notifyHdmiDeviceAdded(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException;
    public void notifyHdmiDeviceRemoved(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException;
    public void notifyHdmiDeviceUpdated(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputService {
        public Default() {}
        public void registerCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, android.media.tv.ITvInputSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void createRecordingSession(android.media.tv.ITvInputSessionCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames() throws android.os.RemoteException { return null; }
        public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getExtensionInterfacePermission(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void notifyHardwareAdded(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException {}
        public void notifyHardwareRemoved(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException {}
        public void notifyHdmiDeviceAdded(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
        public void notifyHdmiDeviceRemoved(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
        public void notifyHdmiDeviceUpdated(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputService {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputService";
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;
        static final int TRANSACTION_createSession = 3;
        static final int TRANSACTION_createRecordingSession = 4;
        static final int TRANSACTION_getAvailableExtensionInterfaceNames = 5;
        static final int TRANSACTION_getExtensionInterface = 6;
        static final int TRANSACTION_getExtensionInterfacePermission = 7;
        static final int TRANSACTION_notifyHardwareAdded = 8;
        static final int TRANSACTION_notifyHardwareRemoved = 9;
        static final int TRANSACTION_notifyHdmiDeviceAdded = 10;
        static final int TRANSACTION_notifyHdmiDeviceRemoved = 11;
        static final int TRANSACTION_notifyHdmiDeviceUpdated = 12;
        public Stub() { super(); }
        public static android.media.tv.ITvInputService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.ITvInputService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.tv.ITvInputServiceCallback p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, android.media.tv.ITvInputSessionCallback p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void createRecordingSession(android.media.tv.ITvInputSessionCallback p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAvailableExtensionInterfaceNames() throws android.os.RemoteException { return null; }
            public android.os.IBinder getExtensionInterface(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getExtensionInterfacePermission(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void notifyHardwareAdded(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException {}
            public void notifyHardwareRemoved(android.media.tv.TvInputHardwareInfo p0) throws android.os.RemoteException {}
            public void notifyHdmiDeviceAdded(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
            public void notifyHdmiDeviceRemoved(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
            public void notifyHdmiDeviceUpdated(android.hardware.hdmi.HdmiDeviceInfo p0) throws android.os.RemoteException {}
        }
    }
}
