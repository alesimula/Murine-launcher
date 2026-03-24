package android.stats.mediametrics_message;

public final class MediametricsMessage {
    public MediametricsMessage() {}

    public final class AudioPolicyData {
        public static final long STATUS = 1120986464257L;
        public static final long REQUEST_SOURCE = 1138166333442L;
        public static final long REQUEST_PACKAGE = 1138166333443L;
        public static final long REQUEST_SESSION = 1120986464260L;
        public static final long REQUEST_DEVICE = 1138166333445L;
        public static final long ACTIVE_SOURCE = 1138166333446L;
        public static final long ACTIVE_PACKAGE = 1138166333447L;
        public static final long ACTIVE_SESSION = 1120986464264L;
        public static final long ACTIVE_DEVICE = 1138166333449L;
        public AudioPolicyData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class AudioRecordData {
        public static final long ENCODING = 1138166333441L;
        public static final long SOURCE = 1138166333442L;
        public static final long LATENCY = 1120986464259L;
        public static final long SAMPLERATE = 1120986464260L;
        public static final long CHANNELS = 1120986464261L;
        public static final long CREATED_MILLIS = 1112396529670L;
        public static final long DURATION_MILLIS = 1112396529671L;
        public static final long COUNT = 1120986464264L;
        public static final long ERROR_CODE = 1120986464265L;
        public static final long ERROR_FUNCTION = 1138166333450L;
        public static final long PORT_ID = 1120986464267L;
        public static final long FRAME_COUNT = 1120986464268L;
        public static final long ATTRIBUTES = 1138166333453L;
        public static final long CHANNEL_MASK = 1112396529678L;
        public static final long START_COUNT = 1112396529679L;
        public AudioRecordData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class AudioThreadData {
        public static final long TYPE = 1138166333441L;
        public static final long FRAMECOUNT = 1120986464258L;
        public static final long SAMPLERATE = 1120986464259L;
        public static final long WORK_MILLIS_HIST = 1138166333444L;
        public static final long LATENCY_MILLIS_HIST = 1138166333445L;
        public static final long WARMUP_MILLIS_HIST = 1138166333446L;
        public static final long UNDERRUNS = 1112396529671L;
        public static final long OVERRUNS = 1112396529672L;
        public static final long ACTIVE_MILLIS = 1112396529673L;
        public static final long DURATION_MILLIS = 1112396529674L;
        public static final long ID = 1120986464267L;
        public static final long PORT_ID = 1120986464268L;
        public static final long SAMPLE_RATE = 1120986464269L;
        public static final long CHANNEL_MASK = 1112396529678L;
        public static final long ENCODING = 1138166333455L;
        public static final long FRAME_COUNT = 1120986464272L;
        public static final long OUTPUT_DEVICE = 1138166333457L;
        public static final long INPUT_DEVICE = 1138166333458L;
        public static final long IO_JITTER_MEAN_MILLIS = 1103806595091L;
        public static final long IO_JITTER_STDDEV_MILLIS = 1103806595092L;
        public static final long PROCESS_TIME_MEAN_MILLIS = 1103806595093L;
        public static final long PROCESS_TIME_STDDEV_MILLIS = 1103806595094L;
        public static final long TIMESTAMP_JITTER_MEAN_MILLIS = 1103806595095L;
        public static final long TIMESTAMP_JITTER_STDDEV_MILLIS = 1103806595096L;
        public static final long LATENCY_MEAN_MILLIS = 1103806595097L;
        public static final long LATENCY_STDDEV_MILLIS = 1103806595098L;
        public AudioThreadData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class AudioTrackData {
        public static final long STREAM_TYPE = 1138166333441L;
        public static final long CONTENT_TYPE = 1138166333442L;
        public static final long TRACK_USAGE = 1138166333443L;
        public static final long SAMPLE_RATE = 1120986464260L;
        public static final long CHANNEL_MASK = 1112396529669L;
        public static final long UNDERRUN_FRAMES = 1120986464262L;
        public static final long STARTUP_GLITCH = 1120986464263L;
        public static final long PORT_ID = 1120986464264L;
        public static final long ENCODING = 1138166333449L;
        public static final long FRAME_COUNT = 1120986464266L;
        public static final long ATTRIBUTES = 1138166333451L;
        public AudioTrackData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class CodecData {
        public static final long CODEC = 1138166333441L;
        public static final long MIME = 1138166333442L;
        public static final long MODE = 1138166333443L;
        public static final long ENCODER = 1120986464260L;
        public static final long SECURE = 1120986464261L;
        public static final long WIDTH = 1120986464262L;
        public static final long HEIGHT = 1120986464263L;
        public static final long ROTATION = 1120986464264L;
        public static final long CRYPTO = 1120986464265L;
        public static final long PROFILE = 1120986464266L;
        public static final long LEVEL = 1120986464267L;
        public static final long MAX_WIDTH = 1120986464268L;
        public static final long MAX_HEIGHT = 1120986464269L;
        public static final long ERROR_CODE = 1120986464270L;
        public static final long ERROR_STATE = 1138166333455L;
        public static final long LATENCY_MAX = 1112396529680L;
        public static final long LATENCY_MIN = 1112396529681L;
        public static final long LATENCY_AVG = 1112396529682L;
        public static final long LATENCY_COUNT = 1112396529683L;
        public static final long LATENCY_UNKNOWN = 1112396529684L;
        public static final long QUEUE_INPUT_BUFFER_ERROR = 1120986464277L;
        public static final long QUEUE_SECURE_INPUT_BUFFER_ERROR = 1120986464278L;
        public static final long BITRATE_MODE = 1138166333463L;
        public static final long BITRATE = 1120986464280L;
        public static final long LIFETIME_MILLIS = 1112396529689L;
        public static final long LOG_SESSION_ID = 1138166333466L;
        public static final long CHANNEL_COUNT = 1120986464283L;
        public static final long SAMPLE_RATE = 1120986464284L;
        public static final long VIDEO_ENCODE_BYTES = 1112396529693L;
        public static final long VIDEO_ENCODE_FRAMES = 1112396529694L;
        public static final long VIDEO_INPUT_BYTES = 1112396529695L;
        public static final long VIDEO_INPUT_FRAMES = 1112396529696L;
        public static final long VIDEO_ENCODE_DURATION_US = 1112396529697L;
        public static final long COLOR_FORMAT = 1120986464290L;
        public static final long FRAME_RATE = 1103806595107L;
        public static final long CAPTURE_RATE = 1103806595108L;
        public static final long OPERATING_RATE = 1103806595109L;
        public static final long PRIORITY = 1120986464294L;
        public static final long VIDEO_QP_I_MIN = 1120986464295L;
        public static final long VIDEO_QP_I_MAX = 1120986464296L;
        public static final long VIDEO_QP_P_MIN = 1120986464297L;
        public static final long VIDEO_QP_P_MAX = 1120986464298L;
        public static final long VIDEO_QP_B_MIN = 1120986464299L;
        public static final long VIDEO_QP_B_MAX = 1120986464300L;
        public static final long ORIGINAL_BITRATE = 1120986464301L;
        public static final long SHAPING_ENHANCED = 1120986464302L;
        public static final long ORIGINAL_VIDEO_QP_I_MIN = 1120986464303L;
        public static final long ORIGINAL_VIDEO_QP_I_MAX = 1120986464304L;
        public static final long ORIGINAL_VIDEO_QP_P_MIN = 1120986464305L;
        public static final long ORIGINAL_VIDEO_QP_P_MAX = 1120986464306L;
        public static final long ORIGINAL_VIDEO_QP_B_MIN = 1120986464307L;
        public static final long ORIGINAL_VIDEO_QP_B_MAX = 1120986464308L;
        public static final long CONFIG_COLOR_STANDARD = 1120986464309L;
        public static final long CONFIG_COLOR_RANGE = 1120986464310L;
        public static final long CONFIG_COLOR_TRANSFER = 1120986464311L;
        public static final long PARSED_COLOR_STANDARD = 1120986464312L;
        public static final long PARSED_COLOR_RANGE = 1120986464313L;
        public static final long PARSED_COLOR_TRANSFER = 1120986464314L;
        public static final long HDR_STATIC_INFO = 1120986464315L;
        public static final long HDR10_PLUS_INFO = 1120986464316L;
        public static final long HDR_FORMAT = 1120986464317L;
        public static final long CODEC_ID = 1112396529726L;
        public static final long ARRAY_MODE = 1120986464319L;
        public static final long OPERATION_MODE = 1120986464320L;
        public static final long OUTPUT_SURFACE = 1120986464321L;
        public static final long APP_MAX_INPUT_SIZE = 1120986464322L;
        public static final long USED_MAX_INPUT_SIZE = 1120986464323L;
        public static final long CODEC_MAX_INPUT_SIZE = 1120986464324L;
        public static final long FLUSH_COUNT = 1120986464325L;
        public static final long SET_SURFACE_COUNT = 1120986464326L;
        public static final long RESOLUTION_CHANGE_COUNT = 1120986464327L;
        public static final long COMPONENT_COLOR_FORMAT = 1120986464328L;
        public static final long CALLER_UID = 1120986464329L;
        public static final long PIXEL_FORMAT = 1112396529738L;
        public CodecData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class ExtractorData {
        public static final int UNSET = 0;
        public static final int SDK = 1;
        public static final int NDK_WITH_JVM = 2;
        public static final int NDK_NO_JVM = 3;
        public static final int OTHER = 4;
        public static final long FORMAT = 1138166333441L;
        public static final long MIME = 1138166333442L;
        public static final long TRACKS = 1120986464259L;
        public static final long ENTRY_POINT = 1159641169924L;
        public static final long LOG_SESSION_ID = 1138166333445L;
        public ExtractorData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class NuPlayerData {
        public static final long WHICH_PLAYER = 1138166333441L;
        public static final long VIDEO_MIME = 1138166333442L;
        public static final long VIDEO_CODEC = 1138166333443L;
        public static final long WIDTH = 1120986464260L;
        public static final long HEIGHT = 1120986464261L;
        public static final long FRAMES = 1112396529670L;
        public static final long FRAMES_DROPPED = 1112396529671L;
        public static final long FRAMERATE = 1103806595080L;
        public static final long AUDIO_MIME = 1138166333449L;
        public static final long AUDIO_CODEC = 1138166333450L;
        public static final long DURATION_MILLIS = 1112396529675L;
        public static final long PLAYING_MILLIS = 1112396529676L;
        public static final long ERROR = 1120986464269L;
        public static final long ERROR_CODE = 1120986464270L;
        public static final long ERROR_STATE = 1138166333455L;
        public static final long DATA_SOURCE_TYPE = 1138166333456L;
        public static final long REBUFFERING_MILLIS = 1112396529681L;
        public static final long REBUFFERS = 1120986464274L;
        public static final long REBUFFER_AT_EXIT = 1120986464275L;
        public static final long FRAMES_DROPPED_STARTUP = 1112396529684L;
        public NuPlayerData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }

    public final class RecorderData {
        public static final long AUDIO_MIME = 1138166333441L;
        public static final long VIDEO_MIME = 1138166333442L;
        public static final long VIDEO_PROFILE = 1120986464259L;
        public static final long VIDEO_LEVEL = 1120986464260L;
        public static final long WIDTH = 1120986464261L;
        public static final long HEIGHT = 1120986464262L;
        public static final long ROTATION = 1120986464263L;
        public static final long FRAMERATE = 1120986464264L;
        public static final long CAPTURE_FPS = 1120986464265L;
        public static final long CAPTURE_FPS_ENABLE = 1103806595082L;
        public static final long DURATION_MILLIS = 1112396529675L;
        public static final long PAUSED_MILLIS = 1112396529676L;
        public static final long PAUSED_COUNT = 1120986464269L;
        public static final long AUDIO_BITRATE = 1120986464270L;
        public static final long AUDIO_CHANNELS = 1120986464271L;
        public static final long AUDIO_SAMPLERATE = 1120986464272L;
        public static final long MOVIE_TIMESCALE = 1120986464273L;
        public static final long AUDIO_TIMESCALE = 1120986464274L;
        public static final long VIDEO_TIMESCALE = 1120986464275L;
        public static final long VIDEO_BITRATE = 1120986464276L;
        public static final long IFRAME_INTERVAL = 1120986464277L;
        public static final long LOG_SESSION_ID = 1138166333462L;
        public RecorderData(android.stats.mediametrics_message.MediametricsMessage p0) {}
    }
}
