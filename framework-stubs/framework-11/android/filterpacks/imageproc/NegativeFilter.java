package android.filterpacks.imageproc;

public class NegativeFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    private final java.lang.String mNegativeShader = null;
    public NegativeFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
