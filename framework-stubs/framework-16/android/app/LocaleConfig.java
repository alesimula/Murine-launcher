package android.app;

public class LocaleConfig implements android.os.Parcelable {
    public static final java.lang.String TAG_LOCALE_CONFIG = "locale-config";
    public static final java.lang.String TAG_LOCALE = "locale";
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_NOT_SPECIFIED = 1;
    public static final int STATUS_PARSING_FAILED = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.LocaleConfig> CREATOR = null;
    public LocaleConfig(android.content.Context p0) {}
    @android.annotation.NonNull
    public static android.app.LocaleConfig fromContextIgnoringOverride(android.content.Context p0) { return null; }
    public LocaleConfig(android.content.pm.ApplicationInfo p0, android.content.res.Resources p1) {}
    public LocaleConfig(android.os.LocaleList p0) {}
    @android.annotation.Nullable
    public android.os.LocaleList getSupportedLocales() { return null; }
    @android.annotation.SuppressLint("UseIcu")
    @android.annotation.FlaggedApi("android.content.res.default_locale")
    @android.annotation.Nullable
    public java.util.Locale getDefaultLocale() { return null; }
    public int getStatus() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isSameLocaleConfig(android.app.LocaleConfig p0) { return false; }
    public boolean containsLocale(java.util.Locale p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
