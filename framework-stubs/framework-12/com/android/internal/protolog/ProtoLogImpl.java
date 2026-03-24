package com.android.internal.protolog;

public class ProtoLogImpl extends com.android.internal.protolog.BaseProtoLogImpl {
    private static final int BUFFER_CAPACITY = 1048576;
    private static final java.lang.String LOG_FILENAME = "/data/misc/wmtrace/wm_log.pb";
    private static final java.lang.String VIEWER_CONFIG_FILENAME = "/system/etc/protolog.conf.json.gz";
    private static com.android.internal.protolog.ProtoLogImpl sServiceInstance;
    public static void d(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void v(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void i(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void w(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void e(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static void wtf(com.android.internal.protolog.common.IProtoLogGroup p0, int p1, int p2, java.lang.String p3, java.lang.Object... p4) {}
    public static boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0) { return false; }
    public static synchronized com.android.internal.protolog.ProtoLogImpl getSingleInstance() { return null; }
    public static synchronized void setSingleInstance(com.android.internal.protolog.ProtoLogImpl p0) {}
    public ProtoLogImpl(java.io.File p0, int p1, com.android.internal.protolog.ProtoLogViewerConfigReader p2) { super(null, null, 0, null); }
}
