package android.service.notification;

public class ZenModeDiff {
    public static final int NONE = 0;
    public static final int ADDED = 1;
    public static final int REMOVED = 2;
    public ZenModeDiff() {}

    private static abstract class BaseDiff {
        public abstract boolean hasDiff();
        public abstract java.lang.String toString();
        BaseDiff(java.lang.Object p0, java.lang.Object p1) {}
        final void addField(java.lang.String p0, android.service.notification.ZenModeDiff.FieldDiff p1) {}
        public final boolean wasAdded() { return false; }
        public final boolean wasRemoved() { return false; }
        public final boolean hasExistenceChange() { return false; }
        public final boolean hasFieldDiffs() { return false; }
        public final android.service.notification.ZenModeDiff.FieldDiff getDiffForField(java.lang.String p0) { return null; }
        public final java.util.Set<java.lang.String> fieldNamesWithDiff() { return null; }
    }

    public static class ConfigDiff extends android.service.notification.ZenModeDiff.BaseDiff {
        public static final java.lang.String FIELD_USER = "user";
        public static final java.lang.String FIELD_ALLOW_ALARMS = "allowAlarms";
        public static final java.lang.String FIELD_ALLOW_MEDIA = "allowMedia";
        public static final java.lang.String FIELD_ALLOW_SYSTEM = "allowSystem";
        public static final java.lang.String FIELD_ALLOW_CALLS = "allowCalls";
        public static final java.lang.String FIELD_ALLOW_REMINDERS = "allowReminders";
        public static final java.lang.String FIELD_ALLOW_EVENTS = "allowEvents";
        public static final java.lang.String FIELD_ALLOW_REPEAT_CALLERS = "allowRepeatCallers";
        public static final java.lang.String FIELD_ALLOW_MESSAGES = "allowMessages";
        public static final java.lang.String FIELD_ALLOW_CONVERSATIONS = "allowConversations";
        public static final java.lang.String FIELD_ALLOW_CALLS_FROM = "allowCallsFrom";
        public static final java.lang.String FIELD_ALLOW_MESSAGES_FROM = "allowMessagesFrom";
        public static final java.lang.String FIELD_ALLOW_CONVERSATIONS_FROM = "allowConversationsFrom";
        public static final java.lang.String FIELD_SUPPRESSED_VISUAL_EFFECTS = "suppressedVisualEffects";
        public static final java.lang.String FIELD_ARE_CHANNELS_BYPASSING_DND = "areChannelsBypassingDnd";
        public static final java.lang.String FIELD_ALLOW_PRIORITY_CHANNELS = "allowPriorityChannels";
        public ConfigDiff(android.service.notification.ZenModeConfig p0, android.service.notification.ZenModeConfig p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
        public android.service.notification.ZenModeDiff.RuleDiff getManualRuleDiff() { return null; }
        public android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeDiff.RuleDiff> getAllAutomaticRuleDiffs() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExistenceChange {
    }

    public static class FieldDiff<T extends java.lang.Object> {
        public FieldDiff(T p0, T p1) {}
        public T from() { return null; }
        public T to() { return null; }
        public java.lang.String toString() { return null; }
        public boolean hasDiff() { return false; }
    }

    public static class RuleDiff extends android.service.notification.ZenModeDiff.BaseDiff {
        public static final java.lang.String FIELD_ENABLED = "enabled";
        public static final java.lang.String FIELD_SNOOZING = "snoozing";
        public static final java.lang.String FIELD_NAME = "name";
        public static final java.lang.String FIELD_ZEN_MODE = "zenMode";
        public static final java.lang.String FIELD_CONDITION_ID = "conditionId";
        public static final java.lang.String FIELD_CONDITION = "condition";
        public static final java.lang.String FIELD_COMPONENT = "component";
        public static final java.lang.String FIELD_CONFIGURATION_ACTIVITY = "configurationActivity";
        public static final java.lang.String FIELD_ID = "id";
        public static final java.lang.String FIELD_CREATION_TIME = "creationTime";
        public static final java.lang.String FIELD_ENABLER = "enabler";
        public static final java.lang.String FIELD_ZEN_POLICY = "zenPolicy";
        public static final java.lang.String FIELD_ZEN_DEVICE_EFFECTS = "zenDeviceEffects";
        public static final java.lang.String FIELD_MODIFIED = "modified";
        public static final java.lang.String FIELD_PKG = "pkg";
        public static final java.lang.String FIELD_ALLOW_MANUAL = "allowManualInvocation";
        public static final java.lang.String FIELD_ICON_RES = "iconResName";
        public static final java.lang.String FIELD_TRIGGER_DESCRIPTION = "triggerDescription";
        public static final java.lang.String FIELD_TYPE = "type";
        android.service.notification.ZenModeDiff.FieldDiff<java.lang.Boolean> mActiveDiff;
        public RuleDiff(android.service.notification.ZenModeConfig.ZenRule p0, android.service.notification.ZenModeConfig.ZenRule p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
        public boolean becameActive() { return false; }
        public boolean becameInactive() { return false; }
    }
}
