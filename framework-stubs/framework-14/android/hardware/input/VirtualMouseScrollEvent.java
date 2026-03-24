package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseScrollEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseScrollEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public float getXAxisMovement() { return 0.0f; }
    public float getYAxisMovement() { return 0.0f; }
    public long getEventTimeNanos() { return 0L; }

    public static final class Builder {
        public Builder() {}
        public android.hardware.input.VirtualMouseScrollEvent build() { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setXAxisMovement(float p0) { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setYAxisMovement(float p0) { return null; }
        public android.hardware.input.VirtualMouseScrollEvent.Builder setEventTimeNanos(long p0) { return null; }
    }
}
