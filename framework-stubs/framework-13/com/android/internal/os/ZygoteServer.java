package com.android.internal.os;

class ZygoteServer {
    public static final java.lang.String TAG = "ZygoteServer";
    ZygoteServer() {}
    ZygoteServer(boolean p0) {}
    void setForkChild() {}
    public boolean isUsapPoolEnabled() { return false; }
    void registerServerSocketAtAbstractName(java.lang.String p0) {}
    protected com.android.internal.os.ZygoteConnection createNewConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { return null; }
    void closeServerSocket() {}
    java.io.FileDescriptor getZygoteSocketFileDescriptor() { return null; }
    java.lang.Runnable fillUsapPool(int[] p0, boolean p1) { return null; }
    java.lang.Runnable setUsapPoolStatus(boolean p0, android.net.LocalSocket p1) { return null; }
    java.lang.Runnable runSelectLoop(java.lang.String p0) { return null; }

    private static enum UsapPoolRefillAction {
        DELAYED,
        IMMEDIATE,
        NONE;
    }
}
