package android.location;

public final class GnssStatus implements android.os.Parcelable {
    public static final int CONSTELLATION_UNKNOWN = 0;
    public static final int CONSTELLATION_GPS = 1;
    public static final int CONSTELLATION_SBAS = 2;
    public static final int CONSTELLATION_GLONASS = 3;
    public static final int CONSTELLATION_QZSS = 4;
    public static final int CONSTELLATION_BEIDOU = 5;
    public static final int CONSTELLATION_GALILEO = 6;
    public static final int CONSTELLATION_IRNSS = 7;
    public static final int CONSTELLATION_COUNT = 8;
    private static final int SVID_FLAGS_NONE = 0;
    private static final int SVID_FLAGS_HAS_EPHEMERIS_DATA = 1;
    private static final int SVID_FLAGS_HAS_ALMANAC_DATA = 2;
    private static final int SVID_FLAGS_USED_IN_FIX = 4;
    private static final int SVID_FLAGS_HAS_CARRIER_FREQUENCY = 8;
    private static final int SVID_FLAGS_HAS_BASEBAND_CN0 = 16;
    private static final int SVID_SHIFT_WIDTH = 12;
    private static final int CONSTELLATION_TYPE_SHIFT_WIDTH = 8;
    private static final int CONSTELLATION_TYPE_MASK = 15;
    private final int mSvCount = 0;
    private final int[] mSvidWithFlags = null;
    private final float[] mCn0DbHzs = null;
    private final float[] mElevations = null;
    private final float[] mAzimuths = null;
    private final float[] mCarrierFrequencies = null;
    private final float[] mBasebandCn0DbHzs = null;
    public static final android.os.Parcelable.Creator<android.location.GnssStatus> CREATOR = null;
    public static android.location.GnssStatus wrap(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) { return null; }
    private GnssStatus(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) {}
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
    public boolean hasBasebandCn0DbHz(int p0) { return false; }
    public float getBasebandCn0DbHz(int p0) { return 0.0f; }
    public static java.lang.String constellationTypeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.ArrayList<android.location.GnssStatus.GnssSvInfo> mSatellites = null;
        public Builder() {}
        public android.location.GnssStatus.Builder addSatellite(int p0, int p1, float p2, float p3, float p4, boolean p5, boolean p6, boolean p7, boolean p8, float p9, boolean p10, float p11) { return null; }
        public android.location.GnssStatus.Builder clearSatellites() { return null; }
        public android.location.GnssStatus build() { return null; }
    }

    public static abstract class Callback {
        public Callback() {}
        public void onStarted() {}
        public void onStopped() {}
        public void onFirstFix(int p0) {}
        public void onSatelliteStatusChanged(android.location.GnssStatus p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConstellationType {
    }

    private static class GnssSvInfo {
        private final int mSvidWithFlags = 0;
        private final float mCn0DbHz = 0.0f;
        private final float mElevation = 0.0f;
        private final float mAzimuth = 0.0f;
        private final float mCarrierFrequency = 0.0f;
        private final float mBasebandCn0DbHz = 0.0f;
        private GnssSvInfo(int p0, int p1, float p2, float p3, float p4, boolean p5, boolean p6, boolean p7, boolean p8, float p9, boolean p10, float p11) {}
    }
}
