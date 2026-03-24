package android.telephony.satellite.stub;

public class SatelliteImplBase extends android.telephony.satellite.stub.SatelliteService {
    protected final java.util.concurrent.Executor mExecutor = null;
    public SatelliteImplBase(java.util.concurrent.Executor p0) { super(); }
    public final android.os.IBinder getBinder() { return null; }
    public void setSatelliteListener(android.telephony.satellite.stub.ISatelliteListener p0) {}
    public void requestSatelliteListeningEnabled(boolean p0, int p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    public void enableCellularModemWhileSatelliteModeIsOn(boolean p0, com.android.internal.telephony.IIntegerConsumer p1) {}
    public void requestSatelliteEnabled(boolean p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    public void requestIsSatelliteEnabled(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IBooleanConsumer p1) {}
    public void requestIsSatelliteSupported(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IBooleanConsumer p1) {}
    public void requestSatelliteCapabilities(com.android.internal.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.ISatelliteCapabilitiesConsumer p1) {}
    public void startSendingSatellitePointingInfo(com.android.internal.telephony.IIntegerConsumer p0) {}
    public void stopSendingSatellitePointingInfo(com.android.internal.telephony.IIntegerConsumer p0) {}
    public void provisionSatelliteService(java.lang.String p0, byte[] p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    public void deprovisionSatelliteService(java.lang.String p0, com.android.internal.telephony.IIntegerConsumer p1) {}
    public void requestIsSatelliteProvisioned(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IBooleanConsumer p1) {}
    public void pollPendingSatelliteDatagrams(com.android.internal.telephony.IIntegerConsumer p0) {}
    public void sendSatelliteDatagram(android.telephony.satellite.stub.SatelliteDatagram p0, boolean p1, com.android.internal.telephony.IIntegerConsumer p2) {}
    public void requestSatelliteModemState(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IIntegerConsumer p1) {}
    public void requestIsSatelliteCommunicationAllowedForCurrentLocation(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IBooleanConsumer p1) {}
    public void requestTimeForNextSatelliteVisibility(com.android.internal.telephony.IIntegerConsumer p0, com.android.internal.telephony.IIntegerConsumer p1) {}
}
