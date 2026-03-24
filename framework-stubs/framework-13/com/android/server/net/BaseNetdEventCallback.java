package com.android.server.net;

public class BaseNetdEventCallback extends android.net.INetdEventCallback.Stub {
    public BaseNetdEventCallback() { super(); }
    public void onDnsEvent(int p0, int p1, int p2, java.lang.String p3, java.lang.String[] p4, int p5, long p6, int p7) {}
    public void onNat64PrefixEvent(int p0, boolean p1, java.lang.String p2, int p3) {}
    public void onPrivateDnsValidationEvent(int p0, java.lang.String p1, java.lang.String p2, boolean p3) {}
    public void onConnectEvent(java.lang.String p0, int p1, long p2, int p3) {}
}
