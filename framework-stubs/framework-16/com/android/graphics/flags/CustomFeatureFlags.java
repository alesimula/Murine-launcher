package com.android.graphics.flags;

public class CustomFeatureFlags implements com.android.graphics.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.graphics.flags.FeatureFlags>> p0) {}
    public boolean displayBt2020Colorspace() { return false; }
    public boolean exactComputeBounds() { return false; }
    public boolean gradientDrawableShapeArcForRoundedCap() { return false; }
    public boolean iconLoadDrawableReturnNullWhenUriDecodeFails() { return false; }
    public boolean okLabColorspace() { return false; }
    public boolean useResourcesFromContextToCreateDrawableIcons() { return false; }
    public boolean yuvImageCompressToUltraHdr() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.graphics.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
