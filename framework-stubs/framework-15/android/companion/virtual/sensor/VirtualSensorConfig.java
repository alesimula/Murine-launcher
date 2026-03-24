package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensorConfig> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int getType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getVendor() { return null; }
    public float getMaximumRange() { return 0.0f; }
    public float getResolution() { return 0.0f; }
    public float getPower() { return 0.0f; }
    public int getMinDelay() { return 0; }
    public int getMaxDelay() { return 0; }
    public int getHighestDirectReportRateLevel() { return 0; }
    public int getDirectChannelTypesSupported() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getFlags() { return 0; }

    public static final class Builder {
        int mHighestDirectReportRateLevel;
        public Builder(int p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig build() { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setVendor(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMaximumRange(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setResolution(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setPower(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMinDelay(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setMaxDelay(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setHighestDirectReportRateLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorConfig.Builder setDirectChannelTypesSupported(int p0) { return null; }
    }
}
