package android.net;

public abstract class DnsPacket {
    public static final int QDSECTION = 0;
    public static final int ANSECTION = 1;
    public static final int NSSECTION = 2;
    public static final int ARSECTION = 3;
    private static final int NUM_SECTIONS = 4;
    private static final java.lang.String TAG = null;
    protected final android.net.DnsPacket.DnsHeader mHeader = null;
    protected final java.util.List<android.net.DnsPacket.DnsRecord>[] mRecords = null;
    protected DnsPacket(byte[] p0) throws android.net.ParseException {}

    public class DnsRecord {
        private static final int MAXNAMESIZE = 255;
        private static final int MAXLABELSIZE = 63;
        private static final int MAXLABELCOUNT = 128;
        private static final int NAME_NORMAL = 0;
        private static final int NAME_COMPRESSION = 192;
        private final java.text.DecimalFormat byteFormat = null;
        private final java.text.FieldPosition pos = null;
        private static final java.lang.String TAG = "DnsRecord";
        public final java.lang.String dName = null;
        public final int nsType = 0;
        public final int nsClass = 0;
        public final long ttl = 0L;
        private final byte[] mRdata = null;
        DnsRecord(android.net.DnsPacket p0, int p1, java.nio.ByteBuffer p2) throws java.nio.BufferUnderflowException, android.net.ParseException {}
        public byte[] getRR() { return null; }
        private java.lang.String labelToString(byte[] p0) { return null; }
        private java.lang.String parseName(java.nio.ByteBuffer p0, int p1) throws java.nio.BufferUnderflowException, android.net.ParseException { return null; }
    }

    public class DnsHeader {
        private static final java.lang.String TAG = "DnsHeader";
        public final int id = 0;
        public final int flags = 0;
        public final int rcode = 0;
        private final int[] mRecordCount = null;
        DnsHeader(android.net.DnsPacket p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException {}
        public int getRecordCount(int p0) { return 0; }
    }
}
