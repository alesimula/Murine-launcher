package android.filterpacks.videosrc;

public class SurfaceTextureSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="sourceListener")
    private android.filterpacks.videosrc.SurfaceTextureSource.SurfaceTextureSourceListener mSourceListener;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mWidth;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(name="waitForNewFrame", hasDefault=true)
    private boolean mWaitForNewFrame;
    @android.filterfw.core.GenerateFieldPort(name="waitTimeout", hasDefault=true)
    private int mWaitTimeout;
    @android.filterfw.core.GenerateFieldPort(name="closeOnTimeout", hasDefault=true)
    private boolean mCloseOnTimeout;
    private android.filterfw.core.GLFrame mMediaFrame;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private android.os.ConditionVariable mNewFrameAvailable;
    private boolean mFirstFrame;
    private float[] mFrameTransform;
    private float[] mMappedCoords;
    private static final float[] mSourceCoords = null;
    private final java.lang.String mRenderShader = null;
    private static final java.lang.String TAG = "SurfaceTextureSource";
    private static final boolean mLogVerbose = Boolean.valueOf(false);
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public SurfaceTextureSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    private void createFormats() {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}

    public static interface SurfaceTextureSourceListener {
        public void onSurfaceTextureSourceReady(android.graphics.SurfaceTexture p0);
    }
}
