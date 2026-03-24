package android.hardware.camera2;

public interface ICameraDeviceUser extends android.os.IInterface {
    public static final int NO_IN_FLIGHT_REPEATING_FRAMES = -1;
    public static final int NORMAL_MODE = 0;
    public static final int CONSTRAINED_HIGH_SPEED_MODE = 1;
    public static final int VENDOR_MODE_START = 32768;
    public static final int TEMPLATE_PREVIEW = 1;
    public static final int TEMPLATE_STILL_CAPTURE = 2;
    public static final int TEMPLATE_RECORD = 3;
    public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
    public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
    public static final int TEMPLATE_MANUAL = 6;
    public static final int AUDIO_RESTRICTION_NONE = 0;
    public static final int AUDIO_RESTRICTION_VIBRATION = 1;
    public static final int AUDIO_RESTRICTION_VIBRATION_SOUND = 3;
    public void disconnect() throws android.os.RemoteException;
    public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) throws android.os.RemoteException;
    public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) throws android.os.RemoteException;
    public long cancelRequest(int p0) throws android.os.RemoteException;
    public void beginConfigure() throws android.os.RemoteException;
    public int[] endConfigure(int p0, android.hardware.camera2.impl.CameraMetadataNative p1, long p2) throws android.os.RemoteException;
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.os.RemoteException;
    public void deleteStream(int p0) throws android.os.RemoteException;
    public int createStream(android.hardware.camera2.params.OutputConfiguration p0) throws android.os.RemoteException;
    public int createInputStream(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;
    public android.view.Surface getInputSurface() throws android.os.RemoteException;
    public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int p0) throws android.os.RemoteException;
    public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.os.RemoteException;
    public void waitUntilIdle() throws android.os.RemoteException;
    public long flush() throws android.os.RemoteException;
    public void prepare(int p0) throws android.os.RemoteException;
    public void tearDown(int p0) throws android.os.RemoteException;
    public void prepare2(int p0, int p1) throws android.os.RemoteException;
    public void updateOutputConfiguration(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException;
    public void finalizeOutputConfigurations(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException;
    public void setCameraAudioRestriction(int p0) throws android.os.RemoteException;
    public int getGlobalAudioRestriction() throws android.os.RemoteException;
    public android.hardware.camera2.ICameraOfflineSession switchToOffline(android.hardware.camera2.ICameraDeviceCallbacks p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.ICameraDeviceUser {
        public Default() {}
        public void disconnect() throws android.os.RemoteException {}
        public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) throws android.os.RemoteException { return null; }
        public long cancelRequest(int p0) throws android.os.RemoteException { return 0L; }
        public void beginConfigure() throws android.os.RemoteException {}
        public int[] endConfigure(int p0, android.hardware.camera2.impl.CameraMetadataNative p1, long p2) throws android.os.RemoteException { return null; }
        public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.os.RemoteException { return false; }
        public void deleteStream(int p0) throws android.os.RemoteException {}
        public int createStream(android.hardware.camera2.params.OutputConfiguration p0) throws android.os.RemoteException { return 0; }
        public int createInputStream(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException { return 0; }
        public android.view.Surface getInputSurface() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.os.RemoteException { return null; }
        public void waitUntilIdle() throws android.os.RemoteException {}
        public long flush() throws android.os.RemoteException { return 0L; }
        public void prepare(int p0) throws android.os.RemoteException {}
        public void tearDown(int p0) throws android.os.RemoteException {}
        public void prepare2(int p0, int p1) throws android.os.RemoteException {}
        public void updateOutputConfiguration(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException {}
        public void finalizeOutputConfigurations(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException {}
        public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
        public int getGlobalAudioRestriction() throws android.os.RemoteException { return 0; }
        public android.hardware.camera2.ICameraOfflineSession switchToOffline(android.hardware.camera2.ICameraDeviceCallbacks p0, int[] p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceUser {
        public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceUser";
        static final int TRANSACTION_disconnect = 1;
        static final int TRANSACTION_submitRequest = 2;
        static final int TRANSACTION_submitRequestList = 3;
        static final int TRANSACTION_cancelRequest = 4;
        static final int TRANSACTION_beginConfigure = 5;
        static final int TRANSACTION_endConfigure = 6;
        static final int TRANSACTION_isSessionConfigurationSupported = 7;
        static final int TRANSACTION_deleteStream = 8;
        static final int TRANSACTION_createStream = 9;
        static final int TRANSACTION_createInputStream = 10;
        static final int TRANSACTION_getInputSurface = 11;
        static final int TRANSACTION_createDefaultRequest = 12;
        static final int TRANSACTION_getCameraInfo = 13;
        static final int TRANSACTION_waitUntilIdle = 14;
        static final int TRANSACTION_flush = 15;
        static final int TRANSACTION_prepare = 16;
        static final int TRANSACTION_tearDown = 17;
        static final int TRANSACTION_prepare2 = 18;
        static final int TRANSACTION_updateOutputConfiguration = 19;
        static final int TRANSACTION_finalizeOutputConfigurations = 20;
        static final int TRANSACTION_setCameraAudioRestriction = 21;
        static final int TRANSACTION_getGlobalAudioRestriction = 22;
        static final int TRANSACTION_switchToOffline = 23;
        public Stub() { super(); }
        public static android.hardware.camera2.ICameraDeviceUser asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.ICameraDeviceUser p0) { return false; }
        public static android.hardware.camera2.ICameraDeviceUser getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.ICameraDeviceUser {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.ICameraDeviceUser sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void disconnect() throws android.os.RemoteException {}
            public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) throws android.os.RemoteException { return null; }
            public long cancelRequest(int p0) throws android.os.RemoteException { return 0L; }
            public void beginConfigure() throws android.os.RemoteException {}
            public int[] endConfigure(int p0, android.hardware.camera2.impl.CameraMetadataNative p1, long p2) throws android.os.RemoteException { return null; }
            public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.os.RemoteException { return false; }
            public void deleteStream(int p0) throws android.os.RemoteException {}
            public int createStream(android.hardware.camera2.params.OutputConfiguration p0) throws android.os.RemoteException { return 0; }
            public int createInputStream(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException { return 0; }
            public android.view.Surface getInputSurface() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() throws android.os.RemoteException { return null; }
            public void waitUntilIdle() throws android.os.RemoteException {}
            public long flush() throws android.os.RemoteException { return 0L; }
            public void prepare(int p0) throws android.os.RemoteException {}
            public void tearDown(int p0) throws android.os.RemoteException {}
            public void prepare2(int p0, int p1) throws android.os.RemoteException {}
            public void updateOutputConfiguration(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException {}
            public void finalizeOutputConfigurations(int p0, android.hardware.camera2.params.OutputConfiguration p1) throws android.os.RemoteException {}
            public void setCameraAudioRestriction(int p0) throws android.os.RemoteException {}
            public int getGlobalAudioRestriction() throws android.os.RemoteException { return 0; }
            public android.hardware.camera2.ICameraOfflineSession switchToOffline(android.hardware.camera2.ICameraDeviceCallbacks p0, int[] p1) throws android.os.RemoteException { return null; }
        }
    }
}
