package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class GetValueResult implements android.os.Parcelable {
    public static final int RESULT_OK = 0;
    public static final int RESULT_UNSUPPORTED = 1;
    public static final int RESULT_UNAVAILABLE = 2;
    public static final int RESULT_REQUIRE_APP_PERMISSION = 3;
    public static final int RESULT_DISALLOW = 4;
    public static final int RESULT_INVALID_REQUEST = 5;
    public static final int RESULT_INTERNAL_ERROR = 6;
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.GetValueResult> CREATOR = null;
    public int getResultCode() { return 0; }
    public android.service.settings.preferences.SettingsPreferenceValue getValue() { return null; }
    public android.service.settings.preferences.SettingsPreferenceMetadata getMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(int p0) {}
        public android.service.settings.preferences.GetValueResult.Builder setValue(android.service.settings.preferences.SettingsPreferenceValue p0) { return null; }
        public android.service.settings.preferences.GetValueResult.Builder setMetadata(android.service.settings.preferences.SettingsPreferenceMetadata p0) { return null; }
        public android.service.settings.preferences.GetValueResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
