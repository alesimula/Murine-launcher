package android.server.app;

public final class Flags {
    public static final java.lang.String FLAG_DISABLE_GAME_MODE_WHEN_APP_TOP = "android.server.app.disable_game_mode_when_app_top";
    public static final java.lang.String FLAG_GAME_DEFAULT_FRAME_RATE = "android.server.app.game_default_frame_rate";
    public Flags() {}
    public static boolean disableGameModeWhenAppTop() { return false; }
    public static boolean gameDefaultFrameRate() { return false; }
}
