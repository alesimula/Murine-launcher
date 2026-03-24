package android.hardware.lights;

@android.annotation.SystemApi
public final class LightsRequest {
    final int[] mLightIds = null;
    final android.hardware.lights.LightState[] mLightStates = null;
    private LightsRequest(android.util.SparseArray<android.hardware.lights.LightState> p0) {}

    public static final class Builder {
        private final android.util.SparseArray<android.hardware.lights.LightState> mChanges = null;
        public Builder() {}
        public android.hardware.lights.LightsRequest.Builder setLight(android.hardware.lights.Light p0, android.hardware.lights.LightState p1) { return null; }
        public android.hardware.lights.LightsRequest.Builder clearLight(android.hardware.lights.Light p0) { return null; }
        public android.hardware.lights.LightsRequest build() { return null; }
    }
}
