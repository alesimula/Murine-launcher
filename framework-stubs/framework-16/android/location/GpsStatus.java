package android.location;

@java.lang.Deprecated
public final class GpsStatus {
    public static final int GPS_EVENT_STARTED = 1;
    public static final int GPS_EVENT_STOPPED = 2;
    public static final int GPS_EVENT_FIRST_FIX = 3;
    public static final int GPS_EVENT_SATELLITE_STATUS = 4;
    @android.annotation.NonNull
    public static android.location.GpsStatus create(android.location.GnssStatus p0, int p1) { return null; }
    @android.annotation.NonNull
    static android.location.GpsStatus createEmpty() { return null; }
    void setStatus(android.location.GnssStatus p0, int p1) {}
    public int getTimeToFirstFix() { return 0; }
    public java.lang.Iterable<android.location.GpsSatellite> getSatellites() { return null; }
    public int getMaxSatellites() { return 0; }

    @java.lang.Deprecated
    public static interface Listener {
        public void onGpsStatusChanged(int p0);
    }

    @java.lang.Deprecated
    public static interface NmeaListener {
        public void onNmeaReceived(long p0, java.lang.String p1);
    }

    private final class SatelliteIterator implements java.util.Iterator<android.location.GpsSatellite> {
        SatelliteIterator(android.location.GpsStatus p0) {}
        public boolean hasNext() { return false; }
        public android.location.GpsSatellite next() { return null; }
        public void remove() {}
    }
}
