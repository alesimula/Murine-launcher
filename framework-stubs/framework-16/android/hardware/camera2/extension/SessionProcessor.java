package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class SessionProcessor {
    public SessionProcessor() {}
    void setCameraUsageTracker(android.hardware.camera2.extension.CameraUsageTracker p0) {}
    @android.annotation.NonNull
    public abstract android.hardware.camera2.extension.ExtensionConfiguration initSession(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.extension.CharacteristicsMap p2, android.hardware.camera2.extension.CameraOutputSurface p3, android.hardware.camera2.extension.CameraOutputSurface p4);
    public abstract void deInitSession(android.os.IBinder p0);
    public abstract void onCaptureSessionStart(android.hardware.camera2.extension.RequestProcessor p0, java.lang.String p1);
    public abstract void onCaptureSessionEnd();
    public abstract int startRepeating(java.util.concurrent.Executor p0, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p1);
    public abstract void stopRepeating();
    public abstract int startMultiFrameCapture(java.util.concurrent.Executor p0, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p1);
    public abstract void setParameters(android.hardware.camera2.CaptureRequest p0);
    public abstract int startTrigger(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p2);
    @android.annotation.NonNull
    android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessorBinder() { return null; }

    @android.annotation.SystemApi
    public static interface CaptureCallback {
        public void onCaptureStarted(int p0, long p1);
        public void onCaptureProcessStarted(int p0);
        public void onCaptureFailed(int p0, int p1);
        public void onCaptureSequenceCompleted(int p0);
        public void onCaptureSequenceAborted(int p0);
        public void onCaptureCompleted(long p0, int p1, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> p2);
    }

    private static final class CaptureCallbackImpl implements android.hardware.camera2.extension.SessionProcessor.CaptureCallback {
        CaptureCallbackImpl(android.hardware.camera2.extension.ICaptureCallback p0, long p1) {}
        public void onCaptureStarted(int p0, long p1) {}
        public void onCaptureProcessStarted(int p0) {}
        public void onCaptureFailed(int p0, int p1) {}
        public void onCaptureSequenceCompleted(int p0) {}
        public void onCaptureSequenceAborted(int p0) {}
        public void onCaptureCompleted(long p0, int p1, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> p2) {}
    }

    private final class SessionProcessorImpl extends android.hardware.camera2.extension.ISessionProcessorImpl.Stub {
        android.hardware.camera2.extension.OutputSurface mImageCaptureSurface;
        android.hardware.camera2.extension.OutputSurface mPreviewSurface;
        android.hardware.camera2.extension.OutputSurface mPostviewSurface;
        public android.hardware.camera2.extension.CameraSessionConfig initSession(android.os.IBinder p0, java.lang.String p1, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p2, android.hardware.camera2.extension.OutputSurface p3, android.hardware.camera2.extension.OutputSurface p4, android.hardware.camera2.extension.OutputSurface p5) throws android.os.RemoteException { return null; }
        public void deInitSession(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCaptureSessionEnd() throws android.os.RemoteException {}
        public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException { return 0; }
        public void stopRepeating() throws android.os.RemoteException {}
        public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setParameters(android.hardware.camera2.CaptureRequest p0) throws android.os.RemoteException {}
        public int startTrigger(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.extension.ICaptureCallback p1) throws android.os.RemoteException { return 0; }
        public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException { return null; }
    }
}
