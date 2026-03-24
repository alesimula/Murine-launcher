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
        public static final java.lang.String FIELD_HAS_PRIORITY_CHANNELS = "hasPriorityChannels";
        public static final java.lang.String FIELD_ALLOW_PRIORITY_CHANNELS = "allowPriorityChannels";
        public ConfigDiff(android.service.notification.ZenModeConfig p0, android.service.notification.ZenModeConfig p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
        public android.service.notification.ZenModeDiff.RuleDiff getManualRuleDiff() { return null; }
        public android.util.ArrayMap<java.lang.String, android.service.notification.ZenModeDiff.RuleDiff> getAllAutomaticRuleDiffs() { return null; }
    }

    public static class DeviceEffectsDiff extends android.service.notification.ZenModeDiff.BaseDiff {
        public static final java.lang.String FIELD_GRAYSCALE = "mGrayscale";
        public static final java.lang.String FIELD_SUPPRESS_AMBIENT_DISPLAY = "mSuppressAmbientDisplay";
        public static final java.lang.String FIELD_DIM_WALLPAPER = "mDimWallpaper";
        public static final java.lang.String FIELD_NIGHT_MODE = "mNightMode";
        public static final java.lang.String FIELD_DISABLE_AUTO_BRIGHTNESS = "mDisableAutoBrightness";
        public static final java.lang.String FIELD_DISABLE_TAP_TO_WAKE = "mDisableTapToWake";
        public static final java.lang.String FIELD_DISABLE_TILT_TO_WAKE = "mDisableTiltToWake";
        public static final java.lang.String FIELD_DISABLE_TOUCH = "mDisableTouch";
        public static final java.lang.String FIELD_MINIMIZE_RADIO_USAGE = "mMinimizeRadioUsage";
        public static final java.lang.String FIELD_MAXIMIZE_DOZE = "mMaximizeDoze";
        public static final java.lang.String FIELD_NIGHT_LIGHT = "mNightLight";
        public static final java.lang.String FIELD_BRIGHTNESS_CAP = "mBrightnessCap";
        public static final java.lang.String FIELD_EXTRA_EFFECTS = "mExtraEffects";
        public DeviceEffectsDiff(android.service.notification.ZenDeviceEffects p0, android.service.notification.ZenDeviceEffects p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExistenceChange {
    }

    public static class FieldDiff<T extends java.lang.Object> {
        public FieldDiff(T p0, T p1) {}
        public FieldDiff(T p0, T p1, android.service.notification.ZenModeDiff.BaseDiff p2) {}
        public T from() { return null; }
        public T to() { return null; }
        public java.lang.String toString() { return null; }
        public boolean hasDiff() { return false; }
    }

    public static class PolicyDiff extends android.service.notification.ZenModeDiff.BaseDiff {
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_REMINDERS = "mPriorityCategories_Reminders";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_EVENTS = "mPriorityCategories_Events";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_MESSAGES = "mPriorityCategories_Messages";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_CALLS = "mPriorityCategories_Calls";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_REPEAT_CALLERS = "mPriorityCategories_RepeatCallers";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_ALARMS = "mPriorityCategories_Alarms";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_MEDIA = "mPriorityCategories_Media";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_SYSTEM = "mPriorityCategories_System";
        public static final java.lang.String FIELD_PRIORITY_CATEGORY_CONVERSATIONS = "mPriorityCategories_Conversations";
        public static final java.lang.String FIELD_VISUAL_EFFECT_FULL_SCREEN_INTENT = "mVisualEffects_FullScreenIntent";
        public static final java.lang.String FIELD_VISUAL_EFFECT_LIGHTS = "mVisualEffects_Lights";
        public static final java.lang.String FIELD_VISUAL_EFFECT_PEEK = "mVisualEffects_Peek";
        public static final java.lang.String FIELD_VISUAL_EFFECT_STATUS_BAR = "mVisualEffects_StatusBar";
        public static final java.lang.String FIELD_VISUAL_EFFECT_BADGE = "mVisualEffects_Badge";
        public static final java.lang.String FIELD_VISUAL_EFFECT_AMBIENT = "mVisualEffects_Ambient";
        public static final java.lang.String FIELD_VISUAL_EFFECT_NOTIFICATION_LIST = "mVisualEffects_NotificationList";
        public static final java.lang.String FIELD_PRIORITY_MESSAGES = "mPriorityMessages";
        public static final java.lang.String FIELD_PRIORITY_CALLS = "mPriorityCalls";
        public static final java.lang.String FIELD_CONVERSATION_SENDERS = "mConversationSenders";
        public static final java.lang.String FIELD_ALLOW_CHANNELS = "mAllowChannels";
        public PolicyDiff(android.service.notification.ZenPolicy p0, android.service.notification.ZenPolicy p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class RuleDiff extends android.service.notification.ZenModeDiff.BaseDiff {
        public static final java.lang.String FIELD_ENABLED = "enabled";
        public static final java.lang.String FIELD_CONDITION_OVERRIDE = "conditionOverride";
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
        public static final java.lang.String FIELD_PKG = "pkg";
        public static final java.lang.String FIELD_ALLOW_MANUAL = "allowManualInvocation";
        public static final java.lang.String FIELD_ICON_RES = "iconResName";
        public static final java.lang.String FIELD_TRIGGER_DESCRIPTION = "triggerDescription";
        public static final java.lang.String FIELD_TYPE = "type";
        public static final java.lang.String FIELD_LEGACY_SUPPRESSED_EFFECTS = "legacySuppressedEffects";
        android.service.notification.ZenModeDiff.FieldDiff<java.lang.Boolean> mActiveDiff;
        public RuleDiff(android.service.notification.ZenModeConfig.ZenRule p0, android.service.notification.ZenModeConfig.ZenRule p1) { super(null, null); }
        public boolean hasDiff() { return false; }
        public java.lang.String toString() { return null; }
        public boolean becameActive() { return false; }
        public boolean becameInactive() { return false; }
    }
}
