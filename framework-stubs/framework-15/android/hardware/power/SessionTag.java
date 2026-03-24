package android.hardware.power;

public @interface SessionTag {
    public static final int OTHER = 0;
    public static final int SURFACEFLINGER = 1;
    public static final int HWUI = 2;
    public static final int GAME = 3;
    public static final int APP = 4;
}
