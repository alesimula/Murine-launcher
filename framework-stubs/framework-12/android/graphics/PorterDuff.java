package android.graphics;

public class PorterDuff {
    public PorterDuff() {}
    public static int modeToInt(android.graphics.PorterDuff.Mode p0) { return 0; }
    public static android.graphics.PorterDuff.Mode intToMode(int p0) { return null; }

    public static enum Mode {
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
        DARKEN,
        LIGHTEN,
        MULTIPLY,
        SCREEN,
        ADD,
        OVERLAY;
        public final int nativeInt = 0;
        private Mode() {}
    }
}
