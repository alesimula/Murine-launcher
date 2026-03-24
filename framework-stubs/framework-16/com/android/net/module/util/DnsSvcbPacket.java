package com.android.net.module.util;

public class DnsSvcbPacket extends com.android.net.module.util.DnsPacket {
    public static final int TYPE_SVCB = 64;
    DnsSvcbPacket() throws com.android.net.module.util.DnsPacket.ParseException { super((byte[])null); }
    public boolean isResponse() { return false; }
    public boolean isSupported(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String getTargetName(java.lang.String p0) { return null; }
    public int getPort(java.lang.String p0) { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getAddresses(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getDohPath(java.lang.String p0) { return null; }
    public static com.android.net.module.util.DnsSvcbPacket fromResponse(byte[] p0) throws com.android.net.module.util.DnsPacket.ParseException { return null; }
}
