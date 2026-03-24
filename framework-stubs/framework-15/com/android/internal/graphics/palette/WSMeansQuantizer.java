package com.android.internal.graphics.palette;

public final class WSMeansQuantizer implements com.android.internal.graphics.palette.Quantizer {
    public WSMeansQuantizer(int[] p0, com.android.internal.graphics.palette.PointProvider p1, java.util.Map<java.lang.Integer, java.lang.Integer> p2) {}
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
    public void quantize(int[] p0, int p1) {}
    void calculateClusterDistances(int p0) {}
    boolean reassignPoints(int p0) { return false; }
    void recalculateClusterCenters(int p0) {}

    private static class Distance {
        int getIndex() { return 0; }
        float getDistance() { return 0.0f; }
        Distance(int p0, float p1) {}
    }
}
