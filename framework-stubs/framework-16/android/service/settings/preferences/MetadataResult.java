package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class MetadataResult implements android.os.Parcelable {
    public static final int RESULT_OK = 0;
    public static final int RESULT_UNSUPPORTED = 1;
    public static final int RESULT_INTERNAL_ERROR = 2;
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.MetadataResult> CREATOR = null;
    public int getResultCode() { return 0; }
    public java.util.List<android.service.settings.preferences.SettingsPreferenceMetadata> getMetadataList() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(int p0) {}
        public android.service.settings.preferences.MetadataResult.Builder setMetadataList(java.util.List<android.service.settings.preferences.SettingsPreferenceMetadata> p0) { return null; }
        public android.service.settings.preferences.MetadataResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
