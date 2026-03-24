package android.filterpacks.imageproc;

public class VignetteFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="scale", hasDefault=true)
    private float mScale;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    private final float mSlope = 0.0f;
    private final float mShade = 0.0f;
    private final java.lang.String mVignetteShader = null;
    public VignetteFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    private void initParameters() {}
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
