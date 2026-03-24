package android.filterfw.core;

public class ShaderProgram extends android.filterfw.core.Program {
    public ShaderProgram(android.filterfw.core.FilterContext p0, java.lang.String p1) { super(); }
    public ShaderProgram(android.filterfw.core.FilterContext p0, java.lang.String p1, java.lang.String p2) { super(); }
    public static android.filterfw.core.ShaderProgram createIdentity(android.filterfw.core.FilterContext p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public android.filterfw.core.GLEnvironment getGLEnvironment() { return null; }
    public void process(android.filterfw.core.Frame[] p0, android.filterfw.core.Frame p1) {}
    public void setHostValue(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object getHostValue(java.lang.String p0) { return null; }
    public void setAttributeValues(java.lang.String p0, float[] p1, int p2) {}
    public void setAttributeValues(java.lang.String p0, android.filterfw.core.VertexFrame p1, int p2, int p3, int p4, int p5, boolean p6) {}
    public void setSourceRegion(android.filterfw.geometry.Quad p0) {}
    public void setTargetRegion(android.filterfw.geometry.Quad p0) {}
    public void setSourceRect(float p0, float p1, float p2, float p3) {}
    public void setTargetRect(float p0, float p1, float p2, float p3) {}
    public void setClearsOutput(boolean p0) {}
    public void setClearColor(float p0, float p1, float p2) {}
    public void setBlendEnabled(boolean p0) {}
    public void setBlendFunc(int p0, int p1) {}
    public void setDrawMode(int p0) {}
    public void setVertexCount(int p0) {}
    public void setMaximumTileSize(int p0) {}
    public void beginDrawing() {}
    public native boolean setSourceRegion(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7);
}
