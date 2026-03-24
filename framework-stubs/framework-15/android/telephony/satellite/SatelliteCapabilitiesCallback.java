package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public interface SatelliteCapabilitiesCallback {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onSatelliteCapabilitiesChanged(android.telephony.satellite.SatelliteCapabilities p0);
}
