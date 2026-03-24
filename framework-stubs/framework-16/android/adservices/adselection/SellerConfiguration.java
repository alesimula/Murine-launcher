package android.adservices.adselection;

@android.annotation.FlaggedApi("com.android.adservices.flags.fledge_get_ad_selection_data_seller_configuration_enabled")
public final class SellerConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.SellerConfiguration> CREATOR = null;
    SellerConfiguration() {}
    public int describeContents() { return 0; }
    public int getMaximumPayloadSizeBytes() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<android.adservices.adselection.PerBuyerConfiguration> getPerBuyerConfigurations() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.SellerConfiguration build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SellerConfiguration.Builder setMaximumPayloadSizeBytes(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SellerConfiguration.Builder setPerBuyerConfigurations(java.util.Set<android.adservices.adselection.PerBuyerConfiguration> p0) { return null; }
    }
}
