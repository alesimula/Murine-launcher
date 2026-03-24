package android.telephony.ims;

public final class ImsException extends java.lang.Exception {
    public static final int CODE_ERROR_UNSPECIFIED = 0;
    public static final int CODE_ERROR_SERVICE_UNAVAILABLE = 1;
    public static final int CODE_ERROR_UNSUPPORTED_OPERATION = 2;
    public static final int CODE_ERROR_INVALID_SUBSCRIPTION = 3;
    private int mCode;
    @android.annotation.SystemApi
    public ImsException(java.lang.String p0) { super(); }
    @android.annotation.SystemApi
    public ImsException(java.lang.String p0, int p1) { super(); }
    @android.annotation.SystemApi
    public ImsException(java.lang.String p0, int p1, java.lang.Throwable p2) { super(); }
    public int getCode() { return 0; }
    private static java.lang.String getMessage(java.lang.String p0, int p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsErrorCode {
    }
}
