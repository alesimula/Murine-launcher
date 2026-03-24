package android.service.notification;

public class ZenModeConfig implements android.os.Parcelable {
    public static final int SOURCE_ANYONE = 0;
    public static final int SOURCE_CONTACT = 1;
    public static final int SOURCE_STAR = 2;
    public static final int MAX_SOURCE = 2;
    public static final java.lang.String MANUAL_RULE_ID = "MANUAL_RULE";
    public static final java.lang.String EVENTS_DEFAULT_RULE_ID = "EVENTS_DEFAULT_RULE";
    public static final java.lang.String EVERY_NIGHT_DEFAULT_RULE_ID = "EVERY_NIGHT_DEFAULT_RULE";
    public static final java.util.List<java.lang.String> DEFAULT_RULE_IDS = null;
    public static final int[] ALL_DAYS = null;
    public static final int[] MINUTE_BUCKETS = null;
    public static final int XML_VERSION = 8;
    public static final java.lang.String ZEN_TAG = "zen";
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
    public boolean allowConversations;
    public int allowConversationsFrom;
    public int user;
    public int suppressedVisualEffects;
    public boolean areChannelsBypassingDnd;
    public int version;
    public android.service.notification.ZenModeConfig.ZenRule manualRule;
    public android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeConfig.ZenRule> automaticRules;
    public static final android.os.Parcelable.Creator<android.service.notification.ZenModeConfig> CREATOR = null;
    public static final java.lang.String SYSTEM_AUTHORITY = "android";
    public static final java.lang.String COUNTDOWN_PATH = "countdown";
    public static final java.lang.String IS_ALARM_PATH = "alarm";
    public static final java.lang.String SCHEDULE_PATH = "schedule";
    public static final java.lang.String EVENT_PATH = "event";
    public ZenModeConfig() {}
    public ZenModeConfig(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean isValid() { return false; }
    public static java.lang.String sourceToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static android.service.notification.ZenModeConfig readXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.Integer p1) throws java.io.IOException {}
    public static android.service.notification.ZenModeConfig.ZenRule readRuleXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public static void writeRuleXml(android.service.notification.ZenModeConfig.ZenRule p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    public static android.service.notification.Condition readConditionXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public static void writeConditionXml(android.service.notification.Condition p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    public static android.service.notification.ZenPolicy readZenPolicyXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    public static void writeZenPolicyXml(android.service.notification.ZenPolicy p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    public static boolean isValidHour(int p0) { return false; }
    public static boolean isValidMinute(int p0) { return false; }
    public int describeContents() { return 0; }
    public android.service.notification.ZenModeConfig copy() { return null; }
    public android.service.notification.ZenPolicy toZenPolicy() { return null; }
    public android.app.NotificationManager.Policy toNotificationPolicy(android.service.notification.ZenPolicy p0) { return null; }
    public static int getZenPolicySenders(int p0) { return 0; }
    public android.app.NotificationManager.Policy toNotificationPolicy() { return null; }
    public static android.service.notification.ScheduleCalendar toScheduleCalendar(android.net.Uri p0) { return null; }
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
    public static android.service.notification.ZenModeConfig.ScheduleInfo tryParseScheduleConditionId(android.net.Uri p0) { return null; }
    public static android.content.ComponentName getScheduleConditionProvider() { return null; }
    public static android.net.Uri toEventConditionId(android.service.notification.ZenModeConfig.EventInfo p0) { return null; }
    public static boolean isValidEventConditionId(android.net.Uri p0) { return false; }
    public static android.service.notification.ZenModeConfig.EventInfo tryParseEventConditionId(android.net.Uri p0) { return null; }
    public static android.content.ComponentName getEventConditionProvider() { return null; }
    public static java.lang.String newRuleId() { return null; }
    public static java.lang.String getOwnerCaption(android.content.Context p0, java.lang.String p1) { return null; }
    public static java.lang.String getConditionSummary(android.content.Context p0, android.service.notification.ZenModeConfig p1, int p2, boolean p3) { return null; }
    public static boolean areAllPriorityOnlyRingerSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static boolean areAllZenBehaviorSoundsMuted(android.app.NotificationManager.Policy p0) { return false; }
    public static boolean isZenOverridingRinger(int p0, android.app.NotificationManager.Policy p1) { return false; }
    public static boolean areAllPriorityOnlyRingerSoundsMuted(android.service.notification.ZenModeConfig p0) { return false; }
    public static boolean areAllZenBehaviorSoundsMuted(android.service.notification.ZenModeConfig p0) { return false; }
    public static java.lang.String getDescription(android.content.Context p0, boolean p1, android.service.notification.ZenModeConfig p2, boolean p3) { return null; }

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

    public static class ScheduleInfo {
        public int[] days;
        public int startHour;
        public int startMinute;
        public int endHour;
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

    public static class ZenRule implements android.os.Parcelable {
        public boolean enabled;
        public boolean snoozing;
        public java.lang.String name;
        public int zenMode;
        public android.net.Uri conditionId;
        public android.service.notification.Condition condition;
        public android.content.ComponentName component;
        public android.content.ComponentName configurationActivity;
        public java.lang.String id;
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
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isAutomaticActive() { return false; }
        public java.lang.String getPkg() { return null; }
        public boolean isTrueOrUnknown() { return false; }
    }
}
