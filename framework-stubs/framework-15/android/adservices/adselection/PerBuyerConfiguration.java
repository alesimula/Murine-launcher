package android.adservices.adselection;

public final class PerBuyerConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.adselection.PerBuyerConfiguration> CREATOR = null;
    PerBuyerConfiguration() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.adservices.common.AdTechIdentifier getBuyer() { return null; }
    public int getTargetInputSizeBytes() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.adselection.PerBuyerConfiguration build() { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.PerBuyerConfiguration.Builder setBuyer(android.adservices.common.AdTechIdentifier p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.adselection.PerBuyerConfiguration.Builder setTargetInputSizeBytes(int p0) { return null; }
    }
}
