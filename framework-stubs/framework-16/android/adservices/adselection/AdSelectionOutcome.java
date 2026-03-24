package android.adservices.adselection;

public class AdSelectionOutcome {
    @android.annotation.NonNull
    public static final android.adservices.adselection.AdSelectionOutcome NO_OUTCOME = null;
    AdSelectionOutcome() {}
    @android.annotation.NonNull
    public long getAdSelectionId() { return 0L; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_enable_custom_audience_component_ads")
    @android.annotation.NonNull
    public java.util.List<android.net.Uri> getComponentAdUris() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getRenderUri() { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_enable_winning_seller_id_in_ad_selection_outcome")
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getWinningSeller() { return null; }
    public boolean hasOutcome() { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome.Builder setAdSelectionId(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_enable_custom_audience_component_ads")
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome.Builder setComponentAdUris(java.util.List<android.net.Uri> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionOutcome.Builder setRenderUri(android.net.Uri p0) { return null; }
    }
}
