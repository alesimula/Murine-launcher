package android.app;

public class LocaleManager {
    public LocaleManager(android.content.Context p0, android.app.ILocaleManager p1) {}
    public void setApplicationLocales(android.os.LocaleList p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHANGE_CONFIGURATION")
    public void setApplicationLocales(java.lang.String p0, android.os.LocaleList p1) {}
    public android.os.LocaleList getApplicationLocales() { return null; }
    @android.annotation.RequiresPermission(value="android.permission.READ_APP_SPECIFIC_LOCALES", conditional=true)
    public android.os.LocaleList getApplicationLocales(java.lang.String p0) { return null; }
    public android.os.LocaleList getSystemLocales() { return null; }
    public void setSystemLocales(android.os.LocaleList p0) {}
    public void setOverrideLocaleConfig(android.app.LocaleConfig p0) {}
    public android.app.LocaleConfig getOverrideLocaleConfig() { return null; }
}
