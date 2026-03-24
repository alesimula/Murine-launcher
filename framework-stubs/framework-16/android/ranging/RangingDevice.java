package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingDevice implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.RangingDevice> CREATOR = null;
    RangingDevice() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.UUID getUuid() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.RangingDevice build() { return null; }
        @android.annotation.NonNull
        public android.ranging.RangingDevice.Builder setUuid(java.util.UUID p0) { return null; }
    }
}
