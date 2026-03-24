package android.adservices.adselection;

public class UpdateAdCounterHistogramRequest {
    UpdateAdCounterHistogramRequest() {}
    public int getAdEventType() { return 0; }
    public long getAdSelectionId() { return 0L; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getCallerAdTech() { return null; }

    public static final class Builder {
        public Builder(long p0, int p1, android.adservices.common.AdTechIdentifier p2) {}
        @android.annotation.NonNull
        public android.adservices.adselection.UpdateAdCounterHistogramRequest build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdEventType(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setAdSelectionId(long p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder setCallerAdTech(android.adservices.common.AdTechIdentifier p0) { return null; }
    }
}
