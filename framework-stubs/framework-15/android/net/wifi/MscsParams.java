package android.net.wifi;

public final class MscsParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.MscsParams> CREATOR = null;
    public static final int FRAME_CLASSIFIER_DSCP = 32;
    public static final int FRAME_CLASSIFIER_DST_IP_ADDR = 4;
    public static final int FRAME_CLASSIFIER_DST_PORT = 16;
    public static final int FRAME_CLASSIFIER_FLOW_LABEL = 128;
    public static final int FRAME_CLASSIFIER_IP_VERSION = 1;
    public static final int FRAME_CLASSIFIER_PROTOCOL_NEXT_HDR = 64;
    public static final int FRAME_CLASSIFIER_SRC_IP_ADDR = 2;
    public static final int FRAME_CLASSIFIER_SRC_PORT = 8;
    MscsParams() {}
    public int describeContents() { return 0; }
    public int getFrameClassifierFields() { return 0; }
    public int getStreamTimeoutUs() { return 0; }
    public int getUserPriorityBitmap() { return 0; }
    public int getUserPriorityLimit() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.MscsParams build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setFrameClassifierFields(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setStreamTimeoutUs(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setUserPriorityBitmap(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.MscsParams.Builder setUserPriorityLimit(int p0) { return null; }
    }
}
