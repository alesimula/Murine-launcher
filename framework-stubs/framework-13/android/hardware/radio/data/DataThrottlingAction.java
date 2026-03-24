package android.hardware.radio.data;

public @interface DataThrottlingAction {
    public static final byte NO_DATA_THROTTLING = 0;
    public static final byte THROTTLE_SECONDARY_CARRIER = 1;
    public static final byte THROTTLE_ANCHOR_CARRIER = 2;
    public static final byte HOLD = 3;
}
