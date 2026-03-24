package android.filterpacks.imageproc;

public class DrawRectFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="colorRed", hasDefault=true)
    private float mColorRed;
    @android.filterfw.core.GenerateFieldPort(name="colorGreen", hasDefault=true)
    private float mColorGreen;
    @android.filterfw.core.GenerateFieldPort(name="colorBlue", hasDefault=true)
    private float mColorBlue;
    private final java.lang.String mVertexShader = null;
    private final java.lang.String mFixedColorFragmentShader = null;
    private android.filterfw.core.ShaderProgram mProgram;
    public DrawRectFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void renderBox(android.filterfw.geometry.Quad p0) {}
}
