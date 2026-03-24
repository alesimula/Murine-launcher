package android.hardware.cas;

public @interface SessionIntent {
    public static final int LIVE = 0;
    public static final int PLAYBACK = 1;
    public static final int RECORD = 2;
    public static final int TIMESHIFT = 3;
}
