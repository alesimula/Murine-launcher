package android.graphics;

public class Shader {
    private final android.graphics.ColorSpace mColorSpace = null;
    private long mNativeInstance;
    private java.lang.Runnable mCleaner;
    private android.graphics.Matrix mLocalMatrix;
    @java.lang.Deprecated
    public Shader() {}
    protected Shader(android.graphics.ColorSpace p0) {}
    protected android.graphics.ColorSpace colorSpace() { return null; }
    public boolean getLocalMatrix(android.graphics.Matrix p0) { return false; }
    public void setLocalMatrix(android.graphics.Matrix p0) {}
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected final synchronized void discardNativeInstance() {}
    private void discardNativeInstanceLocked() {}
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }
    public final synchronized long getNativeInstance(boolean p0) { return 0L; }
    public final long getNativeInstance() { return 0L; }
    protected static long[] convertColors(int[] p0) { return null; }
    protected static android.graphics.ColorSpace detectColorSpace(long[] p0) { return null; }
    private static native long nativeGetFinalizer();

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static enum TileMode {
        CLAMP,
        REPEAT,
        MIRROR,
        DECAL;
        final int nativeInt = 0;
        private TileMode() {}
    }
}
