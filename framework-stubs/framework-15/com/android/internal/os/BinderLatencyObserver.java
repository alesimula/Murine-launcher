package com.android.internal.os;

public class BinderLatencyObserver {
    public static final int PERIODIC_SAMPLING_INTERVAL_DEFAULT = 10;
    public static final int SHARDING_MODULO_DEFAULT = 1;
    public static final int STATSD_PUSH_INTERVAL_MINUTES_DEFAULT = 360;
    public static final int BUCKET_COUNT_DEFAULT = 100;
    public static final int FIRST_BUCKET_SIZE_DEFAULT = 5;
    public static final float BUCKET_SCALE_FACTOR_DEFAULT = 1.125f;
    protected int getMaxAtomSizeBytes() { return 0; }
    protected void writeAtomToStatsd(android.util.proto.ProtoOutputStream p0) {}
    public BinderLatencyObserver(com.android.internal.os.BinderLatencyObserver.Injector p0, int p1) {}
    public void callEnded(com.android.internal.os.BinderInternal.CallSession p0) {}
    protected long getElapsedRealtimeMicro() { return 0L; }
    protected boolean shouldCollect(com.android.internal.os.BinderLatencyObserver.LatencyDims p0) { return false; }
    protected boolean shouldKeepSample() { return false; }
    public void setSamplingInterval(int p0) {}
    public void setShardingModulo(int p0) {}
    public void setPushInterval(int p0) {}
    public void setHistogramBucketsParams(int p0, int p1, float p2) {}
    public void reset() {}
    public android.util.ArrayMap<com.android.internal.os.BinderLatencyObserver.LatencyDims, int[]> getLatencyHistograms() { return null; }
    public java.lang.Runnable getStatsdPushRunnable() { return null; }
    public int getProcessSource() { return 0; }

    public static class Injector {
        public Injector() {}
        public java.util.Random getRandomGenerator() { return null; }
        public android.os.Handler getHandler() { return null; }
    }

    public static class LatencyDims {
        public static com.android.internal.os.BinderLatencyObserver.LatencyDims create(java.lang.Class<? extends android.os.Binder> p0, int p1) { return null; }
        public java.lang.Class<? extends android.os.Binder> getBinderClass() { return null; }
        public int getTransactionCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
