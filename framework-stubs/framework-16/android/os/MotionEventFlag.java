package android.os;

public @interface MotionEventFlag {
    public static final int WINDOW_IS_OBSCURED = 1;
    public static final int WINDOW_IS_PARTIALLY_OBSCURED = 2;
    public static final int HOVER_EXIT_PENDING = 4;
    public static final int IS_GENERATED_GESTURE = 8;
    public static final int CANCELED = 32;
    public static final int NO_FOCUS_CHANGE = 64;
    public static final int PRIVATE_FLAG_SUPPORTS_ORIENTATION = 128;
    public static final int PRIVATE_FLAG_SUPPORTS_DIRECTIONAL_ORIENTATION = 256;
    public static final int IS_ACCESSIBILITY_EVENT = 2048;
    public static final int INJECTED_FROM_ACCESSIBILITY_TOOL = 4096;
    public static final int TAINTED = -2147483648;
    public static final int TARGET_ACCESSIBILITY_FOCUS = 1073741824;
}
