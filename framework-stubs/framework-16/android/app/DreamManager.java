package android.app;

public class DreamManager {
    public DreamManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public boolean isScreensaverEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setScreensaverEnabled(boolean p0) {}
    public boolean areDreamsSupported() { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void startDream() {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void stopDream() {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setActiveDream(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setSystemDreamComponent(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setDreamOverlay(android.content.ComponentName p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean canStartDreaming(boolean p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_DREAM_STATE")
    public boolean isDreaming() { return false; }
    @android.annotation.FlaggedApi("android.service.dreams.dream_handles_being_obscured")
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setDreamIsObscured(boolean p0) {}
    @android.annotation.FlaggedApi("android.service.dreams.allow_dream_when_postured")
    @android.annotation.RequiresPermission("android.permission.WRITE_DREAM_STATE")
    public void setDevicePostured(boolean p0) {}
}
