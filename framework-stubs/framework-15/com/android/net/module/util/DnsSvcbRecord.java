package com.android.net.module.util;

public final class DnsSvcbRecord extends com.android.net.module.util.DnsPacket.DnsRecord {
    public DnsSvcbRecord(int p0, java.nio.ByteBuffer p1) throws java.lang.IllegalStateException, com.android.net.module.util.DnsPacket.ParseException, java.nio.BufferUnderflowException { super(0, null); }
    @android.annotation.NonNull
    public java.lang.String getTargetName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAlpns() { return null; }
    public int getPort() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getAddresses() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDohPath() { return null; }
    public java.lang.String toString() { return null; }
    public static java.nio.ByteBuffer sliceAndAdvance(java.nio.ByteBuffer p0, int p1) throws java.nio.BufferUnderflowException { return null; }

    private static abstract class SvcParam<T extends java.lang.Object> {
        SvcParam(int p0) {}
        int getKey() { return 0; }
        abstract T getValue();
    }

    private static class SvcParamAlpn extends com.android.net.module.util.DnsSvcbRecord.SvcParam<java.util.List<java.lang.String>> {
        SvcParamAlpn(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.util.List<java.lang.String> getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamDohPath extends com.android.net.module.util.DnsSvcbRecord.SvcParam<java.lang.String> {
        SvcParamDohPath(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.String getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamEch extends com.android.net.module.util.DnsSvcbRecord.SvcParamGeneric {
        SvcParamEch(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0, null); }
    }

    private static class SvcParamGeneric extends com.android.net.module.util.DnsSvcbRecord.SvcParam<byte[]> {
        SvcParamGeneric(int p0, java.nio.ByteBuffer p1) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        byte[] getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamIpHint extends com.android.net.module.util.DnsSvcbRecord.SvcParam<java.util.List<java.net.InetAddress>> {
        SvcParamIpHint() { super(0); }
        java.util.List<java.net.InetAddress> getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamIpv4Hint extends com.android.net.module.util.DnsSvcbRecord.SvcParamIpHint {
        SvcParamIpv4Hint(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(); }
    }

    private static class SvcParamIpv6Hint extends com.android.net.module.util.DnsSvcbRecord.SvcParamIpHint {
        SvcParamIpv6Hint(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(); }
    }

    private static class SvcParamMandatory extends com.android.net.module.util.DnsSvcbRecord.SvcParam<short[]> {
        SvcParamMandatory() { super(0); }
        short[] getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamNoDefaultAlpn extends com.android.net.module.util.DnsSvcbRecord.SvcParam<java.lang.Void> {
        SvcParamNoDefaultAlpn(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.Void getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamPort extends com.android.net.module.util.DnsSvcbRecord.SvcParam<java.lang.Integer> {
        SvcParamPort(java.nio.ByteBuffer p0) throws java.nio.BufferUnderflowException, com.android.net.module.util.DnsPacket.ParseException { super(0); }
        java.lang.Integer getValue() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class SvcParamValueUtil {
    }
}
