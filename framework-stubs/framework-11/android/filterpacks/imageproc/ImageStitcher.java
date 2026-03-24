package android.filterpacks.imageproc;

public class ImageStitcher extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="xSlices")
    private int mXSlices;
    @android.filterfw.core.GenerateFieldPort(name="ySlices")
    private int mYSlices;
    @android.filterfw.core.GenerateFieldPort(name="padSize")
    private int mPadSize;
    private android.filterfw.core.Program mProgram;
    private android.filterfw.core.Frame mOutputFrame;
    private int mInputWidth;
    private int mInputHeight;
    private int mImageWidth;
    private int mImageHeight;
    private int mSliceWidth;
    private int mSliceHeight;
    private int mSliceIndex;
    public ImageStitcher(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    private android.filterfw.core.FrameFormat calcOutputFormatForInput(android.filterfw.core.FrameFormat p0) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
}
