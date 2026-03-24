package android.hardware.camera2.impl;

public class CameraExtensionJpegProcessor implements android.hardware.camera2.extension.ICaptureProcessorImpl {
    public static final java.lang.String TAG = "CameraExtensionJpeg";
    public CameraExtensionJpegProcessor(android.hardware.camera2.extension.ICaptureProcessorImpl p0) {}
    public void close() {}
    public void process(java.util.List<android.hardware.camera2.extension.CaptureBundle> p0, android.hardware.camera2.extension.IProcessResultImpl p1, boolean p2) throws android.os.RemoteException {}
    public void onOutputSurface(android.view.Surface p0, int p1) throws android.os.RemoteException {}
    public void onPostviewOutputSurface(android.view.Surface p0) throws android.os.RemoteException {}
    public void onResolutionUpdate(android.hardware.camera2.extension.Size p0, android.hardware.camera2.extension.Size p1) throws android.os.RemoteException {}
    public void onImageFormatUpdate(int p0) throws android.os.RemoteException {}
    public android.os.IBinder asBinder() { return null; }

    private static final class JpegParameters {
        public java.util.HashSet<java.lang.Long> mTimeStamps;
        public int mRotation;
        public int mQuality;
    }

    private class YuvCallback implements android.media.ImageReader.OnImageAvailableListener {
        public YuvCallback(android.hardware.camera2.impl.CameraExtensionJpegProcessor p0, android.media.ImageReader p1, android.media.ImageWriter p2) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }
}
