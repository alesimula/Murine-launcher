package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteTransmissionUpdateCallback {
    public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0);
    public void onSendDatagramStateChanged(int p0, int p1, int p2);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    default public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3) {}
    public void onReceiveDatagramStateChanged(int p0, int p1, int p2);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    default public void onSendDatagramRequested(int p0) {}
}
