package android.filterpacks.base;

public class FrameFetch extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="format", hasDefault=true)
    private android.filterfw.core.FrameFormat mFormat;
    @android.filterfw.core.GenerateFieldPort(name="key")
    private java.lang.String mKey;
    @android.filterfw.core.GenerateFieldPort(name="repeatFrame", hasDefault=true)
    private boolean mRepeatFrame;
    public FrameFetch(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
