package android.hardware.lights;

@android.annotation.SystemApi
public final class LightsManager {
    private static final java.lang.String TAG = "LightsManager";
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    private final android.content.Context mContext = null;
    private final android.hardware.lights.ILightsManager mService = null;
    public LightsManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public LightsManager(android.content.Context p0, android.hardware.lights.ILightsManager p1) {}
    public java.util.List<android.hardware.lights.Light> getLights() { return null; }
    public android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0) { return null; }
    public android.hardware.lights.LightsManager.LightsSession openSession() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }

    public final class LightsSession implements java.lang.AutoCloseable {
        private final android.os.IBinder mToken = null;
        private final android.util.CloseGuard mCloseGuard = null;
        private boolean mClosed;
        private LightsSession(android.hardware.lights.LightsManager p0) {}
        public void requestLights(android.hardware.lights.LightsRequest p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}
