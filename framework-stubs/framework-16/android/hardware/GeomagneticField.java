package android.hardware;

public class GeomagneticField {
    public GeomagneticField(float p0, float p1, float p2, long p3) {}
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getZ() { return 0.0f; }
    public float getDeclination() { return 0.0f; }
    public float getInclination() { return 0.0f; }
    public float getHorizontalStrength() { return 0.0f; }
    public float getFieldStrength() { return 0.0f; }

    private static class LegendreTable {
        public final float[][] mP = null;
        public final float[][] mPDeriv = null;
        public LegendreTable(int p0, float p1) {}
    }
}
