package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseRelativeEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseRelativeEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public float getRelativeX() { return 0.0f; }
    public float getRelativeY() { return 0.0f; }
    public long getEventTimeNanos() { return 0L; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.input.VirtualMouseRelativeEvent build() { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeX(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeY(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setEventTimeNanos(long p0) { return null; }
    }
}
