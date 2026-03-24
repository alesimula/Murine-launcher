package android.hardware.radio.network;

public @interface PhoneRestrictedState {
    public static final int NONE = 0;
    public static final int CS_EMERGENCY = 1;
    public static final int CS_NORMAL = 2;
    public static final int CS_ALL = 4;
    public static final int PS_ALL = 16;
}
