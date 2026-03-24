package android.adservices.adselection;

public class ReportEventRequest {
    public static final int FLAG_REPORTING_DESTINATION_BUYER = 2;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = 1;
    ReportEventRequest() {}
    public long getAdSelectionId() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getData() { return null; }
    @android.annotation.Nullable
    public android.view.InputEvent getInputEvent() { return null; }
    @android.annotation.NonNull
    public java.lang.String getKey() { return null; }
    public int getReportingDestinations() { return 0; }

    public static final class Builder {
        public Builder(long p0, java.lang.String p1, java.lang.String p2, int p3) {}
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest.Builder setAdSelectionId(long p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest.Builder setData(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest.Builder setInputEvent(android.view.InputEvent p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest.Builder setKey(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.ReportEventRequest.Builder setReportingDestinations(int p0) { return null; }
    }
}
