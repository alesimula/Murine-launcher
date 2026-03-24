package com.android.server;

public final class NetworkManagementSocketTagger {
    private static final java.lang.String TAG = "NetworkManagementSocketTagger";
    private static final boolean LOGD = false;
    public static final java.lang.String PROP_QTAGUID_ENABLED = "net.qtaguid_enabled";
    private static java.lang.ThreadLocal<com.android.server.NetworkManagementSocketTagger.SocketTags> threadSocketTags;
    public NetworkManagementSocketTagger() {}
    public static void install() {}
    public static int setThreadSocketStatsTag(int p0) { return 0; }
    public static int getThreadSocketStatsTag() { return 0; }
    public static int setThreadSocketStatsUid(int p0) { return 0; }
    public static int getThreadSocketStatsUid() { return 0; }
    public void tag(java.io.FileDescriptor p0) throws java.net.SocketException {}
    private void tagSocketFd(java.io.FileDescriptor p0, int p1, int p2) {}
    public void untag(java.io.FileDescriptor p0) throws java.net.SocketException {}
    private void unTagSocketFd(java.io.FileDescriptor p0) {}
    public static void setKernelCounterSet(int p0, int p1) {}
    public static void resetKernelUidStats(int p0) {}
    public static int kernelToTag(java.lang.String p0) { return 0; }
    private static native int native_tagSocketFd(java.io.FileDescriptor p0, int p1, int p2);
    private static native int native_untagSocketFd(java.io.FileDescriptor p0);
    private static native int native_setCounterSet(int p0, int p1);
    private static native int native_deleteTagData(int p0, int p1);

    public static class SocketTags {
        public int statsTag;
        public int statsUid;
        public SocketTags() {}
    }
}
