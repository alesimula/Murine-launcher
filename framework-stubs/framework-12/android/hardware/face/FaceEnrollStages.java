package android.hardware.face;

public final class FaceEnrollStages {
    public static final int UNKNOWN = 0;
    public static final int FIRST_FRAME_RECEIVED = 1;
    public static final int WAITING_FOR_CENTERING = 2;
    public static final int HOLD_STILL_IN_CENTER = 3;
    public static final int ENROLLING_MOVEMENT_1 = 4;
    public static final int ENROLLING_MOVEMENT_2 = 5;
    public static final int ENROLLMENT_FINISHED = 6;
    private FaceEnrollStages() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FaceEnrollStage {
    }
}
