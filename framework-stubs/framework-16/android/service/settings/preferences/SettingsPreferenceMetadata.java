package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class SettingsPreferenceMetadata implements android.os.Parcelable {
    public static final int NO_SENSITIVITY = 0;
    public static final int EXPECT_POST_CONFIRMATION = 1;
    public static final int DEEPLINK_ONLY = 2;
    public static final int NO_DIRECT_ACCESS = 3;
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SettingsPreferenceMetadata> CREATOR = null;
    public java.lang.String getKey() { return null; }
    public java.lang.String getScreenKey() { return null; }
    public java.lang.String getTitle() { return null; }
    public java.lang.String getSummary() { return null; }
    public java.util.List<java.lang.String> getBreadcrumbs() { return null; }
    public java.util.List<java.lang.String> getReadPermissions() { return null; }
    public java.util.List<java.lang.String> getWritePermissions() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isAvailable() { return false; }
    public boolean isWritable() { return false; }
    public boolean isRestricted() { return false; }
    public int getWriteSensitivity() { return 0; }
    @android.annotation.SuppressLint("IntentBuilderName")
    public android.content.Intent getLaunchIntent() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setTitle(java.lang.String p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setSummary(java.lang.String p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setBreadcrumbs(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setReadPermissions(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWritePermissions(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setEnabled(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setAvailable(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWritable(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setRestricted(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWriteSensitivity(int p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setLaunchIntent(android.content.Intent p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WriteSensitivity {
    }
}
