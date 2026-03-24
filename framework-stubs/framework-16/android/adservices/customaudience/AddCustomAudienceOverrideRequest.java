package android.adservices.customaudience;

public class AddCustomAudienceOverrideRequest {
    public AddCustomAudienceOverrideRequest(android.adservices.common.AdTechIdentifier p0, java.lang.String p1, java.lang.String p2, android.adservices.common.AdSelectionSignals p3) {}
    @android.annotation.NonNull
    public java.lang.String getBiddingLogicJs() { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_ad_selection_filtering_enabled")
    public long getBiddingLogicJsVersion() { return 0L; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getBuyer() { return null; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdSelectionSignals getTrustedBiddingSignals() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJs(java.lang.String p0) { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_ad_selection_filtering_enabled")
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBiddingLogicJsVersion(long p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setBuyer(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.AddCustomAudienceOverrideRequest.Builder setTrustedBiddingSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
    }
}
