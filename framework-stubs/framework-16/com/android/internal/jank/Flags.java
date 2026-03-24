package com.android.internal.jank;

public final class Flags {
    public static final java.lang.String FLAG_IGNORE_HWUI_IS_FIRST_FRAME = "com.android.internal.jank.ignore_hwui_is_first_frame";
    public static final java.lang.String FLAG_USE_SF_FRAME_DURATION = "com.android.internal.jank.use_sf_frame_duration";
    public Flags() {}
    public static boolean ignoreHwuiIsFirstFrame() { return false; }
    public static boolean useSfFrameDuration() { return false; }
}
