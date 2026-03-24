package com.android.internal.ml.clustering;

public class KMeans {
    public KMeans() {}
    public KMeans(java.util.Random p0) {}
    public KMeans(java.util.Random p0, int p1, float p2) {}
    public java.util.List<com.android.internal.ml.clustering.KMeans.Mean> predict(int p0, float[][] p1) { return null; }
    public static double score(java.util.List<com.android.internal.ml.clustering.KMeans.Mean> p0) { return 0.0; }
    public void checkDataSetSanity(float[][] p0) {}
    public static com.android.internal.ml.clustering.KMeans.Mean nearestMean(float[] p0, java.util.List<com.android.internal.ml.clustering.KMeans.Mean> p1) { return null; }
    public static float sqDistance(float[] p0, float[] p1) { return 0.0f; }

    public static class Mean {
        float[] mCentroid;
        final java.util.ArrayList<float[]> mClosestItems = null;
        public Mean(int p0) {}
        public Mean(float... p0) {}
        public float[] getCentroid() { return null; }
        public java.util.List<float[]> getItems() { return null; }
        public java.lang.String toString() { return null; }
    }
}
