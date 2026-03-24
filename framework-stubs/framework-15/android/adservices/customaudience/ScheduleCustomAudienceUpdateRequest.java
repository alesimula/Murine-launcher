package android.adservices.customaudience;

public final class ScheduleCustomAudienceUpdateRequest {
    ScheduleCustomAudienceUpdateRequest() {}
    @android.annotation.NonNull
    public java.time.Duration getMinDelay() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.customaudience.PartialCustomAudience> getPartialCustomAudienceList() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getUpdateUri() { return null; }
    public boolean shouldReplacePendingUpdates() { return false; }

    public static final class Builder {
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
