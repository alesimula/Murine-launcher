package android.filterpacks.base;

public class InputStreamSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="target")
    private java.lang.String mTarget;
    @android.filterfw.core.GenerateFieldPort(name="stream")
    private java.io.InputStream mInputStream;
    @android.filterfw.core.GenerateFinalPort(name="format", hasDefault=true)
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    public InputStreamSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
