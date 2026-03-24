package com.android.internal.net;

public class NetworkUtilsInternal {
    private static final int[] ADDRESS_FAMILIES = null;
    public NetworkUtilsInternal() {}
    public static native void setAllowNetworkingForProcess(boolean p0);
    public static native boolean protectFromVpn(java.io.FileDescriptor p0);
    public static native boolean protectFromVpn(int p0);
    public static boolean isWeaklyValidatedHostname(java.lang.String p0) { return false; }
    public static long multiplySafeByRational(long p0, long p1, long p2) { return 0L; }
}
