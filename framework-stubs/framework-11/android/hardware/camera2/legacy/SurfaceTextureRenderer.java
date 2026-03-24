package android.hardware.camera2.legacy;

public class SurfaceTextureRenderer {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final int GL_MATRIX_SIZE = 16;
    private static final int VERTEX_POS_SIZE = 3;
    private static final int VERTEX_UV_SIZE = 2;
    private static final int EGL_COLOR_BITLENGTH = 8;
    private static final int GLES_VERSION = 2;
    private static final int PBUFFER_PIXEL_BYTES = 4;
    private static final int FLIP_TYPE_NONE = 0;
    private static final int FLIP_TYPE_HORIZONTAL = 1;
    private static final int FLIP_TYPE_VERTICAL = 2;
    private static final int FLIP_TYPE_BOTH = 3;
    private static final java.time.format.DateTimeFormatter LOG_NAME_TIME_FORMATTER = null;
    private android.opengl.EGLDisplay mEGLDisplay;
    private android.opengl.EGLContext mEGLContext;
    private android.opengl.EGLConfig mConfigs;
    private java.util.List<android.hardware.camera2.legacy.SurfaceTextureRenderer.EGLSurfaceHolder> mSurfaces;
    private java.util.List<android.hardware.camera2.legacy.SurfaceTextureRenderer.EGLSurfaceHolder> mConversionSurfaces;
    private java.nio.ByteBuffer mPBufferPixels;
    private volatile android.graphics.SurfaceTexture mSurfaceTexture;
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    private static final float[] sHorizontalFlipTriangleVertices = null;
    private static final float[] sVerticalFlipTriangleVertices = null;
    private static final float[] sBothFlipTriangleVertices = null;
    private static final float[] sRegularTriangleVertices = null;
    private java.nio.FloatBuffer mRegularTriangleVertices;
    private java.nio.FloatBuffer mHorizontalFlipTriangleVertices;
    private java.nio.FloatBuffer mVerticalFlipTriangleVertices;
    private java.nio.FloatBuffer mBothFlipTriangleVertices;
    private final int mFacing = 0;
    private static final java.lang.String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final java.lang.String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private float[] mMVPMatrix;
    private float[] mSTMatrix;
    private int mProgram;
    private int mTextureID;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    private int maPositionHandle;
    private int maTextureHandle;
    private android.hardware.camera2.legacy.PerfMeasurement mPerfMeasurer;
    private static final java.lang.String LEGACY_PERF_PROPERTY = "persist.camera.legacy_perf";
    public SurfaceTextureRenderer(int p0) {}
    private int loadShader(int p0, java.lang.String p1) { return 0; }
    private int createProgram(java.lang.String p0, java.lang.String p1) { return 0; }
    private void drawFrame(android.graphics.SurfaceTexture p0, int p1, int p2, int p3) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    private void initializeGLState() {}
    private int getTextureId() { return 0; }
    private void clearState() {}
    private void configureEGLContext() {}
    private void configureEGLOutputSurfaces(java.util.Collection<android.hardware.camera2.legacy.SurfaceTextureRenderer.EGLSurfaceHolder> p0) {}
    private void configureEGLPbufferSurfaces(java.util.Collection<android.hardware.camera2.legacy.SurfaceTextureRenderer.EGLSurfaceHolder> p0) {}
    private void releaseEGLContext() {}
    private void makeCurrent(android.opengl.EGLSurface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    private boolean swapBuffers(android.opengl.EGLSurface p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return false; }
    private void checkEglDrawError(java.lang.String p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    private void checkEglError(java.lang.String p0) {}
    private void checkGlError(java.lang.String p0) {}
    private void checkGlDrawError(java.lang.String p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException {}
    private void dumpGlTiming() {}
    private static java.lang.String formatTimestamp(long p0) { return null; }
    private void setupGlTiming() {}
    private void beginGlTiming() {}
    private void addGlTimestamp(long p0) {}
    private void endGlTiming() {}
    public android.graphics.SurfaceTexture getSurfaceTexture() { return null; }
    public void configureSurfaces(java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p0) {}
    public void drawIntoSurfaces(android.hardware.camera2.legacy.CaptureCollector p0) {}
    public void cleanupEGLContext() {}
    public void flush() {}

    private class EGLSurfaceHolder {
        android.view.Surface surface;
        android.opengl.EGLSurface eglSurface;
        int width;
        int height;
        private EGLSurfaceHolder(android.hardware.camera2.legacy.SurfaceTextureRenderer p0) {}
    }
}
