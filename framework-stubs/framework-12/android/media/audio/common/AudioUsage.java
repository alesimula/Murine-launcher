package android.media.audio.common;

public @interface AudioUsage {
    public static final int UNKNOWN = 0;
    public static final int MEDIA = 1;
    public static final int VOICE_COMMUNICATION = 2;
    public static final int VOICE_COMMUNICATION_SIGNALLING = 3;
    public static final int ALARM = 4;
    public static final int NOTIFICATION = 5;
    public static final int NOTIFICATION_TELEPHONY_RINGTONE = 6;
    public static final int ASSISTANCE_ACCESSIBILITY = 11;
    public static final int ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int ASSISTANCE_SONIFICATION = 13;
    public static final int GAME = 14;
    public static final int VIRTUAL_SOURCE = 15;
    public static final int ASSISTANT = 16;
}
