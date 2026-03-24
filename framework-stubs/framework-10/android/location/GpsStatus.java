package android.location;

@java.lang.Deprecated
public final class GpsStatus {
    private static final int NUM_SATELLITES = 255;
    private static final int GLONASS_SVID_OFFSET = 64;
    private static final int BEIDOU_SVID_OFFSET = 200;
    private static final int SBAS_SVID_OFFSET = -87;
    private int mTimeToFirstFix;
    private final android.util.SparseArray<android.location.GpsSatellite> mSatellites = null;
    private java.lang.Iterable<android.location.GpsSatellite> mSatelliteList;
    public static final int GPS_EVENT_STARTED = 1;
    public static final int GPS_EVENT_STOPPED = 2;
    public static final int GPS_EVENT_FIRST_FIX = 3;
    public static final int GPS_EVENT_SATELLITE_STATUS = 4;
    GpsStatus() {}
    private void setStatus(int p0, int[] p1, float[] p2, float[] p3, float[] p4) {}
    void setStatus(android.location.GnssStatus p0, int p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    void setTimeToFirstFix(int p0) {}
    public int getTimeToFirstFix() { return 0; }
    public java.lang.Iterable<android.location.GpsSatellite> getSatellites() { return null; }
    public int getMaxSatellites() { return 0; }
    private void clearSatellites() {}

    private final class SatelliteIterator implements java.util.Iterator<android.location.GpsSatellite> {
        private final int mSatellitesCount = 0;
        private int mIndex;
        SatelliteIterator(android.location.GpsStatus p0) {}
        public boolean hasNext() { return false; }
        public android.location.GpsSatellite next() { return null; }
        public void remove() {}
    }

    @java.lang.Deprecated
    public static interface NmeaListener {
        public void onNmeaReceived(long p0, java.lang.String p1);
    }

    @java.lang.Deprecated
    public static interface Listener {
        public void onGpsStatusChanged(int p0);
    }
}
