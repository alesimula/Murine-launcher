package android.hardware.biometrics.common;

public @interface OperationReason {
    public static final byte UNKNOWN = 0;
    public static final byte BIOMETRIC_PROMPT = 1;
    public static final byte KEYGUARD = 2;
}
