package android.safetycenter.config;

public final class SafetySourcesGroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.config.SafetySourcesGroup> CREATOR = null;
    @java.lang.Deprecated
    public static final int SAFETY_SOURCES_GROUP_TYPE_COLLAPSIBLE = 0;
    public static final int SAFETY_SOURCES_GROUP_TYPE_HIDDEN = 2;
    @java.lang.Deprecated
    public static final int SAFETY_SOURCES_GROUP_TYPE_RIGID = 1;
    public static final int SAFETY_SOURCES_GROUP_TYPE_STATEFUL = 0;
    public static final int SAFETY_SOURCES_GROUP_TYPE_STATELESS = 1;
    public static final int STATELESS_ICON_TYPE_NONE = 0;
    public static final int STATELESS_ICON_TYPE_PRIVACY = 1;
    SafetySourcesGroup() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.config.SafetySource> getSafetySources() { return null; }
    public int getStatelessIconType() { return 0; }
    public int getSummaryResId() { return 0; }
    public int getTitleResId() { return 0; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.safetycenter.config.SafetySourcesGroup p0) {}
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder addSafetySource(android.safetycenter.config.SafetySource p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder setStatelessIconType(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder setSummaryResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder setTitleResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.config.SafetySourcesGroup.Builder setType(int p0) { return null; }
    }
}
