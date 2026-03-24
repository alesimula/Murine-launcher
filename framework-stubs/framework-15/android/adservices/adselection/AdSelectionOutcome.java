package android.adservices.adselection;

public class AdSelectionOutcome {
    @android.annotation.NonNull
    public static final android.adservices.adselection.AdSelectionOutcome NO_OUTCOME = null;
    AdSelectionOutcome() {}
    @android.annotation.NonNull
    public long getAdSelectionId() { return 0L; }
    @android.annotation.NonNull
    public android.net.Uri getRenderUri() { return null; }
    public boolean hasOutcome() { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome.Builder setAdSelectionId(long p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome.Builder setRenderUri(android.net.Uri p0) { return null; }
    }
}
