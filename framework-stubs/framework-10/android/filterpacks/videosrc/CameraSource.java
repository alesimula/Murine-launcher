package android.filterpacks.videosrc;

public class CameraSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="id", hasDefault=true)
    private int mCameraId;
    @android.filterfw.core.GenerateFieldPort(name="width", hasDefault=true)
    private int mWidth;
    @android.filterfw.core.GenerateFieldPort(name="height", hasDefault=true)
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(name="framerate", hasDefault=true)
    private int mFps;
    @android.filterfw.core.GenerateFinalPort(name="waitForNewFrame", hasDefault=true)
    private boolean mWaitForNewFrame;
    private android.hardware.Camera mCamera;
    private android.filterfw.core.GLFrame mCameraFrame;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private float[] mCameraTransform;
    private float[] mMappedCoords;
    private static final float[] mSourceCoords = null;
    private static final int NEWFRAME_TIMEOUT = 100;
    private static final int NEWFRAME_TIMEOUT_REPEAT = 10;
    private boolean mNewFrameAvailable;
    private android.hardware.Camera.Parameters mCameraParameters;
    private static final java.lang.String mFrameShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    private final boolean mLogVerbose = false;
    private static final java.lang.String TAG = "CameraSource";
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onCameraFrameAvailableListener;
    public CameraSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    private void createFormats() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public synchronized android.hardware.Camera.Parameters getCameraParameters() { return null; }
    public synchronized void setCameraParameters(android.hardware.Camera.Parameters p0) {}
    private int[] findClosestSize(int p0, int p1, android.hardware.Camera.Parameters p2) { return null; }
    private int[] findClosestFpsRange(int p0, android.hardware.Camera.Parameters p1) { return null; }
}
