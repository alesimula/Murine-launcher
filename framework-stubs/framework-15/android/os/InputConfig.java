package android.os;

public @interface InputConfig {
    public static final int DEFAULT = 0;
    public static final int NO_INPUT_CHANNEL = 1;
    public static final int NOT_VISIBLE = 2;
    public static final int NOT_FOCUSABLE = 4;
    public static final int NOT_TOUCHABLE = 8;
    public static final int PREVENT_SPLITTING = 16;
    public static final int DUPLICATE_TOUCH_TO_WALLPAPER = 32;
    public static final int IS_WALLPAPER = 64;
    public static final int PAUSE_DISPATCHING = 128;
    public static final int TRUSTED_OVERLAY = 256;
    public static final int WATCH_OUTSIDE_TOUCH = 512;
    public static final int SLIPPERY = 1024;
    public static final int DISABLE_USER_ACTIVITY = 2048;
    public static final int DROP_INPUT = 4096;
    public static final int DROP_INPUT_IF_OBSCURED = 8192;
    public static final int SPY = 16384;
    public static final int INTERCEPTS_STYLUS = 32768;
    public static final int CLONE = 65536;
    public static final int GLOBAL_STYLUS_BLOCKS_TOUCH = 131072;
    public static final int SENSITIVE_FOR_PRIVACY = 262144;
}
