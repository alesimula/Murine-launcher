package com.android.graphics.flags;

public interface FeatureFlags {
    public boolean displayBt2020Colorspace();
    public boolean exactComputeBounds();
    public boolean gradientDrawableShapeArcForRoundedCap();
    public boolean iconLoadDrawableReturnNullWhenUriDecodeFails();
    public boolean okLabColorspace();
    public boolean useResourcesFromContextToCreateDrawableIcons();
    public boolean yuvImageCompressToUltraHdr();
}
