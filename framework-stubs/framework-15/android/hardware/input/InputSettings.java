package android.hardware.input;

public class InputSettings {
    public static final int MIN_POINTER_SPEED = -7;
    public static final int MAX_POINTER_SPEED = 7;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int DEFAULT_POINTER_SPEED = 0;
    public static final float DEFAULT_MAXIMUM_OBSCURING_OPACITY_FOR_TOUCH = 0.800000011920929f;
    public static final int MAX_ACCESSIBILITY_BOUNCE_KEYS_THRESHOLD_MILLIS = 5000;
    public static final int MAX_ACCESSIBILITY_SLOW_KEYS_THRESHOLD_MILLIS = 5000;
    public static final int DEFAULT_STYLUS_POINTER_ICON_ENABLED = 1;
    @android.annotation.SuppressLint("NonUserGetterCalled")
    public static int getPointerSpeed(android.content.Context p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setPointerSpeed(android.content.Context p0, int p1) {}
    public static float getMaximumObscuringOpacityForTouch(android.content.Context p0) { return 0.0f; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public static void setMaximumObscuringOpacityForTouch(android.content.Context p0, float p1) {}
    public static boolean isStylusEverUsed(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public static void setStylusEverUsed(android.content.Context p0, boolean p1) {}
    public static int getTouchpadPointerSpeed(android.content.Context p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadPointerSpeed(android.content.Context p0, int p1) {}
    public static boolean useTouchpadNaturalScrolling(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadNaturalScrolling(android.content.Context p0, boolean p1) {}
    public static boolean useTouchpadTapToClick(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadTapToClick(android.content.Context p0, boolean p1) {}
    public static boolean isTouchpadTapDraggingFeatureFlagEnabled() { return false; }
    public static boolean useTouchpadTapDragging(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadTapDragging(android.content.Context p0, boolean p1) {}
    public static boolean useTouchpadRightClickZone(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadRightClickZone(android.content.Context p0, boolean p1) {}
    public static boolean isStylusPointerIconEnabled(android.content.Context p0, boolean p1) { return false; }
    public static boolean isStylusPointerIconEnabled(android.content.Context p0) { return false; }
    public static boolean isAccessibilityBounceKeysFeatureEnabled() { return false; }
    public static boolean isAccessibilityBounceKeysEnabled(android.content.Context p0) { return false; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_bounce_keys_flag")
    public static int getAccessibilityBounceKeysThreshold(android.content.Context p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_bounce_keys_flag")
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setAccessibilityBounceKeysThreshold(android.content.Context p0, int p1) {}
    public static boolean isAccessibilitySlowKeysFeatureFlagEnabled() { return false; }
    public static boolean isAccessibilitySlowKeysEnabled(android.content.Context p0) { return false; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_slow_keys_flag")
    public static int getAccessibilitySlowKeysThreshold(android.content.Context p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_slow_keys_flag")
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setAccessibilitySlowKeysThreshold(android.content.Context p0, int p1) {}
    public static boolean isAccessibilityStickyKeysFeatureEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_sticky_keys_flag")
    public static boolean isAccessibilityStickyKeysEnabled(android.content.Context p0) { return false; }
    @android.annotation.FlaggedApi("com.android.hardware.input.keyboard_a11y_sticky_keys_flag")
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setAccessibilityStickyKeysEnabled(android.content.Context p0, boolean p1) {}
}
