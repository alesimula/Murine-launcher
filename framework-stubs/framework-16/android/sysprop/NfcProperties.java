package android.sysprop;

public final class NfcProperties {
    public static java.util.Optional<java.lang.Boolean> debug_enabled() { return null; }
    public static void debug_enabled(java.lang.Boolean p0) {}
    public static java.util.Optional<android.sysprop.NfcProperties.snoop_log_mode_values> snoop_log_mode() { return null; }
    public static void snoop_log_mode(android.sysprop.NfcProperties.snoop_log_mode_values p0) {}
    public static java.util.Optional<java.lang.Boolean> vendor_debug_enabled() { return null; }
    public static void vendor_debug_enabled(java.lang.Boolean p0) {}
    public static java.util.Optional<java.lang.Boolean> skipNdefRead() { return null; }
    public static java.util.Optional<java.lang.Boolean> initialized() { return null; }
    public static void initialized(java.lang.Boolean p0) {}
    public static java.util.List<java.lang.Integer> info_antpos_X() { return null; }
    public static java.util.List<java.lang.Integer> info_antpos_Y() { return null; }
    public static java.util.Optional<java.lang.Integer> info_antpos_device_width() { return null; }
    public static java.util.Optional<java.lang.Integer> info_antpos_device_height() { return null; }
    public static java.util.Optional<java.lang.Boolean> info_antpos_device_foldable() { return null; }
    public static java.util.Optional<java.lang.Boolean> observe_mode_supported() { return null; }
    public static java.util.Optional<java.lang.Boolean> get_caps_supported() { return null; }
    public static java.util.Optional<java.lang.String> fw_version() { return null; }
    public static void fw_version(java.lang.String p0) {}
    public static java.util.Optional<java.lang.Boolean> verbose_debug_enabled() { return null; }
    public static void verbose_debug_enabled(java.lang.Boolean p0) {}

    public static enum snoop_log_mode_values {
        FULL,
        FILTERED;
        public java.lang.String getPropValue() { return null; }
    }
}
