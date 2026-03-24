package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public abstract class FrontendSettings {
    public static final int TYPE_UNDEFINED = 0;
    public static final int TYPE_ANALOG = 1;
    public static final int TYPE_ATSC = 2;
    public static final int TYPE_ATSC3 = 3;
    public static final int TYPE_DVBC = 4;
    public static final int TYPE_DVBS = 5;
    public static final int TYPE_DVBT = 6;
    public static final int TYPE_ISDBS = 7;
    public static final int TYPE_ISDBS3 = 8;
    public static final int TYPE_ISDBT = 9;
    public static final long FEC_UNDEFINED = 0L;
    public static final long FEC_AUTO = 1L;
    public static final long FEC_1_2 = 2L;
    public static final long FEC_1_3 = 4L;
    public static final long FEC_1_4 = 8L;
    public static final long FEC_1_5 = 16L;
    public static final long FEC_2_3 = 32L;
    public static final long FEC_2_5 = 64L;
    public static final long FEC_2_9 = 128L;
    public static final long FEC_3_4 = 256L;
    public static final long FEC_3_5 = 512L;
    public static final long FEC_4_5 = 1024L;
    public static final long FEC_4_15 = 2048L;
    public static final long FEC_5_6 = 4096L;
    public static final long FEC_5_9 = 8192L;
    public static final long FEC_6_7 = 16384L;
    public static final long FEC_7_8 = 32768L;
    public static final long FEC_7_9 = 65536L;
    public static final long FEC_7_15 = 131072L;
    public static final long FEC_8_9 = 262144L;
    public static final long FEC_8_15 = 524288L;
    public static final long FEC_9_10 = 1048576L;
    public static final long FEC_9_20 = 2097152L;
    public static final long FEC_11_15 = 4194304L;
    public static final long FEC_11_20 = 8388608L;
    public static final long FEC_11_45 = 16777216L;
    public static final long FEC_13_18 = 33554432L;
    public static final long FEC_13_45 = 67108864L;
    public static final long FEC_14_45 = 134217728L;
    public static final long FEC_23_36 = 268435456L;
    public static final long FEC_25_36 = 536870912L;
    public static final long FEC_26_45 = 1073741824L;
    public static final long FEC_28_45 = -2147483648L;
    public static final long FEC_29_45 = 1L;
    public static final long FEC_31_45 = 2L;
    public static final long FEC_32_45 = 4L;
    public static final long FEC_77_90 = 8L;
    private final int mFrequency = 0;
    FrontendSettings(int p0) {}
    public abstract int getType();
    public int getFrequency() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InnerFec {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
