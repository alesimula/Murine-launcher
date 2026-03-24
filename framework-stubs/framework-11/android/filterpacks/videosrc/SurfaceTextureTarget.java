package android.filterpacks.videosrc;

public class SurfaceTextureTarget extends android.filterfw.core.Filter {
    private final int RENDERMODE_STRETCH = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_FILL_CROP = 0;
    private final int RENDERMODE_CUSTOMIZE = 0;
    @android.filterfw.core.GenerateFinalPort(name="surfaceTexture")
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @android.filterfw.core.GenerateFinalPort(name="width")
    private int mScreenWidth;
    @android.filterfw.core.GenerateFinalPort(name="height")
    private int mScreenHeight;
    @android.filterfw.core.GenerateFieldPort(name="renderMode", hasDefault=true)
    private java.lang.String mRenderModeString;
    @android.filterfw.core.GenerateFieldPort(name="sourceQuad", hasDefault=true)
    private android.filterfw.geometry.Quad mSourceQuad;
    @android.filterfw.core.GenerateFieldPort(name="targetQuad", hasDefault=true)
    private android.filterfw.geometry.Quad mTargetQuad;
    private int mSurfaceId;
    private android.filterfw.core.ShaderProgram mProgram;
    private android.filterfw.core.GLFrame mScreen;
    private int mRenderMode;
    private float mAspectRatio;
    private boolean mLogVerbose;
    private static final java.lang.String TAG = "SurfaceTextureTarget";
    public SurfaceTextureTarget(java.lang.String p0) { super(null); }
    public synchronized void setupPorts() {}
    public void updateRenderMode() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public synchronized void open(android.filterfw.core.FilterContext p0) {}
    public synchronized void close(android.filterfw.core.FilterContext p0) {}
    public synchronized void disconnect(android.filterfw.core.FilterContext p0) {}
    public synchronized void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    private void updateTargetRect() {}
}
