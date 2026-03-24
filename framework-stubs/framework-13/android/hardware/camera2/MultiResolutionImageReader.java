package android.hardware.camera2;

public class MultiResolutionImageReader implements java.lang.AutoCloseable {
    public MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2) {}
    @android.annotation.SuppressLint({"ExecutorRegistration", "SamShouldBeLast"})
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, java.util.concurrent.Executor p1) {}
    public void close() {}
    protected void finalize() {}
    public void flush() {}
    public void flushOther(android.media.ImageReader p0) {}
    public android.media.ImageReader[] getReaders() { return null; }
    public android.view.Surface getSurface() { return null; }
    public android.hardware.camera2.params.MultiResolutionStreamInfo getStreamInfoForImageReader(android.media.ImageReader p0) { return null; }
}
