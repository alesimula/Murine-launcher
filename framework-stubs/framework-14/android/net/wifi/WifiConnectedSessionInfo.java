package android.net.wifi;

public final class WifiConnectedSessionInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiConnectedSessionInfo> CREATOR = null;
    WifiConnectedSessionInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getSessionId() { return 0; }
    public boolean isUserSelected() { return false; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.wifi.WifiConnectedSessionInfo.Builder setUserSelected(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiConnectedSessionInfo build() { return null; }
    }
}
