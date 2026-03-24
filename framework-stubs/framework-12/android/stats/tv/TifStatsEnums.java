package android.stats.tv;

public final class TifStatsEnums {
    public static final int TIF_TUNE_STATE_UNKNOWN = 0;
    public static final int CREATED = 1;
    public static final int SURFACE_ATTACHED = 2;
    public static final int SURFACE_DETACHED = 3;
    public static final int RELEASED = 4;
    public static final int TUNE_STARTED = 5;
    public static final int VIDEO_AVAILABLE = 6;
    public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = 100;
    public static final int VIDEO_UNAVAILABLE_REASON_TUNING = 101;
    public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = 102;
    public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = 103;
    public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = 104;
    public static final int VIDEO_UNAVAILABLE_REASON_NOT_CONNECTED = 105;
    public static final int VIDEO_UNAVAILABLE_REASON_INSUFFICIENT_RESOURCE = 106;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_INSUFFICIENT_OUTPUT_PROTECTION = 107;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_PVR_RECORDING_NOT_ALLOWED = 108;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_LICENSE = 109;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_LICENSE_EXPIRED = 110;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_ACTIVATION = 111;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NEED_PAIRING = 112;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_NO_CARD = 113;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_MUTE = 114;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_CARD_INVALID = 115;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_BLACKOUT = 116;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_REBOOTING = 117;
    public static final int VIDEO_UNAVAILABLE_REASON_CAS_UNKNOWN = 118;
    public static final int TIF_INPUT_TYPE_UNKNOWN = 0;
    public static final int TUNER = 1;
    public static final int OTHER = 1000;
    public static final int COMPOSITE = 1001;
    public static final int SVIDEO = 1002;
    public static final int SCART = 1003;
    public static final int COMPONENT = 1004;
    public static final int VGA = 1005;
    public static final int DVI = 1006;
    public static final int HDMI = 1007;
    public static final int DISPLAY_PORT = 1008;
    public TifStatsEnums() {}
}
