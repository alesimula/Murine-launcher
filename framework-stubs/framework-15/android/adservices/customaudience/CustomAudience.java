package android.adservices.customaudience;

public final class CustomAudience implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.customaudience.CustomAudience> CREATOR = null;
    public static final int FLAG_AUCTION_SERVER_REQUEST_OMIT_ADS = 1;
    CustomAudience() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.time.Instant getActivationTime() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.AdData> getAds() { return null; }
    public int getAuctionServerRequestFlags() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getBiddingLogicUri() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getBuyer() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getDailyUpdateUri() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getExpirationTime() { return null; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public double getPriority() { return 0.0; }
    @android.annotation.Nullable
    public android.adservices.customaudience.TrustedBiddingData getTrustedBiddingData() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdSelectionSignals getUserBiddingSignals() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience build() { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setActivationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setAds(java.util.List<android.adservices.common.AdData> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setAuctionServerRequestFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setBiddingLogicUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setBuyer(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setDailyUpdateUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setExpirationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setPriority(double p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setTrustedBiddingData(android.adservices.customaudience.TrustedBiddingData p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.CustomAudience.Builder setUserBiddingSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
    }
}
