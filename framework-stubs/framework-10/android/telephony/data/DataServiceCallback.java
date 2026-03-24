package android.telephony.data;

@android.annotation.SystemApi
public class DataServiceCallback {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = true;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_ERROR_UNSUPPORTED = 1;
    public static final int RESULT_ERROR_INVALID_ARG = 2;
    public static final int RESULT_ERROR_BUSY = 3;
    public static final int RESULT_ERROR_ILLEGAL_STATE = 4;
    private final android.telephony.data.IDataServiceCallback mCallback = null;
    public DataServiceCallback(android.telephony.data.IDataServiceCallback p0) {}
    public void onSetupDataCallComplete(int p0, android.telephony.data.DataCallResponse p1) {}
    public void onDeactivateDataCallComplete(int p0) {}
    public void onSetInitialAttachApnComplete(int p0) {}
    public void onSetDataProfileComplete(int p0) {}
    public void onRequestDataCallListComplete(int p0, java.util.List<android.telephony.data.DataCallResponse> p1) {}
    public void onDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
