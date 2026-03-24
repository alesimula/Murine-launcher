package android.hardware;

public interface ICameraService extends android.os.IInterface {
    public static final int ERROR_PERMISSION_DENIED = 1;
    public static final int ERROR_ALREADY_EXISTS = 2;
    public static final int ERROR_ILLEGAL_ARGUMENT = 3;
    public static final int ERROR_DISCONNECTED = 4;
    public static final int ERROR_TIMED_OUT = 5;
    public static final int ERROR_DISABLED = 6;
    public static final int ERROR_CAMERA_IN_USE = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 8;
    public static final int ERROR_DEPRECATED_HAL = 9;
    public static final int ERROR_INVALID_OPERATION = 10;
    public static final int CAMERA_TYPE_BACKWARD_COMPATIBLE = 0;
    public static final int CAMERA_TYPE_ALL = 1;
    public static final int USE_CALLING_UID = -1;
    public static final int USE_CALLING_PID = -1;
    public static final int API_VERSION_1 = 1;
    public static final int API_VERSION_2 = 2;
    public static final int EVENT_NONE = 0;
    public static final int EVENT_USER_SWITCHED = 1;
    public static final int EVENT_USB_DEVICE_ATTACHED = 2;
    public static final int EVENT_USB_DEVICE_DETACHED = 3;
    public static final int DEVICE_STATE_NORMAL = 0;
    public static final int DEVICE_STATE_BACK_COVERED = 1;
    public static final int DEVICE_STATE_FRONT_COVERED = 2;
    public static final int DEVICE_STATE_FOLDED = 4;
    public static final int DEVICE_STATE_LAST_FRAMEWORK_BIT = -2147483648;
    public int getNumberOfCameras(int p0) throws android.os.RemoteException;
    public android.hardware.CameraInfo getCameraInfo(int p0, boolean p1) throws android.os.RemoteException;
    public android.hardware.ICamera connect(android.hardware.ICameraClient p0, int p1, java.lang.String p2, int p3, int p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException;
    public android.hardware.camera2.ICameraDeviceUser connectDevice(android.hardware.camera2.ICameraDeviceCallbacks p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, boolean p7) throws android.os.RemoteException;
    public android.hardware.CameraStatus[] addListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException;
    public android.hardware.camera2.utils.ConcurrentCameraIdCombination[] getConcurrentCameraIds() throws android.os.RemoteException;
    public boolean isConcurrentSessionConfigurationSupported(android.hardware.camera2.utils.CameraIdAndSessionConfiguration[] p0, int p1) throws android.os.RemoteException;
    public void removeListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException;
    public android.hardware.camera2.impl.CameraMetadataNative getCameraCharacteristics(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.hardware.camera2.params.VendorTagDescriptor getCameraVendorTagDescriptor() throws android.os.RemoteException;
    public android.hardware.camera2.params.VendorTagDescriptorCache getCameraVendorTagCache() throws android.os.RemoteException;
    public java.lang.String getLegacyParameters(int p0) throws android.os.RemoteException;
    public boolean supportsCameraApi(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isHiddenPhysicalCamera(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.camera2.ICameraInjectionSession injectCamera(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.hardware.camera2.ICameraInjectionCallback p3) throws android.os.RemoteException;
    public void setTorchMode(java.lang.String p0, boolean p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException;
    public int getTorchStrengthLevel(java.lang.String p0) throws android.os.RemoteException;
    public void notifySystemEvent(int p0, int[] p1) throws android.os.RemoteException;
    public void notifyDisplayConfigurationChange() throws android.os.RemoteException;
    public void notifyDeviceStateChange(long p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.ICameraService {
        public Default() {}
        public int getNumberOfCameras(int p0) throws android.os.RemoteException { return 0; }
        public android.hardware.CameraInfo getCameraInfo(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.hardware.ICamera connect(android.hardware.ICameraClient p0, int p1, java.lang.String p2, int p3, int p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.ICameraDeviceUser connectDevice(android.hardware.camera2.ICameraDeviceCallbacks p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, boolean p7) throws android.os.RemoteException { return null; }
        public android.hardware.CameraStatus[] addListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.utils.ConcurrentCameraIdCombination[] getConcurrentCameraIds() throws android.os.RemoteException { return null; }
        public boolean isConcurrentSessionConfigurationSupported(android.hardware.camera2.utils.CameraIdAndSessionConfiguration[] p0, int p1) throws android.os.RemoteException { return false; }
        public void removeListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException {}
        public android.hardware.camera2.impl.CameraMetadataNative getCameraCharacteristics(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.params.VendorTagDescriptor getCameraVendorTagDescriptor() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.params.VendorTagDescriptorCache getCameraVendorTagCache() throws android.os.RemoteException { return null; }
        public java.lang.String getLegacyParameters(int p0) throws android.os.RemoteException { return null; }
        public boolean supportsCameraApi(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isHiddenPhysicalCamera(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.hardware.camera2.ICameraInjectionSession injectCamera(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.hardware.camera2.ICameraInjectionCallback p3) throws android.os.RemoteException { return null; }
        public void setTorchMode(java.lang.String p0, boolean p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public int getTorchStrengthLevel(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void notifySystemEvent(int p0, int[] p1) throws android.os.RemoteException {}
        public void notifyDisplayConfigurationChange() throws android.os.RemoteException {}
        public void notifyDeviceStateChange(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.ICameraService {
        public static final java.lang.String DESCRIPTOR = "android.hardware.ICameraService";
        static final int TRANSACTION_getNumberOfCameras = 1;
        static final int TRANSACTION_getCameraInfo = 2;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_connectDevice = 4;
        static final int TRANSACTION_addListener = 5;
        static final int TRANSACTION_getConcurrentCameraIds = 6;
        static final int TRANSACTION_isConcurrentSessionConfigurationSupported = 7;
        static final int TRANSACTION_removeListener = 8;
        static final int TRANSACTION_getCameraCharacteristics = 9;
        static final int TRANSACTION_getCameraVendorTagDescriptor = 10;
        static final int TRANSACTION_getCameraVendorTagCache = 11;
        static final int TRANSACTION_getLegacyParameters = 12;
        static final int TRANSACTION_supportsCameraApi = 13;
        static final int TRANSACTION_isHiddenPhysicalCamera = 14;
        static final int TRANSACTION_injectCamera = 15;
        static final int TRANSACTION_setTorchMode = 16;
        static final int TRANSACTION_turnOnTorchWithStrengthLevel = 17;
        static final int TRANSACTION_getTorchStrengthLevel = 18;
        static final int TRANSACTION_notifySystemEvent = 19;
        static final int TRANSACTION_notifyDisplayConfigurationChange = 20;
        static final int TRANSACTION_notifyDeviceStateChange = 21;
        public Stub() { super(); }
        public static android.hardware.ICameraService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.ICameraService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getNumberOfCameras(int p0) throws android.os.RemoteException { return 0; }
            public android.hardware.CameraInfo getCameraInfo(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.hardware.ICamera connect(android.hardware.ICameraClient p0, int p1, java.lang.String p2, int p3, int p4, int p5, boolean p6, boolean p7) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.ICameraDeviceUser connectDevice(android.hardware.camera2.ICameraDeviceCallbacks p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, boolean p7) throws android.os.RemoteException { return null; }
            public android.hardware.CameraStatus[] addListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.utils.ConcurrentCameraIdCombination[] getConcurrentCameraIds() throws android.os.RemoteException { return null; }
            public boolean isConcurrentSessionConfigurationSupported(android.hardware.camera2.utils.CameraIdAndSessionConfiguration[] p0, int p1) throws android.os.RemoteException { return false; }
            public void removeListener(android.hardware.ICameraServiceListener p0) throws android.os.RemoteException {}
            public android.hardware.camera2.impl.CameraMetadataNative getCameraCharacteristics(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.hardware.camera2.params.VendorTagDescriptor getCameraVendorTagDescriptor() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.params.VendorTagDescriptorCache getCameraVendorTagCache() throws android.os.RemoteException { return null; }
            public java.lang.String getLegacyParameters(int p0) throws android.os.RemoteException { return null; }
            public boolean supportsCameraApi(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isHiddenPhysicalCamera(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.hardware.camera2.ICameraInjectionSession injectCamera(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.hardware.camera2.ICameraInjectionCallback p3) throws android.os.RemoteException { return null; }
            public void setTorchMode(java.lang.String p0, boolean p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public int getTorchStrengthLevel(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void notifySystemEvent(int p0, int[] p1) throws android.os.RemoteException {}
            public void notifyDisplayConfigurationChange() throws android.os.RemoteException {}
            public void notifyDeviceStateChange(long p0) throws android.os.RemoteException {}
        }
    }
}
