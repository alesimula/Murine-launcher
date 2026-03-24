package android.app;

@android.annotation.SystemApi
public class VrManager {
    private final android.service.vr.IVrManager mService = null;
    private java.util.Map<android.app.VrStateCallback, android.app.VrManager.CallbackEntry> mCallbackMap;
    public VrManager(android.service.vr.IVrManager p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.RESTRICTED_VR_ACCESS", "android.permission.ACCESS_VR_STATE"})
    public void registerVrStateCallback(java.util.concurrent.Executor p0, android.app.VrStateCallback p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.RESTRICTED_VR_ACCESS", "android.permission.ACCESS_VR_STATE"})
    public void unregisterVrStateCallback(android.app.VrStateCallback p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.RESTRICTED_VR_ACCESS", "android.permission.ACCESS_VR_STATE"})
    public boolean isVrModeEnabled() { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.RESTRICTED_VR_ACCESS", "android.permission.ACCESS_VR_STATE"})
    public boolean isPersistentVrModeEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public void setPersistentVrModeEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public void setVr2dDisplayProperties(android.app.Vr2dDisplayProperties p0) {}
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public void setAndBindVrCompositor(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_VR_MANAGER")
    public void setStandbyEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public void setVrInputMethod(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.RESTRICTED_VR_ACCESS")
    public int getVr2dDisplayId() { return 0; }

    private static class CallbackEntry {
        final android.service.vr.IVrStateCallbacks mStateCallback = null;
        final android.service.vr.IPersistentVrStateCallbacks mPersistentStateCallback = null;
        final android.app.VrStateCallback mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        CallbackEntry(android.app.VrStateCallback p0, java.util.concurrent.Executor p1) {}
    }
}
