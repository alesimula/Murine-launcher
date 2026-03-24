package android.view.contentcapture.flags;

public final class Flags {
    public static final java.lang.String FLAG_CCAPI_BAKLAVA_ENABLED = "android.view.contentcapture.flags.ccapi_baklava_enabled";
    public static final java.lang.String FLAG_ENABLE_SYSTEM_UI_UNDERLAY = "android.view.contentcapture.flags.enable_system_ui_underlay";
    public static final java.lang.String FLAG_FLUSH_AFTER_EACH_FRAME = "android.view.contentcapture.flags.flush_after_each_frame";
    public static final java.lang.String FLAG_RUN_ON_BACKGROUND_THREAD_ENABLED = "android.view.contentcapture.flags.run_on_background_thread_enabled";
    public static final java.lang.String FLAG_WARM_UP_BACKGROUND_THREAD_FOR_CONTENT_CAPTURE = "android.view.contentcapture.flags.warm_up_background_thread_for_content_capture";
    public Flags() {}
    public static boolean ccapiBaklavaEnabled() { return false; }
    public static boolean enableSystemUiUnderlay() { return false; }
    public static boolean flushAfterEachFrame() { return false; }
    public static boolean runOnBackgroundThreadEnabled() { return false; }
    public static boolean warmUpBackgroundThreadForContentCapture() { return false; }
}
