package android.hardware;

public final class HardwareBuffer implements android.os.Parcelable, java.lang.AutoCloseable {
    public static final int RGBA_8888 = 1;
    public static final int RGBX_8888 = 2;
    public static final int RGB_888 = 3;
    public static final int RGB_565 = 4;
    public static final int RGBA_FP16 = 22;
    public static final int RGBA_1010102 = 43;
    public static final int BLOB = 33;
    public static final int YCBCR_420_888 = 35;
    public static final int D_16 = 48;
    public static final int D_24 = 49;
    public static final int DS_24UI8 = 50;
    public static final int D_FP32 = 51;
    public static final int DS_FP32UI8 = 52;
    public static final int S_UI8 = 53;
    public static final int YCBCR_P010 = 54;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.requested_formats_v")
    public static final int R_8 = 56;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.requested_formats_v")
    public static final int R_16 = 57;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.requested_formats_v")
    public static final int RG_1616 = 58;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.requested_formats_v")
    public static final int RGBA_10101010 = 59;
    public static final long USAGE_CPU_READ_RARELY = 2L;
    public static final long USAGE_CPU_READ_OFTEN = 3L;
    public static final long USAGE_CPU_WRITE_RARELY = 32L;
    public static final long USAGE_CPU_WRITE_OFTEN = 48L;
    public static final long USAGE_GPU_SAMPLED_IMAGE = 256L;
    public static final long USAGE_GPU_COLOR_OUTPUT = 512L;
    public static final long USAGE_COMPOSER_OVERLAY = 2048L;
    public static final long USAGE_PROTECTED_CONTENT = 16384L;
    public static final long USAGE_VIDEO_ENCODE = 65536L;
    public static final long USAGE_SENSOR_DIRECT_DATA = 8388608L;
    public static final long USAGE_GPU_DATA_BUFFER = 16777216L;
    public static final long USAGE_GPU_CUBE_MAP = 33554432L;
    public static final long USAGE_GPU_MIPMAP_COMPLETE = 67108864L;
    public static final long USAGE_FRONT_BUFFER = 4294967296L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.HardwareBuffer> CREATOR = null;
    @android.annotation.NonNull
    public static android.hardware.HardwareBuffer create(int p0, int p1, int p2, int p3, long p4) { return null; }
    public static boolean isSupported(int p0, int p1, int p2, int p3, long p4) { return false; }
    @android.annotation.NonNull
    public static android.hardware.HardwareBuffer createFromGraphicBuffer(android.graphics.GraphicBuffer p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getFormat() { return 0; }
    public int getLayers() { return 0; }
    public long getUsage() { return 0L; }
    public long getId() { return 0L; }
    public void close() {}
    public boolean isClosed() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Usage {
    }
}
