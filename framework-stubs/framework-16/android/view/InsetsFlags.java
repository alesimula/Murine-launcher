package android.view;

public class InsetsFlags {
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="OPAQUE_STATUS_BARS"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="OPAQUE_NAVIGATION_BARS"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="LOW_PROFILE_BARS"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="LIGHT_STATUS_BARS"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="LIGHT_NAVIGATION_BARS"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="SEMI_TRANSPARENT_STATUS_BARS"), @android.view.ViewDebug.FlagToString(mask=64, equals=64, name="SEMI_TRANSPARENT_NAVIGATION_BARS"), @android.view.ViewDebug.FlagToString(mask=512, equals=512, name="FORCE_LIGHT_NAVIGATION_BARS"), @android.view.ViewDebug.FlagToString(mask=128, equals=128, name="APPEARANCE_TRANSPARENT_CAPTION_BAR_BACKGROUND"), @android.view.ViewDebug.FlagToString(mask=256, equals=256, name="APPEARANCE_LIGHT_CAPTION_BARS")})
    public int appearance;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="DEFAULT"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="SHOW_TRANSIENT_BARS_BY_SWIPE")})
    public int behavior;
    public InsetsFlags() {}
}
