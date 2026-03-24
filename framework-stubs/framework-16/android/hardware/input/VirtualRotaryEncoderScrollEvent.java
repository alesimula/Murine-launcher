package android.hardware.input;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_rotary")
public final class VirtualRotaryEncoderScrollEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualRotaryEncoderScrollEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public float getScrollAmount() { return 0.0f; }
    public long getEventTimeNanos() { return 0L; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.input.VirtualRotaryEncoderScrollEvent build() { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualRotaryEncoderScrollEvent.Builder setScrollAmount(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualRotaryEncoderScrollEvent.Builder setEventTimeNanos(long p0) { return null; }
    }
}
