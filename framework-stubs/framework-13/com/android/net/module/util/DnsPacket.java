package com.android.net.module.util;

public abstract class DnsPacket {
    public static final int QDSECTION = 0;
    public static final int ANSECTION = 1;
    public static final int NSSECTION = 2;
    public static final int ARSECTION = 3;
    protected final com.android.net.module.util.DnsPacket.DnsHeader mHeader = null;
    protected final java.util.List<com.android.net.module.util.DnsPacket.DnsRecord>[] mRecords = null;
    protected DnsPacket(byte[] p0) throws com.android.net.module.util.DnsPacket.ParseException {}

    public class DnsHeader {
        public final int id = 0;
        public final int flags = 0;
        public final int rcode = 0;
        DnsHeader(com.android.net.module.util.DnsPacket p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException {}
        public boolean isResponse() { return false; }
        public int getRecordCount(int p0) { return 0; }
    }

    public class DnsRecord {
        public static final int NAME_NORMAL = 0;
        public static final int NAME_COMPRESSION = 192;
        public final java.lang.String dName = null;
        public final int nsType = 0;
        public final int nsClass = 0;
        public final long ttl = 0L;
        DnsRecord(com.android.net.module.util.DnsPacket p0, int p1, java.nio.ByteBuffer p2) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException {}
        public byte[] getRR() { return null; }
    }

    public static class ParseException extends java.lang.RuntimeException {
        public java.lang.String reason;
        public ParseException(java.lang.String p0) { super(); }
        public ParseException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }
}
