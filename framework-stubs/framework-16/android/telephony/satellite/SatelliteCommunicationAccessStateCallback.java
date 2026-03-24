package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public interface SatelliteCommunicationAccessStateCallback {
    public void onAccessAllowedStateChanged(boolean p0);
    default public void onAccessConfigurationChanged(android.telephony.satellite.SatelliteAccessConfiguration p0) {}
}
