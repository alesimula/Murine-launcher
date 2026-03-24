package android.adservices.customaudience;

@android.annotation.FlaggedApi("com.android.adservices.flags.fledge_schedule_custom_audience_update_enabled")
public final class ScheduleCustomAudienceUpdateRequest {
    ScheduleCustomAudienceUpdateRequest() {}
    @android.annotation.NonNull
    public java.time.Duration getMinDelay() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.customaudience.PartialCustomAudience> getPartialCustomAudienceList() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getUpdateUri() { return null; }
    public boolean shouldReplacePendingUpdates() { return false; }

    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_schedule_custom_audience_update_enabled")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_enable_schedule_custom_audience_default_partial_custom_audiences_constructor")
        public Builder(android.net.Uri p0, java.time.Duration p1) {}
        @java.lang.Deprecated
        public Builder(android.net.Uri p0, java.time.Duration p1, java.util.List<android.adservices.customaudience.PartialCustomAudience> p2) {}
        @android.annotation.NonNull
        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setMinDelay(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setPartialCustomAudienceList(java.util.List<android.adservices.customaudience.PartialCustomAudience> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setShouldReplacePendingUpdates(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.customaudience.ScheduleCustomAudienceUpdateRequest.Builder setUpdateUri(android.net.Uri p0) { return null; }
    }
}
