package com.android.internal.hidden_from_bootclasspath.android.tracing;

public final class Flags {
    public static final java.lang.String FLAG_CLIENT_SIDE_PROTO_LOGGING = "android.tracing.client_side_proto_logging";
    public static final java.lang.String FLAG_IMETRACKER_PROTOLOG = "android.tracing.imetracker_protolog";
    public static final java.lang.String FLAG_PERFETTO_IME = "android.tracing.perfetto_ime";
    public static final java.lang.String FLAG_PERFETTO_IME_TRACING = "android.tracing.perfetto_ime_tracing";
    public static final java.lang.String FLAG_PERFETTO_VIEW_CAPTURE_TRACING = "android.tracing.perfetto_view_capture_tracing";
    public static final java.lang.String FLAG_PERFETTO_WM_DUMP = "android.tracing.perfetto_wm_dump";
    public static final java.lang.String FLAG_PERFETTO_WM_DUMP_CTS = "android.tracing.perfetto_wm_dump_cts";
    public static final java.lang.String FLAG_PERFETTO_WM_TRACING = "android.tracing.perfetto_wm_tracing";
    public static final java.lang.String FLAG_SYSTEM_SERVER_LARGE_PERFETTO_SHMEM_BUFFER = "android.tracing.system_server_large_perfetto_shmem_buffer";
    public Flags() {}
    public static boolean clientSideProtoLogging() { return false; }
    public static boolean imetrackerProtolog() { return false; }
    public static boolean perfettoIme() { return false; }
    public static boolean perfettoImeTracing() { return false; }
    public static boolean perfettoViewCaptureTracing() { return false; }
    public static boolean perfettoWmDump() { return false; }
    public static boolean perfettoWmDumpCts() { return false; }
    public static boolean perfettoWmTracing() { return false; }
    public static boolean systemServerLargePerfettoShmemBuffer() { return false; }
}
