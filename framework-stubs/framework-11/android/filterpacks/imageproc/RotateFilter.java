package android.filterpacks.imageproc;

public class RotateFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="angle")
    private int mAngle;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    private int mOutputWidth;
    private int mOutputHeight;
    public RotateFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void updateParameters() {}
}
