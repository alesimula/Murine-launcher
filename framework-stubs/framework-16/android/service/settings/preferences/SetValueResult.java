package android.service.settings.preferences;

@android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
public final class SetValueResult implements android.os.Parcelable {
    public static final int RESULT_OK = 0;
    public static final int RESULT_UNSUPPORTED = 1;
    public static final int RESULT_DISABLED = 2;
    public static final int RESULT_RESTRICTED = 3;
    public static final int RESULT_UNAVAILABLE = 4;
    public static final int RESULT_REQUIRE_APP_PERMISSION = 5;
    public static final int RESULT_REQUIRE_USER_CONSENT = 6;
    public static final int RESULT_DISALLOW = 7;
    public static final int RESULT_INVALID_REQUEST = 8;
    public static final int RESULT_INTERNAL_ERROR = 9;
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SetValueResult> CREATOR = null;
    public int getResultCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.FlaggedApi("com.android.settingslib.flags.settings_catalyst")
    public static final class Builder {
        public Builder(int p0) {}
        public android.service.settings.preferences.SetValueResult build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
