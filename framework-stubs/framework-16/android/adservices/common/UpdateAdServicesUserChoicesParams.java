package android.adservices.common;

@android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
public final class UpdateAdServicesUserChoicesParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.UpdateAdServicesUserChoicesParams> CREATOR = null;
    UpdateAdServicesUserChoicesParams() {}
    public int describeContents() { return 0; }
    public int getUserChoice(int p0) { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdServicesUserChoicesParams build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdServicesUserChoicesParams.Builder setUserChoice(int p0, int p1) { return null; }
    }
}
