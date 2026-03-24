package android.telecom;

public final class CallException extends java.lang.RuntimeException implements android.os.Parcelable {
    public static final java.lang.String TRANSACTION_EXCEPTION_KEY = "TelecomTransactionalExceptionKey";
    public static final int CODE_ERROR_UNKNOWN = 1;
    public static final int CODE_CANNOT_HOLD_CURRENT_ACTIVE_CALL = 2;
    public static final int CODE_CALL_IS_NOT_BEING_TRACKED = 3;
    public static final int CODE_CALL_CANNOT_BE_SET_TO_ACTIVE = 4;
    public static final int CODE_CALL_NOT_PERMITTED_AT_PRESENT_TIME = 5;
    public static final int CODE_OPERATION_TIMED_OUT = 6;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.CallException> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public CallException(java.lang.String p0, int p1) { super(); }
    public int getCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallErrorCode {
    }
}
