package android.hardware.tv.tuner;

public @interface FrontendIsdbtModulation {
    public static final int UNDEFINED = 0;
    public static final int AUTO = 1;
    public static final int MOD_DQPSK = 2;
    public static final int MOD_QPSK = 4;
    public static final int MOD_16QAM = 8;
    public static final int MOD_64QAM = 16;
}
