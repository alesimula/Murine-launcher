package android.filterpacks.base;

public class FrameSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="format")
    private android.filterfw.core.FrameFormat mFormat;
    @android.filterfw.core.GenerateFieldPort(name="frame", hasDefault=true)
    private android.filterfw.core.Frame mFrame;
    @android.filterfw.core.GenerateFieldPort(name="repeatFrame", hasDefault=true)
    private boolean mRepeatFrame;
    public FrameSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
