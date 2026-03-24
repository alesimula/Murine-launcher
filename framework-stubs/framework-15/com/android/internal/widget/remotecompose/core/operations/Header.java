package com.android.internal.widget.remotecompose.core.operations;

public class Header implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    public static final int MAJOR_VERSION = 0;
    public static final int MINOR_VERSION = 1;
    public static final int PATCH_VERSION = 0;
    int mMajorVersion;
    int mMinorVersion;
    int mPatchVersion;
    int mWidth;
    int mHeight;
    long mCapabilities;
    public static final com.android.internal.widget.remotecompose.core.operations.Header.Companion COMPANION = null;
    public Header(int p0, int p1, int p2, int p3, int p4, long p5) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }

    public static class Companion implements com.android.internal.widget.remotecompose.core.CompanionOperation {
        public java.lang.String name() { return null; }
        public int id() { return 0; }
        public void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, long p3) {}
        public void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    }
}
