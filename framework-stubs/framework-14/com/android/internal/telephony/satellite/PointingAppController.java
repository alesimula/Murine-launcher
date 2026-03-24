package com.android.internal.telephony.satellite;

public class PointingAppController {
    public static com.android.internal.telephony.satellite.PointingAppController getInstance() { return null; }
    public static com.android.internal.telephony.satellite.PointingAppController make(android.content.Context p0) { return null; }
    public void setStartedSatelliteTransmissionUpdates(boolean p0) {}
    public void registerForSatelliteTransmissionUpdates(int p0, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p1, com.android.internal.telephony.Phone p2) {}
    public void unregisterForSatelliteTransmissionUpdates(int p0, java.util.function.Consumer<java.lang.Integer> p1, android.telephony.satellite.ISatelliteTransmissionUpdateCallback p2, com.android.internal.telephony.Phone p3) {}
    public void startSatelliteTransmissionUpdates(android.os.Message p0, com.android.internal.telephony.Phone p1) {}
    public void stopSatelliteTransmissionUpdates(android.os.Message p0, com.android.internal.telephony.Phone p1) {}
    public void startPointingUI(boolean p0) {}
    public void updateSendDatagramTransferState(int p0, int p1, int p2, int p3) {}
    public void updateReceiveDatagramTransferState(int p0, int p1, int p2, int p3) {}
    boolean setSatellitePointingUiClassName(java.lang.String p0, java.lang.String p1) { return false; }

    private static final class DatagramTransferStateHandlerRequest {
        public int datagramTransferState;
        public int pendingCount;
        public int errorCode;
        DatagramTransferStateHandlerRequest(int p0, int p1, int p2) {}
    }

    private static final class SatelliteTransmissionUpdateHandler extends android.os.Handler {
        public static final int EVENT_POSITION_INFO_CHANGED = 1;
        public static final int EVENT_SEND_DATAGRAM_STATE_CHANGED = 2;
        public static final int EVENT_RECEIVE_DATAGRAM_STATE_CHANGED = 3;
        public static final int EVENT_DATAGRAM_TRANSFER_STATE_CHANGED = 4;
        SatelliteTransmissionUpdateHandler(android.os.Looper p0) { super(); }
        public void addListener(android.telephony.satellite.ISatelliteTransmissionUpdateCallback p0) {}
        public void removeListener(android.telephony.satellite.ISatelliteTransmissionUpdateCallback p0) {}
        public boolean hasListeners() { return false; }
        public void handleMessage(android.os.Message p0) {}
    }
}
