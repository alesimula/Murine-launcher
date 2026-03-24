package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class MscsParams implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.MscsParams> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_DSCP = 32;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_DST_IP_ADDR = 4;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_DST_PORT = 16;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_FLOW_LABEL = 128;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_IP_VERSION = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_PROTOCOL_NEXT_HDR = 64;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_SRC_IP_ADDR = 2;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int FRAME_CLASSIFIER_SRC_PORT = 8;
    MscsParams() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getFrameClassifierFields() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getStreamTimeoutUs() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getUserPriorityBitmap() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getUserPriorityLimit() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.MscsParams build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setFrameClassifierFields(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setStreamTimeoutUs(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setUserPriorityBitmap(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setUserPriorityLimit(int p0) { return null; }
    }
}
