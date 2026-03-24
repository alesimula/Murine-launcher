package android.adservices.adselection;

public final class AdSelectionConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.AdSelectionConfig> CREATOR = null;
    AdSelectionConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.adservices.common.AdSelectionSignals getAdSelectionSignals() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.AdTechIdentifier> getCustomAudienceBuyers() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getDecisionLogicUri() { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.adservices.common.AdTechIdentifier, android.adservices.common.AdSelectionSignals> getPerBuyerSignals() { return null; }
    @android.annotation.NonNull
    public java.util.Map<android.adservices.common.AdTechIdentifier, android.adservices.adselection.SignedContextualAds> getPerBuyerSignedContextualAds() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getSeller() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdSelectionSignals getSellerSignals() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getTrustedScoringSignalsUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setAdSelectionSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setCustomAudienceBuyers(java.util.List<android.adservices.common.AdTechIdentifier> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setDecisionLogicUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setPerBuyerSignals(java.util.Map<android.adservices.common.AdTechIdentifier, android.adservices.common.AdSelectionSignals> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setPerBuyerSignedContextualAds(java.util.Map<android.adservices.common.AdTechIdentifier, android.adservices.adselection.SignedContextualAds> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setSeller(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setSellerSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionConfig.Builder setTrustedScoringSignalsUri(android.net.Uri p0) { return null; }
    }
}
