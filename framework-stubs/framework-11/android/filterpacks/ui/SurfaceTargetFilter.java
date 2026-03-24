package android.filterpacks.ui;

public class SurfaceTargetFilter extends android.filterfw.core.Filter {
    private final int RENDERMODE_STRETCH = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_FILL_CROP = 0;
    @android.filterfw.core.GenerateFinalPort(name="surface")
    private android.view.Surface mSurface;
    @android.filterfw.core.GenerateFieldPort(name="owidth")
    private int mScreenWidth;
    @android.filterfw.core.GenerateFieldPort(name="oheight")
    private int mScreenHeight;
    @android.filterfw.core.GenerateFieldPort(name="renderMode", hasDefault=true)
    private java.lang.String mRenderModeString;
    private android.filterfw.core.ShaderProgram mProgram;
    private android.filterfw.core.GLEnvironment mGlEnv;
    private android.filterfw.core.GLFrame mScreen;
    private int mRenderMode;
    private float mAspectRatio;
    private int mSurfaceId;
    private boolean mLogVerbose;
    private static final java.lang.String TAG = "SurfaceRenderFilter";
    public SurfaceTargetFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void updateRenderMode() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    private void updateTargetRect() {}
    private void registerSurface() {}
    private void unregisterSurface() {}
}
