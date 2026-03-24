package android.service.carrier;

@android.annotation.SystemApi
public final class CarrierMessagingServiceWrapper implements java.lang.AutoCloseable {
    private volatile android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingServiceConnection mCarrierMessagingServiceConnection;
    private volatile android.service.carrier.ICarrierMessagingService mICarrierMessagingService;
    private java.lang.Runnable mOnServiceReadyCallback;
    private java.util.concurrent.Executor mServiceReadyCallbackExecutor;
    private android.content.Context mContext;
    public CarrierMessagingServiceWrapper() {}
    @android.annotation.SystemApi
    public boolean bindToCarrierMessagingService(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) { return false; }
    @android.annotation.SystemApi
    public void disconnect() {}
    private void onServiceReady(android.service.carrier.ICarrierMessagingService p0) {}
    @android.annotation.SystemApi
    public void receiveSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, java.util.concurrent.Executor p4, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p5) {}
    @android.annotation.SystemApi
    public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, java.util.concurrent.Executor p4, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p5) {}
    @android.annotation.SystemApi
    public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, java.util.concurrent.Executor p5, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p6) {}
    @android.annotation.SystemApi
    public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, java.util.concurrent.Executor p4, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p5) {}
    @android.annotation.SystemApi
    public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, java.util.concurrent.Executor p3, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p4) {}
    @android.annotation.SystemApi
    public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, java.util.concurrent.Executor p3, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p4) {}
    public void close() {}

    @android.annotation.SystemApi
    public static interface CarrierMessagingCallback {
        default public void onReceiveSmsComplete(int p0) {}
        default public void onSendSmsComplete(int p0, int p1) {}
        default public void onSendMultipartSmsComplete(int p0, int[] p1) {}
        default public void onSendMmsComplete(int p0, byte[] p1) {}
        default public void onDownloadMmsComplete(int p0) {}
    }

    private final class CarrierMessagingCallbackInternal extends android.service.carrier.ICarrierMessagingCallback.Stub {
        final android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback mCarrierMessagingCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        CarrierMessagingCallbackInternal(android.service.carrier.CarrierMessagingServiceWrapper p0, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallback p1, java.util.concurrent.Executor p2) { super(); }
        public void onFilterComplete(int p0) throws android.os.RemoteException {}
        public void onSendSmsComplete(int p0, int p1) throws android.os.RemoteException {}
        public void onSendMultipartSmsComplete(int p0, int[] p1) throws android.os.RemoteException {}
        public void onSendMmsComplete(int p0, byte[] p1) throws android.os.RemoteException {}
        public void onDownloadMmsComplete(int p0) throws android.os.RemoteException {}
    }

    private final class CarrierMessagingServiceConnection implements android.content.ServiceConnection {
        private CarrierMessagingServiceConnection(android.service.carrier.CarrierMessagingServiceWrapper p0) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
