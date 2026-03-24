package android.filterpacks.imageproc;

public class ToRGBFilter extends android.filterfw.core.Filter {
    private int mInputBPP;
    private android.filterfw.core.Program mProgram;
    private android.filterfw.core.FrameFormat mLastFormat;
    public ToRGBFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public android.filterfw.core.FrameFormat getConvertedFormat(android.filterfw.core.FrameFormat p0) { return null; }
    public void createProgram(android.filterfw.core.FilterContext p0, android.filterfw.core.FrameFormat p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
