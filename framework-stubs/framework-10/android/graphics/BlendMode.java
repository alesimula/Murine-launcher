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
    private static final android.graphics.BlendMode[] BLEND_MODES = null;
    private final android.graphics.Xfermode mXfermode = null;
    public static android.graphics.BlendMode fromValue(int p0) { return null; }
    public static int toValue(android.graphics.BlendMode p0) { return 0; }
    public static android.graphics.PorterDuff.Mode blendModeToPorterDuffMode(android.graphics.BlendMode p0) { return null; }
    private BlendMode() {}
    public android.graphics.Xfermode getXfermode() { return null; }
}
