package android.ranging.oob;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class DeviceHandle implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.oob.DeviceHandle> CREATOR = null;
    DeviceHandle() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.ranging.RangingDevice getRangingDevice() { return null; }
    @android.annotation.NonNull
    public android.ranging.oob.TransportHandle getTransportHandle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.ranging.RangingDevice p0, android.ranging.oob.TransportHandle p1) {}
        @android.annotation.NonNull
        public android.ranging.oob.DeviceHandle build() { return null; }
    }
}
