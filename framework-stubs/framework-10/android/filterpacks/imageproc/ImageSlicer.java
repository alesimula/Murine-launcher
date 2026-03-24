package android.filterpacks.imageproc;

public class ImageSlicer extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="xSlices")
    private int mXSlices;
    @android.filterfw.core.GenerateFieldPort(name="ySlices")
    private int mYSlices;
    @android.filterfw.core.GenerateFieldPort(name="padSize")
    private int mPadSize;
    private int mSliceIndex;
    private android.filterfw.core.Frame mOriginalFrame;
    private android.filterfw.core.Program mProgram;
    private int mInputWidth;
    private int mInputHeight;
    private int mSliceWidth;
    private int mSliceHeight;
    private int mOutputWidth;
    private int mOutputHeight;
    public ImageSlicer(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    private void calcOutputFormatForInput(android.filterfw.core.Frame p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
