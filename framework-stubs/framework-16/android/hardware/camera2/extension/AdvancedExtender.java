package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class AdvancedExtender {
    public AdvancedExtender(android.hardware.camera2.CameraManager p0) {}
    void setCameraUsageTracker(android.hardware.camera2.extension.CameraUsageTracker p0) {}
    public long getMetadataVendorId(java.lang.String p0) { return 0L; }
    public abstract boolean isExtensionAvailable(java.lang.String p0, android.hardware.camera2.extension.CharacteristicsMap p1);
    public abstract void initialize(java.lang.String p0, android.hardware.camera2.extension.CharacteristicsMap p1);
    @android.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedPreviewOutputResolutions(java.lang.String p0);
    @android.annotation.NonNull
    public abstract java.util.Map<java.lang.Integer, java.util.List<android.util.Size>> getSupportedCaptureOutputResolutions(java.lang.String p0);
    @android.annotation.NonNull
    public abstract android.hardware.camera2.extension.SessionProcessor getSessionProcessor();
    @android.annotation.NonNull
    public abstract java.util.List<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(java.lang.String p0);
    @android.annotation.NonNull
    public abstract java.util.List<android.hardware.camera2.CaptureResult.Key> getAvailableCaptureResultKeys(java.lang.String p0);
    @android.annotation.NonNull
    public abstract java.util.List<android.util.Pair<android.hardware.camera2.CameraCharacteristics.Key, java.lang.Object>> getAvailableCharacteristicsKeyValues();
    @android.annotation.NonNull
    android.hardware.camera2.extension.IAdvancedExtenderImpl getAdvancedExtenderBinder() { return null; }

    private final class AdvancedExtenderImpl extends android.hardware.camera2.extension.IAdvancedExtenderImpl.Stub {
        public boolean isExtensionAvailable(java.lang.String p0, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p1) { return false; }
        public void init(java.lang.String p0, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p1) {}
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPostviewResolutions(android.hardware.camera2.extension.Size p0) { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedPreviewOutputResolutions(java.lang.String p0) { return null; }
        public java.util.List<android.hardware.camera2.extension.SizeList> getSupportedCaptureOutputResolutions(java.lang.String p0) { return null; }
        public android.hardware.camera2.extension.LatencyRange getEstimatedCaptureLatencyRange(java.lang.String p0, android.hardware.camera2.extension.Size p1, int p2) { return null; }
        public android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessor() { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureRequestKeys(java.lang.String p0) { return null; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCaptureResultKeys(java.lang.String p0) { return null; }
        public boolean isCaptureProcessProgressAvailable() { return false; }
        public boolean isPostviewAvailable() { return false; }
        public android.hardware.camera2.impl.CameraMetadataNative getAvailableCharacteristicsKeyValues(java.lang.String p0) { return null; }
    }
}
