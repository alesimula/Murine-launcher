package android.sysprop;

public final class HdmiProperties {
    private HdmiProperties() {}
    private static java.lang.Boolean tryParseBoolean(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseInteger(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseUInt(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseLong(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseULong(java.lang.String p0) { return null; }
    private static java.lang.Double tryParseDouble(java.lang.String p0) { return null; }
    private static java.lang.String tryParseString(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> T tryParseEnum(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> tryParseList(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Enum<T>> java.util.List<T> tryParseEnumList(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static java.lang.String escape(java.lang.String p0) { return null; }
    private static <T extends java.lang.Object> java.lang.String formatList(java.util.List<T> p0) { return null; }
    private static java.lang.String formatUIntList(java.util.List<java.lang.Integer> p0) { return null; }
    private static java.lang.String formatULongList(java.util.List<java.lang.Long> p0) { return null; }
    private static <T extends java.lang.Enum<T>> java.lang.String formatEnumList(java.util.List<T> p0, java.util.function.Function<T, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    public static java.util.List<java.lang.Integer> device_type() { return null; }
    public static java.util.List<android.sysprop.HdmiProperties.cec_device_types_values> cec_device_types() { return null; }
    public static java.util.Optional<java.lang.Boolean> set_menu_language_enabled() { return null; }
    public static java.util.Optional<java.lang.String> arc_port() { return null; }
    public static java.util.Optional<java.lang.Boolean> forward_volume_keys_when_system_audio_mode_off() { return null; }
    public static java.util.Optional<java.lang.Boolean> is_switch() { return null; }
    public static java.util.Optional<android.sysprop.HdmiProperties.playback_device_action_on_routing_control_values> playback_device_action_on_routing_control() { return null; }

    public static enum cec_device_types_values {
        TV,
        RECORDING_DEVICE,
        RESERVED,
        TUNER,
        PLAYBACK_DEVICE,
        AUDIO_SYSTEM,
        PURE_CEC_SWITCH,
        VIDEO_PROCESSOR;
        private final java.lang.String propValue = null;
        private cec_device_types_values() {}
        public java.lang.String getPropValue() { return null; }
    }

    public static enum playback_device_action_on_routing_control_values {
        NONE,
        WAKE_UP_ONLY,
        WAKE_UP_AND_SEND_ACTIVE_SOURCE;
        private final java.lang.String propValue = null;
        private playback_device_action_on_routing_control_values() {}
        public java.lang.String getPropValue() { return null; }
    }
}
