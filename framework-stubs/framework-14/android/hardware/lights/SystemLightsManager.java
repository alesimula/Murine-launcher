package android.hardware.lights;

public final class SystemLightsManager extends android.hardware.lights.LightsManager {
    public SystemLightsManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException { super(); }
    public SystemLightsManager(android.content.Context p0, android.hardware.lights.ILightsManager p1) { super(); }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class SystemLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
        @android.annotation.RequiresPermission("android.permission.CONTROL_DEVICE_LIGHTS")
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
