package android.filterpacks.imageproc;

public class ImageEncoder extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="stream")
    private java.io.OutputStream mOutputStream;
    @android.filterfw.core.GenerateFieldPort(name="quality", hasDefault=true)
    private int mQuality;
    public ImageEncoder(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void process(android.filterfw.core.FilterContext p0) {}
}
