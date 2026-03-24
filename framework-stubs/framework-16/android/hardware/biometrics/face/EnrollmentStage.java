package android.hardware.biometrics.face;

public @interface EnrollmentStage {
    public static final byte UNKNOWN = 0;
    public static final byte FIRST_FRAME_RECEIVED = 1;
    public static final byte WAITING_FOR_CENTERING = 2;
    public static final byte HOLD_STILL_IN_CENTER = 3;
    public static final byte ENROLLING_MOVEMENT_1 = 4;
    public static final byte ENROLLING_MOVEMENT_2 = 5;
    public static final byte ENROLLMENT_FINISHED = 6;
}
