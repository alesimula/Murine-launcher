package android.filterpacks.base;

public class CallbackFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="listener", hasDefault=true)
    private android.filterfw.core.FilterContext.OnFrameReceivedListener mListener;
    @android.filterfw.core.GenerateFieldPort(name="userData", hasDefault=true)
    private java.lang.Object mUserData;
    @android.filterfw.core.GenerateFinalPort(name="callUiThread", hasDefault=true)
    private boolean mCallbacksOnUiThread;
    private android.os.Handler mUiThreadHandler;
    public CallbackFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}

    private class CallbackRunnable implements java.lang.Runnable {
        private android.filterfw.core.Filter mFilter;
        private android.filterfw.core.Frame mFrame;
        private java.lang.Object mUserData;
        private android.filterfw.core.FilterContext.OnFrameReceivedListener mListener;
        public CallbackRunnable(android.filterpacks.base.CallbackFilter p0, android.filterfw.core.FilterContext.OnFrameReceivedListener p1, android.filterfw.core.Filter p2, android.filterfw.core.Frame p3, java.lang.Object p4) {}
        public void run() {}
    }
}
