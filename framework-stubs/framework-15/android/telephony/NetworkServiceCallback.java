package android.telephony;

@android.annotation.SystemApi
public class NetworkServiceCallback {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_ERROR_UNSUPPORTED = 1;
    public static final int RESULT_ERROR_INVALID_ARG = 2;
    public static final int RESULT_ERROR_BUSY = 3;
    public static final int RESULT_ERROR_ILLEGAL_STATE = 4;
    public static final int RESULT_ERROR_FAILED = 5;
    public NetworkServiceCallback(android.telephony.INetworkServiceCallback p0) {}
    public void onRequestNetworkRegistrationInfoComplete(int p0, android.telephony.NetworkRegistrationInfo p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }
}
