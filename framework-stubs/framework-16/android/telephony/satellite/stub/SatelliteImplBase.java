package android.telephony.satellite.stub;

public class SatelliteImplBase extends android.telephony.satellite.stub.SatelliteService {
    protected final java.util.concurrent.Executor mExecutor = null;
    public SatelliteImplBase(java.util.concurrent.Executor p0) { super(); }
    public final android.os.IBinder getBinder() { return null; }
    public void setSatelliteListener(android.telephony.satellite.stub.ISatelliteListener p0) {}
    public void requestSatelliteListeningEnabled(boolean p0, int p1, android.telephony.IIntegerConsumer p2) {}
    public void enableTerrestrialNetworkScanWhileSatelliteModeIsOn(boolean p0, android.telephony.IIntegerConsumer p1) {}
    public void requestSatelliteEnabled(android.telephony.satellite.stub.SatelliteModemEnableRequestAttributes p0, android.telephony.IIntegerConsumer p1) {}
    public void requestIsSatelliteEnabled(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) {}
    public void requestIsSatelliteSupported(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) {}
    public void requestSatelliteCapabilities(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.ISatelliteCapabilitiesConsumer p1) {}
    public void startSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) {}
    public void stopSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) {}
    public void pollPendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) {}
    public void sendSatelliteDatagram(android.telephony.satellite.stub.SatelliteDatagram p0, boolean p1, android.telephony.IIntegerConsumer p2) {}
    public void requestSatelliteModemState(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) {}
    public void requestTimeForNextSatelliteVisibility(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) {}
    @java.lang.Deprecated
    public void setSatellitePlmn(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, android.telephony.IIntegerConsumer p3) {}
    @java.lang.Deprecated
    public void setSatelliteEnabledForCarrier(int p0, boolean p1, android.telephony.IIntegerConsumer p2) {}
    @java.lang.Deprecated
    public void requestIsSatelliteEnabledForCarrier(int p0, android.telephony.IIntegerConsumer p1, android.telephony.IBooleanConsumer p2) {}
    public void requestSignalStrength(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.INtnSignalStrengthConsumer p1) {}
    public void startSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) {}
    public void stopSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) {}
    public void abortSendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) {}
    public void updateSatelliteSubscription(java.lang.String p0, android.telephony.IIntegerConsumer p1) {}
    public void updateSystemSelectionChannels(java.util.List<android.telephony.satellite.stub.SystemSelectionSpecifier> p0, android.telephony.IIntegerConsumer p1) {}
}
