package com.android.internal.os;

class ZygoteConnection {
    ZygoteConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException {}
    java.io.FileDescriptor getFileDescriptor() { return null; }
    java.lang.Runnable processCommand(com.android.internal.os.ZygoteServer p0, boolean p1) { return null; }
    protected void preload() {}
    protected boolean isPreloadComplete() { return false; }
    protected java.io.DataOutputStream getSocketOutputStream() { return null; }
    protected void handlePreloadPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    protected boolean canPreloadApp() { return false; }
    protected void handlePreloadApp(android.content.pm.ApplicationInfo p0) {}
    void closeSocket() {}
    boolean isClosedByPeer() { return false; }
}
