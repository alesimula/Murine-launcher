package android.os.vibrator;

public final class Flags {
    public static final java.lang.String FLAG_ADAPTIVE_HAPTICS_ENABLED = "android.os.vibrator.adaptive_haptics_enabled";
    public static final java.lang.String FLAG_HAPTIC_FEEDBACK_VIBRATION_OEM_CUSTOMIZATION_ENABLED = "android.os.vibrator.haptic_feedback_vibration_oem_customization_enabled";
    public static final java.lang.String FLAG_KEYBOARD_CATEGORY_ENABLED = "android.os.vibrator.keyboard_category_enabled";
    public static final java.lang.String FLAG_USE_VIBRATOR_HAPTIC_FEEDBACK = "android.os.vibrator.use_vibrator_haptic_feedback";
    public Flags() {}
    public static boolean adaptiveHapticsEnabled() { return false; }
    public static boolean hapticFeedbackVibrationOemCustomizationEnabled() { return false; }
    public static boolean keyboardCategoryEnabled() { return false; }
    public static boolean useVibratorHapticFeedback() { return false; }
}
