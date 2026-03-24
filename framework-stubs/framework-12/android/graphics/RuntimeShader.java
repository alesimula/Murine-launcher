package android.graphics;

public class RuntimeShader extends android.graphics.Shader {
    private boolean mIsOpaque;
    private long mNativeInstanceRuntimeShaderBuilder;
    public RuntimeShader(java.lang.String p0, boolean p1) { super(); }
    public void setUniform(java.lang.String p0, float p1) {}
    public void setUniform(java.lang.String p0, float p1, float p2) {}
    public void setUniform(java.lang.String p0, float[] p1) {}
    public void setInputShader(java.lang.String p0, android.graphics.Shader p1) {}
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    public long getNativeShaderBuilder() { return 0L; }
    public boolean isOpaque() { return false; }
    private static native long nativeGetFinalizer();
    private static native long nativeCreateBuilder(java.lang.String p0);
    private static native long nativeCreateShader(long p0, long p1, boolean p2);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float[] p2);
    private static native void nativeUpdateShader(long p0, java.lang.String p1, long p2);

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
