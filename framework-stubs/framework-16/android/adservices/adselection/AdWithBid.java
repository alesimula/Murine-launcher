package android.adservices.adselection;

@android.annotation.FlaggedApi("com.android.adservices.flags.fledge_ad_selection_filtering_enabled")
public final class AdWithBid implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.AdWithBid> CREATOR = null;
    public AdWithBid(android.adservices.common.AdData p0, double p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.adservices.common.AdData getAdData() { return null; }
    public double getBid() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
