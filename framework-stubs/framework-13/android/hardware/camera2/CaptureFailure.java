package android.hardware.camera2;

public class CaptureFailure {
    public static final int REASON_ERROR = 0;
    public static final int REASON_FLUSHED = 1;
    public CaptureFailure(android.hardware.camera2.CaptureRequest p0, int p1, boolean p2, int p3, long p4, java.lang.String p5) {}
    public android.hardware.camera2.CaptureRequest getRequest() { return null; }
    public long getFrameNumber() { return 0L; }
    public int getReason() { return 0; }
    public boolean wasImageCaptured() { return false; }
    public int getSequenceId() { return 0; }
    public java.lang.String getPhysicalCameraId() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureReason {
    }
}
