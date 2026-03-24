package android.hardware;

public class GeomagneticField {
    private float mX;
    private float mY;
    private float mZ;
    private float mGcLatitudeRad;
    private float mGcLongitudeRad;
    private float mGcRadiusKm;
    private static final float EARTH_SEMI_MAJOR_AXIS_KM = 6378.13720703125f;
    private static final float EARTH_SEMI_MINOR_AXIS_KM = 6356.75244140625f;
    private static final float EARTH_REFERENCE_RADIUS_KM = 6371.2001953125f;
    private static final float[][] G_COEFF = null;
    private static final float[][] H_COEFF = null;
    private static final float[][] DELTA_G = null;
    private static final float[][] DELTA_H = null;
    private static final long BASE_TIME = Long.valueOf(0L);
    private static final float[][] SCHMIDT_QUASI_NORM_FACTORS = null;
    public GeomagneticField(float p0, float p1, float p2, long p3) {}
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getZ() { return 0.0f; }
    public float getDeclination() { return 0.0f; }
    public float getInclination() { return 0.0f; }
    public float getHorizontalStrength() { return 0.0f; }
    public float getFieldStrength() { return 0.0f; }
    private void computeGeocentricCoordinates(float p0, float p1, float p2) {}
    private static float[][] computeSchmidtQuasiNormFactors(int p0) { return null; }

    private static class LegendreTable {
        public final float[][] mP = null;
        public final float[][] mPDeriv = null;
        public LegendreTable(int p0, float p1) {}
    }
}
