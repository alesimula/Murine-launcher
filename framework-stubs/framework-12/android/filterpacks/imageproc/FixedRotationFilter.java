package android.filterpacks.imageproc;

public class FixedRotationFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="rotation", hasDefault=true)
    private int mRotation;
    private android.filterfw.core.ShaderProgram mProgram;
    public FixedRotationFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
}
