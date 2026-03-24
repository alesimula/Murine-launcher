package android.app.timezone;

public final class RulesUpdaterContract {
    public static final java.lang.String TRIGGER_TIME_ZONE_RULES_CHECK_PERMISSION = "android.permission.TRIGGER_TIME_ZONE_RULES_CHECK";
    public static final java.lang.String UPDATE_TIME_ZONE_RULES_PERMISSION = "android.permission.UPDATE_TIME_ZONE_RULES";
    public static final java.lang.String ACTION_TRIGGER_RULES_UPDATE_CHECK = "com.android.intent.action.timezone.TRIGGER_RULES_UPDATE_CHECK";
    public static final java.lang.String EXTRA_CHECK_TOKEN = "com.android.intent.extra.timezone.CHECK_TOKEN";
    public RulesUpdaterContract() {}
    public static android.content.Intent createUpdaterIntent(java.lang.String p0) { return null; }
    public static void sendBroadcast(android.content.Context p0, java.lang.String p1, byte[] p2) {}
}
