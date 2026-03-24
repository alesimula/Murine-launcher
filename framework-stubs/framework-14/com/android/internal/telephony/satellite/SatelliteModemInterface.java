package com.android.internal.telephony.satellite;

public class SatelliteModemInterface {
    protected final com.android.internal.telephony.ExponentialBackoff mExponentialBackoff = null;
    public static com.android.internal.telephony.satellite.SatelliteModemInterface getInstance() { return null; }
    public static com.android.internal.telephony.satellite.SatelliteModemInterface make(android.content.Context p0, com.android.internal.telephony.satellite.SatelliteController p1) { return null; }
    protected SatelliteModemInterface(android.content.Context p0, com.android.internal.telephony.satellite.SatelliteController p1, android.os.Looper p2) {}
    public android.telephony.satellite.stub.ISatellite getService() { return null; }
    protected void bindService() {}
    protected void unbindService() {}
    public void registerForSatelliteProvisionStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteProvisionStateChanged(android.os.Handler p0) {}
    public void registerForSatellitePositionInfoChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatellitePositionInfoChanged(android.os.Handler p0) {}
    public void registerForDatagramTransferStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDatagramTransferStateChanged(android.os.Handler p0) {}
    public void registerForSatelliteModemStateChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteModemStateChanged(android.os.Handler p0) {}
    public void registerForPendingDatagrams(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForPendingDatagrams(android.os.Handler p0) {}
    public void registerForSatelliteDatagramsReceived(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForSatelliteDatagramsReceived(android.os.Handler p0) {}
    public void requestSatelliteListeningEnabled(boolean p0, int p1, android.os.Message p2) {}
    public void enableCellularModemWhileSatelliteModeIsOn(boolean p0, android.os.Message p1) {}
    public void requestSatelliteEnabled(boolean p0, boolean p1, android.os.Message p2) {}
    public void requestIsSatelliteEnabled(android.os.Message p0) {}
    public void requestIsSatelliteSupported(android.os.Message p0) {}
    public void requestSatelliteCapabilities(android.os.Message p0) {}
    public void startSendingSatellitePointingInfo(android.os.Message p0) {}
    public void stopSendingSatellitePointingInfo(android.os.Message p0) {}
    public void provisionSatelliteService(java.lang.String p0, byte[] p1, android.os.Message p2) {}
    public void deprovisionSatelliteService(java.lang.String p0, android.os.Message p1) {}
    public void requestIsSatelliteProvisioned(android.os.Message p0) {}
    public void pollPendingSatelliteDatagrams(android.os.Message p0) {}
    public void sendSatelliteDatagram(android.telephony.satellite.SatelliteDatagram p0, boolean p1, boolean p2, android.os.Message p3) {}
    public void requestSatelliteModemState(android.os.Message p0) {}
    public void requestIsSatelliteCommunicationAllowedForCurrentLocation(android.os.Message p0) {}
    public void requestTimeForNextSatelliteVisibility(android.os.Message p0) {}
    public boolean isSatelliteServiceSupported() { return false; }
    public boolean setSatelliteServicePackageName(java.lang.String p0) { return false; }
    protected static void sendMessageWithResult(android.os.Message p0, java.lang.Object p1, int p2) {}

    private class SatelliteServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
    }
}
