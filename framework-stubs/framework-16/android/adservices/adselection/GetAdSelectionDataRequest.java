package android.adservices.adselection;

public final class GetAdSelectionDataRequest {
    GetAdSelectionDataRequest() {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_server_auction_multi_cloud_enabled")
    @android.annotation.Nullable
    public android.net.Uri getCoordinatorOriginUri() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdTechIdentifier getSeller() { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_get_ad_selection_data_seller_configuration_enabled")
    @android.annotation.Nullable
    public android.adservices.adselection.SellerConfiguration getSellerConfiguration() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.GetAdSelectionDataRequest build() { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_server_auction_multi_cloud_enabled")
        @android.annotation.NonNull
        public android.adservices.adselection.GetAdSelectionDataRequest.Builder setCoordinatorOriginUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.GetAdSelectionDataRequest.Builder setSeller(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_get_ad_selection_data_seller_configuration_enabled")
        @android.annotation.NonNull
        public android.adservices.adselection.GetAdSelectionDataRequest.Builder setSellerConfiguration(android.adservices.adselection.SellerConfiguration p0) { return null; }
    }
}
