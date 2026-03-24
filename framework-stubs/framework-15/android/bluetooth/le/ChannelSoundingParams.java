package android.bluetooth.le;

public final class ChannelSoundingParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ChannelSoundingParams> CREATOR = null;
    public static final int CS_SECURITY_LEVEL_FOUR = 4;
    public static final int CS_SECURITY_LEVEL_ONE = 1;
    public static final int CS_SECURITY_LEVEL_THREE = 3;
    public static final int CS_SECURITY_LEVEL_TWO = 2;
    public static final int CS_SECURITY_LEVEL_UNKNOWN = 0;
    public static final int LOCATION_TYPE_INDOOR = 1;
    public static final int LOCATION_TYPE_OUTDOOR = 2;
    public static final int LOCATION_TYPE_UNKNOWN = 0;
    public static final int SIGHT_TYPE_LINE_OF_SIGHT = 1;
    public static final int SIGHT_TYPE_NON_LINE_OF_SIGHT = 2;
    public static final int SIGHT_TYPE_UNKNOWN = 0;
    ChannelSoundingParams() {}
    public int describeContents() { return 0; }
    public int getCsSecurityLevel() { return 0; }
    public int getLocationType() { return 0; }
    public int getSightType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.bluetooth.le.ChannelSoundingParams build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ChannelSoundingParams.Builder setCsSecurityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ChannelSoundingParams.Builder setLocationType(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.ChannelSoundingParams.Builder setSightType(int p0) { return null; }
    }
}
