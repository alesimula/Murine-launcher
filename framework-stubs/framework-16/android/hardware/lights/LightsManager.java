package android.hardware.lights;

public abstract class LightsManager {
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    public LightsManager() {}
    @android.annotation.NonNull
    public abstract java.util.List<android.hardware.lights.Light> getLights();
    @android.annotation.NonNull
    public abstract android.hardware.lights.LightState getLightState(android.hardware.lights.Light p0);
    @android.annotation.NonNull
    public abstract android.hardware.lights.LightsManager.LightsSession openSession();
    @android.annotation.NonNull
    public abstract android.hardware.lights.LightsManager.LightsSession openSession(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }

    public static abstract class LightsSession implements java.lang.AutoCloseable {
        public LightsSession() {}
        public abstract void requestLights(android.hardware.lights.LightsRequest p0);
        public abstract void close();
        @android.annotation.NonNull
        public android.os.IBinder getToken() { return null; }
    }
}
