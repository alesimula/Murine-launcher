package android.graphics;

public final class RenderEffect {
    private final long mNativeRenderEffect = 0L;
    public static android.graphics.RenderEffect createOffsetEffect(float p0, float p1) { return null; }
    public static android.graphics.RenderEffect createOffsetEffect(float p0, float p1, android.graphics.RenderEffect p2) { return null; }
    public static android.graphics.RenderEffect createBlurEffect(float p0, float p1, android.graphics.RenderEffect p2, android.graphics.Shader.TileMode p3) { return null; }
    public static android.graphics.RenderEffect createBlurEffect(float p0, float p1, android.graphics.Shader.TileMode p2) { return null; }
    public static android.graphics.RenderEffect createBitmapEffect(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.RenderEffect createBitmapEffect(android.graphics.Bitmap p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public static android.graphics.RenderEffect createColorFilterEffect(android.graphics.ColorFilter p0, android.graphics.RenderEffect p1) { return null; }
    public static android.graphics.RenderEffect createColorFilterEffect(android.graphics.ColorFilter p0) { return null; }
    public static android.graphics.RenderEffect createBlendModeEffect(android.graphics.RenderEffect p0, android.graphics.RenderEffect p1, android.graphics.BlendMode p2) { return null; }
    public static android.graphics.RenderEffect createChainEffect(android.graphics.RenderEffect p0, android.graphics.RenderEffect p1) { return null; }
    public static android.graphics.RenderEffect createShaderEffect(android.graphics.Shader p0) { return null; }
    private RenderEffect(long p0) {}
    long getNativeInstance() { return 0L; }
    private static native long nativeCreateOffsetEffect(float p0, float p1, long p2);
    private static native long nativeCreateBlurEffect(float p0, float p1, long p2, int p3);
    private static native long nativeCreateBitmapEffect(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8);
    private static native long nativeCreateColorFilterEffect(long p0, long p1);
    private static native long nativeCreateBlendModeEffect(long p0, long p1, int p2);
    private static native long nativeCreateChainEffect(long p0, long p1);
    private static native long nativeCreateShaderEffect(long p0);
    private static native long nativeGetFinalizer();

    private static class RenderEffectHolder {
        private RenderEffectHolder() {}
    }
}
