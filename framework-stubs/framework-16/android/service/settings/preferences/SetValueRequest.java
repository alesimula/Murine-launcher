package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class SetValueRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SetValueRequest> CREATOR = null;
    public java.lang.String getScreenKey() { return null; }
    public java.lang.String getPreferenceKey() { return null; }
    public android.service.settings.preferences.SettingsPreferenceValue getPreferenceValue() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(java.lang.String p0, java.lang.String p1, android.service.settings.preferences.SettingsPreferenceValue p2) {}
        public android.service.settings.preferences.SetValueRequest build() { return null; }
    }
}
