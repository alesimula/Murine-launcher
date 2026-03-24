package android.hardware.camera2.legacy;

public class CameraDeviceState {
    private static final java.lang.String TAG = "CameraDeviceState";
    private static final boolean DEBUG = false;
    private static final int STATE_ERROR = 0;
    private static final int STATE_UNCONFIGURED = 1;
    private static final int STATE_CONFIGURING = 2;
    private static final int STATE_IDLE = 3;
    private static final int STATE_CAPTURING = 4;
    private static final java.lang.String[] sStateNames = null;
    private int mCurrentState;
    private int mCurrentError;
    private android.hardware.camera2.legacy.RequestHolder mCurrentRequest;
    private android.os.Handler mCurrentHandler;
    private android.hardware.camera2.legacy.CameraDeviceState.CameraDeviceStateListener mCurrentListener;
    public static final int NO_CAPTURE_ERROR = -1;
    public CameraDeviceState() {}
    public synchronized void setError(int p0) {}
    public synchronized boolean setConfiguring() { return false; }
    public synchronized boolean setIdle() { return false; }
    public synchronized boolean setCaptureStart(android.hardware.camera2.legacy.RequestHolder p0, long p1, int p2) { return false; }
    public synchronized boolean setCaptureResult(android.hardware.camera2.legacy.RequestHolder p0, android.hardware.camera2.impl.CameraMetadataNative p1, int p2, java.lang.Object p3) { return false; }
    public synchronized boolean setCaptureResult(android.hardware.camera2.legacy.RequestHolder p0, android.hardware.camera2.impl.CameraMetadataNative p1) { return false; }
    public synchronized void setRepeatingRequestError(long p0, int p1) {}
    public synchronized void setRequestQueueEmpty() {}
    public synchronized void setCameraDeviceCallbacks(android.os.Handler p0, android.hardware.camera2.legacy.CameraDeviceState.CameraDeviceStateListener p1) {}
    private void doStateTransition(int p0) {}
    private void doStateTransition(int p0, long p1, int p2) {}

    public static interface CameraDeviceStateListener {
        public void onError(int p0, java.lang.Object p1, android.hardware.camera2.legacy.RequestHolder p2);
        public void onConfiguring();
        public void onIdle();
        public void onBusy();
        public void onCaptureStarted(android.hardware.camera2.legacy.RequestHolder p0, long p1);
        public void onCaptureResult(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.legacy.RequestHolder p1);
        public void onRequestQueueEmpty();
        public void onRepeatingRequestError(long p0, int p1);
    }
}
