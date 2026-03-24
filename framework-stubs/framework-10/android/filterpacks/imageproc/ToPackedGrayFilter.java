package android.filterpacks.imageproc;

public class ToPackedGrayFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="owidth", hasDefault=true)
    private int mOWidth;
    @android.filterfw.core.GenerateFieldPort(name="oheight", hasDefault=true)
    private int mOHeight;
    @android.filterfw.core.GenerateFieldPort(name="keepAspectRatio", hasDefault=true)
    private boolean mKeepAspectRatio;
    private android.filterfw.core.Program mProgram;
    private final java.lang.String mColorToPackedGrayShader = null;
    public ToPackedGrayFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    private void checkOutputDimensions(int p0, int p1) {}
    private android.filterfw.core.FrameFormat convertInputFormat(android.filterfw.core.FrameFormat p0) { return null; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
