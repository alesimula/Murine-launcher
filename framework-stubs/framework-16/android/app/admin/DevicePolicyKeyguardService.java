package android.app.admin;

@android.annotation.SystemApi
public class DevicePolicyKeyguardService extends android.app.Service {
    public DevicePolicyKeyguardService() { super(); }
    public void onDestroy() {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.Nullable
    public android.view.SurfaceControlViewHost.SurfacePackage onCreateKeyguardSurface(android.os.IBinder p0) { return null; }
    @android.annotation.Nullable
    public void dismiss() {}
}
