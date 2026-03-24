package android.renderscript;

@java.lang.Deprecated
public class AllocationAdapter extends android.renderscript.Allocation {
    android.renderscript.Type mWindow;
    AllocationAdapter(long p0, android.renderscript.RenderScript p1, android.renderscript.Allocation p2, android.renderscript.Type p3) { super(0L, (android.renderscript.RenderScript)null, (android.renderscript.Type)null, 0); }
    void initLOD(int p0) {}
    public void setLOD(int p0) {}
    public void setFace(android.renderscript.Type.CubemapFace p0) {}
    public void setX(int p0) {}
    public void setY(int p0) {}
    public void setZ(int p0) {}
    public void setArray(int p0, int p1) {}
    public static android.renderscript.AllocationAdapter create1D(android.renderscript.RenderScript p0, android.renderscript.Allocation p1) { return null; }
    public static android.renderscript.AllocationAdapter create2D(android.renderscript.RenderScript p0, android.renderscript.Allocation p1) { return null; }
    public static android.renderscript.AllocationAdapter createTyped(android.renderscript.RenderScript p0, android.renderscript.Allocation p1, android.renderscript.Type p2) { return null; }
    public synchronized void resize(int p0) {}
}
