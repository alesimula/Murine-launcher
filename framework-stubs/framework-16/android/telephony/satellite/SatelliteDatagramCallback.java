package android.telephony.satellite;

@android.annotation.SystemApi
public interface SatelliteDatagramCallback {
    public void onSatelliteDatagramReceived(long p0, android.telephony.satellite.SatelliteDatagram p1, int p2, java.util.function.Consumer<java.lang.Void> p3);
}
