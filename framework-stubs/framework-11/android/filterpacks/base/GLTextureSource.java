package android.filterpacks.base;

public class GLTextureSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="texId")
    private int mTexId;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mWidth;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(name="repeatFrame", hasDefault=true)
    private boolean mRepeatFrame;
    @android.filterfw.core.GenerateFieldPort(name="timestamp", hasDefault=true)
    private long mTimestamp;
    private android.filterfw.core.Frame mFrame;
    public GLTextureSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
