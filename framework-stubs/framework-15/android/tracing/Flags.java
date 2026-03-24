package android.tracing;

public final class Flags {
    public static final java.lang.String FLAG_PERFETTO_IME = "android.tracing.perfetto_ime";
    public static final java.lang.String FLAG_PERFETTO_IME_TRACING = "android.tracing.perfetto_ime_tracing";
    public static final java.lang.String FLAG_PERFETTO_PROTOLOG_TRACING = "android.tracing.perfetto_protolog_tracing";
    public static final java.lang.String FLAG_PERFETTO_TRANSITION_TRACING = "android.tracing.perfetto_transition_tracing";
    public static final java.lang.String FLAG_PERFETTO_VIEW_CAPTURE_TRACING = "android.tracing.perfetto_view_capture_tracing";
    public Flags() {}
    public static boolean perfettoIme() { return false; }
    public static boolean perfettoImeTracing() { return false; }
    public static boolean perfettoProtologTracing() { return false; }
    public static boolean perfettoTransitionTracing() { return false; }
    public static boolean perfettoViewCaptureTracing() { return false; }
}
