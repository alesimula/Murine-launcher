package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public interface SatelliteModemStateCallback {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onSatelliteModemStateChanged(int p0);
}
