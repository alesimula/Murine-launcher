package com.android.server.net;

class DnsServerRepository {
    public static final int NUM_CURRENT_SERVERS = 3;
    public static final int NUM_SERVERS = 12;
    private java.util.Set<java.net.InetAddress> mCurrentServers;
    public static final java.lang.String TAG = "DnsServerRepository";
    private java.util.ArrayList<com.android.server.net.DnsServerEntry> mAllServers;
    private java.util.HashMap<java.net.InetAddress, com.android.server.net.DnsServerEntry> mIndex;
    public DnsServerRepository() {}
    public synchronized void setDnsServersOn(android.net.LinkProperties p0) {}
    public synchronized boolean addServers(long p0, java.lang.String[] p1) { return false; }
    private synchronized boolean updateExistingEntry(java.net.InetAddress p0, long p1) { return false; }
    private synchronized boolean updateCurrentServers() { return false; }
}
