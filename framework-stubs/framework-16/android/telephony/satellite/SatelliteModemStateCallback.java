package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteModemStateCallback {
    public void onSatelliteModemStateChanged(int p0);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_roaming_nb_iot_ntn")
    default public void onEmergencyModeChanged(boolean p0) {}
    default public void onRegistrationFailure(int p0) {}
    default public void onTerrestrialNetworkAvailableChanged(boolean p0) {}
}
