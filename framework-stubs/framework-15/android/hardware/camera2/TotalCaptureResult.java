package android.hardware.camera2;

public final class TotalCaptureResult extends android.hardware.camera2.CaptureResult {
    public TotalCaptureResult(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1, android.hardware.camera2.CaptureRequest p2, android.hardware.camera2.impl.CaptureResultExtras p3, java.util.List<android.hardware.camera2.CaptureResult> p4, int p5, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p6) { super((android.hardware.camera2.impl.CameraMetadataNative)null, 0); }
    public TotalCaptureResult(java.lang.String p0, android.hardware.camera2.impl.CameraMetadataNative p1, android.hardware.camera2.CaptureRequest p2, int p3, long p4, java.util.List<android.hardware.camera2.CaptureResult> p5, int p6, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p7) { super((android.hardware.camera2.impl.CameraMetadataNative)null, 0); }
    public TotalCaptureResult(android.hardware.camera2.impl.CameraMetadataNative p0, int p1) { super((android.hardware.camera2.impl.CameraMetadataNative)null, 0); }
    @android.annotation.NonNull
    public java.util.List<android.hardware.camera2.CaptureResult> getPartialResults() { return null; }
    public int getSessionId() { return 0; }
    public java.util.Map<java.lang.String, android.hardware.camera2.CaptureResult> getPhysicalCameraResults() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.hardware.camera2.TotalCaptureResult> getPhysicalCameraTotalResults() { return null; }
}
