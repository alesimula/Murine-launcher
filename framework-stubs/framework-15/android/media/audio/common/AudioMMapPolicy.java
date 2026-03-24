package android.media.audio.common;

public @interface AudioMMapPolicy {
    public static final int UNSPECIFIED = 0;
    public static final int NEVER = 1;
    public static final int AUTO = 2;
    public static final int ALWAYS = 3;
}
