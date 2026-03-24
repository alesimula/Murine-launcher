package android.media;

public interface MicrophoneDirection {
    public static final int MIC_DIRECTION_UNSPECIFIED = 0;
    public static final int MIC_DIRECTION_TOWARDS_USER = 1;
    public static final int MIC_DIRECTION_AWAY_FROM_USER = 2;
    public static final int MIC_DIRECTION_EXTERNAL = 3;
    public boolean setPreferredMicrophoneDirection(int p0);
    public boolean setPreferredMicrophoneFieldDimension(float p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DirectionMode {
    }
}
