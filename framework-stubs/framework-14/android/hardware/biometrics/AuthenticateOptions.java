package android.hardware.biometrics;

public interface AuthenticateOptions {
    public static final int DISPLAY_STATE_UNKNOWN = 0;
    public static final int DISPLAY_STATE_LOCKSCREEN = 1;
    public static final int DISPLAY_STATE_NO_UI = 2;
    public static final int DISPLAY_STATE_SCREENSAVER = 3;
    public static final int DISPLAY_STATE_AOD = 4;
    public int getUserId();
    public int getSensorId();
    public int getDisplayState();
    public java.lang.String getOpPackageName();
    public java.lang.String getAttributionTag();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayState {
    }
}
