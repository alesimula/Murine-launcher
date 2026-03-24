package android.hardware.camera2.impl;

public class CameraExtensionForwardProcessor {
    public static final java.lang.String TAG = "CameraExtensionForward";
    private static final int FORWARD_QUEUE_SIZE = 3;
    private final android.hardware.camera2.extension.IPreviewImageProcessorImpl mProcessor = null;
    private final long mOutputSurfaceUsage = 0L;
    private final int mOutputSurfaceFormat = 0;
    private final android.os.Handler mHandler = null;
    private android.media.ImageReader mIntermediateReader;
    private android.view.Surface mIntermediateSurface;
    private android.util.Size mResolution;
    private android.view.Surface mOutputSurface;
    private android.media.ImageWriter mOutputWriter;
    private boolean mOutputAbandoned;
    public CameraExtensionForwardProcessor(android.hardware.camera2.extension.IPreviewImageProcessorImpl p0, int p1, long p2, android.os.Handler p3) {}
    public void close() {}
    public void onOutputSurface(android.view.Surface p0, int p1) {}
    public void onResolutionUpdate(android.util.Size p0) {}
    public void onImageFormatUpdate(int p0) {}
    @android.annotation.SuppressLint("WrongConstant")
    private void initializePipeline() throws android.os.RemoteException {}
    public void process(android.hardware.camera2.extension.ParcelImage p0, android.hardware.camera2.TotalCaptureResult p1) throws android.os.RemoteException {}

    private class ForwardCallback implements android.media.ImageReader.OnImageAvailableListener {
        private ForwardCallback(android.hardware.camera2.impl.CameraExtensionForwardProcessor p0) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
