package android.media;

public class CameraProfile {
    public static final int QUALITY_LOW = 0;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_HIGH = 2;
    private static final java.util.HashMap<java.lang.Integer, int[]> sCache = null;
    public CameraProfile() {}
    public static int getJpegEncodingQualityParameter(int p0) { return 0; }
    public static int getJpegEncodingQualityParameter(int p0, int p1) { return 0; }
    private static int[] getImageEncodingQualityLevels(int p0) { return null; }
    private static final native void native_init();
    private static final native int native_get_num_image_encoding_quality_levels(int p0);
    private static final native int native_get_image_encoding_quality_level(int p0, int p1);
}
