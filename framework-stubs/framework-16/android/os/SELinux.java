package android.os;

public class SELinux {
    public SELinux() {}
    public static final native java.lang.String fileSelabelLookup(java.lang.String p0);
    public static final native boolean isSELinuxEnabled();
    public static final native boolean isSELinuxEnforced();
    public static final native boolean setFSCreateContext(java.lang.String p0);
    public static final native boolean setFileContext(java.lang.String p0, java.lang.String p1);
    public static final native java.lang.String getFileContext(java.lang.String p0);
    public static final native java.lang.String getPeerContext(java.io.FileDescriptor p0);
    public static final native java.lang.String getFileContext(java.io.FileDescriptor p0);
    public static final native java.lang.String getContext();
    public static final native java.lang.String getPidContext(int p0);
    public static final native boolean checkSELinuxAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    public static boolean restorecon(java.lang.String p0) throws java.lang.NullPointerException { return false; }
    public static boolean restorecon(java.io.File p0) throws java.lang.NullPointerException { return false; }
    public static boolean restoreconRecursive(java.io.File p0) { return false; }
    public static final native int getGenfsLabelsVersion();
}
