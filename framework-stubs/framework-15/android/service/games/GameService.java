package android.service.games;

@android.annotation.SystemApi
public class GameService extends android.app.Service {
    public static final java.lang.String ACTION_GAME_SERVICE = "android.service.games.action.GAME_SERVICE";
    public static final java.lang.String SERVICE_META_DATA = "android.game_service";
    public GameService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onConnected() {}
    public void onDisconnected() {}
    public void onGameStarted(android.service.games.GameStartedEvent p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_GAME_ACTIVITY")
    public final void createGameSession(int p0) {}
}
