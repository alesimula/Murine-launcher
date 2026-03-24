package android.hardware.power;

public @interface SessionHint {
    public static final int CPU_LOAD_UP = 0;
    public static final int CPU_LOAD_DOWN = 1;
    public static final int CPU_LOAD_RESET = 2;
    public static final int CPU_LOAD_RESUME = 3;
    public static final int POWER_EFFICIENCY = 4;
    public static final int GPU_LOAD_UP = 5;
    public static final int GPU_LOAD_DOWN = 6;
    public static final int GPU_LOAD_RESET = 7;
}
