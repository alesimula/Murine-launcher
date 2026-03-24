package android.filterpacks.imageproc;

public class FillLightFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    @android.filterfw.core.GenerateFieldPort(name="strength", hasDefault=true)
    private float mBacklight;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    private final java.lang.String mFillLightShader = null;
    public FillLightFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    private void updateParameters() {}
}
