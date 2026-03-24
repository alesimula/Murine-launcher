package android.service.notification;

public final class SystemZenRules {
    public static final java.lang.String PACKAGE_ANDROID = "android";
    public static void maybeUpgradeRules(android.content.Context p0, android.service.notification.ZenModeConfig p1) {}
    public static boolean isSystemOwnedRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    public static boolean updateTriggerDescription(android.content.Context p0, android.service.notification.ZenModeConfig.ZenRule p1) { return false; }
    @android.annotation.Nullable
    public static java.lang.String getTriggerDescriptionForScheduleTime(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    @android.annotation.Nullable
    public static java.lang.String getDaysOfWeekShort(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    @android.annotation.Nullable
    public static java.lang.String getDaysOfWeekFull(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    public static java.lang.String getTimeSummary(android.content.Context p0, android.service.notification.ZenModeConfig.ScheduleInfo p1) { return null; }
    public static java.lang.String getTriggerDescriptionForScheduleEvent(android.content.Context p0, android.service.notification.ZenModeConfig.EventInfo p1) { return null; }
}
