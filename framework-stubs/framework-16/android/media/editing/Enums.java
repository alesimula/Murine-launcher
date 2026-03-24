package android.media.editing;

public final class Enums {
    public static final int FINAL_STATE_UNSPECIFIED = 0;
    public static final int FINAL_STATE_SUCCEEDED = 1;
    public static final int FINAL_STATE_CANCELED = 2;
    public static final int FINAL_STATE_ERROR = 3;
    public static final int ERROR_CODE_UNSPECIFIED = 0;
    public static final int ERROR_CODE_NONE = 1;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 2;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 3;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 4;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 5;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 6;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 7;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 8;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 9;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 10;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 11;
    public static final int ERROR_CODE_DECODING_FAILED = 12;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 13;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = 14;
    public static final int ERROR_CODE_ENCODING_FAILED = 15;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = 16;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 17;
    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = 18;
    public static final int ERROR_CODE_MUXING_FAILED = 19;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_GALLERY = 1;
    public static final int SOURCE_TYPE_CAMERA = 2;
    public static final int SOURCE_TYPE_EDITING_SESSION = 3;
    public static final int SOURCE_TYPE_LOCAL_FILE = 4;
    public static final int SOURCE_TYPE_REMOTE_FILE = 5;
    public static final int SOURCE_TYPE_REMOTE_LIVE_STREAM = 6;
    public static final int SOURCE_TYPE_GENERATED = 7;
    public static final int RESOLUTION_ASPECT_RATIO_UNSPECIFIED = 0;
    public static final int RESOLUTION_ASPECT_RATIO_SQUARE = 1;
    public static final int RESOLUTION_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int RESOLUTION_ASPECT_RATIO_PORTRAIT = 3;
    public Enums() {}
}
