package android.media.soundtrigger_middleware;

public @interface RecognitionMode {
    public static final int VOICE_TRIGGER = 1;
    public static final int USER_IDENTIFICATION = 2;
    public static final int USER_AUTHENTICATION = 4;
    public static final int GENERIC_TRIGGER = 8;
}
