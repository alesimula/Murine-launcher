package android.hardware.tv.tuner;

public @interface DemuxTlvFilterType {
    public static final int UNDEFINED = 0;
    public static final int SECTION = 1;
    public static final int TLV = 2;
    public static final int PAYLOAD_THROUGH = 3;
}
