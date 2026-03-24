package android.hardware.tv.tuner;

public @interface DemuxFilterMainType {
    public static final int UNDEFINED = 0;
    public static final int TS = 1;
    public static final int MMTP = 2;
    public static final int IP = 4;
    public static final int TLV = 8;
    public static final int ALP = 16;
}
