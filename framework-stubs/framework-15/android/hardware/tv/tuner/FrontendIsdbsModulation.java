package android.hardware.tv.tuner;

public @interface FrontendIsdbsModulation {
    public static final int UNDEFINED = 0;
    public static final int AUTO = 1;
    public static final int MOD_BPSK = 2;
    public static final int MOD_QPSK = 4;
    public static final int MOD_TC8PSK = 8;
}
