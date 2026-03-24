package android.service.notification;

public class ZenModeConfig implements android.os.Parcelable {
    private static java.lang.String TAG;
    public static final int SOURCE_ANYONE = 0;
    public static final int SOURCE_CONTACT = 1;
    public static final int SOURCE_STAR = 2;
    public static final int MAX_SOURCE = 2;
    private static final int DEFAULT_SOURCE = 1;
    private static final int DEFAULT_CALLS_SOURCE = 2;
    public static final java.lang.String EVENTS_DEFAULT_RULE_ID = "EVENTS_DEFAULT_RULE";
    public static final java.lang.String EVERY_NIGHT_DEFAULT_RULE_ID = "EVERY_NIGHT_DEFAULT_RULE";
    public static final java.util.List<java.lang.String> DEFAULT_RULE_IDS = null;
    public static final int[] ALL_DAYS = null;
    public static final int[] MINUTE_BUCKETS = null;
    private static final int SECONDS_MS = 1000;
    private static final int MINUTES_MS = 60000;
    private static final int DAY_MINUTES = 1440;
    private static final int ZERO_VALUE_MS = 10000;
    private static final boolean DEFAULT_ALLOW_ALARMS = true;
    private static final boolean DEFAULT_ALLOW_MEDIA = true;
    private static final boolean DEFAULT_ALLOW_SYSTEM = false;
    private static final boolean DEFAULT_ALLOW_CALLS = true;
    private static final boolean DEFAULT_ALLOW_MESSAGES = false;
    private static final boolean DEFAULT_ALLOW_REMINDERS = false;
    private static final boolean DEFAULT_ALLOW_EVENTS = false;
    private static final boolean DEFAULT_ALLOW_REPEAT_CALLERS = true;
    private static final boolean DEFAULT_CHANNELS_BYPASSING_DND = false;
    private static final int DEFAULT_SUPPRESSED_VISUAL_EFFECTS = 0;
    public static final int XML_VERSION = 8;
    public static final java.lang.String ZEN_TAG = "zen";
    private static final java.lang.String ZEN_ATT_VERSION = "version";
    private static final java.lang.String ZEN_ATT_USER = "user";
    private static final java.lang.String ALLOW_TAG = "allow";
    private static final java.lang.String ALLOW_ATT_ALARMS = "alarms";
    private static final java.lang.String ALLOW_ATT_MEDIA = "media";
    private static final java.lang.String ALLOW_ATT_SYSTEM = "system";
    private static final java.lang.String ALLOW_ATT_CALLS = "calls";
    private static final java.lang.String ALLOW_ATT_REPEAT_CALLERS = "repeatCallers";
    private static final java.lang.String ALLOW_ATT_MESSAGES = "messages";
    private static final java.lang.String ALLOW_ATT_FROM = "from";
    private static final java.lang.String ALLOW_ATT_CALLS_FROM = "callsFrom";
    private static final java.lang.String ALLOW_ATT_MESSAGES_FROM = "messagesFrom";
    private static final java.lang.String ALLOW_ATT_REMINDERS = "reminders";
    private static final java.lang.String ALLOW_ATT_EVENTS = "events";
    private static final java.lang.String ALLOW_ATT_SCREEN_OFF = "visualScreenOff";
    private static final java.lang.String ALLOW_ATT_SCREEN_ON = "visualScreenOn";
    private static final java.lang.String DISALLOW_TAG = "disallow";
    private static final java.lang.String DISALLOW_ATT_VISUAL_EFFECTS = "visualEffects";
    private static final java.lang.String STATE_TAG = "state";
    private static final java.lang.String STATE_ATT_CHANNELS_BYPASSING_DND = "areChannelsBypassingDnd";
    private static final java.lang.String SHOW_ATT_FULL_SCREEN_INTENT = "showFullScreenIntent";
    private static final java.lang.String SHOW_ATT_LIGHTS = "showLights";
    private static final java.lang.String SHOW_ATT_PEEK = "shoePeek";
    private static final java.lang.String SHOW_ATT_STATUS_BAR_ICONS = "showStatusBarIcons";
    private static final java.lang.String SHOW_ATT_BADGES = "showBadges";
    private static final java.lang.String SHOW_ATT_AMBIENT = "showAmbient";
    private static final java.lang.String SHOW_ATT_NOTIFICATION_LIST = "showNotificationList";
    private static final java.lang.String CONDITION_ATT_ID = "id";
    private static final java.lang.String CONDITION_ATT_SUMMARY = "summary";
    private static final java.lang.String CONDITION_ATT_LINE1 = "line1";
    private static final java.lang.String CONDITION_ATT_LINE2 = "line2";
    private static final java.lang.String CONDITION_ATT_ICON = "icon";
    private static final java.lang.String CONDITION_ATT_STATE = "state";
    private static final java.lang.String CONDITION_ATT_FLAGS = "flags";
    private static final java.lang.String ZEN_POLICY_TAG = "zen_policy";
    private static final java.lang.String MANUAL_TAG = "manual";
    private static final java.lang.String AUTOMATIC_TAG = "automatic";
    private static final java.lang.String RULE_ATT_ID = "ruleId";
    private static final java.lang.String RULE_ATT_ENABLED = "enabled";
    private static final java.lang.String RULE_ATT_SNOOZING = "snoozing";
    private static final java.lang.String RULE_ATT_NAME = "name";
    private static final java.lang.String RULE_ATT_COMPONENT = "component";
    private static final java.lang.String RULE_ATT_CONFIG_ACTIVITY = "configActivity";
    private static final java.lang.String RULE_ATT_ZEN = "zen";
    private static final java.lang.String RULE_ATT_CONDITION_ID = "conditionId";
    private static final java.lang.String RULE_ATT_CREATION_TIME = "creationTime";
    private static final java.lang.String RULE_ATT_ENABLER = "enabler";
    private static final java.lang.String RULE_ATT_MODIFIED = "modified";
    @android.annotation.UnsupportedAppUsage
    public boolean allowAlarms;
    public boolean allowMedia;
    public boolean allowSystem;
    public boolean allowCalls;
    public boolean allowRepeatCallers;
    public boolean allowMessages;
    public boolean allowReminders;
    public boolean allowEvents;
    public int allowCallsFrom;
    public int allowMessagesFrom;
    public int user;
    public int suppressedVisualEffects;
    public boolean areChannelsBypassingDnd;
    public int version;
    public android.service.notification.ZenModeConfig.ZenRule manualRule;
    @android.annotation.UnsupportedAppUsage
    public android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> automaticRules;
    public static final android.os.Parcelable.Creator<android.service.notification.ZenModeConfig> CREATOR = null;
    public static final java.lang.String SYSTEM_AUTHORITY = "android";
    public static final java.lang.String COUNTDOWN_PATH = "countdown";
    public static final java.lang.String IS_ALARM_PATH = "alarm";
    public static final java.lang.String SCHEDULE_PATH = "schedule";
    public static final java.lang.String EVENT_PATH = "event";
    @android.annotation.UnsupportedAppUsage
    public ZenModeConfig() {}
    public ZenModeConfig(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private java.lang.String rulesToString() { return null; }
    public android.service.notification.ZenModeConfig.Diff diff(android.service.notification.ZenModeConfig p0) { return null; }
    public static android.service.notification.ZenModeConfig.Diff diff(android.service.notification.ZenModeConfig p0, android.service.notification.ZenModeConfig p1) { return null; }
    private static <T extends java.lang.Object> void addKeys(android.util.ArraySet<T> p0, android.util.ArrayMap<T, ?> p1) {}
    public boolean isValid() { return false; }
    private static boolean isValidManualRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    private static boolean isValidAutomaticRule(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    private static boolean sameCondition(android.service.notification.ZenModeConfig.ZenRule p0) { return false; }
    private static int[] generateMinuteBuckets() { return null; }
    public static java.lang.String sourceToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private static java.lang.String toDayList(int[] p0) { return null; }
    private static int[] tryParseDayList(java.lang.String p0, java.lang.String p1) { return null; }
    private static int tryParseInt(java.lang.String p0, int p1) { return 0; }
    private static long tryParseLong(java.lang.String p0, long p1) { return 0L; }
    private static java.lang.Long tryParseLong(java.lang.String p0, java.lang.Long p1) { return null; }
    public static android.service.notification.ZenModeConfig readXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void writeXml(org.xmlpull.v1.XmlSerializer p0, java.lang.Integer p1) throws java.io.IOException {}
    public static android.service.notification.ZenModeConfig.ZenRule readRuleXml(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public static void writeRuleXml(android.service.notification.ZenModeConfig.ZenRule p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
    public static android.service.notification.Condition readConditionXml(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public static void writeConditionXml(android.service.notification.Condition p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
    public static android.service.notification.ZenPolicy readZenPolicyXml(org.xmlpull.v1.XmlPullParser p0) { return null; }
    public static void writeZenPolicyXml(android.service.notification.ZenPolicy p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
    private static void writeZenPolicyState(java.lang.String p0, int p1, org.xmlpull.v1.XmlSerializer p2) throws java.io.IOException {}
    public static boolean isValidHour(int p0) { return false; }
    public static boolean isValidMinute(int p0) { return false; }
    private static boolean isValidSource(int p0) { return false; }
    private static java.lang.Boolean unsafeBoolean(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    private static boolean safeBoolean(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    private static boolean safeBoolean(java.lang.String p0, boolean p1) { return false; }
    private static int safeInt(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    private static android.content.ComponentName safeComponentName(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    private static android.net.Uri safeUri(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    private static long safeLong(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, long p2) { return 0L; }
    public int describeContents() { return 0; }
    public android.service.notification.ZenModeConfig copy() { return null; }
    public android.app.NotificationManager.Policy toNotificationPolicy(android.service.notification.ZenPolicy p0) { return null; }
    private boolean isPriorityCategoryEnabled(int p0, android.app.NotificationManager.Policy p1) { return false; }
    private boolean isVisualEffectAllowed(int p0, android.app.NotificationManager.Policy p1) { return false; }
    private int getNotificationPolicySenders(int p0, int p1) { return 0; }
    public static int getZenPolicySenders(int p0) { return 0; }
    public android.app.NotificationManager.Policy toNotificationPolicy() { return null; }
    public static android.service.notification.ScheduleCalendar toScheduleCalendar(android.net.Uri p0) { return null; }
    private static int sourceToPrioritySenders(int p0, int p1) { return 0; }
    private static int prioritySendersToSource(int p0, int p1) { return 0; }
    public void applyNotificationPolicy(android.app.NotificationManager.Policy p0) {}
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, int p1, int p2) { return null; }
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, int p1, int p2, boolean p3) { return null; }
    public static android.service.notification.Condition toTimeCondition(android.content.Context p0, long p1, int p2, int p3, boolean p4) { return null; }
    public static android.service.notification.Condition toNextAlarmCondition(android.content.Context p0, long p1, int p2) { return null; }
    public static java.lang.CharSequence getFormattedTime(android.content.Context p0, long p1, boolean p2, int p3) { return null; }
    public static boolean isToday(long p0) { return false; }
    public static android.net.Uri toCountdownConditionId(long p0, boolean p1) { return null; }
    public static long tryParseCountdownConditionId(android.net.Uri p0) { return 0L; }
    public static boolean isValidCountdownConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidCountdownToAlarmConditionId(android.net.Uri p0) { return false; }
    public static android.net.Uri toScheduleConditionId(android.service.notification.ZenModeConfig.ScheduleInfo p0) { return null; }
    public static boolean isValidScheduleConditionId(android.net.Uri p0) { return false; }
    public static boolean isValidScheduleConditionId(android.net.Uri p0, boolean p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static android.service.notification.ZenModeConfig.ScheduleInfo tryParseScheduleConditionId(android.net.Uri p0) { return null; }
    public static android.content.ComponentName getScheduleConditionProvider() { return null; }
    public static android.net.Uri toEventConditionId(android.service.notification.ZenModeConfig.EventInfo p0) { return null; }
    public static boolean isValidEventConditionId(android.net.Uri p0) { return false; }
    public static android.service.notification.ZenModeConfig.EventInfo tryParseEventConditionId(android.net.Uri p0) { return null; }
    public static android.content.ComponentName getEventConditionProvider() { return null; }
    private static int[] tryParseHourAndMinute(java.lang.String p0) { return null; }
    private static int tryParseZenMode(java.lang.String p0, int p1) { return 0; }
    public static java.lang.String newRuleId() { return null; }
    public static java.lang.String getOwnerCaption(android.content.Context p0, java.lang.String p1) { return null; }
    public static java.lang.String getConditionSummary(android.content.Context p0, android.service.notification.ZenModeConfig p1, int p2, boolean p3) { return null; }
    private static java.lang.String getConditionLine(android.content.Context p0, android.service.notification.ZenModeConfig p1, int p2, boolean p3, boolean p4) { return null; }
    public static boolean areAllPriorityOnlyNotificationZenSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static boolean areAllZenBehaviorSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static boolean isZenOverridingRinger(int p0, android.app.NotificationManager.Policy p1) { return false; }
    public static boolean areAllPriorityOnlyNotificationZenSoundsMuted(android.service.notification.ZenModeConfig p0) { return false; }
    public static boolean areAllZenBehaviorSoundsMuted(android.service.notification.ZenModeConfig p0) { return false; }
    public static java.lang.String getDescription(android.content.Context p0, boolean p1, android.service.notification.ZenModeConfig p2, boolean p3) { return null; }
    private static long parseAutomaticRuleEndTime(android.content.Context p0, android.net.Uri p1) { return 0L; }
    private static long getNextAlarm(android.content.Context p0) { return 0L; }

    public static class ZenRule implements android.os.Parcelable {
        @android.annotation.UnsupportedAppUsage
        public boolean enabled;
        @android.annotation.UnsupportedAppUsage
        public boolean snoozing;
        @android.annotation.UnsupportedAppUsage
        public java.lang.String name;
        @android.annotation.UnsupportedAppUsage
        public int zenMode;
        @android.annotation.UnsupportedAppUsage
        public android.net.Uri conditionId;
        public android.service.notification.Condition condition;
        public android.content.ComponentName component;
        public android.content.ComponentName configurationActivity;
        public java.lang.String id;
        @android.annotation.UnsupportedAppUsage
        public long creationTime;
        public java.lang.String enabler;
        public android.service.notification.ZenPolicy zenPolicy;
        public boolean modified;
        public java.lang.String pkg;
        public static final android.os.Parcelable.Creator<android.service.notification.ZenModeConfig.ZenRule> CREATOR = null;
        public ZenRule() {}
        public ZenRule(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
        private static void appendDiff(android.service.notification.ZenModeConfig.Diff p0, java.lang.String p1, android.service.notification.ZenModeConfig.ZenRule p2, android.service.notification.ZenModeConfig.ZenRule p3) {}
        private void appendDiff(android.service.notification.ZenModeConfig.Diff p0, java.lang.String p1, android.service.notification.ZenModeConfig.ZenRule p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isAutomaticActive() { return false; }
        public boolean isTrueOrUnknown() { return false; }
    }

    public static class ScheduleInfo {
        @android.annotation.UnsupportedAppUsage
        public int[] days;
        @android.annotation.UnsupportedAppUsage
        public int startHour;
        @android.annotation.UnsupportedAppUsage
        public int startMinute;
        @android.annotation.UnsupportedAppUsage
        public int endHour;
        @android.annotation.UnsupportedAppUsage
        public int endMinute;
        public boolean exitAtAlarm;
        public long nextAlarm;
        public ScheduleInfo() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.service.notification.ZenModeConfig.ScheduleInfo copy() { return null; }
        public java.lang.String toString() { return null; }
        protected static java.lang.String ts(long p0) { return null; }
    }

    public static class EventInfo {
        public static final int REPLY_ANY_EXCEPT_NO = 0;
        public static final int REPLY_YES_OR_MAYBE = 1;
        public static final int REPLY_YES = 2;
        public int userId;
        public java.lang.String calName;
        public java.lang.Long calendarId;
        public int reply;
        public EventInfo() {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.service.notification.ZenModeConfig.EventInfo copy() { return null; }
        public static int resolveUserId(int p0) { return 0; }
    }

    public static class Diff {
        private final java.util.ArrayList<java.lang.String> lines = null;
        public Diff() {}
        public java.lang.String toString() { return null; }
        private android.service.notification.ZenModeConfig.Diff addLine(java.lang.String p0, java.lang.String p1) { return null; }
        public android.service.notification.ZenModeConfig.Diff addLine(java.lang.String p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3) { return null; }
        public android.service.notification.ZenModeConfig.Diff addLine(java.lang.String p0, java.lang.Object p1, java.lang.Object p2) { return null; }
    }
}
