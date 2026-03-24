package com.android.internal.telephony.satellite;

public class SatelliteController extends android.os.Handler {
    public static final java.lang.String SATELLITE_SHARED_PREF = "satellite_shared_pref";
    public static final int SATELLITE_MODE_ENABLED_TRUE = 1;
    public static final int SATELLITE_MODE_ENABLED_FALSE = 0;
    public static com.android.internal.telephony.satellite.SatelliteController getInstance() { return null; }
    public static void make(android.content.Context p0) {}
    public SatelliteController(android.content.Context p0, android.os.Looper p1) { super(); }
    protected void initializeSatelliteModeRadios() {}
    public void handleMessage(android.os.Message p0) {}
    public void requestSatelliteEnabled(int p0, boolean p1, boolean p2, com.android.internal.telephony.IIntegerConsumer p3) {}
    public void requestIsSatelliteEnabled(int p0, android.os.ResultReceiver p1) {}
    public boolean isSatelliteEnabled() { return false; }
    public void requestIsDemoModeEnabled(int p0, android.os.ResultReceiver p1) {}
    public boolean isDemoModeEnabled() { return false; }
    public void requestIsSatelliteSupported(int p0, android.os.ResultReceiver p1) {}
    public void requestSatelliteCapabilities(int p0, android.os.ResultReceiver p1) {}
    public void startSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) {}
    public void stopSatelliteTransmissionUpdates(int p0, com.android.internal.telephony.IIntegerConsumer p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2) {}
    public android.os.ICancellationSignal provisionSatelliteService(int p0, java.lang.String p1, byte[] p2, com.android.internal.telephony.IIntegerConsumer p3) { return null; }
    public void deprovisionSatelliteService(int p0, java.lang.String p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    public int registerForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) { return 0; }
    public void unregisterForSatelliteProvisionStateChanged(int p0, android.telephony.satellite.ISatelliteProvisionStateCallback p1) {}
    public void requestIsSatelliteProvisioned(int p0, android.os.ResultReceiver p1) {}
    public int registerForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) { return 0; }
    public void unregisterForSatelliteModemStateChanged(int p0, android.telephony.satellite.ISatelliteStateCallback p1) {}
    public int registerForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) { return 0; }
    public void unregisterForSatelliteDatagram(int p0, android.telephony.satellite.ISatelliteDatagramCallback p1) {}
    public void pollPendingSatelliteDatagrams(int p0, com.android.internal.telephony.IIntegerConsumer p1) {}
    public void sendSatelliteDatagram(int p0, int p1, android.telephony.satellite.SatelliteDatagram p2, boolean p3, com.android.internal.telephony.IIntegerConsumer p4) {}
    public void requestIsSatelliteCommunicationAllowedForCurrentLocation(int p0, android.os.ResultReceiver p1) {}
    public void requestTimeForNextSatelliteVisibility(int p0, android.os.ResultReceiver p1) {}
    public void onDeviceAlignedWithSatellite(int p0, boolean p1) {}
    public boolean setSatelliteServicePackageName(java.lang.String p0) { return false; }
    public boolean setSatelliteListeningTimeoutDuration(long p0) { return false; }
    public boolean setSatelliteDeviceAlignedTimeoutDuration(long p0) { return false; }
    public boolean setSatelliteGatewayServicePackageName(java.lang.String p0) { return false; }
    public boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) { return false; }
    public void onSatelliteServiceConnected() {}
    public boolean isSatelliteSupported() { return false; }
    protected java.lang.Boolean isSatelliteProvisioned() { return null; }
    protected void setSettingsKeyForSatelliteMode(int p0) {}
    protected boolean areAllRadiosDisabled() { return false; }

    protected class BTWifiNFCStateReceiver extends android.content.BroadcastReceiver {
        protected BTWifiNFCStateReceiver(com.android.internal.telephony.satellite.SatelliteController p0) { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    private static final class ProvisionSatelliteServiceArgument {
        public java.lang.String token;
        public byte[] provisionData;
        public java.util.function.Consumer<java.lang.Integer> callback;
        public int subId;
        ProvisionSatelliteServiceArgument(java.lang.String p0, byte[] p1, java.util.function.Consumer<java.lang.Integer> p2, int p3) {}
    }

    private static final class RequestSatelliteEnabledArgument {
        public boolean enableSatellite;
        public boolean enableDemoMode;
        public java.util.function.Consumer<java.lang.Integer> callback;
        RequestSatelliteEnabledArgument(boolean p0, boolean p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    }

    private static final class SatelliteControllerHandlerRequest {
        public java.lang.Object argument;
        public com.android.internal.telephony.Phone phone;
        public java.lang.Object result;
        SatelliteControllerHandlerRequest(java.lang.Object p0, com.android.internal.telephony.Phone p1) {}
    }

    public static final class SatelliteTransmissionUpdateArgument {
        public java.util.function.Consumer<java.lang.Integer> errorCallback;
        public android.telephony.satellite.ISatelliteTransmissionUpdateCallback callback;
        public int subId;
        SatelliteTransmissionUpdateArgument(java.util.function.Consumer<java.lang.Integer> p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1, int p2) {}
    }

    protected class UwbAdapterStateCallback implements android.uwb.UwbManager.AdapterStateCallback {
        protected UwbAdapterStateCallback(com.android.internal.telephony.satellite.SatelliteController p0) {}
        public java.lang.String toString(int p0) { return null; }
        public void onStateChanged(int p0, int p1) {}
    }
}
