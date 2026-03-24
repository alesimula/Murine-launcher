package android.service.quicksettings;

public class TileService extends android.app.Service {
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final java.lang.String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final java.lang.String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = "android.service.quicksettings.TOGGLEABLE_TILE";
    public static final java.lang.String EXTRA_SERVICE = "service";
    public static final java.lang.String EXTRA_TOKEN = "token";
    public static final java.lang.String EXTRA_STATE = "state";
    public TileService() { super(); }
    public void onDestroy() {}
    public void onTileAdded() {}
    public void onTileRemoved() {}
    public void onStartListening() {}
    public void onStopListening() {}
    public void onClick() {}
    @android.annotation.SystemApi
    public final void setStatusIcon(android.graphics.drawable.Icon p0, java.lang.String p1) {}
    public final void showDialog(android.app.Dialog p0) {}
    public final void unlockAndRun(java.lang.Runnable p0) {}
    public final boolean isSecure() { return false; }
    public final boolean isLocked() { return false; }
    public final void startActivityAndCollapse(android.content.Intent p0) {}
    public void startActivityAndCollapse(android.app.PendingIntent p0) {}
    public final android.service.quicksettings.Tile getQsTile() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public static boolean isQuickSettingsSupported() { return false; }
    public static final void requestListeningState(android.content.Context p0, android.content.ComponentName p1) {}

    private class H extends android.os.Handler {
        public H(android.service.quicksettings.TileService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
