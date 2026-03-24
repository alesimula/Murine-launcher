package com.android.server.net;

public class BaseNetworkObserver extends android.net.INetworkManagementEventObserver.Stub {
    public BaseNetworkObserver() { super(); }
    public void interfaceStatusChanged(java.lang.String p0, boolean p1) {}
    public void interfaceRemoved(java.lang.String p0) {}
    public void addressUpdated(java.lang.String p0, android.net.LinkAddress p1) {}
    public void addressRemoved(java.lang.String p0, android.net.LinkAddress p1) {}
    public void interfaceLinkStateChanged(java.lang.String p0, boolean p1) {}
    public void interfaceAdded(java.lang.String p0) {}
    public void interfaceClassDataActivityChanged(java.lang.String p0, boolean p1, long p2) {}
    public void limitReached(java.lang.String p0, java.lang.String p1) {}
    public void interfaceDnsServerInfo(java.lang.String p0, long p1, java.lang.String[] p2) {}
    public void routeUpdated(android.net.RouteInfo p0) {}
    public void routeRemoved(android.net.RouteInfo p0) {}
}
