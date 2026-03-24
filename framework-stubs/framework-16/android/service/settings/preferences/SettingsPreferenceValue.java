package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class SettingsPreferenceValue implements android.os.Parcelable {
    public static final int TYPE_BOOLEAN = 0;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_DOUBLE = 2;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_INT = 4;
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SettingsPreferenceValue> CREATOR = null;
    public int getType() { return 0; }
    public boolean getBooleanValue() { return false; }
    public int getIntValue() { return 0; }
    public long getLongValue() { return 0L; }
    public double getDoubleValue() { return 0.0; }
    public java.lang.String getStringValue() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setBooleanValue(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setIntValue(int p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setLongValue(long p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setDoubleValue(double p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setStringValue(java.lang.String p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
