package android.adservices.adselection;

public final class PersistAdSelectionResultRequest {
    PersistAdSelectionResultRequest() {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_auction_server_get_ad_selection_data_id_enabled")
    public long getAdSelectionDataId() { return 0L; }
    @java.lang.Deprecated
    public long getAdSelectionId() { return 0L; }
    @android.annotation.Nullable
    public byte[] getAdSelectionResult() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdTechIdentifier getSeller() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.PersistAdSelectionResultRequest build() { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_auction_server_get_ad_selection_data_id_enabled")
        @android.annotation.NonNull
        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionDataId(long p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionId(long p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder setAdSelectionResult(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.PersistAdSelectionResultRequest.Builder setSeller(android.adservices.common.AdTechIdentifier p0) { return null; }
    }
}
