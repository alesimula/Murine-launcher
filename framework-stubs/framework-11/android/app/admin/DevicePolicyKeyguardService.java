package android.app.admin;

@android.annotation.SystemApi
public class DevicePolicyKeyguardService extends android.app.Service {
    private static final java.lang.String TAG = "DevicePolicyKeyguardService";
    private final android.os.Handler mHandler = null;
    private android.app.admin.IKeyguardCallback mCallback;
    private final android.app.admin.IKeyguardClient mClient = null;
    public DevicePolicyKeyguardService() { super(); }
    public void onDestroy() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage onCreateKeyguardSurface(android.os.IBinder p0) { return null; }
    public void dismiss() {}
}
