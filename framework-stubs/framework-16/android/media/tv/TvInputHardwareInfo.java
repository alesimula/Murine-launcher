package android.media.tv;

@android.annotation.SystemApi
public final class TvInputHardwareInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "TvInputHardwareInfo";
    public static final int TV_INPUT_TYPE_OTHER_HARDWARE = 1;
    public static final int TV_INPUT_TYPE_TUNER = 2;
    public static final int TV_INPUT_TYPE_COMPOSITE = 3;
    public static final int TV_INPUT_TYPE_SVIDEO = 4;
    public static final int TV_INPUT_TYPE_SCART = 5;
    public static final int TV_INPUT_TYPE_COMPONENT = 6;
    public static final int TV_INPUT_TYPE_VGA = 7;
    public static final int TV_INPUT_TYPE_DVI = 8;
    public static final int TV_INPUT_TYPE_HDMI = 9;
    public static final int TV_INPUT_TYPE_DISPLAY_PORT = 10;
    public static final int CABLE_CONNECTION_STATUS_UNKNOWN = 0;
    public static final int CABLE_CONNECTION_STATUS_CONNECTED = 1;
    public static final int CABLE_CONNECTION_STATUS_DISCONNECTED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.TvInputHardwareInfo> CREATOR = null;
    public int getDeviceId() { return 0; }
    public int getType() { return 0; }
    public int getAudioType() { return 0; }
    public java.lang.String getAudioAddress() { return null; }
    public int getHdmiPortId() { return 0; }
    public int getCableConnectionStatus() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public android.media.tv.TvInputHardwareInfo.Builder toBuilder() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.media.tv.TvInputHardwareInfo.Builder deviceId(int p0) { return null; }
        public android.media.tv.TvInputHardwareInfo.Builder type(int p0) { return null; }
        public android.media.tv.TvInputHardwareInfo.Builder audioType(int p0) { return null; }
        public android.media.tv.TvInputHardwareInfo.Builder audioAddress(java.lang.String p0) { return null; }
        public android.media.tv.TvInputHardwareInfo.Builder hdmiPortId(int p0) { return null; }
        public android.media.tv.TvInputHardwareInfo.Builder cableConnectionStatus(int p0) { return null; }
        public android.media.tv.TvInputHardwareInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CableConnectionStatus {
    }
}
