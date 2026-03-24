package android.graphics;

public class ComposeShader extends android.graphics.Shader {
    android.graphics.Shader mShaderA;
    android.graphics.Shader mShaderB;
    @java.lang.Deprecated
    public ComposeShader(android.graphics.Shader p0, android.graphics.Shader p1, android.graphics.Xfermode p2) { super(); }
    public ComposeShader(android.graphics.Shader p0, android.graphics.Shader p1, android.graphics.PorterDuff.Mode p2) { super(); }
    public ComposeShader(android.graphics.Shader p0, android.graphics.Shader p1, android.graphics.BlendMode p2) { super(); }
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }
}
