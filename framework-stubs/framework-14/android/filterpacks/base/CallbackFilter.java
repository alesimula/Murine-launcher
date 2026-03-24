package android.filterpacks.base;

public class CallbackFilter extends android.filterfw.core.Filter {
    public CallbackFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}

    private class CallbackRunnable implements java.lang.Runnable {
        public CallbackRunnable(android.filterpacks.base.CallbackFilter p0, android.filterfw.core.FilterContext.OnFrameReceivedListener p1, android.filterfw.core.Filter p2, android.filterfw.core.Frame p3, java.lang.Object p4) {}
        public void run() {}
    }
}
