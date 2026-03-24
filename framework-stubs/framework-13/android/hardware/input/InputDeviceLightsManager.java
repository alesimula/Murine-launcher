package android.hardware.input;

class InputDeviceLightsManager extends android.hardware.lights.LightsManager {
    InputDeviceLightsManager(android.hardware.input.InputManager p0, int p1) { super(null); }
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class InputDeviceLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
