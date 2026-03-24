package android.hardware.lights;

public final class LightsRequest {
    final java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> mRequests = null;
    final java.util.List<java.lang.Integer> mLightIds = null;
    final java.util.List<android.hardware.lights.LightState> mLightStates = null;
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getLights() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.lights.LightState> getLightStates() { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> getLightsAndStates() { return null; }

    public static final class Builder {
        final java.util.Map<android.hardware.lights.Light, android.hardware.lights.LightState> mChanges = null;
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.lights.LightsRequest.Builder addLight(android.hardware.lights.Light p0, android.hardware.lights.LightState p1) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.hardware.lights.LightsRequest.Builder setLight(android.hardware.lights.Light p0, android.hardware.lights.LightState p1) { return null; }
        @android.annotation.NonNull
        public android.hardware.lights.LightsRequest.Builder clearLight(android.hardware.lights.Light p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.lights.LightsRequest build() { return null; }
    }
}
