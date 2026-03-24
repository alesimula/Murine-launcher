package android.media;

public class DecoderCapabilities {
    public static java.util.List<android.media.DecoderCapabilities.VideoDecoder> getVideoDecoders() { return null; }
    public static java.util.List<android.media.DecoderCapabilities.AudioDecoder> getAudioDecoders() { return null; }

    public static enum AudioDecoder {
        AUDIO_DECODER_WMA;
    }

    public static enum VideoDecoder {
        VIDEO_DECODER_WMV;
    }
}
