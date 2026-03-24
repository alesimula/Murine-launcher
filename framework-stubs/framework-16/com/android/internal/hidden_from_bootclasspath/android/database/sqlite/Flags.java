package com.android.internal.hidden_from_bootclasspath.android.database.sqlite;

public final class Flags {
    public static final java.lang.String FLAG_CONCURRENT_OPEN_HELPER = "android.database.sqlite.concurrent_open_helper";
    public static final java.lang.String FLAG_NO_CHECKPOINT_ON_FINALIZE = "android.database.sqlite.no_checkpoint_on_finalize";
    public static final java.lang.String FLAG_ONEWAY_FINALIZER_CLOSE_FIXED = "android.database.sqlite.oneway_finalizer_close_fixed";
    public static final java.lang.String FLAG_SQLITE_APIS_35 = "android.database.sqlite.sqlite_apis_35";
    public Flags() {}
    public static boolean concurrentOpenHelper() { return false; }
    public static boolean noCheckpointOnFinalize() { return false; }
    public static boolean onewayFinalizerCloseFixed() { return false; }
    public static boolean sqliteApis35() { return false; }
}
