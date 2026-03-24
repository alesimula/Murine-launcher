package android.service.quicksettings;

public class TileService extends android.app.Service {
    public static final java.lang.String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final java.lang.String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final java.lang.String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    public static final java.lang.String META_DATA_TOGGLEABLE_TILE = "android.service.quicksettings.TOGGLEABLE_TILE";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String META_DATA_TILE_CATEGORY = "android.service.quicksettings.TILE_CATEGORY";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String CATEGORY_CONNECTIVITY = "android.service.quicksettings.CATEGORY_CONNECTIVITY";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String CATEGORY_UTILITIES = "android.service.quicksettings.CATEGORY_UTILITIES";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String CATEGORY_DISPLAY = "android.service.quicksettings.CATEGORY_DISPLAY";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String CATEGORY_PRIVACY = "android.service.quicksettings.CATEGORY_PRIVACY";
    @android.annotation.FlaggedApi("android.service.quicksettings.quicksettings_tile_categories")
    public static final java.lang.String CATEGORY_ACCESSIBILITY = "android.service.quicksettings.CATEGORY_ACCESSIBILITY";
    public static final java.lang.String EXTRA_SERVICE = "service";
    public static final java.lang.String EXTRA_TOKEN = "token";
    public static final java.lang.String EXTRA_STATE = "state";
    public static final long START_ACTIVITY_NEEDS_PENDING_INTENT = 241766793L;
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
    @java.lang.Deprecated
    public final void startActivityAndCollapse(android.content.Intent p0) {}
    public final void startActivityAndCollapse(android.app.PendingIntent p0) {}
    public final android.service.quicksettings.Tile getQsTile() { return null; }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public static boolean isQuickSettingsSupported() { return false; }
    public static final void requestListeningState(android.content.Context p0, android.content.ComponentName p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Categories {
    }

    private class H extends android.os.Handler {
        public H(android.service.quicksettings.TileService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
