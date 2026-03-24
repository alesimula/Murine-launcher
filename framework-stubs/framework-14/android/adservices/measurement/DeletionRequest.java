package android.adservices.measurement;

public class DeletionRequest {
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    DeletionRequest() {}
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getOriginUris() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getDomainUris() { return null; }
    public int getDeletionMode() { return 0; }
    public int getMatchBehavior() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getStart() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getEnd() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setOriginUris(java.util.List<android.net.Uri> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setDomainUris(java.util.List<android.net.Uri> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setMatchBehavior(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setDeletionMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setStart(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest.Builder setEnd(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.measurement.DeletionRequest build() { return null; }
    }
}
