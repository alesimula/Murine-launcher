package com.android.internal.graphics.palette;

public class VariationalKMeansQuantizer implements com.android.internal.graphics.palette.Quantizer {
    private static final java.lang.String TAG = "KMeansQuantizer";
    private static final boolean DEBUG = false;
    private final float mMinClusterSqDistance = 0.0f;
    private final int mInitializations = 0;
    private final com.android.internal.ml.clustering.KMeans mKMeans = null;
    private java.util.List<com.android.internal.graphics.palette.Palette.Swatch> mQuantizedColors;
    public VariationalKMeansQuantizer() {}
    public VariationalKMeansQuantizer(float p0) {}
    public VariationalKMeansQuantizer(float p0, int p1) {}
    public void quantize(int[] p0, int p1, com.android.internal.graphics.palette.Palette.Filter[] p2) {}
    private java.util.List<com.android.internal.ml.clustering.KMeans.Mean> getOptimalKMeans(int p0, float[][] p1) { return null; }
    public java.util.List<com.android.internal.graphics.palette.Palette.Swatch> getQuantizedColors() { return null; }
}
