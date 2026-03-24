package android.adservices.adselection;

public final class GetAdSelectionDataOutcome {
    GetAdSelectionDataOutcome() {}
    @android.annotation.Nullable
    public byte[] getAdSelectionData() { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.fledge_auction_server_get_ad_selection_data_id_enabled")
    public long getAdSelectionDataId() { return 0L; }
    @java.lang.Deprecated
    public long getAdSelectionId() { return 0L; }
}
