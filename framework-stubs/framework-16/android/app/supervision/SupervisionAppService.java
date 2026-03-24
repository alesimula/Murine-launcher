package android.app.supervision;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.supervision.flags.enable_supervision_app_service")
public class SupervisionAppService extends android.app.Service {
    public static final java.lang.String ACTION_SUPERVISION_APP_SERVICE = "android.app.action.SUPERVISION_APP_SERVICE";
    public SupervisionAppService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.enable_supervision_app_service")
    public void onSupervisionEnabled() {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.supervision.flags.enable_supervision_app_service")
    public void onSupervisionDisabled() {}
}
