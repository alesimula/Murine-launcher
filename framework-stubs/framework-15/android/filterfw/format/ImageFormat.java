package android.filterfw.format;

public class ImageFormat {
    public static final java.lang.String COLORSPACE_KEY = "colorspace";
    public static final int COLORSPACE_GRAY = 1;
    public static final int COLORSPACE_RGB = 2;
    public static final int COLORSPACE_RGBA = 3;
    public static final int COLORSPACE_YUV = 4;
    public ImageFormat() {}
    public static android.filterfw.core.MutableFrameFormat create(int p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.filterfw.core.MutableFrameFormat create(int p0, int p1, int p2, int p3) { return null; }
    public static android.filterfw.core.MutableFrameFormat create(int p0, int p1) { return null; }
    public static android.filterfw.core.MutableFrameFormat create(int p0) { return null; }
    public static int bytesPerSampleForColorspace(int p0) { return 0; }
}
