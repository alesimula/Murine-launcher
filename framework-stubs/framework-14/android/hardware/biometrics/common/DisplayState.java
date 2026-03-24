package android.hardware.biometrics.common;

public @interface DisplayState {
    public static final int UNKNOWN = 0;
    public static final int LOCKSCREEN = 1;
    public static final int NO_UI = 2;
    public static final int SCREENSAVER = 3;
    public static final int AOD = 4;
}
