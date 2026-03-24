package android.graphics;

public class ImageFormat {
    public static final int UNKNOWN = 0;
    public static final int RGB_565 = 4;
    public static final int YV12 = 842094169;
    public static final int Y8 = 538982489;
    public static final int Y16 = 540422489;
    public static final int YCBCR_P010 = 54;
    public static final int NV16 = 16;
    public static final int NV21 = 17;
    public static final int YUY2 = 20;
    public static final int JPEG = 256;
    public static final int DEPTH_JPEG = 1768253795;
    public static final int YUV_420_888 = 35;
    public static final int YUV_422_888 = 39;
    public static final int YUV_444_888 = 40;
    public static final int FLEX_RGB_888 = 41;
    public static final int FLEX_RGBA_8888 = 42;
    public static final int RAW_SENSOR = 32;
    public static final int RAW_PRIVATE = 36;
    public static final int RAW10 = 37;
    public static final int RAW12 = 38;
    public static final int DEPTH16 = 1144402265;
    public static final int DEPTH_POINT_CLOUD = 257;
    public static final int RAW_DEPTH = 4098;
    public static final int RAW_DEPTH10 = 4099;
    public static final int PRIVATE = 34;
    public static final int HEIC = 1212500294;
    public ImageFormat() {}
    public static int getBitsPerPixel(int p0) { return 0; }
    public static boolean isPublicFormat(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }
}
