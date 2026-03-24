package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public interface SatelliteTransmissionUpdateCallback {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onSatellitePositionChanged(android.telephony.satellite.PointingInfo p0);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onSendDatagramStateChanged(int p0, int p1, int p2);
    public void onSendDatagramStateChanged(int p0, int p1, int p2, int p3);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onReceiveDatagramStateChanged(int p0, int p1, int p2);
}
