package android.hardware.camera2.extension;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
public final class RequestProcessor {
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    RequestProcessor(android.hardware.camera2.extension.IRequestProcessorImpl p0, long p1) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public int submit(android.hardware.camera2.extension.RequestProcessor.Request p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.RequestProcessor.RequestCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public int submitBurst(java.util.List<android.hardware.camera2.extension.RequestProcessor.Request> p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.RequestProcessor.RequestCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public int setRepeating(android.hardware.camera2.extension.RequestProcessor.Request p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.RequestProcessor.RequestCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public void abortCaptures() {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public void stopRepeating() {}

    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public static final class Request {
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public Request(java.util.List<java.lang.Integer> p0, java.util.List<android.util.Pair<android.hardware.camera2.CaptureRequest.Key, java.lang.Object>> p1, int p2) {}
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        @android.annotation.NonNull
        java.util.List<java.lang.Integer> getOutputConfigIds() { return null; }
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        @android.annotation.NonNull
        public java.util.List<android.util.Pair<android.hardware.camera2.CaptureRequest.Key, java.lang.Object>> getParameters() { return null; }
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        java.lang.Integer getTemplateId() { return null; }
        @android.annotation.NonNull
        java.util.List<android.hardware.camera2.extension.OutputConfigId> getTargetIds() { return null; }
        @android.annotation.NonNull
        static android.hardware.camera2.impl.CameraMetadataNative getParametersMetadata(long p0, java.util.List<android.util.Pair<android.hardware.camera2.CaptureRequest.Key, java.lang.Object>> p1) { return null; }
        @android.annotation.NonNull
        static java.util.List<android.hardware.camera2.extension.Request> initializeParcelable(long p0, java.util.List<android.hardware.camera2.extension.RequestProcessor.Request> p1) { return null; }
    }

    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public static interface RequestCallback {
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureStarted(android.hardware.camera2.extension.RequestProcessor.Request p0, long p1, long p2);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureProgressed(android.hardware.camera2.extension.RequestProcessor.Request p0, android.hardware.camera2.CaptureResult p1);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureCompleted(android.hardware.camera2.extension.RequestProcessor.Request p0, android.hardware.camera2.TotalCaptureResult p1);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureFailed(android.hardware.camera2.extension.RequestProcessor.Request p0, android.hardware.camera2.CaptureFailure p1);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureBufferLost(android.hardware.camera2.extension.RequestProcessor.Request p0, long p1, int p2);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureSequenceCompleted(int p0, long p1);
        @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
        public void onCaptureSequenceAborted(int p0);
    }

    private static class RequestCallbackImpl extends android.hardware.camera2.extension.IRequestCallback.Stub {
        public RequestCallbackImpl(java.util.List<android.hardware.camera2.extension.RequestProcessor.Request> p0, android.hardware.camera2.extension.RequestProcessor.RequestCallback p1, java.util.concurrent.Executor p2) { super(); }
        public void onCaptureStarted(int p0, long p1, long p2) {}
        public void onCaptureProgressed(int p0, android.hardware.camera2.extension.ParcelCaptureResult p1) {}
        public void onCaptureCompleted(int p0, android.hardware.camera2.extension.ParcelTotalCaptureResult p1) {}
        public void onCaptureFailed(int p0, android.hardware.camera2.extension.CaptureFailure p1) {}
        public void onCaptureBufferLost(int p0, long p1, int p2) {}
        public void onCaptureSequenceCompleted(int p0, long p1) {}
        public void onCaptureSequenceAborted(int p0) {}
    }
}
