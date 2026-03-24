package android.media.audio.common;

public @interface AudioStreamType {
    public static final int DEFAULT = -1;
    public static final int MIN = 0;
    public static final int VOICE_CALL = 0;
    public static final int SYSTEM = 1;
    public static final int RING = 2;
    public static final int MUSIC = 3;
    public static final int ALARM = 4;
    public static final int NOTIFICATION = 5;
    public static final int BLUETOOTH_SCO = 6;
    public static final int ENFORCED_AUDIBLE = 7;
    public static final int DTMF = 8;
    public static final int TTS = 9;
    public static final int ACCESSIBILITY = 10;
}
