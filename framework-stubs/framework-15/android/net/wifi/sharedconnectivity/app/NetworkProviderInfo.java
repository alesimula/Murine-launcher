package android.net.wifi.sharedconnectivity.app;

@android.annotation.SystemApi
public final class NetworkProviderInfo implements android.os.Parcelable {
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_PHONE = 1;
    public static final int DEVICE_TYPE_TABLET = 2;
    public static final int DEVICE_TYPE_LAPTOP = 3;
    public static final int DEVICE_TYPE_WATCH = 4;
    public static final int DEVICE_TYPE_AUTO = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.sharedconnectivity.app.NetworkProviderInfo> CREATOR = null;
    public int getDeviceType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDeviceName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getModelName() { return null; }
    public int getBatteryPercentage() { return 0; }
    @android.annotation.FlaggedApi("android.net.wifi.flags.network_provider_battery_charging_status")
    public boolean isBatteryCharging() { return false; }
    public int getConnectionStrength() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.net.wifi.sharedconnectivity.app.NetworkProviderInfo readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setDeviceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setDeviceName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setModelName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setBatteryPercentage(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("android.net.wifi.flags.network_provider_battery_charging_status")
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setBatteryCharging(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setConnectionStrength(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.sharedconnectivity.app.NetworkProviderInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceType {
    }
}
