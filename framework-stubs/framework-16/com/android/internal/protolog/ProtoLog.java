package com.android.internal.protolog;

public class ProtoLog {
    @java.lang.Deprecated
    public static boolean REQUIRE_PROTOLOGTOOL;
    public ProtoLog() {}
    public static void registerLogGroupInProcess(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public static void init(com.android.internal.protolog.common.IProtoLogGroup... p0) {}
    public static void d(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void v(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void i(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void w(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void e(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static void wtf(com.android.internal.protolog.common.IProtoLogGroup p0, java.lang.String p1, java.lang.Object... p2) {}
    public static boolean isEnabled(com.android.internal.protolog.common.IProtoLogGroup p0, com.android.internal.protolog.common.LogLevel p1) { return false; }
    @android.annotation.Nullable
    public static com.android.internal.protolog.common.IProtoLog getSingleInstance() { return null; }
    @android.annotation.NonNull
    public static com.android.internal.protolog.ProtoLogDataSource getSharedSingleInstanceDataSource() { return null; }
    public static void setControllerInstanceForTest(com.android.internal.protolog.ProtoLogController p0) {}
    @android.annotation.NonNull
    public static com.android.internal.protolog.ProtoLogController getControllerInstanceForTest() { return null; }
    static boolean logOnlyToLogcat() { return false; }
    static boolean logOnlyToLogcat$ravenwood() { return false; }
}
