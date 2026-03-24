package com.android.internal.telephony.uicc.euicc;

public class EuiccCardErrorException extends com.android.internal.telephony.uicc.euicc.EuiccCardException {
    public static final int OPERATION_UNKNOWN = 0;
    public static final int OPERATION_GET_PROFILE = 1;
    public static final int OPERATION_PREPARE_DOWNLOAD = 2;
    public static final int OPERATION_AUTHENTICATE_SERVER = 3;
    public static final int OPERATION_CANCEL_SESSION = 4;
    public static final int OPERATION_LOAD_BOUND_PROFILE_PACKAGE = 5;
    public static final int OPERATION_LIST_NOTIFICATIONS = 6;
    public static final int OPERATION_SET_NICKNAME = 7;
    public static final int OPERATION_RETRIEVE_NOTIFICATION = 8;
    public static final int OPERATION_REMOVE_NOTIFICATION_FROM_LIST = 9;
    public static final int OPERATION_SWITCH_TO_PROFILE = 10;
    public static final int OPERATION_DISABLE_PROFILE = 11;
    public static final int OPERATION_DELETE_PROFILE = 12;
    public static final int OPERATION_RESET_MEMORY = 13;
    public static final int OPERATION_SET_DEFAULT_SMDP_ADDRESS = 14;
    public EuiccCardErrorException(int p0, int p1) { super(); }
    public EuiccCardErrorException(int p0, int p1, com.android.internal.telephony.uicc.asn1.Asn1Node p2) { super(); }
    public int getErrorCode() { return 0; }
    public int getOperationCode() { return 0; }
    public com.android.internal.telephony.uicc.asn1.Asn1Node getErrorDetails() { return null; }
    public java.lang.String getMessage() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationCode {
    }
}
