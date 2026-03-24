package javax.microedition.khronos.egl;

public abstract class EGLContext {
    private static final javax.microedition.khronos.egl.EGL EGL_INSTANCE = null;
    public EGLContext() {}
    public static javax.microedition.khronos.egl.EGL getEGL() { return null; }
    public abstract javax.microedition.khronos.opengles.GL getGL();
}
