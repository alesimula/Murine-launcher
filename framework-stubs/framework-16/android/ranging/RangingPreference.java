package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RangingPreference implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.RangingPreference> CREATOR = null;
    public static final int DEVICE_ROLE_INITIATOR = 1;
    public static final int DEVICE_ROLE_RESPONDER = 0;
    RangingPreference() {}
    public int describeContents() { return 0; }
    public int getDeviceRole() { return 0; }
    @android.annotation.Nullable
    public android.ranging.RangingConfig getRangingParams() { return null; }
    @android.annotation.NonNull
    public android.ranging.SessionConfig getSessionConfig() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, android.ranging.RangingConfig p1) {}
        @android.annotation.NonNull
        public android.ranging.RangingPreference build() { return null; }
        @android.annotation.NonNull
        public android.ranging.RangingPreference.Builder setSessionConfig(android.ranging.SessionConfig p0) { return null; }
    }
}
