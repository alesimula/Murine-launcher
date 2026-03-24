package android.service.carrier;

public abstract class CarrierMessagingServiceWrapper {
    private volatile android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingServiceConnection mCarrierMessagingServiceConnection;
    private volatile android.service.carrier.ICarrierMessagingService mICarrierMessagingService;
    public CarrierMessagingServiceWrapper() {}
    public boolean bindToCarrierMessagingService(android.content.Context p0, java.lang.String p1) { return false; }
    public void disposeConnection(android.content.Context p0) {}
    public abstract void onServiceReady();
    private void onServiceReady(android.service.carrier.ICarrierMessagingService p0) {}
    public void filterSms(android.service.carrier.MessagePdu p0, java.lang.String p1, int p2, int p3, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p4) {}
    public void sendTextSms(java.lang.String p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p4) {}
    public void sendDataSms(byte[] p0, int p1, java.lang.String p2, int p3, int p4, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p5) {}
    public void sendMultipartTextSms(java.util.List<java.lang.String> p0, int p1, java.lang.String p2, int p3, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p4) {}
    public void sendMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p3) {}
    public void downloadMms(android.net.Uri p0, int p1, android.net.Uri p2, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p3) {}

    public static abstract class CarrierMessagingCallbackWrapper {
        public CarrierMessagingCallbackWrapper() {}
        public void onFilterComplete(int p0) {}
        public void onSendSmsComplete(int p0, int p1) {}
        public void onSendMultipartSmsComplete(int p0, int[] p1) {}
        public void onSendMmsComplete(int p0, byte[] p1) {}
        public void onDownloadMmsComplete(int p0) {}
    }

    private final class CarrierMessagingCallbackWrapperInternal extends android.service.carrier.ICarrierMessagingCallback.Stub {
        android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper mCarrierMessagingCallbackWrapper;
        CarrierMessagingCallbackWrapperInternal(android.service.carrier.CarrierMessagingServiceWrapper p0, android.service.carrier.CarrierMessagingServiceWrapper.CarrierMessagingCallbackWrapper p1) { super(); }
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
