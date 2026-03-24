package android.media.audio.common;

public @interface AudioInputFlags {
    public static final int FAST = 0;
    public static final int HW_HOTWORD = 1;
    public static final int RAW = 2;
    public static final int SYNC = 3;
    public static final int MMAP_NOIRQ = 4;
    public static final int VOIP_TX = 5;
    public static final int HW_AV_SYNC = 6;
    public static final int DIRECT = 7;
    public static final int ULTRASOUND = 8;
}
