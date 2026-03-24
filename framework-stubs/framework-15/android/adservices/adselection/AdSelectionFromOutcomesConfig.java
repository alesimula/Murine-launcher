package android.adservices.adselection;

public final class AdSelectionFromOutcomesConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.AdSelectionFromOutcomesConfig> CREATOR = null;
    AdSelectionFromOutcomesConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Long> getAdSelectionIds() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getSelectionLogicUri() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdSelectionSignals getSelectionSignals() { return null; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getSeller() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionFromOutcomesConfig build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setAdSelectionIds(java.util.List<java.lang.Long> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionLogicUri(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSelectionSignals(android.adservices.common.AdSelectionSignals p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder setSeller(android.adservices.common.AdTechIdentifier p0) { return null; }
    }
}
