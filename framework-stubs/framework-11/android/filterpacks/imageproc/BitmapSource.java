package android.filterpacks.imageproc;

public class BitmapSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="target")
    java.lang.String mTargetString;
    @android.filterfw.core.GenerateFieldPort(name="bitmap")
    private android.graphics.Bitmap mBitmap;
    @android.filterfw.core.GenerateFieldPort(name="recycleBitmap", hasDefault=true)
    private boolean mRecycleBitmap;
    @android.filterfw.core.GenerateFieldPort(name="repeatFrame", hasDefault=true)
    boolean mRepeatFrame;
    private int mTarget;
    private android.filterfw.core.Frame mImageFrame;
    public BitmapSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void loadImage(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
