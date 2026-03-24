package android.ranging.uwb;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class UwbRangingParams implements android.os.Parcelable {
    public static final int CONFIG_MULTICAST_DS_TWR = 2;
    public static final int CONFIG_PROVISIONED_INDIVIDUAL_MULTICAST_DS_TWR = 5;
    public static final int CONFIG_PROVISIONED_MULTICAST_DS_TWR = 4;
    public static final int CONFIG_PROVISIONED_UNICAST_DS_TWR = 3;
    public static final int CONFIG_PROVISIONED_UNICAST_DS_TWR_VERY_FAST = 6;
    public static final int CONFIG_UNICAST_DS_TWR = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.uwb.UwbRangingParams> CREATOR = null;
    public static final int DURATION_1_MS = 1;
    public static final int DURATION_2_MS = 2;
    public static final int SUB_SESSION_UNDEFINED = -1;
    UwbRangingParams() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.ranging.uwb.UwbComplexChannel getComplexChannel() { return null; }
    public int getConfigId() { return 0; }
    @android.annotation.NonNull
    public android.ranging.uwb.UwbAddress getDeviceAddress() { return null; }
    @android.annotation.NonNull
    public android.ranging.uwb.UwbAddress getPeerAddress() { return null; }
    public int getRangingUpdateRate() { return 0; }
    public int getSessionId() { return 0; }
    @android.annotation.Nullable
    public byte[] getSessionKeyInfo() { return null; }
    public int getSlotDuration() { return 0; }
    public int getSubSessionId() { return 0; }
    @android.annotation.Nullable
    public byte[] getSubSessionKeyInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, android.ranging.uwb.UwbAddress p2, android.ranging.uwb.UwbAddress p3) {}
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams build() { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setComplexChannel(android.ranging.uwb.UwbComplexChannel p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setRangingUpdateRate(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setSessionKeyInfo(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setSlotDuration(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setSubSessionId(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbRangingParams.Builder setSubSessionKeyInfo(byte[] p0) { return null; }
    }
}
