package android.companion.virtual;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
public final class ViewConfigurationParams implements android.os.Parcelable {
    public static final int INVALID_VALUE = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.ViewConfigurationParams> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public float getTouchSlopDp() { return 0.0f; }
    public float getMinimumFlingVelocityDpPerSecond() { return 0.0f; }
    public float getMaximumFlingVelocityDpPerSecond() { return 0.0f; }
    public float getScrollFriction() { return 0.0f; }
    @android.annotation.NonNull
    public java.time.Duration getTapTimeoutDuration() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getDoubleTapTimeoutDuration() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getDoubleTapMinTimeDuration() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getLongPressTimeoutDuration() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getMultiPressTimeoutDuration() { return null; }

    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setTouchSlopDp(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setMinimumFlingVelocityDpPerSecond(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setMaximumFlingVelocityDpPerSecond(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setScrollFriction(float p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setTapTimeoutDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setDoubleTapTimeoutDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setDoubleTapMinTimeDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setLongPressTimeoutDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams.Builder setMultiPressTimeoutDuration(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ViewConfigurationParams build() { return null; }
    }
}
