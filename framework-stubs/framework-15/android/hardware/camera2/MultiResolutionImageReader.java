package android.hardware.camera2;

public class MultiResolutionImageReader implements java.lang.AutoCloseable {
    public MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.multiresolution_imagereader_usage_config")
    public MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2, long p3) {}
    @android.annotation.SuppressLint({"ExecutorRegistration", "SamShouldBeLast"})
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, java.util.concurrent.Executor p1) {}
    public void close() {}
    protected void finalize() {}
    public void flush() {}
    public void flushOther(android.media.ImageReader p0) {}
    @android.annotation.NonNull
    public android.media.ImageReader[] getReaders() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.camera_device_setup")
    @android.annotation.NonNull
    public android.view.Surface getSurface(android.util.Size p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public android.view.Surface getSurface() { return null; }
    @android.annotation.NonNull
    public android.hardware.camera2.params.MultiResolutionStreamInfo getStreamInfoForImageReader(android.media.ImageReader p0) { return null; }
}
