package android.app;

public final class GameManager {
    private static final java.lang.String TAG = "GameManager";
    private final android.content.Context mContext = null;
    private final android.app.IGameManagerService mService = null;
    public static final int GAME_MODE_UNSUPPORTED = 0;
    public static final int GAME_MODE_STANDARD = 1;
    public static final int GAME_MODE_PERFORMANCE = 2;
    public static final int GAME_MODE_BATTERY = 3;
    GameManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    public int getGameMode() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public int getGameMode(java.lang.String p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public void setGameMode(java.lang.String p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public int[] getAvailableGameModes(java.lang.String p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GameMode {
    }
}
