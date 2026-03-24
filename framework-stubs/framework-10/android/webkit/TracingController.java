package android.webkit;

public abstract class TracingController {
    @java.lang.Deprecated
    public TracingController() {}
    public static android.webkit.TracingController getInstance() { return null; }
    public abstract void start(android.webkit.TracingConfig p0);
    public abstract boolean stop(java.io.OutputStream p0, java.util.concurrent.Executor p1);
    public abstract boolean isTracing();
}
