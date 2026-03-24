package android.speech.tts;

public class EventLogTags {
    public static final int TTS_SPEAK_SUCCESS = 76001;
    public static final int TTS_SPEAK_FAILURE = 76002;
    public static final int TTS_V2_SPEAK_SUCCESS = 76003;
    public static final int TTS_V2_SPEAK_FAILURE = 76004;
    public static void writeTtsSpeakSuccess(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5, int p6, long p7, long p8, long p9) {}
    public static void writeTtsSpeakFailure(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5, int p6) {}
    public static void writeTtsV2SpeakSuccess(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, long p5, long p6, long p7) {}
    public static void writeTtsV2SpeakFailure(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5) {}
}
