package android.graphics;

public class PixelFormat {
    public static final int UNKNOWN = 0;
    public static final int TRANSLUCENT = -3;
    public static final int TRANSPARENT = -2;
    public static final int OPAQUE = -1;
    public static final int RGBA_8888 = 1;
    public static final int RGBX_8888 = 2;
    public static final int RGB_888 = 3;
    public static final int RGB_565 = 4;
    @java.lang.Deprecated
    public static final int RGBA_5551 = 6;
    @java.lang.Deprecated
    public static final int RGBA_4444 = 7;
    @java.lang.Deprecated
    public static final int A_8 = 8;
    @java.lang.Deprecated
    public static final int L_8 = 9;
    @java.lang.Deprecated
    public static final int LA_88 = 10;
    @java.lang.Deprecated
    public static final int RGB_332 = 11;
    @java.lang.Deprecated
    public static final int YCbCr_422_SP = 16;
    @java.lang.Deprecated
    public static final int YCbCr_420_SP = 17;
    @java.lang.Deprecated
    public static final int YCbCr_422_I = 20;
    public static final int RGBA_F16 = 22;
    public static final int RGBA_1010102 = 43;
    public static final int HSV_888 = 55;
    public static final int R_8 = 56;
    @java.lang.Deprecated
    public static final int JPEG = 256;
    public int bytesPerPixel;
    public int bitsPerPixel;
    public PixelFormat() {}
    public static void getPixelFormatInfo(int p0, android.graphics.PixelFormat p1) {}
    public static boolean formatHasAlpha(int p0) { return false; }
    public static boolean isPublicFormat(int p0) { return false; }
    public static java.lang.String formatToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Opacity {
    }
}
