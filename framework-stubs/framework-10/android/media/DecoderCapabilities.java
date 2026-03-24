package android.media;

public class DecoderCapabilities {
    @android.annotation.UnsupportedAppUsage
    public static java.util.List<android.media.DecoderCapabilities.VideoDecoder> getVideoDecoders() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.util.List<android.media.DecoderCapabilities.AudioDecoder> getAudioDecoders() { return null; }
    private DecoderCapabilities() {}
    private static final native void native_init();
    private static final native int native_get_num_video_decoders();
    private static final native int native_get_video_decoder_type(int p0);
    private static final native int native_get_num_audio_decoders();
    private static final native int native_get_audio_decoder_type(int p0);

    public static enum VideoDecoder {
        VIDEO_DECODER_WMV;
        private VideoDecoder() {}
    }

    public static enum AudioDecoder {
        AUDIO_DECODER_WMA;
        private AudioDecoder() {}
    }
}
