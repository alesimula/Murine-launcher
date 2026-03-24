package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class CameraExtensionService extends android.app.Service {
    protected CameraExtensionService() { super(); }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract boolean onRegisterClient(android.os.IBinder p0);
    public abstract void onUnregisterClient(android.os.IBinder p0);
    @android.annotation.NonNull
    public abstract android.hardware.camera2.extension.AdvancedExtender onInitializeAdvancedExtension(int p0);

    private class CameraExtensionServiceImpl extends android.hardware.camera2.extension.ICameraExtensionsProxyService.Stub {
        public boolean registerClient(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void unregisterClient(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean advancedExtensionsSupported() throws android.os.RemoteException { return false; }
        public void initializeSession(android.hardware.camera2.extension.IInitializeSessionCallback p0) {}
        public void releaseSession() {}
        public android.hardware.camera2.extension.IPreviewExtenderImpl initializePreviewExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IImageCaptureExtenderImpl initializeImageExtension(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.IAdvancedExtenderImpl initializeAdvancedExtension(int p0) throws android.os.RemoteException { return null; }
    }

    private final class CameraTracker implements android.hardware.camera2.extension.CameraUsageTracker {
        public void startCameraOperation() {}
        public void finishCameraOperation() {}
    }
}
