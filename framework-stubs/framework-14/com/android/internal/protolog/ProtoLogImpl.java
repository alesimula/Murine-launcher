package com.android.internal.protolog;

public class ProtoLogImpl extends com.android.internal.protolog.BaseProtoLogImpl {
    public static void d(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void v(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void i(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void w(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void e(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void wtf(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0) { return false; }
    public static synchronized com.android.internal.protolog.ProtoLogImpl getSingleInstance() { return null; }
    public static synchronized void setSingleInstance(com.android.internal.protolog.ProtoLogImpl p0) {}
    public ProtoLogImpl(java.io.File p0, int p1, com.android.internal.protolog.ProtoLogViewerConfigReader p2, int p3) { super((java.io.File)null, (java.lang.String)null, 0, (com.android.internal.protolog.ProtoLogViewerConfigReader)null); }
}
