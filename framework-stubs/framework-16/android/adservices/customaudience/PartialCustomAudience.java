package android.adservices.customaudience;

@android.annotation.FlaggedApi("com.android.adservices.flags.fledge_schedule_custom_audience_update_enabled")
public final class PartialCustomAudience implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.customaudience.PartialCustomAudience> CREATOR = null;
    PartialCustomAudience() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.time.Instant getActivationTime() { return null; }
    @android.annotation.Nullable
    public java.time.Instant getExpirationTime() { return null; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.AdSelectionSignals getUserBiddingSignals() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.adservices.customaudience.PartialCustomAudience build() { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.PartialCustomAudience.Builder setActivationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.PartialCustomAudience.Builder setExpirationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.PartialCustomAudience.Builder setUserBiddingSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
    }
}
