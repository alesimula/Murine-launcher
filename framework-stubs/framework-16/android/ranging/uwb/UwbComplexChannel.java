package android.ranging.uwb;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class UwbComplexChannel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.uwb.UwbComplexChannel> CREATOR = null;
    public static final int UWB_CHANNEL_10 = 10;
    public static final int UWB_CHANNEL_12 = 12;
    public static final int UWB_CHANNEL_13 = 13;
    public static final int UWB_CHANNEL_14 = 14;
    public static final int UWB_CHANNEL_5 = 5;
    public static final int UWB_CHANNEL_6 = 6;
    public static final int UWB_CHANNEL_8 = 8;
    public static final int UWB_CHANNEL_9 = 9;
    public static final int UWB_PREAMBLE_CODE_INDEX_10 = 10;
    public static final int UWB_PREAMBLE_CODE_INDEX_11 = 11;
    public static final int UWB_PREAMBLE_CODE_INDEX_12 = 12;
    public static final int UWB_PREAMBLE_CODE_INDEX_25 = 25;
    public static final int UWB_PREAMBLE_CODE_INDEX_26 = 26;
    public static final int UWB_PREAMBLE_CODE_INDEX_27 = 27;
    public static final int UWB_PREAMBLE_CODE_INDEX_28 = 28;
    public static final int UWB_PREAMBLE_CODE_INDEX_29 = 29;
    public static final int UWB_PREAMBLE_CODE_INDEX_30 = 30;
    public static final int UWB_PREAMBLE_CODE_INDEX_31 = 31;
    public static final int UWB_PREAMBLE_CODE_INDEX_32 = 32;
    public static final int UWB_PREAMBLE_CODE_INDEX_9 = 9;
    UwbComplexChannel() {}
    public int describeContents() { return 0; }
    public int getChannel() { return 0; }
    public int getPreambleIndex() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.uwb.UwbComplexChannel build() { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbComplexChannel.Builder setChannel(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.uwb.UwbComplexChannel.Builder setPreambleIndex(int p0) { return null; }
    }
}
