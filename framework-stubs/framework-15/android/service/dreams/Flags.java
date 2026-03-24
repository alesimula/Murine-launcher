package android.service.dreams;

public final class Flags {
    public static final java.lang.String FLAG_DISMISS_DREAM_ON_KEYGUARD_DISMISS = "android.service.dreams.dismiss_dream_on_keyguard_dismiss";
    public static final java.lang.String FLAG_DREAM_HANDLES_BEING_OBSCURED = "android.service.dreams.dream_handles_being_obscured";
    public static final java.lang.String FLAG_DREAM_HANDLES_CONFIRM_KEYS = "android.service.dreams.dream_handles_confirm_keys";
    public static final java.lang.String FLAG_DREAM_OVERLAY_HOST = "android.service.dreams.dream_overlay_host";
    public static final java.lang.String FLAG_DREAM_WAKE_REDIRECT = "android.service.dreams.dream_wake_redirect";
    public Flags() {}
    public static boolean dismissDreamOnKeyguardDismiss() { return false; }
    public static boolean dreamHandlesBeingObscured() { return false; }
    public static boolean dreamHandlesConfirmKeys() { return false; }
    public static boolean dreamOverlayHost() { return false; }
    public static boolean dreamWakeRedirect() { return false; }
}
