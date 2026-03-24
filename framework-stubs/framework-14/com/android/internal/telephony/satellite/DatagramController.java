package com.android.internal.telephony.satellite;

public class DatagramController {
    public static final long MAX_DATAGRAM_ID = Long.valueOf(0L);
    public static final int ROUNDING_UNIT = 10;
    public static final long SATELLITE_ALIGN_TIMEOUT = Long.valueOf(0L);
    public static com.android.internal.telephony.satellite.DatagramController getInstance() { return null; }
    public static com.android.internal.telephony.satellite.DatagramController make(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.PointingAppController p2) { return null; }
    protected DatagramController(android.content.Context p0, android.os.Looper p1, com.android.internal.telephony.satellite.PointingAppController p2) {}
    public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) { return 0; }
    public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) {}
    public void pollPendingSatelliteDatagrams(int p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    public void updateSendStatus(int p0, int p1, int p2, int p3) {}
    public void updateReceiveStatus(int p0, int p1, int p2, int p3) {}
    public int getReceivePendingCount() { return 0; }
    public void onSatelliteModemStateChanged(int p0) {}
    void onDeviceAlignedWithSatellite(boolean p0) {}
    public boolean isReceivingDatagrams() { return false; }
    public boolean isSendingInIdleState() { return false; }
    public boolean isPollingInIdleState() { return false; }
    public void setDemoMode(boolean p0) {}
    public android.telephony.satellite.SatelliteDatagram getDemoModeDatagram() { return null; }
    protected void setDemoModeDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1) {}
    long getSatelliteAlignedTimeoutDuration() { return 0L; }
    boolean setSatelliteDeviceAlignedTimeoutDuration(long p0) { return false; }
}
