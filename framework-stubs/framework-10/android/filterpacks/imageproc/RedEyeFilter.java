package android.filterpacks.imageproc;

public class RedEyeFilter extends android.filterfw.core.Filter {
    private static final float RADIUS_RATIO = 0.05999999865889549f;
    private static final float MIN_RADIUS = 10.0f;
    private static final float DEFAULT_RED_INTENSITY = 1.2999999523162842f;
    @android.filterfw.core.GenerateFieldPort(name="centers")
    private float[] mCenters;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.Frame mRedEyeFrame;
    private android.graphics.Bitmap mRedEyeBitmap;
    private final android.graphics.Canvas mCanvas = null;
    private final android.graphics.Paint mPaint = null;
    private float mRadius;
    private int mWidth;
    private int mHeight;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    private final java.lang.String mRedEyeShader = null;
    public RedEyeFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    private void createRedEyeFrame(android.filterfw.core.FilterContext p0) {}
    private void updateProgramParams() {}
}
