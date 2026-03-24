package android.opengl;

class EGLLogWrapper implements javax.microedition.khronos.egl.EGL11 {
    private javax.microedition.khronos.egl.EGL10 mEgl10;
    java.io.Writer mLog;
    boolean mLogArgumentNames;
    boolean mCheckError;
    private int mArgCount;
    public EGLLogWrapper(javax.microedition.khronos.egl.EGL p0, int p1, java.io.Writer p2) {}
    public boolean eglChooseConfig(javax.microedition.khronos.egl.EGLDisplay p0, int[] p1, javax.microedition.khronos.egl.EGLConfig[] p2, int p3, int[] p4) { return false; }
    public boolean eglCopyBuffers(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, java.lang.Object p2) { return false; }
    public javax.microedition.khronos.egl.EGLContext eglCreateContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, javax.microedition.khronos.egl.EGLContext p2, int[] p3) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, int[] p2) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3) { return null; }
    public boolean eglDestroyContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLContext p1) { return false; }
    public boolean eglDestroySurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1) { return false; }
    public boolean eglGetConfigAttrib(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, int p2, int[] p3) { return false; }
    public boolean eglGetConfigs(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig[] p1, int p2, int[] p3) { return false; }
    public javax.microedition.khronos.egl.EGLContext eglGetCurrentContext() { return null; }
    public javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay() { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface(int p0) { return null; }
    public javax.microedition.khronos.egl.EGLDisplay eglGetDisplay(java.lang.Object p0) { return null; }
    public int eglGetError() { return 0; }
    public boolean eglInitialize(javax.microedition.khronos.egl.EGLDisplay p0, int[] p1) { return false; }
    public boolean eglMakeCurrent(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, javax.microedition.khronos.egl.EGLSurface p2, javax.microedition.khronos.egl.EGLContext p3) { return false; }
    public boolean eglQueryContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLContext p1, int p2, int[] p3) { return false; }
    public java.lang.String eglQueryString(javax.microedition.khronos.egl.EGLDisplay p0, int p1) { return null; }
    public boolean eglQuerySurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, int p2, int[] p3) { return false; }
    public boolean eglReleaseThread() { return false; }
    public boolean eglSwapBuffers(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1) { return false; }
    public boolean eglTerminate(javax.microedition.khronos.egl.EGLDisplay p0) { return false; }
    public boolean eglWaitGL() { return false; }
    public boolean eglWaitNative(int p0, java.lang.Object p1) { return false; }
    private void checkError() {}
    private void logLine(java.lang.String p0) {}
    private void log(java.lang.String p0) {}
    private void begin(java.lang.String p0) {}
    private void arg(java.lang.String p0, java.lang.String p1) {}
    private void end() {}
    private void flush() {}
    private void arg(java.lang.String p0, int p1) {}
    private void arg(java.lang.String p0, java.lang.Object p1) {}
    private void arg(java.lang.String p0, javax.microedition.khronos.egl.EGLDisplay p1) {}
    private void arg(java.lang.String p0, javax.microedition.khronos.egl.EGLContext p1) {}
    private void arg(java.lang.String p0, javax.microedition.khronos.egl.EGLSurface p1) {}
    private void returns(java.lang.String p0) {}
    private void returns(int p0) {}
    private void returns(boolean p0) {}
    private void returns(java.lang.Object p0) {}
    private java.lang.String toString(java.lang.Object p0) { return null; }
    private void arg(java.lang.String p0, int[] p1) {}
    private void arg(java.lang.String p0, java.lang.Object[] p1) {}
    private java.lang.String toString(int p0, int[] p1, int p2) { return null; }
    private java.lang.String toString(int p0, java.lang.Object[] p1, int p2) { return null; }
    private static java.lang.String getHex(int p0) { return null; }
    public static java.lang.String getErrorString(int p0) { return null; }
}
