package android.filterpacks.imageproc;

public class CropRectFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="xorigin")
    private int mXorigin;
    @android.filterfw.core.GenerateFieldPort(name="yorigin")
    private int mYorigin;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mOutputWidth;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mOutputHeight;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    public CropRectFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    void updateSourceRect(int p0, int p1) {}
}
