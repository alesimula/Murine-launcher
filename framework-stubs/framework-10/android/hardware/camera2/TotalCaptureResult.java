package android.hardware.camera2;

public final class TotalCaptureResult extends android.hardware.camera2.CaptureResult {
    private final java.util.List<android.hardware.camera2.CaptureResult> mPartialResults = null;
    private final int mSessionId = 0;
    private final java.util.HashMap<java.lang.String, android.hardware.camera2.CaptureResult> mPhysicalCaptureResults = null;
    public TotalCaptureResult(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.impl.CaptureResultExtras p2, java.util.List<android.hardware.camera2.CaptureResult> p3, int p4, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p5) { super((android.hardware.camera2.impl.CameraMetadataNative)null, 0); }
    public TotalCaptureResult(android.hardware.camera2.impl.CameraMetadataNative p0, int p1) { super((android.hardware.camera2.impl.CameraMetadataNative)null, 0); }
    public java.util.List<android.hardware.camera2.CaptureResult> getPartialResults() { return null; }
    public int getSessionId() { return 0; }
    public java.util.Map<java.lang.String, android.hardware.camera2.CaptureResult> getPhysicalCameraResults() { return null; }
}
