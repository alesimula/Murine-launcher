package android.hardware.camera2.params;

public final class DeviceStateSensorOrientationMap {
    public static final long NORMAL = 0L;
    public static final long FOLDED = 4L;
    public DeviceStateSensorOrientationMap(long[] p0) {}
    public int getSensorOrientation(long p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.hardware.camera2.params.DeviceStateSensorOrientationMap.Builder addOrientationForState(long p0, long p1) { return null; }
        public android.hardware.camera2.params.DeviceStateSensorOrientationMap build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceState {
    }
}
