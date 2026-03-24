package com.android.internal.telephony;

interface NetworkFactoryShim {
    public void register(java.lang.String p0);
    default public void registerIgnoringScore(java.lang.String p0) {}
    public void terminate();
    public void releaseRequestAsUnfulfillableByAnyFactory(android.net.NetworkRequest p0);
    public void reevaluateAllRequests();
    public void setScoreFilter(int p0);
    public void setScoreFilter(android.net.NetworkScore p0);
    public void setCapabilityFilter(android.net.NetworkCapabilities p0);
    public int getRequestCount();
    public int getSerialNumber();
    public android.net.NetworkProvider getProvider();
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2);
    public android.os.Message obtainMessage(int p0, int p1, int p2, java.lang.Object p3);
    public android.os.Looper getLooper();
}
