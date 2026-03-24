package android.opengl;

public class GLSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback2 {
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public GLSurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public GLSurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void finalize() throws java.lang.Throwable {}
    public void setGLWrapper(android.opengl.GLSurfaceView.GLWrapper p0) {}
    public void setDebugFlags(int p0) {}
    public int getDebugFlags() { return 0; }
    public void setPreserveEGLContextOnPause(boolean p0) {}
    public boolean getPreserveEGLContextOnPause() { return false; }
    public void setRenderer(android.opengl.GLSurfaceView.Renderer p0) {}
    public void setEGLContextFactory(android.opengl.GLSurfaceView.EGLContextFactory p0) {}
    public void setEGLWindowSurfaceFactory(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory p0) {}
    public void setEGLConfigChooser(android.opengl.GLSurfaceView.EGLConfigChooser p0) {}
    public void setEGLConfigChooser(boolean p0) {}
    public void setEGLConfigChooser(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void setEGLContextClientVersion(int p0) {}
    public void setRenderMode(int p0) {}
    public int getRenderMode() { return 0; }
    public void requestRender() {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceRedrawNeededAsync(android.view.SurfaceHolder p0, java.lang.Runnable p1) {}
    @java.lang.Deprecated
    public void surfaceRedrawNeeded(android.view.SurfaceHolder p0) {}
    public void onPause() {}
    public void onResume() {}
    public void queueEvent(java.lang.Runnable p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}

    public static interface EGLWindowSurfaceFactory {
        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, java.lang.Object p3);
        public void destroySurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLSurface p2);
    }

    public static interface EGLConfigChooser {
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1);
    }

    public static interface EGLContextFactory {
        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2);
        public void destroyContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLContext p2);
    }

    public static interface GLWrapper {
        public javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL p0);
    }

    public static interface Renderer {
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1);
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 p0, int p1, int p2);
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 p0);
    }

    private abstract class BaseConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
        protected int[] mConfigSpec;
        public BaseConfigChooser(android.opengl.GLSurfaceView p0, int[] p1) {}
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1) { return null; }
        abstract javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2);
    }

    private class ComponentSizeChooser extends android.opengl.GLSurfaceView.BaseConfigChooser {
        protected int mRedSize;
        protected int mGreenSize;
        protected int mBlueSize;
        protected int mAlphaSize;
        protected int mDepthSize;
        protected int mStencilSize;
        public ComponentSizeChooser(android.opengl.GLSurfaceView p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(null, null); }
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2) { return null; }
    }

    private class DefaultContextFactory implements android.opengl.GLSurfaceView.EGLContextFactory {
        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2) { return null; }
        public void destroyContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLContext p2) {}
    }

    private static class DefaultWindowSurfaceFactory implements android.opengl.GLSurfaceView.EGLWindowSurfaceFactory {
        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, java.lang.Object p3) { return null; }
        public void destroySurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLSurface p2) {}
    }

    private static class EglHelper {
        javax.microedition.khronos.egl.EGL10 mEgl;
        javax.microedition.khronos.egl.EGLDisplay mEglDisplay;
        javax.microedition.khronos.egl.EGLSurface mEglSurface;
        javax.microedition.khronos.egl.EGLConfig mEglConfig;
        javax.microedition.khronos.egl.EGLContext mEglContext;
        public EglHelper(java.lang.ref.WeakReference<android.opengl.GLSurfaceView> p0) {}
        public void start() {}
        public boolean createSurface() { return false; }
        javax.microedition.khronos.opengles.GL createGL() { return null; }
        public int swap() { return 0; }
        public void destroySurface() {}
        public void finish() {}
        public static void throwEglException(java.lang.String p0, int p1) {}
        public static void logEglErrorAsWarning(java.lang.String p0, java.lang.String p1, int p2) {}
        public static java.lang.String formatEglError(java.lang.String p0, int p1) { return null; }
    }

    static class GLThread extends java.lang.Thread {
        GLThread(java.lang.ref.WeakReference<android.opengl.GLSurfaceView> p0) { super(); }
        public void run() {}
        public boolean ableToDraw() { return false; }
        public void setRenderMode(int p0) {}
        public int getRenderMode() { return 0; }
        public void requestRender() {}
        public void requestRenderAndNotify(java.lang.Runnable p0) {}
        public void surfaceCreated() {}
        public void surfaceDestroyed() {}
        public void onPause() {}
        public void onResume() {}
        public void onWindowResize(int p0, int p1) {}
        public void requestExitAndWait() {}
        public void requestReleaseEglContextLocked() {}
        public void queueEvent(java.lang.Runnable p0) {}
    }

    private static class GLThreadManager {
        public synchronized void threadExiting(android.opengl.GLSurfaceView.GLThread p0) {}
        public void releaseEglContextLocked(android.opengl.GLSurfaceView.GLThread p0) {}
    }

    static class LogWriter extends java.io.Writer {
        LogWriter() { super(); }
        public void close() {}
        public void flush() {}
        public void write(char[] p0, int p1, int p2) {}
    }

    private class SimpleEGLConfigChooser extends android.opengl.GLSurfaceView.ComponentSizeChooser {
        public SimpleEGLConfigChooser(android.opengl.GLSurfaceView p0, boolean p1) { super(null, 0, 0, 0, 0, 0, 0); }
    }
}
