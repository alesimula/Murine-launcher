package android.adservices.ondevicepersonalization;

public final class UserData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.ondevicepersonalization.UserData> CREATOR = null;
    UserData() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.adservices.ondevicepersonalization.AppInfo> getAppInfos() { return null; }
    public long getAvailableStorageBytes() { return 0L; }
    public int getBatteryPercentage() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getCarrier() { return null; }
    public int getDataNetworkType() { return 0; }
    @android.annotation.Nullable
    public android.net.NetworkCapabilities getNetworkCapabilities() { return null; }
    public int getOrientation() { return 0; }
    @android.annotation.NonNull
    public java.time.Duration getTimezoneUtcOffset() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
