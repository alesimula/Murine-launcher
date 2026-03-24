package android.filterpacks.base;

public class FrameBranch extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="outputs", hasDefault=true)
    private int mNumberOfOutputs;
    public FrameBranch(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
}
