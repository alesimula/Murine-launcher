package android.hardware.input;

class InputDeviceLightsManager extends android.hardware.lights.LightsManager {
    InputDeviceLightsManager(int p0) { super(); }
    @android.annotation.NonNull
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    @android.annotation.NonNull
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    @android.annotation.NonNull
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class InputDeviceLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
