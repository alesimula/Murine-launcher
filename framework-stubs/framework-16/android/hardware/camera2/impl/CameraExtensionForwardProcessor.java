package android.hardware.camera2.impl;

public class CameraExtensionForwardProcessor {
    public static final java.lang.String TAG = "CameraExtensionForward";
    public CameraExtensionForwardProcessor(android.hardware.camera2.extension.IPreviewImageProcessorImpl p0, int p1, long p2, android.os.Handler p3) {}
    public void close() {}
    public void onOutputSurface(android.view.Surface p0, int p1) {}
    public void onResolutionUpdate(android.util.Size p0) {}
    public void onImageFormatUpdate(int p0) {}
    public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.TotalCaptureResult p1, android.hardware.camera2.extension.IProcessResultImpl p2) throws android.os.RemoteException {}

    private class ForwardCallback implements android.media.ImageReader.OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
