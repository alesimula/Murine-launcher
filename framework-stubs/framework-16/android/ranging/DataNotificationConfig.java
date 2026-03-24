package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class DataNotificationConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.DataNotificationConfig> CREATOR = null;
    public static final int NOTIFICATION_CONFIG_DISABLE = 0;
    public static final int NOTIFICATION_CONFIG_ENABLE = 1;
    public static final int NOTIFICATION_CONFIG_PROXIMITY_EDGE = 3;
    public static final int NOTIFICATION_CONFIG_PROXIMITY_LEVEL = 2;
    DataNotificationConfig() {}
    public int describeContents() { return 0; }
    public int getNotificationConfigType() { return 0; }
    public int getProximityFarCm() { return 0; }
    public int getProximityNearCm() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.DataNotificationConfig build() { return null; }
        @android.annotation.NonNull
        public android.ranging.DataNotificationConfig.Builder setNotificationConfigType(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.DataNotificationConfig.Builder setProximityFarCm(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.DataNotificationConfig.Builder setProximityNearCm(int p0) { return null; }
    }
}
