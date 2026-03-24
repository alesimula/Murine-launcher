package android.graphics;

public class RuntimeShader extends android.graphics.Shader {
    private byte[] mUniforms;
    private boolean mIsOpaque;
    private long mNativeInstanceRuntimeShaderFactory;
    public RuntimeShader(java.lang.String p0, byte[] p1, boolean p2) { super(); }
    private RuntimeShader(java.lang.String p0, byte[] p1, boolean p2, android.graphics.ColorSpace p3) { super(); }
    public void updateUniforms(byte[] p0) {}
    long createNativeInstance(long p0) { return 0L; }
    private static native long nativeCreate(long p0, long p1, byte[] p2, long p3, boolean p4);
    private static native long nativeCreateShaderFactory(java.lang.String p0);
    private static native long nativeGetFinalizer();

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
