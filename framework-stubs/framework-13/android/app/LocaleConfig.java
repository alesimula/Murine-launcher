package android.app;

public class LocaleConfig {
    public static final java.lang.String TAG_LOCALE_CONFIG = "locale-config";
    public static final java.lang.String TAG_LOCALE = "locale";
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_NOT_SPECIFIED = 1;
    public static final int STATUS_PARSING_FAILED = 2;
    public LocaleConfig(android.content.Context p0) {}
    public android.os.LocaleList getSupportedLocales() { return null; }
    public int getStatus() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
