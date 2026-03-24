package android.renderscript;

public final class ScriptIntrinsicColorMatrix extends android.renderscript.ScriptIntrinsic {
    private final android.renderscript.Matrix4f mMatrix = null;
    private final android.renderscript.Float4 mAdd = null;
    private ScriptIntrinsicColorMatrix(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    @java.lang.Deprecated
    public static android.renderscript.ScriptIntrinsicColorMatrix create(android.renderscript.RenderScript p0, android.renderscript.Element p1) { return null; }
    public static android.renderscript.ScriptIntrinsicColorMatrix create(android.renderscript.RenderScript p0) { return null; }
    private void setMatrix() {}
    public void setColorMatrix(android.renderscript.Matrix4f p0) {}
    public void setColorMatrix(android.renderscript.Matrix3f p0) {}
    public void setAdd(android.renderscript.Float4 p0) {}
    public void setAdd(float p0, float p1, float p2, float p3) {}
    public void setGreyscale() {}
    public void setYUVtoRGB() {}
    public void setRGBtoYUV() {}
    public void forEach(android.renderscript.Allocation p0, android.renderscript.Allocation p1) {}
    public void forEach(android.renderscript.Allocation p0, android.renderscript.Allocation p1, android.renderscript.Script.LaunchOptions p2) {}
    public android.renderscript.Script.KernelID getKernelID() { return null; }
}
