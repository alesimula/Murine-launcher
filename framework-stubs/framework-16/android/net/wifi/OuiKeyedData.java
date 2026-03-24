package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class OuiKeyedData implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.OuiKeyedData> CREATOR = null;
    OuiKeyedData() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public android.os.PersistableBundle getData() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getOui() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        public Builder(int p0, android.os.PersistableBundle p1) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.OuiKeyedData build() { return null; }
    }
}
