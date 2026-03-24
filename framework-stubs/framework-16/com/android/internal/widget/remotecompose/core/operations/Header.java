package com.android.internal.widget.remotecompose.core.operations;

public class Header extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.RemoteComposeOperation {
    int mMajorVersion;
    int mMinorVersion;
    int mPatchVersion;
    int mWidth;
    int mHeight;
    float mDensity;
    long mCapabilities;
    public static final short DOC_WIDTH = 5;
    public static final short DOC_HEIGHT = 6;
    public static final short DOC_DENSITY_AT_GENERATION = 7;
    public static final short DOC_DESIRED_FPS = 8;
    public static final short DOC_CONTENT_DESCRIPTION = 9;
    public static final short DOC_SOURCE = 11;
    public static final short DOC_DATA_UPDATE = 12;
    public java.lang.Object get(short p0) { return null; }
    public Header(int p0, int p1, int p2, int p3, int p4, float p5, long p6) { super(); }
    public Header(int p0, int p1, int p2, com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.Object> p3) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, int p2, float p3, long p4) {}
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, short[] p1, java.lang.Object[] p2) {}
    public static com.android.internal.widget.remotecompose.core.operations.Header readDirect(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void setVersion(com.android.internal.widget.remotecompose.core.CoreDocument p0) {}
}
