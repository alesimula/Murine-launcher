package com.android.internal.util;

public interface HeavyHitterSketch<T extends java.lang.Object> {
    public static <V extends java.lang.Object> com.android.internal.util.HeavyHitterSketch<V> newDefault() { return null; }
    public void setConfig(int p0, int p1);
    public void add(T p0);
    public java.util.List<T> getTopHeavyHitters(int p0, java.util.List<T> p1, java.util.List<java.lang.Float> p2);
    public java.util.List<T> getCandidates(java.util.List<T> p0);
    public void reset();
    public float getRequiredValidationInputRatio();

    public static final class HeavyHitterSketchImpl<T extends java.lang.Object> implements com.android.internal.util.HeavyHitterSketch<T> {
        public HeavyHitterSketchImpl() {}
        public void setConfig(int p0, int p1) {}
        public void add(T p0) {}
        public java.util.List<T> getTopHeavyHitters(int p0, java.util.List<T> p1, java.util.List<java.lang.Float> p2) { return null; }
        public java.util.List<T> getCandidates(java.util.List<T> p0) { return null; }
        public void reset() {}
        public float getRequiredValidationInputRatio() { return 0.0f; }
    }
}
