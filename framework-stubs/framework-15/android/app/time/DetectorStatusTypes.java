package android.app.time;

public final class DetectorStatusTypes {
    public static final int DETECTOR_STATUS_UNKNOWN = 0;
    public static final int DETECTOR_STATUS_NOT_SUPPORTED = 1;
    public static final int DETECTOR_STATUS_NOT_RUNNING = 2;
    public static final int DETECTOR_STATUS_RUNNING = 3;
    public static final int DETECTION_ALGORITHM_STATUS_UNKNOWN = 0;
    public static final int DETECTION_ALGORITHM_STATUS_NOT_SUPPORTED = 1;
    public static final int DETECTION_ALGORITHM_STATUS_NOT_RUNNING = 2;
    public static final int DETECTION_ALGORITHM_STATUS_RUNNING = 3;
    public static int requireValidDetectorStatus(int p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String detectorStatusToString(int p0) { return null; }
    public static int detectorStatusFromString(java.lang.String p0) { return 0; }
    public static int requireValidDetectionAlgorithmStatus(int p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String detectionAlgorithmStatusToString(int p0) { return null; }
    public static int detectionAlgorithmStatusFromString(java.lang.String p0) { return 0; }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DetectionAlgorithmStatus {
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DetectorStatus {
    }
}
