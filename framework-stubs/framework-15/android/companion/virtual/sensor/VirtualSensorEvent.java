package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensorEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensorEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public float[] getValues() { return null; }
    public long getTimestampNanos() { return 0L; }

    public static final class Builder {
        public Builder(float[] p0) {}
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorEvent build() { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.sensor.VirtualSensorEvent.Builder setTimestampNanos(long p0) { return null; }
    }
}
