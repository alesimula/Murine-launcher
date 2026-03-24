package android.hardware.radio.sim;

public @interface PinState {
    public static final int UNKNOWN = 0;
    public static final int ENABLED_NOT_VERIFIED = 1;
    public static final int ENABLED_VERIFIED = 2;
    public static final int DISABLED = 3;
    public static final int ENABLED_BLOCKED = 4;
    public static final int ENABLED_PERM_BLOCKED = 5;
}
