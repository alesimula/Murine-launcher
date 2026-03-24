package android.graphics;

public class Shader {
    private final android.graphics.ColorSpace mColorSpace = null;
    private long mNativeInstance;
    private java.lang.Runnable mCleaner;
    private android.graphics.Matrix mLocalMatrix;
    @java.lang.Deprecated
    public Shader() {}
    public Shader(android.graphics.ColorSpace p0) {}
    protected android.graphics.ColorSpace colorSpace() { return null; }
    public boolean getLocalMatrix(android.graphics.Matrix p0) { return false; }
    public void setLocalMatrix(android.graphics.Matrix p0) {}
    long createNativeInstance(long p0) { return 0L; }
    protected final void discardNativeInstance() {}
    protected void verifyNativeInstance() {}
    public final long getNativeInstance() { return 0L; }
    public static long[] convertColors(int[] p0) { return null; }
    public static android.graphics.ColorSpace detectColorSpace(long[] p0) { return null; }
    private static native long nativeGetFinalizer();

    public static enum TileMode {
        CLAMP,
        REPEAT,
        MIRROR;
        @android.annotation.UnsupportedAppUsage
        final int nativeInt = 0;
        private TileMode() {}
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
