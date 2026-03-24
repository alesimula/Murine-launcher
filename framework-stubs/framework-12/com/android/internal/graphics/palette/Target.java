package com.android.internal.graphics.palette;

public final class Target {
    private static final float WEIGHT_CHROMA = 0.5f;
    private static final float WEIGHT_RELATIVE_LUMINANCE = 0.5f;
    private static final float WEIGHT_POPULATION = 0.30000001192092896f;
    private static final float WEIGHT_HUE = 0.20000000298023224f;
    private static final float DEFAULT_CHROMA_MIN = 0.0f;
    private static final float DEFAULT_CHROMA_MAX = 130.0f;
    private static final float DEFAULT_CHROMA_TARGET = 30.0f;
    private float mTargetRelativeLuminance;
    private float mChromaWeight;
    private float mChromaTarget;
    private float mChromaMin;
    private float mChromaMax;
    private float mRelativeLuminanceWeight;
    private float mPopulationWeight;
    private float mHueWeight;
    private float mTargetHue;
    Target() {}
    Target(com.android.internal.graphics.palette.Target p0) {}
    public float getTargetRelativeLuminance() { return 0.0f; }
    public float getTargetPerceptualLuminance() { return 0.0f; }
    public float getMinimumChroma() { return 0.0f; }
    public float getTargetChroma() { return 0.0f; }
    public float getMaximumChroma() { return 0.0f; }
    public float getTargetHue() { return 0.0f; }
    public float getChromaWeight() { return 0.0f; }
    public float getLightnessWeight() { return 0.0f; }
    public float getPopulationWeight() { return 0.0f; }
    public float getHueWeight() { return 0.0f; }

    public static class Builder {
        private final com.android.internal.graphics.palette.Target mTarget = null;
        public Builder() {}
        public Builder(com.android.internal.graphics.palette.Target p0) {}
        public com.android.internal.graphics.palette.Target.Builder setMinimumChroma(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetChroma(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setMaximumChroma(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetRelativeLuminance(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetPerceptualLuminance(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetHue(int p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setContrastRatio(float p0, float p1) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setChromaWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setLightnessWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setPopulationWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target build() { return null; }
    }
}
