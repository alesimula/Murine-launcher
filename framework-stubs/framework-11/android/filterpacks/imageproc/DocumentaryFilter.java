package android.filterpacks.imageproc;

public class DocumentaryFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private java.util.Random mRandom;
    private int mWidth;
    private int mHeight;
    private int mTarget;
    private final java.lang.String mDocumentaryShader = null;
    public DocumentaryFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private void initParameters() {}
}
