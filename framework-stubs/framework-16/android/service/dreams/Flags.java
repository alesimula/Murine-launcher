package android.service.dreams;

public final class Flags {
    public static final java.lang.String FLAG_ALLOW_DREAM_WHEN_POSTURED = "android.service.dreams.allow_dream_when_postured";
    public static final java.lang.String FLAG_ALLOW_DREAM_WITH_CHARGE_LIMIT = "android.service.dreams.allow_dream_with_charge_limit";
    public static final java.lang.String FLAG_CLEANUP_DREAM_SETTINGS_ON_UNINSTALL = "android.service.dreams.cleanup_dream_settings_on_uninstall";
    public static final java.lang.String FLAG_DISMISS_DREAM_ON_KEYGUARD_DISMISS = "android.service.dreams.dismiss_dream_on_keyguard_dismiss";
    public static final java.lang.String FLAG_DREAM_HANDLES_BEING_OBSCURED = "android.service.dreams.dream_handles_being_obscured";
    public static final java.lang.String FLAG_DREAM_HANDLES_CONFIRM_KEYS = "android.service.dreams.dream_handles_confirm_keys";
    public static final java.lang.String FLAG_DREAM_OVERLAY_HOST = "android.service.dreams.dream_overlay_host";
    public static final java.lang.String FLAG_DREAM_WAKE_REDIRECT = "android.service.dreams.dream_wake_redirect";
    public static final java.lang.String FLAG_DREAMS_V2 = "android.service.dreams.dreams_v2";
    public static final java.lang.String FLAG_DREAMS_V2_RESOURCES = "android.service.dreams.dreams_v2_resources";
    public static final java.lang.String FLAG_PUBLISH_PREVIEW_STATE_TO_OVERLAY = "android.service.dreams.publish_preview_state_to_overlay";
    public static final java.lang.String FLAG_START_AND_STOP_DOZING_IN_BACKGROUND = "android.service.dreams.start_and_stop_dozing_in_background";
    public Flags() {}
    public static boolean allowDreamWhenPostured() { return false; }
    public static boolean allowDreamWithChargeLimit() { return false; }
    public static boolean cleanupDreamSettingsOnUninstall() { return false; }
    public static boolean dismissDreamOnKeyguardDismiss() { return false; }
    public static boolean dreamHandlesBeingObscured() { return false; }
    public static boolean dreamHandlesConfirmKeys() { return false; }
    public static boolean dreamOverlayHost() { return false; }
    public static boolean dreamWakeRedirect() { return false; }
    public static boolean dreamsV2() { return false; }
    public static boolean dreamsV2Resources() { return false; }
    public static boolean publishPreviewStateToOverlay() { return false; }
    public static boolean startAndStopDozingInBackground() { return false; }
}
