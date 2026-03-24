package android.view;

public abstract class CompositionSamplingListener {
    public CompositionSamplingListener(java.util.concurrent.Executor p0) {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public abstract void onSampleCollected(float p0);
    public static void register(android.view.CompositionSamplingListener p0, int p1, android.view.SurfaceControl p2, android.graphics.Rect p3) {}
    public static void unregister(android.view.CompositionSamplingListener p0) {}
}
