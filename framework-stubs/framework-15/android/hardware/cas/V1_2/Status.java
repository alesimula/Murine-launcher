package android.hardware.cas.V1_2;

public final class Status {
    public static final int OK = 0;
    public static final int ERROR_CAS_NO_LICENSE = 1;
    public static final int ERROR_CAS_LICENSE_EXPIRED = 2;
    public static final int ERROR_CAS_SESSION_NOT_OPENED = 3;
    public static final int ERROR_CAS_CANNOT_HANDLE = 4;
    public static final int ERROR_CAS_INVALID_STATE = 5;
    public static final int BAD_VALUE = 6;
    public static final int ERROR_CAS_NOT_PROVISIONED = 7;
    public static final int ERROR_CAS_RESOURCE_BUSY = 8;
    public static final int ERROR_CAS_INSUFFICIENT_OUTPUT_PROTECTION = 9;
    public static final int ERROR_CAS_TAMPER_DETECTED = 10;
    public static final int ERROR_CAS_DEVICE_REVOKED = 11;
    public static final int ERROR_CAS_DECRYPT_UNIT_NOT_INITIALIZED = 12;
    public static final int ERROR_CAS_DECRYPT = 13;
    public static final int ERROR_CAS_UNKNOWN = 14;
    public static final int ERROR_CAS_NEED_ACTIVATION = 15;
    public static final int ERROR_CAS_NEED_PAIRING = 16;
    public static final int ERROR_CAS_NO_CARD = 17;
    public static final int ERROR_CAS_CARD_MUTE = 18;
    public static final int ERROR_CAS_CARD_INVALID = 19;
    public static final int ERROR_CAS_BLACKOUT = 20;
    public static final int ERROR_CAS_REBOOTING = 21;
    public Status() {}
    public static final java.lang.String toString(int p0) { return null; }
    public static final java.lang.String dumpBitfield(int p0) { return null; }
}
