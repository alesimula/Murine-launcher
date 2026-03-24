package android.internal.telephony.sysprop;

public final class HdmiProperties {
    @java.lang.Deprecated
    public static java.util.List<java.lang.Integer> device_type() { return null; }
    public static java.util.List<android.internal.telephony.sysprop.HdmiProperties.cec_device_types_values> cec_device_types() { return null; }
    public static java.util.Optional<java.lang.String> arc_port() { return null; }
    public static java.util.Optional<java.lang.Boolean> forward_volume_keys_when_system_audio_mode_off() { return null; }
    public static java.util.Optional<java.lang.Boolean> is_switch() { return null; }
    public static java.util.Optional<android.internal.telephony.sysprop.HdmiProperties.playback_device_action_on_routing_control_values> playback_device_action_on_routing_control() { return null; }

    public static enum cec_device_types_values {
        TV,
        RECORDING_DEVICE,
        RESERVED,
        TUNER,
        PLAYBACK_DEVICE,
        AUDIO_SYSTEM,
        PURE_CEC_SWITCH,
        VIDEO_PROCESSOR;
        public java.lang.String getPropValue() { return null; }
    }

    public static enum playback_device_action_on_routing_control_values {
        NONE,
        WAKE_UP_ONLY,
        WAKE_UP_AND_SEND_ACTIVE_SOURCE;
        public java.lang.String getPropValue() { return null; }
    }
}
