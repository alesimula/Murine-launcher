package android.companion.virtual.sensor;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_sensor_additional_info")
public final class VirtualSensorAdditionalInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensorAdditionalInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getType() { return 0; }
    @android.annotation.NonNull
    public java.util.List<float[]> getValues() { return null; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorAdditionalInfo.Builder addValues(float[] p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorAdditionalInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
