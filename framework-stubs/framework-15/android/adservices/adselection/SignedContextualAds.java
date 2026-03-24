package android.adservices.adselection;

public final class SignedContextualAds implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.SignedContextualAds> CREATOR = null;
    SignedContextualAds() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.adselection.AdWithBid> getAdsWithBid() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getBuyer() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getDecisionLogicUri() { return null; }
    @android.annotation.NonNull
    public byte[] getSignature() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.adservices.adselection.SignedContextualAds p0) {}
        @android.annotation.NonNull
        public android.adservices.adselection.SignedContextualAds build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SignedContextualAds.Builder setAdsWithBid(java.util.List<android.adservices.adselection.AdWithBid> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SignedContextualAds.Builder setBuyer(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SignedContextualAds.Builder setDecisionLogicUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.SignedContextualAds.Builder setSignature(byte[] p0) { return null; }
    }
}
