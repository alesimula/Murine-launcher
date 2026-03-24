package android.graphics;

public enum BlendMode {
    CLEAR,
    SRC,
    DST,
    SRC_OVER,
    DST_OVER,
    SRC_IN,
    DST_IN,
    SRC_OUT,
    DST_OUT,
    SRC_ATOP,
    DST_ATOP,
    XOR,
    PLUS,
    MODULATE,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    MULTIPLY,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY;
    @android.annotation.Nullable
    public static android.graphics.BlendMode fromValue(int p0) { return null; }
    public static int toValue(android.graphics.BlendMode p0) { return 0; }
    @android.annotation.Nullable
    public static android.graphics.PorterDuff.Mode blendModeToPorterDuffMode(android.graphics.BlendMode p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.Xfermode getXfermode() { return null; }
}
