package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public interface SatelliteDisallowedReasonsCallback {
    public void onSatelliteDisallowedReasonsChanged(int[] p0);
}
