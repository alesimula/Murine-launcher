package android.adservices.customaudience;

public final class FetchAndJoinCustomAudienceRequest {
    FetchAndJoinCustomAudienceRequest() {}
    @android.annotation.Nullable
    public java.time.Instant getActivationTime() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getExpirationTime() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getFetchUri() { return null; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdSelectionSignals getUserBiddingSignals() { return null; }

    public static final class Builder {
        public Builder(android.net.Uri p0) {}
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setActivationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setExpirationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setFetchUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.FetchAndJoinCustomAudienceRequest.Builder setUserBiddingSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
    }
}
