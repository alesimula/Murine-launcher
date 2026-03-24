package android.filterpacks.performance;

public class ThroughputFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="period", hasDefault=true)
    private int mPeriod;
    private long mLastTime;
    private int mTotalFrameCount;
    private int mPeriodFrameCount;
    private android.filterfw.core.FrameFormat mOutputFormat;
    public ThroughputFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
