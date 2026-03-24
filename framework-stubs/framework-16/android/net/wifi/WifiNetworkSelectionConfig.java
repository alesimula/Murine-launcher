package android.net.wifi;

public final class WifiNetworkSelectionConfig implements android.os.Parcelable {
    public static final int ASSOCIATED_NETWORK_SELECTION_OVERRIDE_DISABLED = 2;
    public static final int ASSOCIATED_NETWORK_SELECTION_OVERRIDE_ENABLED = 1;
    public static final int ASSOCIATED_NETWORK_SELECTION_OVERRIDE_NONE = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiNetworkSelectionConfig> CREATOR = null;
    public static final int FREQUENCY_WEIGHT_HIGH = 1;
    public static final int FREQUENCY_WEIGHT_LOW = 0;
    WifiNetworkSelectionConfig() {}
    public int describeContents() { return 0; }
    public int getAssociatedNetworkSelectionOverride() { return 0; }
    @android.annotation.NonNull
    public android.util.SparseArray<java.lang.Integer> getFrequencyWeights() { return null; }
    @android.annotation.NonNull
    public int[] getRssiThresholds(int p0) { return null; }
    public boolean isLastSelectionWeightEnabled() { return false; }
    public boolean isSufficiencyCheckEnabledWhenScreenOff() { return false; }
    public boolean isSufficiencyCheckEnabledWhenScreenOn() { return false; }
    public boolean isUserConnectChoiceOverrideEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.wifi.WifiNetworkSelectionConfig p0) {}
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setAssociatedNetworkSelectionOverride(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setFrequencyWeights(android.util.SparseArray<java.lang.Integer> p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setLastSelectionWeightEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setRssiThresholds(int p0, int[] p1) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setSufficiencyCheckEnabledWhenScreenOff(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setSufficiencyCheckEnabledWhenScreenOn(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiNetworkSelectionConfig.Builder setUserConnectChoiceOverrideEnabled(boolean p0) { return null; }
    }
}
