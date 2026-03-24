package com.android.internal.telephony.satellite;

public class DatagramReceiver extends android.os.Handler {
    public static com.android.internal.telephony.satellite.DatagramReceiver make(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.DatagramController p2) { return null; }
    protected DatagramReceiver(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.DatagramController p2) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) { return 0; }
    public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) {}
    public void pollPendingSatelliteDatagrams(int p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void onSatelliteModemStateChanged(int p0) {}
    protected void setDemoMode(boolean p0) {}
    protected void onDeviceAlignedWithSatellite(boolean p0) {}
    protected long getSatelliteAlignedTimeoutDuration() { return 0L; }
    public void destroy() {}

    private static final class DatagramReceiverHandlerRequest {
        public java.lang.Object argument;
        public com.android.internal.telephony.Phone phone;
        public int subId;
        public java.lang.Object result;
        DatagramReceiverHandlerRequest(java.lang.Object p0, com.android.internal.telephony.Phone p1, int p2) {}
    }

    public static final class SatelliteDatagramListenerHandler extends android.os.Handler {
        public static final int EVENT_SATELLITE_DATAGRAM_RECEIVED = 1;
        public static final int EVENT_RETRY_DELIVERING_RECEIVED_DATAGRAM = 2;
        public static final int EVENT_RECEIVED_ACK = 3;
        public SatelliteDatagramListenerHandler(android.os.Looper p0, int p1) { super(); }
        public void addListener(android.telephony.satellite.ISatelliteDatagramCallback p0) {}
        public void removeListener(android.telephony.satellite.ISatelliteDatagramCallback p0) {}
        public boolean hasListeners() { return false; }
        public int getNumOfListeners() { return 0; }
        public void handleMessage(android.os.Message p0) {}

        private static final class DatagramRetryArgument {
            public long datagramId;
            public android.telephony.satellite.SatelliteDatagram datagram;
            public int pendingCount;
            public android.telephony.satellite.ISatelliteDatagramCallback listener;
            DatagramRetryArgument(long p0, android.telephony.satellite.SatelliteDatagram p1, int p2, android.telephony.satellite.ISatelliteDatagramCallback p3) {}
            public boolean equals(java.lang.Object p0) { return false; }
        }
    }
}
