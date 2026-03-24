package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public abstract class SettingsPreferenceService extends android.app.Service {
    public static final java.lang.String ACTION_PREFERENCE_SERVICE = "android.service.settings.preferences.action.PREFERENCE_SERVICE";
    public SettingsPreferenceService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onGetAllPreferenceMetadata(android.service.settings.preferences.MetadataRequest p0, android.os.OutcomeReceiver<android.service.settings.preferences.MetadataResult, java.lang.Exception> p1);
    public abstract void onGetPreferenceValue(android.service.settings.preferences.GetValueRequest p0, android.os.OutcomeReceiver<android.service.settings.preferences.GetValueResult, java.lang.Exception> p1);
    public abstract void onSetPreferenceValue(android.service.settings.preferences.SetValueRequest p0, android.os.OutcomeReceiver<android.service.settings.preferences.SetValueResult, java.lang.Exception> p1);
}
