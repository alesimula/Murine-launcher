package android.telephony.ims.stub;

@android.annotation.SystemApi
public class RcsCapabilityExchangeImplBase {
    public static final int COMMAND_CODE_SERVICE_UNKNOWN = 0;
    public static final int COMMAND_CODE_GENERIC_FAILURE = 1;
    public static final int COMMAND_CODE_INVALID_PARAM = 2;
    public static final int COMMAND_CODE_FETCH_ERROR = 3;
    public static final int COMMAND_CODE_REQUEST_TIMEOUT = 4;
    public static final int COMMAND_CODE_INSUFFICIENT_MEMORY = 5;
    public static final int COMMAND_CODE_LOST_NETWORK_CONNECTION = 6;
    public static final int COMMAND_CODE_NOT_SUPPORTED = 7;
    public static final int COMMAND_CODE_NOT_FOUND = 8;
    public static final int COMMAND_CODE_SERVICE_UNAVAILABLE = 9;
    public static final int COMMAND_CODE_NO_CHANGE = 10;
    public RcsCapabilityExchangeImplBase() {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void subscribeForCapabilities(java.util.Collection<android.net.Uri> p0, android.telephony.ims.stub.RcsCapabilityExchangeImplBase.SubscribeResponseCallback p1) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void publishCapabilities(java.lang.String p0, android.telephony.ims.stub.RcsCapabilityExchangeImplBase.PublishResponseCallback p1) {}
    @android.annotation.SuppressLint("ExecutorRegistration")
    public void sendOptionsCapabilityRequest(android.net.Uri p0, java.util.Set<java.lang.String> p1, android.telephony.ims.stub.RcsCapabilityExchangeImplBase.OptionsResponseCallback p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CommandCode {
    }

    public static interface OptionsResponseCallback {
        public void onCommandError(int p0) throws android.telephony.ims.ImsException;
        public void onNetworkResponse(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.telephony.ims.ImsException;
    }

    public static interface PublishResponseCallback {
        public void onCommandError(int p0) throws android.telephony.ims.ImsException;
        @java.lang.Deprecated
        public void onNetworkResponse(int p0, java.lang.String p1) throws android.telephony.ims.ImsException;
        @java.lang.Deprecated
        public void onNetworkResponse(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.telephony.ims.ImsException;
        default public void onNetworkResponse(android.telephony.ims.SipDetails p0) throws android.telephony.ims.ImsException {}
    }

    public static interface SubscribeResponseCallback {
        public void onCommandError(int p0) throws android.telephony.ims.ImsException;
        @java.lang.Deprecated
        public void onNetworkResponse(int p0, java.lang.String p1) throws android.telephony.ims.ImsException;
        @java.lang.Deprecated
        public void onNetworkResponse(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.telephony.ims.ImsException;
        default public void onNetworkResponse(android.telephony.ims.SipDetails p0) throws android.telephony.ims.ImsException {}
        public void onNotifyCapabilitiesUpdate(java.util.List<java.lang.String> p0) throws android.telephony.ims.ImsException;
        public void onResourceTerminated(java.util.List<android.util.Pair<android.net.Uri, java.lang.String>> p0) throws android.telephony.ims.ImsException;
        public void onTerminated(java.lang.String p0, long p1) throws android.telephony.ims.ImsException;
    }
}
