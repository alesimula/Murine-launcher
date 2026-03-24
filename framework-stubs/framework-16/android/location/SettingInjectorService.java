package android.location;

public abstract class SettingInjectorService extends android.app.Service {
    public static final java.lang.String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
    public static final java.lang.String META_DATA_NAME = "android.location.SettingInjectorService";
    public static final java.lang.String ATTRIBUTES_NAME = "injected-location-setting";
    public static final java.lang.String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
    public static final java.lang.String SUMMARY_KEY = "summary";
    public static final java.lang.String ENABLED_KEY = "enabled";
    public static final java.lang.String MESSENGER_KEY = "messenger";
    public SettingInjectorService(java.lang.String p0) { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void onStart(android.content.Intent p0, int p1) {}
    public final int onStartCommand(android.content.Intent p0, int p1, int p2) { return 0; }
    protected abstract java.lang.String onGetSummary();
    protected abstract boolean onGetEnabled();
    public static final void refreshSettings(android.content.Context p0) {}
}
