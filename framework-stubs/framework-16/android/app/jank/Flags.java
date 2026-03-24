package android.app.jank;

public final class Flags {
    public static final java.lang.String FLAG_DETAILED_APP_JANK_METRICS_API = "android.app.jank.detailed_app_jank_metrics_api";
    public static final java.lang.String FLAG_DETAILED_APP_JANK_METRICS_LOGGING_ENABLED = "android.app.jank.detailed_app_jank_metrics_logging_enabled";
    public static final java.lang.String FLAG_VIEWROOT_CHOREOGRAPHER = "android.app.jank.viewroot_choreographer";
    public Flags() {}
    public static boolean detailedAppJankMetricsApi() { return false; }
    public static boolean detailedAppJankMetricsLoggingEnabled() { return false; }
    public static boolean viewrootChoreographer() { return false; }
}
