package android.telephony.satellite;

public interface SatelliteTransmissionUpdateCallback {
    public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0);
    public void onSendDatagramStateChanged(int p0, int p1, int p2);
    public void onReceiveDatagramStateChanged(int p0, int p1, int p2);
}
