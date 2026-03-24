package android.hardware.lights;

public abstract class LightsManager {
    private static final java.lang.String TAG = "LightsManager";
    private final android.content.Context mContext = null;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    public LightsManager(android.content.Context p0) {}
    public abstract java.util.List<android.hardware.lights.Light> getLights();
    public abstract android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0);
    public abstract android.hardware.lights.LightsManager.LightsSession openSession();
    public abstract android.hardware.lights.LightsManager.LightsSession openSession(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }

    public static abstract class LightsSession implements java.lang.AutoCloseable {
        private final android.os.IBinder mToken = null;
        public LightsSession() {}
        public abstract void requestLights(android.hardware.lights.LightsRequest p0);
        public abstract void close();
        public android.os.IBinder getToken() { return null; }
    }
}
