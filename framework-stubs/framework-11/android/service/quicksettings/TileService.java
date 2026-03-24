package android.service.quicksettings;

public class TileService extends android.app.Service {
    private static final java.lang.String TAG = "TileService";
    private static final boolean DEBUG = false;
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final java.lang.String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final java.lang.String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = "android.service.quicksettings.TOGGLEABLE_TILE";
    public static final java.lang.String ACTION_REQUEST_LISTENING = "android.service.quicksettings.action.REQUEST_LISTENING";
    public static final java.lang.String EXTRA_SERVICE = "service";
    public static final java.lang.String EXTRA_TOKEN = "token";
    public static final java.lang.String EXTRA_STATE = "state";
    private final android.service.quicksettings.TileService.H mHandler = null;
    private boolean mListening;
    private android.service.quicksettings.Tile mTile;
    private android.os.IBinder mToken;
    private android.service.quicksettings.IQSService mService;
    private java.lang.Runnable mUnlockRunnable;
    private android.os.IBinder mTileToken;
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
    public final android.service.quicksettings.Tile getQsTile() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public static boolean isQuickSettingsSupported() { return false; }
    public static final void requestListeningState(android.content.Context p0, android.content.ComponentName p1) {}

    private class H extends android.os.Handler {
        private static final int MSG_START_LISTENING = 1;
        private static final int MSG_STOP_LISTENING = 2;
        private static final int MSG_TILE_ADDED = 3;
        private static final int MSG_TILE_REMOVED = 4;
        private static final int MSG_TILE_CLICKED = 5;
        private static final int MSG_UNLOCK_COMPLETE = 6;
        private static final int MSG_START_SUCCESS = 7;
        private final java.lang.String mTileServiceName = null;
        public H(android.service.quicksettings.TileService p0, android.os.Looper p1) { super(); }
        private void logMessage(java.lang.String p0) {}
        public void handleMessage(android.os.Message p0) {}
    }
}
