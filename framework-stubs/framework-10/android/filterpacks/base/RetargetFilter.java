package android.filterpacks.base;

public class RetargetFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="target", hasDefault=false)
    private java.lang.String mTargetString;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private int mTarget;
    public RetargetFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
}
