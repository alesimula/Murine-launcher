package android.adservices.common;

@android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
public final class UpdateAdServicesModuleStatesParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.UpdateAdServicesModuleStatesParams> CREATOR = null;
    UpdateAdServicesModuleStatesParams() {}
    public int describeContents() { return 0; }
    public int getModuleState(int p0) { return 0; }
    public int getNotificationType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdServicesModuleStatesParams build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdServicesModuleStatesParams.Builder setModuleState(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.UpdateAdServicesModuleStatesParams.Builder setNotificationType(int p0) { return null; }
    }
}
