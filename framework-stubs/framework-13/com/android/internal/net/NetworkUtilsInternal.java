package com.android.internal.net;

public class NetworkUtilsInternal {
    public NetworkUtilsInternal() {}
    public static native void setAllowNetworkingForProcess(boolean p0);
    public static native boolean protectFromVpn(java.io.FileDescriptor p0);
    public static native boolean protectFromVpn(int p0);
    public static boolean isWeaklyValidatedHostname(java.lang.String p0) { return false; }
}
