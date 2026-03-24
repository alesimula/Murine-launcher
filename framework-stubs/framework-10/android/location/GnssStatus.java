package android.location;

public final class GnssStatus {
    public static final int CONSTELLATION_UNKNOWN = 0;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_COUNT = 8;
    public static final int GNSS_SV_FLAGS_NONE = 0;
    public static final int GNSS_SV_FLAGS_HAS_EPHEMERIS_DATA = 1;
    public static final int GNSS_SV_FLAGS_HAS_ALMANAC_DATA = 2;
    public static final int GNSS_SV_FLAGS_USED_IN_FIX = 4;
    public static final int GNSS_SV_FLAGS_HAS_CARRIER_FREQUENCY = 8;
    public static final int SVID_SHIFT_WIDTH = 8;
    public static final int CONSTELLATION_TYPE_SHIFT_WIDTH = 4;
    public static final int CONSTELLATION_TYPE_MASK = 15;
    final int[] mSvidWithFlags = null;
    final float[] mCn0DbHz = null;
    final float[] mElevations = null;
    final float[] mAzimuths = null;
    final int mSvCount = 0;
    final float[] mCarrierFrequencies = null;
    public GnssStatus(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5) {}
    public int getSatelliteCount() { return 0; }
    public int getConstellationType(int p0) { return 0; }
    public int getSvid(int p0) { return 0; }
    public float getCn0DbHz(int p0) { return 0.0f; }
    public float getElevationDegrees(int p0) { return 0.0f; }
    public float getAzimuthDegrees(int p0) { return 0.0f; }
    public boolean hasEphemerisData(int p0) { return false; }
    public boolean hasAlmanacData(int p0) { return false; }
    public boolean usedInFix(int p0) { return false; }
    public boolean hasCarrierFrequencyHz(int p0) { return false; }
    public float getCarrierFrequencyHz(int p0) { return 0.0f; }
    public static java.lang.String constellationTypeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConstellationType {
    }

    public static abstract class Callback {
        public Callback() {}
        public void onStarted() {}
        public void onStopped() {}
        public void onFirstFix(int p0) {}
        public void onSatelliteStatusChanged(android.location.GnssStatus p0) {}
    }
}
