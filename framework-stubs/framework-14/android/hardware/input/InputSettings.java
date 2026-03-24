package android.hardware.input;

public class InputSettings {
    public static final int MIN_POINTER_SPEED = -7;
    public static final int MAX_POINTER_SPEED = 7;
    public static final int DEFAULT_POINTER_SPEED = 0;
    public static final float DEFAULT_MAXIMUM_OBSCURING_OPACITY_FOR_TOUCH = 0.800000011920929f;
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
    public static boolean useTouchpadRightClickZone(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SETTINGS")
    public static void setTouchpadRightClickZone(android.content.Context p0, boolean p1) {}
    public static boolean isStylusPointerIconEnabled(android.content.Context p0) { return false; }
}
