package android.app;

public final class GameManager {
    public static final int GAME_MODE_UNSUPPORTED = 0;
    public static final int GAME_MODE_STANDARD = 1;
    public static final int GAME_MODE_PERFORMANCE = 2;
    public static final int GAME_MODE_BATTERY = 3;
    public static final int GAME_MODE_CUSTOM = 4;
    GameManager(android.content.Context p0, android.app.IGameManagerService p1) {}
    public int getGameMode() { return 0; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public int getGameMode(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    @android.annotation.Nullable
    public android.app.GameModeInfo getGameModeInfo(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public void setGameMode(java.lang.String p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public int[] getAvailableGameModes(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public boolean isAngleEnabled(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public void notifyGraphicsEnvironmentSetup() {}
    public void setGameState(android.app.GameState p0) {}
    public void setGameServiceProvider(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_MODE")
    public void updateCustomGameModeConfiguration(java.lang.String p0, android.app.GameModeConfiguration p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GameMode {
    }
}
