package android.hardware.camera2.impl;

public abstract class CaptureCallback {
    private java.util.concurrent.Executor mExecutor;
    private android.hardware.camera2.CameraCaptureSession.CaptureCallback mCallback;
    public CaptureCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1) {}
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCallback() { return null; }
    public abstract void onCaptureStarted(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3);
    public abstract void onCapturePartial(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2);
    public abstract void onCaptureProgressed(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2);
    public abstract void onCaptureCompleted(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2);
    public abstract void onCaptureFailed(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2);
    public abstract void onCaptureSequenceCompleted(android.hardware.camera2.CameraDevice p0, int p1, long p2);
    public abstract void onCaptureSequenceAborted(android.hardware.camera2.CameraDevice p0, int p1);
    public abstract void onCaptureBufferLost(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3);
}
