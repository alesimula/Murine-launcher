package android.adservices.common;

public final class AdFilters implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.AdFilters> CREATOR = null;
    AdFilters() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.adservices.common.AppInstallFilters getAppInstallFilters() { return null; }
    @android.annotation.Nullable
    public android.adservices.common.FrequencyCapFilters getFrequencyCapFilters() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.AdFilters build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdFilters.Builder setAppInstallFilters(android.adservices.common.AppInstallFilters p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdFilters.Builder setFrequencyCapFilters(android.adservices.common.FrequencyCapFilters p0) { return null; }
    }
}
