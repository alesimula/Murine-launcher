package android.hardware.power;

public @interface SessionMode {
    public static final int POWER_EFFICIENCY = 0;
    public static final int GRAPHICS_PIPELINE = 1;
    public static final int AUTO_CPU = 2;
    public static final int AUTO_GPU = 3;
}
