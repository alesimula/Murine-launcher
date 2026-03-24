package android.hardware.power;

public @interface Mode {
    public static final int DOUBLE_TAP_TO_WAKE = 0;
    public static final int LOW_POWER = 1;
    public static final int SUSTAINED_PERFORMANCE = 2;
    public static final int FIXED_PERFORMANCE = 3;
    public static final int VR = 4;
    public static final int LAUNCH = 5;
    public static final int EXPENSIVE_RENDERING = 6;
    public static final int INTERACTIVE = 7;
    public static final int DEVICE_IDLE = 8;
    public static final int DISPLAY_INACTIVE = 9;
    public static final int AUDIO_STREAMING_LOW_LATENCY = 10;
    public static final int CAMERA_STREAMING_SECURE = 11;
    public static final int CAMERA_STREAMING_LOW = 12;
    public static final int CAMERA_STREAMING_MID = 13;
    public static final int CAMERA_STREAMING_HIGH = 14;
    public static final int GAME = 15;
    public static final int GAME_LOADING = 16;
    public static final int DISPLAY_CHANGE = 17;
    public static final int AUTOMOTIVE_PROJECTION = 18;
}
