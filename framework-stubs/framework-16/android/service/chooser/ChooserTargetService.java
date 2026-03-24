package android.service.chooser;

@java.lang.Deprecated
public abstract class ChooserTargetService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
    public static final java.lang.String META_DATA_NAME = "android.service.chooser.chooser_target_service";
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
    public ChooserTargetService() { super(); }
    public abstract java.util.List<android.service.chooser.ChooserTarget> onGetChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private class IChooserTargetServiceWrapper extends android.service.chooser.IChooserTargetService.Stub {
        public void getChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1, android.service.chooser.IChooserTargetResult p2) throws android.os.RemoteException {}
    }
}
