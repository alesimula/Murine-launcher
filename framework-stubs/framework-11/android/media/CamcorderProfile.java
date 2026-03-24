package android.media;

public class CamcorderProfile {
    public static final int QUALITY_LOW = 0;
    public static final int QUALITY_HIGH = 1;
    public static final int QUALITY_QCIF = 2;
    public static final int QUALITY_CIF = 3;
    public static final int QUALITY_480P = 4;
    public static final int QUALITY_720P = 5;
    public static final int QUALITY_1080P = 6;
    public static final int QUALITY_QVGA = 7;
    public static final int QUALITY_2160P = 8;
    public static final int QUALITY_VGA = 9;
    public static final int QUALITY_4KDCI = 10;
    public static final int QUALITY_QHD = 11;
    public static final int QUALITY_2K = 12;
    private static final int QUALITY_LIST_START = 0;
    private static final int QUALITY_LIST_END = 12;
    public static final int QUALITY_TIME_LAPSE_LOW = 1000;
    public static final int QUALITY_TIME_LAPSE_HIGH = 1001;
    public static final int QUALITY_TIME_LAPSE_QCIF = 1002;
    public static final int QUALITY_TIME_LAPSE_CIF = 1003;
    public static final int QUALITY_TIME_LAPSE_480P = 1004;
    public static final int QUALITY_TIME_LAPSE_720P = 1005;
    public static final int QUALITY_TIME_LAPSE_1080P = 1006;
    public static final int QUALITY_TIME_LAPSE_QVGA = 1007;
    public static final int QUALITY_TIME_LAPSE_2160P = 1008;
    public static final int QUALITY_TIME_LAPSE_VGA = 1009;
    public static final int QUALITY_TIME_LAPSE_4KDCI = 1010;
    public static final int QUALITY_TIME_LAPSE_QHD = 1011;
    public static final int QUALITY_TIME_LAPSE_2K = 1012;
    private static final int QUALITY_TIME_LAPSE_LIST_START = 1000;
    private static final int QUALITY_TIME_LAPSE_LIST_END = 1012;
    public static final int QUALITY_HIGH_SPEED_LOW = 2000;
    public static final int QUALITY_HIGH_SPEED_HIGH = 2001;
    public static final int QUALITY_HIGH_SPEED_480P = 2002;
    public static final int QUALITY_HIGH_SPEED_720P = 2003;
    public static final int QUALITY_HIGH_SPEED_1080P = 2004;
    public static final int QUALITY_HIGH_SPEED_2160P = 2005;
    public static final int QUALITY_HIGH_SPEED_CIF = 2006;
    public static final int QUALITY_HIGH_SPEED_VGA = 2007;
    public static final int QUALITY_HIGH_SPEED_4KDCI = 2008;
    private static final int QUALITY_HIGH_SPEED_LIST_START = 2000;
    private static final int QUALITY_HIGH_SPEED_LIST_END = 2008;
    public int duration;
    public int quality;
    public int fileFormat;
    public int videoCodec;
    public int videoBitRate;
    public int videoFrameRate;
    public int videoFrameWidth;
    public int videoFrameHeight;
    public int audioCodec;
    public int audioBitRate;
    public int audioSampleRate;
    public int audioChannels;
    public static android.media.CamcorderProfile get(int p0) { return null; }
    public static android.media.CamcorderProfile get(int p0, int p1) { return null; }
    public static boolean hasProfile(int p0) { return false; }
    public static boolean hasProfile(int p0, int p1) { return false; }
    private CamcorderProfile(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11) {}
    private static final native void native_init();
    private static final native android.media.CamcorderProfile native_get_camcorder_profile(int p0, int p1);
    private static final native boolean native_has_camcorder_profile(int p0, int p1);
}
