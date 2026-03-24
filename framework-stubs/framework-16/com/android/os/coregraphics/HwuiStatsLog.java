package com.android.os.coregraphics;

public final class HwuiStatsLog {
    public static final int HARDWARE_RENDERER_EVENT = 946;
    public static final int TEXTURE_VIEW_EVENT = 947;
    public static final int IMAGE_DECODED = 977;
    public static final int GRAPHICS_STATS = 10068;
    public static final int HARDWARE_RENDERER_EVENT__PREVIOUS_COLOR_MODE__DEFAULT = 0;
    public static final int HARDWARE_RENDERER_EVENT__PREVIOUS_COLOR_MODE__WIDE_COLOR = 1;
    public static final int HARDWARE_RENDERER_EVENT__PREVIOUS_COLOR_MODE__HDR = 2;
    public static final int IMAGE_DECODED__COLOR_SPACE_TRANSFER__COLOR_SPACE_TRANSFER_UNKNOWN = 0;
    public static final int IMAGE_DECODED__COLOR_SPACE_TRANSFER__COLOR_SPACE_TRANSFER_SRGBISH = 1;
    public static final int IMAGE_DECODED__COLOR_SPACE_TRANSFER__COLOR_SPACE_TRANSFER_PQISH = 2;
    public static final int IMAGE_DECODED__COLOR_SPACE_TRANSFER__COLOR_SPACE_TRANSFER_HLGISH = 3;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_A_8 = 1;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_RGB_565 = 2;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_ARGB_8888 = 3;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_RGBA_F16 = 4;
    public static final int IMAGE_DECODED__FORMAT__BITMAP_FORMAT_RGBA_1010102 = 5;
    public static final int GRAPHICS_STATS__PIPELINE__UNKNOWN = 0;
    public static final int GRAPHICS_STATS__PIPELINE__GL = 1;
    public static final int GRAPHICS_STATS__PIPELINE__VULKAN = 2;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_IS_UID = 1;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    @android.annotation.SuppressLint("InlinedApi")
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public HwuiStatsLog() {}
    public static void write(int p0, int p1, int p2, boolean p3, int p4) {}
    public static void write(int p0, int p1, long p2, int p3) {}
    public static android.util.StatsEvent buildStatsEvent(int p0, java.lang.String p1, long p2, long p3, long p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, byte[] p13, byte[] p14, long p15, boolean p16, int p17) { return null; }
}
