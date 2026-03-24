package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.bssid_blocklist_for_suggestion")
public final class BlockingOption implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.BlockingOption> CREATOR = null;
    BlockingOption() {}
    public int describeContents() { return 0; }
    public int getBlockingTimeSeconds() { return 0; }
    public boolean isBlockingBssidOnly() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.bssid_blocklist_for_suggestion")
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.wifi.BlockingOption build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.BlockingOption.Builder setBlockingBssidOnly(boolean p0) { return null; }
    }
}
