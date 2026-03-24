package android.filterfw.core;

public class FilterFunction {
    private android.filterfw.core.Filter mFilter;
    private android.filterfw.core.FilterContext mFilterContext;
    private boolean mFilterIsSetup;
    private android.filterfw.core.FilterFunction.FrameHolderPort[] mResultHolders;
    public FilterFunction(android.filterfw.core.FilterContext p0, android.filterfw.core.Filter p1) {}
    public android.filterfw.core.Frame execute(android.filterfw.core.KeyValueMap p0) { return null; }
    public android.filterfw.core.Frame executeWithArgList(java.lang.Object... p0) { return null; }
    public void close() {}
    public android.filterfw.core.FilterContext getContext() { return null; }
    public android.filterfw.core.Filter getFilter() { return null; }
    public void setInputFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    public void setInputValue(java.lang.String p0, java.lang.Object p1) {}
    public void tearDown() {}
    public java.lang.String toString() { return null; }
    private void connectFilterOutputs() {}

    private class FrameHolderPort extends android.filterfw.core.StreamPort {
        public FrameHolderPort(android.filterfw.core.FilterFunction p0) { super(null, null); }
    }
}
