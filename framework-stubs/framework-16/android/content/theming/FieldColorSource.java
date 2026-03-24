package android.content.theming;

@android.annotation.FlaggedApi("android.server.enable_theme_service")
public class FieldColorSource extends android.content.theming.ThemeSettingsField<java.lang.String, java.lang.String> {
    public static final java.lang.String VALUE_PRESET = "preset";
    public static final java.lang.String VALUE_HOME_WALLPAPER = "home_wallpaper";
    public static final java.lang.String VALUE_LOCK_WALLPAPER = "lock_wallpaper";
    public FieldColorSource(java.lang.String p0, java.util.function.Function<android.content.theming.ThemeSettingsUpdater, java.lang.String> p1, java.util.function.BiConsumer<android.content.theming.ThemeSettingsUpdater, java.lang.String> p2, java.util.function.Function<android.content.theming.ThemeSettings, java.lang.String> p3, android.content.theming.ThemeSettings p4) { super(null, null, null, null, null); }
    public java.lang.String parse(java.lang.String p0) { return null; }
    public java.lang.String serialize(java.lang.String p0) { return null; }
    public boolean validate(java.lang.String p0) { return false; }
    public java.lang.Class<java.lang.String> getFieldType() { return null; }
    public java.lang.Class<java.lang.String> getJsonType() { return null; }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Type {
    }
}
