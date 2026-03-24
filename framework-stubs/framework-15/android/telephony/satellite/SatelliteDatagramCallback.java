package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public interface SatelliteDatagramCallback {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void onSatelliteDatagramReceived(long p0, android.telephony.satellite.SatelliteDatagram p1, int p2, java.util.function.Consumer<java.lang.Void> p3);
}
