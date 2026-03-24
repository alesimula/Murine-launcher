package android.filterpacks.imageproc;

public class FlipFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="vertical", hasDefault=true)
    private boolean mVertical;
    @android.filterfw.core.GenerateFieldPort(name="horizontal", hasDefault=true)
    private boolean mHorizontal;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    public FlipFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void updateParameters() {}
}
