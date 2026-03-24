package android.filterpacks.imageproc;

public class ResizeFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="owidth")
    private int mOWidth;
    @android.filterfw.core.GenerateFieldPort(name="oheight")
    private int mOHeight;
    @android.filterfw.core.GenerateFieldPort(name="keepAspectRatio", hasDefault=true)
    private boolean mKeepAspectRatio;
    @android.filterfw.core.GenerateFieldPort(name="generateMipMap", hasDefault=true)
    private boolean mGenerateMipMap;
    private android.filterfw.core.Program mProgram;
    private android.filterfw.core.FrameFormat mLastFormat;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private int mInputChannels;
    public ResizeFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    protected void createProgram(android.filterfw.core.FilterContext p0, android.filterfw.core.FrameFormat p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
