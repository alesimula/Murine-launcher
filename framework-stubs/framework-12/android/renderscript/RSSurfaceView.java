package android.renderscript;

@java.lang.Deprecated
public class RSSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private android.view.SurfaceHolder mSurfaceHolder;
    private android.renderscript.RenderScriptGL mRS;
    public RSSurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public RSSurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void init() {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void pause() {}
    public void resume() {}
    public android.renderscript.RenderScriptGL createRenderScriptGL(android.renderscript.RenderScriptGL.SurfaceConfig p0) { return null; }
    public void destroyRenderScriptGL() {}
    public void setRenderScriptGL(android.renderscript.RenderScriptGL p0) {}
    public android.renderscript.RenderScriptGL getRenderScriptGL() { return null; }
}
