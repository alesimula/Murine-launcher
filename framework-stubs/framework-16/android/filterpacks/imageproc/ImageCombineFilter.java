package android.filterpacks.imageproc;

public abstract class ImageCombineFilter extends android.filterfw.core.Filter {
    protected android.filterfw.core.Program mProgram;
    protected java.lang.String[] mInputNames;
    protected java.lang.String mOutputName;
    protected java.lang.String mParameterName;
    protected int mCurrentTarget;
    public ImageCombineFilter(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String p3) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    protected void updateProgramWithTarget(int p0, android.filterfw.core.FilterContext p1) {}
    protected abstract android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext p0);
    protected abstract android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext p0);
}
