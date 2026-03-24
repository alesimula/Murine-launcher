package android.filterpacks.imageproc;

public class BitmapOverlayFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="bitmap")
    private android.graphics.Bitmap mBitmap;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Program mProgram;
    private android.filterfw.core.Frame mFrame;
    private int mTarget;
    private final java.lang.String mOverlayShader = null;
    public BitmapOverlayFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    private android.filterfw.core.Frame createBitmapFrame(android.filterfw.core.FilterContext p0) { return null; }
}
