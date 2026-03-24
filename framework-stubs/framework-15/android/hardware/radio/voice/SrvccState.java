package android.hardware.radio.voice;

public @interface SrvccState {
    public static final int HANDOVER_STARTED = 0;
    public static final int HANDOVER_COMPLETED = 1;
    public static final int HANDOVER_FAILED = 2;
    public static final int HANDOVER_CANCELED = 3;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
