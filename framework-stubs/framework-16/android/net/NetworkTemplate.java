package android.net;

public final class NetworkTemplate implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkTemplate> CREATOR = null;
    public static final int MATCH_BLUETOOTH = 8;
    public static final int MATCH_CARRIER = 10;
    public static final int MATCH_ETHERNET = 5;
    public static final int MATCH_MOBILE = 1;
    public static final int MATCH_PROXY = 9;
    public static final int MATCH_WIFI = 4;
    public static final int NETWORK_TYPE_ALL = -1;
    public static final int OEM_MANAGED_ALL = -1;
    public static final int OEM_MANAGED_NO = 0;
    public static final int OEM_MANAGED_PAID = 1;
    public static final int OEM_MANAGED_PRIVATE = 2;
    public static final int OEM_MANAGED_YES = -2;
    NetworkTemplate() {}
    public int describeContents() { return 0; }
    public int getDefaultNetworkStatus() { return 0; }
    public int getMatchRule() { return 0; }
    public int getMeteredness() { return 0; }
    public int getOemManaged() { return 0; }
    public int getRatType() { return 0; }
    public int getRoaming() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSubscriberIds() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getWifiNetworkKeys() { return null; }
    public boolean matches(android.net.NetworkIdentity p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.net.NetworkTemplate build() { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setDefaultNetworkStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setMeteredness(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setOemManaged(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setRatType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setRoaming(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setSubscriberIds(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.net.NetworkTemplate.Builder setWifiNetworkKeys(java.util.Set<java.lang.String> p0) { return null; }
    }
}
