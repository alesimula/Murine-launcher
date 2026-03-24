package android.filterpacks.imageproc;

public class AutoFixFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    @android.filterfw.core.GenerateFieldPort(name="scale")
    private float mScale;
    private static final int[] normal_cdf = null;
    private final java.lang.String mAutoFixShader = null;
    private android.filterfw.core.Program mShaderProgram;
    private android.filterfw.core.Program mNativeProgram;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    private android.filterfw.core.Frame mHistFrame;
    private android.filterfw.core.Frame mDensityFrame;
    public AutoFixFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    private void initParameters() {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void createHistogramFrame(android.filterfw.core.FilterContext p0, int p1, int p2, int[] p3) {}
}
