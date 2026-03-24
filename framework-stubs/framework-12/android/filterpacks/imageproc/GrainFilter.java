package android.filterpacks.imageproc;

public class GrainFilter extends android.filterfw.core.Filter {
    private static final int RAND_THRESHOLD = 128;
    @android.filterfw.core.GenerateFieldPort(name="strength", hasDefault=true)
    private float mScale;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mGrainProgram;
    private android.filterfw.core.Program mNoiseProgram;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    private java.util.Random mRandom;
    private final java.lang.String mNoiseShader = null;
    private final java.lang.String mGrainShader = null;
    public GrainFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    private void updateParameters() {}
    private void updateFrameSize(int p0, int p1) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
