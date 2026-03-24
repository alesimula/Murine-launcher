package com.android.internal.jank;

public class DisplayRefreshRate {
    public static final int UNKNOWN_REFRESH_RATE = 0;
    public static final int VARIABLE_REFRESH_RATE = 1;
    public static final int REFRESH_RATE_30_HZ = 2;
    public static final int REFRESH_RATE_60_HZ = 3;
    public static final int REFRESH_RATE_90_HZ = 4;
    public static final int REFRESH_RATE_120_HZ = 5;
    public static final int REFRESH_RATE_240_HZ = 6;
    public static int getRefreshRate(long p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RefreshRate {
    }
}
