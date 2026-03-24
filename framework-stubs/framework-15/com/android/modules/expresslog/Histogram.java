package com.android.modules.expresslog;

public final class Histogram {
    public Histogram(java.lang.String p0, com.android.modules.expresslog.Histogram.BinOptions p1) {}
    public void logSample(float p0) {}
    public void logSampleWithUid(int p0, float p1) {}

    public static interface BinOptions {
        public int getBinsCount();
        public int getBinForSample(float p0);
    }

    public static final class ScaledRangeOptions implements com.android.modules.expresslog.Histogram.BinOptions {
        final long[] mBins = null;
        public ScaledRangeOptions(int p0, int p1, float p2, float p3) {}
        public int getBinsCount() { return 0; }
        public int getBinForSample(float p0) { return 0; }
    }

    public static final class UniformOptions implements com.android.modules.expresslog.Histogram.BinOptions {
        public UniformOptions(int p0, float p1, float p2) {}
        public int getBinsCount() { return 0; }
        public int getBinForSample(float p0) { return 0; }
    }
}
