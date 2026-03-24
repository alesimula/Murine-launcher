package com.google.android.gles_jni;

public class EGLImpl implements javax.microedition.khronos.egl.EGL10 {
    private com.google.android.gles_jni.EGLContextImpl mContext;
    private com.google.android.gles_jni.EGLDisplayImpl mDisplay;
    private com.google.android.gles_jni.EGLSurfaceImpl mSurface;
    public native boolean eglInitialize(javax.microedition.khronos.egl.EGLDisplay p0, int[] p1);
    public native boolean eglQueryContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLContext p1, int p2, int[] p3);
    public native boolean eglQuerySurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, int p2, int[] p3);
    public native boolean eglReleaseThread();
    public native boolean eglChooseConfig(javax.microedition.khronos.egl.EGLDisplay p0, int[] p1, javax.microedition.khronos.egl.EGLConfig[] p2, int p3, int[] p4);
    public native boolean eglGetConfigAttrib(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, int p2, int[] p3);
    public native boolean eglGetConfigs(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig[] p1, int p2, int[] p3);
    public native int eglGetError();
    public native boolean eglDestroyContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLContext p1);
    public native boolean eglDestroySurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1);
    public native boolean eglMakeCurrent(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, javax.microedition.khronos.egl.EGLSurface p2, javax.microedition.khronos.egl.EGLContext p3);
    public native java.lang.String eglQueryString(javax.microedition.khronos.egl.EGLDisplay p0, int p1);
    public native boolean eglSwapBuffers(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1);
    public native boolean eglTerminate(javax.microedition.khronos.egl.EGLDisplay p0);
    public native boolean eglCopyBuffers(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLSurface p1, java.lang.Object p2);
    public native boolean eglWaitGL();
    public native boolean eglWaitNative(int p0, java.lang.Object p1);
    public static native int getInitCount(javax.microedition.khronos.egl.EGLDisplay p0);
    public EGLImpl() {}
    public javax.microedition.khronos.egl.EGLContext eglCreateContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, javax.microedition.khronos.egl.EGLContext p2, int[] p3) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, int[] p2) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3) { return null; }
    public javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3) { return null; }
    public synchronized javax.microedition.khronos.egl.EGLDisplay eglGetDisplay(java.lang.Object p0) { return null; }
    public synchronized javax.microedition.khronos.egl.EGLContext eglGetCurrentContext() { return null; }
    public synchronized javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay() { return null; }
    public synchronized javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface(int p0) { return null; }
    private native long _eglCreateContext(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, javax.microedition.khronos.egl.EGLContext p2, int[] p3);
    private native long _eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, int[] p2);
    private native void _eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLSurface p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, java.lang.Object p3, int[] p4);
    private native long _eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3);
    private native long _eglCreateWindowSurfaceTexture(javax.microedition.khronos.egl.EGLDisplay p0, javax.microedition.khronos.egl.EGLConfig p1, java.lang.Object p2, int[] p3);
    private native long _eglGetDisplay(java.lang.Object p0);
    private native long _eglGetCurrentContext();
    private native long _eglGetCurrentDisplay();
    private native long _eglGetCurrentSurface(int p0);
    private static native void _nativeClassInit();
}
