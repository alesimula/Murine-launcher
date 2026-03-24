package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteProvisionStateCallback {
    public void onSatelliteProvisionStateChanged(boolean p0);
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    default public void onSatelliteSubscriptionProvisionStateChanged(java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus> p0) {}
}
