package android.filterpacks.imageproc;

public class SaturateFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="scale", hasDefault=true)
    private float mScale;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mBenProgram;
    private android.filterfw.core.Program mHerfProgram;
    private int mTarget;
    private final java.lang.String mBenSaturateShader = null;
    private final java.lang.String mHerfSaturateShader = null;
    public SaturateFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void initParameters() {}
    private void updateParameters() {}
}
