package android.filterpacks.ui;

public class SurfaceRenderFilter extends android.filterfw.core.Filter implements android.view.SurfaceHolder.Callback {
    public SurfaceRenderFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void updateRenderMode() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public synchronized void surfaceCreated(android.view.SurfaceHolder p0) {}
    public synchronized void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public synchronized void surfaceDestroyed(android.view.SurfaceHolder p0) {}
}
