package android.hardware.tv.tuner;

public @interface DemuxIpFilterType {
    public static final int UNDEFINED = 0;
    public static final int SECTION = 1;
    public static final int NTP = 2;
    public static final int IP_PAYLOAD = 3;
    public static final int IP = 4;
    public static final int PAYLOAD_THROUGH = 5;
}
