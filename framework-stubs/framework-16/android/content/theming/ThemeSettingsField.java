package android.content.theming;

@android.annotation.FlaggedApi("android.server.enable_theme_service")
public abstract class ThemeSettingsField<T extends java.lang.Object, J extends java.lang.Object> {
    public static final java.lang.String OVERLAY_CATEGORY_ACCENT_COLOR = "android.theme.customization.accent_color";
    public static final java.lang.String OVERLAY_CATEGORY_SYSTEM_PALETTE = "android.theme.customization.system_palette";
    public static final java.lang.String OVERLAY_CATEGORY_THEME_STYLE = "android.theme.customization.theme_style";
    public static final java.lang.String OVERLAY_COLOR_SOURCE = "android.theme.customization.color_source";
    public static final java.lang.String OVERLAY_COLOR_INDEX = "android.theme.customization.color_index";
    public static final java.lang.String OVERLAY_COLOR_BOTH = "android.theme.customization.color_both";
    public final java.lang.String key = null;
    public static android.content.theming.ThemeSettingsField<?, ?>[] getFields(android.content.theming.ThemeSettings p0) { return null; }
    public ThemeSettingsField(java.lang.String p0, java.util.function.Function<android.content.theming.ThemeSettingsUpdater, T> p1, java.util.function.BiConsumer<android.content.theming.ThemeSettingsUpdater, T> p2, java.util.function.Function<android.content.theming.ThemeSettings, T> p3, android.content.theming.ThemeSettings p4) {}
    public void fromJSON(org.json.JSONObject p0, android.content.theming.ThemeSettingsUpdater p1) {}
    public void toJSON(android.content.theming.ThemeSettingsUpdater p0, org.json.JSONObject p1) {}
    public T getDefaultValue() { return null; }
    public abstract T parse(J p0);
    public abstract J serialize(T p0);
    public abstract boolean validate(T p0);
    public abstract java.lang.Class<T> getFieldType();
    public abstract java.lang.Class<J> getJsonType();
}
