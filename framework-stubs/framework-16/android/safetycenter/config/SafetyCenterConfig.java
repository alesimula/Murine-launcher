package android.safetycenter.config;

public final class SafetyCenterConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.config.SafetyCenterConfig> CREATOR = null;
    SafetyCenterConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.config.SafetySourcesGroup> getSafetySourcesGroups() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.safetycenter.config.SafetyCenterConfig p0) {}
        @android.annotation.NonNull
        public android.safetycenter.config.SafetyCenterConfig.Builder addSafetySourcesGroup(android.safetycenter.config.SafetySourcesGroup p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetyCenterConfig build() { return null; }
    }
}
