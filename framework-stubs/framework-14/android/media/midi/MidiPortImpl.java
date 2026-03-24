package android.media.midi;

class MidiPortImpl {
    public static final int PACKET_TYPE_DATA = 1;
    public static final int PACKET_TYPE_FLUSH = 2;
    public static final int MAX_PACKET_SIZE = 1024;
    public static final int MAX_PACKET_DATA_SIZE = 1015;
    MidiPortImpl() {}
    public static int packData(byte[] p0, int p1, int p2, long p3, byte[] p4) { return 0; }
    public static int packFlush(byte[] p0) { return 0; }
    public static int getPacketType(byte[] p0, int p1) { return 0; }
    public static int getDataOffset(byte[] p0, int p1) { return 0; }
    public static int getDataSize(byte[] p0, int p1) { return 0; }
    public static long getPacketTimestamp(byte[] p0, int p1) { return 0L; }
}
