package com.android.internal.os;

class ZygoteConnection {
    private static final java.lang.String TAG = "Zygote";
    private final android.net.LocalSocket mSocket = null;
    private final java.io.DataOutputStream mSocketOutStream = null;
    private final android.net.Credentials peer = null;
    private final java.lang.String abiList = null;
    private boolean isEof;
    ZygoteConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException {}
    java.io.FileDescriptor getFileDescriptor() { return null; }
    java.lang.Runnable processCommand(com.android.internal.os.ZygoteServer p0, boolean p1) { return null; }
    private void handleAbiListQuery() {}
    private void handlePidQuery() {}
    private void handleBootCompleted() {}
    private void handlePreload() {}
    private java.lang.Runnable stateChangeWithUsapPoolReset(com.android.internal.os.ZygoteServer p0, java.lang.Runnable p1) { return null; }
    private java.lang.Runnable handleApiDenylistExemptions(com.android.internal.os.ZygoteServer p0, java.lang.String[] p1) { return null; }
    private java.lang.Runnable handleUsapPoolStatusChange(com.android.internal.os.ZygoteServer p0, boolean p1) { return null; }
    private java.lang.Runnable handleHiddenApiAccessLogSampleRate(com.android.internal.os.ZygoteServer p0, int p1, int p2) { return null; }
    protected void preload() {}
    protected boolean isPreloadComplete() { return false; }
    protected java.io.DataOutputStream getSocketOutputStream() { return null; }
    protected void handlePreloadPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    protected boolean canPreloadApp() { return false; }
    protected void handlePreloadApp(android.content.pm.ApplicationInfo p0) {}
    void closeSocket() {}
    boolean isClosedByPeer() { return false; }
    private java.lang.Runnable handleChildProc(com.android.internal.os.ZygoteArguments p0, java.io.FileDescriptor p1, boolean p2) { return null; }
    private void handleParentProc(int p0, java.io.FileDescriptor p1) {}
    private void setChildPgid(int p0) {}
}
