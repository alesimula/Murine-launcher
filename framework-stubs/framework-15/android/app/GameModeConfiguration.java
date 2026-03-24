package android.app;

@android.annotation.SystemApi
public final class GameModeConfiguration implements android.os.Parcelable {
    public static final int FPS_OVERRIDE_NONE = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.GameModeConfiguration> CREATOR = null;
    GameModeConfiguration(float p0, int p1) {}
    GameModeConfiguration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public float getScalingFactor() { return 0.0f; }
    public int getFpsOverride() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder() {}
        public Builder(android.app.GameModeConfiguration p0) {}
        @android.annotation.NonNull
        public android.app.GameModeConfiguration.Builder setScalingFactor(float p0) { return null; }
        @android.annotation.NonNull
        public android.app.GameModeConfiguration.Builder setFpsOverride(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.GameModeConfiguration build() { return null; }
    }
}
