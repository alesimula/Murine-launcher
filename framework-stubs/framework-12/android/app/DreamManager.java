package android.app;

public class DreamManager {
    private final android.service.dreams.IDreamManager mService = null;
    private final android.content.Context mContext = null;
    public DreamManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void startDream(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void stopDream() {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setActiveDream(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean isDreaming() { return false; }
}
