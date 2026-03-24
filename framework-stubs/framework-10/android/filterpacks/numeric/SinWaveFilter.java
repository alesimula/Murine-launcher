package android.filterpacks.numeric;

public class SinWaveFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="stepSize", hasDefault=true)
    private float mStepSize;
    private float mValue;
    private android.filterfw.core.FrameFormat mOutputFormat;
    public SinWaveFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
