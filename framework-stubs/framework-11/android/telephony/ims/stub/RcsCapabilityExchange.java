package android.telephony.ims.stub;

public class RcsCapabilityExchange {
    public static final int COMMAND_CODE_SERVICE_UNKNOWN = 0;
    public static final int COMMAND_CODE_SUCCESS = 1;
    public static final int COMMAND_CODE_GENERIC_FAILURE = 2;
    public static final int COMMAND_CODE_INVALID_PARAM = 3;
    public static final int COMMAND_CODE_FETCH_ERROR = 4;
    public static final int COMMAND_CODE_REQUEST_TIMEOUT = 5;
    public static final int COMMAND_CODE_INSUFFICIENT_MEMORY = 6;
    public static final int COMMAND_CODE_LOST_NETWORK_CONNECTION = 7;
    public static final int COMMAND_CODE_NOT_SUPPORTED = 8;
    public static final int COMMAND_CODE_NOT_FOUND = 9;
    public static final int COMMAND_CODE_SERVICE_UNAVAILABLE = 10;
    public static final int COMMAND_CODE_NO_CHANGE_IN_CAP = 11;
    private android.telephony.ims.feature.RcsFeature mFeature;
    public RcsCapabilityExchange() {}
    public final void initialize(android.telephony.ims.feature.RcsFeature p0) {}
    protected final android.telephony.ims.aidl.IRcsFeatureListener getListener() throws android.telephony.ims.ImsException { return null; }
    public final void onCommandUpdate(int p0, int p1) throws android.telephony.ims.ImsException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CommandCode {
    }
}
