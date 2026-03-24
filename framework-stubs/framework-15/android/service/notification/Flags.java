package android.service.notification;

public final class Flags {
    public static final java.lang.String FLAG_CALLSTYLE_CALLBACK_API = "android.service.notification.callstyle_callback_api";
    public static final java.lang.String FLAG_RANKING_UPDATE_ASHMEM = "android.service.notification.ranking_update_ashmem";
    public static final java.lang.String FLAG_REDACT_SENSITIVE_NOTIFICATIONS_BIG_TEXT_STYLE = "android.service.notification.redact_sensitive_notifications_big_text_style";
    public static final java.lang.String FLAG_REDACT_SENSITIVE_NOTIFICATIONS_FROM_UNTRUSTED_LISTENERS = "android.service.notification.redact_sensitive_notifications_from_untrusted_listeners";
    public Flags() {}
    public static boolean callstyleCallbackApi() { return false; }
    public static boolean rankingUpdateAshmem() { return false; }
    public static boolean redactSensitiveNotificationsBigTextStyle() { return false; }
    public static boolean redactSensitiveNotificationsFromUntrustedListeners() { return false; }
}
