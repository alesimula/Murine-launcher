package android.service.chooser;

public abstract class ChooserTargetService extends android.app.Service {
    private final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
    public static final java.lang.String META_DATA_NAME = "android.service.chooser.chooser_target_service";
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
    private android.service.chooser.ChooserTargetService.IChooserTargetServiceWrapper mWrapper;
    public ChooserTargetService() { super(); }
    public abstract java.util.List<android.service.chooser.ChooserTarget> onGetChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private class IChooserTargetServiceWrapper extends android.service.chooser.IChooserTargetService.Stub {
        private IChooserTargetServiceWrapper(android.service.chooser.ChooserTargetService p0) { super(); }
        public void getChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1, android.service.chooser.IChooserTargetResult p2) throws android.os.RemoteException {}
    }
}
