package android.hardware.camera2.impl;

public class CallbackProxies {

    public static class SessionStateCallbackProxy extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        public SessionStateCallbackProxy(java.util.concurrent.Executor p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1) { super(); }
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onReady(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onActive(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession p0, android.view.Surface p1) {}
    }
}
