package android.os;

public class SELinux {
    private static final java.lang.String TAG = "SELinux";
    private static final int SELINUX_ANDROID_RESTORECON_NOCHANGE = 1;
    private static final int SELINUX_ANDROID_RESTORECON_VERBOSE = 2;
    private static final int SELINUX_ANDROID_RESTORECON_RECURSE = 4;
    private static final int SELINUX_ANDROID_RESTORECON_FORCE = 8;
    private static final int SELINUX_ANDROID_RESTORECON_DATADATA = 16;
    private static final int SELINUX_ANDROID_RESTORECON_SKIPCE = 32;
    private static final int SELINUX_ANDROID_RESTORECON_CROSS_FILESYSTEMS = 64;
    private static final int SELINUX_ANDROID_RESTORECON_SKIP_SEHASH = 128;
    public SELinux() {}
    public static final native java.lang.String fileSelabelLookup(java.lang.String p0);
    @android.annotation.UnsupportedAppUsage
    public static final native boolean isSELinuxEnabled();
    @android.annotation.UnsupportedAppUsage
    public static final native boolean isSELinuxEnforced();
    public static final native boolean setFSCreateContext(java.lang.String p0);
    public static final native boolean setFileContext(java.lang.String p0, java.lang.String p1);
    @android.annotation.UnsupportedAppUsage
    public static final native java.lang.String getFileContext(java.lang.String p0);
    public static final native java.lang.String getPeerContext(java.io.FileDescriptor p0);
    public static final native java.lang.String getFileContext(java.io.FileDescriptor p0);
    @android.annotation.UnsupportedAppUsage
    public static final native java.lang.String getContext();
    @android.annotation.UnsupportedAppUsage
    public static final native java.lang.String getPidContext(int p0);
    @android.annotation.UnsupportedAppUsage
    public static final native boolean checkSELinuxAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    public static boolean restorecon(java.lang.String p0) throws java.lang.NullPointerException { return false; }
    private static native boolean native_restorecon(java.lang.String p0, int p1);
    public static boolean restorecon(java.io.File p0) throws java.lang.NullPointerException { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean restoreconRecursive(java.io.File p0) { return false; }
}
