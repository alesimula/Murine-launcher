package com.android.net.module.util;

public class DnsPacket {
    public static final int TYPE_SVCB = 64;
    public static final int QDSECTION = 0;
    public static final int ANSECTION = 1;
    public static final int NSSECTION = 2;
    public static final int ARSECTION = 3;
    static final int NUM_SECTIONS = 4;
    protected final com.android.net.module.util.DnsPacket.DnsHeader mHeader = null;
    protected final java.util.List<com.android.net.module.util.DnsPacket.DnsRecord>[] mRecords = null;
    public java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> getRecords(int p0) { return null; }
    public DnsPacket(byte[] p0) throws com.android.net.module.util.DnsPacket.ParseException {}
    public DnsPacket(com.android.net.module.util.DnsPacket.DnsHeader p0, java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> p1, java.util.List<com.android.net.module.util.DnsPacket.DnsRecord> p2) {}
    @android.annotation.NonNull
    public byte[] getBytes() throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class DnsHeader {
        public DnsHeader(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException {}
        public boolean isResponse() { return false; }
        public DnsHeader(int p0, int p1, int p2, int p3) {}
        public int getRecordCount(int p0) { return 0; }
        public int getFlags() { return 0; }
        public int getId() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        @android.annotation.NonNull
        public byte[] getBytes() { return null; }
    }

    public static class DnsRecord {
        public static final int MAXNAMESIZE = 255;
        public static final int NAME_NORMAL = 0;
        public static final int NAME_COMPRESSION = 192;
        public final java.lang.String dName = null;
        public final int nsType = 0;
        public final int nsClass = 0;
        public final long ttl = 0L;
        public final int rType = 0;
        protected DnsRecord(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException {}
        public static com.android.net.module.util.DnsPacket.DnsRecord parse(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord makeAOrAAAARecord(int p0, java.lang.String p1, int p2, long p3, java.net.InetAddress p4) throws java.io.IOException { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord makeCNameRecord(int p0, java.lang.String p1, int p2, long p3, java.lang.String p4) throws java.io.IOException { return null; }
        public static com.android.net.module.util.DnsPacket.DnsRecord makeQuestion(java.lang.String p0, int p1, int p2) { return null; }
        @android.annotation.Nullable
        public byte[] getRR() { return null; }
        @android.annotation.NonNull
        public byte[] getBytes() throws java.io.IOException { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class ParseException extends java.lang.RuntimeException {
        public java.lang.String reason;
        public ParseException(java.lang.String p0) { super(); }
        public ParseException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RecordType {
    }
}
