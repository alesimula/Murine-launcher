package android.filterpacks.imageproc;

public class BlackWhiteFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="black", hasDefault=true)
    private float mBlack;
    @android.filterfw.core.GenerateFieldPort(name="white", hasDefault=true)
    private float mWhite;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private java.util.Random mRandom;
    private int mTarget;
    private final java.lang.String mBlackWhiteShader = null;
    public BlackWhiteFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
