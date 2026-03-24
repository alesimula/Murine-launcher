package android.service.games;

@android.annotation.SystemApi
public abstract class GameSessionService extends android.app.Service {
    public static final java.lang.String ACTION_GAME_SESSION_SERVICE = "android.service.games.action.GAME_SESSION_SERVICE";
    public GameSessionService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.service.games.GameSession onNewSession(android.service.games.CreateGameSessionRequest p0);
}
