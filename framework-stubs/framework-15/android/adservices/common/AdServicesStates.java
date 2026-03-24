package android.adservices.common;

public final class AdServicesStates implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.AdServicesStates> CREATOR = null;
    AdServicesStates() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public boolean isAdIdEnabled() { return false; }
    @android.annotation.NonNull
    public boolean isAdultAccount() { return false; }
    @android.annotation.NonNull
    public boolean isPrivacySandboxUiEnabled() { return false; }
    @android.annotation.NonNull
    public boolean isPrivacySandboxUiRequest() { return false; }
    @android.annotation.NonNull
    public boolean isU18Account() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates.Builder setAdIdEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates.Builder setAdultAccount(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates.Builder setPrivacySandboxUiEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates.Builder setPrivacySandboxUiRequest(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.AdServicesStates.Builder setU18Account(boolean p0) { return null; }
    }
}
