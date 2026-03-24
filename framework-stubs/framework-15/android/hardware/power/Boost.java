package android.hardware.power;

public @interface Boost {
    public static final int INTERACTION = 0;
    public static final int DISPLAY_UPDATE_IMMINENT = 1;
    public static final int ML_ACC = 2;
    public static final int AUDIO_LAUNCH = 3;
    public static final int CAMERA_LAUNCH = 4;
    public static final int CAMERA_SHOT = 5;
}
