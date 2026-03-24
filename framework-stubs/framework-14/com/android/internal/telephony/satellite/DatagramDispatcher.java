package com.android.internal.telephony.satellite;

public class DatagramDispatcher extends android.os.Handler {
    public static com.android.internal.telephony.satellite.DatagramDispatcher make(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.DatagramController p2) { return null; }
    protected DatagramDispatcher(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.DatagramController p2) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    public void retrySendingDatagrams() {}
    protected void setDemoMode(boolean p0) {}
    protected void onDeviceAlignedWithSatellite(boolean p0) {}
    protected long getSatelliteAlignedTimeoutDuration() { return 0L; }
    public void destroy() {}
    public void onSatelliteModemStateChanged(int p0) {}

    private static final class DatagramDispatcherHandlerRequest {
        public java.lang.Object argument;
        public com.android.internal.telephony.Phone phone;
        public java.lang.Object result;
        DatagramDispatcherHandlerRequest(java.lang.Object p0, com.android.internal.telephony.Phone p1) {}
    }

    private static final class SendSatelliteDatagramArgument {
        public int subId;
        public long datagramId;
        public int datagramType;
        public android.telephony.satellite.SatelliteDatagram datagram;
        public boolean needFullScreenPointingUI;
        public java.util.function.Consumer<java.lang.Integer> callback;
        public long datagramStartTime;
        public boolean skipCheckingSatelliteAligned;
        SendSatelliteDatagramArgument(int p0, long p1, int p2, android.telephony.satellite.SatelliteDatagram p3, boolean p4, java.util.function.Consumer<java.lang.Integer> p5) {}
        public int getDatagramRoundedSizeBytes() { return 0; }
        public void setDatagramStartTime() {}
    }
}
