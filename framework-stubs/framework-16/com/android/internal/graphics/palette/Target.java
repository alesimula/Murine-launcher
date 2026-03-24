package com.android.internal.graphics.palette;

public final class Target {
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
        public Builder() {}
        public Builder(com.android.internal.graphics.palette.Target p0) {}
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setMinimumChroma(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setTargetChroma(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setMaximumChroma(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setTargetRelativeLuminance(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setTargetPerceptualLuminance(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setTargetHue(int p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setContrastRatio(float p0, float p1) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setChromaWeight(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setLightnessWeight(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target.Builder setPopulationWeight(float p0) { return null; }
        @android.annotation.NonNull
        public com.android.internal.graphics.palette.Target build() { return null; }
    }
}
