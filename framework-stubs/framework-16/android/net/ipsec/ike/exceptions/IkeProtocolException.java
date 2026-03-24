package android.net.ipsec.ike.exceptions;

public abstract class IkeProtocolException extends android.net.ipsec.ike.exceptions.IkeException {
    public static final int ERROR_TYPE_AUTHENTICATION_FAILED = 24;
    public static final int ERROR_TYPE_CHILD_SA_NOT_FOUND = 44;
    public static final int ERROR_TYPE_FAILED_CP_REQUIRED = 37;
    public static final int ERROR_TYPE_INTERNAL_ADDRESS_FAILURE = 36;
    public static final int ERROR_TYPE_INVALID_IKE_SPI = 4;
    public static final int ERROR_TYPE_INVALID_KE_PAYLOAD = 17;
    public static final int ERROR_TYPE_INVALID_MAJOR_VERSION = 5;
    public static final int ERROR_TYPE_INVALID_MESSAGE_ID = 9;
    public static final int ERROR_TYPE_INVALID_SELECTORS = 39;
    public static final int ERROR_TYPE_INVALID_SYNTAX = 7;
    public static final int ERROR_TYPE_NO_ADDITIONAL_SAS = 35;
    public static final int ERROR_TYPE_NO_PROPOSAL_CHOSEN = 14;
    public static final int ERROR_TYPE_SINGLE_PAIR_REQUIRED = 34;
    public static final int ERROR_TYPE_TEMPORARY_FAILURE = 43;
    public static final int ERROR_TYPE_TS_UNACCEPTABLE = 38;
    public static final int ERROR_TYPE_UNSUPPORTED_CRITICAL_PAYLOAD = 1;
    IkeProtocolException() { super(); }
    @android.annotation.Nullable
    public byte[] getErrorData() { return null; }
    public int getErrorType() { return 0; }
}
