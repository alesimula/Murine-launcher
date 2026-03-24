package android.service.carrier;

public abstract class CarrierMessagingService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
    public static final int RECEIVE_OPTIONS_DEFAULT = 0;
    public static final int RECEIVE_OPTIONS_DROP = 1;
    public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
    public static final int SEND_STATUS_OK = 0;
    public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final int SEND_STATUS_ERROR = 2;
    public static final int DOWNLOAD_STATUS_OK = 0;
    public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final int DOWNLOAD_STATUS_ERROR = 2;
    public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
    private final android.service.carrier.CarrierMessagingService.ICarrierMessagingWrapper mWrapper = null;
    public CarrierMessagingService() { super(); }
    @java.lang.Deprecated
    public void onFilterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Boolean> p4) {}
    public void onReceiveTextSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> p4) {}
    @java.lang.Deprecated
    public void onSendTextSms(java.lang.String p0, int p1, java.lang.String p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p3) {}
    public void onSendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p4) {}
    @java.lang.Deprecated
    public void onSendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p4) {}
    public void onSendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> p5) {}
    @java.lang.Deprecated
    public void onSendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> p3) {}
    public void onSendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> p4) {}
    public void onSendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMmsResult> p3) {}
    public void onDownloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> p3) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public static final class SendSmsResult {
        private final int mSendStatus = 0;
        private final int mMessageRef = 0;
        public SendSmsResult(int p0, int p1) {}
        public int getMessageRef() { return 0; }
        public int getSendStatus() { return 0; }
    }

    public static final class SendMultipartSmsResult {
        private final int mSendStatus = 0;
        private final int[] mMessageRefs = null;
        public SendMultipartSmsResult(int p0, int[] p1) {}
        public int[] getMessageRefs() { return null; }
        public int getSendStatus() { return 0; }
    }

    public static final class SendMmsResult {
        private int mSendStatus;
        private byte[] mSendConfPdu;
        public SendMmsResult(int p0, byte[] p1) {}
        public int getSendStatus() { return 0; }
        public byte[] getSendConfPdu() { return null; }
    }

    public static interface ResultCallback<T extends java.lang.Object> {
        public void onReceiveResult(T p0) throws android.os.RemoteException;
    }

    private class ICarrierMessagingWrapper extends android.service.carrier.ICarrierMessagingService.Stub {
        private ICarrierMessagingWrapper(android.service.carrier.CarrierMessagingService p0) { super(); }
        public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
        public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
        public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.ICarrierMessagingCallback p5) {}
        public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.ICarrierMessagingCallback p4) {}
        public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) {}
        public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.ICarrierMessagingCallback p3) {}
    }
}
