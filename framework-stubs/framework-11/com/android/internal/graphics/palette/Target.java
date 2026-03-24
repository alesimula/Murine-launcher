package com.android.internal.graphics.palette;

public final class Target {
    private static final float TARGET_DARK_LUMA = 0.25999999046325684f;
    private static final float MAX_DARK_LUMA = 0.44999998807907104f;
    private static final float MIN_LIGHT_LUMA = 0.550000011920929f;
    private static final float TARGET_LIGHT_LUMA = 0.7400000095367432f;
    private static final float MIN_NORMAL_LUMA = 0.30000001192092896f;
    private static final float TARGET_NORMAL_LUMA = 0.5f;
    private static final float MAX_NORMAL_LUMA = 0.699999988079071f;
    private static final float TARGET_MUTED_SATURATION = 0.30000001192092896f;
    private static final float MAX_MUTED_SATURATION = 0.4000000059604645f;
    private static final float TARGET_VIBRANT_SATURATION = 1.0f;
    private static final float MIN_VIBRANT_SATURATION = 0.3499999940395355f;
    private static final float WEIGHT_SATURATION = 0.23999999463558197f;
    private static final float WEIGHT_LUMA = 0.5199999809265137f;
    private static final float WEIGHT_POPULATION = 0.23999999463558197f;
    static final int INDEX_MIN = 0;
    static final int INDEX_TARGET = 1;
    static final int INDEX_MAX = 2;
    static final int INDEX_WEIGHT_SAT = 0;
    static final int INDEX_WEIGHT_LUMA = 1;
    static final int INDEX_WEIGHT_POP = 2;
    public static final com.android.internal.graphics.palette.Target LIGHT_VIBRANT = null;
    public static final com.android.internal.graphics.palette.Target VIBRANT = null;
    public static final com.android.internal.graphics.palette.Target DARK_VIBRANT = null;
    public static final com.android.internal.graphics.palette.Target LIGHT_MUTED = null;
    public static final com.android.internal.graphics.palette.Target MUTED = null;
    public static final com.android.internal.graphics.palette.Target DARK_MUTED = null;
    final float[] mSaturationTargets = null;
    final float[] mLightnessTargets = null;
    final float[] mWeights = null;
    boolean mIsExclusive;
    Target() {}
    Target(com.android.internal.graphics.palette.Target p0) {}
    public float getMinimumSaturation() { return 0.0f; }
    public float getTargetSaturation() { return 0.0f; }
    public float getMaximumSaturation() { return 0.0f; }
    public float getMinimumLightness() { return 0.0f; }
    public float getTargetLightness() { return 0.0f; }
    public float getMaximumLightness() { return 0.0f; }
    public float getSaturationWeight() { return 0.0f; }
    public float getLightnessWeight() { return 0.0f; }
    public float getPopulationWeight() { return 0.0f; }
    public boolean isExclusive() { return false; }
    private static void setTargetDefaultValues(float[] p0) {}
    private void setDefaultWeights() {}
    void normalizeWeights() {}
    private static void setDefaultDarkLightnessValues(com.android.internal.graphics.palette.Target p0) {}
    private static void setDefaultNormalLightnessValues(com.android.internal.graphics.palette.Target p0) {}
    private static void setDefaultLightLightnessValues(com.android.internal.graphics.palette.Target p0) {}
    private static void setDefaultVibrantSaturationValues(com.android.internal.graphics.palette.Target p0) {}
    private static void setDefaultMutedSaturationValues(com.android.internal.graphics.palette.Target p0) {}

    public static final class Builder {
        private final com.android.internal.graphics.palette.Target mTarget = null;
        public Builder() {}
        public Builder(com.android.internal.graphics.palette.Target p0) {}
        public com.android.internal.graphics.palette.Target.Builder setMinimumSaturation(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetSaturation(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setMaximumSaturation(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setMinimumLightness(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setTargetLightness(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setMaximumLightness(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setSaturationWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setLightnessWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setPopulationWeight(float p0) { return null; }
        public com.android.internal.graphics.palette.Target.Builder setExclusive(boolean p0) { return null; }
        public com.android.internal.graphics.palette.Target build() { return null; }
    }
}
