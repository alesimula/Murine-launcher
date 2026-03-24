package android.hardware.input;

class InputDeviceLightsManager extends android.hardware.lights.LightsManager {
    private static final java.lang.String TAG = "InputDeviceLightsManager";
    private static final boolean DEBUG = false;
    private final android.hardware.input.InputManager mInputManager = null;
    private final int mDeviceId = 0;
    private final java.lang.String mPackageName = null;
    InputDeviceLightsManager(android.hardware.input.InputManager p0, int p1) { super(null); }
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession(int p0) { return null; }

    public final class InputDeviceLightsSession extends android.hardware.lights.LightsManager.LightsSession implements java.lang.AutoCloseable {
        private final android.util.CloseGuard mCloseGuard = null;
        private boolean mClosed;
        private InputDeviceLightsSession(android.hardware.input.InputDeviceLightsManager p0) { super(); }
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
