package android.hardware.camera2.impl;

public class CameraExtensionJpegProcessor implements android.hardware.camera2.extension.ICaptureProcessorImpl {
    public static final java.lang.String TAG = "CameraExtensionJpeg";
    private static final int JPEG_QUEUE_SIZE = 1;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.hardware.camera2.extension.ICaptureProcessorImpl mProcessor = null;
    private android.media.ImageReader mYuvReader;
    private android.hardware.camera2.extension.Size mResolution;
    private int mFormat;
    private android.view.Surface mOutputSurface;
    private android.media.ImageWriter mOutputWriter;
    private java.util.concurrent.ConcurrentLinkedQueue<android.hardware.camera2.impl.CameraExtensionJpegProcessor.JpegParameters> mJpegParameters;
    public CameraExtensionJpegProcessor(android.hardware.camera2.extension.ICaptureProcessorImpl p0) {}
    public void close() {}
    private static android.hardware.camera2.impl.CameraExtensionJpegProcessor.JpegParameters getJpegParameters(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) { return null; }
    private static native int compressJpegFromYUV420pNative(int p0, int p1, java.nio.ByteBuffer p2, int p3, int p4, java.nio.ByteBuffer p5, int p6, int p7, java.nio.ByteBuffer p8, int p9, int p10, java.nio.ByteBuffer p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18);
    public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0) throws android.os.RemoteException {}
    public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
    public void onResolutionUpdate(android.hardware.camera2.extension.Size p0) throws android.os.RemoteException {}
    public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
    private void initializePipeline() throws android.os.RemoteException {}
    public android.os.IBinder asBinder() { return null; }

    private static final class JpegParameters {
        public java.util.HashSet<java.lang.Long> mTimeStamps;
        public int mRotation;
        public int mQuality;
        private JpegParameters() {}
    }

    private class YuvCallback implements android.media.ImageReader.OnImageAvailableListener {
        private YuvCallback(android.hardware.camera2.impl.CameraExtensionJpegProcessor p0) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
