package android.server.display;

public final class DisplayProtoEnums {
    public static final int HBM_UNKNOWN = 0;
    public static final int HBM_OFF = 1;
    public static final int HBM_ON_HDR = 2;
    public static final int HBM_ON_SUNLIGHT = 3;
    public static final int HBM_TRANSITION_REASON_UNKNOWN = 0;
    public static final int HBM_SV_OFF_LUX_DROP = 1;
    public static final int HBM_SV_OFF_TIME_LIMIT = 2;
    public static final int HBM_SV_OFF_THERMAL_LIMIT = 3;
    public static final int HBM_SV_OFF_HDR_PLAYING = 4;
    public static final int HBM_SV_OFF_BATTERY_SAVE_ON = 5;
    public static final int HBM_SV_OFF_DISPLAY_OFF = 6;
    public static final int HBM_SV_OFF_AUTOBRIGHTNESS_OFF = 7;
    public static final int HBM_HDR_OFF_THERMAL_LIMIT = 8;
    public static final int HBM_SV_OFF_LOW_REQUESTED_BRIGHTNESS = 9;
    public static final int UNKNOWN = 0;
    public static final int DISCONNECTED = 1;
    public static final int CONNECTED = 2;
    public static final int DISABLED = 3;
    public static final int KEYGUARD = 4;
    public static final int MIRRORING = 5;
    public static final int EXTENDED = 6;
    public static final int PRESENTATION_WHILE_MIRRORING = 7;
    public static final int PRESENTATION_WHILE_EXTENDED = 8;
    public static final int PRESENTATION_ENDED = 9;
    public static final int AUDIO_SINK_CHANGED = 10;
    public static final int ERROR_HOTPLUG_CONNECTION = 11;
    public static final int ERROR_DISPLAYPORT_LINK_FAILED = 12;
    public static final int ERROR_CABLE_NOT_CAPABLE_DISPLAYPORT = 13;
    public DisplayProtoEnums() {}
}
