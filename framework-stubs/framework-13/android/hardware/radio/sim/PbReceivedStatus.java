package android.hardware.radio.sim;

public @interface PbReceivedStatus {
    public static final byte PB_RECEIVED_OK = 1;
    public static final byte PB_RECEIVED_ERROR = 2;
    public static final byte PB_RECEIVED_ABORT = 3;
    public static final byte PB_RECEIVED_FINAL = 4;
}
