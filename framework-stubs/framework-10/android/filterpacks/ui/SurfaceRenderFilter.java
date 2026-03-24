package android.filterpacks.ui;

public class SurfaceRenderFilter extends android.filterfw.core.Filter implements android.view.SurfaceHolder.Callback {
    private final int RENDERMODE_STRETCH = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_FILL_CROP = 0;
    @android.filterfw.core.GenerateFinalPort(name="surfaceView")
    private android.filterfw.core.FilterSurfaceView mSurfaceView;
    @android.filterfw.core.GenerateFieldPort(name="renderMode", hasDefault=true)
    private java.lang.String mRenderModeString;
    private boolean mIsBound;
    private android.filterfw.core.ShaderProgram mProgram;
    private android.filterfw.core.GLFrame mScreen;
    private int mRenderMode;
    private float mAspectRatio;
    private int mScreenWidth;
    private int mScreenHeight;
    private boolean mLogVerbose;
    private static final java.lang.String TAG = "SurfaceRenderFilter";
    public SurfaceRenderFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void updateRenderMode() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public synchronized void surfaceCreated(android.view.SurfaceHolder p0) {}
    public synchronized void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public synchronized void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    private void updateTargetRect() {}
}
