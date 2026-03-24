package android.filterfw.core;

public class ShaderProgram extends android.filterfw.core.Program {
    private int shaderProgramId;
    private int mMaxTileSize;
    private android.filterfw.core.GLEnvironment mGLEnvironment;
    private android.filterfw.core.StopWatchMap mTimer;
    private void setTimer() {}
    private ShaderProgram() { super(); }
    private ShaderProgram(android.filterfw.core.NativeAllocatorTag p0) { super(); }
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
    private static android.filterfw.core.GLEnvironment getGLEnvironment(android.filterfw.core.FilterContext p0) { return null; }
    private native boolean allocate(android.filterfw.core.GLEnvironment p0, java.lang.String p1, java.lang.String p2);
    private native boolean deallocate();
    private native boolean compileAndLink();
    private native boolean shaderProcess(android.filterfw.core.GLFrame[] p0, android.filterfw.core.GLFrame p1);
    private native boolean setUniformValue(java.lang.String p0, java.lang.Object p1);
    private native java.lang.Object getUniformValue(java.lang.String p0);
    public native boolean setSourceRegion(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7);
    private native boolean setTargetRegion(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7);
    private static native android.filterfw.core.ShaderProgram nativeCreateIdentity(android.filterfw.core.GLEnvironment p0);
    private native boolean setShaderClearsOutput(boolean p0);
    private native boolean setShaderBlendEnabled(boolean p0);
    private native boolean setShaderBlendFunc(int p0, int p1);
    private native boolean setShaderClearColor(float p0, float p1, float p2);
    private native boolean setShaderDrawMode(int p0);
    private native boolean setShaderTileCounts(int p0, int p1);
    private native boolean setShaderVertexCount(int p0);
    private native boolean beginShaderDrawing();
    private native boolean setShaderAttributeValues(java.lang.String p0, float[] p1, int p2);
    private native boolean setShaderAttributeVertexFrame(java.lang.String p0, android.filterfw.core.VertexFrame p1, int p2, int p3, int p4, int p5, boolean p6);
}
