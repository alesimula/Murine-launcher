package android.hardware.radio.voice;

public @interface SrvccState {
    public static final int HANDOVER_STARTED = 0;
    public static final int HANDOVER_COMPLETED = 1;
    public static final int HANDOVER_FAILED = 2;
    public static final int HANDOVER_CANCELED = 3;
}
