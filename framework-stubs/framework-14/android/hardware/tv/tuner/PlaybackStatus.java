package android.hardware.tv.tuner;

public @interface PlaybackStatus {
    public static final int SPACE_EMPTY = 1;
    public static final int SPACE_ALMOST_EMPTY = 2;
    public static final int SPACE_ALMOST_FULL = 4;
    public static final int SPACE_FULL = 8;
}
